package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.dao.IDepartmentDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Department entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.systemManagement.bean.hbm.Department
 * @author MyEclipse Persistence Tools
 */

public class DepartmentDAOImpl extends HibernateDaoSupport implements IDepartmentDAO {
	private static final Log log = LogFactory.getLog(DepartmentDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String PARENT_ID = "parentId";
	public static final String DESCRIPTION = "description";

	public void save(Department transientInstance) {
		log.debug("saving Department instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public void update(Department transientInstance) {
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	public void delete(Department persistentInstance) {
		log.debug("deleting Department instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Department findById(java.lang.Integer id) {
		log.debug("getting Department instance with id: " + id);
		try {
			Department instance = (Department) getHibernateTemplate().get(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Department", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Department instance) {
		log.debug("finding Department instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Department").add(
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
		log.debug("finding Department instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Department as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByParentId(Object parentId) {
		return findByProperty(PARENT_ID, parentId);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all Department instances");
		try {
			String queryString = "from Department";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Department merge(Department detachedInstance) {
		log.debug("merging Department instance");
		try {
			Department result = (Department) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Department instance) {
		log.debug("attaching dirty Department instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Department instance) {
		log.debug("attaching clean Department instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}