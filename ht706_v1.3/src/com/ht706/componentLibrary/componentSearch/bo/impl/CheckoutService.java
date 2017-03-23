package com.ht706.componentLibrary.componentSearch.bo.impl;

import com.ht706.componentLibrary.componentSearch.bo.ICheckoutService;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Activitystatistic;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.componentStaticsReport.dao.IActivitystaticDAO;
import com.ht706.componentLibrary.componentStaticsReport.dao.ICheckoutrecordDAO;
import com.ht706.componentLibrary.util.UUIDKey;

public class CheckoutService implements ICheckoutService {
	public ICheckoutrecordDAO checkoutrecordDAO;
	public IActivitystaticDAO activitystatisticDAO;
	
	public IActivitystaticDAO getActivitystatisticDAO() {
		return activitystatisticDAO;
	}
	public void setActivitystatisticDAO(IActivitystaticDAO activitystatisticDAO) {
		this.activitystatisticDAO = activitystatisticDAO;
	}
	public ICheckoutrecordDAO getCheckoutrecordDAO() {
		return checkoutrecordDAO;
	}
	public void setCheckoutrecordDAO(ICheckoutrecordDAO checkoutrecordDAO) {
		this.checkoutrecordDAO = checkoutrecordDAO;
	}
	
	public void checkout(Checkoutrecord c) {
		// TODO Auto-generated method stub
		UUIDKey key=UUIDKey.getInstance();
		c.setRid(key.getNewUUID());
		Activitystatistic a=new Activitystatistic();
		a.setOperationTime(c.getDateOfInformation());
		a.setOperator(c.getProposer());
		a.setAssetUniqueId(c.getUniqueId());
		a.setOperationType(1); //checkout
		//activitystatisticDAO.save(a);
		checkoutrecordDAO.save(c);
	}

	
}
