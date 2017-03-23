/**
 * Copyright (c) 2010, 
 * 
 * @FileName: IFacetDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
/**
 * IFacetDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface IFacetDAO {
	public void save(Facet transientInstance);

	public void delete(Facet persistentInstance) ;

	public Facet findById(FacetId id) ;

	public List findByExample(Facet instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByName(Object name) ;

	public List findByNodeType(Object nodeType) ;
	public List findByParentNode(Object parentNode) ;

	public List findByIsLeaf(Object isLeaf) ;

	public List findByLevel(Object level) ;

	public List findByReleaseType(Object releaseType) ;

	public List findByCreator(Object creator) ;

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Facet merge(Facet detachedInstance) ;

	public void attachDirty(Facet instance) ;
	public void attachClean(Facet instance) ;

	public void update(Facet facet);
}
