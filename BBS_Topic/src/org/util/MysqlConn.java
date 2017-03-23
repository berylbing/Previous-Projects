	package org.util;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	
	
	import org.entity.bean.Posts;
	import org.entity.bean.Postswords;
	import org.entity.bean.Postswords_seg;
import org.entity.bean.Replys;
import org.entity.bean.Topicsweibos;
	import org.entity.bean.Vector;
import org.entity.bean.Weibos;
import org.entity.bean.Weiboswords;

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
	
		            String url = "jdbc:mysql://localhost:3306/test2";
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
		    
		    /******************************************对posts的操作*****************************************************************************************
		     * 包括的操作有：
		     * 1.void save_posts(Posts e) 添加posts记录
		     * 2.void update_posts(int pid,String flag)
		     * 3.int count_posts()
		     * 4.int find_posts_start()
		     * 5.int find_posts_last()
		     * 6.ArrayList<Posts> select_postsbyID(int startid,int endid)
		     * 7.int count_topics(String starttime, String endtime)
		     * 8.ArrayList<Tempclass> select_topics(String starttime, String endtime)
		     * 9.int count_postsByTopicid(String topicid, String starttime, String endtime)
		     */
		    
		    
		    /**
		     * 数据获取后添加posts对象,添加一条记录
		     * @param e   post对象subID,topicID,url,board,title,authorid,authrname,content,issuetime,querytime,IP,flag
		     */
		    public void save_posts(Posts e){
		    	Connection conn = null;
		    	Statement st = null;
				try {
					//获得链接
					conn = this.getConnection();
					//创建Statement对象
					String sql = "INSERT INTO posts(subID,topicID,url,board,title,authorId,authorname,content,issuetime,querytime,flag)values('"+e.getSubId()+"','"+e.getTopicId()+"','"+e.getUrl()+"','"+e.getBoard()+"','"+e.getTitle()+"','"+e.getAuthorId()+"','"+e.getAuthorname()+"','"+e.getContent()+"','"+MyUtil.toString(e.getIssuetime())+"','"+MyUtil.toString(e.getQuerytime())+"','"+e.getFlag()+"')";
					st = conn.createStatement();
					System.out.println(sql);
					//执行sql
					st.execute(sql);
				} catch (Exception ee) {
	//				System.err.println(ee.getMessage());
				}finally{
					try {
						if(st!=null) st.close();
					 //   if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				} 	
		    }
		    
		    /**
			 * posts表中的flag=0帖子总数
			 * @return 返回没有被分词的帖子数
			 */
			public int count_posts(){
				Connection conn = null;
		    	Statement st = null;
				int count=0;
				try {
					//获得链接
					 conn = this.getConnection();
					//创建Statement对象
					String sql = "select count(*)num from posts where flag=1";
					System.out.println(sql);
					 st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					if(rs.next()){
						count = rs.getInt("num");
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
		   
		 
		    /**
		     * 更新帖子处理状态0：未分词
		     * 1.分词结束
		     * 2.聚类结束
		     * 3.排序完成
		     * @param pid 需要更新的帖子id
		     * @param flag 需要将状态更新为flag
		     */
		    public void update_posts(int pid,String flag) {
				// TODO Auto-generated method stub
	            Connection conn=null;
	            Statement st=null;
	            try{
	            	conn= this.getConnection();
	            	String sql="update posts set flag='"+flag+"' where pid='"+pid+"'";
	            	System.out.println(sql);
	            	st=conn.createStatement();
	            	st.execute(sql);
	            }catch(Exception ee){
	            	
	            }finally{
	            	try{
	            		if(st!=null)st.close();
	            	//	if(conn!=null)conn.close();
	            	}catch(SQLException e1){
	            		e1.printStackTrace();
	            	}
	            	
	            }
			}
		    
		    /**
			 * 查找posts表中，pid值最小的帖子的pid
			 * @return 返回第一个帖子的pid
			 */
		    public int find_posts_start(){
		    	int start=0;
		    	Connection conn=null;
		    	Statement st=null;
		    	try {
					//获得链接
					conn = this.getConnection();
					//创建Statement对象
					String sql = "SELECT min(pid) FROM `posts` where flag=0;";
				    st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					if(rs.next()){
						start = rs.getInt("min(pid)");
					}
				} catch (Exception ee) {
	//				System.err.println(ee.getMessage());
				} 
				finally{
					try {
						if(st!=null) st.close();
					//	if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 	
				}
				return start;
		    }
		    
		    public int find_posts_last(){
				int last=0;
				Connection conn = null;
		    	Statement st = null;
				try {
					//获得链接
					conn = this.getConnection();
					//创建Statement对象
					String sql = "SELECT max(pid) FROM `posts` where flag=0;";
					st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					if(rs.next()){
						last = rs.getInt("max(pid)");
					}
				} catch (Exception ee) {
	//				System.err.println(ee.getMessage());
				} 	
				finally{
					try {
						if(st!=null) st.close();
					//	if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 	
				}
				return last;
			}
		    
		    public ArrayList<Posts> select_postsbyID(int startid,int endid){
				ArrayList<Posts> al = new ArrayList<Posts>();
				Connection conn=null;
				Statement st=null;
				try {
					conn = this.getConnection();
					String sql = "select * from posts where flag=0 and pid>="+startid+" and pid<="+endid;
					st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					 while (rs.next()){
						 Posts ps = new Posts();
						 ps.setAuthorId(rs.getString("authorId"));
						 ps.setAuthorname(rs.getString("authorname"));
						 ps.setBoard(rs.getString("board"));
						 ps.setContent(rs.getString("content"));
						 ps.setFlag(rs.getInt("flag"));
						 ps.setIssuetime(rs.getTimestamp("issuetime"));
						 ps.setPid(rs.getInt("pid"));
						 ps.setQuerytime(rs.getTimestamp("querytime"));
						 ps.setSubId(rs.getString("subID"));
						 ps.setTitle(rs.getString("title"));
						 ps.setTopicId(rs.getString("topicID"));
						 ps.setUrl(rs.getString("url"));
						 al.add(ps);
				      }
				} catch (Exception ee) {
				} finally{
					try {
						if(st!=null) st.close();
					//	if(conn!=null) conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return al;
			}
		    
		   
		    
		    /**
			 * 查找表posts，获取在一定时间范围内（时间片），所有的主题数目
			 * @param starttime
			 * @param endtime
			 * @return
			 */
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
	//				try {
	//					if(st!=null) st.close();
	//					if(conn!=null) conn.close();
	//				} catch (SQLException e1) {
	//					e1.printStackTrace();
	//				} 	
				}
				return count;
			}
			
		    
		    /**
			 * 查找posts表，由于不能一次取出所有的posts flag=0；所以每次根据pid限制取出flag=0的posts
			 * @param startid 起始pid
			 * @param endid  结束pid
			 * @return 符合条件flag=0的posts对象
			 */
		    
		    
		    public void save_postswords_seg(Postswords_seg e) {
				// TODO Auto-generated method stub
		    	Connection conn=null;
		    	Statement st=null;
		    	try{
		    		//获得链接
					conn = this.getConnection();
					//创建Statement对象
					String sql = "INSERT INTO postswords_seg(pid,wid,weight,segtime,position,sPos,words,issuetime,topicID)values('"+e.getPid()+"','"+e.getWid()+"','"+e.getWeight()+"','"+MyUtil.toString(e.getSegtime())+"','"+e.getPosition()+"','"+e.getSPos()+"','"+e.getWords()+"','"+MyUtil.toString(e.getIssuetime())+"','"+e.getTopicID()+"')";
					st = conn.createStatement();
					//System.out.println(sql);
					//执行sql
					st.execute(sql);	
			}
		    	catch(Exception ee){
		    		}finally{
						try {
							if(st!=null) st.close();
					//		if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
		    /**
			 * 查找表posts中，在一个时间片内的所有主题
			 * @param starttime
			 * @param endtime
			 * @return  Tempclass中topicid，count中是主题中的帖子数
			 */
		    public ArrayList<Tempclass> select_topics(String starttime,String endtime){
		    	Connection conn=null;
		    	Statement st=null;
		    	ArrayList<Tempclass> al=new ArrayList<Tempclass>();
		    	try{
		    		conn=this.getConnection();
		    		String sql="select topicID,count(topicID) as cnt from posts where issuetime>='"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc";
		    		st=conn.createStatement();
		    		ResultSet rs=st.executeQuery(sql);
		    		while(rs.next()){
		    			Tempclass temp = new Tempclass();
						temp.setTopicId(rs.getString("topicID"));
						temp.setCount(rs.getInt("cnt"));
						al.add(temp);
		    		}
		    	}catch(Exception ee){}
		    	finally{
		    		try {
						if(st!=null) st.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 	
				}
				return al;
		    	}
		    public ArrayList<Tempclass> select_topics2(String starttime,String endtime){
		    	Connection conn=null;
		    	Statement st=null;
		    	ArrayList<Tempclass> al=new ArrayList<Tempclass>();
		    	try{
		    		conn=this.getConnection();
		    		String sql="select topicID,count(topicID) as cnt from posts_test where issuetime>='"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc";
		    		st=conn.createStatement();
		    		ResultSet rs=st.executeQuery(sql);
		    		while(rs.next()){
		    			Tempclass temp = new Tempclass();
						temp.setTopicId(rs.getString("topicID"));
						temp.setCount(rs.getInt("cnt"));
						al.add(temp);
		    		}
		    	}catch(Exception ee){}
		    	finally{
		    		try {
						if(st!=null) st.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 	
				}
				return al;
		    	}
		    
		    /**
			 * 查找posts表，获得主题的回帖数
			 * @param topicid
			 * @param starttime
			 * @param endtime
			 * @return
			 */
		    public int count_postsByTopicid(String topicid, String starttime, String endtime){
				Connection conn = null;
		    	Statement st = null;
				int count=0;
				try {
					//获得链接
					 conn = this.getConnection();
					//创建Statement对象
					String sql = "select count(*)num from posts where topicID = '"+topicid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"';";
					//System.out.println(sql);
					 st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					if(rs.next()){
						count = rs.getInt("num");
					}
				} catch (Exception ee) {
//					System.err.println(ee.getMessage());
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

	
		    
		    /*************************************对 Postswords的操作**************************************************************************
		     * 包括的操作有 ：
		     * 1.save_postswoeds(Postswords e)添加Postswords记录
		     * 2.void update_postswordsbyWidandTid(String wid,String topicId,double weight)
		     * 3.ArrayList<Tempclass> selectpw_wordcounts(int startrow, String start,String end)
		     * 3.int count_topicsbywords(String wid,String starttime, String endtime)
		     * 4.ArrayList<Postswords> select_findbyWidandTopicid(String wid, String topicId)
	
		     * 4.ArrayList<Tempclass> countunit_topicsbywords(String wid,String starttime, String endtime)
	
		     */
		    public void save_postswords(Postswords e) {
				// TODO Auto-generated method stub
		    	Connection conn=null;
		    	Statement st=null;
		    	try{
		    		//获得链接
					conn = this.getConnection();
					//创建Statement对象
					String sql = "INSERT INTO postswords(pid,wid,segtime,position,word,issuetime,topicID)values('"+e.getPid()+"','"+e.getWid()+"','"+MyUtil.toString(e.getSegtime())+"','"+e.getPosition()+"','"+e.getWord()+"','"+MyUtil.toString(e.getIssuetime())+"','"+e.getTopicID()+"')";
					st = conn.createStatement();
					System.out.println(sql);
					//执行sql
					st.execute(sql);	
			}
		    	catch(Exception ee){
		    		}finally{
						try {
							if(st!=null) st.close();
					//		if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
		    
		    public void save_postswords_weibo(Weiboswords e) {
				// TODO Auto-generated method stub
		    	Connection conn=null;
		    	Statement st=null;
		    	try{
		    		//获得链接
					conn = this.getConnection();
					//创建Statement对象
					String sql = "INSERT INTO weiboswords(pid,wid,segtime,position,word,issuetime,topicID)values('"+e.getPid()+"','"+e.getWid()+"','"+MyUtil.toString(e.getSegtime())+"','"+e.getPosition()+"','"+e.getWord()+"','"+MyUtil.toString(e.getIssuetime())+"','"+e.getTopicID()+"')";
					st = conn.createStatement();
//					System.out.println(sql);
					//执行sql
					st.execute(sql);	
			}
		    	catch(Exception ee){
		    		}finally{
						try {
							if(st!=null) st.close();
					//		if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
		    /**
			 * 文本表示中，更新postswords_temp表的weight值，通过wid和tid确定要更新的postswords表项
			 * @param wid  词的id
			 * @param topicId  话题id
			 * @param weight  权重值
			 */
		    public void update_postswordsbyWidandTid(String wid,String topicId,double weight){
				Connection conn = null;
		    	Statement st = null;
				try {
					//获得链接
					 conn = this.getConnection();
					//创建Statement对象
					String sql = "update postswords_temp set weight='"+weight+"' where wid= '"+wid+"' and topicID = '"+topicId+"'";
					System.out.println(sql);
					st = conn.createStatement();
					//执行sql
					st.execute(sql);
				} catch (Exception ee) {
	//				System.err.println(ee.getMessage());
				} finally{
					try {
						if(st!=null) st.close();
						if(conn!=null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 	
				}
			}
	
		    
		    /**
			 * 输入为时间段
			 * 查找表postswords_temp表，统计每个word在整个数据集中的次数
			 * @param startrow 每次指针起始位置
			 * @param start
			 * @return 每次返回2002个词
			 *         其中Tempclass中存入wid，和word的出现次数count
			 */
		    public ArrayList<Tempclass> selectpw_wordcounts(int startrow, String start,String end){
				ArrayList<Tempclass> al = new ArrayList<Tempclass>();
				Connection conn=null;
				Statement st=null;
				try{
					conn=this.getConnection();
					String sql="select wid,issuetime,count(wid)as cnt from postswords_temp where issuetime >='"+start+"' and issuetime <'"+end+"' group by wid order by wid desc;";
					st=conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					int i=1;
					rs.relative(startrow);
					Tempclass temp1=new Tempclass();
					temp1.setWid(rs.getString("wid"));
					temp1.setCount(rs.getInt("cnt"));
					al.add(temp1);
					while (rs.next()){
						 Tempclass temp = new Tempclass();
						 temp.setWid(rs.getString("wid"));
						 temp.setCount(rs.getInt("cnt"));
						 al.add(temp);
					//	 if(i>2000) break;
						 i++;
				      }
			   }catch(Exception ee){
			   }finally{
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
			 * 查找表postswords_temp，获取在一定时间范围内，出现word的帖子数
			 * @param starttime
			 * @param endtime
			 * @return
			 */
		    public int count_topicsbywords(String wid,String starttime,String endtime){
		    	Connection conn=null;
		    	Statement st=null;
		    	int count=0;
		    	int n=0;
		    	try{
		    		conn=this.getConnection();
					String sql = "select pid, wid, issuetime,topicID,word,count(topicID) as cnt from postswords_temp where wid = '"+wid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"' group by topicID";
				//	System.out.println(sql);
					st=conn.createStatement();
					ResultSet rs=st.executeQuery(sql);
					if(rs.last()){
						n=rs.getRow();
					}
					for(int i=1;i<=n;i++){
						rs.absolute(i);
						count+=rs.getInt("cnt");
					}
					//System.out.println(count);
		    	}catch(Exception ee){}
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
		    
		    public ArrayList<Postswords> select_findbyweight(){
		    	ArrayList<Postswords> al = new ArrayList<Postswords>();
				Connection conn=null;
				Statement st=null;
				try{
					conn=this.getConnection();
					String sql="select * from postswords_temp where weight>0";
					st = conn.createStatement();
	  				ResultSet rs = st.executeQuery(sql);
				}catch (Exception ee) {
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
			 * 查找表postswords_temp，通过wid和topicid查找对																																		
			 */
		    public ArrayList<Postswords> select_findbyWidandTopicid(String wid, String topicId){
				ArrayList<Postswords> al = new ArrayList<Postswords>();
				Connection conn=null;
				Statement st=null;
				try {
					conn = this.getConnection();
					String sql = "select * from postswords_temp where wid='"+wid+"' and topicID = '"+topicId+"'";
	//				System.out.println(sql);
					st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					 while (rs.next()){
						 Postswords pws = new Postswords();
						 pws.setFlag(rs.getInt("flag"));
						 pws.setIssuetime(rs.getTimestamp("issuetime"));
						 pws.setPid(rs.getInt("pid"));
						 pws.setPosition(rs.getString("position"));
						 pws.setPsid(rs.getInt("psid"));
						 pws.setSegtime(rs.getTimestamp("segtime"));
						 pws.setTopicID(rs.getString("topicID"));
						 pws.setWeight(rs.getDouble("weight"));
						 pws.setWid(rs.getString("wid"));
						 pws.setWord(rs.getString("word"));
						 al.add(pws);
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
			 * 查找表postswords_temp，获取word在一点时间范围内，单篇文档中出现次数，用于计算词在该文档的权重
			 * @param wid
			 * @param starttime
			 * @param endtime
			 * @return  Tempclass中wid，topicid，出现的次数count，在主题中出现的最大次数maxcount
			 */
		    public ArrayList<Tempclass> countunit_topicsbywords(String wid,String starttime, String endtime){
				Connection conn = null;
		    	Statement st = null;
				ArrayList<Tempclass> al= new ArrayList<Tempclass>();
				try {
					//获得链接
					 conn = this.getConnection();
					//创建Statement对象
					String sql = "select pid, wid, issuetime,topicID,word,count(topicID) as cnt from postswords_temp where wid = '"+wid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc";
					System.out.println(sql);
					st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql);
					int i=0;
					int max = 0;
					while(rs.next()){
						Tempclass temp = new Tempclass();
						temp.setWid(rs.getString("wid"));
						temp.setTopicId(rs.getString("topicID"));
						temp.setCount(rs.getInt("cnt"));
						if(i==0) max = rs.getInt("cnt");
						temp.setMaxcount(max);
						al.add(temp);
						i++;
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
				return al;
			}
		    
		    
		    
		    
		    /********************************************对Words的操作**********************************************************************************
		     * 包括的操作有：
		     * 1.save_words(Words e) 添加Words记录
		     * 2.void update_wordsissuetime(String wid,Timestamp issuetime)
		     * 3.void update_wordsweight(String wid,double weight)
		     * 4.void init_wordsweight()
		     * 5.ArrayList<String> select_wordsfeature(int limit)
		     * 6.void update_wordsfeature(String wid,int feature)
		     * 7.ArrayList<Words> select_findbyword(String word)
		     * 8.ArrayList<Words> select_findbyfeature()
		     * 9.ArrayList<Words> select_findbyweight()
	
		     */
		    
			/**
			 * 分词后保存出现的新词word
			 * @param e Words对象wid,sPOS,word
			 */
		    public void save_words(Words e){
		    	Connection conn=null;
		    	Statement st=null;
		    	try{
		    		//获得链接
		    		conn=this.getConnection();
		    		//创建Statement对象
		    		String sql="INSERT INTO words(wid,spos,word)values('"+e.getWid()+"','"+e.getSpos()+"','"+e.getWord()+"')";
		    		st=conn.createStatement();
		    		st.execute(sql);
//		    		System.out.println(sql);
		    	}catch(Exception ee){
		    		System.err.println(ee.getMessage()		);
		    	}finally{
		    		try{
		    			if(st!=null)st.close();
		    		//	if(conn!=null)conn.close();
		    		}catch(SQLException e1){
		    			e1.printStackTrace();
		    		}
		    	}
		    	
		    }
		    /**
		     * 特征提取前，初始化wordweight=0,feature=0
		     * @param word
		     * @return
		     */
		    public void init_wordsweight(){
		    	Connection conn=null;
		    	Statement st=null;
		    	try{
		    		conn=this.getConnection();
		    		String sql="update words set weight=0,feature=0";
		    		st=conn.createStatement();
		    		st.execute(sql);
		    	}catch(Exception ee){
		    		
		    	}finally{
		    		try{
		    			if(st!=null)st.close();
		    			if(conn!=null)conn.close();
		    		}catch(SQLException e1){
		    			e1.printStackTrace();
		    		}
		    	}
		    }
		    
	          public ArrayList<Words> select_findbyword(String word){
	        	  ArrayList<Words> al=new ArrayList<Words>();
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  conn = this.getConnection();
	  				String sql = "select * from words where word='"+word+"'";
	  				st = conn.createStatement();
	  				ResultSet rs = st.executeQuery(sql);
	  				 while (rs.next()){
	  					 Words ws = new Words();
	  					 ws.setFeature(rs.getInt("feature"));
	  					 ws.setNo(rs.getInt("NO"));
	  					 ws.setOther(rs.getString("other"));
	  					 ws.setSpos(rs.getString("sPOS"));
	  					 ws.setUpdatetime(rs.getTimestamp("updatetime"));
	  					 ws.setWeight(rs.getFloat("weight"));
	  					 ws.setWid(rs.getString("wid"));
	  					 ws.setWord(rs.getString("word"));
	  					 al.add(ws);
	  				 }
	  			      }catch(Exception ee){
	  			      }finally{
	  			    	try {
	  						if(st!=null) st.close();
	  				//		if(conn!=null) conn.close();
	  					} catch (SQLException e) {
	  						e.printStackTrace();
	  					}
	  				}
	  				return al;
	  			      }
	          
	          
	          /**
	  		 * 给postswords表创建临时表，存取需要聚类的帖子，并且添加索引wid;
	  		 * 注意：每次更新postswords表时，都需要调用
	  		 * @param starttime
	  		 * @param endtime
	  		 */
	          public void addTempTable(String starttime,String endtime){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  conn=this.getConnection();
	        		  String sql1="drop table if exists postswords_temp;";
	        		  String sql2="create table postswords_temp as select * from postswords where issuetime>='"+starttime+"' and issuetime<'"+endtime+"';";
	        		  String sql3="create index index_wid on postswords_temp(wid)";
	        		  st=conn.createStatement();
	        		  st.execute(sql1);
	        		  st.execute(sql2);
	        		  st.execute(sql3);
	        		  System.out.println(sql2);
	        	  }
	        	  catch(Exception ee){
	        		  System.err.println(ee.getMessage());
	        	  }
	        	  finally{
	        		  try{
	        			if(st!=null) st.close();
	  					if(conn!=null) conn.close();
	        		  }catch(SQLException e1){
	        			  e1.printStackTrace();
	        		  }
	        	  }
	          }
	          
	          /**
	  		 * 在words表中，通过权重排序获得特征词
	  		 * @param limit  选定的向量的维数，也就是特征词个数
	  		 * @return ArrayList<String> 返回特征词的wid
	  		 */
	          public ArrayList<String> select_wordsfeature(int limit){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  ArrayList<String> wordlist=new ArrayList<String>();
	        	  try{
	        		//获得链接
	 				 conn = this.getConnection();
	 				//创建Statement对象
	 				String sql = "select * from words order by weight desc limit "+limit;
	 				System.out.println(sql);
	 				st = conn.createStatement();
	 				ResultSet rs = st.executeQuery(sql);
	 				while (rs.next()){
	 					String wid = rs.getString("wid");
	 					wordlist.add(wid);
	 			     }
	 			} catch (Exception ee) {
	// 				System.err.println(ee.getMessage());
	 			} finally{
	 				try {
	 					if(st!=null) st.close();
	 					if(conn!=null) conn.close();
	 				} catch (SQLException e1) {
	 					e1.printStackTrace();
	 				} 	
	 			}
	 			return wordlist;
	 		}
	          
	        /*
	  		 * 特征提取中，更新words表中的feature
	  		 * @param wid  需要更新的word的wid
	  		 * @param feature  特征标识
	  		 */
	          public void update_wordsfeature(String wid,int feature){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  //获得链接
	        		  conn=this.getConnection();
	        		  String sql="update words set feature="+feature+" where wid='"+wid+"';";
	        		  System.out.println(sql);
	        		  st=conn.createStatement();
	        		  st.execute(sql);
	        		  }
	        	  catch(Exception ee){}
	        	  finally{
	        		  try {
	  					if(st!=null) st.close();
	  					if(conn!=null) conn.close();
	  				} catch (SQLException e1) {
	  					e1.printStackTrace();
	  				} 	
	        	  }
	          }
	          /**
	  		 * 特征提取中，更新words表中，word的权重
	  		 * @param wid 词的id
	  		 * @param weight 词的权重
	  		 */
	          public void update_wordsweight(String wid,double weight){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  conn=this.getConnection();
	        		  String sql="update words set weight='"+weight+"' where wid='"+wid+"'";
	        		  System.out.println(sql);
	        		  st=conn.createStatement();
	        		  st.execute(sql);
	        	  }catch(Exception ee){}
	        	  finally{
	        		  try {
	  					if(st!=null) st.close();
	  					if(conn!=null) conn.close();
	  				} catch (SQLException e1) {
	  					e1.printStackTrace();
	  				} 	
	  			}
	        	  }
	          /**
	  		 * 在word表中查找所有有权重的word
	  		 * @return 返回符合条件的words
	  		 */
	          public ArrayList<Words> select_findbyweight(double weight)
	          {
	        	  ArrayList<Words> al=new ArrayList<Words>();
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  conn=this.getConnection();
	        		  String sql = "select * from words where weight > '"+weight+"' order by weight desc;";      
	        		//  System.out.println(sql);
	        		  st=conn.createStatement();
	        		  ResultSet rs=st.executeQuery(sql);
	        		  while(rs.next()){
	        			  Words ws=new Words();
	        			  ws.setFeature(rs.getInt("feature"));
	        			  ws.setNo(rs.getInt("no"));
	        			  ws.setOther(rs.getString("other"));
	        			  ws.setSpos(rs.getString("spos"));
	        			  ws.setUpdatetime(rs.getTimestamp("updatetime"));
	        			  ws.setWeight(rs.getDouble("weight"));
	        			  ws.setWid(rs.getString("wid"));
	 					  ws.setWord(rs.getString("word"));
	        			  al.add(ws);
	        		  }
	        	  }catch(Exception ee){       		  
	        	  }finally{
	        		  try {
	  					if(st!=null) st.close();
	  					if(conn!=null) conn.close();
	  				} catch (SQLException e) {
	  					e.printStackTrace();
	  				}
	        	  }
	        	      return al;
	        	  }
	          
	          /******************************************对Topics的操作*****************************************************************************************
	  	     * 包括的操作有：
	  	     * 1.void save_topics(Topics e) 添加Topics记录
	  	     * 2. void update_vectorInTopics(String tid,String vector,String endslot)
	  	     * 3.ArrayList<Topics> select_topicsBytimelimit(String starttime , String endtime)
	  	     * 4.void update_energyInTopics(String tid,double energy)
	  	     */
	  	    
	          /**
	  	     * 聚类后添加Topics对象,添加一条记录
	  	     * @param e Topics对象tid,energy,vector,updatetime,slot,clusterperiod
	  	     * updatetime 是当前时间片的起始时间
	  	     */
	          public void save_topics(Topics e){
	  	    	Connection conn = null;
	  	    	Statement st = null;
	  			try {
	  				//获得链接
	  				conn = this.getConnection();
	  				//创建Statement对象
	  				String sql = "INSERT INTO topics(tid,energy,vector,updatetime,slot,clusterperiod)values('"+e.getTid()+"','"+e.getEnergy()+"','"+e.getVector()+"','"+MyUtil.toString(e.getUpdatetime())+"','"+e.getSlot()+"','"+e.getClusterperiod()+"')";
	  				//System.out.println(sql);
	  				st = conn.createStatement();
	  				//执行sql
	  				st.execute(sql);
	  			} catch (Exception ee) {
	//  				System.err.println(ee.getMessage());
	  			}finally{
	  				try {
	  					if(st!=null) st.close();
	  					if(conn!=null) conn.close();
	  				} catch (SQLException e1) {
	  					e1.printStackTrace();
	  				}
	  			} 	
	  	    }
	          /**
	  		 * 聚类中，更新话题的向量表示
	  		 * @param tid  需要更新的话题的id
	  		 * @param vector  话题的向量
	  		 */
	          public void update_vectorInTopics(String tid,String vector){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  conn=this.getConnection();
	        		  String sql="update topics set vector='"+vector+"' where tid= '"+tid+"'";
	        		  st=conn.createStatement();
	        		  st.execute(sql);
	        	  }catch(Exception ee){}
	        	  finally{
	        			try {
	    					if(st!=null) st.close();
	    					if(conn!=null) conn.close();
	    				} catch (SQLException e1) {
	    					e1.printStackTrace();
	    				} 
	        	  }
	          }
	       
	  		/**
	  		 * 查找topics表中在updatetime时间范围内的topics
	  		 * @param starttime
	  		 * @param endtime
	  		 * @return
	  		 */
	          public ArrayList<Topics> select_topicsBytimelimit(String starttime,String endtime){
	        	  ArrayList<Topics> al = new ArrayList<Topics>();
					Connection conn=null;
					Statement st=null;
					try {
						conn = this.getConnection();
						String sql = "select * from topics ";
						System.out.println(sql);
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						 while (rs.next()){
							 Topics ts = new Topics();
							 ts.setTid(rs.getString("tid"));
							 ts.setEnergy(rs.getDouble("energy"));
							 ts.setUpdatetime(rs.getTimestamp("updatetime"));
							 ts.setVector(rs.getString("vector"));
							 ts.setClusterperiod(rs.getString("clusterperiod"));
							 ts.setSlot(rs.getInt("slot"));
							 al.add(ts);
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
	  		 * 在word表中遍历特征词
	  		 * @param startid
	  		 * @param endid
	  		 * @param n 维数
	  		 * @return
	  		 */
	          public ArrayList<Words> select_findbyfeature(int n){
	  			ArrayList<Words> al = new ArrayList<Words>();
	  			Connection conn=null;
	  			Statement st=null;
	  			try {
	  				conn = this.getConnection();
	  				String sql = "select * from words where feature<= "+n+" and feature>0";
	  				st = conn.createStatement();
	  				ResultSet rs = st.executeQuery(sql);
	  				 while (rs.next()){
	  					 Words ws = new Words();
	  					 ws.setFeature(rs.getInt("feature"));
	  					 ws.setNo(rs.getInt("NO"));
	  					 ws.setOther(rs.getString("other"));
	  					 ws.setSpos(rs.getString("sPOS"));
	  					 ws.setUpdatetime(rs.getTimestamp("updatetime"));
	  					 ws.setWeight(rs.getFloat("weight"));
	  					 ws.setWid(rs.getString("wid"));
	  					 ws.setWord(rs.getString("word"));
	  					 al.add(ws);
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
	          
	         public void update_energyInTopics(String tid,double energy){
	        	 Connection conn=null;
	  	  			Statement st=null;
	  	  			try {
	  	  				conn = this.getConnection();
	  	  				st = conn.createStatement();
	  	  					 Topics topic=new Topics();
	  	  					 topic.setEnergy(energy);
	                 		 String sql="update topics set energy="+energy+" where tid='"+tid+"'";
		  	  			     System.out.println(sql);
		  	  			     st=conn.createStatement();
		        	         st.execute(sql);
	  	  			      
	  	  			} catch (Exception ee) {
	  	  			} finally{
	  	  				try {
	  	  					if(st!=null) st.close();
	  	  					if(conn!=null) conn.close();
	  	  				} catch (SQLException e) {
	  	  					e.printStackTrace();
	  	  				}
	  	  			} 
	         }
	          /******************************************对topicsposts的操作*****************************************************************************************
	  	     * 包括的操作有：
	  	     * 1.save_topicsposts(Topicsposts e) 添加Topicsposts记录
	  	     */
	          public void save_topicsposts(Topicsposts e){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  try{
	        		  conn=this.getConnection();
	        		  String sql="INSERT INTO topicsposts(tid,topicID,similarity,clustertime,nutrition,clusterperiod)values('"+e.getTid()+"','"+e.getTopicId()+"','"+e.getSimilarity()+"','"+MyUtil.toString(e.getClustertime())+"','"+e.getNutrition()+"','"+e.getClusterperiod()+"')";
	        	 //     System.out.println(sql);
	        	      st=conn.createStatement();
	        	      st.execute(sql);
	        	  }catch(Exception ee){}
	        	  finally{
	  				try {
	  					if(st!=null) st.close();
	  					if(conn!=null) conn.close();
	  				} catch (SQLException e1) {
	  					e1.printStackTrace();
	  				}
	          }
	          }
	          
	          public ArrayList<Topicsposts> select_topicspostsBytimelimit(String starttime,String endtime,String tid){
	        	  ArrayList<Topicsposts> al = new ArrayList<Topicsposts>();
					Connection conn=null;
					Statement st=null;
					try {
						conn = this.getConnection();
						String sql = "select * from topicsposts where clustertime >= '"+starttime+"' and clustertime <= '"+endtime+"' and nutrition>=0 and tid='"+tid+"'";
						//System.out.println(sql);
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						 while (rs.next()){
							 Topicsposts ts = new Topicsposts();
							 ts.setTid(rs.getString("tid"));
							 ts.setSimilarity(rs.getDouble("similarity"));
							 ts.setClustertime(rs.getTimestamp("clustertime"));
							 ts.setTopicId(rs.getString("TopicId"));
							 ts.setClusterperiod(rs.getString("clusterperiod"));
							 al.add(ts);
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
//	        	  public ArrayList<Vector> textpresentation(String vector,String starttime,String endtime){
//	  	  			ArrayList<Vector> al = new ArrayList<Vector>();
//	  	  			Connection conn=null;
//	  	  			Statement st=null;
//	  	  			try {
//	  	  				conn = this.getConnection();
//	  	  				String sql = "select topicID,GROUP_CONCAT(word)as words from postswords_temp group by topicID where issuetime >= '"+starttime+"' and issuetime <= '"+endtime+"'"  ;
//	  	  			//	System.out.println(sql);
//	  	  				st = conn.createStatement();
//	  	  				ResultSet rs = st.executeQuery(sql);
//	  	  				 while (rs.next()){
//	  	  					 Vector vt = new Vector();
//	  	  					 vt.setTopicID(rs.getString("topicID"));
//	  	  					 vt.setWords(rs.getString("words"));
//	  	  					 vt.setVector(vector);
//	  	  					 String sql2="INSERT INTO test_threshold(topicID,words,vector)values('"+vt.getTopicID()+"','"+vt.getWords()+"','"+vt.getVector()+"')";
//		  	  			 //    System.out.println(sql2);
//		  	  			    st=conn.createStatement();
//		        	         st.execute(sql2);
//	  	  			      }
//	  	  			} catch (Exception ee) {
//	  	  			} finally{
//	  	  				try {
//	  	  					if(st!=null) st.close();
//	  	  					if(conn!=null) conn.close();
//	  	  				} catch (SQLException e) {
//	  	  					e.printStackTrace();
//	  	  				}
//	  	  			}
//	  	  			return al;
//	          }
	        
	        	  public ArrayList<Vector> textpresentation(String topicID,String vector,double similarity){
		  	  			ArrayList<Vector> al = new ArrayList<Vector>();
		  	  			Connection conn=null;
		  	  			Statement st=null;
		  	  			try {
		  	  				conn = this.getConnection();
		  	  				st = conn.createStatement();
		  	  					 Vector vt = new Vector();
		  	  					 vt.setTopicID(topicID);
		  	  					 vt.setVector(vector);
		  	  					 vt.setSimilarity(similarity);
	  	                 		 String sql="INSERT INTO vector2(topicID,vector,similarity)values('"+vt.getTopicID()+"','"+vt.getVector()+"','"+vt.getSimilarity()+"')";
			  	  			     System.out.println(sql);
			  	  			     st=conn.createStatement();
			        	         st.execute(sql);
		  	  			      
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
	        	  
	        	  
	        	  public void insertintovector(double similarity,String topicID){
	        		  Connection conn=null;
		  	  			Statement st=null;
		  	  			try {
		  	  				conn = this.getConnection();
		  	  				st = conn.createStatement();
		  	  					 Vector vt = new Vector();
		  	  					 vt.setSimilarity(similarity);
	  	                 		 String sql="update vector set similarity='"+vt.getSimilarity()+"' where topicID='"+topicID+"'";
			  	  			     System.out.println(sql);
			  	  			     st=conn.createStatement();
			        	         st.execute(sql);
		  	  			      
		  	  			} catch (Exception ee) {
		  	  			} finally{
		  	  				try {
		  	  					if(st!=null) st.close();
		  	  					if(conn!=null) conn.close();
		  	  				} catch (SQLException e) {
		  	  					e.printStackTrace();
		  	  				}
		  	  			}
	        	  }
	        	  
		          /******************************************对postswords_temp的操作*****************************************************************************************/
	        	  public ArrayList<Tempclass> count_postswords_temp(String starttime,String endtime){
	  		    	Connection conn=null;
	  		    	Statement st=null;
	  		    	ArrayList<Tempclass> al=new ArrayList<Tempclass>();
	  		    	try{
	  		    		conn=this.getConnection();
	  		    		String sql="select topicID,count(topicID) as cnt from postswords_temp where issuetime>='"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc";
	  		    		st=conn.createStatement();
	  		    		ResultSet rs=st.executeQuery(sql);
	  		    		while(rs.next()){
	  		    			Tempclass temp = new Tempclass();
	  						temp.setTopicId(rs.getString("topicID"));
	  						temp.setCount(rs.getInt("cnt"));
	  						al.add(temp);
	  		    		}
	  		    	}catch(Exception ee){}
	  		    	finally{
	  		    		try {
	  						if(st!=null) st.close();
	  						if(conn!=null) conn.close();
	  					} catch (SQLException e1) {
	  						e1.printStackTrace();
	  					} 	
	  				}
	  				return al;
	  		    	}
	        	  

	        	  public ArrayList<Words> select_findbyfeatureandTopicid(int feature, String topicId){
	  				Connection conn=null;
	  				Statement st=null;
	  				ArrayList<Words> al=new ArrayList<Words>();
	  				try {
	  					conn = this.getConnection();
	  					String sql = "select * from words where feature='"+feature+"' and topicID = '"+topicId+"'";
	  	//				System.out.println(sql);
	  					st = conn.createStatement();
	  					ResultSet rs = st.executeQuery(sql);
	  					 while (rs.next()){
	  						Words ws=new Words();
	  						ws.setFeature(rs.getInt("feature"));
	  						ws.setNo(rs.getInt("no"));
	  						ws.setOther(rs.getString("other"));
	  						ws.setSpos(rs.getString("spos"));
	  						ws.setUpdatetime(rs.getTimestamp("updatetime"));
	  						ws.setWeight(rs.getDouble("weight"));
	  						ws.setWid(rs.getString("wid"));
	  						ws.setWord(rs.getString("word"));
	  						al.add(ws);
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
	        	  
	      		/******************************测试时使用的*****************************************************8
	      		 * 
	      		 * @param args
	      		 * @throws Exception
	      		 */
	      		/**
	      		 * 测试查全率和查准率时，计算分子nij
	      		 * @param flag 人工标定不同话题的标记
	      		 * @return Tempclass 交集 ，其中count是nij，wid是tid
	      		 */
	        	  public Tempclass select_count_nij(int flag){
	        		  Connection conn=null;
	        		  Statement st=null;
	        		  Tempclass temp=new Tempclass();
	        		  try{
	        			//获得链接
	     				 conn = this.getConnection();
	     				//创建Statement对象
	     				String sql = "select tid,count(tid) as cnt from (select  topicsweibos.tid  from weibo_test,topicsposts where posts_test.flag = '"+flag+"' and posts_test.topicID = topicsposts.topicID )as aa group by tid order by cnt limit 1;";
	     				//System.out.println(sql);
	     				st = conn.createStatement();
	     				ResultSet rs = st.executeQuery(sql);
	     				if(rs.first()){
//	     					count = rs.getInt("cnt");
	     					temp.setCount(rs.getInt("cnt"));
	     					temp.setWid(rs.getString("tid"));
	     				}
	     			} catch (Exception ee) {
//	     				System.err.println(ee.getMessage());
	     			} 	
	     			finally{
	     				try {
	     					if(st!=null) st.close();
	     					if(conn!=null) conn.close();
	     				} catch (SQLException e1) {
	     					e1.printStackTrace();
	     				} 	
	     			}
	     			return temp;
	     		}
	        	  
	        	  /**
	      		 * 测试查全率和查准率时，计算分母ni
	      		 * @return count_ni的数组
	      		 */
	      		public int[] select_count_ni(){
	      			Connection conn = null;
	      	    	Statement st = null;
	      	    	int[] countarray = new int[10];
	      			try {
	      				//获得链接
	      				 conn = this.getConnection();
	      				//创建Statement对象
	      				String sql = "select count(flag)as cnt from comment_test where flag>=1000 group by flag order by flag";
	      			//	System.out.println(sql);
	      				st = conn.createStatement();
	      				ResultSet rs = st.executeQuery(sql);
	      				int i= 0;
	      				while(rs.next()){
	      					countarray[i] = rs.getInt("cnt");
	      					i++;
	      				}
	      			} catch (Exception ee) {
//	      				System.err.println(ee.getMessage());
	      			} 	
	      			finally{
	      				try {
	      					if(st!=null) st.close();
	      					if(conn!=null) conn.close();
	      				} catch (SQLException e1) {
	      					e1.printStackTrace();
	      				} 	
	      			}
	      			return countarray;
	      		}
	      		
	      		  /***
	      	     * 测试查全率查准率时，计算分母nj
	      	     * @param tid
	      	     * @return nj即聚类j中所有对象的数目
	      	     */
	      	    public int select_count_nj(String tid){
	      	    	Connection conn = null;
	      	    	Statement st = null;
	      			int count=0;
	      			try {
	      				//获得链接
	      				 conn = this.getConnection();
	      				//创建Statement对象
	      				String sql = "select count(mid) as cnt from (select  weibo_test.mid  from weibo_test,topicsweibos where topicsweibos.tid = '"+tid+"' and weibo_test.mid = topicsposts.topicId )as aa ;";
	      			//	System.out.println(sql);
	      				 st = conn.createStatement();
	      				ResultSet rs = st.executeQuery(sql);
	      				if(rs.first()){
	      					count = rs.getInt("cnt");
	      				}
	      			} catch (Exception ee) {
//	      				System.err.println(ee.getMessage());
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
	      	    public void Droptopics(){
	      	    	Connection conn = null;
	      	    	Statement st = null;
	      			try {
	      				//获得链接
	      				 conn = this.getConnection();
	      				//创建Statement对象
                        String sql1="truncate table topicsposts;";
                        String sql2="truncate table topics;";
                        System.out.println(sql1);
                        System.out.println(sql2);
	      				 //	System.out.println(sql);
	      				 st = conn.createStatement();
		        		  st.execute(sql1);
		        		  st.execute(sql2);
		         			} catch (Exception ee) {
//	      				System.err.println(ee.getMessage());
	      			} 	
	      			finally{
	      				try {
	      					if(st!=null) st.close();
	      					if(conn!=null) conn.close();
	      				} catch (SQLException e1) {
	      					e1.printStackTrace();
	      				} 	
	      			}
	      	    }
	      	   /*
	      	    * 测试营养转化因子和衰减因子
	      	    */
	      	  public ArrayList<Vector> select_vector(){
			    	Connection conn=null;
			    	Statement st=null;
			    	ArrayList<Vector> al=new ArrayList<Vector>();
			    	try{
			    		conn=this.getConnection();
			    		String sql="select * from vector";
			    		System.out.println(sql);
			    		st=conn.createStatement();
			    		ResultSet rs=st.executeQuery(sql);
			    		while(rs.next()){
			    			Vector vt = new Vector();
			    			vt.setTopicID(rs.getString("topicID"));
			    			vt.setVector(rs.getString("vector"));
						//	vt.setSimilarity(rs.getDouble("similarity"));
				    		 al.add(vt);
			    		}
			    	}catch(Exception ee){}
			    	finally{
			    		try {
							if(st!=null) st.close();
							if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 	
					}
					return al;
			    	}
	        	  
	      	  
	      	  
	      	/**********************************对微博weibo的操作*************************************************************
	      	 * 
	      	 */
	      	 /**
	           * 数据获取后添加weibo对象,添加一条记录
	           */
	          public void save_weibo(Weibos e){
	          	Connection conn = null;
	          	Statement st = null;
	      		try {
	      			//获得链接
	      			conn = this.getConnection();
	      			//创建Statement对象
	      			String sql = "INSERT INTO weibo( author, createddate, statusid, mid, texts, source, parentid, inreplytostatusid, inreplytouserid, repostscount, commentscount, flag)values('"+e.getAuthor()+"','"+MyUtil.toString(e.getCreateddate())+"','"+e.getStatusid()+"','"+e.getMid()+"','"+e.getText()+"','"+e.getSource()+"','"+e.getParentid()+"','"+e.getInreplytostatusid()+"','"+e.getInreplytouserid()+"','"+e.getRepostscount()+"','"+e.getCommentscount()+"','0' )";
	      			st = conn.createStatement();
//	      			System.out.println(sql);
	      			//执行sql
	      			st.execute(sql);
	      		} catch (Exception ee) {
//	      				System.err.println(ee.getMessage());
	      		}finally{
	      			try {
	      				if(st!=null) st.close();
	      			 //   if(conn!=null) conn.close();
	      			} catch (SQLException e1) {
	      				e1.printStackTrace();
	      			}
	      		} 	
	          }
	      	  
	          public void update_weibos(String mid,String parentid) {
					// TODO Auto-generated method stub
		            Connection conn=null;
		            Statement st=null;
		            try{
		            	conn= this.getConnection();
		            	String sql="update weibo set parentid='"+parentid+"' where mid='"+mid+"'";
//		            	System.out.println(sql);
		            	st=conn.createStatement();
		            	st.execute(sql);
		            }catch(Exception ee){
		            	
		            }finally{
		            	try{
		            		if(st!=null)st.close();
		            	//	if(conn!=null)conn.close();
		            	}catch(SQLException e1){
		            		e1.printStackTrace();
		            	}
		            	
		            }
				}
	          
//	          public void update_weibos() {
//					// TODO Auto-generated method stub
//		            Connection conn=null;
//		            Statement st=null;
//		            try{
//		            	conn= this.getConnection();
//		            	String sql="update weibo set inreplytostatusid = 'true' where ";
//		            	System.out.println(sql);
//		            	st=conn.createStatement();
//		            	st.execute(sql);
//		            }catch(Exception ee){
//		            	
//		            }finally{
//		            	try{
//		            		if(st!=null)st.close();
//		            	//	if(conn!=null)conn.close();
//		            	}catch(SQLException e1){
//		            		e1.printStackTrace();
//		            	}
//		            	
//		            }
//				}

	          public ArrayList<String> select_weibo(){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  ArrayList<String> midlist=new ArrayList<String>();
	        	  try{
	        		//获得链接
	 				 conn = this.getConnection();
	 				//创建Statement对象
	 				String sql = "select mid from weibo where inreplytostatusid = 'true'";
	 				System.out.println(sql);
	 				st=conn.createStatement();
		    		ResultSet rs=st.executeQuery(sql);
		    		while(rs.next()){
	 					String mid = rs.getString("mid");
	 					System.out.println(mid);
	 					midlist.add(mid);
	 			     }
	 			} catch (Exception ee) {
	// 				System.err.println(ee.getMessage());
	 			} finally{
	 				try {
	 					if(st!=null) st.close();
	 					if(conn!=null) conn.close();
	 				} catch (SQLException e1) {
	 					e1.printStackTrace();
	 				} 	
	 			}
	 			return midlist;
	 		}
	       
	          public ArrayList<String> select_weibo(String flag){
	        	  Connection conn=null;
	        	  Statement st=null;
	        	  ArrayList<String> midlist=new ArrayList<String>();
	        	  try{
	        		//获得链接
	 				 conn = this.getConnection();
	 				//创建Statement对象
	 				String sql = "select mid from weibo where inreplytostatusid = 'true' and flag != '"+flag+"'";
	 				System.out.println(sql);
	 				st=conn.createStatement();
		    		ResultSet rs=st.executeQuery(sql);
		    		while(rs.next()){
	 					String mid = rs.getString("mid");
	 					System.out.println(mid);
	 					midlist.add(mid);
	 			     }
	 			} catch (Exception ee) {
	// 				System.err.println(ee.getMessage());
	 			} finally{
	 				try {
	 					if(st!=null) st.close();
	 					if(conn!=null) conn.close();
	 				} catch (SQLException e1) {
	 					e1.printStackTrace();
	 				} 	
	 			}
	 			return midlist;
	 		}
	          
	          /**
			     * 更新帖子处理状态0：未分词
			     * 1.分词结束
			     * 2.聚类结束
			     * 3.排序完成
			     * @param pid 需要更新的帖子id
			     * @param flag 需要将状态更新为flag
			     */
			    public void update_posts_weibo(int wid,String flag) {
					// TODO Auto-generated method stub
		            Connection conn=null;
		            Statement st=null;
		            try{
		            	conn= this.getConnection();
		            	String sql="update weibo set flag='"+flag+"' where wid='"+wid+"'";
		            	System.out.println(sql);
		            	st=conn.createStatement();
		            	st.execute(sql);
		            }catch(Exception ee){
		            	
		            }finally{
		            	try{
		            		if(st!=null)st.close();
		            	//	if(conn!=null)conn.close();
		            	}catch(SQLException e1){
		            		e1.printStackTrace();
		            	}
		            	
		            }
				}
	          
			    public void update_posts_weibo(String mid,String flag) {
					// TODO Auto-generated method stub
		            Connection conn=null;
		            Statement st=null;
		            try{
		            	conn= this.getConnection();
		            	String sql="update weibo set flag='"+flag+"' where mid='"+mid+"'";
		            	System.out.println(sql);
		            	st=conn.createStatement();
		            	st.execute(sql);
		            }catch(Exception ee){
		            	
		            }finally{
		            	try{
		            		if(st!=null)st.close();
		            	//	if(conn!=null)conn.close();
		            	}catch(SQLException e1){
		            		e1.printStackTrace();
		            	}
		            	
		            }
				}
			    
			    public ArrayList<Words> select_weibofindbyfeature(int n){
		  			ArrayList<Words> al = new ArrayList<Words>();
		  			Connection conn=null;
		  			Statement st=null;
		  			try {
		  				conn = this.getConnection();
		  				String sql = "select * from words where feature<= "+n+" and feature>0";
		  				st = conn.createStatement();
		  				ResultSet rs = st.executeQuery(sql);
		  				 while (rs.next()){
		  					 Words ws = new Words();
		  					 ws.setFeature(rs.getInt("feature"));
		  					 ws.setNo(rs.getInt("NO"));
		  					 ws.setOther(rs.getString("other"));
		  					 ws.setSpos(rs.getString("sPOS"));
		  					 ws.setUpdatetime(rs.getTimestamp("updatetime"));
		  					 ws.setWeight(rs.getFloat("weight"));
		  					 ws.setWid(rs.getString("wid"));
		  					 ws.setWord(rs.getString("word"));
		  					 al.add(ws);
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
			    
			    public ArrayList<Weibos> select_weibosbyID(int startid,int endid){
					ArrayList<Weibos> al = new ArrayList<Weibos>();
					Connection conn=null;
					Statement st=null;
					try {
						conn = this.getConnection();
						String sql = "select * from weibo where flag=0 and wid>="+startid+" and wid<="+endid;
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						 while (rs.next()){
							 Weibos ps = new Weibos();
							 ps.setAuthor(rs.getString("author"));
							 ps.setCommentscount(rs.getInt("commentscount"));
							 ps.setCreateddate(rs.getTimestamp("createddate"));
							 ps.setInreplytostatusid(rs.getString("inreplytostatusid"));
							 ps.setInreplytouserid(rs.getString("inreplytouserid"));
							 ps.setMid(rs.getString("mid"));
							 ps.setParentid(rs.getString("parentid"));
							 ps.setRepostscount(rs.getInt("repostscount"));
							 ps.setSource(rs.getString("source"));
							 ps.setStatusid(rs.getString("statusid"));
							 ps.setText(rs.getString("texts"));
							 ps.setWid(rs.getInt("wid"));
							 
							 al.add(ps);
					      }
					} catch (Exception ee) {
					} finally{
						try {
							if(st!=null) st.close();
						//	if(conn!=null) conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					return al;
				}
			    
			    public int find_weibos_start(){
			    	int start=0;
			    	Connection conn=null;
			    	Statement st=null;
			    	try {
						//获得链接
						conn = this.getConnection();
						//创建Statement对象
						String sql = "SELECT min(wid) FROM `weibo` where flag=0;";
					    st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						if(rs.next()){
							start = rs.getInt("min(wid)");
						}
					} catch (Exception ee) {
		//				System.err.println(ee.getMessage());
					} 
					finally{
						try {
							if(st!=null) st.close();
						//	if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 	
					}
					return start;
			    }
			    
			    public int find_weibos_last(){
					int last=0;
					Connection conn = null;
			    	Statement st = null;
					try {
						//获得链接
						conn = this.getConnection();
						//创建Statement对象
						String sql = "SELECT max(wid) FROM `weibo` where flag=0;";
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						if(rs.next()){
							last = rs.getInt("max(wid)");
						}
					} catch (Exception ee) {
		//				System.err.println(ee.getMessage());
					} 	
					finally{
						try {
							if(st!=null) st.close();
						//	if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 	
					}
					return last;
				}
			    
			    public ArrayList<Weiboswords> select_findbyWidandTopicid_weibo(String wid, String topicId){
					ArrayList<Weiboswords> al = new ArrayList<Weiboswords>();
					Connection conn=null;
					Statement st=null;
					try {
						conn = this.getConnection();
						String sql = "select * from weiboswords_temp where wid='"+wid+"' and topicID = '"+topicId+"'";
		//				System.out.println(sql);
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						 while (rs.next()){
							 Weiboswords pws = new Weiboswords();
							 pws.setFlag(rs.getInt("flag"));
							 pws.setIssuetime(rs.getTimestamp("issuetime"));
							 pws.setPid(rs.getInt("pid"));
							 pws.setPosition(rs.getString("position"));
							 pws.setPsid(rs.getInt("psid"));
							 pws.setSegtime(rs.getTimestamp("segtime"));
							 pws.setTopicID(rs.getString("topicID"));
							 pws.setWeight(rs.getDouble("weight"));
							 pws.setWid(rs.getString("wid"));
							 pws.setWord(rs.getString("word"));
							 al.add(pws);
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
			    
			    public void save_topicsweibos(Topicsweibos e){
		        	  Connection conn=null;
		        	  Statement st=null;
		        	  try{
		        		  conn=this.getConnection();
		        		  String sql="INSERT INTO topicsweibos(tid,topicID,similarity,clustertime,nutrition,clusterperiod)values('"+e.getTid()+"','"+e.getTopicId()+"','"+e.getSimilarity()+"','"+MyUtil.toString(e.getClustertime())+"','"+e.getNutrition()+"','"+e.getClusterperiod()+"')";
		        	 //     System.out.println(sql);
		        	      st=conn.createStatement();
		        	      st.execute(sql);
		        	  }catch(Exception ee){}
		        	  finally{
		  				try {
		  					if(st!=null) st.close();
		  					if(conn!=null) conn.close();
		  				} catch (SQLException e1) {
		  					e1.printStackTrace();
		  				}
		          }
		          }
			    
			    
			    
			    public ArrayList<Topicsweibos> select_topicsweibosBytimelimit(String starttime,String endtime,String tid){
		        	  ArrayList<Topicsweibos> al = new ArrayList<Topicsweibos>();
						Connection conn=null;
						Statement st=null;
						try {
							conn = this.getConnection();
							String sql = "select * from topicsweibos where clustertime >= '"+starttime+"' and clustertime <= '"+endtime+"' and nutrition>=0 and tid='"+tid+"'";
							//System.out.println(sql);
							st = conn.createStatement();
							ResultSet rs = st.executeQuery(sql);
							 while (rs.next()){
								 Topicsweibos ts = new Topicsweibos();
								 ts.setTid(rs.getString("tid"));
								 ts.setSimilarity(rs.getDouble("similarity"));
								 ts.setClustertime(rs.getTimestamp("clustertime"));
								 ts.setTopicId(rs.getString("TopicId"));
								 ts.setClusterperiod(rs.getString("clusterperiod"));
								 al.add(ts);
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
			    public ArrayList<Tempclass> select_weibotopics(String starttime,String endtime){
			    	Connection conn=null;
			    	Statement st=null;
			    	ArrayList<Tempclass> al=new ArrayList<Tempclass>();
			    	try{
			    		conn=this.getConnection();
			    		String sql="select parentid,count(parentid) as cnt from weibo where issuetime>='"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc";
			    		st=conn.createStatement();
			    		ResultSet rs=st.executeQuery(sql);
			    		while(rs.next()){
			    			Tempclass temp = new Tempclass();
							temp.setParentid(rs.getString("parentid"));
							temp.setCount(rs.getInt("cnt"));
							al.add(temp);
			    		}
			    	}catch(Exception ee){}
			    	finally{
			    		try {
							if(st!=null) st.close();
							if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 	
					}
					return al;
			    	}
			    
			    public int count_topics_weibo(String starttime, String endtime){
					Connection conn = null;
			    	Statement st = null;
					int count=0;
					try {
						//获得链接
						 conn = this.getConnection();
						//创建Statement对象
						String sql = "select parentid,createddate,count(parentid) as cnt from weibo where createddate >= '"+starttime+"' and createddate < '"+endtime+"' group by parentid order by cnt desc;";
						System.out.println(sql);
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						if(rs.last()){
							count = rs.getRow();
						}
					} catch (Exception ee) {
		//				System.err.println(ee.getMessage());
					} 	
					finally{
		//				try {
		//					if(st!=null) st.close();
		//					if(conn!=null) conn.close();
		//				} catch (SQLException e1) {
		//					e1.printStackTrace();
		//				} 	
					}
					return count;
				}
			    
			    public int count_commentsBymid(String mid, String starttime, String endtime){
					Connection conn = null;
			    	Statement st = null;
					int count=0;
					try {
						//获得链接
						 conn = this.getConnection();
						//创建Statement对象
						String sql = "select count(*)num from comments where  id= '"+mid+"' and createddate >= '"+starttime+"' and createddate < '"+endtime+"';";
						//System.out.println(sql);
						 st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						if(rs.next()){
							count = rs.getInt("num");
						}
					} catch (Exception ee) {
//						System.err.println(ee.getMessage());
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
			    
			    public int count_replayByParentid(String parentid, String starttime, String endtime){
					Connection conn = null;
			    	Statement st = null;
					int count=0;
					try {
						//获得链接
						 conn = this.getConnection();
						//创建Statement对象
						String sql = "select count(*)num from weibo where  parentid<>'"+parentid+"' and createddate >= '"+starttime+"' and createddate < '"+endtime+"';";
						//System.out.println(sql);
						 st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						if(rs.next()){
							count = rs.getInt("num");
						}
					} catch (Exception ee) {
//						System.err.println(ee.getMessage());
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
			    public ArrayList<Tempclass> selectpw_wordcounts_weibo(int startrow, String start,String end){
					ArrayList<Tempclass> al = new ArrayList<Tempclass>();
					Connection conn=null;
					Statement st=null;
					try{
						conn=this.getConnection();
						String sql="select wid,issuetime,count(wid)as cnt from weiboswords_temp where issuetime >='"+start+"' and issuetime <'"+end+"' group by wid order by wid desc;";
						System.out.println(sql);
						st=conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						int i=1;
						rs.relative(startrow);
						Tempclass temp1=new Tempclass();
						temp1.setWid(rs.getString("wid"));
						temp1.setCount(rs.getInt("cnt"));
						al.add(temp1);
						while (rs.next()){
							 Tempclass temp = new Tempclass();
							 temp.setWid(rs.getString("wid"));
							 temp.setCount(rs.getInt("cnt"));
							 al.add(temp);
						//	 if(i>2000) break;
							 i++;
					      }
				   }catch(Exception ee){
				   }finally{
					   try {
							if(st!=null) st.close();
							if(conn!=null) conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
					}
						
				   }
					return al;
				   
				   }
			    
			    
			    public int count_topicsbywords_weibo(String wid,String starttime,String endtime){
			    	Connection conn=null;
			    	Statement st=null;
			    	int count=0;
			    	int n=0;
			    	try{
			    		conn=this.getConnection();
						String sql = "select pid, wid, issuetime,topicID,word,count(topicID) as cnt from weiboswords_temp where wid = '"+wid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"' group by topicID";
					//	System.out.println(sql);
						st=conn.createStatement();
						ResultSet rs=st.executeQuery(sql);
						if(rs.last()){
							n=rs.getRow();
						}
						for(int i=1;i<=n;i++){
							rs.absolute(i);
							count+=rs.getInt("cnt");
						}
						//System.out.println(count);
			    	}catch(Exception ee){}
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
			    
			    public void addTempTable_weibo(String starttime,String endtime){
		        	  Connection conn=null;
		        	  Statement st=null;
		        	  try{
		        		  conn=this.getConnection();
		        		  String sql1="drop table if exists weiboswords_temp;";
		        		  String sql2="create table weiboswords_temp as select * from weiboswords where issuetime>='"+starttime+"' and issuetime<'"+endtime+"';";
		        		  String sql3="create index index_wid on weiboswords_temp(wid)";
		        		  st=conn.createStatement();
		        		  st.execute(sql1);
		        		  st.execute(sql2);
		        		  st.execute(sql3);
		        		  System.out.println(sql2);
		        	  }
		        	  catch(Exception ee){
		        		  System.err.println(ee.getMessage());
		        	  }
		        	  finally{
		        		  try{
		        			if(st!=null) st.close();
		  					if(conn!=null) conn.close();
		        		  }catch(SQLException e1){
		        			  e1.printStackTrace();
		        		  }
		        	  }
		          }
		        
			    public ArrayList<Tempclass> countunit_topicsbywords_weibo(String wid,String starttime, String endtime){
					Connection conn = null;
			    	Statement st = null;
					ArrayList<Tempclass> al= new ArrayList<Tempclass>();
					try {
						//获得链接
						 conn = this.getConnection();
						//创建Statement对象
						String sql = "select pid, wid, issuetime,topicID,word,count(topicID) as cnt from weiboswords_temp where wid = '"+wid+"' and issuetime >= '"+starttime+"' and issuetime < '"+endtime+"' group by topicID order by cnt desc";
						System.out.println(sql);
						st = conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						int i=0;
						int max = 0;
						while(rs.next()){
							Tempclass temp = new Tempclass();
							temp.setWid(rs.getString("wid"));
							temp.setTopicId(rs.getString("topicID"));
							temp.setCount(rs.getInt("cnt"));
							if(i==0) max = rs.getInt("cnt");
							temp.setMaxcount(max);
							al.add(temp);
							i++;
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
					return al;
				}
			    public void update_weiboswordsbyWidandTid(String wid,String topicId,double weight){
					Connection conn = null;
			    	Statement st = null;
					try {
						//获得链接
						 conn = this.getConnection();
						//创建Statement对象
						String sql = "update weiboswords_temp set weight='"+weight+"' where wid= '"+wid+"' and topicID = '"+topicId+"'";
						System.out.println(sql);
						st = conn.createStatement();
						//执行sql
						st.execute(sql);
					} catch (Exception ee) {
		//				System.err.println(ee.getMessage());
					} finally{
						try {
							if(st!=null) st.close();
							if(conn!=null) conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 	
					}
				}
		 
			    
	          /************************对回复的操作***************************************
	           * 
	           * @param args
	           */
	          /**
	           * 数据获取后添加weibo对象,添加一条记录
	           */
	          public void save_comments(Replys e){
	          	Connection conn = null;
	          	Statement st = null;
	      		try {
	      			//获得链接
	      			conn = this.getConnection();
	      			//创建Statement对象
	      			String sql = "INSERT INTO comments(mid, texts, source, createddate, author, id)values('"+e.getMid()+"','"+e.getTexts()+"','"+e.getSource()+"','"+MyUtil.toString(e.getCreateddate())+"','"+e.getAuthor()+"','"+e.getId()+"')";
	      			st = conn.createStatement();
//	      			System.out.println(sql);
	      			//执行sql
	      			st.execute(sql);
	      		} catch (Exception ee) {
//	      				System.err.println(ee.getMessage());
	      		}finally{
	      			try {
	      				if(st!=null) st.close();
	      			 //   if(conn!=null) conn.close();
	      			} catch (SQLException e1) {
	      				e1.printStackTrace();
	      			}
	      		} 	
	          }
	      	  
	        	  public static void main(String[] args) {
					MysqlConn conn=new MysqlConn();
					conn.Droptopics();
				}

				public int select_repostscountbymid(String id) {
					// TODO Auto-generated method stub
					int count = 0;
					Connection conn=null;
					Statement st=null;
					try{
						conn=this.getConnection();
						String sql="select repostscount from weibo where mid = '"+id+"'";
						System.out.println(sql);
						st=conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						rs.next();
						count = rs.getInt("repostscount");
				   }catch(Exception ee){
				   }finally{
					   try {
							if(st!=null) st.close();
							if(conn!=null) conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
					}
						
				   }
					return count;
				}

				
				public int select_commentscountbymid(String id) {
					// TODO Auto-generated method stub
					int count = 0;
					Connection conn=null;
					Statement st=null;
					try{
						conn=this.getConnection();
						String sql="select commentscount from weibo where mid = '"+id+"'";
						System.out.println(sql);
						st=conn.createStatement();
						ResultSet rs = st.executeQuery(sql);
						rs.next();
						count = rs.getInt("commentscount");
				   }catch(Exception ee){
				   }finally{
					   try {
							if(st!=null) st.close();
							if(conn!=null) conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
					}
						
				   }
					return count;
				}
				

	}
	
	
	          
	          
		  
