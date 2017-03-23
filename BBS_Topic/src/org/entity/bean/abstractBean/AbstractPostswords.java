package org.entity.bean.abstractBean;
import java.sql.Timestamp;
/**
 * AbstractPostswords entity provides the base persistence definition of the Postswords entity.
 * @author huangli
 */
public abstract class AbstractPostswords implements java.io.Serializable {

	private Integer psid;
	private Integer pid;
	private String wid;
	private Double weight;
	private Timestamp segtime;
	private String position;
	private String word;
	private String topicID;
	private Integer flag;
	private Timestamp issuetime;
	
	//������
	public AbstractPostswords(){
	}
	public AbstractPostswords(Integer pid,String wid,Double weight,
			Timestamp segtime, String position, String word, String topicID, Integer flag, Timestamp issuetime){
		this.pid=pid;
		this.wid=wid;
		this.weight=weight;
		this.segtime=segtime;
		this.position=position;
		this.word=word;
		this.topicID=topicID;
		this.flag=flag;
		this.issuetime=issuetime;
	}
	public void setPsid(Integer psid){
		this.psid=psid;
	}
	public Integer getPsid(){
		return psid;
	}
	public void setPid(Integer pid){
		this.pid=pid;
	}
	public Integer getPid(){
		return pid;
	}
	public void setWid(String wid){
		this.wid=wid;
	}
	public String getWid(){
		return wid;
	}
	public void setWeight(Double weight){
		this.weight=weight;
	}
	public Double getWeight(){
		return weight;
	}
	public void setSegtime(Timestamp segtime){
		this.segtime=segtime;
	}
	public Timestamp getSegtime(){
		return segtime;
	}
	public void setPosition(String position){
		this.position=position;
	}
	public String getPosition(){
		return position;
	}
	public void setWord(String word){
		this.word=word;
	}
	public String getWord(){
		return word;
	}
	public void setTopicID(String topicID){
		this.topicID=topicID;
	}
	public String getTopicID(){
		return topicID;
	}
	public void setFlag(Integer flag){
		this.flag=flag;
	}
	public Integer getFlag(){
		return flag;
	}
	public void setIssuetime(Timestamp issuetime){
		this.issuetime=issuetime;
	}
	public Timestamp getIssuetime(){
		return issuetime;
	}
}
