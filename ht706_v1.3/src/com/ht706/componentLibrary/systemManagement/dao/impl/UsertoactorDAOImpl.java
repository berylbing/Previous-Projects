package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Usertoactor;
import com.ht706.componentLibrary.systemManagement.dao.IUserToActorDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Usertoactor entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.Usertoactor.Usertoactor
 * @author MyEclipse Persistence Tools
 */

public class UsertoactorDAOImpl extends HibernateDaoSupport implements IUserToActorDAO {
	private static final Log log = LogFactory.getLog(UsertoactorDAOImpl.class);
	// property constants
	public static final String DESCRIPTION = "description";

	public void save(Usertoactor transientInstance) {
		log.debug("saving Usertoactor instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public void update(Authorization transientInstance) {
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	public void delete(Usertoactor persistentInstance) {
		log.debug("deleting Usertoactor instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Usertoactor findById(java.lang.Integer id) {
		log.debug("getting Usertoactor instance with id: " + id);
		try {
			Usertoactor instance = (Usertoactor) getHibernateTemplate().get(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Usertoactor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Usertoactor instance) {
		log.debug("finding Usertoactor instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Usertoactor").add(
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
		log.debug("finding Usertoactor instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Usertoactor as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Usertoactor instances");
		try {
			String queryString = "from Usertoactor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Usertoactor merge(Usertoactor detachedInstance) {
		log.debug("merging Usertoactor instance");
		try {
			Usertoactor result = (Usertoactor) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Usertoactor instance) {
		log.debug("attaching dirty Usertoactor instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Usertoactor instance) {
		log.debug("attaching clean Usertoactor instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}