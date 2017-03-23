/**
 * Copyright (c) 2010, 
 * 
 * @FileName: FacetListForm.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.actionForm
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.actionForm;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class FacetListForm extends ActionForm {
	ArrayList<Facet> facetList=new ArrayList<Facet>();
	private String []selected;
	Facet facet = new Facet();
	String facetidf;
	String facetids;
	String facetpids;
	String createtime;
	String creator;
	String nodetype;

	public String getNodetype() {
		return nodetype;
	}

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getFacetidf() {
		return facetidf;
	}

	public String getFacetpids() {
		return facetpids;
	}

	public void setFacetpids(String facetpids) {
		this.facetpids = facetpids;
	}

	public void setFacetidf(String facetidf) {
		this.facetidf = facetidf;
	}

	public String getFacetids() {
		return facetids;
	}

	public void setFacetids(String facetids) {
		this.facetids = facetids;
	}

	public Facet getFacet() {
		return facet;
	}

	public void setFacet(Facet facet) {
		this.facet = facet;
	}

	public ArrayList<Facet> getFacetList() {
		return facetList;
	}

	public void setFacetList(ArrayList<Facet> facetlist) {
		this.facetList = facetlist;
	}

	public void setSelected(String selected[]) {
		this.selected = selected;
	}

	public String[] getSelected() {
		return selected;
	}

}
