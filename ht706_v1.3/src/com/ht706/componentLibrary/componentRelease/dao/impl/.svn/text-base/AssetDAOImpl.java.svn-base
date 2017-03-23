package com.ht706.componentLibrary.componentRelease.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;

/**
 * A data access object (DAO) providing persistence and search support for Asset
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.ht706.componentLibrary.hibernateDAO.Asset
 * @author MyEclipse Persistence Tools
 */

public class AssetDAOImpl extends HibernateDaoSupport implements IAssetDAO{
	private static final Log log = LogFactory.getLog(AssetDAOImpl.class);
	// property constants
	public static final String NAME = "name";
	public static final String ABSTRACT_ = "abstract_";
	public static final String COST = "cost";
	public static final String DOMAIN = "domain";
	public static final String DISTRIBUTION_STATEMENT = "distributionStatement";
	public static final String LANGUAGE = "language";
	public static final String SECURITY_CLASSIFICATION = "securityClassification";
	public static final String TARGET_ENVIRONMENT = "targetEnvironment";
	public static final String HISTORY = "history";
	public static final String KEYWORD = "keyword";
	public static final String REFERENCE = "reference";
	public static final String RESTRICTION = "restriction";
	public static final String TRANSFER_SIZE = "transferSize";
	public static final String VERSION = "version";
	public static final String CLASSIFICATION_MACHANISM = "classificationMachanism";
	public static final String AGENCY_PUBLICATION_NUMBER = "agencyPublicationNumber";
	public static final String COMPLIANCE_TO_STANDARDS = "complianceToStandards";
	public static final String WARRANTIES = "warranties";
	public static final String RETRIEVABLE_EXTENT = "retrievableExtent";
	public static final String URL = "url";
	public static final String PROVIDER = "provider";
	public static final String APPROVED_STATE = "approvedState";
	public static final String CERTIFICATION = "certification";
	public static final String GRADE = "grade";

	public void save(Asset transientInstance) {
		log.debug("saving Asset instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Asset persistentInstance) {
		log.debug("deleting Asset instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Asset findById(java.lang.String id) {
		log.debug("getting Asset instance with id: " + id);
		try {
			Asset instance = (Asset) getHibernateTemplate().get(
					"com.ht706.componentLibrary.componentRelease.bean.hbm.Asset", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Asset instance) {
		log.debug("finding Asset instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Asset instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Asset as model where model."
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

	public List findByAbstract_(Object abstract_) {
		return findByProperty(ABSTRACT_, abstract_);
	}

	public List findByCost(Object cost) {
		return findByProperty(COST, cost);
	}

	public List findByDomain(Object domain) {
		return findByProperty(DOMAIN, domain);
	}

	public List findByDistributionStatement(Object distributionStatement) {
		return findByProperty(DISTRIBUTION_STATEMENT, distributionStatement);
	}

	public List findByLanguage(Object language) {
		return findByProperty(LANGUAGE, language);
	}

	public List findBySecurityClassification(Object securityClassification) {
		return findByProperty(SECURITY_CLASSIFICATION, securityClassification);
	}

	public List findByTargetEnvironment(Object targetEnvironment) {
		return findByProperty(TARGET_ENVIRONMENT, targetEnvironment);
	}

	public List findByHistory(Object history) {
		return findByProperty(HISTORY, history);
	}

	public List findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List findByReference(Object reference) {
		return findByProperty(REFERENCE, reference);
	}

	public List findByRestriction(Object restriction) {
		return findByProperty(RESTRICTION, restriction);
	}

	public List findByTransferSize(Object transferSize) {
		return findByProperty(TRANSFER_SIZE, transferSize);
	}

	public List findByVersion(Object version) {
		return findByProperty(VERSION, version);
	}

	public List findByClassificationMachanism(Object classificationMachanism) {
		return findByProperty(CLASSIFICATION_MACHANISM, classificationMachanism);
	}

	public List findByAgencyPublicationNumber(Object agencyPublicationNumber) {
		return findByProperty(AGENCY_PUBLICATION_NUMBER,
				agencyPublicationNumber);
	}

	public List findByComplianceToStandards(Object complianceToStandards) {
		return findByProperty(COMPLIANCE_TO_STANDARDS, complianceToStandards);
	}

	public List findByWarranties(Object warranties) {
		return findByProperty(WARRANTIES, warranties);
	}

	public List findByRetrievableExtent(Object retrievableExtent) {
		return findByProperty(RETRIEVABLE_EXTENT, retrievableExtent);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByProvider(Object provider) {
		return findByProperty(PROVIDER, provider);
	}

	public List findByApprovedState(Object approvedState) {
		return findByProperty(APPROVED_STATE, approvedState);
	}

	public List findByCertification(Object certification) {
		return findByProperty(CERTIFICATION, certification);
	}

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findAll() {
		log.debug("finding all Asset instances");
		try {
			String queryString = "from com.ht706.componentLibrary.componentRelease.bean.hbm.Asset";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Asset merge(Asset detachedInstance) {
		log.debug("merging Asset instance");
		try {
			Asset result = (Asset) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Asset instance) {
		log.debug("attaching dirty Asset instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Asset instance) {
		log.debug("attaching clean Asset instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void update(Asset transientInstance) {
		// TODO Auto-generated method stub
		log.debug("updating Asset instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public List findByHQL(String hql) {
		// TODO Auto-generated method stub
		List queryObject = getHibernateTemplate().find(hql);
		return queryObject;
	}

	public List<Asset> findValidAssetByNumber(int start, int offset) {
		log.debug("finding valid appointing index Asset instances");
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from Asset as model where model.approvedState='ÒÑÅú×¼'";
			Query qw = s.createQuery(queryString);	
			qw.setFirstResult(start);
			qw.setMaxResults(offset);
			return qw.list();
		}
		catch (RuntimeException re) {
			log.error("find valid appointing index Asset failed", re);
			throw re;
		}finally{
			s.close();
		}
	}
}