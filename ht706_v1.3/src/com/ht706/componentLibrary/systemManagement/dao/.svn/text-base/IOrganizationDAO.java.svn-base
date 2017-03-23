package com.ht706.componentLibrary.systemManagement.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;

/**
 * IOrganizationDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */

public interface IOrganizationDAO  {

	public void save(Organization transientInstance);

	public void delete(Organization persistentInstance);

	public Organization findById(java.lang.Integer id);

	public List findByExample(Organization instance);

	public List findByProperty(String propertyName, Object value);

	public List findByUserType(Object userType);

	public List findByName(Object name);

	public List findByPassword(Object password);

	public List findByAddress(Object address);

	public List findByEmail(Object email);

	public List findByFax(Object fax);

	public List findByTelephone(Object telephone);

	public List findByDepartmentId(Object departmentId);

	public List findBySecurityLevel(Object securityLevel);

	public List findAll();

	public Organization merge(Organization detachedInstance);

	public void attachDirty(Organization instance);

	public void attachClean(Organization instance);

	public void update(Organization transientInstance);
	public List findByUserName(Object name);
}