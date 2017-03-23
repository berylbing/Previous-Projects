/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ISynchlogDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synchlog;
/**
 * ISynchlogDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface ISynchlogDAO {
	public void save(Synchlog transientInstance);

	public void delete(Synchlog persistentInstance) ;

	public Synchlog findById(java.lang.Integer id) ;

	public List findByExample(Synchlog instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findBySpecUuid(Object specUuid) ;

	public List findByPrecedeSpec(Object precedeSpec) ;

	public List findByFromIp(Object fromIp) ;

	public List findByToIp(Object toIp) ;

	public List findByResponseCode(Object responseCode) ;

	public List findBySynType(Object synType) ;

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Synchlog merge(Synchlog detachedInstance) ;

	public void attachDirty(Synchlog instance) ;

	public void attachClean(Synchlog instance) ;
	

}
