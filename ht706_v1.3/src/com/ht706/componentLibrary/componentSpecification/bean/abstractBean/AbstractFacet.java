/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractFacet.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.abstractBean
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.*;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public abstract class AbstractFacet implements java.io.Serializable {

	// Fields

	private FacetId id;
	private String name;
	private String nodeType;
	private String parentNode;
	private Byte isLeaf;
	private Integer level;
	private String releaseType;
	private Date lastModifiedTime;
	private String creator;
	private String description;
	private Set classificationindexes = new HashSet(0);
	// Constructors

	/** default constructor */
	public AbstractFacet() {
	}

	/** minimal constructor */
	public AbstractFacet(FacetId id, String name, String nodeType,
			String parentNode, String releaseType) {
		this.id = id;
		this.name = name;
		this.nodeType = nodeType;
		this.parentNode = parentNode;
		this.releaseType = releaseType;
	}

	/** full constructor */
	public AbstractFacet(FacetId id, String name, String nodeType,
			String parentNode, Byte isLeaf, Integer level, String releaseType,
			Date lastModifiedTime, String creator, String description,
			Set classificationindexes) {
		this.id = id;
		this.name = name;
		this.nodeType = nodeType;
		this.parentNode = parentNode;
		this.isLeaf = isLeaf;
		this.level = level;
		this.releaseType = releaseType;
		this.lastModifiedTime = lastModifiedTime;
		this.creator = creator;
		this.description = description;
		this.classificationindexes = classificationindexes;
	}

	// Property accessors

	public FacetId getId() {
		return this.id;
	}

	public void setId(FacetId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getParentNode() {
		return this.parentNode;
	}

	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

	public Byte getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(Byte isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getReleaseType() {
		return this.releaseType;
	}

	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getClassificationindexes() {
		return this.classificationindexes;
	}

	public void setClassificationindexes(Set classificationindexes) {
		this.classificationindexes = classificationindexes;
	}

}