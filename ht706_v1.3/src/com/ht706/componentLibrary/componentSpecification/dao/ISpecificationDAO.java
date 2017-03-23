/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ISpecificationDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
/**
 * ISpecificationDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface ISpecificationDAO {
	public void save(Specification transientInstance) ;

	public void delete(Specification persistentInstance) ;

	public Specification findById(java.lang.String id) ;

	public List findByExample(Specification instance) ;

	public List findByProperty(String propertyName, Object value) ;
	public List findByPrecedeSpec(Object precedeSpec) ;

	public List findByVersion(Object version) ;

	public List findByReleaseType(Object releaseType) ;

	public List findByCreator(Object creator);

	public List findByStatus(Object status) ;

	public List findByReason(Object reason) ;

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Specification merge(Specification detachedInstance) ;

	public void attachDirty(Specification instance) ;

	public void attachClean(Specification instance) ;

	public void update(Specification specification);

	public List<Specification> findByNumber(int start, int offset);

}
