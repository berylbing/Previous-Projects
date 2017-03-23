/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SynonymForm.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.actionForm
 * @author: yby
 * @Time: 2010-09-1 
 */
package com.ht706.componentLibrary.componentSpecification.actionForm;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-09-1 
 *
 */
public class SynonymForm extends ActionForm{

	private Synonym synonym = new Synonym();
	private String facetid;
	private String spceid;
	private String createtime;

	
	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getFacetid() {
		return facetid;
	}

	public void setFacetid(String facetid) {
		this.facetid = facetid;
	}

	public String getSpceid() {
		return spceid;
	}

	public void setSpceid(String spceid) {
		this.spceid = spceid;
	}

	public Synonym getSynonym() {
		return synonym;
	}

	public void setSynonym(Synonym synonym) {
		this.synonym = synonym;
	}
	

	
	

}
