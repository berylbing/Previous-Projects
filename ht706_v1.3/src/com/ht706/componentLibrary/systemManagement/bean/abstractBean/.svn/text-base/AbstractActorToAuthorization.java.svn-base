package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;

/**
 * AbstractActorToAuthorization entity provides the base persistence definition
 * of the ActorToAuthorization entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractActorToAuthorization implements
		java.io.Serializable {

	// Fields

	private Integer relationId;
	private Actor actor;
	private Authorization authorization;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractActorToAuthorization() {
	}

	/** minimal constructor */
	public AbstractActorToAuthorization(Integer relationId) {
		this.relationId = relationId;
	}

	/** full constructor */
	public AbstractActorToAuthorization(Integer relationId, Actor actor,
			Authorization authorization, String description) {
		this.relationId = relationId;
		this.actor = actor;
		this.authorization = authorization;
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

	public Authorization getAuthorization() {
		return this.authorization;
	}

	public void setAuthorization(Authorization authorization) {
		this.authorization = authorization;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}