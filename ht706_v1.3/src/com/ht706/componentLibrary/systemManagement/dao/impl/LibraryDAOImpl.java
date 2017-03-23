package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
import com.ht706.componentLibrary.systemManagement.dao.ILibraryDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Library entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.systemManagement.bean.hbm.Library
 * @author MyEclipse Persistence Tools
 */

public class LibraryDAOImpl extends HibernateDaoSupport implements ILibraryDAO {
	private static final Log log = LogFactory.getLog(LibraryDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String CERTIFICATION_METHODS = "certificationMethods";
	public static final String ELECTRONIC_ADDRESS = "electronicAddress";
	public static final String CONTACT_METHOD = "contactMethod";
	public static final String LIBRARY_CLASSIFICATION_MECHANISM = "libraryClassificationMechanism";
	public static final String LIBRARY_METRICS = "libraryMetrics";
	public static final String LIBRARY_RESTRICATIONS = "libraryRestrications";

	public void save(Library transientInstance) {
		log.debug("saving Library instance");
		try {

			getHibernateTemplate().save(transientInstance);

			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public void update(Library transientInstance) {
		log.debug("saving Library instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void delete(Library persistentInstance) {
		log.debug("deleting Library instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Library findById(java.lang.String id) {
		log.debug("getting Library instance with id: " + id);
		try {
			Library instance = (Library) getHibernateTemplate().get(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Library", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Library instance) {
		log.debug("finding Library instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Library").add(
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
		log.debug("finding Library instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Library as model where model."
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

	public List findByCertificationMethods(Object certificationMethods) {
		return findByProperty(CERTIFICATION_METHODS, certificationMethods);
	}

	public List findByElectronicAddress(Object electronicAddress) {
		return findByProperty(ELECTRONIC_ADDRESS, electronicAddress);
	}

	public List findByContactMethod(Object contactMethod) {
		return findByProperty(CONTACT_METHOD, contactMethod);
	}

	public List findByLibraryClassificationMechanism(
			Object libraryClassificationMechanism) {
		return findByProperty(LIBRARY_CLASSIFICATION_MECHANISM,
				libraryClassificationMechanism);
	}

	public List findByLibraryMetrics(Object libraryMetrics) {
		return findByProperty(LIBRARY_METRICS, libraryMetrics);
	}

	public List findByLibraryRestrications(Object libraryRestrications) {
		return findByProperty(LIBRARY_RESTRICATIONS, libraryRestrications);
	}

	public List findAll() {
		log.debug("finding all Library instances");
		try {
			String queryString = "from Library";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Library merge(Library detachedInstance) {
		log.debug("merging Library instance");
		try {
			Library result = (Library) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Library instance) {
		log.debug("attaching dirty Library instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Library instance) {
		log.debug("attaching clean Library instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}