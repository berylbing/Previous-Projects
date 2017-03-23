package com.ht706.componentLibrary.forum.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;
import com.ht706.componentLibrary.forum.dao.IForumTopicDAO;


/**
 * A data access object (DAO) providing persistence and search support for
 * ForumTopic entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.forum.bean.hbm.ForumTopic
 * @author MyEclipse Persistence Tools
 */

public class ForumTopicDAOImpl extends HibernateDaoSupport implements IForumTopicDAO{
	private static final Log log = LogFactory.getLog(ForumTopicDAOImpl.class);
	// property constants
	public static final String FORUMID = "forumid";
	public static final String TOPICNAME = "topicname";
	public static final String TYPEID = "typeid";
	public static final String USERNAME = "username";
	public static final String USERID = "userid";
	public static final String REPLYNAME = "replyname";
	public static final String HITNUM = "hitnum";
	public static final String REPLYNUM = "replynum";
	public static final String BESTTYPE = "besttype";
	public static final String TOPTYPE = "toptype";
	public static final String ISLOCK = "islock";
	public static final String ISHIGHLIGHT = "ishighlight";
	public static final String COLOR = "color";
	public static final String BOLD = "bold";
	public static final String ITALIC = "italic";
	public static final String AUDITSTATUS = "auditstatus";
	public static final String MANAGESTATUS = "managestatus";
	public static final String GRADESTATUS = "gradestatus";

	public void save(ForumTopic transientInstance) {
		log.debug("saving ForumTopic instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ForumTopic persistentInstance) {
		log.debug("deleting ForumTopic instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ForumTopic findById(java.lang.Integer id) {
		log.debug("getting ForumTopic instance with id: " + id);
		try {
			ForumTopic instance = (ForumTopic) getSession().get(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumTopic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ForumTopic instance) {
		log.debug("finding ForumTopic instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumTopic")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ForumTopic instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ForumTopic as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByForumid(Object forumid) {
		return findByProperty(FORUMID, forumid);
	}

	public List findByTopicname(Object topicname) {
		return findByProperty(TOPICNAME, topicname);
	}

	public List findByTypeid(Object typeid) {
		return findByProperty(TYPEID, typeid);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findByReplyname(Object replyname) {
		return findByProperty(REPLYNAME, replyname);
	}

	public List findByHitnum(Object hitnum) {
		return findByProperty(HITNUM, hitnum);
	}

	public List findByReplynum(Object replynum) {
		return findByProperty(REPLYNUM, replynum);
	}

	public List findByBesttype(Object besttype) {
		return findByProperty(BESTTYPE, besttype);
	}

	public List findByToptype(Object toptype) {
		return findByProperty(TOPTYPE, toptype);
	}

	public List findByIslock(Object islock) {
		return findByProperty(ISLOCK, islock);
	}

	public List findByIshighlight(Object ishighlight) {
		return findByProperty(ISHIGHLIGHT, ishighlight);
	}

	public List findByColor(Object color) {
		return findByProperty(COLOR, color);
	}

	public List findByBold(Object bold) {
		return findByProperty(BOLD, bold);
	}

	public List findByItalic(Object italic) {
		return findByProperty(ITALIC, italic);
	}

	public List findByAuditstatus(Object auditstatus) {
		return findByProperty(AUDITSTATUS, auditstatus);
	}

	public List findByManagestatus(Object managestatus) {
		return findByProperty(MANAGESTATUS, managestatus);
	}

	public List findByGradestatus(Object gradestatus) {
		return findByProperty(GRADESTATUS, gradestatus);
	}

	public List findAll() {
		log.debug("finding all ForumTopic instances");
		try {
			String queryString = "from ForumTopic";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ForumTopic merge(ForumTopic detachedInstance) {
		log.debug("merging ForumTopic instance");
		try {
			ForumTopic result = (ForumTopic) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ForumTopic instance) {
		log.debug("attaching dirty ForumTopic instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ForumTopic instance) {
		log.debug("attaching clean ForumTopic instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}