/**
 * Copyright (c) 2010, 
 * 
 * @FileName: Specification.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractSpecification;

/**
 * Specification entity.
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public class Specification extends AbstractSpecification implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Specification() {
	}

	/** minimal constructor */
	public Specification(String specUuid) {
		super(specUuid);
	}

	/** full constructor */
	public Specification(String specUuid, Date dateOfInformation,
			String precedeSpec, String version, Integer releaseType,
			String creator, Integer status, String reason, String description,
			Set relationtypes, Set facets) {
		super(specUuid, dateOfInformation, precedeSpec, version, releaseType,
				creator, status, reason, description, relationtypes, facets);
	}

}
