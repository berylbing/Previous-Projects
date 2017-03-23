package com.ht706.componentLibrary.forum.bo.impl;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;
import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.bo.IForumBulletinService;
import com.ht706.componentLibrary.forum.dao.IForumBulletinDAO;

public class ForumBulletinService implements IForumBulletinService {
	private IForumBulletinDAO forumBulletinDAO;
	public IForumBulletinDAO getForumBulletinDAO() {
		return forumBulletinDAO;
	}
	public void setForumBulletinDAO(IForumBulletinDAO forumBulletinDAO) {
		this.forumBulletinDAO = forumBulletinDAO;
	}
	public List<ForumBulletin> getForumBulletinList() {
		return forumBulletinDAO.findAll();
	}
	public void createBulletin(ForumBulletin forumBulletin) {
		forumBulletinDAO.save(forumBulletin);
		
	}
	public void deleteBulletinByBulletinId(ForumBulletin forumBulletin) {
		forumBulletinDAO.delete(forumBulletin);
	}
	public ForumBulletin getFuromBulletinByBulletinId(int bulletinId) {
		return forumBulletinDAO.findById(bulletinId);
	}

}
