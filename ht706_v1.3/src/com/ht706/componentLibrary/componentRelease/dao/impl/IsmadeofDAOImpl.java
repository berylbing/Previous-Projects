package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof;
import com.ht706.componentLibrary.componentRelease.dao.IIsmadeofDAO;


/**
 * A data access object (DAO) providing persistence and search support for
 * Ismadeof entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Ismadeof
 * @author MyEclipse Persistence Tools
 */

public class IsmadeofDAOImpl extends HibernateDaoSupport implements IIsmadeofDAO{
	private static final Log log = LogFactory.getLog(IsmadeofDAOImpl.class);

	// property constants
	public void save(Ismadeof transientInstance) {
		log.debug("saving Ismadeof instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ismadeof persistentInstance) {
		log.debug("deleting Ismadeof instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ismadeof findById(java.lang.Integer id) {
		log.debug("getting Ismadeof instance with id: " + id);
		try {
			Ismadeof instance = (Ismadeof) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ismadeof instance) {
		log.debug("finding Ismadeof instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof").add(
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
		log.debug("finding Ismadeof instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ismadeof as model where model."
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
		log.debug("finding all Ismadeof instances");
		try {
			String queryString = "from Ismadeof";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List<Ismadeof> findByAssetId(String id){
		log.debug("finding Ismadeof instances by Asset Id");
		try {
			String queryString ="from Ismadeof as a where a.asset.uniqueId='"+id+"'";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ismadeof merge(Ismadeof detachedInstance) {
		log.debug("merging Ismadeof instance");
		try {
			Ismadeof result = (Ismadeof) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ismadeof instance) {
		log.debug("attaching dirty Ismadeof instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ismadeof instance) {
		log.debug("attaching clean Ismadeof instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}