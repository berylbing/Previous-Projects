package com.ht706.componentLibrary.forum.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;
import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.dao.IForumBulletinDAO;
/**
 * A data access object (DAO) providing persistence and search support for
 * ForumBulletin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin
 * @author MyEclipse Persistence Tools
 */

public class ForumBulletinDAOImpl extends HibernateDaoSupport implements IForumBulletinDAO{
	private static final Log log = LogFactory.getLog(ForumBulletinDAOImpl.class);
	// property constants
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String USERID = "userid";
	public static final String USERNAME = "username";
	public static final String BULLETINORDER = "bulletinorder";

	public void save(ForumBulletin transientInstance) {
		log.debug("saving ForumBulletin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ForumBulletin persistentInstance) {
		log.debug("deleting ForumBulletin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ForumBulletin findById(java.lang.Integer id) {
		log.debug("getting ForumBulletin instance with id: " + id);
		try {
			ForumBulletin instance = (ForumBulletin) getSession().get(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ForumBulletin instance) {
		log.debug("finding ForumBulletin instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin")
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
		log.debug("finding ForumBulletin instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ForumBulletin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByBulletinorder(Object bulletinorder) {
		return findByProperty(BULLETINORDER, bulletinorder);
	}

	public List findAll() {
		log.debug("finding all ForumBulletin instances");
		try {
			System.out.println("----------------------------------------------3");
			String queryString = "from ForumBulletin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ForumBulletin merge(ForumBulletin detachedInstance) {
		log.debug("merging ForumBulletin instance");
		try {
			ForumBulletin result = (ForumBulletin) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ForumBulletin instance) {
		log.debug("attaching dirty ForumBulletin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ForumBulletin instance) {
		log.debug("attaching clean ForumBulletin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}