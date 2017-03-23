package org.entity.bean.abstractBean;

import java.sql.Timestamp;

public class AbstractWeiboswords_seg implements java.io.Serializable{
	private Integer psid;
	private Integer pid;
	private String wid;
	private Double weight;
	private Timestamp segtime;
	private String position;
	//数据库中无此字段
	private String sPos;
	private String words;
	private Timestamp issuetime;
	private String topicID;
	
	//Constructor 
	/** default constructor*/
	public AbstractWeiboswords_seg(){
		
	}
	public AbstractWeiboswords_seg(Integer pid,String wid,Double weight,Timestamp segtime,
			String position,String sPos,String words,Timestamp issuetime,String topicID){
		this.pid=pid;
		this.wid=wid;
		this.weight=weight;
		this.segtime=segtime;
		this.position=position;
		this.sPos=sPos;
		this.words=words;
		this.issuetime=issuetime;
		this.topicID=topicID;
	}
	
	public Integer getPsid(){
		return this.psid;
	}
	public void setPsid(Integer psid){
		this.psid=psid;
	}

	public String getSPos(){
		return sPos;
	}
	public void setSPos(String sPos){
		this.sPos=sPos;
	}
	public String getWords(){
		return words;
	}
	public void setWords(String words){
		this.words=words;
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPid(Integer pid){
		this.pid=pid;
	}
	public String getWid(){
		return this.wid;
	}
	public void setWid(String wid){
		this.wid=wid;
	}
	public Double getWeight(){
		return this.weight;
	}
	public void setWeight(Double weight){
		this.weight=weight; 
	}
	public Timestamp getSegtime(){
		return this.segtime;
	}
	public void setSegtime(Timestamp segtime){
		this.segtime=segtime;
	}
	public String getPosition(){
		return this.position;
	}
	public void setPosition(String position){
		this.position=position;
	}
	public Timestamp getIssuetime(){
		return issuetime;
	}
	public void setIssuetime(Timestamp issuetime){
		this.issuetime=issuetime;
	}
	public String getTopicID(){
		return topicID;
	}
	public void setTopicID(String topicID){
		this.topicID=topicID;
	}
	
}
