/**
 * Copyright (c) 2010, 
 * 
 * @FileName: Relationtype.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractRelationtype;

/**
 * Relationtype entity.
 * 
 *@author: yby
 * @Time: 2010-08-31 
 */
public class Relationtype extends AbstractRelationtype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Relationtype() {
	}

	/** minimal constructor */
	public Relationtype(RelationtypeId id, String relationName,
			String relationType) {
		super(id, relationName, relationType);
	}

	/** full constructor */
	public Relationtype(RelationtypeId id, String relationName,
			String relationType, Date lastModifiedTime, String description) {
		super(id, relationName, relationType, lastModifiedTime, description);
	}

}
