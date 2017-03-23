package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Assetmodifyapplication;

/**
 * A data access object (DAO) providing persistence and search support for
 * Assetmodifyapplication entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Assetmodifyapplication
 * @author MyEclipse Persistence Tools
 */

public class AssetmodifyapplicationDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory
			.getLog(AssetmodifyapplicationDAO.class);
	// property constants
	public static final String REGISTRY_ID = "registryId";
	public static final String APPLICANT = "applicant";
	public static final String SELECTED_ITEM = "selectedItem";
	public static final String REASON = "reason";
	public static final String REASON_BY = "reasonBy";
	public static final String SCHEME = "scheme";
	public static final String SCHEME_BY = "schemeBy";
	public static final String ATTITUDE = "attitude";
	public static final String ATTITUDE_BY = "attitudeBy";
	public static final String STATUS = "status";

	public void save(Assetmodifyapplication transientInstance) {
		log.debug("saving Assetmodifyapplication instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Assetmodifyapplication persistentInstance) {
		log.debug("deleting Assetmodifyapplication instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Assetmodifyapplication findById(java.lang.Integer id) {
		log.debug("getting Assetmodifyapplication instance with id: " + id);
		try {
			Assetmodifyapplication instance = (Assetmodifyapplication) getSession()
					.get(
							"com.ht706.componentLibrary.componentRelease.bean.hbm.Assetmodifyapplication",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Assetmodifyapplication instance) {
		log.debug("finding Assetmodifyapplication instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"com.ht706.componentLibrary.componentRelease.bean.hbm.Assetmodifyapplication")
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
		log.debug("finding Assetmodifyapplication instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Assetmodifyapplication as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRegistryId(Object registryId) {
		return findByProperty(REGISTRY_ID, registryId);
	}

	public List findByApplicant(Object applicant) {
		return findByProperty(APPLICANT, applicant);
	}

	public List findBySelectedItem(Object selectedItem) {
		return findByProperty(SELECTED_ITEM, selectedItem);
	}

	public List findByReason(Object reason) {
		return findByProperty(REASON, reason);
	}

	public List findByReasonBy(Object reasonBy) {
		return findByProperty(REASON_BY, reasonBy);
	}

	public List findByScheme(Object scheme) {
		return findByProperty(SCHEME, scheme);
	}

	public List findBySchemeBy(Object schemeBy) {
		return findByProperty(SCHEME_BY, schemeBy);
	}

	public List findByAttitude(Object attitude) {
		return findByProperty(ATTITUDE, attitude);
	}

	public List findByAttitudeBy(Object attitudeBy) {
		return findByProperty(ATTITUDE_BY, attitudeBy);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all Assetmodifyapplication instances");
		try {
			String queryString = "from Assetmodifyapplication";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Assetmodifyapplication merge(Assetmodifyapplication detachedInstance) {
		log.debug("merging Assetmodifyapplication instance");
		try {
			Assetmodifyapplication result = (Assetmodifyapplication) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Assetmodifyapplication instance) {
		log.debug("attaching dirty Assetmodifyapplication instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Assetmodifyapplication instance) {
		log.debug("attaching clean Assetmodifyapplication instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}