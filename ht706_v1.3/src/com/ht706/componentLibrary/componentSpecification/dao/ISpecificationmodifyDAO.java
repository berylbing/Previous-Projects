/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ISpecificationmodifyDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
/**
 * ISpecificationmodifyDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface ISpecificationmodifyDAO {
	public void save(Specificationmodify transientInstance) ;

	public void delete(Specificationmodify persistentInstance) ;

	public Specificationmodify findById(String id) ;

	public List findByExample(Specificationmodify instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByRegistryId(Object registryId) ;
	public List findByApplicant(Object applicant) ;

	public List findBySelectedItem(Object selectedItem) ;

	public List findByReason(Object reason) ;

	public List findByReasonBy(Object reasonBy) ;

	public List findByScheme(Object scheme) ;

	public List findBySchemeBy(Object schemeBy) ;

	public List findByAttitude(Object attitude) ;

	public List findByAttitudeBy(Object attitudeBy) ;

	public List findByStatus(Object status) ;

	public List findAll() ;

	public Specificationmodify merge(Specificationmodify detachedInstance) ;

	public void attachDirty(Specificationmodify instance) ;

	public void attachClean(Specificationmodify instance) ;

	public void update(Specificationmodify specmodify);

}
