package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
/**
 * IDepartmentDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */


public interface IDepartmentDAO  {

	public void save(Department transientInstance);

	public void delete(Department persistentInstance);

	public Department findById(java.lang.Integer id);

	public List findByExample(Department instance);

	public List findByProperty(String propertyName, Object value);

	public List findByName(Object name);

	public List findByParentId(Object parentId);

	public List findByDescription(Object description);

	public List findAll();

	public Department merge(Department detachedInstance);

	public void attachDirty(Department instance);

	public void attachClean(Department instance);

	public void update(Department transientInstance);
}