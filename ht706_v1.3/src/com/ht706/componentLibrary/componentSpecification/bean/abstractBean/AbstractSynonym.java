/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractSynonym.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.abstractBean
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.abstractBean;

import java.util.Date;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public abstract class AbstractSynonym implements java.io.Serializable {

	// Fields

	private String synonymUuid;
	private String specUuid;
	private String sourceItem;
	private String targetItem;
	private Date lastModifiedTime;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractSynonym() {
	}

	/** minimal constructor */
	public AbstractSynonym(String synonymUuid, String specUuid,
			String sourceItem, String targetItem) {
		this.synonymUuid = synonymUuid;
		this.specUuid = specUuid;
		this.sourceItem = sourceItem;
		this.targetItem = targetItem;
	}

	/** full constructor */
	public AbstractSynonym(String synonymUuid, String specUuid,
			String sourceItem, String targetItem, Date lastModifiedTime,
			String description) {
		this.synonymUuid = synonymUuid;
		this.specUuid = specUuid;
		this.sourceItem = sourceItem;
		this.targetItem = targetItem;
		this.lastModifiedTime = lastModifiedTime;
		this.description = description;
	}

	// Property accessors

	public String getSynonymUuid() {
		return this.synonymUuid;
	}

	public void setSynonymUuid(String synonymUuid) {
		this.synonymUuid = synonymUuid;
	}

	public String getSpecUuid() {
		return this.specUuid;
	}

	public void setSpecUuid(String specUuid) {
		this.specUuid = specUuid;
	}

	public String getSourceItem() {
		return this.sourceItem;
	}

	public void setSourceItem(String sourceItem) {
		this.sourceItem = sourceItem;
	}

	public String getTargetItem() {
		return this.targetItem;
	}

	public void setTargetItem(String targetItem) {
		this.targetItem = targetItem;
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