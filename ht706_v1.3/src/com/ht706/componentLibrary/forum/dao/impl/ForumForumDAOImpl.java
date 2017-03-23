package com.ht706.componentLibrary.forum.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.dao.IForumForumDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * ForumForum entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.forum.bean.hbm.ForumForum
 * @author MyEclipse Persistence Tools
 */

public class ForumForumDAOImpl extends HibernateDaoSupport implements IForumForumDAO{
	private static final Log log = LogFactory.getLog(ForumForumDAOImpl.class);
	// property constants
	public static final String ISCHILD = "ischild";
	public static final String BELONGID = "belongid";
	public static final String FORUMNAME = "forumname";
	public static final String FORUMREAD = "forumread";
	public static final String COLOR = "color";
	public static final String TOPICNUM = "topicnum";
	public static final String POSTNUM = "postnum";
	public static final String TODAYNUM = "todaynum";
	public static final String FORUMORDER = "forumorder";
	public static final String SHOWSUB = "showsub";
	public static final String TOPICNAME = "topicname";
	public static final String USERNAME = "username";
	public static final String TOPICID = "topicid";
	public static final String USERID = "userid";
	public static final String RULE = "rule";
	public static final String ISSHOW = "isshow";
	public static final String KEYWORD = "keyword";
	public static final String AUDITPUBLISH = "auditpublish";

	public void save(ForumForum transientInstance) {
		log.debug("saving ForumForum instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ForumForum persistentInstance) {
		log.debug("deleting ForumForum instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ForumForum findById(java.lang.Integer id) {
		log.debug("getting ForumForum instance with id: " + id);
		try {
			ForumForum instance = (ForumForum) getSession().get(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumForum", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ForumForum instance) {
		log.debug("finding ForumForum instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumForum")
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
		log.debug("finding ForumForum instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ForumForum as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByIschild(Object ischild) {
		return findByProperty(ISCHILD, ischild);
	}

	public List findByBelongid(Object belongid) {
		return findByProperty(BELONGID, belongid);
	}

	public List findByForumname(Object forumname) {
		return findByProperty(FORUMNAME, forumname);
	}

	public List findByForumread(Object forumread) {
		return findByProperty(FORUMREAD, forumread);
	}

	public List findByColor(Object color) {
		return findByProperty(COLOR, color);
	}

	public List findByTopicnum(Object topicnum) {
		return findByProperty(TOPICNUM, topicnum);
	}

	public List findByPostnum(Object postnum) {
		return findByProperty(POSTNUM, postnum);
	}

	public List findByTodaynum(Object todaynum) {
		return findByProperty(TODAYNUM, todaynum);
	}

	public List findByForumorder(Object forumorder) {
		return findByProperty(FORUMORDER, forumorder);
	}

	public List findByShowsub(Object showsub) {
		return findByProperty(SHOWSUB, showsub);
	}

	public List findByTopicname(Object topicname) {
		return findByProperty(TOPICNAME, topicname);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByTopicid(Object topicid) {
		return findByProperty(TOPICID, topicid);
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findByRule(Object rule) {
		return findByProperty(RULE, rule);
	}

	public List findByIsshow(Object isshow) {
		return findByProperty(ISSHOW, isshow);
	}

	public List findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List findByAuditpublish(Object auditpublish) {
		return findByProperty(AUDITPUBLISH, auditpublish);
	}

	public List findAll() {
		log.debug("finding all ForumForum instances");
		try {
			String queryString = "from ForumForum";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ForumForum merge(ForumForum detachedInstance) {
		log.debug("merging ForumForum instance");
		try {
			ForumForum result = (ForumForum) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ForumForum instance) {
		log.debug("attaching dirty ForumForum instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ForumForum instance) {
		log.debug("attaching clean ForumForum instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}