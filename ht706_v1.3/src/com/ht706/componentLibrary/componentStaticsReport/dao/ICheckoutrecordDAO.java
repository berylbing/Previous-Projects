package com.ht706.componentLibrary.componentStaticsReport.dao;

import java.util.List;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;


public interface ICheckoutrecordDAO {

	public void save(Checkoutrecord transientInstance);

	public void delete(Checkoutrecord persistentInstance);

	public Checkoutrecord findById(java.lang.String id) ;

	public List findByExample(Checkoutrecord instance) ;

	public List findByProperty(String propertyName, Object value) ;

	public List findByUniqueId(Object uniqueId) ;
	
	public List findByProposer(Object proposer) ;

	public List findByTel(Object tel) ;

	public List findByEmail(Object email) ;

	public List findByPurpose(Object purpose) ;

	public List findByReason(Object reason) ;

	public List findByAgreement(Object agreement) ;

	public List findByProject(Object project) ;

	public List findByResult(Object result) ;
	
	public List findByStatus(Object status) ;

	public List findAll() ;

	public Checkoutrecord merge(Checkoutrecord detachedInstance) ;
	
	public void attachDirty(Checkoutrecord instance);

	public void attachClean(Checkoutrecord instance) ;
	
}
