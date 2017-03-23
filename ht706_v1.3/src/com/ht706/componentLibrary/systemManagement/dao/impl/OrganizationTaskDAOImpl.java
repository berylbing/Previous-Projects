package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.OrganizationTask;
import com.ht706.componentLibrary.systemManagement.dao.IAuthorizationDAO;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationTaskDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * OrganizationTask entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see test.OrganizationTask
 * @author MyEclipse Persistence Tools
 */

public class OrganizationTaskDAOImpl extends HibernateDaoSupport implements IOrganizationTaskDAO {
	private static final Log log = LogFactory.getLog(OrganizationTaskDAOImpl.class);
	// property constants
	public static final String EXPRESSION = "expression";
	public static final String USER_ID = "userId";

	protected void initDao() {
		// do nothing
	}

	public void save(OrganizationTask transientInstance) {
		log.debug("saving OrganizationTask instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrganizationTask persistentInstance) {
		log.debug("deleting OrganizationTask instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrganizationTask findById(java.lang.Integer id) {
		log.debug("getting OrganizationTask instance with id: " + id);
		try {
			OrganizationTask instance = (OrganizationTask) getHibernateTemplate()
					.get("test.OrganizationTask", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrganizationTask instance) {
		log.debug("finding OrganizationTask instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding OrganizationTask instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from OrganizationTask as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByExpression(Object expression) {
		return findByProperty(EXPRESSION, expression);
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findAll() {
		log.debug("finding all OrganizationTask instances");
		try {
			String queryString = "from OrganizationTask";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OrganizationTask merge(OrganizationTask detachedInstance) {
		log.debug("merging OrganizationTask instance");
		try {
			OrganizationTask result = (OrganizationTask) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OrganizationTask instance) {
		log.debug("attaching dirty OrganizationTask instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrganizationTask instance) {
		log.debug("attaching clean OrganizationTask instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findDifferentTaskByUserId(Integer id) {
		List list = new ArrayList();
		log.debug("findDifferentTaskByUserId");
		try {
			list = getHibernateTemplate().find("select distinct ot.expression from OrganizationTask ot where ot.userId = " + id + " group by ot.expression");
			log.debug("findDifferentTaskByUserId successful");
		} catch (RuntimeException re) {
			log.error("findDifferentTaskByUserId failed", re);
			throw re;
		}
		return list;
	}
}