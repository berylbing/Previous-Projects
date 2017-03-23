package com.ht706.componentLibrary.forum.bean.abstractBean;

import java.util.Date;

/**
 * AbstractForumForum entity provides the base persistence definition of the
 * ForumForum entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractForumForum implements java.io.Serializable {

	// Fields

	private Integer forumid;
	private String ischild;
	private Integer belongid;
	private String forumname;
	private String forumread;
	private String color;
	private Integer topicnum;
	private Integer postnum;
	private Integer todaynum;
	private Integer forumorder;
	private String showsub;
	private String topicname;
	private String username;
	private Date posttime;
	private Integer topicid;
	private Integer userid;
	private String rule;
	private String isshow;
	private String keyword;
	private String auditpublish;

	// Constructors

	/** default constructor */
	public AbstractForumForum() {
	}

	/** minimal constructor */
	public AbstractForumForum(Integer forumid, String ischild,
			Integer belongid, String forumname, String forumread, String color,
			Integer topicnum, Integer postnum, Integer todaynum,
			Integer forumorder, String showsub, String isshow, String keyword,
			String auditpublish) {
		this.forumid = forumid;
		this.ischild = ischild;
		this.belongid = belongid;
		this.forumname = forumname;
		this.forumread = forumread;
		this.color = color;
		this.topicnum = topicnum;
		this.postnum = postnum;
		this.todaynum = todaynum;
		this.forumorder = forumorder;
		this.showsub = showsub;
		this.isshow = isshow;
		this.keyword = keyword;
		this.auditpublish = auditpublish;
	}

	/** full constructor */
	public AbstractForumForum(Integer forumid, String ischild,
			Integer belongid, String forumname, String forumread, String color,
			Integer topicnum, Integer postnum, Integer todaynum,
			Integer forumorder, String showsub, String topicname,
			String username, Date posttime, Integer topicid, Integer userid,
			String rule, String isshow, String keyword, String auditpublish) {
		this.forumid = forumid;
		this.ischild = ischild;
		this.belongid = belongid;
		this.forumname = forumname;
		this.forumread = forumread;
		this.color = color;
		this.topicnum = topicnum;
		this.postnum = postnum;
		this.todaynum = todaynum;
		this.forumorder = forumorder;
		this.showsub = showsub;
		this.topicname = topicname;
		this.username = username;
		this.posttime = posttime;
		this.topicid = topicid;
		this.userid = userid;
		this.rule = rule;
		this.isshow = isshow;
		this.keyword = keyword;
		this.auditpublish = auditpublish;
	}

	// Property accessors

	public Integer getForumid() {
		return this.forumid;
	}

	public void setForumid(Integer forumid) {
		this.forumid = forumid;
	}

	public String getIschild() {
		return this.ischild;
	}

	public void setIschild(String ischild) {
		this.ischild = ischild;
	}

	public Integer getBelongid() {
		return this.belongid;
	}

	public void setBelongid(Integer belongid) {
		this.belongid = belongid;
	}

	public String getForumname() {
		return this.forumname;
	}

	public void setForumname(String forumname) {
		this.forumname = forumname;
	}

	public String getForumread() {
		return this.forumread;
	}

	public void setForumread(String forumread) {
		this.forumread = forumread;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getTopicnum() {
		return this.topicnum;
	}

	public void setTopicnum(Integer topicnum) {
		this.topicnum = topicnum;
	}

	public Integer getPostnum() {
		return this.postnum;
	}

	public void setPostnum(Integer postnum) {
		this.postnum = postnum;
	}

	public Integer getTodaynum() {
		return this.todaynum;
	}

	public void setTodaynum(Integer todaynum) {
		this.todaynum = todaynum;
	}

	public Integer getForumorder() {
		return this.forumorder;
	}

	public void setForumorder(Integer forumorder) {
		this.forumorder = forumorder;
	}

	public String getShowsub() {
		return this.showsub;
	}

	public void setShowsub(String showsub) {
		this.showsub = showsub;
	}

	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getPosttime() {
		return this.posttime;
	}

	public void setPosttime(Date posttime) {
		this.posttime = posttime;
	}

	public Integer getTopicid() {
		return this.topicid;
	}

	public void setTopicid(Integer topicid) {
		this.topicid = topicid;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getIsshow() {
		return this.isshow;
	}

	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAuditpublish() {
		return this.auditpublish;
	}

	public void setAuditpublish(String auditpublish) {
		this.auditpublish = auditpublish;
	}

}