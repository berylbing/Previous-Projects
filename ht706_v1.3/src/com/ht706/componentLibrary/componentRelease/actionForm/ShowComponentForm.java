package com.ht706.componentLibrary.componentRelease.actionForm;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

public class ShowComponentForm extends ActionForm {
	private List<Asset> list;

	public void setList(List<Asset> list) {
		this.list = list;
	}

	public List<Asset> getList() {
		return list;
	}
}
