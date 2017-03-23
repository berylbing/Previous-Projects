/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractRelationtype.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.abstractBean
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.abstractBean;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.*;

import java.util.Date;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public abstract class AbstractRelationtype implements java.io.Serializable {

	// Fields

	private RelationtypeId id;
	private String relationName;
	private String relationType;
	private Date lastModifiedTime;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractRelationtype() {
	}

	/** minimal constructor */
	public AbstractRelationtype(RelationtypeId id, String relationName,
			String relationType) {
		this.id = id;
		this.relationName = relationName;
		this.relationType = relationType;
	}

	/** full constructor */
	public AbstractRelationtype(RelationtypeId id, String relationName,
			String relationType, Date lastModifiedTime, String description) {
		this.id = id;
		this.relationName = relationName;
		this.relationType = relationType;
		this.lastModifiedTime = lastModifiedTime;
		this.description = description;
	}

	// Property accessors

	public RelationtypeId getId() {
		return this.id;
	}

	public void setId(RelationtypeId id) {
		this.id = id;
	}

	public String getRelationName() {
		return this.relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
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