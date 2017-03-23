package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;
import com.ht706.componentLibrary.componentRelease.dao.IComponentrelationDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Componentrelation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see dao.Componentrelation
 * @author MyEclipse Persistence Tools
 */

public class ComponentrelationDAOImpl extends HibernateDaoSupport implements IComponentrelationDAO{
	private static final Log log = LogFactory
			.getLog(ComponentrelationDAOImpl.class);
	// property constants
	public static final String SOURCE_ASSET = "sourceAsset";
	public static final String TARGET_ASSET = "targetAsset";
	public static final String RELATION_TYPE = "relationType";
	public static final String DESCRIPTION = "description";

	public void save(Componentrelation transientInstance) {
		log.debug("saving Componentrelation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Componentrelation persistentInstance) {
		log.debug("deleting Componentrelation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Componentrelation findById(java.lang.Integer id) {
		log.debug("getting Componentrelation instance with id: " + id);
		try {
			Componentrelation instance = (Componentrelation) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Componentrelation instance) {
		log.debug("finding Componentrelation instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation")
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
		log.debug("finding Componentrelation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Componentrelation as model where model."
					+ propertyName + "= ?";
			
			Query queryObject = this.getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySourceAsset(Object sourceAsset) {
		return findByProperty(SOURCE_ASSET, sourceAsset);
	}

	public List findByTargetAsset(Object targetAsset) {
		return findByProperty(TARGET_ASSET, targetAsset);
	}

	public List findByRelationType(Object relationType) {
		return findByProperty(RELATION_TYPE, relationType);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Componentrelation instances");
		try {
			String queryString = "from Componentrelation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Componentrelation merge(Componentrelation detachedInstance) {
		log.debug("merging Componentrelation instance");
		try {
			Componentrelation result = (Componentrelation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Componentrelation instance) {
		log.debug("attaching dirty Componentrelation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Componentrelation instance) {
		log.debug("attaching clean Componentrelation instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public int deleteRelation(String assetid, String[] rassets) {
		// TODO Auto-generated method stub
		String hql="delete Componentrelation as c where c.sourceAsset='"+assetid+"' and ( c.targetAsset='"+rassets[0];
		for(int i=0;i<rassets.length;i++){
			hql+="' or c.targetAsset='"+rassets[i];
		}
		hql+="')";
		System.out.println("---------------------------"+hql);
		Query q=getSession().createQuery(hql);
		return q.executeUpdate();
	}
}