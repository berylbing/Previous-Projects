/**
 * Copyright (c) 2010, 
 * 
 * @FileName: IFacetService.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bo;

import java.util.ArrayList;
import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
/**
 * IFacetService½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface IFacetService {
	public ArrayList<Facet> showFacetList();
	public Facet getById(final FacetId facetid);
	public void modify(final Facet facet);
	public void delete(final Facet facet);
	public void create(final Facet facet);
	public List<Facet> findbyParentNode(String idf);
}
