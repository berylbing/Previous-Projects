package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Wascreatedby;

public interface IWascreatedbyDAO{
	public void save(Wascreatedby transientInstance) ;

	public void delete(Wascreatedby persistentInstance) ;

	public Wascreatedby findById(java.lang.Integer id) ;

	public List findByExample(Wascreatedby instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findAll() ;

	public List findByUserName(String id);
	
	public Wascreatedby merge(Wascreatedby detachedInstance) ;

	public void attachDirty(Wascreatedby instance) ;

	public void attachClean(Wascreatedby instance) ;
}
