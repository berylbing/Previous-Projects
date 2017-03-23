/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractSynchlog.java
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
public abstract class AbstractSynchlog implements java.io.Serializable {

	// Fields

	private Integer id;
	private String specUuid;
	private String precedeSpec;
	private Date dateOfInformation;
	private String fromIp;
	private String toIp;
	private String responseCode;
	private String synType;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractSynchlog() {
	}

	/** minimal constructor */
	public AbstractSynchlog(Integer id, String specUuid) {
		this.id = id;
		this.specUuid = specUuid;
	}

	/** full constructor */
	public AbstractSynchlog(Integer id, String specUuid, String precedeSpec,
			Date dateOfInformation, String fromIp, String toIp,
			String responseCode, String synType, String description) {
		this.id = id;
		this.specUuid = specUuid;
		this.precedeSpec = precedeSpec;
		this.dateOfInformation = dateOfInformation;
		this.fromIp = fromIp;
		this.toIp = toIp;
		this.responseCode = responseCode;
		this.synType = synType;
		this.description = description;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpecUuid() {
		return this.specUuid;
	}

	public void setSpecUuid(String specUuid) {
		this.specUuid = specUuid;
	}

	public String getPrecedeSpec() {
		return this.precedeSpec;
	}

	public void setPrecedeSpec(String precedeSpec) {
		this.precedeSpec = precedeSpec;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getFromIp() {
		return this.fromIp;
	}

	public void setFromIp(String fromIp) {
		this.fromIp = fromIp;
	}

	public String getToIp() {
		return this.toIp;
	}

	public void setToIp(String toIp) {
		this.toIp = toIp;
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getSynType() {
		return this.synType;
	}

	public void setSynType(String synType) {
		this.synType = synType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}