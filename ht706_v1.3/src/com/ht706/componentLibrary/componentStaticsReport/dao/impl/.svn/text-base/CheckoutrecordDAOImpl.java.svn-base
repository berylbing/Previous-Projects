package com.ht706.componentLibrary.componentStaticsReport.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.componentStaticsReport.dao.ICheckoutrecordDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Checkoutrecord entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.componentSpecification.dao.impl.Checkoutrecord
 * @author MyEclipse Persistence Tools
 */

public class CheckoutrecordDAOImpl extends HibernateDaoSupport implements ICheckoutrecordDAO{
	private static final Log log = LogFactory.getLog(CheckoutrecordDAOImpl.class);
	// property constants
	public static final String UNIQUE_ID = "uniqueId";
	public static final String PROPOSER = "proposer";
	public static final String TEL = "tel";
	public static final String EMAIL = "email";
	public static final String PURPOSE = "purpose";
	public static final String REASON = "reason";
	public static final String AGREEMENT = "agreement";
	public static final String PROJECT = "project";
	public static final String RESULT = "result";
	public static final String STATUS = "status";

	protected void initDao() {
		// do nothing
	}

	public void save(Checkoutrecord transientInstance) {
		log.debug("saving Checkoutrecord instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Checkoutrecord persistentInstance) {
		log.debug("deleting Checkoutrecord instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Checkoutrecord findById(java.lang.String id) {
		log.debug("getting Checkoutrecord instance with id: " + id);
		try {
			Checkoutrecord instance = (Checkoutrecord) getHibernateTemplate()
					.get(
							"com.ht706.componentLibrary.componentSpecification.dao.impl.Checkoutrecord",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Checkoutrecord instance) {
		log.debug("finding Checkoutrecord instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Checkoutrecord instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Checkoutrecord as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUniqueId(Object uniqueId) {
		return findByProperty(UNIQUE_ID, uniqueId);
	}

	public List findByProposer(Object proposer) {
		return findByProperty(PROPOSER, proposer);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByPurpose(Object purpose) {
		return findByProperty(PURPOSE, purpose);
	}

	public List findByReason(Object reason) {
		return findByProperty(REASON, reason);
	}

	public List findByAgreement(Object agreement) {
		return findByProperty(AGREEMENT, agreement);
	}

	public List findByProject(Object project) {
		return findByProperty(PROJECT, project);
	}

	public List findByResult(Object result) {
		return findByProperty(RESULT, result);
	}
	public List findByStatus(Object status){
		return findByProperty(STATUS,status);
	}
	public List findAll() {
		log.debug("finding all Checkoutrecord instances");
		try {
			String queryString = "from Checkoutrecord";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Checkoutrecord merge(Checkoutrecord detachedInstance) {
		log.debug("merging Checkoutrecord instance");
		try {
			Checkoutrecord result = (Checkoutrecord) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Checkoutrecord instance) {
		log.debug("attaching dirty Checkoutrecord instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Checkoutrecord instance) {
		log.debug("attaching clean Checkoutrecord instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CheckoutrecordDAOImpl getFromApplicationContext(
			ApplicationContext ctx) {
		return (CheckoutrecordDAOImpl) ctx.getBean("CheckoutrecordDAO");
	}
}