package org.algorithm.dataPretreatment.crawler;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.entity.bean.Replys;
import org.entity.bean.Weibos;
import org.util.Configer;
import org.util.MysqlConn;

import weibo4j.Comments;
import weibo4j.Timeline;
import weibo4j.Weibo;
import weibo4j.model.Comment;
import weibo4j.model.CommentWapper;
import weibo4j.model.Paging;
import weibo4j.model.Status;
import weibo4j.model.StatusWapper;
import weibo4j.model.WeiboException;



public class Crawler_weibo {
	
	public void huoquweibo(){
		Weibo weibo = new Weibo();
		MysqlConn mycon=new MysqlConn();
		weibo.setToken(Configer.access_token);
		Timeline tm = new Timeline();
		try {
			Paging page = new Paging();
			page.setCount(50);
			for(int i = 6; i<21; i++){
				page.setPage(i+1);
				StatusWapper status = tm.getFriendsTimeline(0,0,page);
				for(Status s : status.getStatuses()){
//					System.out.println(s.toString());
					int flag = 0;
					while(true){
					Weibos weibos = new Weibos();
					if(s.getUser()==null) break; //原微博被删除
					weibos.setAuthor(s.getUser().getScreenName());
					weibos.setCommentscount(s.getCommentsCount());
					String createat =  s.getCreatedAt().toString();
					Timestamp time = toTimestamp(createat);
					weibos.setCreateddate(time);
					weibos.setMid(s.getMid());
					weibos.setStatusid(s.getId());
					weibos.setRepostscount(s.getRepostsCount());
					weibos.setSource(s.getSource().toString());
					weibos.setText(s.getText());
					weibos.setParentid(s.getMid());
					
					if(flag == 0){weibos.setInreplytostatusid("true"); flag ++;}
					
					mycon.save_weibo(weibos);
					
					if(s.getRetweetedStatus()== null)break;
					mycon.update_weibos(s.getMid(), s.getRetweetedStatus().getMid());
					s = s.getRetweetedStatus();
					}
				}
			}
			
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
	


	public void huoqucomments(String mid){
		int recount = 0;
		MysqlConn mycon=new MysqlConn();
		recount = mycon.select_commentscountbymid(mid);
		if(recount == 0) return;
		Weibo weibo = new Weibo();
		weibo.setToken(Configer.access_token);
		Comments cm =new Comments();
		try {
			Paging page = new Paging();
			int xx = 1;
			int flag = 1;
			while(true){
				if(recount > 200){
					recount = recount - 200;
					page.setCount(200);
				}else{
					page.setCount(recount);	
					flag = 0;
				}
				page.setPage(xx);
				xx++;
				CommentWapper comment = cm.getCommentById(mid, page, 0);
				for(Comment c : comment.getComments()){
					Replys replys = new Replys();
					if(c.getUser()==null) break; //原微博被删除
					replys.setAuthor(c.getUser().getScreenName());
					replys.setId(mid);
					replys.setMid(c.getMid());
					replys.setSource(c.getSource());
					replys.setTexts(c.getText());
					String createat =  c.getCreatedAt().toString();
					Timestamp time = toTimestamp(createat);
					replys.setCreateddate(time);
					mycon.save_comments(replys);
				}
				if(flag == 0)break;
			}
			mycon.update_posts_weibo(mid, "200");
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
	
	public void huoquzhuanfa(String id){
		int recount = 0;
		MysqlConn mycon=new MysqlConn();
		recount = mycon.select_repostscountbymid(id);
		if(recount == 0) return;
		Weibo weibo = new Weibo();
		weibo.setToken(Configer.access_token);
		Timeline tm = new Timeline();
		try {
			Paging page = new Paging();
			int xx = 1;
			int flag = 1;
			while(true){
				if(recount > 200){
					recount = recount - 200;
					page.setCount(200);
				}else{
					page.setCount(recount);	
					flag = 0;
				}
				page.setPage(xx);
				xx++;
				StatusWapper status = tm.getRepostTimeline(id, page);
				for(Status s : status.getStatuses()){
					Weibos weibos = new Weibos();
					if(s.getUser()==null) break; //原微博被删除
					weibos.setAuthor(s.getUser().getScreenName());
					weibos.setCommentscount(s.getCommentsCount());
					String createat =  s.getCreatedAt().toString();
					Timestamp time = toTimestamp(createat);
					weibos.setCreateddate(time);
					weibos.setMid(s.getMid());
					weibos.setStatusid(s.getId());
					weibos.setRepostscount(s.getRepostsCount());
					weibos.setSource(s.getSource().toString());
					weibos.setText(s.getText());
					weibos.setParentid(id);
					mycon.save_weibo(weibos);
				}
				if(flag == 0)break;
			}
			mycon.update_posts_weibo(id, "100");
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
	
//	public void chachong(){
//		MysqlConn mycon=new MysqlConn();
//		ArrayList<String> midlist = mycon.select_weibo();
//		for(String mid : midlist){
//			
//		}
//	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		MysqlConn mycon=new MysqlConn();
//		Crawler_weibo a = new Crawler_weibo();
//		ArrayList<String> midlist = mycon.select_weibo("100");
//		int i = 0;
//		for(String mid : midlist){
//			i++;
//			System.out.println("###############################################"+i);
//			a.huoquzhuanfa(mid);
//		}
//		
		/////////////////////////////////////////////////////////////////////////////
		MysqlConn mycon=new MysqlConn();
		Crawler_weibo a = new Crawler_weibo();
		ArrayList<String> midlist = mycon.select_weibo("200");
		int i = 0;
		for(String mid : midlist){
			i++;
			System.out.println("###############################################"+i);
			a.huoqucomments(mid);
		}
		
	}
	
	 static class Task extends TimerTask {
		  public void run() {
		   System.out.println("000000");
		  }
		 }
	static //Mon May 07 18:27:09 CST 2012  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(datenow)
	Timestamp toTimestamp(String str){
		Timestamp time = null;
		String mm = str.split(" ")[1];
		if(mm.equals("Jan")) mm="01";
		if(mm.equals("Feb")) mm="02";
		if(mm.equals("Mar")) mm="03";
		if(mm.equals("Apr")) mm="04";
		if(mm.equals("May")) mm="05";
		if(mm.equals("Jun")) mm="06";
		if(mm.equals("Jul")) mm="07";
		if(mm.equals("Aug")) mm="08";
		if(mm.equals("Sep")) mm="09";
		if(mm.equals("Oct")) mm="10";
		if(mm.equals("Nov")) mm="11";
		if(mm.equals("Dec")) mm="12";
		String dd = str.split(" ")[2];
		
		String str0 = str.split(" ")[3];//HH:mm:ss
		String str1 = str.split(" ")[5]+"-"+mm+"-";
		str = str1 +dd+" "+str0;
//		System.out.println(str);
		time = Timestamp.valueOf(str);
//			date = (Timestamp) sdf.parse(str);
		return time;
	}

}
