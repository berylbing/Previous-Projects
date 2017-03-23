package com.ht706.componentLibrary.forum.bean.abstractBean;

import java.util.Date;

/**
 * AbstractForumBulletin entity provides the base persistence definition of the
 * ForumBulletin entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractForumBulletin implements java.io.Serializable {

	// Fields

	private Integer bulletinid;
	private String title;
	private String content;
	private Integer userid;
	private String username;
	private Date joindate;
	private Integer bulletinorder;

	// Constructors

	/** default constructor */
	public AbstractForumBulletin() {
	}

	/** full constructor */
	public AbstractForumBulletin(Integer bulletinid, String title,
			String content, Integer userid, String username, Date joindate,
			Integer bulletinorder) {
		this.bulletinid = bulletinid;
		this.title = title;
		this.content = content;
		this.userid = userid;
		this.username = username;
		this.joindate = joindate;
		this.bulletinorder = bulletinorder;
	}

	// Property accessors

	public Integer getBulletinid() {
		return this.bulletinid;
	}

	public void setBulletinid(Integer bulletinid) {
		this.bulletinid = bulletinid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getJoindate() {
		return this.joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public Integer getBulletinorder() {
		return this.bulletinorder;
	}

	public void setBulletinorder(Integer bulletinorder) {
		this.bulletinorder = bulletinorder;
	}

}