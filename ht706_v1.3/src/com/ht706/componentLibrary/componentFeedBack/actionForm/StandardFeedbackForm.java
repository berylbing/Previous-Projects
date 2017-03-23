/**
 * @FileName	StandardFeedbackForm.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.actionForm
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.actionForm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;

public class StandardFeedbackForm extends ActionForm {

	private String version;
	private String about;
	private String creatorId;
	
	private List <StandardFeedbackItem> standFeedbackItems = new ArrayList<StandardFeedbackItem>();
	private StandardFeedbackItem standardFeedbackItem = new StandardFeedbackItem();
	private Integer itemFunctionID;
	private StandardFeedback standardFeedback;

	public StandardFeedback getStandardFeedback() {
		return standardFeedback;
	}

	public void setStandardFeedback(StandardFeedback standardFeedback) {
		this.standardFeedback = standardFeedback;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<StandardFeedbackItem> getStandFeedbackItems() {
		return standFeedbackItems;
	}

	public void setStandFeedbackItems(List<StandardFeedbackItem> standFeedbackItems) {
		this.standFeedbackItems = standFeedbackItems;
	}

	public StandardFeedbackItem getStandardFeedbackItem() {
		return standardFeedbackItem;
	}

	public void setStandardFeedbackItem(StandardFeedbackItem standardFeedbackItem) {
		this.standardFeedbackItem = standardFeedbackItem;
	}

	public Integer getItemFunctionID() {
		return itemFunctionID;
	}

	public void setItemFunctionID(Integer itemFunctionID) {
		this.itemFunctionID = itemFunctionID;
	}
	
}
