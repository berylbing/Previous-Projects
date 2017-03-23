package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect;
import com.ht706.componentLibrary.componentRelease.dao.ICosteffectDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Costeffect entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see dao.Costeffect
 * @author MyEclipse Persistence Tools
 */

public class CosteffectDAOImpl extends HibernateDaoSupport implements ICosteffectDAO{
	private static final Log log = LogFactory.getLog(CosteffectDAOImpl.class);
	// property constants
	public static final String UNIQUE_ID = "uniqueId";
	public static final String ESTIMATOR = "estimator";
	public static final String SR = "sr";
	public static final String L = "l";
	public static final String N = "n";
	public static final String CR = "cr";
	public static final String TA = "ta";
	public static final String CA = "ca";
	public static final String CM = "cm";
	public static final String CR_RISK = "crRisk";
	public static final String CA_RISK = "caRisk";
	public static final String CM_RISK = "cmRisk";
	public static final String _LRISK = "LRisk";
	public static final String _NRISK = "NRisk";
	public static final String I = "i";
	public static final String UNIT = "unit";

	public void save(Costeffect transientInstance) {
		log.debug("saving Costeffect instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Costeffect persistentInstance) {
		log.debug("deleting Costeffect instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Costeffect findById(java.lang.Integer id) {
		log.debug("getting Costeffect instance with id: " + id);
		try {
			Costeffect instance = (Costeffect) getSession().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Costeffect instance) {
		log.debug("finding Costeffect instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect").add(
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
		log.debug("finding Costeffect instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Costeffect as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUniqueId(Object uniqueId) {
		return findByProperty(UNIQUE_ID, uniqueId);
	}

	public List findByEstimator(Object estimator) {
		return findByProperty(ESTIMATOR, estimator);
	}

	public List findBySr(Object sr) {
		return findByProperty(SR, sr);
	}

	public List findByL(Object l) {
		return findByProperty(L, l);
	}

	public List findByN(Object n) {
		return findByProperty(N, n);
	}

	public List findByCr(Object cr) {
		return findByProperty(CR, cr);
	}

	public List findByTa(Object ta) {
		return findByProperty(TA, ta);
	}

	public List findByCa(Object ca) {
		return findByProperty(CA, ca);
	}

	public List findByCm(Object cm) {
		return findByProperty(CM, cm);
	}

	public List findByCrRisk(Object crRisk) {
		return findByProperty(CR_RISK, crRisk);
	}

	public List findByCaRisk(Object caRisk) {
		return findByProperty(CA_RISK, caRisk);
	}

	public List findByCmRisk(Object cmRisk) {
		return findByProperty(CM_RISK, cmRisk);
	}

	public List findByLRisk(Object LRisk) {
		return findByProperty(_LRISK, LRisk);
	}

	public List findByNRisk(Object NRisk) {
		return findByProperty(_NRISK, NRisk);
	}

	public List findByI(Object i) {
		return findByProperty(I, i);
	}

	public List findByUnit(Object unit) {
		return findByProperty(UNIT, unit);
	}

	public List findAll() {
		log.debug("finding all Costeffect instances");
		try {
			String queryString = "from Costeffect";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Costeffect merge(Costeffect detachedInstance) {
		log.debug("merging Costeffect instance");
		try {
			Costeffect result = (Costeffect) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Costeffect instance) {
		log.debug("attaching dirty Costeffect instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Costeffect instance) {
		log.debug("attaching clean Costeffect instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}