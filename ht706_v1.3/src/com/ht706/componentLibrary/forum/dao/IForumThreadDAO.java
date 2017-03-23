package com.ht706.componentLibrary.forum.dao;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;

public interface IForumThreadDAO {
	public void save(ForumThread transientInstance);
	public void delete(ForumThread persistentInstance) ;
	public ForumThread findById(java.lang.Integer id);
	public List<ForumThread> findByExample(ForumThread instance) ;
	public List<ForumThread> findByProperty(String propertyName, Object value);
	public List<ForumThread> findByTopicid(Object topicid);
	public List<ForumThread> findByUserid(Object userid);
	public List<ForumThread> findByUsername(Object username);
	public List<ForumThread>  findByContent(Object content);
	public List<ForumThread> findByPostip(Object postip);
	public List<ForumThread> findByAuditstatus(Object auditstatus);
	public List<ForumThread> findAll() ;
	public ForumThread merge(ForumThread detachedInstance);
	public void attachDirty(ForumThread instance);
	public void attachClean(ForumThread instance);
}
