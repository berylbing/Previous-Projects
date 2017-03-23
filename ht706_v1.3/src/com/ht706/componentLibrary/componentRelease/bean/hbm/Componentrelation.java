package com.ht706.componentLibrary.componentRelease.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.componentRelease.bean.abstractBean.AbstractComponentrelation;

/**
 * Componentrelation entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Componentrelation extends AbstractComponentrelation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Componentrelation() {
	}

	/** minimal constructor */
	public Componentrelation(Integer relationUuid) {
		super(relationUuid);
	}

	/** full constructor */
	public Componentrelation(Integer relationUuid, String sourceAsset,
			String targetAsset, String relationType, Date lastModifiedTime,
			String description) {
		super(relationUuid, sourceAsset, targetAsset, relationType,
				lastModifiedTime, description);
	}

}
