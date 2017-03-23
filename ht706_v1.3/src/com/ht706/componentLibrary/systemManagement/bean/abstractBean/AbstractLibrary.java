package com.ht706.componentLibrary.systemManagement.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractLibrary entity provides the base persistence definition of the
 * Library entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLibrary implements java.io.Serializable {

	// Fields

	private String libraryUniqueId;
	private String name;
	private String certificationMethods;
	private String electronicAddress;
	private String contactMethod;
	private String libraryClassificationMechanism;
	private String libraryMetrics;
	private String libraryRestrications;
	private Date dateOfCreation;
	private Set contactises = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractLibrary() {
	}

	/** minimal constructor */
	public AbstractLibrary(String libraryUniqueId, String name) {
		this.libraryUniqueId = libraryUniqueId;
		this.name = name;
	}

	/** full constructor */
	public AbstractLibrary(String libraryUniqueId, String name,
			String certificationMethods, String electronicAddress,
			String contactMethod, String libraryClassificationMechanism,
			String libraryMetrics, String libraryRestrications,
			Date dateOfCreation, Set contactises) {
		this.libraryUniqueId = libraryUniqueId;
		this.name = name;
		this.certificationMethods = certificationMethods;
		this.electronicAddress = electronicAddress;
		this.contactMethod = contactMethod;
		this.libraryClassificationMechanism = libraryClassificationMechanism;
		this.libraryMetrics = libraryMetrics;
		this.libraryRestrications = libraryRestrications;
		this.dateOfCreation = dateOfCreation;
		this.contactises = contactises;
	}

	// Property accessors

	public String getLibraryUniqueId() {
		return this.libraryUniqueId;
	}

	public void setLibraryUniqueId(String libraryUniqueId) {
		this.libraryUniqueId = libraryUniqueId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificationMethods() {
		return this.certificationMethods;
	}

	public void setCertificationMethods(String certificationMethods) {
		this.certificationMethods = certificationMethods;
	}

	public String getElectronicAddress() {
		return this.electronicAddress;
	}

	public void setElectronicAddress(String electronicAddress) {
		this.electronicAddress = electronicAddress;
	}

	public String getContactMethod() {
		return this.contactMethod;
	}

	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}

	public String getLibraryClassificationMechanism() {
		return this.libraryClassificationMechanism;
	}

	public void setLibraryClassificationMechanism(
			String libraryClassificationMechanism) {
		this.libraryClassificationMechanism = libraryClassificationMechanism;
	}

	public String getLibraryMetrics() {
		return this.libraryMetrics;
	}

	public void setLibraryMetrics(String libraryMetrics) {
		this.libraryMetrics = libraryMetrics;
	}

	public String getLibraryRestrications() {
		return this.libraryRestrications;
	}

	public void setLibraryRestrications(String libraryRestrications) {
		this.libraryRestrications = libraryRestrications;
	}

	public Date getDateOfCreation() {
		return this.dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}


	public Set getContactises() {
		return this.contactises;
	}

	public void setContactises(Set contactises) {
		this.contactises = contactises;
	}

}