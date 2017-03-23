/**
 * Copyright (c) 2010, 
 * 
 * @FileName: RelationtypeDAOImpl.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.RelationtypeId;
import com.ht706.componentLibrary.componentSpecification.dao.IFacetDAO;
import com.ht706.componentLibrary.componentSpecification.dao.IRelationtypeDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Relationtype entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @extends: HibernateDaoSupport
 * @implements:IRelationtypeDAO
 * @author yby
 */

public class RelationtypeDAOImpl extends HibernateDaoSupport implements IRelationtypeDAO {
	private static final Log log = LogFactory.getLog(RelationtypeDAOImpl.class);
	// property constants
	public static final String RELATION_NAME = "relationName";
	public static final String RELATION_TYPE = "relationType";
	public static final String DESCRIPTION = "description";

	public void save(Relationtype transientInstance) {
		log.debug("saving Relationtype instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Relationtype persistentInstance) {
		log.debug("deleting Relationtype instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Relationtype findById(RelationtypeId id) {
		log.debug("getting Relationtype instance with id: " + id);
		try {
			Relationtype instance = (Relationtype) getHibernateTemplate().get(
					"com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Relationtype instance) {
		log.debug("finding Relationtype instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype").add(
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
		log.debug("finding Relationtype instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Relationtype as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRelationName(Object relationName) {
		return findByProperty(RELATION_NAME, relationName);
	}

	public List findByRelationType(Object relationType) {
		return findByProperty(RELATION_TYPE, relationType);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Relationtype instances");
		try {
			String queryString = "from Relationtype";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Relationtype merge(Relationtype detachedInstance) {
		log.debug("merging Relationtype instance");
		try {
			Relationtype result = (Relationtype) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Relationtype instance) {
		log.debug("attaching dirty Relationtype instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Relationtype instance) {
		log.debug("attaching clean Relationtype instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void update(Relationtype relationtype) {
		// TODO Auto-generated method stub
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(relationtype);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
}