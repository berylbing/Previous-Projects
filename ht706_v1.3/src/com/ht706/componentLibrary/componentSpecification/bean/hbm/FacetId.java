/**
 * Copyright (c) 2010, 
 * 
 * @FileName: FacetId.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractFacetId;

/**
 * FacetId entity.
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public class FacetId extends AbstractFacetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacetId() {
	}

	/** full constructor */
	public FacetId(String facetUuid, Specification specification) {
		super(facetUuid, specification);
	}

}
