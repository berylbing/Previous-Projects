package org.algorithm.topicDetected.cluster;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.entity.bean.Topics;
import org.entity.bean.Topicsweibos;
import org.entity.bean.Weiboswords;
import org.entity.bean.Words;
import org.entity.other.Tempclass;
import org.util.Configer;
import org.util.MyUtil;
import org.util.MysqlConn;
import org.util.UUIDKey;

public class Test {


	
	/**
	 * 聚类开始前准备工作，添加临时表，为临时表添加索引
	 * 1.特征提取
	 * 2.文本表示
	 * 3.相似度计算
	 * 4.聚类
	 * @param args
	 */
	
	public void prepareCluster(){
		MysqlConn conn = new MysqlConn();
		conn.addTempTable_weibo(Configer.starttime, Configer.endtime);
		conn.init_wordsweight();
	}
	
	/**
	 * 特征提取
	 */
	
	
	public void FeatureExtraction(){
		//计算
		MysqlConn conn = new MysqlConn();
		int startrow = 1;
		int topicnum = conn.count_topics_weibo(Configer.starttime, Configer.endtime);
		while(true){
			ArrayList<Tempclass> alw = conn.selectpw_wordcounts_weibo(startrow,Configer.starttime, Configer.endtime);;
			if(alw.size()==0) break;
			startrow = startrow + 2002;
			for(Tempclass e : alw){
//				System.out.println(alw.indexOf(e));
				int tf = e.getCount();
				int topicwordnum = conn.count_topicsbywords_weibo(e.getWid(), Configer.starttime, Configer.endtime);
				if(topicwordnum==0){
					for(int ii=0;ii<100;ii++){}
					topicwordnum = conn.count_topicsbywords_weibo(e.getWid(), Configer.starttime, Configer.endtime);
				}
				if(topicwordnum==0)continue;
//				System.out.println("tf="+tf+"...topicwordnum="+topicwordnum+"...topicnum="+topicnum);
				double log = Math.log10(topicnum/topicwordnum); 
//				System.out.println("log=="+log);
				double weight = tf*log;

				conn.update_wordsweight(e.getWid(), weight);
			}
		}
		//标记向量位置feature， 按照权重排序
//		 ArrayList<String> widlist = conn.select_wordsfeature(Configer.N);
		ArrayList<Words> wordlist = conn.select_findbyweight(0);
		int ii=1;
		for(Words ww : wordlist){
			conn.update_wordsfeature(ww.getWid(), ii);
			ii++;
		}
	}
	
