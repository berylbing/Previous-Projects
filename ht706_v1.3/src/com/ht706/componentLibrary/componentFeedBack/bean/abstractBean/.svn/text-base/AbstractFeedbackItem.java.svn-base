/**
 * @FileName	AbstractFeedbackitem.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.abstractBean
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.abstractBean;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;

/**
 * AbstractFeedbackitem entity provides the base persistence definition of the
 * Feedbackitem entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFeedbackItem implements java.io.Serializable {

	// Fields
	private int itemId;
	private Feedback feedback;
	private String itemName;
	private String score;
	private String description;
	private String scoreStandard;
	private String detail;
	private ItemFunction itemFunction;

	// Constructors

	public String getScoreStandard() {
		return scoreStandard;
	}

	public void setScoreStandard(String scoreStandard) {
		this.scoreStandard = scoreStandard;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public ItemFunction getItemFunction() {
		return itemFunction;
	}

	public void setItemFunction(ItemFunction itemFunction) {
		this.itemFunction = itemFunction;
	}

	/** default constructor */
	public AbstractFeedbackItem() {
	}

	/** minimal constructor */
	public AbstractFeedbackItem(Integer itemId) {
		this.itemId = itemId;
	}

	/** full constructor */
	public AbstractFeedbackItem(Integer itemId, Feedback feedback,
			String itemName, String score, String description, 
			String scoreStandard, String detail, ItemFunction itemFunction) {
		this.itemId = itemId;
		this.feedback = feedback;
		this.itemName = itemName;
		this.score = score;
		this.description = description;
		this.scoreStandard = scoreStandard;
		this.detail = detail;
		this.itemFunction = itemFunction;
	}

	// Property accessors

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Feedback getFeedback() {
		return this.feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}