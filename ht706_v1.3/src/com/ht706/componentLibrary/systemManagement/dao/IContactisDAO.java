package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Contactis;
/**
 * IContactisDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */

public interface IContactisDAO {

	public void save(Contactis transientInstance);

	public void delete(Contactis persistentInstance);

	public Contactis findById(java.lang.Integer id);

	public List findByExample(Contactis instance);

	public List findByProperty(String propertyName, Object value);

	public List findAll();

	public Contactis merge(Contactis detachedInstance);

	public void attachDirty(Contactis instance);

	public void attachClean(Contactis instance);
}