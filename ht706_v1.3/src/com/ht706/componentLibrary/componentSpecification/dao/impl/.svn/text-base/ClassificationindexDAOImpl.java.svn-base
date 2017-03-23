/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ClassificationindexDAOImpl.java
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

import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Classificationindex;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Classificationindex entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @extends HibernateDaoSupport 
 * @implements IClassificationindexDAO
 * @author yby
 */

public class ClassificationindexDAOImpl extends HibernateDaoSupport implements IClassificationindexDAO {
	private static final Log log = LogFactory
			.getLog(ClassificationindexDAOImpl.class);
	// property constants
	public static final String FACET_UUID = "facetUuid";
	public static final String UNIQUE_ID = "uniqueId";
	public static final String ASSET_NAME = "assetName";
	public static final String PROVIDER = "provider";
	public static final String DOMAIN = "domain";
	public static final String URL = "url";
	public static final String LIBRARY_UNIQUE_ID = "libraryUniqueId";
	public static final String GRADE = "grade";

	public void save(Classificationindex transientInstance) {
		log.debug("saving Classificationindex instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Classificationindex persistentInstance) {
		log.debug("deleting Classificationindex instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Classificationindex findById(java.lang.Integer id) {
		log.debug("getting Classificationindex instance with id: " + id);
		try {
			Classificationindex instance = (Classificationindex) getHibernateTemplate()
					.get("com.ht706.componentLibrary.componentSpecification.bean.hbm.Classificationindex", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Classificationindex instance) {
		log.debug("finding Classificationindex instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentSpecification.bean.hbm.Classificationindex").add(Example.create(instance))
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
		log.debug("finding Classificationindex instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Classificationindex as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFacetUuid(Object facetUuid) {
		return findByProperty(FACET_UUID, facetUuid);
	}

	public List findByUniqueId(Object uniqueId) {
		return findByProperty(UNIQUE_ID, uniqueId);
	}

	public List findByAssetName(Object assetName) {
		return findByProperty(ASSET_NAME, assetName);
	}

	public List findByProvider(Object provider) {
		return findByProperty(PROVIDER, provider);
	}

	public List findByDomain(Object domain) {
		return findByProperty(DOMAIN, domain);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByLibraryUniqueId(Object libraryUniqueId) {
		return findByProperty(LIBRARY_UNIQUE_ID, libraryUniqueId);
	}

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findAll() {
		log.debug("finding all Classificationindex instances");
		try {
			String queryString = "from Classificationindex";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Classificationindex merge(Classificationindex detachedInstance) {
		log.debug("merging Classificationindex instance");
		try {
			Classificationindex result = (Classificationindex) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Classificationindex instance) {
		log.debug("attaching dirty Classificationindex instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Classificationindex instance) {
		log.debug("attaching clean Classificationindex instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public List findByHQL(String hql) {
		// TODO Auto-generated method stub
		//List queryObject = getHibernateTemplate().find(hql);
		Query queryObject = getSession().createQuery(hql);
		return queryObject.list();
		//return queryObject;
	}
	
}