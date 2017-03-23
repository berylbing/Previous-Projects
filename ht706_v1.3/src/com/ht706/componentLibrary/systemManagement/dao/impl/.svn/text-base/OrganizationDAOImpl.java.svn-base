package com.ht706.componentLibrary.systemManagement.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Organization entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.ht706.componentLibrary.systemManagement.bean.hbm.Organization
 * @author MyEclipse Persistence Tools
 */

public class OrganizationDAOImpl extends HibernateDaoSupport implements IOrganizationDAO {
	private static final Logger log = Logger.getLogger(OrganizationDAOImpl.class);
	// property constants
	public static final String USER_TYPE = "userType";
	public static final String NAME = "name";
	public static final String USERNAME = "userName";
	public static final String PASSWORD = "password";
	public static final String ADDRESS = "address";
	public static final String EMAIL = "email";
	public static final String FAX = "fax";
	public static final String TELEPHONE = "telephone";
	public static final String DEPARTMENT_ID = "departmentId";
	public static final String SECURITY_LEVEL = "securityLevel";

	public void save(Organization transientInstance) {
		log.debug("saving Organization instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	public void update(Authorization transientInstance) {
		log.debug("updating Authorization instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	public void delete(Organization persistentInstance) {
		log.debug("deleting Organization instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Organization findById(java.lang.Integer id) {
		log.debug("getting Organization instance with id: " + id);
		try {
			Organization instance = (Organization) getHibernateTemplate().get(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Organization", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Organization instance) {
		log.debug("finding Organization instance by example");
		try {
			List results = getSession().createCriteria(
					"com.ht706.componentLibrary.systemManagement.bean.hbm.Organization")
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
		log.debug("finding Organization instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Organization as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserType(Object userType) {
		return findByProperty(USER_TYPE, userType);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}
	public List findByUserName(Object name) {
		return findByProperty(USERNAME, name);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByFax(Object fax) {
		return findByProperty(FAX, fax);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByDepartmentId(Object departmentId) {
		return findByProperty(DEPARTMENT_ID, departmentId);
	}

	public List findBySecurityLevel(Object securityLevel) {
		return findByProperty(SECURITY_LEVEL, securityLevel);
	}

	public List findAll() {
		log.debug("finding all Organization instances");
		try {
			String queryString = "from Organization";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Organization merge(Organization detachedInstance) {
		log.debug("merging Organization instance");
		try {
			Organization result = (Organization) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Organization instance) {
		log.debug("attaching dirty Organization instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Organization instance) {
		log.debug("attaching clean Organization instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public void update(Organization transientInstance) {
		log.debug("updating Organization instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		
	}
}