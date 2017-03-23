/**
 * Copyright (c) 2010, 
 * 
 * @FileName: IStructiondiagramDAO.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.dao;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Structiondiagram;
/**
 * IStructiondiagramDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface IStructiondiagramDAO {
	public void save(Structiondiagram transientInstance) ;

	public void delete(Structiondiagram persistentInstance) ;

	public Structiondiagram findById(java.lang.Integer id) ;

	public List findByExample(Structiondiagram instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByLibId(Object libId) ;

	public List findByLibIp(Object libIp) ;

	public List findByMaxLength(Object maxLength) ;

	public List findAll() ;
	

	public Structiondiagram merge(Structiondiagram detachedInstance) ;

	public void attachDirty(Structiondiagram instance) ;

	public void attachClean(Structiondiagram instance) ;

}
