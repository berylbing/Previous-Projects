package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;


import com.ht706.componentLibrary.componentRelease.bean.hbm.Elimentfiles;

public interface IElimentfilesDAO {
	public void save(Elimentfiles transientInstance) ;

	public void delete(Elimentfiles persistentInstance) ;

	public Elimentfiles findById(java.lang.Integer id) ;

	public List findByExample(Elimentfiles instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByFilePath(Object filePath) ;

	public List findAll() ;

	public Elimentfiles merge(Elimentfiles detachedInstance) ;

	public void attachDirty(Elimentfiles instance) ;
	
	public void attachClean(Elimentfiles instance) ;
}
