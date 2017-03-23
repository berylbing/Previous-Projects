package com.ht706.componentLibrary.componentRelease.actionForm;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Islocatedin;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;


public class ComponentForm extends ActionForm {
	private Asset asset=new Asset();
	private List<Element> elements=new ArrayList<Element>();
	private Recommendation recommendation=new Recommendation();
	private Costeffect costeffect=new Costeffect();
	private Componentrelation componentrelation=new Componentrelation();
	//private List<Library> librarys;
	private String dateOfInformation;
	private String versionDate;
	private String acceptanceDate;
	ArrayList<Facet> facetList=new ArrayList<Facet>();
	private String []selected;
	private String  []relatedAsset;
	private List<Componentrelation> related_Assets;
	private Set<Relationtype> relationTypes;
	
	public ArrayList<Facet> getFacetList() {
		return facetList;
	}

	public void setFacetList(ArrayList<Facet> facetList) {
		this.facetList = facetList;
	}

	public String[] getSelected() {
		return selected;
	}

	public void setSelected(String[] selected) {
		this.selected = selected;
	}

	@Override
	public void reset(ActionMapping m, HttpServletRequest r){
		asset=new Asset();
		elements=new ArrayList<Element>();
		recommendation=new Recommendation();
		costeffect=new Costeffect();
		componentrelation=new Componentrelation();
		dateOfInformation="";
		versionDate="";
		acceptanceDate="";
	}
	
	public Recommendation getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(Recommendation recommendation) {
		this.recommendation = recommendation;
	}

	public Costeffect getCosteffect() {
		return costeffect;
	}

	public void setCosteffect(Costeffect costeffect) {
		this.costeffect = costeffect;
	}

	public Componentrelation getComponentrelation() {
		return componentrelation;
	}

	public void setComponentrelation(Componentrelation componentrelation) {
		this.componentrelation = componentrelation;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setElements(List<Element> list) {
		this.elements = list;
	}

	public List<Element> getElements() {
		return elements;
	}

	public List<Library> getLibrarys() {
		ArrayList<Islocatedin> tmp=new ArrayList<Islocatedin>(asset.getIslocatedins());
		List<Library> list=new ArrayList<Library>();
		for(Islocatedin i:tmp){
			list.add(i.getLibrary());
		}
		return list;
	}

	public void setAcceptanceDate(String acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public String getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setDateOfInformation(String dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getDateOfInformation() {
		return dateOfInformation;
	}

	public void setVersionDate(String versionDate) {
		this.versionDate = versionDate;
	}

	public String getVersionDate() {
		return versionDate;
	}

	public void setRelatedAsset(String  [] relatedAsset) {
		this.relatedAsset = relatedAsset;
	}

	public String  [] getRelatedAsset() {
		return relatedAsset;
	}

	public void setRelated_Assets(List<Componentrelation> related_Assets) {
		this.related_Assets = related_Assets;
	}

	public List<Componentrelation> getRelated_Assets() {
		return related_Assets;
	}

	public void setRelationTypes(Set<Relationtype> relationTypes) {
		this.relationTypes = relationTypes;
	}

	public Set<Relationtype> getRelationTypes() {
		return relationTypes;
	}
	
}
