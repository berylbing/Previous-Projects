package org.algorithm.topicEnergy;

import java.util.ArrayList;

import org.algorithm.topicDetected.cluster.Test;
import org.entity.bean.Postswords;
import org.entity.bean.Vector;
import org.entity.bean.Words;
import org.entity.other.Tempclass;
import org.util.Configer;
import org.util.MyUtil;
import org.util.MysqlConn;
public class ThresholdTest {
	
	public int find_N(double weight){
		int n =0;
		MysqlConn conn = new MysqlConn();
		n = conn.select_findbyweight(weight).size();  //权重大于4的所有词的个数 from words
		if(n>20000)
			n=20000;
		return n;
	}
	
	public Vector textpre(){
		MysqlConn conn = new MysqlConn();
		Vector vt=new Vector();
		String vector=null;
		String topicID=null;
		int config_n=find_N(4.46);
		System.out.println(config_n);
		//ArrayList<Tempclass> al = conn.select_topics(Configer.starttime,Configer.endtime);
		ArrayList<Tempclass> al = conn.count_postswords_temp(Configer.starttime,Configer.endtime);
		ArrayList<Words> wordslist = conn.select_findbyfeature(config_n);
		for (Tempclass tempt : al) {
			System.out.println("topicDetected....subject: "+tempt.getTopicId());
			// 文档d的vector: darr
			double darr[] = new double[config_n];
			for (Words word : wordslist) {
				ArrayList<Postswords> pwslist = conn.select_findbyWidandTopicid(word.getWid(), tempt.getTopicId());
			//	System.out.println(word.getWid());
				if (pwslist.isEmpty() || pwslist.size() == 0) {
					darr[word.getFeature() - 1] = 0;
				} else {
					darr[word.getFeature() - 1] = pwslist.get(0).getWeight();
				}
				//	System.out.println(darr[word.getFeature() - 1]);
			}
			topicID=tempt.getTopicId();
			vector=MyUtil.doublearrToVector(darr, config_n);
			vt.setTopicID(topicID);
			vt.setVector(vector);
	//	    conn.textpresentation(vt.getTopicID(),vt.getVector());
		
		}
	    return vt;
	}
	

	public void testThreshold(){
		double th = 0.100;
		MysqlConn conn = new MysqlConn();
		double[] ff = new double[500];
		int k = 0;
		double precision=0;
		double recall=0;
		for(;th<0.5;){
			System.out.println("************************");
			ThresholdTest test = new ThresholdTest();
			Test testl=new Test();
			int config_n = test.find_N(0.16);
			testl.aTimeSlot_testTh(config_n, th);
			//计算查全率和查准率
			int i = 0; //标定的话题有10个与flag对应
			//select count(flag)as cnt from posts_test where flag>1000 group by flag order by flag
			int[] ni = conn.select_count_ni();
			double[] fi = new double[10];
			double ff1 = 0;
			double ff2 = 0;
			for(;i<9;i++){
				// "select tid,count(tid) as cnt from (select  topicsposts.tid  from posts_test,topicsposts where posts_test.flag = '"+flag+"' and posts_test.topicID = topicsposts.topicID )as aa group by tid order by cnt limit 1;";
				Tempclass temp = conn.select_count_nij(i+1000);
				if(temp.getCount()==null)continue;
				int nij = temp.getCount();
				System.out.println("nij==="+nij);
				System.out.println("ni[i]===="+ni[i]);
				int nj = conn.select_count_nj(temp.getWid());
				if(ni[i]==0||nj==0||nij==0)continue;	
				else{
			    precision =(double)nij/ni[i];
			    System.out.println("precision="+precision);
			//	select count(topicID) as cnt from (select  posts.topicID  from posts,topicsposts where topicsposts.tid = '"+tid+"' and posts.topicID = topicsposts.topicID )as aa 				
			    recall = (double)nij/nj;
				System.out.println("recall="+recall);
				if(precision==0&&recall==0)continue;
				else{
				fi[i] =(double)2*precision*recall/(precision+recall);
				ff1 = ff1 + ni[i]*fi[i];
				ff2 = ff2 + ni[i];
				System.out.println("ff1="+ff1+","+"ff2="+ff2);
				}
				}
			}
			ff[k]=(double)ff1/ff2;
			System.out.println("th="+th+"..............ff[k]="+ff[k]);
			th = th+0.001;
			k++;
			conn.Droptopics();
		}
	}

	public static void main(String[] args) {
		ThresholdTest threshold=new ThresholdTest();
	    threshold.testThreshold();
	}
}
