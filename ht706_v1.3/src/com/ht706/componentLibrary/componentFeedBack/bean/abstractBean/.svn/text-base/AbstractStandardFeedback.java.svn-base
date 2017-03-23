/**
 * @FileName	AbstractStandardfeedback.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.abstractBean
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;

/**
 * AbstractStandardfeedback entity provides the base persistence definition of
 * the Standardfeedback entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStandardFeedback implements java.io.Serializable {

	// Fields

	private Integer sfId;
	private Date dateOfInformation;
	private String creatorId;
	private String status;
	private String version;
	private String accordingToVersion;
	private String about;
	private Set<StandardFeedbackItem> standardfeedbackitems = new HashSet<StandardFeedbackItem>(0);

	// Constructors

	/** default constructor */
	public AbstractStandardFeedback() {
	}

	/** minimal constructor */
	public AbstractStandardFeedback(Integer sfId) {
		this.sfId = sfId;
	}

	/** full constructor */
	public AbstractStandardFeedback(Integer sfId, Date dateOfInformation,
			String creatorId, String status, String version,
			String accordingToVersion, String about, Set<StandardFeedbackItem> standardfeedbackitems) {
		this.sfId = sfId;
		this.dateOfInformation = dateOfInformation;
		this.creatorId = creatorId;
		this.status = status;
		this.version = version;
		this.accordingToVersion = accordingToVersion;
		this.about = about;
		this.standardfeedbackitems = standardfeedbackitems;
	}

	// Property accessors

	public Integer getSfId() {
		return this.sfId;
	}

	public void setSfId(Integer sfId) {
		this.sfId = sfId;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAccordingToVersion() {
		return this.accordingToVersion;
	}

	public void setAccordingToVersion(String accordingToVersion) {
		this.accordingToVersion = accordingToVersion;
	}

	public String getAbout() {
		return this.about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Set<StandardFeedbackItem> getStandardfeedbackitems() {
		return this.standardfeedbackitems;
	}

	public void setStandardfeedbackitems(Set<StandardFeedbackItem> standardfeedbackitems) {
		this.standardfeedbackitems = standardfeedbackitems;
	}

}