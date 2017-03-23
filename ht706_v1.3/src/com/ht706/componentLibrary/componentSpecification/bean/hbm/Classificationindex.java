/**
 * Copyright (c) 2010, 
 * 
 * @FileName: Classificationindex.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.hbm;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.abstractBean.AbstractClassificationindex;

/**
 * Classificationindex entity.
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public class Classificationindex extends AbstractClassificationindex implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Classificationindex() {
	}

	/** minimal constructor */
	public Classificationindex(Integer id, Asset asset, String facetUuid,
			String assetName, String provider, String domain, String url,
			String libraryUniqueId) {
		super(id, asset, facetUuid, assetName, provider, domain, url,
				libraryUniqueId);
	}

	/** full constructor */
	public Classificationindex(Integer id, Asset asset, String facetUuid,
			String assetName, String provider, String domain, Date versionDate,
			String url, String libraryUniqueId, String grade) {
		super(id, asset, facetUuid, assetName, provider, domain, versionDate,
				url, libraryUniqueId, grade);
	}

}
