/**
 * Copyright (c) 2010, 
 * 
 * @FileName: IClassificationindexDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Classificationindex;
/**
 * IClassificationindexDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface IClassificationindexDAO {
	public void save(Classificationindex transientInstance) ;

	public void delete(Classificationindex persistentInstance) ;

	public Classificationindex findById(java.lang.Integer id) ;

	public List findByExample(Classificationindex instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByFacetUuid(Object facetUuid) ;

	public List findByUniqueId(Object uniqueId) ;

	public List findByAssetName(Object assetName) ;

	public List findByProvider(Object provider) ;

	public List findByDomain(Object domain) ;

	public List findByUrl(Object url) ;

	public List findByLibraryUniqueId(Object libraryUniqueId) ;

	public List findByGrade(Object grade) ;

	public List findAll() ;

	public Classificationindex merge(Classificationindex detachedInstance) ;
	public void attachDirty(Classificationindex instance) ;

	public void attachClean(Classificationindex instance) ;
	public List findByHQL(String hql);
}
