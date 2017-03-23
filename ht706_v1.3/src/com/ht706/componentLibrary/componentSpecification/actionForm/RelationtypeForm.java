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

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-09-1 
 *
 */
public class RelationtypeForm extends ActionForm{

	private Relationtype relationtype = new Relationtype();
	private String spid;
	private String relationid;
	private String createtime;
	
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getRelationid() {
		return relationid;
	}
	public void setRelationid(String relationid) {
		this.relationid = relationid;
	}
	public Relationtype getRelationtype() {
		return relationtype;
	}
	public void setRelationtype(Relationtype relationtype) {
		this.relationtype = relationtype;
	}
	public String getSpid() {
		return spid;
	}
	public void setSpid(String spid) {
		this.spid = spid;
	}

	

	
	

}
