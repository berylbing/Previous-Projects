/**
 * Copyright (c) 2010, 
 * 
 * @FileName: StructiondiagramDAOImpl.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Structiondiagram;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.IStructiondiagramDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Structiondiagram entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @extends HibernateDaoSupport 
 * @implements IStructiondiagramDAO
 * @author yby
 */

public class StructiondiagramDAOImpl extends HibernateDaoSupport implements IStructiondiagramDAO {
	private static final Log log = LogFactory.getLog(StructiondiagramDAOImpl.class);
	// property constants
	public static final String LIB_ID = "libId";
	public static final String LIB_IP = "libIp";
	public static final String MAX_LENGTH = "maxLength";

	public void save(Structiondiagram transientInstance) {
		log.debug("saving Structiondiagram instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Structiondiagram persistentInstance) {
		log.debug("deleting Structiondiagram instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Structiondiagram findById(java.lang.Integer id) {
		log.debug("getting Structiondiagram instance with id: " + id);
		try {
			Structiondiagram instance = (Structiondiagram) getHibernateTemplate().get(
					"com.ht706.componentLibrary.componentSpecification.bean.hbm.Structiondiagram", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Structiondiagram instance) {
		log.debug("finding Structiondiagram instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Structiondiagram")
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
		log.debug("finding Structiondiagram instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Structiondiagram as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLibId(Object libId) {
		return findByProperty(LIB_ID, libId);
	}

	public List findByLibIp(Object libIp) {
		return findByProperty(LIB_IP, libIp);
	}

	public List findByMaxLength(Object maxLength) {
		return findByProperty(MAX_LENGTH, maxLength);
	}

	public List findAll() {
		log.debug("finding all Structiondiagram instances");
		try {
			String queryString = "from Structiondiagram";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Structiondiagram merge(Structiondiagram detachedInstance) {
		log.debug("merging Structiondiagram instance");
		try {
			Structiondiagram result = (Structiondiagram) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Structiondiagram instance) {
		log.debug("attaching dirty Structiondiagram instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Structiondiagram instance) {
		log.debug("attaching clean Structiondiagram instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}