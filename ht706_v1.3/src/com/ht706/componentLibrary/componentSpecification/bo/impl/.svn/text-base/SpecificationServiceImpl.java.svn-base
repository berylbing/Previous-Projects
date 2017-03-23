/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationServiceImpl.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo.impl;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bo.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.transaction.support.TransactionCallback;


import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationmodifyDAO;
import com.ht706.componentLibrary.util.Constant;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class SpecificationServiceImpl implements ISpecificationService{
	private ISpecificationDAO specificationDAO;
	private ISpecificationmodifyDAO specificationmodifyDAO;

	public ISpecificationmodifyDAO getSpecificationmodifyDAO() {
		return specificationmodifyDAO;
	}

	public void setSpecificationmodifyDAO(
			ISpecificationmodifyDAO specificationmodifyDAO) {
		this.specificationmodifyDAO = specificationmodifyDAO;
	}

	
	public void create(Specification transientInstance) {
		// TODO Auto-generated method stub
		specificationDAO.save(transientInstance);
		
	}
	
	public void delete(final Specification selectedSpecification) {
		// TODO Auto-generated method stub
		specificationDAO.delete(selectedSpecification);
		
	}

	public Specification getById(final String id) {
		// TODO Auto-generated method stub
		System.out.println("idididididididid");
		return specificationDAO.findById(id);
	}

	public List<Specification> listAll() {
		// TODO Auto-generated method stub
		return specificationDAO.findAll();
	}

	public void modify(final Specification specification) {
		// TODO Auto-generated method stub
		specificationDAO.update(specification);
		
	}

	public ISpecificationDAO getSpecificationDAO() {
		return specificationDAO;
	}

	public void setSpecificationDAO(ISpecificationDAO specificationDAO) {
		this.specificationDAO = specificationDAO;
	}

	/**
	 * 用于查找相应规约spid的所有相关facet
	 * @param spid 规约id
	 * @return facetlist 规约id为spid的刻面集合
	 */
	public ArrayList<Facet> findFacet(String spid) {
		ArrayList<Facet> facetlist = new  ArrayList<Facet>(specificationDAO.findById(spid).getFacets());
		return facetlist;
	}

	/**
	 * 用于查找相应规约spid的所有相关relationtype
	 * @param spid 规约id
	 * @return relationlist 规约id为spid的构建关系集合
	 */
	public ArrayList<Relationtype> findRelationtype(String spid) {
		// TODO Auto-generated method stub
		ArrayList<Relationtype> relationlist = new  ArrayList<Relationtype>(specificationDAO.findById(spid).getRelationtypes());
		return relationlist;
	}
	public Set<Relationtype> findcurRelationtype() {
		// TODO Auto-generated method stub
		return ((Specification)specificationDAO.findByStatus(4).get(0)).getRelationtypes();
	}

	/**
	 * 通过版本号查找规约，由于版本号唯一则查出的规约是唯一的
	 * @see com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService#findByVersion()
	 */
	public Specification findByVersion(String version) {
		// TODO Auto-generated method stub
		if(specificationDAO.findByVersion(version).isEmpty())
			return null;
		return (Specification)specificationDAO.findByVersion(version).get(0);
	}

	public List<Specification> findByNumber(int start, int offset) {
		// TODO Auto-generated method stub
		return specificationDAO.findByNumber(start,offset);
	}

	public List<Relationtype> findRelationtypeByNumber(String spid, int start,
			int offset, int page) {
		// TODO Auto-generated method stub
		ArrayList<Relationtype> relationlist = new  ArrayList<Relationtype>(specificationDAO.findById(spid).getRelationtypes());
		if(relationlist.isEmpty())
			return relationlist;
		else if(relationlist.size()<= Constant.PAGE_LINES*page){
			return relationlist.subList(start, relationlist.size());
		}else 	
		return  relationlist.subList(start, offset+start);
	}

	//前导规约
	public List<Specification> listPre() {
		// TODO Auto-generated method stub
		List<Specification> prelist = specificationDAO.findByStatus(3);
		prelist.addAll(specificationDAO.findByStatus(4));
		prelist.addAll(specificationDAO.findByStatus(5));
		return prelist;
	}

	//关于以使用过的申请单
	public ArrayList<Specificationmodify> listmodify() {
		// TODO Auto-generated method stub
		List<Specification> prelist = specificationDAO.findByStatus(2);
		prelist.addAll(specificationDAO.findByStatus(3));
		prelist.addAll(specificationDAO.findByStatus(4));
		prelist.addAll(specificationDAO.findByStatus(5));
		ArrayList<Specificationmodify> spmlist = new ArrayList<Specificationmodify>();
		for(Specification item : prelist){
			String temp[] = item.getReason().split(",");
			System.out.println("splist"+item.getReason());
			for(int i = 0; i<temp.length; i++)
			{
				System.out.println("temp="+temp[i]);
				Specificationmodify spm = (Specificationmodify) specificationmodifyDAO.findByRegistryId(temp[i]).get(0);
				spmlist.add(spm);
			}
		}
		return spmlist;
	}

	
}
