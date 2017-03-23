package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;


import com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof;

public interface IIsmadeofDAO {
	public void save(Ismadeof transientInstance) ;

	public void delete(Ismadeof persistentInstance);

	public Ismadeof findById(java.lang.Integer id) ;

	public List findByExample(Ismadeof instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findAll() ;

	public Ismadeof merge(Ismadeof detachedInstance) ;

	public void attachDirty(Ismadeof instance) ;

	public void attachClean(Ismadeof instance) ;

	public List<Ismadeof> findByAssetId(String string);
}