	/**
	 * 文本表示,权重计算（输入时间为：时间片）
	 * @param args
	 */
	public void TextRepresentation(String starttime, String endtime, int config_n){
//		double tfj = 0;
		MysqlConn cnn = new MysqlConn();
		TfIdf tf = new TfIdf();
		ArrayList<String> alwords = cnn.select_wordsfeature(config_n);
		System.out.println("TextRepresentation......alwords.size = "+alwords.size());
		for(String wid : alwords){
//			System.out.println("TextRepresentation......word = "+word.getWord());
			ArrayList<Tempclass> tempal =  cnn.countunit_topicsbywords_weibo(wid, starttime, endtime);
			System.out.println("TextRepresentation......tempal.size = "+tempal.size());
//			int tfj = tempal.size();
			int tfm = tempal.get(0).getMaxcount();
			int topicnum = cnn.count_topics_weibo(Configer.starttime, Configer.endtime);
//			int dft = cnn.count_topicsbywords(wid, Configer.starttime, Configer.endtime);
			int dft = tempal.size();
			for(Tempclass temp : tempal){
//				
				double weight = tf.tfidf(2, tfm, 't', 1, topicnum, dft);
				//赋值更新postswords中的权重
//				System.out.println("update_postswordsbyWidandTid......word = "+weight);
				cnn.update_weiboswordsbyWidandTid(wid, temp.getTopicId(), weight);
			}
		}
		
	}
//	
	/**
	 * 找与topicid相似度最大的话题starttime是上一个时间片的开始时间，endtime是本时间片的结束时间，一共包括2个时间片
	 * 
	 * @param topicId
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	public Topics findMaxSim(double []darr, String starttime, String endtime, int config_n){
		Topics topic = new Topics();
		MysqlConn conn = new MysqlConn();
		TextSimilarity testsim = new TextSimilarity();
		//找到符合条件的话题，如果没有符合条件的话题，返回-1
		//select * from topics where updatetime >= '"+starttime+"' and updatetime <= '"+endtime+"' and energy>=0
		ArrayList<Topics> tal = conn.select_topicsBytimelimit(starttime, endtime);
		//System.out.println("tal.size(): "+tal.size());
		if(tal.isEmpty()||tal.size()==0){
			topic.setTid("-1");
			topic.setEnergy(0.0);
			return topic;
		}
		//计算相似度，找最大的
		double max_sim = 0;
		for(Topics tt : tal){
			//话题的
			double topicsarr[] = MyUtil.stringTodoublearr(tt.getVector(),config_n);
			double sim = testsim.sim(topicsarr, darr, config_n);
//			System.out.println("sim ==:"+sim);
			if(max_sim < sim) {
				max_sim = sim;	
				topic.setTid(tt.getTid());
				topic.setVector(tt.getVector());
			}
		}
		topic.setEnergy(max_sim);
		
		return topic;
	}
	
	/**
	 * 一个时间片内，候选话题发现
	 * @param args
	 */
	public void topicDetected(String startslot, String endslot, int config_n,double threshold){
		MysqlConn conn = new MysqlConn();
		String start = MyUtil.minusIntervalDays(startslot, 1); // 计算上一个时间片的起始时间
		ArrayList<Tempclass> al = conn.select_weibotopics(startslot, endslot);
		ArrayList<Words> wordslist = conn.select_weibofindbyfeature(config_n);
		for (Tempclass tempt : al) {
			System.out.println("topicDetected....subject: "+tempt.getParentid());
			// 文档d的vector: darr
			double darr[] = new double[config_n];
			double sumdarr = 0;//如果sumdarr==0 此主题不参与聚类 
			for (Words word : wordslist) {
				//select * from postswords_temp where wid='"+wid+"' and topicID = '"+topicId+"'
				ArrayList<Weiboswords> pwslist = conn.select_findbyWidandTopicid_weibo(word.getWid(), tempt.getParentid());
//				System.out.println("topicDetected....pwslist size: "+pwslist.size());
				if (pwslist.isEmpty() || pwslist.size() == 0) {
					darr[word.getFeature() - 1] = 0;
//					System.out.println(darr[word.getFeature() - 1]);
				} else {
					darr[word.getFeature() - 1] = pwslist.get(0).getWeight();
					sumdarr = sumdarr + darr[word.getFeature() - 1];
//					System.out.println(darr[word.getFeature() - 1]);
				}
			}

			if(sumdarr == 0) {
				System.out.println("delete darr "+tempt.getTopicId());
				continue;
			}
			
			// 函数findMaxSim找在上一个时间片更新的，与主题tempt相似度最高的话题，找到返回话题id和相似度，没有话题返回-1,0
			Topics topic_sim = findMaxSim(darr, start, endslot, config_n);
			System.out.println("topic_sim...="+topic_sim.getEnergy());
			if (topic_sim.getEnergy() > threshold) {
				// 函数addDtoTopic
				// 将tempt加到得到的topic中（保存到topicsposts表中），updateTopicVector，改变话题的表示（修改表topics）
				//System.out.println(MyUtil.doublearrToVector(darr, config_n));
				Topicsweibos tps = new Topicsweibos();
				tps.setNutrition(0.0);
				tps.setSimilarity(topic_sim.getEnergy());
				tps.setTid(topic_sim.getTid());
				tps.setTopicId(tempt.getTopicId());
				tps.setClustertime(Timestamp.valueOf(endslot));
				tps.setClusterperiod(Configer.starttime+" to "+Configer.endtime);
				conn.save_topicsweibos(tps);

				double topicarr[] = MyUtil.stringTodoublearr(topic_sim.getVector(), config_n);
				for (int nn = 0; nn < config_n; nn++) {
					topicarr[nn] = (1 - Configer.gamma) * topicarr[nn] + Configer.gamma * darr[nn];
				}
				conn.update_vectorInTopics(topic_sim.getTid(), MyUtil.doublearrToVector(topicarr, config_n));

			} else {
				// 用本主题tempt创建一个新的topic，保存到数据库表topic中，并且更新topicsposts表中
				Topics te = new Topics();
				UUIDKey uuid = UUIDKey.getInstance();
				String tid = uuid.getNewUUID();
				te.setTid(tid);
				te.setEnergy(0.0);
				String vector = MyUtil.doublearrToVector(darr, config_n);
				System.out.println("............"+vector);
				te.setVector(vector);
				te.setUpdatetime(Timestamp.valueOf(endslot));
				te.setClusterperiod(Configer.starttime+" to "+Configer.endtime);
				te.setSlot(0);
				conn.save_topics(te);

				Topicsweibos tps = new Topicsweibos();
				tps.setNutrition(0.0);
				tps.setSimilarity(0.0);
				tps.setTid(tid);
				tps.setTopicId(tempt.getTopicId());
				tps.setClustertime(Timestamp.valueOf(endslot));
				tps.setClusterperiod(Configer.starttime+" to "+Configer.endtime);
				conn.save_topicsweibos(tps);
			}
		}

	}
	
	
	/**
	 * 话题的能量更新
	 * @param startslot
	 * @param endslot
	 */
	static double nutrition=0; 
	static double et=0;
	public static void energyCalculate(String startslot, String endslot){
		MysqlConn conn = new MysqlConn();
		Energy eg = new Energy();
		int countreplay=0;
		int countcomment=0;
//		System.out.println("hhhhhhhhhh");
		//select * from topics where updatetime >= '"+starttime+"' and updatetime <= '"+endtime+"' and energy>=0
		//
//		ArrayList<Topics> al = conn.select_topicsBytimelimit(startslot,endslot);
//		ArrayList<Topicsposts> tpsal=conn.select_topicspostsBytimelimit(startslot,endslot);
		// "select * from topicsposts where clustertime >= '"+starttime+"' and clustertime <= '"+endtime+"' and nutrition>=0";
		ArrayList<Topics> al = conn.select_topicsBytimelimit(Configer.starttime,Configer.endtime);
		for(Topics topic : al){
			String tid=topic.getTid();
			nutrition=eg.nutritionFunction(topic.getEnergy());
			//System.out.println(tid);
			ArrayList<Topicsweibos> tpsal=conn.select_topicsweibosBytimelimit(Configer.starttime,Configer.endtime,tid);
		//	ArrayList<Topicsposts> tpsal=conn.select_topicspostsBytimelimit(startslot,endslot);   
			//select * from topicsposts where clustertime >= '"+starttime+"' and clustertime <= '"+endtime+"' and nutrition>=0
			for(Topicsweibos tps :tpsal){	
//				System.out.println("jhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
				//select count(*)num from posts where topicID = '"+topicid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"'
			   // count = conn.count_postsByTopicid(tps.getTopicId(), startslot, endslot);
				//System.out.println("TopicId......"+tps.getTopicId());
				countcomment = conn.count_commentsBymid(tps.getTopicId(),startslot, endslot);
				countreplay=conn.count_replayByParentid(tps.getTopicId(), startslot, endslot);
				double topicNur = eg.gtNutrition(tps.getSimilarity(), countreplay,countcomment);
				double postNur = eg.gtNutrition(tps.getSimilarity(), 0,0);
				double nd = topicNur + ( 0.6*countreplay+0.4*countcomment-1)*postNur;
				  nutrition =nutrition+Configer.arfa * nd;
			}
				System.out.println("nutrition=....."+nutrition);
			et = eg.energyFunction(nutrition);		
			//System.out.println("et=....."+et);
			//话题能量衰减过程
			if(et>Configer.beta){
				et = et - Configer.beta;
			}else{
				conn.update_energyInTopics(topic.getTid(),et);
			}
			System.out.println("endslot........."+endslot);
			System.out.println("energy......"+et);
			conn.update_energyInTopics(topic.getTid(),et);            
		}
	}
	
