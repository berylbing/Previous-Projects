package com.ht706.componentLibrary.componentSearch.actionForm;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;

public class CheckoutForm extends ActionForm {
	private Checkoutrecord checkout=new Checkoutrecord();
	private Asset asset=new Asset();
	private String dateOfInformation=new String();
	
	private List<Checkoutrecord> checkoutrecords=new ArrayList();
	
	public void setCheckout(Checkoutrecord checkout) {
		this.checkout = checkout;
	}
	public Checkoutrecord getCheckout() {
		return checkout;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setDateOfInformation(String dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}
	public String getDateOfInformation() {
		return dateOfInformation;
	}
	public void setCheckoutrecords(List<Checkoutrecord> checkoutrecords) {
		this.checkoutrecords = checkoutrecords;
	}
	public List<Checkoutrecord> getCheckoutrecords() {
		return checkoutrecords;
	}
	

}
