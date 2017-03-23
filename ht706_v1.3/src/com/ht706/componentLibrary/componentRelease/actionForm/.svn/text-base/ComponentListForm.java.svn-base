package com.ht706.componentLibrary.componentRelease.actionForm;

import java.util.List;
import java.util.Set;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;

public class ComponentListForm extends ActionForm {
	private List<Asset> componentList;
	private int page;
	private int allNum;
	private String selectedAsset[];
	private String[] selectedComponent;
	private Set<Relationtype> relationTypes;

	public void setAllNum(int allNum) {
		this.allNum = allNum;
	}

	public int getAllNum() {
		return allNum;
	}
	public void setPage(int page) {
		this.page = page;
	}

	public int getPage() {
		return page;
	}
	public void setComponentList(List<Asset> componentList) {
		this.componentList = componentList;
		if(componentList!=null)allNum=componentList.size();
		else allNum=0;
	}

	public List<Asset> getComponentList() {
		return componentList;
	}

	public void setSelectedComponent(String[] selectedComponent) {
		this.selectedComponent = selectedComponent;
	}

	public String[] getSelectedComponent() {
		return selectedComponent;
	}

	public void setSelectedAsset(String selectedAsset[]) {
		this.selectedAsset = selectedAsset;
	}

	public String[] getSelectedAsset() {
		return selectedAsset;
	}

	public void setRelationTypes(Set<Relationtype> relationTypes) {
		this.relationTypes = relationTypes;
	}

	public Set<Relationtype> getRelationTypes() {
		return relationTypes;
	}
	
}
