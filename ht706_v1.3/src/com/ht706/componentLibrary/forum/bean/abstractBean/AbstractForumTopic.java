package com.ht706.componentLibrary.forum.bean.abstractBean;

import java.util.Date;

/**
 * AbstractForumTopic entity provides the base persistence definition of the
 * ForumTopic entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractForumTopic implements java.io.Serializable {

	// Fields

	private Integer topicid;
	private Integer forumid;
	private String topicname;
	private String typeid;
	private String username;
	private Integer userid;
	private Date posttime;
	private String replyname;
	private Date replytime;
	private Integer hitnum;
	private Integer replynum;
	private String besttype;
	private String toptype;
	private String islock;
	private String ishighlight;
	private String color;
	private String bold;
	private String italic;
	private String auditstatus;
	private String managestatus;
	private String gradestatus;

	// Constructors

	/** default constructor */
	public AbstractForumTopic() {
	}

	/** full constructor */
	public AbstractForumTopic(Integer topicid, Integer forumid,
			String topicname, String typeid, String username, Integer userid,
			Date posttime, String replyname, Date replytime, Integer hitnum,
			Integer replynum, String besttype, String toptype, String islock,
			String ishighlight, String color, String bold, String italic,
			String auditstatus, String managestatus, String gradestatus) {
		this.topicid = topicid;
		this.forumid = forumid;
		this.topicname = topicname;
		this.typeid = typeid;
		this.username = username;
		this.userid = userid;
		this.posttime = posttime;
		this.replyname = replyname;
		this.replytime = replytime;
		this.hitnum = hitnum;
		this.replynum = replynum;
		this.besttype = besttype;
		this.toptype = toptype;
		this.islock = islock;
		this.ishighlight = ishighlight;
		this.color = color;
		this.bold = bold;
		this.italic = italic;
		this.auditstatus = auditstatus;
		this.managestatus = managestatus;
		this.gradestatus = gradestatus;
	}

	// Property accessors

	public Integer getTopicid() {
		return this.topicid;
	}

	public void setTopicid(Integer topicid) {
		this.topicid = topicid;
	}

	public Integer getForumid() {
		return this.forumid;
	}

	public void setForumid(Integer forumid) {
		this.forumid = forumid;
	}

	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getTypeid() {
		return this.typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getPosttime() {
		return this.posttime;
	}

	public void setPosttime(Date posttime) {
		this.posttime = posttime;
	}

	public String getReplyname() {
		return this.replyname;
	}

	public void setReplyname(String replyname) {
		this.replyname = replyname;
	}

	public Date getReplytime() {
		return this.replytime;
	}

	public void setReplytime(Date replytime) {
		this.replytime = replytime;
	}

	public Integer getHitnum() {
		return this.hitnum;
	}

	public void setHitnum(Integer hitnum) {
		this.hitnum = hitnum;
	}

	public Integer getReplynum() {
		return this.replynum;
	}

	public void setReplynum(Integer replynum) {
		this.replynum = replynum;
	}

	public String getBesttype() {
		return this.besttype;
	}

	public void setBesttype(String besttype) {
		this.besttype = besttype;
	}

	public String getToptype() {
		return this.toptype;
	}

	public void setToptype(String toptype) {
		this.toptype = toptype;
	}

	public String getIslock() {
		return this.islock;
	}

	public void setIslock(String islock) {
		this.islock = islock;
	}

	public String getIshighlight() {
		return this.ishighlight;
	}

	public void setIshighlight(String ishighlight) {
		this.ishighlight = ishighlight;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBold() {
		return this.bold;
	}

	public void setBold(String bold) {
		this.bold = bold;
	}

	public String getItalic() {
		return this.italic;
	}

	public void setItalic(String italic) {
		this.italic = italic;
	}

	public String getAuditstatus() {
		return this.auditstatus;
	}

	public void setAuditstatus(String auditstatus) {
		this.auditstatus = auditstatus;
	}

	public String getManagestatus() {
		return this.managestatus;
	}

	public void setManagestatus(String managestatus) {
		this.managestatus = managestatus;
	}

	public String getGradestatus() {
		return this.gradestatus;
	}

	public void setGradestatus(String gradestatus) {
		this.gradestatus = gradestatus;
	}

}