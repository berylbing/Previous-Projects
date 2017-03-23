package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAuthorization entity provides the base persistence definition of the
 * Authorization entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAuthorization implements java.io.Serializable {

	// Fields

	private Integer authorizationId;
	private String name;
	private String description;
	private Set authorizationtourls = new HashSet(0);
	private Set actortoauthorizations = new HashSet(0);
	private String module;
	// Constructors

	/** default constructor */
	public AbstractAuthorization() {
	}

	/** minimal constructor */
	public AbstractAuthorization(Integer authorizationId) {
		this.authorizationId = authorizationId;
	}

	/** full constructor */
	public AbstractAuthorization(Integer authorizationId, String name,
			String description, String module, Set authorizationtourls,
			Set actortoauthorizations) {
		this.authorizationId = authorizationId;
		this.name = name;
		this.description = description;
		this.authorizationtourls = authorizationtourls;
		this.actortoauthorizations = actortoauthorizations;
	}

	// Property accessors

	public Integer getAuthorizationId() {
		return this.authorizationId;
	}

	public void setAuthorizationId(Integer authorizationId) {
		this.authorizationId = authorizationId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getAuthorizationtourls() {
		return this.authorizationtourls;
	}

	public void setAuthorizationtourls(Set authorizationtourls) {
		this.authorizationtourls = authorizationtourls;
	}

	public Set getActortoauthorizations() {
		return this.actortoauthorizations;
	}

	public void setActortoauthorizations(Set actortoauthorizations) {
		this.actortoauthorizations = actortoauthorizations;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getModule() {
		return module;
	}

}