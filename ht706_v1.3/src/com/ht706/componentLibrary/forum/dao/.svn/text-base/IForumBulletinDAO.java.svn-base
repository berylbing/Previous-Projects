package com.ht706.componentLibrary.forum.dao;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;

public interface IForumBulletinDAO {
	public void save(ForumBulletin transientInstance) ;
	public void delete(ForumBulletin persistentInstance) ;
	public ForumBulletin findById(java.lang.Integer id);
	public List<ForumBulletin> findByExample(ForumBulletin instance);
	public List<ForumBulletin> findByProperty(String propertyName, Object value) ;
	public List<ForumBulletin> findByTitle(Object title);
	public List<ForumBulletin> findByContent(Object content);
	public List<ForumBulletin> findByUserid(Object userid);
	public List<ForumBulletin> findByUsername(Object username) ;
	public List<ForumBulletin> findByBulletinorder(Object bulletinorder) ;
	public List<ForumBulletin> findAll();
	public ForumBulletin merge(ForumBulletin detachedInstance);
	public void attachDirty(ForumBulletin instance);
	public void attachClean(ForumBulletin instance);
}