	/**
	 * 在一个时间片中执行的 候选话题发现和能量计算操作
	 */
	public void aTimeSlot(int config_n, double threshold){
		int slot = 1;	//时间片，以天为单位
		//一个时间片内所有主题d的文本表示；前一个时间片生存下来的话题T的文本表示
		String startslot = Configer.starttime;
		String endslot ="";
		while(true){
			endslot = MyUtil.addIntervalDays(startslot, slot);
		//	topicDetected(startslot, endslot,config_n,threshold);	//候选话题发现
		//	System.gc();
			energyCalculate(startslot, endslot);//更新话题能量值
			startslot = endslot;
			if(startslot.equals(Configer.endtime))break;
		}
	}
	
	public void aTimeSlot_testTh(int config_n, double threshold){
		int slot = 1;	//时间片，以天为单位
		//一个时间片内所有主题d的文本表示；前一个时间片生存下来的话题T的文本表示
		String startslot = Configer.starttime;
		String endslot ="";
		while(true){
			endslot = MyUtil.addIntervalDays(startslot, slot);
			topicDetected(startslot, endslot,config_n,threshold);	//候选话题发现
			startslot = endslot;
			if(startslot.equals(Configer.endtime))break;
		}
	}
	
	public int find_N(double weight){
		int n =0;
		MysqlConn conn = new MysqlConn();
		n = conn.select_findbyweight(weight).size();  //权重大于4的所有词的个数
		if(n>20000)
			n=20000;
		return n;
	}
	
