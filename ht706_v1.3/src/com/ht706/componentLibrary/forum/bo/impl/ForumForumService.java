package com.ht706.componentLibrary.forum.bo.impl;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.dao.impl.ForumForumDAOImpl;

public class ForumForumService implements IForumForumService {
	private ForumForumDAOImpl forumForumDAO;
	public ForumForumDAOImpl getForumForumDAO() {
		return forumForumDAO;
	}
	public void setForumForumDAO(ForumForumDAOImpl forumForumDAO) {
		this.forumForumDAO = forumForumDAO;
	}
	public List<ForumForum> getForumFroumList() {
		return forumForumDAO.findAll();
	}
	public ForumForum getForumForumByForumId(int id){
		return forumForumDAO.findById(id);
	}

	
	public void createForum(ForumForum ff) {
		// TODO Auto-generated method stub
		this.forumForumDAO.save(ff);
	}
	
	public void modifyForum(ForumForum ff) {
		// TODO Auto-generated method stub
		this.forumForumDAO.save(ff);
	}
	
	public void deleteForum(ForumForum ff) {
		// TODO Auto-generated method stub
		this.forumForumDAO.delete(ff);
	}

}
