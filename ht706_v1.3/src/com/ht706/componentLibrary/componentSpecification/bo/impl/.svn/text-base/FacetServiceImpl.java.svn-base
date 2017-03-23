/**
 * Copyright (c) 2010, 
 * 
 * @FileName: FacetServiceImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo.impl;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.dao.IFacetDAO;
/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class FacetServiceImpl implements IFacetService{
	private IFacetDAO facetDAO;
	
	public void setFacetDAO(IFacetDAO facetDAO) {
		this.facetDAO = facetDAO;
	}

	public IFacetDAO getFacetDAO() {
		return facetDAO;
	}
	public ArrayList<Facet> showFacetList(){
		
		return (ArrayList<Facet>)facetDAO.findAll();
	}


	public Facet getById(FacetId id) {
		// TODO Auto-generated method stub
		System.out.println("0000000000000000000000000000000000");
		return facetDAO.findById(id);
	}


	public void modify(final Facet facet) {
		// TODO Auto-generated method stub
		facetDAO.update(facet);
	}


	public void delete(final Facet facet) {
		// TODO Auto-generated method stub
		facetDAO.delete(facet);
	}

	public void create(final Facet facet) {
		// TODO Auto-generated method stub
		System.out.println("ppppppppppppppppppppppppppppppcreatefacet");
		facetDAO.save(facet);
	}

	public List<Facet> findbyParentNode(String idf) {
		// TODO Auto-generated method stub
		//List<Facet> facetlist = facetDAO.findByParentNode(idf);
		return facetDAO.findByParentNode(idf);
	}

}
