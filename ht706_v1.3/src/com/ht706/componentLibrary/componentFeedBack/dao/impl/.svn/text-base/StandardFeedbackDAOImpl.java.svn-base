/**
 * @FileName	StandardFeedbackDAOImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao.impl
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.dao.IStandardFeedbackDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Standardfeedback entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.StandardFeedback.Standardfeedback
 * @author MyEclipse Persistence Tools
 */

public class StandardFeedbackDAOImpl extends HibernateDaoSupport implements IStandardFeedbackDAO {
	private static final Log log = LogFactory.getLog(StandardFeedbackDAOImpl.class);
	// property constants
	public static final String CREATOR_ID = "creatorId";
	public static final String STATUS = "status";
	public static final String VERSION = "version";
	public static final String ACCORDING_TO_VERSION = "accordingToVersion";
	public static final String ABOUT = "about";

	public void save(StandardFeedback transientInstance) {
		log.debug("saving Standardfeedback instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void update(StandardFeedback transientInstance) {
		log.debug("updating Standardfeedback instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public void delete(StandardFeedback persistentInstance) {
		log.debug("deleting Standardfeedback instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StandardFeedback findById(java.lang.Integer id) {
		log.debug("getting Standardfeedback instance with id: " + id);
		try {
			StandardFeedback instance = (StandardFeedback) getSession().get(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<StandardFeedback> findByExample(StandardFeedback instance) {
		log.debug("finding Standardfeedback instance by example");
		try {
			List<StandardFeedback> results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<StandardFeedback> findByProperty(String propertyName, Object value) {
		log.debug("finding StandardFeedback instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from StandardFeedback as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<StandardFeedback> findByCreatorId(Object creatorId) {
		return findByProperty(CREATOR_ID, creatorId);
	}

	public List<StandardFeedback> findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}
	
	public List<StandardFeedback> findByVersion(Object version) {
		return findByProperty(VERSION, version);
	}

	public List<StandardFeedback> findByAccordingToVersion(Object accordingToVersion) {
		return findByProperty(ACCORDING_TO_VERSION, accordingToVersion);
	}

	public List<StandardFeedback> findByAbout(Object about) {
		return findByProperty(ABOUT, about);
	}

	public List<StandardFeedback> findAll() {
		log.debug("finding all StandardFeedback instances");
		try {
			String queryString = "from StandardFeedback";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StandardFeedback merge(StandardFeedback detachedInstance) {
		log.debug("merging Standardfeedback instance");
		try {
			StandardFeedback result = (StandardFeedback) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StandardFeedback instance) {
		log.debug("attaching dirty Standardfeedback instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StandardFeedback instance) {
		log.debug("attaching clean Standardfeedback instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	//通过记录的起始索引和偏移量查找记录
	//start:为记录的起始索引号，offset:即为要取的记录条数
	public List<StandardFeedback> findByNumber(int start, int offset) {
		log.debug("finding appointed index StandardFeedback instances");
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from StandardFeedback";
			Query qw = s.createQuery(queryString);
			qw.setFirstResult(start);
			qw.setMaxResults(offset);			
			return qw.list();
		}
		catch (RuntimeException re) {
			log.error("find appointed index failed", re);
			throw re;
		}finally{
			s.close();
		}
	}
}