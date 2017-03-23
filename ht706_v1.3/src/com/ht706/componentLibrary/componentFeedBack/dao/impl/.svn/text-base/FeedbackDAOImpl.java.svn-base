/**
 * @FileName	FeedbackDAOImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao.impl
 * @author º÷¿÷À…
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

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.dao.IFeedbackDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Feedback entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Feedback
 * @author MyEclipse Persistence Tools
 */

public class FeedbackDAOImpl extends HibernateDaoSupport implements IFeedbackDAO {
	private static final Log log = LogFactory.getLog(FeedbackDAOImpl.class);
	// property constants
	public static final String REGISTRY_ID = "registryId";
	public static final String DESCRIPTION = "description";
	public static final String SF_ID = "sfId";
	public static final String PROVIDER = "provider";
	public static final String FILE = "file";
	public static final String BACKGROUND = "background";
	public static final String ENVIROMENT = "enviroment";
	public static final String STATUS = "status";

	public void save(Feedback transientInstance) {
		log.debug("saving Feedback instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void update(Feedback transientInstance) {
		log.debug("updating Feedback instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public void delete(Feedback persistentInstance) {
		log.debug("deleting Feedback instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Feedback findById(java.lang.String recordId) {
		log.debug("getting Feedback instance with recordId: " + recordId);
		try {
			Feedback instance = (Feedback) getSession().get(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback", recordId);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Feedback instance) {
		log.debug("finding Feedback instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback").add(
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
		log.debug("finding Feedback instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Feedback as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRegistryId(Object registryId) {
		return findByProperty(REGISTRY_ID, registryId);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findBySfId(Object sfId) {
		return findByProperty(SF_ID, sfId);
	}

	public List findByProvider(Object provider) {
		return findByProperty(PROVIDER, provider);
	}

	public List findByFile(Object file) {
		return findByProperty(FILE, file);
	}

	public List findByBackground(Object background) {
		return findByProperty(BACKGROUND, background);
	}

	public List findByEnviroment(Object enviroment) {
		return findByProperty(ENVIROMENT, enviroment);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<Feedback> findAll() {
		log.debug("finding all Feedback instances");
		try {
			String queryString = "from Feedback";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Feedback merge(Feedback detachedInstance) {
		log.debug("merging Feedback instance");
		try {
			Feedback result = (Feedback) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Feedback instance) {
		log.debug("attaching dirty Feedback instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Feedback instance) {
		log.debug("attaching clean Feedback instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List<Feedback> findByNumber(int start, int offset) {
		log.debug("finding appointed index Feedback instances");
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from Feedback as model where model.status=2";
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