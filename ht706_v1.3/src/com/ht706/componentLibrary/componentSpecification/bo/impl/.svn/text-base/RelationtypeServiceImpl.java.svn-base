/**
 * Copyright (c) 2010, 
 * 
 * @FileName: RelationtypeServiceImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo.impl;
 * @author: yby
 * @Time: 2010-09-1 
 */
package com.ht706.componentLibrary.componentSpecification.bo.impl;


import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.RelationtypeId;
import com.ht706.componentLibrary.componentSpecification.bo.IRelationtypeService;
import com.ht706.componentLibrary.componentSpecification.dao.IRelationtypeDAO;


/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-09-1 
 *
 */
public class RelationtypeServiceImpl implements IRelationtypeService{
	private IRelationtypeDAO relationtypeDAO;

	public IRelationtypeDAO getRelationtypeDAO() {
		return relationtypeDAO;
	}

	public void setRelationtypeDAO(IRelationtypeDAO relationtypeDAO) {
		this.relationtypeDAO = relationtypeDAO;
	}

	public void create(final Relationtype relationtype) {
		// TODO Auto-generated method stub
		relationtypeDAO.save(relationtype);
	}

	public Relationtype findById(final RelationtypeId relationid) {
		// TODO Auto-generated method stub
		return relationtypeDAO.findById(relationid);
	}

	public void modify(final Relationtype relationtype) {
		// TODO Auto-generated method stub
		relationtypeDAO.update(relationtype);
	}

	public void delete(final Relationtype relationtype) {
		// TODO Auto-generated method stub
		relationtypeDAO.delete(relationtype);
	}
	
	

	
}
