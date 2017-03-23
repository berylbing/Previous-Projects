package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;

/**
 * AbstractDepartment entity provides the base persistence definition of the
 * Department entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDepartment implements java.io.Serializable {

	// Fields

	private Integer departmentId;
	private String name;
	private String address;
	private String tele;
//	private Integer parentId;
	private String description;
	private Department parentDepartment;
	private Set departments;
	// Constructors

	/** default constructor */
	public AbstractDepartment() {
	}

	/** minimal constructor */
	public AbstractDepartment(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/** full constructor */
	public AbstractDepartment(Integer departmentId, String name,
//			Integer parentId, 
			String description
			,Department department) {
		this.departmentId = departmentId;
		this.name = name;
//		this.parentId = parentId;
		this.description = description;
		this.parentDepartment=department;

	}

	// Property accessors

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Integer getParentId() {
//		return this.parentId;
//	}
//
//	public void setParentId(Integer parentId) {
//		this.parentId = parentId;
//	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl(){
		return "departmentAction.do?method=getDepartment&Id="+departmentId;
	}



	public void setParentDepartment(Department parentDepartment) {
		this.parentDepartment = parentDepartment;
	}

	public Department getParentDepartment() {
//		if(parentDepartment==null)
//			parentDepartment=new Department(-1);
		return parentDepartment;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}



	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getTele() {
		return tele;
	}

	public void setDepartments(Set departments) {
		this.departments = departments;
	}

	public Set getDepartments() {
		return departments;
	}


	
}