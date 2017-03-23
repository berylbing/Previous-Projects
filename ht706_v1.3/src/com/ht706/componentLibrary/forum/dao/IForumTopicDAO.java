package com.ht706.componentLibrary.forum.dao;

import java.util.List;

import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;

public interface IForumTopicDAO {
	public void save(ForumTopic transientInstance) ;
	public void delete(ForumTopic persistentInstance) ;
	public ForumTopic findById(java.lang.Integer id) ;
	public List<ForumTopic> findByExample(ForumTopic instance);
	public List<ForumTopic> findByProperty(String propertyName, Object value);
	public List<ForumTopic> findByForumid(Object forumid);
	public List<ForumTopic> findByTopicname(Object topicname) ;
	public List<ForumTopic> findByTypeid(Object typeid);
	public List<ForumTopic> findByUsername(Object username);
	public List<ForumTopic> findByUserid(Object userid);
	public List<ForumTopic> findByReplyname(Object replyname);
	public List<ForumTopic> findByHitnum(Object hitnum);
	public List<ForumTopic> findByReplynum(Object replynum);
	public List<ForumTopic> findByBesttype(Object besttype);
	public List<ForumTopic> findByToptype(Object toptype);
	public List<ForumTopic> findByIslock(Object islock);
	public List<ForumTopic> findByIshighlight(Object ishighlight);
	public List<ForumTopic> findByColor(Object color);
	public List<ForumTopic> findByBold(Object bold);
	public List<ForumTopic> findByItalic(Object italic);
	public List<ForumTopic> findByAuditstatus(Object auditstatus) ;
	public List<ForumTopic> findByManagestatus(Object managestatus);
	public List<ForumTopic> findByGradestatus(Object gradestatus);
	public List<ForumTopic> findAll();
	public ForumTopic merge(ForumTopic detachedInstance);
	public void attachDirty(ForumTopic instance);
	public void attachClean(ForumTopic instance) ;
}