	public void testN(){
		MysqlConn conn = new MysqlConn();
		int N = this.find_N(40);
		ArrayList<Words> wordslist = conn.select_findbyfeature(N);
		 	//                  保证每个主题中至少有1个词有权重
		int slot = 1;	//时间片，以天为单位
		String startslot = Configer.starttime;
		String endslot ="";
		int numm = 0;
		while(true){
				endslot = MyUtil.addIntervalDays(startslot, slot);
				ArrayList<Tempclass> al = conn.select_topics(startslot, endslot);
				int flagtopic = 1;
				for (Tempclass tempt : al) {
					int wordweight3flag = 0;
					System.out.println("topicDetected....wordslist size: "+wordslist.size());
					for (Words word : wordslist) {
						ArrayList<Weiboswords> pwslist = conn.select_findbyWidandTopicid_weibo(word.getWid(), tempt.getTopicId());
//						System.out.println(pwslist.size());
						if(pwslist.size()>0){
							wordweight3flag=1;
							break;
						}
					}
					if(wordweight3flag==0) {
						flagtopic = 0;
						break;
					}
				}
				if(flagtopic==0){
					System.out.println("failed!!!!!!1");
					numm++;
//					break;
				}
				startslot = endslot;
				if(startslot.equals(Configer.endtime)){
					System.out.println("sucess!!!!!!!"+numm);
					break;
				}
			}
//		}
//		return N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test tt=new Test();
		//tt.prepareCluster();
//		tt.FeatureExtraction();
		//tt.prepareCluster();
//		clm.testN();
//		System.out.println(clm.testN());
		int config_n=tt.find_N(1.59);
		//tt.TextRepresentation(Configer.starttime, Configer.endtime, config_n);
		tt.topicDetected(Configer.starttime, Configer.endtime, config_n, Configer.threshold);
//		tt.aTimeSlot_testTh(config_n, Configer.threshold);
		tt.aTimeSlot(config_n, Configer.threshold);
	}

}
