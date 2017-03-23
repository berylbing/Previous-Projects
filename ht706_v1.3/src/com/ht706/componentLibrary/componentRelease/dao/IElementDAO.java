package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;


import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;

public interface IElementDAO {

	public void delete(Element persistentInstance) ;

	public Element findById(java.lang.String id) ;

	public List findByExample(Element instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByName(Object name) ;

	public List findByElementType(Object elementType) ;

	public List findByMedia(Object media) ;

	public List findByCertificationState(Object certificationState) ;

	public List findByProvider(Object provider) ;

	public List findByDescription(Object description) ;

	public List findAll() ;

	public Element merge(Element detachedInstance);

	public void attachDirty(Element instance) ;

	public void attachClean(Element instance) ;

	public void update(Element c);
}
