package com.ht706.componentLibrary.util.security.dao.impl;


import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.util.security.bean.hbm.Actorandurl;
import com.ht706.componentLibrary.util.security.bean.hbm.ActorandurlId;
import com.ht706.componentLibrary.util.security.dao.IActorandurlDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Actorandurl entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see sec2.Actorandurl
 * @author MyEclipse Persistence Tools
 */

public class ActorandurlDAO extends HibernateDaoSupport implements IActorandurlDAO{
	private static final Log log = LogFactory.getLog(ActorandurlDAO.class);

	// property constants

	public void save(Actorandurl transientInstance) {
		log.debug("saving Actorandurl instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Actorandurl persistentInstance) {
		log.debug("deleting Actorandurl instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Actorandurl findById(ActorandurlId id) {
		log.debug("getting Actorandurl instance with id: " + id);
		try {
			Actorandurl instance = (Actorandurl) getSession().get(
					"com.ht706.componentLibrary.util.security.bean.hbm.Actorandurl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Actorandurl instance) {
		log.debug("finding Actorandurl instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.util.security.bean.hbm.Actorandurl").add(
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
		log.debug("finding Actorandurl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Actorandurl as model where model."
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
		log.debug("finding all Actorandurl instances");
		try {
			String queryString = "from Actorandurl";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Actorandurl merge(Actorandurl detachedInstance) {
		log.debug("merging Actorandurl instance");
		try {
			Actorandurl result = (Actorandurl) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Actorandurl instance) {
		log.debug("attaching dirty Actorandurl instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Actorandurl instance) {
		log.debug("attaching clean Actorandurl instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}