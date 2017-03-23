package org.entity.bean.abstractBean;
import java.sql.Timestamp;

public abstract class AbstractVector implements java.io.Serializable{
	private String topicID;
	private double similarity;
	private String vector;
	Timestamp issuetime;
	int flag;
	int slot;
	public AbstractVector(){}
	public AbstractVector(String topicID,String vector,double similarity,Timestamp issuetime,int flag,int slot){
		this.topicID=topicID;
		this.vector=vector;
		this.similarity=similarity;
		this.issuetime=issuetime;
		this.flag=flag;
		this.slot=slot;
	}
	public void setTopicID(String topicID){
		this.topicID=topicID;
	}
	public String getTopicID(){
		return topicID;
	}  
	public void setVector(String vector){
		this.vector=vector;
	}
	public String getVector(){
		return vector;
	} 
	public void setSimilarity(double similarity){
		this.similarity=similarity;
	}
	public double getSimilarity(){
		return similarity;
	} 
	public void setIssuetime(Timestamp issuetime){
		this.issuetime=issuetime;
	}
	public Timestamp getIssuetime(){
		return issuetime;
	}
	public void setFlag(int flag){
		this.flag=flag;
	}
	public int getFlag(){
		return flag;
	}
	public void setSlot(int slot){
		this.slot=slot;
	}
	public int getSlot(){
		return slot;
	}
	
}
