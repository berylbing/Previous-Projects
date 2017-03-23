package org.entity.bean.abstractBean;
import java.sql.Timestamp;//һ���� java.util.Date ���йص��ݰ�װ�� 
/**
 * AbstractPosts entity provides the base persistence definition of the Posts entity
 * @author huangli
 */
/*
 * java.io.Serializableʵ�ֽӿڵ����л�
 */
public abstract class AbstractPosts implements java.io.Serializable {
	private Integer pid;
	private String subId;
	private String topicId;
	private String url;
	private String board;
	private String title;
	private String authorId;
	private String authorname;
	private String content;
	private Timestamp issuetime;
	private Timestamp querytime;
	private Integer flag;
	
	//����AbstractPosts�Ĺ����������ڱ��������
	public AbstractPosts(){}
	public AbstractPosts(String subId, String topicId, String url,
			String board, String title, String authorId, String authorname,
			String content, Timestamp issuetime, Timestamp querytime,Integer flag){
		this.subId=subId;
		this.topicId=topicId;
		this.url=url;
		this.board=board;
		this.title=title;
		this.authorId=authorId;
		this.authorname=authorname;
		this.content=content;
		this.issuetime=issuetime;
		this.querytime=querytime;
		this.flag=flag;
	}
	/*
	 * �ڷ�װ����ʱ,��getter���Դ���ݿ���ȡ�����,setter���Դ�ҳ���еõ���Ӧ�����
	 */
	public void setPid(Integer pid){
		this.pid=pid;
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setSubId(String subId)
	{
		this.subId=subId;
	}
	public String getSubId()
	{
		return this.subId;
	}
	public void setTopicId(String topicId)
	{
		this.topicId=topicId;
	}
	public String getTopicId()
	{
		return this.topicId;
	}
	public void setUrl(String url)
	{
		this.url=url;
	}
	public String getUrl()
	{
		return this.url;
	}
	public void setBoard(String board)
	{
		this.board=board;
	}
	public String getBoard()
	{
		return this.board;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setAuthorId(String authorId)
	{
		this.authorId=authorId;
	}
	public String getAuthorId()
	{
		return this.authorId;
	}
	public void setAuthorname(String authorname)
	{
		this.authorname=authorname;
	}
	public String getAuthorname()
	{
		return this.authorname;
	}
	public void setContent(String content)
	{
		this.content=content;
	}
	public String getContent()
	{
		return this.content;
	}
	public void setIssuetime(Timestamp issuetime)
	{
		this.issuetime=issuetime;
	}
	public Timestamp getIssuetime()
	{
		return this.issuetime;
	}
	public void setQuerytime(Timestamp querytime)
	{
		this.querytime=querytime;
	}
	public Timestamp getQuerytime()
	{
		return this.querytime;
	}
	public void setFlag(Integer flag)
	{
		this.flag=flag;
	}
	public Integer getFlag()
	{
		return this.flag;
	}
}

