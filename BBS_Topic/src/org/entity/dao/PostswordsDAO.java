package org.entity.dao;

import java.sql.Timestamp;
import java.util.List;

import org.entity.bean.Postswords;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Postswords entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.entity.bean.Postswords
 * @author MyEclipse Persistence Tools
 */

public class PostswordsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(PostswordsDAO.class);
	// property constants
	public static final String PID = "pid";
	public static final String WID = "wid";
	public static final String WEIGHT = "weight";
	public static final String POSITION = "position";
	public static final String WORD = "word";
	public static final String TOPIC_ID = "topicId";
	public static final String FLAG = "flag";
	public static final String ISSUETIME = "issuetime";

	public void save(Postswords transientInstance) {
		log.debug("saving Postswords instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Postswords persistentInstance) {
		log.debug("deleting Postswords instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Postswords findById(java.lang.Integer id) {
		log.debug("getting Postswords instance with id: " + id);
		try {
			Postswords instance = (Postswords) getSession().get(
					"org.Postswords", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Postswords instance) {
		log.debug("finding Postswords instance by example");
		try {
			List results = getSession().createCriteria("org.Postswords").add(
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
		log.debug("finding Postswords instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Postswords as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findByWid(Object wid) {
		return findByProperty(WID, wid);
	}

	public List findByWeight(Object weight) {
		return findByProperty(WEIGHT, weight);
	}

	public List findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List findByWord(Object word) {
		return findByProperty(WORD, word);
	}
	
	public List findByTopicId(Object topicId) {
		return findByProperty(TOPIC_ID, topicId);
	}
	
	public List findByFlag(Object flag) {
		return findByProperty(FLAG, flag);
	}
	
	public List findByIssuetime(Object issuetime) {
		return findByProperty(ISSUETIME, issuetime);
	}

	public List findAll() {
		log.debug("finding all Postswords instances");
		try {
			String queryString = "from Postswords";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Postswords merge(Postswords detachedInstance) {
		log.debug("merging Postswords instance");
		try {
			Postswords result = (Postswords) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Postswords instance) {
		log.debug("attaching dirty Postswords instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Postswords instance) {
		log.debug("attaching clean Postswords instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}