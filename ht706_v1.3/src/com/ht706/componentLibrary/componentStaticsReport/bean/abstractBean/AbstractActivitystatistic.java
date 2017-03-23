package com.ht706.componentLibrary.componentStaticsReport.bean.abstractBean;

import java.util.Date;

/**
 * AbstractActivitystatistic entity provides the base persistence definition of
 * the Activitystatistic entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractActivitystatistic implements java.io.Serializable {

	// Fields

	private Integer statId;
	private String assetUniqueId;
	private Integer operationType;
	private Date operationTime;
	private String operator;

	// Constructors

	/** default constructor */
	public AbstractActivitystatistic() {
	}

	/** minimal constructor */
	public AbstractActivitystatistic(Integer statId) {
		this.statId = statId;
	}

	/** full constructor */
	public AbstractActivitystatistic(Integer statId, String assetUniqueId,
			Integer operationType, Date operationTime, String operator) {
		this.statId = statId;
		this.assetUniqueId = assetUniqueId;
		this.operationType = operationType;
		this.operationTime = operationTime;
		this.operator = operator;
	}

	// Property accessors

	public Integer getStatId() {
		return this.statId;
	}

	public void setStatId(Integer statId) {
		this.statId = statId;
	}

	public String getAssetUniqueId() {
		return this.assetUniqueId;
	}

	public void setAssetUniqueId(String assetUniqueId) {
		this.assetUniqueId = assetUniqueId;
	}

	public Integer getOperationType() {
		return this.operationType;
	}

	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}

	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}