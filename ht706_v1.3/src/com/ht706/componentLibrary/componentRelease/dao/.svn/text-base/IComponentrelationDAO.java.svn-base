package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;

public interface IComponentrelationDAO {
	public void save(Componentrelation transientInstance) ;

	public void delete(Componentrelation persistentInstance) ;

	public Componentrelation findById(java.lang.Integer id) ;

	public List findByExample(Componentrelation instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findBySourceAsset(Object sourceAsset) ;

	public List findByTargetAsset(Object targetAsset) ;

	public List findByRelationType(Object relationType);

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Componentrelation merge(Componentrelation detachedInstance) ;

	public void attachDirty(Componentrelation instance) ;
	
	public void attachClean(Componentrelation instance) ;
	
	public int deleteRelation(String assetid,String []rassets);
}
