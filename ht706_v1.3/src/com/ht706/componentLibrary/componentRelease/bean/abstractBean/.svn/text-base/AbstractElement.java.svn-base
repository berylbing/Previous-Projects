package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractElement entity provides the base persistence definition of the
 * Element entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractElement implements java.io.Serializable {

	// Fields

	private String elementUniqueId;
	private String name;
	private String elementType;
	private String media;
	private Date dateOfInformation;
	private Integer certificationState;
	private String provider;
	private String description;
	private Set elimentfileses = new HashSet(0);
	private Set ismadeofs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractElement() {
	}

	/** minimal constructor */
	public AbstractElement(String elementUniqueId, String name,
			String elementType, Date dateOfInformation,
			Integer certificationState, String provider) {
		this.elementUniqueId = elementUniqueId;
		this.name = name;
		this.elementType = elementType;
		this.dateOfInformation = dateOfInformation;
		this.certificationState = certificationState;
		this.provider = provider;
	}

	/** full constructor */
	public AbstractElement(String elementUniqueId, String name,
			String elementType, String media, Date dateOfInformation,
			Integer certificationState, String provider, String description,
			Set elimentfileses, Set ismadeofs) {
		this.elementUniqueId = elementUniqueId;
		this.name = name;
		this.elementType = elementType;
		this.media = media;
		this.dateOfInformation = dateOfInformation;
		this.certificationState = certificationState;
		this.provider = provider;
		this.description = description;
		this.elimentfileses = elimentfileses;
		this.ismadeofs = ismadeofs;
	}

	// Property accessors

	public String getElementUniqueId() {
		return this.elementUniqueId;
	}

	public void setElementUniqueId(String elementUniqueId) {
		this.elementUniqueId = elementUniqueId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getMedia() {
		return this.media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public Integer getCertificationState() {
		return this.certificationState;
	}

	public void setCertificationState(Integer certificationState) {
		this.certificationState = certificationState;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getElimentfileses() {
		return this.elimentfileses;
	}

	public void setElimentfileses(Set elimentfileses) {
		this.elimentfileses = elimentfileses;
	}

	public Set getIsmadeofs() {
		return this.ismadeofs;
	}

	public void setIsmadeofs(Set ismadeofs) {
		this.ismadeofs = ismadeofs;
	}

}