package com.ht706.componentLibrary.componentStaticsReport.dao;

import java.util.List;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Activitystatistic;

public interface IActivitystaticDAO {

	public void save(Activitystatistic transientInstance);

	public void delete(Activitystatistic persistentInstance);

	public Activitystatistic findById(java.lang.Integer id);

	public List findByExample(Activitystatistic instance);

	public List findByProperty(String propertyName, Object value);

	public List findByAssetUniqueId(Object assetUniqueId);
	
	public List findByOperationType(Object operationType);

	public List findByOperator(Object operator);

	public List findAll();
	
	public Activitystatistic merge(Activitystatistic detachedInstance);

	public void attachDirty(Activitystatistic instance);

	public void attachClean(Activitystatistic instance);
}
