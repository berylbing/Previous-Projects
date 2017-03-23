package com.ht706.componentLibrary.forum.bo.impl;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;
import com.ht706.componentLibrary.forum.bo.IForumThreadService;
import com.ht706.componentLibrary.forum.dao.IForumForumDAO;
import com.ht706.componentLibrary.forum.dao.IForumThreadDAO;
import com.ht706.componentLibrary.forum.dao.IForumTopicDAO;
public class ForumThreadService implements IForumThreadService {
	private IForumForumDAO	forumForumDAO;
	private IForumTopicDAO forumTopicDAO;
	private IForumThreadDAO forumThreadDAO;
	public IForumTopicDAO getForumTopicDAO() {
		return forumTopicDAO;
	}
	public void setForumTopicDAO(IForumTopicDAO forumTopicDAO) {
		this.forumTopicDAO = forumTopicDAO;
	}
	public List<ForumThread> getForumThreadListByTopicId(int topicId) {
		return forumThreadDAO.findByTopicid(topicId);
	}
	public void setForumThreadDAO(IForumThreadDAO forumThreadDAO) {
		this.forumThreadDAO = forumThreadDAO;
	}
	public IForumThreadDAO getForumThreadDAO() {
		return forumThreadDAO;
	}
	public void createThread(ForumThread forumThread) {
		forumThreadDAO.save(forumThread);
		ForumTopic topic = forumTopicDAO.findById(forumThread.getTopicid());
		List<ForumThread> threadList= forumThreadDAO.findByTopicid(forumThread.getTopicid());
		topic.setReplynum(threadList.size()-1);
		topic.setReplyname(forumThread.getUsername());
		topic.setReplytime(forumThread.getPosttime());
		forumTopicDAO.save(topic);
		ForumForum ff = forumForumDAO.findById(topic.getForumid());
		int n=0;
		List<ForumTopic> topicList = forumTopicDAO.findByForumid(ff.getForumid());
		for(ForumTopic ele :  topicList ) {
			threadList = forumThreadDAO.findByTopicid(ele.getTopicid());
			n+=threadList.size();
		}
		ff.setPostnum(n);
	}
	public void setForumForumDAO(IForumForumDAO forumForumDAO) {
		this.forumForumDAO = forumForumDAO;
	}
	public IForumForumDAO getForumForumDAO() {
		return forumForumDAO;
	}

}
