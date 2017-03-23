package com.ht706.componentLibrary.forum.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.forum.bean.abstractBean.AbstractForumTopic;

/**
 * ForumTopic entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ForumTopic extends AbstractForumTopic implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ForumTopic() {
	}

	/** full constructor */
	public ForumTopic(Integer topicid, Integer forumid, String topicname,
			String typeid, String username, Integer userid, Date posttime,
			String replyname, Date replytime, Integer hitnum, Integer replynum,
			String besttype, String toptype, String islock, String ishighlight,
			String color, String bold, String italic, String auditstatus,
			String managestatus, String gradestatus) {
		super(topicid, forumid, topicname, typeid, username, userid, posttime,
				replyname, replytime, hitnum, replynum, besttype, toptype,
				islock, ishighlight, color, bold, italic, auditstatus,
				managestatus, gradestatus);
	}

}
