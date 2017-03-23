package com.ht706.componentLibrary.forum.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.dao.IForumThreadDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * ForumThread entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.forum.bean.hbm.ForumThread
 * @author MyEclipse Persistence Tools
 */

public class ForumThreadDAOImpl extends HibernateDaoSupport implements IForumThreadDAO{
	private static final Log log = LogFactory.getLog(ForumThreadDAOImpl.class);
	// property constants
	public static final String TOPICID = "topicid";
	public static final String USERID = "userid";
	public static final String USERNAME = "username";
	public static final String CONTENT = "content";
	public static final String POSTIP = "postip";
	public static final String AUDITSTATUS = "auditstatus";

	public void save(ForumThread transientInstance) {
		log.debug("saving ForumThread instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ForumThread persistentInstance) {
		log.debug("deleting ForumThread instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ForumThread findById(java.lang.Integer id) {
		log.debug("getting ForumThread instance with id: " + id);
		try {
			ForumThread instance = (ForumThread) getSession()
					.get(
							"com.ht706.componentLibrary.forum.bean.hbm.ForumThread",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ForumThread> findByExample(ForumThread instance) {
		log.debug("finding ForumThread instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumThread")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<ForumThread> findByProperty(String propertyName, Object value) {
		log.debug("finding ForumThread instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ForumThread as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ForumThread> findByTopicid(Object topicid) {
//		return findByProperty(TOPICID, topicid);
		try {
			String queryString = "from ForumThread as model where model.topicid = ? order by model.threadid";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, topicid);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ForumThread> findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List<ForumThread> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<ForumThread>  findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<ForumThread> findByPostip(Object postip) {
		return findByProperty(POSTIP, postip);
	}

	public List<ForumThread> findByAuditstatus(Object auditstatus) {
		return findByProperty(AUDITSTATUS, auditstatus);
	}

	public List<ForumThread> findAll() {
		log.debug("finding all ForumThread instances");
		try {
			String queryString = "from ForumThread";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ForumThread merge(ForumThread detachedInstance) {
		log.debug("merging ForumThread instance");
		try {
			ForumThread result = (ForumThread) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ForumThread instance) {
		log.debug("attaching dirty ForumThread instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ForumThread instance) {
		log.debug("attaching clean ForumThread instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}