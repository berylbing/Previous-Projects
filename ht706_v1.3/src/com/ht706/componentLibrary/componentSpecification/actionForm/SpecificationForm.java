/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationForm.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.actionForm
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.actionForm;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class SpecificationForm extends ActionForm{

	private Specification specification=new Specification();
	private String lid;
	private String status;
	private String prespecificationid;
	private String creator;
	private String createtime;
	private String spid;

	public String getSpid() {
		return spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
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

	public String getPrespecificationid() {
		return prespecificationid;
	}

	public void setPrespecificationid(String prespecificationid) {
		this.prespecificationid = prespecificationid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}
	
	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

}
