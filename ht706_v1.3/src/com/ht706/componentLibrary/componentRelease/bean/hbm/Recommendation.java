package com.ht706.componentLibrary.componentRelease.bean.hbm;

import com.ht706.componentLibrary.componentRelease.bean.abstractBean.AbstractRecommendation;

/**
 * Recommendation entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Recommendation extends AbstractRecommendation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Recommendation() {
	}

	/** minimal constructor */
	public Recommendation(Integer rid) {
		super(rid);
	}

	/** full constructor */
	public Recommendation(Integer rid, Asset asset, String dateOfInformation,
			String recommenderId, String assetType, String functionality,
			String usablity, String reason, Integer file) {
		super(rid, asset, dateOfInformation, recommenderId, assetType,
				functionality, usablity, reason, file);
	}

}
