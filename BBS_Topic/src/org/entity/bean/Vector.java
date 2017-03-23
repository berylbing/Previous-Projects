package org.entity.bean;
import org.entity.bean.abstractBean.AbstractVector;
import java.sql.Timestamp;

public class Vector extends AbstractVector implements java.io.Serializable{
	public Vector(){}
	public Vector(String topicID,String vector,double similarity,Timestamp issuetime,int flag,int slot){
		super(topicID,vector,similarity,issuetime,flag,slot);
	}
}
