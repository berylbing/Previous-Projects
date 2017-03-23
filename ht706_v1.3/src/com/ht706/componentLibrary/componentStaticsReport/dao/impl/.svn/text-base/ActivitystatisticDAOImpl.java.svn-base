package com.ht706.componentLibrary.componentStaticsReport.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Activitystatistic;
import com.ht706.componentLibrary.componentStaticsReport.dao.IActivitystaticDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Activitystatistic entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.componentSpecification.dao.impl.Activitystatistic
 * @author MyEclipse Persistence Tools
 */

public class ActivitystatisticDAOImpl extends HibernateDaoSupport implements IActivitystaticDAO {
	private static final Log log = LogFactory
			.getLog(ActivitystatisticDAOImpl.class);
	// property constants
	public static final String ASSET_UNIQUE_ID = "assetUniqueId";
	public static final String OPERATION_TYPE = "operationType";
	public static final String OPERATOR = "operator";

	protected void initDao() {
		// do nothing
	}

	public void save(Activitystatistic transientInstance) {
		log.debug("saving Activitystatistic instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Activitystatistic persistentInstance) {
		log.debug("deleting Activitystatistic instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Activitystatistic findById(java.lang.Integer id) {
		log.debug("getting Activitystatistic instance with id: " + id);
		try {
			Activitystatistic instance = (Activitystatistic) getHibernateTemplate()
					.get(
							"com.ht706.componentLibrary.componentSpecification.dao.impl.Activitystatistic",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Activitystatistic instance) {
		log.debug("finding Activitystatistic instance by example");
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
		log.debug("finding Activitystatistic instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Activitystatistic as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssetUniqueId(Object assetUniqueId) {
		return findByProperty(ASSET_UNIQUE_ID, assetUniqueId);
	}

	public List findByOperationType(Object operationType) {
		return findByProperty(OPERATION_TYPE, operationType);
	}

	public List findByOperator(Object operator) {
		return findByProperty(OPERATOR, operator);
	}

	public List findAll() {
		log.debug("finding all Activitystatistic instances");
		try {
			String queryString = "from Activitystatistic";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Activitystatistic merge(Activitystatistic detachedInstance) {
		log.debug("merging Activitystatistic instance");
		try {
			Activitystatistic result = (Activitystatistic) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Activitystatistic instance) {
		log.debug("attaching dirty Activitystatistic instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Activitystatistic instance) {
		log.debug("attaching clean Activitystatistic instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ActivitystatisticDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (ActivitystatisticDAOImpl) ctx.getBean("ActivitystatisticDAO");
	}
}