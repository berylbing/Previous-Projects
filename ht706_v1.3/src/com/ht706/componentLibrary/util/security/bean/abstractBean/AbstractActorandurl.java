package com.ht706.componentLibrary.util.security.bean.abstractBean;

import com.ht706.componentLibrary.util.security.bean.hbm.ActorandurlId;

/**
 * AbstractActorandurl entity provides the base persistence definition of the
 * Actorandurl entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractActorandurl implements java.io.Serializable {

	// Fields

	private ActorandurlId id;

	// Constructors

	/** default constructor */
	public AbstractActorandurl() {
	}

	/** full constructor */
	public AbstractActorandurl(ActorandurlId id) {
		this.id = id;
	}

	// Property accessors

	public ActorandurlId getId() {
		return this.id;
	}

	public void setId(ActorandurlId id) {
		this.id = id;
	}

}