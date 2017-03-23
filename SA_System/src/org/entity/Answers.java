package org.entity;

import java.sql.Timestamp;

public class Answers {
	private String aid ;
	private String qid ;
	private String content;
	private String source;
	private Timestamp searchtime;
	private String url;
	private double weight;
	private String type;
	private String others;
	
	public Answers(){}
	
	
	public String getAid() {
		return aid;
	}


	public void setAid(String aid) {
		this.aid = aid;
	}


	public String getQid() {
		return qid;
	}


	public void setQid(String qid) {
		this.qid = qid;
	}


	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Timestamp getSearchtime() {
		return searchtime;
	}
	public void setSearchtime(Timestamp searchtime) {
		this.searchtime = searchtime;
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}

}
