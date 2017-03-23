package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractActor entity provides the base persistence definition of the Actor
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractActor implements java.io.Serializable {

	// Fields

	private Integer actorId;
	private String actorName;
	private String responsibility;
	private Set usertoactors = new HashSet(0);
	private Set actortoauthorizations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractActor() {
	}

	/** minimal constructor */
	public AbstractActor(Integer actorId) {
		this.actorId = actorId;
	}

	/** full constructor */
	public AbstractActor(Integer actorId, String actorName,
			String responsibility, Set usertoactors, Set actortoauthorizations) {
		this.actorId = actorId;
		this.actorName = actorName;
		this.responsibility = responsibility;
		this.usertoactors = usertoactors;
		this.actortoauthorizations = actortoauthorizations;
	}

	// Property accessors

	public Integer getActorId() {
		return this.actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return this.actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getResponsibility() {
		return this.responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public Set getUsertoactors() {
		return this.usertoactors;
	}

	public void setUsertoactors(Set usertoactors) {
		this.usertoactors = usertoactors;
	}

	public Set getActortoauthorizations() {
		return this.actortoauthorizations;
	}

	public void setActortoauthorizations(Set actortoauthorizations) {
		this.actortoauthorizations = actortoauthorizations;
	}

}