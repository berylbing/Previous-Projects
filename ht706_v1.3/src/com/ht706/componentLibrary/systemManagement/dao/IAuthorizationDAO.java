package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
/**
 * IAuthorizationDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */
public interface IAuthorizationDAO  {

	public void save(Authorization transientInstance);

	public void delete(Authorization persistentInstance);

	public Authorization findById(java.lang.Integer id);

	public List findByExample(Authorization instance);

	public List findByProperty(String propertyName, Object value);

	public List findByName(Object name);

	public List findByDescription(Object description);	

	public List findAll();
	
	public List findByModuleId(String id);

	public Authorization merge(Authorization detachedInstance);

	public void attachDirty(Authorization instance);

	public void attachClean(Authorization instance);

	public void update(Authorization transientInstance);
}