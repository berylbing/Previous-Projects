/**
 * Copyright (c) 2010, 
 * 
 * @FileName: Facet.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractFacet;

/**
 * Facet entity.
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public class Facet extends AbstractFacet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Facet() {
	}

	/** minimal constructor */
	public Facet(FacetId id, String name, String nodeType, String parentNode,
			String releaseType) {
		super(id, name, nodeType, parentNode, releaseType);
	}

	/** full constructor */
	public Facet(FacetId id, String name, String nodeType, String parentNode,
			Byte isLeaf, Integer level, String releaseType,
			Date lastModifiedTime, String creator, String description,
			Set classificationindexes) {
		super(id, name, nodeType, parentNode, isLeaf, level, releaseType,
				lastModifiedTime, creator, description, classificationindexes);
	}

}
