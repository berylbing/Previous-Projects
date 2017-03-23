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

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationmodifyService;
import com.ht706.componentLibrary.componentSpecification.bo.ISynonymService;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationmodifyDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISynonymDAO;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class SynonymServiceImpl implements ISynonymService{
	private ISynonymDAO synonymDAO;

	public ISynonymDAO getSynonymDAO() {
		return synonymDAO;
	}
	public void setSynonymDAO(ISynonymDAO synonymDAO) {
		this.synonymDAO = synonymDAO;
	}

	public ArrayList<Synonym> findByFacet(String ids, String idf) {
		// TODO Auto-generated method stub
		return (ArrayList<Synonym>)synonymDAO.findByFacet(ids,idf);
	}

	public void create(final Synonym synonym) {
		// TODO Auto-generated method stub
		synonymDAO.save(synonym);
	}

	public Synonym findById(String id) {
		// TODO Auto-generated method stub
		return synonymDAO.findById(id);
	}

	public void modify(final Synonym s) {
		// TODO Auto-generated method stub
		synonymDAO.update(s);
	}

	public void delete(final Synonym findById) {
		// TODO Auto-generated method stub
		synonymDAO.delete(findById);
	}
	
	public ArrayList<Synonym> findBySpec(String precedeSpec) {
		// TODO Auto-generated method stub
		return (ArrayList<Synonym>)synonymDAO.findBySpecUuid(precedeSpec);
	}


	

	
}
