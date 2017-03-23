package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;

import org.hibernate.LockMode;

import com.ht706.componentLibrary.systemManagement.bean.hbm.OrganizationTask;

public interface IOrganizationTaskDAO {
	public void save(OrganizationTask transientInstance);

	public void delete(OrganizationTask persistentInstance);

	public OrganizationTask findById(java.lang.Integer id);

	public List findByExample(OrganizationTask instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByExpression(Object expression);
	public List findByUserId(Object userId);
	public List findDifferentTaskByUserId(Integer id);

	public List findAll();

	public OrganizationTask merge(OrganizationTask detachedInstance);

	public void attachDirty(OrganizationTask instance);

	public void attachClean(OrganizationTask instance);
}
