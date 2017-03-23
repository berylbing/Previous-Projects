package com.ht706.componentLibrary.componentFeedBack.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemTrace;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemTraceDAO;

/**
 * ProblemTrace DAO接口实现类
 * @method 	save			在数据库保存一个问题追踪
 * @method 	update			在数据库更新一个问题追踪
 * @method 	delete			通过RID删除一个问题追踪
 */



public class ProblemTraceDAOImpl extends HibernateDaoSupport implements IProblemTraceDAO {
	private static final Log log = LogFactory.getLog(ProblemTraceDAOImpl.class);
	// property constants
	public static final String REPORT_ID = "reportId";
	public static final String PERSON = "person";
	public static final String CONTENT = "content";
	public static final String STATUS = "status";

	public void save(ProblemTrace transientInstance) {
		log.debug("saving ProblemTrace instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProblemTrace persistentInstance) {
		log.debug("deleting ProblemTrace instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProblemTrace findById(java.lang.Integer id) {
		log.debug("getting ProblemTrace instance with id: " + id);
		try {
			ProblemTrace instance = (ProblemTrace) getSession().get(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemTrace", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProblemTrace instance) {
		log.debug("finding ProblemTrace instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemTrace").add(
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
		log.debug("finding ProblemTrace instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ProblemTrace as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByReportId(Object reportId) {
		return findByProperty(REPORT_ID, reportId);
	}

	public List findByPerson(Object person) {
		return findByProperty(PERSON, person);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all ProblemTrace instances");
		try {
			String queryString = "from ProblemTrace";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ProblemTrace merge(ProblemTrace detachedInstance) {
		log.debug("merging ProblemTrace instance");
		try {
			ProblemTrace result = (ProblemTrace) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ProblemTrace instance) {
		log.debug("attaching dirty ProblemTrace instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProblemTrace instance) {
		log.debug("attaching clean ProblemTrace instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}