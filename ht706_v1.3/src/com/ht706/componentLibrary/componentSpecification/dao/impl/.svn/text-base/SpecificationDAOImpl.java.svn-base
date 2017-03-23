/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationDAOImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.dao.impl;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.dao.impl;

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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Specification entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @extends HibernateDaoSupport 
 * @implements ISpecificationDAO
 * @author yby
 */

public class SpecificationDAOImpl extends HibernateDaoSupport implements ISpecificationDAO {
	private static final Log log = LogFactory.getLog(SpecificationDAOImpl.class);
	// property constants
	public static final String PRECEDE_SPEC = "precedeSpec";
	public static final String VERSION = "version";
	public static final String RELEASE_TYPE = "releaseType";
	public static final String CREATOR = "creator";
	public static final String STATUS = "status";
	public static final String REASON = "reason";
	public static final String DESCRIPTION = "description";

	

	public void save(Specification transientInstance) {
		log.debug("saving Specification instance");
		try {			
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Specification persistentInstance) {
		log.debug("deleting Specification instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Specification findById(java.lang.String id) {
		log.debug("getting Specification instance with id: " + id);
		try {
			Specification instance = (Specification) getHibernateTemplate().get(
					"com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Specification instance) {
		log.debug("finding Specification instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification")
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
		log.debug("finding Specification instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Specification as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPrecedeSpec(Object precedeSpec) {
		return findByProperty(PRECEDE_SPEC, precedeSpec);
	}

	public List findByVersion(Object version) {
		return findByProperty(VERSION, version);
	}

	public List findByReleaseType(Object releaseType) {
		return findByProperty(RELEASE_TYPE, releaseType);
	}

	public List findByCreator(Object creator) {
		return findByProperty(CREATOR, creator);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByReason(Object reason) {
		return findByProperty(REASON, reason);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Specification instances");
		try {
			String queryString = "from Specification";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Specification merge(Specification detachedInstance) {
		log.debug("merging Specification instance");
		try {
			Specification result = (Specification) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Specification instance) {
		log.debug("attaching dirty Specification instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Specification instance) {
		log.debug("attaching clean Specification instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void update(Specification specification) {
		// TODO Auto-generated method stub
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(specification);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	//通过记录的起始索引和偏移量查找记录
	//start:为记录的起始索引号，offset:即为要取的记录条数
	public List<Specification> findByNumber(int start, int offset) {
		log.debug("finding appointed index Specification instances");
		
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from Specification";
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
			//sf.close();
		}
	}
}