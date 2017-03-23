/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractSpecification.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.abstractBean
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public abstract class AbstractSpecification implements java.io.Serializable {

	// Fields

	private String specUuid;
	private Date dateOfInformation;
	private String precedeSpec;
	private String version;
	private Integer releaseType;
	private String creator;
	private Integer status;
	private String reason;
	private String description;
	private Set relationtypes = new HashSet(0);
	private Set facets = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSpecification() {
	}

	/** minimal constructor */
	public AbstractSpecification(String specUuid) {
		this.specUuid = specUuid;
	}

	/** full constructor */
	public AbstractSpecification(String specUuid, Date dateOfInformation,
			String precedeSpec, String version, Integer releaseType,
			String creator, Integer status, String reason, String description,
			Set relationtypes, Set facets) {
		this.specUuid = specUuid;
		this.dateOfInformation = dateOfInformation;
		this.precedeSpec = precedeSpec;
		this.version = version;
		this.releaseType = releaseType;
		this.creator = creator;
		this.status = status;
		this.reason = reason;
		this.description = description;
		this.relationtypes = relationtypes;
		this.facets = facets;
	}

	// Property accessors

	public String getSpecUuid() {
		return this.specUuid;
	}

	public void setSpecUuid(String specUuid) {
		this.specUuid = specUuid;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getPrecedeSpec() {
		return this.precedeSpec;
	}

	public void setPrecedeSpec(String precedeSpec) {
		this.precedeSpec = precedeSpec;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getReleaseType() {
		return this.releaseType;
	}

	public void setReleaseType(Integer releaseType) {
		this.releaseType = releaseType;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getRelationtypes() {
		return this.relationtypes;
	}

	public void setRelationtypes(Set relationtypes) {
		this.relationtypes = relationtypes;
	}

	public Set getFacets() {
		return this.facets;
	}

	public void setFacets(Set facets) {
		this.facets = facets;
	}

}