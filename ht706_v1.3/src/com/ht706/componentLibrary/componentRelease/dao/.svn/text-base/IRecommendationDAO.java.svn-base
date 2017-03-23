package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation;

public interface IRecommendationDAO {
	public void save(Recommendation transientInstance) ;

	public void delete(Recommendation persistentInstance) ;

	public Recommendation findById(java.lang.Integer id) ;

	public List findByExample(Recommendation instance);

	public List findByProperty(String propertyName, Object value) ;

	public List findByUniqueId(Object uniqueId) ;

	public List findByDateOfInformation(Object dateOfInformation) ;

	public List findByRecommenderId(Object recommenderId);

	public List findByAssetType(Object assetType) ;

	public List findByFunctionality(Object functionality) ;

	public List findByUsablity(Object usablity) ;

	public List findByReason(Object reason) ;

	public List findByFile(Object file) ;

	public List findAll();

	public Recommendation merge(Recommendation detachedInstance);

	public void attachDirty(Recommendation instance) ;

	public void attachClean(Recommendation instance) ;
}
