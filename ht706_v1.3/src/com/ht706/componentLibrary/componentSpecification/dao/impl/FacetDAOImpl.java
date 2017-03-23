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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.IFacetDAO;

/**
 * A data access object (DAO) providing persistence and search support for Facet
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @extends: HibernateDaoSupport 
 * @implements: IFacetDAO
 * @author: yby
 */

public class FacetDAOImpl extends HibernateDaoSupport implements IFacetDAO {
	private static final Log log = LogFactory.getLog(FacetDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String NODE_TYPE = "nodeType";
	public static final String PARENT_NODE = "parentNode";
	public static final String IS_LEAF = "isLeaf";
	public static final String LEVEL = "level";
	public static final String RELEASE_TYPE = "releaseType";
	public static final String CREATOR = "creator";
	public static final String DESCRIPTION = "description";

	public void save(Facet transientInstance) {
		log.debug("saving Facet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Facet persistentInstance) {
		log.debug("deleting Facet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public void update(Facet facet) {
		// TODO Auto-generated method stub
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(facet);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public Facet findById(FacetId id) {
		log.debug("getting Facet instance with id: " + id);
		try {
			Facet instance = (Facet) getHibernateTemplate().get("com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Facet instance) {
		log.debug("finding Facet instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet").add(
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
		log.debug("finding Facet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Facet as model where model."
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

	public List findByNodeType(Object nodeType) {
		return findByProperty(NODE_TYPE, nodeType);
	}

	public List findByParentNode(Object parentNode) {
		return findByProperty(PARENT_NODE, parentNode);
	}

	public List findByIsLeaf(Object isLeaf) {
		return findByProperty(IS_LEAF, isLeaf);
	}

	public List findByLevel(Object level) {
		return findByProperty(LEVEL, level);
	}

	public List findByReleaseType(Object releaseType) {
		return findByProperty(RELEASE_TYPE, releaseType);
	}

	public List findByCreator(Object creator) {
		return findByProperty(CREATOR, creator);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Facet instances");
		try {
			String queryString = "from Facet";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Facet merge(Facet detachedInstance) {
		log.debug("merging Facet instance");
		try {
			Facet result = (Facet) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Facet instance) {
		log.debug("attaching dirty Facet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Facet instance) {
		log.debug("attaching clean Facet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}


	
}