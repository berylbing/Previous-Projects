/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SynchlogDAOImpl.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synchlog;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISynchlogDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Synchlog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @extends HibernateDaoSupport 
 * @implements ISynchlogDAO
 * @author yby
 */

public class SynchlogDAOImpl extends HibernateDaoSupport implements ISynchlogDAO {
	private static final Log log = LogFactory.getLog(SynchlogDAOImpl.class);
	// property constants
	public static final String SPEC_UUID = "specUuid";
	public static final String PRECEDE_SPEC = "precedeSpec";
	public static final String FROM_IP = "fromIp";
	public static final String TO_IP = "toIp";
	public static final String RESPONSE_CODE = "responseCode";
	public static final String SYN_TYPE = "synType";
	public static final String DESCRIPTION = "description";

	public void save(Synchlog transientInstance) {
		log.debug("saving Synchlog instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Synchlog persistentInstance) {
		log.debug("deleting Synchlog instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Synchlog findById(java.lang.Integer id) {
		log.debug("getting Synchlog instance with id: " + id);
		try {
			Synchlog instance = (Synchlog) getHibernateTemplate().get("com.ht706.componentLibrary.componentSpecification.bean.hbm.Synchlog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Synchlog instance) {
		log.debug("finding Synchlog instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Synchlog").add(
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
		log.debug("finding Synchlog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Synchlog as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySpecUuid(Object specUuid) {
		return findByProperty(SPEC_UUID, specUuid);
	}

	public List findByPrecedeSpec(Object precedeSpec) {
		return findByProperty(PRECEDE_SPEC, precedeSpec);
	}

	public List findByFromIp(Object fromIp) {
		return findByProperty(FROM_IP, fromIp);
	}

	public List findByToIp(Object toIp) {
		return findByProperty(TO_IP, toIp);
	}

	public List findByResponseCode(Object responseCode) {
		return findByProperty(RESPONSE_CODE, responseCode);
	}

	public List findBySynType(Object synType) {
		return findByProperty(SYN_TYPE, synType);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Synchlog instances");
		try {
			String queryString = "from Synchlog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Synchlog merge(Synchlog detachedInstance) {
		log.debug("merging Synchlog instance");
		try {
			Synchlog result = (Synchlog) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Synchlog instance) {
		log.debug("attaching dirty Synchlog instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Synchlog instance) {
		log.debug("attaching clean Synchlog instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}