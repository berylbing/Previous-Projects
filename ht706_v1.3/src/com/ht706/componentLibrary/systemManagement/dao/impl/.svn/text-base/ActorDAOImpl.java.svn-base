package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.hibernate.FlushMode;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.dao.IActorDAO;

/**
 * A data access object (DAO) providing persistence and search support for Actor
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ht706.componentLibrary.systemManagement.bean.hbm.Actor
 * @author MyEclipse Persistence Tools
 */

public class ActorDAOImpl extends HibernateDaoSupport implements IActorDAO{
	private static final Logger log = Logger.getLogger(ActorDAOImpl.class);
	// property constants
	public static final String ACTOR_NAME = "actorName";
	public static final String RESPONSIBILITY = "responsibility";
	public static final String MODULE = "module";
	
	public void save(Actor transientInstance) {
		log.debug("saving Actor instance");
		try {		
			getHibernateTemplate().save(transientInstance);	
			getHibernateTemplate().getSessionFactory().getCurrentSession().flush();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public void update(Actor transientInstance) {
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(transientInstance);
			getHibernateTemplate().getSessionFactory().getCurrentSession().flush();
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	public void delete(Actor persistentInstance) {
		log.debug("deleting Actor instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			getHibernateTemplate().getSessionFactory().getCurrentSession().flush();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Actor findById(java.lang.Integer id) {
		log.debug("getting Actor instance with id: " + id);
		try {
			Actor instance = (Actor)getHibernateTemplate().get(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Actor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Actor instance) {
		log.debug("finding Actor instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Actor").add(
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
		log.debug("finding Actor instance with property: " + propertyName
				+ ", value: " + value);
		try {			
			String queryString = "from Actor as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByActorName(Object actorName) {
		return findByProperty(ACTOR_NAME, actorName);
	}

	public List findByResponsibility(Object responsibility) {
		return findByProperty(RESPONSIBILITY, responsibility);
	}
	public List findByModule(Object module) {
		return findByProperty(MODULE, module);
	}
	public List findAll() {
		log.debug("finding all Actor instances");
		try {
			String queryString = "from Actor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Actor merge(Actor detachedInstance) {
		log.debug("merging Actor instance");
		try {
			Actor result = (Actor) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Actor instance) {
		log.debug("attaching dirty Actor instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Actor instance) {
		log.debug("attaching clean Actor instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}