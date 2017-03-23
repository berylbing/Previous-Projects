package com.ht706.componentLibrary.systemManagement.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.systemManagement.bean.abstractBean.AbstractOrganization;

/**
 * Organization entity. @author MyEclipse Persistence Tools
 */
public class Organization extends AbstractOrganization implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Organization() {
	}

	/** minimal constructor */
	public Organization(Integer userId, String name, Integer departmentId,String enable) {
		super(userId, name, departmentId,enable);
	}

	/** full constructor */
	public Organization(Integer userId, String userType, String name,
			String password, String address, String email, String fax,
			String telephone, Integer departmentId, Date lastLoginTime,
			String securityLevel, Set contactises, Set usertoactors,String describtion,String idNumber,String enable) {
		super(userId, userType, name, password, address, email, fax, telephone,
				departmentId, lastLoginTime, securityLevel, contactises,
				usertoactors,describtion,idNumber,enable);
	}

}
