/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ComponentrelationServiceImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo.impl;
 * @author: yby
 * @Time: 2010-10-07 
 */
package com.ht706.componentLibrary.componentSpecification.bo.impl;

import com.ht706.componentLibrary.componentRelease.dao.IComponentrelationDAO;
import com.ht706.componentLibrary.componentSpecification.bo.IComponentrelationService;
/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-10-07 
 *
 */
public class ComponentrelationServiceImpl implements IComponentrelationService{
	public IComponentrelationDAO componentrelationDAO;

	public IComponentrelationDAO getComponentrelationDAO() {
		return componentrelationDAO;
	}



	public void setComponentrelationDAO(IComponentrelationDAO componentrelationDAO) {
		this.componentrelationDAO = componentrelationDAO;
	}



	public int findByRelationtype(String rid) {
		// TODO Auto-generated method stub
		return componentrelationDAO.findByRelationType(rid).size();
	}

}
