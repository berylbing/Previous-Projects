/**
 * Copyright (c) 2010, 
 * 
 * @FileName: Synchlog.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractSynonym;

/**
 * Synonym entity.
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public class Synonym extends AbstractSynonym implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Synonym() {
	}

	/** minimal constructor */
	public Synonym(String synonymUuid, String specUuid, String sourceItem,
			String targetItem) {
		super(synonymUuid, specUuid, sourceItem, targetItem);
	}

	/** full constructor */
	public Synonym(String synonymUuid, String specUuid, String sourceItem,
			String targetItem, Date lastModifiedTime, String description) {
		super(synonymUuid, specUuid, sourceItem, targetItem, lastModifiedTime,
				description);
	}

}
