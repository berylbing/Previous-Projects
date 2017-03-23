package org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.algorithm.topicDetected.cluster.TfIdf;
import org.entity.bean.Posts;
import org.entity.bean.Postswords;
import org.entity.bean.Topics;
import org.entity.bean.Topicsposts;
import org.entity.bean.Words;
import org.entity.other.Tempclass;


/**
 * 定义连接及关闭数据库
 * @author yby
 * @date 2011-1-20 21:16:16
 * 添加完整注释于：2011-5-28 13:25:16
 */
public class MysqlTest {

	    private Connection con = null;
	    private boolean autoCommit = true;
	    public MysqlTest() {
	       
	    }

	    /**
	     * 获得数据库连接
	     */
	    public Connection getConnection(){
	         try {

	            String url = "jdbc:mysql://localhost:3306/test";
	            String usr = "root";
	            String pwd = "123";
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            con = DriverManager.getConnection(url, usr, pwd);
	            con.setAutoCommit(autoCommit);
	        } catch (SQLException ex) {
//	            Logger.getLogger(MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
//	            Logger.getLogger(MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
//	            Logger.getLogger(MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (ClassNotFoundException ex) {
//	            Logger.getLogger(MysqlConn.class.getName()).log(Level.SEVERE, null, ex);
	        }
	         return  con;
	    }
	    /**
	     *关闭数据库连接
	     */
	    public void close() {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            } finally {
	                con = null;
	            }
	        }
	    }
	   
	    public int count_topics(String starttime, String endtime){
			Connection conn = null;
	    	Statement st = null;
			int count=0;
			try {
				//获得链接
				 conn = this.getConnection();
				//创建Statement对象
				String sql = "select topicID,issuetime,count(topicID) as cnt from posts where issuetime >= '"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc;";
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				if(rs.last()){
					count = rs.getRow();
				}
			} catch (Exception ee) {
//				System.err.println(ee.getMessage());
			} 	
			finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 	
			}
			return count;
		}
	    public void TextRepresentation(String starttime,String endtime,int config_n){
	 	   MysqlConn cnn=new MysqlConn();
	 	   TfIdf tfidf=new TfIdf();
	 	  int topicnum=cnn.count_topics(Configer.starttime, Configer.endtime);//from posts
          System.out.println(topicnum);
	 	   /*select_wordsfeature(config_n)  在words表中，通过权重排序获得特征词 config为维数
	 	   String sql = "select * from words order by weight desc limit "+limit;*/
	 	   ArrayList<String> alwords=cnn.select_wordsfeature(config_n);
	 	  // System.out.println("TextRepresentation......alwords.size = "+alwords.size());

	       //出现该word的主题个数
	 	   for(String wid:alwords){
	 		   //countunit_topicsbywords  select pid, wid, issuetime,topicID,word,count(topicID) as cnt from postswords_temp where wid = '"+wid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc
	 		   ArrayList<Tempclass> tempal=cnn.countunit_topicsbywords(wid, starttime, endtime);//获取word在一段时间范围内，单篇文档中出现次数，用于计算词在该文档的权重
	 		 //  System.out.println("TextRepresentation......tempal.size = "+tempal.size());
	            int tfm=tempal.get(0).getMaxcount();//该word在单个主题出现的最大频数
//	            int topicnum=cnn.count_topics(Configer.starttime, Configer.endtime);//from posts
//	            System.out.println(topicnum);
	            int dft=tempal.size();//出现该word的主题个数
	            for(Tempclass temp:tempal){
	         	   int tfj=temp.getCount();
	         	   ArrayList<Postswords> pwal=cnn.select_findbyWidandTopicid(wid, temp.getTopicId());//通过wid和topicid查找相应的postswords
	         	   char p='c';
	         	   for(Postswords pws: pwal){
	         		   if(pws.getPosition().equals("title")){
	         			   p='t';
	         			   break;
	         		   }
	         	   }
	 				System.out.println("tfj, tfm, p, 1, topicnum, dft"+tfj+"..."+tfm+"..."+ p+"...1..."+ topicnum+"..."+ dft);
	 				double weight=tfidf.tfidf(tfj, tfm, p, 1, topicnum, dft);//更新postswords_temp表的weight值，通过wid和tid确定要更新的postswords表项
	 				// update_postswordsbyWidandTid(String wid,String topicId,double weight)
	 				// update postswords_temp set weight='"+weight+"' where wid= '"+wid+"' and topicID = '"+topicId+"'
	 			//	cnn.update_postswordsbyWidandTid(wid, temp.getTopicId(), weight);//更新postswords_temp表的weight值
	            }
	 	   }
	 	   
	    }
	    public int find_N(double weight){
	 	   int n=0;
	 	   MysqlConn conn=new MysqlConn();
	 	   n=conn.select_findbyweight(weight).size();//从words表中查找
	 	   if(n>20000)
	 		   n=20000;
	 	   return n;
	    }
	    public static void main(String[] args) {
			MysqlTest test=new MysqlTest();
			int n=test.find_N(3.0);
			int m=test.count_topics(Configer.starttime, Configer.endtime);
			System.out.println(m);
			//	test.TextRepresentation(Configer.starttime, Configer.endtime, n);
		}
	    }
