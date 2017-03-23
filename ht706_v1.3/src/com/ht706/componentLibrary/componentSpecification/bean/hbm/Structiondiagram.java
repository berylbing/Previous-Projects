/**
 * Copyright (c) 2010, 
 * 
 * @FileName: Structiondiagram.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractStructiondiagram;

/**
 * Structiondiagram entity.
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public class Structiondiagram extends AbstractStructiondiagram implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Structiondiagram() {
	}

	/** minimal constructor */
	public Structiondiagram(Integer id) {
		super(id);
	}

	/** full constructor */
	public Structiondiagram(Integer id, String libId, String libIp,
			Integer maxLength, Date dateOfInformation) {
		super(id, libId, libIp, maxLength, dateOfInformation);
	}

}
