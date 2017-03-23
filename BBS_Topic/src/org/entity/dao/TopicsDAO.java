package org.entity.dao;

import java.util.List;

import org.entity.bean.Topics;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Topics entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.entity.bean.Topics
 * @author MyEclipse Persistence Tools
 */

public class TopicsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TopicsDAO.class);
	// property constants
	public static final String ENERGY = "energy";
	public static final String VECTOR = "vector";

	public void save(Topics transientInstance) {
		log.debug("saving Topics instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Topics persistentInstance) {
		log.debug("deleting Topics instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Topics findById(java.lang.Integer id) {
		log.debug("getting Topics instance with id: " + id);
		try {
			Topics instance = (Topics) getSession().get("org.Topics", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Topics instance) {
		log.debug("finding Topics instance by example");
		try {
			List results = getSession().createCriteria("org.Topics").add(
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
		log.debug("finding Topics instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Topics as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEnergy(Object energy) {
		return findByProperty(ENERGY, energy);
	}

	public List findByVector(Object vector) {
		return findByProperty(VECTOR, vector);
	}

	public List findAll() {
		log.debug("finding all Topics instances");
		try {
			String queryString = "from Topics";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Topics merge(Topics detachedInstance) {
		log.debug("merging Topics instance");
		try {
			Topics result = (Topics) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Topics instance) {
		log.debug("attaching dirty Topics instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Topics instance) {
		log.debug("attaching clean Topics instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}