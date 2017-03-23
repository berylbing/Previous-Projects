package org.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.entity.Answers;
import org.entity.Pattern;
import org.entity.Questions;

public class MysqlConn {

	 private Connection con = null;
	    private boolean autoCommit = true;
	    public MysqlConn() {
	       
	    }

	    /**
	     * 获得数据库连接
	     */
	    public Connection getConnection(){
	         try {

	            String url = "jdbc:mysql://localhost:3306/sadb";
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
	    
	    
	    
	    
	    
	    public void save_answers(Answers e){
	    	Connection conn = null;
	    	Statement st = null;
			try {
				//获得链接
				conn = this.getConnection();
				//创建Statement对象
				String sql = "INSERT INTO answers(qid,aid,url,content,source,searchtime,weight,type)values('"+e.getQid()+"','"+e.getAid()+"','"+e.getUrl()+"','"+e.getContent()+"','"+e.getSource()+"','"+MyUtil.toString(e.getSearchtime())+"','"+e.getWeight()+"','"+e.getType()+"')";
				st = conn.createStatement();
				//执行sql
				st.execute(sql);
			} catch (Exception ee) {
//				System.err.println(ee.getMessage());
			}finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} 	
	    }
	    
	    public ArrayList<Answers> select_answersBytype(String qid,String type){
			ArrayList<Answers> al = new ArrayList<Answers>();
			Connection conn=null;
			Statement st=null;
			try {
				conn = this.getConnection();
				String sql = "select * from answers where qid = '"+qid+"' and type = '"+type +"';";
				//System.out.println(sql);
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				 while (rs.next()){
					 Answers qs = new Answers();
					 qs.setQid(rs.getString("qid"));
					 qs.setAid(rs.getString("aid"));
					 qs.setContent(rs.getString("content"));
					 qs.setOthers(rs.getString("others"));
					 qs.setSearchtime(rs.getTimestamp("searchtime"));
					 qs.setSource(rs.getString("source"));
					 qs.setType(rs.getString("type"));
					 qs.setUrl(rs.getString("url"));
					 qs.setWeight(rs.getDouble("weight"));
					 al.add(qs);
			      }
			} catch (Exception ee) {
			} finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return al;
		}
	    
	    public void save_questions(Questions e){
	    	Connection conn = null;
	    	Statement st = null;
			try {
				//获得链接
				conn = this.getConnection();
				//创建Statement对象
				String sql = "INSERT INTO questions(qid,keyword,attr1,attr2)values('"+e.getQid()+"','"+e.getKeyword()+"','"+e.getAttr1()+"','"+e.getAttr2()+"')";
				st = conn.createStatement();
				//执行sql
				st.execute(sql);
			} catch (Exception ee) {
//				System.err.println(ee.getMessage());
			}finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} 	
	    }
	    
	    public ArrayList<Questions> select_questionsBykeyword(String keyword){
			ArrayList<Questions> al = new ArrayList<Questions>();
			Connection conn=null;
			Statement st=null;
			try {
				conn = this.getConnection();
				String sql = "select * from questions where keyword = '"+keyword +"';";
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				 while (rs.next()){
					 Questions qs = new Questions();
					 qs.setQid(rs.getString("qid"));
					 qs.setKeyword(rs.getString("keyword"));
					 qs.setAttr1(rs.getString("attr1"));
					 qs.setAttr2(rs.getString("attr2"));
					 al.add(qs);
			      }
			} catch (Exception ee) {
			} finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return al;
		}
	    
	    public ArrayList<Pattern> select_patternBypriority(int priority){
			ArrayList<Pattern> al = new ArrayList<Pattern>();
			Connection conn=null;
			Statement st=null;
			try {
				conn = this.getConnection();
				String sql = "select * from pattern where priority = '"+priority +"';";
				//System.out.println(sql);
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				 while (rs.next()){
					 Pattern ps = new Pattern();
					 ps.setPid(rs.getInt("pid"));
					 //System.out.println(rs.getInt("pid"));
					 ps.setPosition(rs.getInt("position"));
					 ps.setKeyword(rs.getString("keyword"));
					 ps.setPriority(rs.getInt("priority"));
					 ps.setType(rs.getString("type"));
					 al.add(ps);
			      }
			} catch (Exception ee) {
			} finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return al;
		}
	    
	    public ArrayList<Pattern> select_pattern(){
			ArrayList<Pattern> al = new ArrayList<Pattern>();
			Connection conn=null;
			Statement st=null;
			try {
				conn = this.getConnection();
				String sql = "select * from pattern ";
				st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				 while (rs.next()){
					 Pattern ps = new Pattern();
					 ps.setPid(rs.getInt("pid"));
					 ps.setPosition(rs.getInt("position"));
					 ps.setKeyword(rs.getString("keyword"));
					 ps.setPriority(rs.getInt("priority"));
					 ps.setType(rs.getString("type"));
					 al.add(ps);
			      }
			} catch (Exception ee) {
			} finally{
				try {
					if(st!=null) st.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return al;
		}
	    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
