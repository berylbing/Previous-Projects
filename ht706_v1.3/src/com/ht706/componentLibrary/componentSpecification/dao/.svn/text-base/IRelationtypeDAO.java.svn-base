/**
 * Copyright (c) 2010, 
 * 
 * @FileName: IRelationtypeDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.RelationtypeId;
/**
 * IRelationtypeDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface IRelationtypeDAO {
	public void save(Relationtype transientInstance) ;

	public void delete(Relationtype persistentInstance) ;

	public Relationtype findById(RelationtypeId id) ;

	public List findByExample(Relationtype instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByRelationName(Object relationName) ;

	public List findByRelationType(Object relationType) ;

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Relationtype merge(Relationtype detachedInstance) ;

	public void attachDirty(Relationtype instance) ;

	public void attachClean(Relationtype instance) ;

	public void update(Relationtype relationtype);

}
