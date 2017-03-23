package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrganization entity provides the base persistence definition of the
 * Organization entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrganization implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userType;
	private String name;
	private String userName;
	private String password;
	private String address;
	private String email;
	private String sex;
	private String describtion;
	private String idNumber;
	private String telephone;
	private Integer departmentId;
	private Date birthDay;
	private String securityLevel;
	private String enable="true";
	private Set contactises = new HashSet(0);
	private Set usertoactors = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrganization() {
	}

	/** minimal constructor */
	public AbstractOrganization(Integer userId, String name,
			Integer departmentId,String enable) {
		this.userId = userId;
		this.name = name;
		this.departmentId = departmentId;
		this.enable=enable;
	}

	/** full constructor */
	public AbstractOrganization(Integer userId, String userType, String name,
			String password, String address, String email, String fax,
			String telephone, Integer departmentId, Date lastLoginTime,
			String securityLevel, Set contactises, Set usertoactors,String discribtion,String idNumber,String enable) {
		this.userId = userId;
		this.userType = userType;
		this.name = name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.setSex(fax);
		this.telephone = telephone;
		this.departmentId = departmentId;
		this.setBirthDay(lastLoginTime);
		this.securityLevel = securityLevel;
		this.contactises = contactises;
		this.usertoactors = usertoactors;
		this.setDescribtion(discribtion);
		this.idNumber=idNumber;
		this.enable=enable;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	
	public String getSecurityLevel() {
		return this.securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public Set getContactises() {
		return this.contactises;
	}

	public void setContactises(Set contactises) {
		this.contactises = contactises;
	}

	public Set getUsertoactors() {
		return this.usertoactors;
	}

	public void setUsertoactors(Set usertoactors) {
		this.usertoactors = usertoactors;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getEnable() {
		return enable;
	}

}