package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import java.util.Date;

/**
 * AbstractComponentrelation entity provides the base persistence definition of
 * the Componentrelation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractComponentrelation implements java.io.Serializable {

	// Fields

	private Integer relationUuid;
	private String sourceAsset;
	private String targetAsset;
	private String relationType;
	private Date lastModifiedTime;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractComponentrelation() {
	}

	/** minimal constructor */
	public AbstractComponentrelation(Integer relationUuid) {
		this.relationUuid = relationUuid;
	}

	/** full constructor */
	public AbstractComponentrelation(Integer relationUuid, String sourceAsset,
			String targetAsset, String relationType, Date lastModifiedTime,
			String description) {
		this.relationUuid = relationUuid;
		this.sourceAsset = sourceAsset;
		this.targetAsset = targetAsset;
		this.relationType = relationType;
		this.lastModifiedTime = lastModifiedTime;
		this.description = description;
	}

	// Property accessors

	public Integer getRelationUuid() {
		return this.relationUuid;
	}

	public void setRelationUuid(Integer relationUuid) {
		this.relationUuid = relationUuid;
	}

	public String getSourceAsset() {
		return this.sourceAsset;
	}

	public void setSourceAsset(String sourceAsset) {
		this.sourceAsset = sourceAsset;
	}

	public String getTargetAsset() {
		return this.targetAsset;
	}

	public void setTargetAsset(String targetAsset) {
		this.targetAsset = targetAsset;
	}

	public String getRelationType() {
		return this.relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}