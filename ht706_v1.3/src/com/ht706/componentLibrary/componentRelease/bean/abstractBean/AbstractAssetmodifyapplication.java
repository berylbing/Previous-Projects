package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import java.util.Date;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

/**
 * AbstractAssetmodifyapplication entity provides the base persistence
 * definition of the Assetmodifyapplication entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractAssetmodifyapplication implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private Asset asset;
	private String registryId;
	private Integer applicant;
	private Date dateOfInformation;
	private Integer selectedItem;
	private String reason;
	private Integer reasonBy;
	private String scheme;
	private Integer schemeBy;
	private String attitude;
	private Integer attitudeBy;
	private Integer status;

	// Constructors

	/** default constructor */
	public AbstractAssetmodifyapplication() {
	}

	/** minimal constructor */
	public AbstractAssetmodifyapplication(Integer id, Asset asset,
			String registryId) {
		this.id = id;
		this.asset = asset;
		this.registryId = registryId;
	}

	/** full constructor */
	public AbstractAssetmodifyapplication(Integer id, Asset asset,
			String registryId, Integer applicant, Date dateOfInformation,
			Integer selectedItem, String reason, Integer reasonBy,
			String scheme, Integer schemeBy, String attitude,
			Integer attitudeBy, Integer status) {
		this.id = id;
		this.asset = asset;
		this.registryId = registryId;
		this.applicant = applicant;
		this.dateOfInformation = dateOfInformation;
		this.selectedItem = selectedItem;
		this.reason = reason;
		this.reasonBy = reasonBy;
		this.scheme = scheme;
		this.schemeBy = schemeBy;
		this.attitude = attitude;
		this.attitudeBy = attitudeBy;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public String getRegistryId() {
		return this.registryId;
	}

	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}

	public Integer getApplicant() {
		return this.applicant;
	}

	public void setApplicant(Integer applicant) {
		this.applicant = applicant;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public Integer getSelectedItem() {
		return this.selectedItem;
	}

	public void setSelectedItem(Integer selectedItem) {
		this.selectedItem = selectedItem;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getReasonBy() {
		return this.reasonBy;
	}

	public void setReasonBy(Integer reasonBy) {
		this.reasonBy = reasonBy;
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public Integer getSchemeBy() {
		return this.schemeBy;
	}

	public void setSchemeBy(Integer schemeBy) {
		this.schemeBy = schemeBy;
	}

	public String getAttitude() {
		return this.attitude;
	}

	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}

	public Integer getAttitudeBy() {
		return this.attitudeBy;
	}

	public void setAttitudeBy(Integer attitudeBy) {
		this.attitudeBy = attitudeBy;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}