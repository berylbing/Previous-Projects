package com.ht706.componentLibrary.systemManagement.actionForm;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class AuthorizationToActorForm {
	private int [] selectedAuthorization;

	public void setSelectedAuthorization(int [] selectedAuthorization) {
		this.selectedAuthorization = selectedAuthorization;
	}

	public int [] getSelectedAuthorization() {
		return selectedAuthorization;
	}
}
