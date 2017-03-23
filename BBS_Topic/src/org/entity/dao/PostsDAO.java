package org.entity.dao;

import java.sql.Timestamp;
import java.util.List;

import org.entity.bean.Posts;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Posts
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see org.entity.bean.Posts
 * @author MyEclipse Persistence Tools
 */

public class PostsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PostsDAO.class);
	// property constants
	public static final String SUB_ID = "subId";
	public static final String TOPIC_ID = "topicId";
	public static final String URL = "url";
	public static final String BOARD = "board";
	public static final String TITLE = "title";
	public static final String AUTHORID = "authorid";
	public static final String AUTHRNAME = "authrname";
	public static final String CONTENT = "content";
	public static final String IP = "ip";
	public static final String FLAG = "flag";

	public void save(Posts transientInstance) {
		log.debug("saving Posts instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Posts persistentInstance) {
		log.debug("deleting Posts instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Posts findById(java.lang.Integer id) {
		log.debug("getting Posts instance with id: " + id);
		try {
			Posts instance = (Posts) getSession().get("org.Posts", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Posts instance) {
		log.debug("finding Posts instance by example");
		try {
			List results = getSession().createCriteria("org.Posts").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Posts instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Posts as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySubId(Object subId) {
		return findByProperty(SUB_ID, subId);
	}

	public List findByTopicId(Object topicId) {
		return findByProperty(TOPIC_ID, topicId);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByBoard(Object board) {
		return findByProperty(BOARD, board);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByAuthorid(Object authorid) {
		return findByProperty(AUTHORID, authorid);
	}

	public List findByAuthrname(Object authrname) {
		return findByProperty(AUTHRNAME, authrname);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByIp(Object ip) {
		return findByProperty(IP, ip);
	}

	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}

	public List findAll() {
		log.debug("finding all Posts instances");
		try {
			String queryString = "from Posts";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Posts merge(Posts detachedInstance) {
		log.debug("merging Posts instance");
		try {
			Posts result = (Posts) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Posts instance) {
		log.debug("attaching dirty Posts instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Posts instance) {
		log.debug("attaching clean Posts instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}