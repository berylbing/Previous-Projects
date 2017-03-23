/**
 * @FileName	AbstractStandardfeedbackitem.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.abstractBean
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.abstractBean;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;

/**
 * AbstractStandardfeedbackitem entity provides the base persistence definition
 * of the Standardfeedbackitem entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStandardFeedbackItem implements
		java.io.Serializable {

	// Fields

	private Integer itemId;
	private StandardFeedback standardfeedback;
	private String itemName;
	private String scoreStandard;
	private String detail;
	private String description;
	private ItemFunction itemFunction;
	
	// Constructors

	/** default constructor */
	public AbstractStandardFeedbackItem() {
	}

	/** minimal constructor */
	public AbstractStandardFeedbackItem(Integer itemId,
			StandardFeedback standardfeedback, ItemFunction itemFunction) {
		this.itemId = itemId;
		this.standardfeedback = standardfeedback;
		this.itemFunction = itemFunction;
	}

	/** full constructor */
	public AbstractStandardFeedbackItem(Integer itemId,
			StandardFeedback standardfeedback, String itemName,
			String scoreStandard, String detail, String description,
			ItemFunction itemFunction) {
		this.itemId = itemId;
		this.standardfeedback = standardfeedback;
		this.itemName = itemName;
		this.scoreStandard = scoreStandard;
		this.detail = detail;
		this.description = description;
		this.itemFunction = itemFunction;
	}

	// Property accessors

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public StandardFeedback getStandardfeedback() {
		return this.standardfeedback;
	}

	public void setStandardfeedback(StandardFeedback standardfeedback) {
		this.standardfeedback = standardfeedback;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getScoreStandard() {
		return this.scoreStandard;
	}

	public void setScoreStandard(String scoreStandard) {
		this.scoreStandard = scoreStandard;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemFunction getItemFunction() {
		return itemFunction;
	}

	public void setItemFunction(ItemFunction itemFunction) {
		this.itemFunction = itemFunction;
	}

}