/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SynonymDAOImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.dao.impl;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISynonymDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Synonym entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @extends HibernateDaoSupport 
 * @implements ISynonymDAO
 * @author yby
 */

public class SynonymDAOImpl extends HibernateDaoSupport implements ISynonymDAO {
	private static final Log log = LogFactory.getLog(SynonymDAOImpl.class);
	// property constants
	public static final String SPEC_UUID = "specUuid";
	public static final String SOURCE_ITEM = "sourceItem";
	public static final String TARGET_ITEM = "targetItem";
	public static final String DESCRIPTION = "description";

	public void save(Synonym transientInstance) {
		log.debug("saving Synonym instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Synonym persistentInstance) {
		log.debug("deleting Synonym instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Synonym findById(java.lang.String id) {
		log.debug("getting Synonym instance with id: " + id);
		try {
			Synonym instance = (Synonym) getHibernateTemplate().get("com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Synonym instance) {
		log.debug("finding Synonym instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym").add(
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
		log.debug("finding Synonym instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Synonym as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySpecUuid(Object specUuid) {
		return findByProperty(SPEC_UUID, specUuid);
	}

	public List findBySourceItem(Object sourceItem) {
		return findByProperty(SOURCE_ITEM, sourceItem);
	}

	public List findByTargetItem(Object targetItem) {
		return findByProperty(TARGET_ITEM, targetItem);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Synonym instances");
		try {
			String queryString = "from Synonym";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Synonym merge(Synonym detachedInstance) {
		log.debug("merging Synonym instance");
		try {
			Synonym result = (Synonym) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Synonym instance) {
		log.debug("attaching dirty Synonym instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Synonym instance) {
		log.debug("attaching clean Synonym instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/**
	 * 通过facetUUID和specUUID查找相关的同义词
	 * @param ids specUUID
	 * @param idf FacetUUID
	 * @return List
	 */
	public List findByFacet(String ids, String idf) {
		// TODO Auto-generated method stub
		log.debug("finding Synonym by specUuid and sourceItem");
		try{
			Criteria criteria = getSession().createCriteria("com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym");
			criteria.add(Restrictions.eq("specUuid",ids));
			criteria.add(Restrictions.eq("sourceItem", idf));
			List results = criteria.list();
			log.debug("find by ids and idf successful, reult size: " + results.size());
			return results;
		}catch (RuntimeException re){
			log.error("find by ids and idf failed", re);
			throw re;
		}
	}

	public void update(Synonym s) {
		// TODO Auto-generated method stub
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(s);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
}