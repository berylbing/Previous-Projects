package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;

/**
 * AbstractContactis entity provides the base persistence definition of the
 * Contactis entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractContactis implements java.io.Serializable {

	// Fields

	private Integer id;
	private Organization organization;
	private Library library;

	// Constructors

	/** default constructor */
	public AbstractContactis() {
	}

	/** full constructor */
	public AbstractContactis(Integer id, Organization organization,
			Library library) {
		this.id = id;
		this.organization = organization;
		this.library = library;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Library getLibrary() {
		return this.library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

}