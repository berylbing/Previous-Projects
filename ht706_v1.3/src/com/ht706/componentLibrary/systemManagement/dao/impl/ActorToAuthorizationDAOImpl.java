package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actortoauthorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.dao.IActorToAuthorizationDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Actortoauthorization entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.Actortoauthorization.Actortoauthorization
 * @author MyEclipse Persistence Tools
 */

public class ActorToAuthorizationDAOImpl extends HibernateDaoSupport implements IActorToAuthorizationDAO {
	private static final Log log = LogFactory
			.getLog(ActorToAuthorizationDAOImpl.class);
	// property constants
	public static final String DESCRIPTION = "description";

	public void save(Actortoauthorization transientInstance) {
		log.debug("saving Actortoauthorization instance");
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
	public void delete(Actortoauthorization persistentInstance) {
		log.debug("deleting Actortoauthorization instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Actortoauthorization findById(java.lang.Integer id) {
		log.debug("getting Actortoauthorization instance with id: " + id);
		try {
			Actortoauthorization instance = (Actortoauthorization) getSession()
					.get(
							"com.ht706.componentLibrary.systemManagement.bean.hbm.Actortoauthorization",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Actortoauthorization instance) {
		log.debug("finding Actortoauthorization instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"com.ht706.componentLibrary.systemManagement.bean.hbm.Actortoauthorization")
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
		log.debug("finding Actortoauthorization instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Actortoauthorization as model where model."
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
		log.debug("finding all Actortoauthorization instances");
		try {
			String queryString = "from Actortoauthorization";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Actortoauthorization merge(Actortoauthorization detachedInstance) {
		log.debug("merging Actortoauthorization instance");
		try {
			Actortoauthorization result = (Actortoauthorization) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Actortoauthorization instance) {
		log.debug("attaching dirty Actortoauthorization instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Actortoauthorization instance) {
		log.debug("attaching clean Actortoauthorization instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}