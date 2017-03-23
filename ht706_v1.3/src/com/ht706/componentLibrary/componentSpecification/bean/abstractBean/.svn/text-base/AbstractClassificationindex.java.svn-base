/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractClassificationindex.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.abstractBean
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.abstractBean;

import java.util.Date;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public abstract class AbstractClassificationindex implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private Asset asset;
	private String facetUuid;
	private String assetName;
	private String provider;
	private String domain;
	private Date versionDate;
	private String url;
	private String libraryUniqueId;
	private String grade;

	// Constructors

	/** default constructor */
	public AbstractClassificationindex() {
	}

	/** minimal constructor */
	public AbstractClassificationindex(Integer id, Asset asset,
			String facetUuid, String assetName, String provider, String domain,
			String url, String libraryUniqueId) {
		this.id = id;
		this.asset = asset;
		this.facetUuid = facetUuid;
		this.assetName = assetName;
		this.provider = provider;
		this.domain = domain;
		this.url = url;
		this.libraryUniqueId = libraryUniqueId;
	}

	/** full constructor */
	public AbstractClassificationindex(Integer id, Asset asset,
			String facetUuid, String assetName, String provider, String domain,
			Date versionDate, String url, String libraryUniqueId, String grade) {
		this.id = id;
		this.asset = asset;
		this.facetUuid = facetUuid;
		this.assetName = assetName;
		this.provider = provider;
		this.domain = domain;
		this.versionDate = versionDate;
		this.url = url;
		this.libraryUniqueId = libraryUniqueId;
		this.grade = grade;
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

	public String getFacetUuid() {
		return this.facetUuid;
	}

	public void setFacetUuid(String facetUuid) {
		this.facetUuid = facetUuid;
	}

	public String getAssetName() {
		return this.assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Date getVersionDate() {
		return this.versionDate;
	}

	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLibraryUniqueId() {
		return this.libraryUniqueId;
	}

	public void setLibraryUniqueId(String libraryUniqueId) {
		this.libraryUniqueId = libraryUniqueId;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


}