package com.ht706.componentLibrary.systemManagement.actionForm;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class ActorForm extends ActionForm {
	private Actor actor=new Actor();
	private int [] selectedActor;
	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Actor getActor() {
		return actor;
	}

	public void setSelectedActor(int [] selectedActor) {
		this.selectedActor = selectedActor;
	}

	public int [] getSelectedActor() {
		return selectedActor;
	}
}
