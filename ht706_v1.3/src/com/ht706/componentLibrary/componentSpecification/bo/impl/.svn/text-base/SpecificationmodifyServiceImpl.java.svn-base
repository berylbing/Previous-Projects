/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationmodifyServiceImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo.impl;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bo.impl;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationmodifyService;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationmodifyDAO;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class SpecificationmodifyServiceImpl implements ISpecificationmodifyService{
	private ISpecificationmodifyDAO specificationmodifyDAO;


	public List<Specificationmodify> listAll() {
		// TODO Auto-generated method stub
		return specificationmodifyDAO.findAll();
	}

	public ISpecificationmodifyDAO getSpecificationmodifyDAO() {
		return specificationmodifyDAO;
	}

	public void setSpecificationmodifyDAO(
			ISpecificationmodifyDAO specificationmodifyDAO) {
		this.specificationmodifyDAO = specificationmodifyDAO;
	}


	public List<Specificationmodify> listApproval() {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++++++++listApproval");
		return specificationmodifyDAO.findByStatus("“—…Û≈˙");
	}

	public void create(final Specificationmodify specmodify) {
		// TODO Auto-generated method stub
		specificationmodifyDAO.save(specmodify);
	}

	public Specificationmodify findById(final String id) {
		// TODO Auto-generated method stub
		return specificationmodifyDAO.findById(id);
	}

	public void delete(Specificationmodify spm) {
		// TODO Auto-generated method stub
		specificationmodifyDAO.delete(spm);
	}

	public void modify(Specificationmodify specmodify) {
		// TODO Auto-generated method stub
		specificationmodifyDAO.update(specmodify);
	}

	public List<Specificationmodify> findByRegistryId(String rid) {
		// TODO Auto-generated method stub
		return specificationmodifyDAO.findByRegistryId(rid);
	}

	
}
