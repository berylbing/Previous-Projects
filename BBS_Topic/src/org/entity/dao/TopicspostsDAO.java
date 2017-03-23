package org.entity.dao;

import java.sql.Timestamp;
import java.util.List;

import org.entity.bean.Topicsposts;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Topicsposts entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.entity.bean.Topicsposts
 * @author MyEclipse Persistence Tools
 */

public class TopicspostsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TopicspostsDAO.class);
	// property constants
	public static final String TID = "tid";
	public static final String PID = "pid";
	public static final String SIMILARITY = "similarity";
	public static final String NUTRITION = "nutrition";

	public void save(Topicsposts transientInstance) {
		log.debug("saving Topicsposts instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Topicsposts persistentInstance) {
		log.debug("deleting Topicsposts instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Topicsposts findById(java.lang.Integer id) {
		log.debug("getting Topicsposts instance with id: " + id);
		try {
			Topicsposts instance = (Topicsposts) getSession().get(
					"org.Topicsposts", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Topicsposts instance) {
		log.debug("finding Topicsposts instance by example");
		try {
			List results = getSession().createCriteria("org.Topicsposts").add(
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
		log.debug("finding Topicsposts instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Topicsposts as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTid(Object tid) {
		return findByProperty(TID, tid);
	}

	public List findByPid(Object pid) {
		return findByProperty(PID, pid);
	}

	public List findBySimilarity(Object similarity) {
		return findByProperty(SIMILARITY, similarity);
	}

	public List findByNutrition(Object nutrition) {
		return findByProperty(NUTRITION, nutrition);
	}

	public List findAll() {
		log.debug("finding all Topicsposts instances");
		try {
			String queryString = "from Topicsposts";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Topicsposts merge(Topicsposts detachedInstance) {
		log.debug("merging Topicsposts instance");
		try {
			Topicsposts result = (Topicsposts) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Topicsposts instance) {
		log.debug("attaching dirty Topicsposts instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Topicsposts instance) {
		log.debug("attaching clean Topicsposts instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}