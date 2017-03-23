/**
 * @FileName	AbstractFeedback.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.abstractBean
 * @author ¼ÖÀÖËÉ
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;



/**
 * AbstractFeedback entity provides the base persistence definition of the
 * Feedback entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFeedback implements java.io.Serializable {

	// Fields

	private String recordId;		//¼ÇÂ¼ºÅ
	private Asset asset;
	private String registryId;		//µÇ¼ÇºÅ
	private String description;
	private Date dateOfInformation;
	private Integer sfId;
	private String provider;
	private String file;
	private String background;
	private String enviroment;
	private Integer status;			//´ú±íÊ²Ã´×´Ì¬
	private Set<FeedbackItem> feedbackitems = new HashSet<FeedbackItem>(0);

	// Constructors

	/** default constructor */
	public AbstractFeedback() {
	}

	/** minimal constructor */
	public AbstractFeedback(String recordId, Asset asset, String registryId) {
		this.recordId = recordId;
		this.asset = asset;
		this.registryId = registryId;
	}

	/** full constructor */
	public AbstractFeedback(String recordId, Asset asset, String registryId,
			String description, Date dateOfInformation, Integer sfId,
			String provider, String file, String background, String enviroment,
			Integer status, Set<FeedbackItem> feedbackitems) {
		this.recordId = recordId;
		this.asset = asset;
		this.registryId = registryId;
		this.description = description;
		this.dateOfInformation = dateOfInformation;
		this.sfId = sfId;
		this.provider = provider;
		this.file = file;
		this.background = background;
		this.enviroment = enviroment;
		this.status = status;
		this.feedbackitems = feedbackitems;
	}

	// Property accessors

	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public String getRegistryId() {
		return this.registryId;
	}

	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public Integer getSfId() {
		return this.sfId;
	}

	public void setSfId(Integer sfId) {
		this.sfId = sfId;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getBackground() {
		return this.background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getEnviroment() {
		return this.enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<FeedbackItem> getFeedbackitems() {
		return this.feedbackitems;
	}

	public void setFeedbackitems(Set<FeedbackItem> feedbackitems) {
		this.feedbackitems = feedbackitems;
	}

}