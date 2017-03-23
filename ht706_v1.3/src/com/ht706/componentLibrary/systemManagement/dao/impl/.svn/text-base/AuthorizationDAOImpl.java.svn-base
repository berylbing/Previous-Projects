package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.dao.IAuthorizationDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Authorization entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization
 * @author MyEclipse Persistence Tools
 */

public class AuthorizationDAOImpl extends HibernateDaoSupport implements IAuthorizationDAO {
	private static final Log log = LogFactory.getLog(AuthorizationDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";

	public void save(Authorization transientInstance) {
		log.debug("saving Authorization instance");
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

	public void delete(Authorization persistentInstance) {
		log.debug("deleting Authorization instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Authorization findById(java.lang.Integer id) {
		log.debug("getting Authorization instance with id: " + id);
		try {
			Authorization instance = (Authorization) getSession()
					.get(
							"com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Authorization instance) {
		log.debug("finding Authorization instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization")
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
		log.debug("finding Authorization instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Authorization as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Authorization instances");
		try {
			String queryString = "from Authorization";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	public List findByModuleId(String id) {
		log.debug("finding Authorization instances by module");
		try {
			String queryString = "from Authorization ";
			if(id != null)
				queryString += "as au where au.module='" + id + "' ";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Authorization merge(Authorization detachedInstance) {
		log.debug("merging Authorization instance");
		try {
			Authorization result = (Authorization) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Authorization instance) {
		log.debug("attaching dirty Authorization instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Authorization instance) {
		log.debug("attaching clean Authorization instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}	
}