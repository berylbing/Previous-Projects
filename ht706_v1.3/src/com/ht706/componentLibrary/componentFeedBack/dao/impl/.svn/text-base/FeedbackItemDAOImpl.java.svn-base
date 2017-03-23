/**
 * @FileName	FeedbackItemDAOImpl.java
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

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.dao.IFeedbackItemDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Feedbackitem entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.FeedbackItem.Feedbackitem
 * @author MyEclipse Persistence Tools
 */

public class FeedbackItemDAOImpl extends HibernateDaoSupport implements IFeedbackItemDAO {
	private static final Log log = LogFactory.getLog(FeedbackItemDAOImpl.class);
	// property constants
	public static final String ITEM_NAME = "itemName";
	public static final String SCORE = "score";
	public static final String DESCRIPTION = "description";

	public void save(FeedbackItem transientInstance) {
		log.debug("saving Feedbackitem instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(FeedbackItem persistentInstance) {
		log.debug("deleting Feedbackitem instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public FeedbackItem findById(java.lang.Integer id) {
		log.debug("getting Feedbackitem instance with id: " + id);
		try {
			FeedbackItem instance = (FeedbackItem) getSession().get(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(FeedbackItem instance) {
		log.debug("finding Feedbackitem instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem")
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
		log.debug("finding Feedbackitem instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from FeedbackItem as model where model."
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

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Feedbackitem instances");
		try {
			String queryString = "from FeedbackItem";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public FeedbackItem merge(FeedbackItem detachedInstance) {
		log.debug("merging FeedbackItem instance");
		try {
			FeedbackItem result = (FeedbackItem) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(FeedbackItem instance) {
		log.debug("attaching dirty FeedbackItem instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(FeedbackItem instance) {
		log.debug("attaching clean FeedbackItem instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}