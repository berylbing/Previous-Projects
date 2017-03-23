/**
 * @FileName	FeedbackForm.java
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
import org.apache.struts.upload.FormFile;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

public class FeedbackForm extends ActionForm {

	private String description=new String();
	private String background=new String();
	private String enviroment=new String();
	private String registryId=new String();

	private FormFile file;
	private String provider=new String();
	
	private List<FeedbackItem> feedbackItems = new ArrayList<FeedbackItem>();
	private FeedbackItem feedbackItem = new FeedbackItem();
	private Integer itemFunctionID;
	private Feedback feedback=new Feedback();
	private StandardFeedback currentSF=new StandardFeedback();
	
	private Asset asset=new Asset();
	private Integer feedbackTimes;
	private String averageScore;
	
	private List<Feedback> feedbacks = new ArrayList<Feedback>();
	
	
	public Integer getFeedbackTimes() {
		return feedbackTimes;
	}
	public void setFeedbackTimes(Integer feedbackTimes) {
		this.feedbackTimes = feedbackTimes;
	}

	public String getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(String averageScore) {
		this.averageScore = averageScore;
	}
	public Feedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	public String getRegistryId() {
		return registryId;
	}
	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}
	public FeedbackItem getFeedbackItem() {
		return feedbackItem;
	}
	public void setFeedbackItem(FeedbackItem feedbackItem) {
		this.feedbackItem = feedbackItem;
	}
	public Integer getItemFunctionID() {
		return itemFunctionID;
	}
	public void setItemFunctionID(Integer itemFunctionID) {
		this.itemFunctionID = itemFunctionID;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public StandardFeedback getCurrentSF() {
		return currentSF;
	}
	public void setCurrentSF(StandardFeedback currentSF) {
		this.currentSF = currentSF;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}	

	public FormFile getFile() {
		return file;
	}
	public void setFile(FormFile file) {
		this.file = file;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	public String getEnviroment() {
		return enviroment;
	}
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	
	public void setFeedbackItems(List<FeedbackItem> feedbackItems) {
		this.feedbackItems = feedbackItems;
	}
	public List<FeedbackItem> getFeedbackItems() {
		return feedbackItems;
	}
	
	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}
	
	
	
}
