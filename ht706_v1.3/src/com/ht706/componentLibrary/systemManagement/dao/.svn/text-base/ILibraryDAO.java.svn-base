package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
/**
 * ILibraryDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */
public interface ILibraryDAO {
	public void save(Library transientInstance);
	public void update(Library transientInstance);
	
	public void delete(Library persistentInstance);

	public Library findById(java.lang.String id);

	public List findByExample(Library instance);

	public List findByProperty(String propertyName, Object value);

	public List findByName(Object name);

	public List findByCertificationMethods(Object certificationMethods);

	public List findByElectronicAddress(Object electronicAddress);

	public List findByContactMethod(Object contactMethod);

	public List findByLibraryClassificationMechanism(
			Object libraryClassificationMechanism);

	public List findByLibraryMetrics(Object libraryMetrics);

	public List findByLibraryRestrications(Object libraryRestrications);

	public List findAll();

	public Library merge(Library detachedInstance);

	public void attachDirty(Library instance);

	public void attachClean(Library instance);
}
