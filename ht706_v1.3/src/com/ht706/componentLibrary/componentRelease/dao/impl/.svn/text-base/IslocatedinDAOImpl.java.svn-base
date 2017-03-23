package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Islocatedin;
import com.ht706.componentLibrary.componentRelease.dao.IIslocatedinDAO;


/**
 * A data access object (DAO) providing persistence and search support for
 * Islocatedin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Islocatedin
 * @author MyEclipse Persistence Tools
 */

public class IslocatedinDAOImpl extends HibernateDaoSupport implements IIslocatedinDAO{
	private static final Log log = LogFactory.getLog(IslocatedinDAOImpl.class);

	// property constants

	public void save(Islocatedin transientInstance) {
		log.debug("saving Islocatedin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Islocatedin persistentInstance) {
		log.debug("deleting Islocatedin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Islocatedin findById(java.lang.Integer id) {
		log.debug("getting Islocatedin instance with id: " + id);
		try {
			Islocatedin instance = (Islocatedin) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Islocatedin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Islocatedin instance) {
		log.debug("finding Islocatedin instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Islocatedin").add(
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
		log.debug("finding Islocatedin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Islocatedin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Islocatedin instances");
		try {
			String queryString = "from Islocatedin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List<Islocatedin> findByAssetId(String id) {
		log.debug("finding Islocatedin instances by Asset id");
		try {
			String queryString = "from Islocatedin as a where a.asset.uniqueId";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find Islocatedin instances by Asset id failed", re);
			throw re;
		}
	}

	public Islocatedin merge(Islocatedin detachedInstance) {
		log.debug("merging Islocatedin instance");
		try {
			Islocatedin result = (Islocatedin) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Islocatedin instance) {
		log.debug("attaching dirty Islocatedin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Islocatedin instance) {
		log.debug("attaching clean Islocatedin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}