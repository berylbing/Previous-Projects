package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Usertoactor;

/**
 * IUserToActorDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */

public interface IUserToActorDAO{
	public void save(Usertoactor transientInstance);

	public void delete(Usertoactor persistentInstance);

	public Usertoactor findById(java.lang.Integer id);

	public List findByExample(Usertoactor instance);

	public List findByProperty(String propertyName, Object value);

	public List findByDescription(Object description);

	public List findAll();

	public Usertoactor merge(Usertoactor detachedInstance);

	public void attachDirty(Usertoactor instance);

	public void attachClean(Usertoactor instance);
}