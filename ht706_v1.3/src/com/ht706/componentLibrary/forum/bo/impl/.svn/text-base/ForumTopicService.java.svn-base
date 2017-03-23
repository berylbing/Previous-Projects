package com.ht706.componentLibrary.forum.bo.impl;

import java.util.List;
import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;
import com.ht706.componentLibrary.forum.dao.IForumForumDAO;
import com.ht706.componentLibrary.forum.dao.IForumThreadDAO;
import com.ht706.componentLibrary.forum.dao.IForumTopicDAO;

public class ForumTopicService implements IForumTopicService {
	private IForumTopicDAO forumTopicDAO;	
	private IForumThreadDAO forumThreadDAO;
	private IForumForumDAO forumForumDAO;
	public IForumTopicDAO getForumTopicDAO() {
		return forumTopicDAO;
	}
	public void setForumTopicDAO(IForumTopicDAO forumTopicDAO) {
		this.forumTopicDAO = forumTopicDAO;
	}
	public List<ForumTopic> getForumTopicListByForumId(int forumId) {
		return forumTopicDAO.findByForumid(forumId);
	}
	public ForumTopic getForumTopicByTopicId(int Id) {
		return forumTopicDAO.findById(Id);
	}
	public void modifyHitNum(int topicId) {
		ForumTopic forumTopic = this.forumTopicDAO.findById(topicId);
		forumTopic.setHitnum(forumTopic.getHitnum()+1);
		this.forumTopicDAO.save(forumTopic);
	}
	public void createTopic(ForumTopic forumTopic) {
		int n = 0;
		this.forumTopicDAO.save(forumTopic);
		ForumForum ff = forumForumDAO.findById(forumTopic.getForumid());
		List<ForumTopic> topicList = forumTopicDAO.findByForumid(ff.getForumid());
		n = topicList.size();
		ff.setTopicid(forumTopic.getTopicid());
		ff.setTopicname(forumTopic.getTopicname());
		ff.setPosttime(forumTopic.getPosttime());
		ff.setTopicnum(n);
		this.forumForumDAO.save(ff);
	}
	public void deleteTopic(ForumTopic forumTopic){
		int n=0;
		List<ForumThread> listThread = this.forumThreadDAO.findByTopicid(forumTopic.getTopicid());
		
		for(ForumThread ele: listThread){
			forumThreadDAO.delete(ele);
		}
		forumTopicDAO.delete(forumTopic);
		ForumForum ff = forumForumDAO.findById(forumTopic.getForumid());
		List<ForumTopic> topa = forumTopicDAO.findByForumid(ff.getForumid());
		for(ForumTopic ele : topa){
			n+=forumThreadDAO.findByTopicid(ele.getTopicid()).size();
		}
		ff.setPostnum(n);
		ff.setTopicnum(topa.size());
		
	}
	public void setForumThreadDAO(IForumThreadDAO forumThreadDAO) {
		this.forumThreadDAO = forumThreadDAO;
	}
	public IForumThreadDAO getForumThreadDAO() {
		return forumThreadDAO;
	}
	public void setForumForumDAO(IForumForumDAO forumForumDAO) {
		this.forumForumDAO = forumForumDAO;
	}
	public IForumForumDAO getForumForumDAO() {
		return forumForumDAO;
	}
	
}
