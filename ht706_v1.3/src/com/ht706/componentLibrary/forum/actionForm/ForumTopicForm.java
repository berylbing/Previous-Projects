package com.ht706.componentLibrary.forum.actionForm;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;

public class ForumTopicForm extends ActionForm {
	private ForumForum forumForum;
	private ForumTopic forumTopic; 
	private List<ForumThread> forumThreadList;
	public void setForumTopic(ForumTopic forumTopic) {
		this.forumTopic = forumTopic;
	}
	public ForumTopic getForumTopic() {
		return forumTopic;
	}
	public void setForumThreadList(List<ForumThread> forumThreadList) {
		this.forumThreadList = forumThreadList;
	}
	public List<ForumThread> getForumThreadList() {
		return forumThreadList;
	}
	public void setForumForum(ForumForum forumForum) {
		this.forumForum = forumForum;
	}
	public ForumForum getForumForum() {
		return forumForum;
	}


}
