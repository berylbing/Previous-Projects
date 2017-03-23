/**
 * @FileName	StandardFeedbackItemDAOImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao.impl
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.dao.IStandardFeedbackItemDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Standardfeedbackitem entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.StandardFeedbackItem.Standardfeedbackitem
 * @author MyEclipse Persistence Tools
 */

public class StandardFeedbackItemDAOImpl extends HibernateDaoSupport implements IStandardFeedbackItemDAO {
	private static final Log log = LogFactory
			.getLog(StandardFeedbackItemDAOImpl.class);
	// property constants
	public static final String ITEM_NAME = "itemName";
	public static final String SCORE_STANDARD = "scoreStandard";
	public static final String DETAIL = "detail";
	public static final String DESCRIPTION = "description";

	public void save(StandardFeedbackItem transientInstance) {
		log.debug("saving Standardfeedbackitem instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void update(StandardFeedbackItem transientInstance) {
		log.debug("updating Standardfeedbackitem instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public void delete(StandardFeedbackItem persistentInstance) {
		log.debug("deleting Standardfeedbackitem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StandardFeedbackItem findById(java.lang.Integer id) {
		log.debug("getting Standardfeedbackitem instance with id: " + id);
		try {
			StandardFeedbackItem instance = (StandardFeedbackItem) getSession()
					.get(
							"com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem",
							id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StandardFeedbackItem instance) {
		log.debug("finding Standardfeedbackitem instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem")
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
		log.debug("finding Standardfeedbackitem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from StandardFeedbackItem as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByItemName(Object itemName) {
		return findByProperty(ITEM_NAME, itemName);
	}

	public List findByScoreStandard(Object scoreStandard) {
		return findByProperty(SCORE_STANDARD, scoreStandard);
	}

	public List findByDetail(Object detail) {
		return findByProperty(DETAIL, detail);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Standardfeedbackitem instances");
		try {
			String queryString = "from StandardFeedbackItem";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StandardFeedbackItem merge(StandardFeedbackItem detachedInstance) {
		log.debug("merging Standardfeedbackitem instance");
		try {
			StandardFeedbackItem result = (StandardFeedbackItem) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StandardFeedbackItem instance) {
		log.debug("attaching dirty Standardfeedbackitem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StandardFeedbackItem instance) {
		log.debug("attaching clean Standardfeedbackitem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}