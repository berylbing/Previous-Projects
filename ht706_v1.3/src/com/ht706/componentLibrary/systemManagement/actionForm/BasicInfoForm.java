package com.ht706.componentLibrary.systemManagement.actionForm;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class BasicInfoForm extends ActionForm {
	private Library library = new Library();
	private String dateOfCreation;
	
	
	
	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}


	
	
	
}
