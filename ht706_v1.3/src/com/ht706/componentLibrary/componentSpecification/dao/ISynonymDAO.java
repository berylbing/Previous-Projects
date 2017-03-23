/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ISynonymDAO.java
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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
/**
 * ISynonymDAO½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface ISynonymDAO {
	public void save(Synonym transientInstance) ;

	public void delete(Synonym persistentInstance) ;

	public Synonym findById(java.lang.String id) ;

	public List findByExample(Synonym instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findBySpecUuid(Object specUuid) ;

	public List findBySourceItem(Object sourceItem) ;

	public List findByTargetItem(Object targetItem) ;

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Synonym merge(Synonym detachedInstance) ;

	public void attachDirty(Synonym instance) ;

	public void attachClean(Synonym instance) ;

	public List findByFacet(String ids, String idf);

	public void update(Synonym s);

}
