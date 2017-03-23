package org.entity.other;

public class Tempclass {
	private String wid;
	private String topicId;
	private Integer count;
	private Integer maxcount;
	private String parentid;
	public void setWid(String wid){
		this.wid=wid;
	}
	public String getWid(){
		return wid;
	}
	public void setTopicId(String topicId){
		this.topicId=topicId;
	}
	public String getTopicId(){
		return topicId;
	}
	public void setCount(Integer count){
		this.count=count;
	}
	public Integer getCount(){
		return count;
	}
	public void setMaxcount(Integer maxcount){
		this.maxcount=maxcount;
	}
	public Integer getMaxcount(){
		return maxcount;
	}
	public void setParentid(String parentid){
		this.parentid=parentid;
	}
	public String getParentid(){
		return parentid;
	}
}
