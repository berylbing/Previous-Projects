package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;

/**
 * AbstractWascreatedby entity provides the base persistence definition of the
 * Wascreatedby entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWascreatedby implements java.io.Serializable {

	// Fields

	private Integer id;
	private Organization organization;
	private Asset asset;

	// Constructors

	/** default constructor */
	public AbstractWascreatedby() {
	}

	/** full constructor */
	public AbstractWascreatedby(Integer id, Organization organization,
			Asset asset) {
		this.id = id;
		this.organization = organization;
		this.asset = asset;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

}