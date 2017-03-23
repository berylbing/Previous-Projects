/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationmodifyDAOImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.dao.impl;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationmodifyDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Specificationmodify entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @extends HibernateDaoSupport 
 * @implements ISpecificationmodifyDAO
 * @author yby
 */

public class SpecificationmodifyDAOImpl extends HibernateDaoSupport implements ISpecificationmodifyDAO {
	private static final Log log = LogFactory
			.getLog(SpecificationmodifyDAOImpl.class);
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

	public void save(Specificationmodify transientInstance) {
		log.debug("saving Specificationmodify instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Specificationmodify persistentInstance) {
		log.debug("deleting Specificationmodify instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Specificationmodify findById(java.lang.String id) {
		log.debug("getting Specificationmodify instance with id: " + id);
		try {
			Specificationmodify instance = (Specificationmodify) getHibernateTemplate()
					.get("com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Specificationmodify instance) {
		log.debug("finding Specificationmodify instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Specificationmodify instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Specificationmodify as model where model."
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
		log.debug("finding all Specificationmodify instances");
		try {
			String queryString = "from Specificationmodify";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Specificationmodify merge(Specificationmodify detachedInstance) {
		log.debug("merging Specificationmodify instance");
		try {
			Specificationmodify result = (Specificationmodify) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Specificationmodify instance) {
		log.debug("attaching dirty Specificationmodify instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Specificationmodify instance) {
		log.debug("attaching clean Specificationmodify instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void update(Specificationmodify specmodify) {
		// TODO Auto-generated method stub
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(specmodify);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
}