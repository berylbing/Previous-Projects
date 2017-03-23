package com.ht706.componentLibrary.myFavorite.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.dao.IMyfavoriteDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Myfavorite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see dao.Myfavorite
 * @author MyEclipse Persistence Tools
 */

public class MyfavoriteDAOImpl extends HibernateDaoSupport implements IMyfavoriteDAO{
	private static final Log log = LogFactory.getLog(MyfavoriteDAOImpl.class);
	// property constants
	public static final String ASSET_UNIQUE_ID = "assetUniqueId";
	public static final String ASSET_NAME = "assetName";
	public static final String URL = "url";
	public static final String TYPE_IS = "typeIs";
	public static final String NODE_NAME = "nodeName";
	public static final String PARENT_NODE = "parentNode";
	public static final String DESCRIPTION = "description";
	public static final String USER_ID = "userId";

	public void save(Myfavorite transientInstance) {
		log.debug("saving Myfavorite instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Myfavorite persistentInstance) {
		log.debug("deleting Myfavorite instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Myfavorite findById(String id) {
		log.debug("getting Myfavorite instance with id: " + id);
		try {
			Myfavorite instance = (Myfavorite) getSession().get(
					"com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Myfavorite instance) {
		log.debug("finding Myfavorite instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite").add(
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
		log.debug("finding Myfavorite instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Myfavorite as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAssetUniqueId(Object assetUniqueId) {
		return findByProperty(ASSET_UNIQUE_ID, assetUniqueId);
	}

	public List findByAssetName(Object assetName) {
		return findByProperty(ASSET_NAME, assetName);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByTypeIs(Object typeIs) {
		return findByProperty(TYPE_IS, typeIs);
	}

	public List findByNodeName(Object nodeName) {
		return findByProperty(NODE_NAME, nodeName);
	}

	public List findByParentNode(java.lang.String parentNode) {
		log.debug("getting Myfavorite instance with ParentNode: " + parentNode);
		try {
			String queryString = "from Myfavorite as model where model."
					+ PARENT_NODE + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, parentNode);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Myfavorite instances");
		try {
			String queryString = "from Myfavorite";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Myfavorite merge(Myfavorite detachedInstance) {
		log.debug("merging Myfavorite instance");
		try {
			Myfavorite result = (Myfavorite) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Myfavorite instance) {
		log.debug("attaching dirty Myfavorite instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Myfavorite instance) {
		log.debug("attaching clean Myfavorite instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		// TODO Auto-generated method stub
		return findByProperty(USER_ID, userId);
	}
	
	public void update(Myfavorite transientInstance) {
		// TODO Auto-generated method stub
		log.debug("updating Myfavorite instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

}