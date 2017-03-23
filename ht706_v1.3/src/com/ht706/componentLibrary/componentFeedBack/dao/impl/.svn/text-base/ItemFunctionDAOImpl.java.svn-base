/**
 * @FileName	ItemFunctionDAOImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao.impl
 * @author 贾乐松
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;
import com.ht706.componentLibrary.componentFeedBack.dao.IItemFunctionDAO;

/**
 * ItemFunction DAO接口实现类
 * @method 	findAll			列出所有项分类
 * @method 	findById		通过itemFID查询项分类
 * @method 	findByFuncName	通过funcName查询项分类
 * @method 	save			在在数据库创建一个项分类
 * @method 	update			在数据库更新一个项分类
 * @method 	delete			通过itemFID删除一个项分类
 */

public class ItemFunctionDAOImpl extends HibernateDaoSupport implements IItemFunctionDAO {
	private static final Log log = LogFactory.getLog(ItemFunctionDAOImpl.class);
	// property constants
	public static final String FUNC_NAME = "funcName";
	public static final String DESCRIPTION = "description";

	public void save(ItemFunction transientInstance) {
		log.debug("saving ItemFunction instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
	
	public void update(ItemFunction transientInstance) {
		log.debug("updating ItemFunction instance");
		try {
			getHibernateTemplate().saveOrUpdate(transientInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public void delete(ItemFunction persistentInstance) {
		log.debug("deleting ItemFunction instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ItemFunction findById(java.lang.Integer id) {
		log.debug("getting ItemFunction instance with id: " + id);
		try {
			ItemFunction instance = (ItemFunction) getSession().get(
					"com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<ItemFunction> findByProperty(String propertyName, Object value) {
		log.debug("finding ItemFunction instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ItemFunction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<ItemFunction> findByFuncName(Object funcName) {
		return findByProperty(FUNC_NAME, funcName);
	}

	public List<ItemFunction> findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List<ItemFunction> findAll() {
		log.debug("finding all ItemFunction instances");
		try {
			String queryString = "from ItemFunction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public List<ItemFunction> findByNumber(int start, int offset) {

		log.debug("finding appointing index ItemFunction instances");
		SessionFactory sf = getHibernateTemplate().getSessionFactory();
		Session s=sf.openSession();
		try {
			String queryString = "from ItemFunction";
			Query qw = s.createQuery(queryString);
			qw.setFirstResult(start);
			qw.setMaxResults(offset);			
			return qw.list();
		} catch (RuntimeException re) {
			log.error("find appointing index ItemFunction instances failed", re);
			throw re;
		} finally {
			s.close();
		}
	}
}