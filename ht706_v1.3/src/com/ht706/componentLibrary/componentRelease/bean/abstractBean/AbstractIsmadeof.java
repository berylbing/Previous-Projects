package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;

/**
 * AbstractIsmadeof entity provides the base persistence definition of the
 * Ismadeof entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsmadeof implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Asset asset;
	private Element element;

	// Constructors

	/** default constructor */
	public AbstractIsmadeof() {
	}

	/** full constructor */
	public AbstractIsmadeof(Integer uid, Asset asset, Element element) {
		this.uid = uid;
		this.asset = asset;
		this.element = element;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Element getElement() {
		return this.element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

}