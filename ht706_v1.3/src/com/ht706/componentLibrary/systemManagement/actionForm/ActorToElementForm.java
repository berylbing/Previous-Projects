package com.ht706.componentLibrary.systemManagement.actionForm;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class ActorToElementForm extends ActionForm{
	private int [] selectedElement;
	private int id;
	public void setSelectedElement(int [] selectedElement) {
		this.selectedElement = selectedElement;
	}

	public int [] getSelectedElement() {
		return selectedElement;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
