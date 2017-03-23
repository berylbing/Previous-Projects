package com.ht706.componentLibrary.componentRelease.bean.hbm;

import com.ht706.componentLibrary.componentRelease.bean.abstractBean.AbstractIslocatedin;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;

/**
 * Islocatedin entity. @author MyEclipse Persistence Tools
 */
public class Islocatedin extends AbstractIslocatedin implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Islocatedin() {
	}

	/** full constructor */
	public Islocatedin(Integer id, Asset asset, Library library) {
		super(id, asset, library);
	}

}
