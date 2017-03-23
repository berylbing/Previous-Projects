package com.ht706.componentLibrary.forum.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.forum.bean.abstractBean.AbstractForumForum;

/**
 * ForumForum entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ForumForum extends AbstractForumForum implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ForumForum() {
	}

	/** minimal constructor */
	public ForumForum(Integer forumid, String ischild, Integer belongid,
			String forumname, String forumread, String color, Integer topicnum,
			Integer postnum, Integer todaynum, Integer forumorder,
			String showsub, String isshow, String keyword, String auditpublish) {
		super(forumid, ischild, belongid, forumname, forumread, color,
				topicnum, postnum, todaynum, forumorder, showsub, isshow,
				keyword, auditpublish);
	}

	/** full constructor */
	public ForumForum(Integer forumid, String ischild, Integer belongid,
			String forumname, String forumread, String color, Integer topicnum,
			Integer postnum, Integer todaynum, Integer forumorder,
			String showsub, String topicname, String username, Date posttime,
			Integer topicid, Integer userid, String rule, String isshow,
			String keyword, String auditpublish) {
		super(forumid, ischild, belongid, forumname, forumread, color,
				topicnum, postnum, todaynum, forumorder, showsub, topicname,
				username, posttime, topicid, userid, rule, isshow, keyword,
				auditpublish);
	}

}
