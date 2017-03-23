package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;

/**
 * AbstractUsertoactor entity provides the base persistence definition of the
 * Usertoactor entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserToActor implements java.io.Serializable {

	// Fields

	private Integer relationId;
	private Actor actor;
	private Organization organization;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractUserToActor() {
	}

	/** minimal constructor */
	public AbstractUserToActor(Integer relationId) {
		this.relationId = relationId;
	}

	/** full constructor */
	public AbstractUserToActor(Integer relationId, Actor actor,
			Organization organization, String description) {
		this.relationId = relationId;
		this.actor = actor;
		this.organization = organization;
		this.description = description;
	}

	// Property accessors

	public Integer getRelationId() {
		return this.relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public Actor getActor() {
		return this.actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}