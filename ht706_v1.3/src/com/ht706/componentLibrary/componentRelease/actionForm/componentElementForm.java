package com.ht706.componentLibrary.componentRelease.actionForm;

import java.util.Date;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;

public class componentElementForm extends ActionForm {
	private Element element=new Element();
	private FormFile elementFile;
	private String  dateOfInformation;
	private String isUpdate;
	private String assetId;

	public void setElement(Element element) {
		this.element = element;
	}

	public Element getElement() {
		return element;
	}

	public void setDateOfInformation(String dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getDateOfInformation() {
		return dateOfInformation;
	}

	public void setIsUpdate(String isUpdate) {
		this.isUpdate = isUpdate;
	}

	public String getIsUpdate() {
		return isUpdate;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setElementFile(FormFile elementFile) {
		this.elementFile = elementFile;
	}

	public FormFile getElementFile() {
		return elementFile;
	}



}
