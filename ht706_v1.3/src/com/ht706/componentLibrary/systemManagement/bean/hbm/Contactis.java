package com.ht706.componentLibrary.systemManagement.bean.hbm;

import com.ht706.componentLibrary.systemManagement.bean.abstractBean.AbstractContactis;

/**
 * Contactis entity. @author MyEclipse Persistence Tools
 */
public class Contactis extends AbstractContactis implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Contactis() {
	}

	/** full constructor */
	public Contactis(Integer id, Organization organization, Library library) {
		super(id, organization, library);
	}

}
