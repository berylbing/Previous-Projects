package com.ht706.componentLibrary.componentRelease.dao.impl;


import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;

import com.ht706.componentLibrary.componentRelease.dao.IElementDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Element entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Element
 * @author MyEclipse Persistence Tools
 */

public class ElementDAOImpl extends HibernateDaoSupport implements IElementDAO{
	private static final Log log = LogFactory.getLog(Element.class);
	// property constants
	public static final String NAME = "name";
	public static final String ELEMENT_TYPE = "elementType";
	public static final String MEDIA = "media";
	public static final String CERTIFICATION_STATE = "certificationState";
	public static final String PROVIDER = "provider";
	public static final String DESCRIPTION = "description";

	public void save(Element transientInstance) {
		log.debug("saving Element instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Element persistentInstance) {
		log.debug("deleting Element instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Element findById(java.lang.String id) {
		log.debug("getting Element instance with id: " + id);
		try {
			Element instance = (Element) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Element", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Element instance) {
		log.debug("finding Element instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Element").add(
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
		log.debug("finding Element instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Element as model where model."
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

	public List findByElementType(Object elementType) {
		return findByProperty(ELEMENT_TYPE, elementType);
	}

	public List findByMedia(Object media) {
		return findByProperty(MEDIA, media);
	}

	public List findByCertificationState(Object certificationState) {
		return findByProperty(CERTIFICATION_STATE, certificationState);
	}

	public List findByProvider(Object provider) {
		return findByProperty(PROVIDER, provider);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Element instances");
		try {
			String queryString = "from Element";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Element merge(Element detachedInstance) {
		log.debug("merging Element instance");
		try {
			Element result = (Element) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Element instance) {
		log.debug("attaching dirty Element instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Element instance) {
		log.debug("attaching clean Element instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void update(Element c) {
		// TODO Auto-generated method stub
		log.debug("updating Element instance");
		try {
			getSession().update(c);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
}