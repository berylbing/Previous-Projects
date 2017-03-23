package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect;

public interface ICosteffectDAO{

	public void delete(Costeffect persistentInstance) ;

	public Costeffect findById(java.lang.Integer id);

	public List findByExample(Costeffect instance) ;

	public List findByProperty(String propertyName, Object value);

	public List findByUniqueId(Object uniqueId) ;

	public List findByEstimator(Object estimator) ;

	public List findBySr(Object sr) ;

	public List findByL(Object l) ;

	public List findByN(Object n) ;

	public List findByCr(Object cr) ;

	public List findByTa(Object ta) ;

	public List findByCa(Object ca) ;

	public List findByCm(Object cm);
	
	public List findByCrRisk(Object crRisk);

	public List findByCaRisk(Object caRisk) ;

	public List findByCmRisk(Object cmRisk) ;

	public List findByLRisk(Object LRisk) ;

	public List findByNRisk(Object NRisk);

	public List findByI(Object i) ;

	public List findByUnit(Object unit) ;

	public List findAll() ;

	public Costeffect merge(Costeffect detachedInstance) ;

	public void attachDirty(Costeffect instance);

	public void attachClean(Costeffect instance) ;
}
