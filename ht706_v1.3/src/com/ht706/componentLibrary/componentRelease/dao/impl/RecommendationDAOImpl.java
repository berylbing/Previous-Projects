package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation;
import com.ht706.componentLibrary.componentRelease.dao.IRecommendationDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Recommendation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see dao.Recommendation
 * @author MyEclipse Persistence Tools
 */

public class RecommendationDAOImpl extends HibernateDaoSupport implements IRecommendationDAO{
	private static final Log log = LogFactory.getLog(RecommendationDAOImpl.class);
	// property constants
	public static final String UNIQUE_ID = "uniqueId";
	public static final String DATE_OF_INFORMATION = "dateOfInformation";
	public static final String RECOMMENDER_ID = "recommenderId";
	public static final String ASSET_TYPE = "assetType";
	public static final String FUNCTIONALITY = "functionality";
	public static final String USABLITY = "usablity";
	public static final String REASON = "reason";
	public static final String FILE = "file";

	public void save(Recommendation transientInstance) {
		log.debug("saving Recommendation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Recommendation persistentInstance) {
		log.debug("deleting Recommendation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Recommendation findById(java.lang.Integer id) {
		log.debug("getting Recommendation instance with id: " + id);
		try {
			Recommendation instance = (Recommendation) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Recommendation instance) {
		log.debug("finding Recommendation instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation")
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
		log.debug("finding Recommendation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Recommendation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUniqueId(Object uniqueId) {
		return findByProperty(UNIQUE_ID, uniqueId);
	}

	public List findByDateOfInformation(Object dateOfInformation) {
		return findByProperty(DATE_OF_INFORMATION, dateOfInformation);
	}

	public List findByRecommenderId(Object recommenderId) {
		return findByProperty(RECOMMENDER_ID, recommenderId);
	}

	public List findByAssetType(Object assetType) {
		return findByProperty(ASSET_TYPE, assetType);
	}

	public List findByFunctionality(Object functionality) {
		return findByProperty(FUNCTIONALITY, functionality);
	}

	public List findByUsablity(Object usablity) {
		return findByProperty(USABLITY, usablity);
	}

	public List findByReason(Object reason) {
		return findByProperty(REASON, reason);
	}

	public List findByFile(Object file) {
		return findByProperty(FILE, file);
	}

	public List findAll() {
		log.debug("finding all Recommendation instances");
		try {
			String queryString = "from Recommendation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Recommendation merge(Recommendation detachedInstance) {
		log.debug("merging Recommendation instance");
		try {
			Recommendation result = (Recommendation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Recommendation instance) {
		log.debug("attaching dirty Recommendation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Recommendation instance) {
		log.debug("attaching clean Recommendation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}