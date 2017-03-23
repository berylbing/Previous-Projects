package com.ht706.componentLibrary.forum.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.forum.bean.abstractBean.AbstractForumThread;

/**
 * ForumThread entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ForumThread extends AbstractForumThread implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ForumThread() {
	}

	/** full constructor */
	public ForumThread(Integer threadid, Integer topicid, Integer userid,
			String username, Date posttime, String content, String postip,
			String auditstatus) {
		super(threadid, topicid, userid, username, posttime, content, postip,
				auditstatus);
	}

}
