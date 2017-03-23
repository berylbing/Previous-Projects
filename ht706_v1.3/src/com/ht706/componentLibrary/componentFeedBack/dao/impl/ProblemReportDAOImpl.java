/**
 * @FileName	ProblemreportDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao.impl
 * @author 贾乐松
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemReportDAO;

/**
 * ProblemReport DAO接口实现类
 * @method 	findAll			列出所有问题报告
 * @method 	findById		通过RID查询问题报告
 * @method 	save			在在数据库创建一个问题报告
 * @method 	update			在数据库更新一个问题报告
 * @method 	delete			通过RID删除一个问题报告
 */

public class ProblemReportDAOImpl extends HibernateDaoSupport implements IProblemReportDAO{
	private static final Log log = LogFactory.getLog(ProblemReportDAOImpl.class);
	// property constants
	public static final String REPORT_ID = "reportId";
	public static final String REPORTER = "reporter";
	public static final String DEPT = "dept";
	public static final String PROJECT = "project";
	public static final String BACKGROUND = "background";
	public static final String DESCRIPTION = "description";
	public static final String SUGGESTION = "suggestion";
	public static final String HARM = "harm";
	public static final String FILE = "file";
	public static final String STATUS = "status";

	public void save(ProblemReport transientInstance) {
		log.debug("saving ProblemReport instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProblemReport persistentInstance) {
		log.debug("deleting ProblemReport instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProblemReport findById(java.lang.String id) {
		log.debug("getting ProblemReport instance with id: " + id);
		try {
			ProblemReport instance = (ProblemReport) getSession().get(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProblemReport instance) {
		log.debug("finding Problemreport instance by example");
		try {
			List results = getSession().createCriteria("com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport")
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
		log.debug("finding ProblemReport instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ProblemReport as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByReportId(Object reportId) {
		return findByProperty(REPORT_ID, reportId);
	}

	public List findByReporter(Object reporter) {
		return findByProperty(REPORTER, reporter);
	}

	public List findByDept(Object dept) {
		return findByProperty(DEPT, dept);
	}

	public List findByProject(Object project) {
		return findByProperty(PROJECT, project);
	}

	public List findByBackground(Object background) {
		return findByProperty(BACKGROUND, background);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findBySuggestion(Object suggestion) {
		return findByProperty(SUGGESTION, suggestion);
	}

	public List findByHarm(Object harm) {
		return findByProperty(HARM, harm);
	}

	public List findByFile(Object file) {
		return findByProperty(FILE, file);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List<ProblemReport> findAll() {
		log.debug("finding all ProblemReport instances");
		try {
			String queryString = "from ProblemReport";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ProblemReport merge(ProblemReport detachedInstance) {
		log.debug("merging ProblemReport instance");
		try {
			ProblemReport result = (ProblemReport) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ProblemReport instance) {
		log.debug("attaching dirty ProblemReport instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProblemReport instance) {
		log.debug("attaching clean ProblemReport instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void update(ProblemReport problemReport) {
		log.debug("updating ProblemReport instance");
		try {
			getHibernateTemplate().merge(problemReport);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
		
	}

	public List<ProblemReport> findByNumber(int start, int offset) {
		
		log.debug("finding appointed index ProblemReport instances");
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from ProblemReport as model where model.status!=0 and model.status!=1";
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

	public List<ProblemReport> listValidProblemReport() {
		log.debug("finding valid ProblemReport instances");
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from ProblemReport as model where model.status!=0 and model.status!=1";
			Query qw = s.createQuery(queryString);		
			return qw.list();
		}
		catch (RuntimeException re) {
			log.error("find valid ProblemReport failed", re);
			throw re;
		}finally{
			s.close();
		}
	}
}