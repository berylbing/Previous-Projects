package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Wascreatedby;
import com.ht706.componentLibrary.componentRelease.dao.IWascreatedbyDAO;


/**
 * A data access object (DAO) providing persistence and search support for
 * Wascreatedby entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Wascreatedby
 * @author MyEclipse Persistence Tools
 */

public class WascreatedbyDAOImpl extends HibernateDaoSupport implements IWascreatedbyDAO{
	private static final Log log = LogFactory.getLog(WascreatedbyDAOImpl.class);

	// property constants

	public void save(Wascreatedby transientInstance) {
		log.debug("saving Wascreatedby instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Wascreatedby persistentInstance) {
		log.debug("deleting Wascreatedby instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Wascreatedby findById(java.lang.Integer id) {
		log.debug("getting Wascreatedby instance with id: " + id);
		try {
			Wascreatedby instance = (Wascreatedby) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Wascreatedby", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Wascreatedby instance) {
		log.debug("finding Wascreatedby instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Wascreatedby")
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
		log.debug("finding Wascreatedby instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Wascreatedby as model where model."
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
		log.debug("finding all Wascreatedby instances");
		try {
			String queryString = "from Wascreatedby";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Wascreatedby merge(Wascreatedby detachedInstance) {
		log.debug("merging Wascreatedby instance");
		try {
			Wascreatedby result = (Wascreatedby) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Wascreatedby instance) {
		log.debug("attaching dirty Wascreatedby instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Wascreatedby instance) {
		log.debug("attaching clean Wascreatedby instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findByUserName(String name) {
		// TODO Auto-generated method stub
		try {
			String queryString = "from Wascreatedby as model where model.organization.userName= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, name);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property UserName failed", re);
			throw re;
		}
	}
}