package com.ht706.componentLibrary.componentStaticsReport.bo.impl;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentFeedBack.dao.IFeedbackDAO;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemReportDAO;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.dao.IFacetDAO;
import com.ht706.componentLibrary.componentSpecification.dao.IRelationtypeDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationDAO;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Activitystatistic;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.componentStaticsReport.bo.IReportService;
import com.ht706.componentLibrary.componentStaticsReport.dao.IActivitystaticDAO;
import com.ht706.componentLibrary.componentStaticsReport.dao.ICheckoutrecordDAO;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;


/**
 * 
 * @Document:
 * @author: hxy
 * @Time: 2010-09-21 
 *
 */
public class ReportServiceImpl implements IReportService {	
	private IOrganizationDAO organizationDAO;
	private IAssetDAO assetDAO;
	private IProblemReportDAO problemReportDAO;
	private IFeedbackDAO feedbackDAO;
	private IFacetDAO facetDAO;
	private IRelationtypeDAO relationtypeDAO;
	private ICheckoutrecordDAO checkoutDAO;
	private IActivitystaticDAO activitystaticDAO;
	
	
	public ICheckoutrecordDAO getCheckoutDAO() {
		return checkoutDAO;
	}
	public void setCheckoutDAO(ICheckoutrecordDAO checkoutDAO) {
		this.checkoutDAO = checkoutDAO;
	}
	public IActivitystaticDAO getActivitystaticDAO() {
		return activitystaticDAO;
	}
	public void setActivitystaticDAO(IActivitystaticDAO activitystaticDAO) {
		this.activitystaticDAO = activitystaticDAO;
	}
	public IAssetDAO getAssetDAO() {
		return assetDAO;
	}
	public void setAssetDAO(IAssetDAO assetDAO) {
		this.assetDAO = assetDAO;
	}
	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}
	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}	
	public IProblemReportDAO getProblemReportDAO() {
		return problemReportDAO;
	}
	public void setProblemReportDAO(IProblemReportDAO problemReportDAO) {
		this.problemReportDAO = problemReportDAO;
	}
	public IFeedbackDAO getFeedbackDAO() {
		return feedbackDAO;
	}
	public void setFeedbackDAO(IFeedbackDAO feedbackDAO) {
		this.feedbackDAO = feedbackDAO;
	}
	public IFacetDAO getFacetDAO() {
		return facetDAO;
	}
	public void setFacetDAO(IFacetDAO facetDAO) {
		this.facetDAO = facetDAO;
	}
	
	
	public IRelationtypeDAO getRelationtypeDAO() {
		return relationtypeDAO;
	}
	public void setRelationtypeDAO(IRelationtypeDAO relationtypeDAO) {
		this.relationtypeDAO = relationtypeDAO;
	}
	public List<Organization> listAllUser(){		
		return organizationDAO.findAll();
	}
	
	public List<Asset> listAllAsset(){
		return assetDAO.findAll();
	}
	
	public List<ProblemReport> listProblem(String problemstatus){
		return problemReportDAO.findByStatus(problemstatus);
	}

	public List<Feedback> listFeedback(int feedbackstatus){
		return feedbackDAO.findByStatus(feedbackstatus);		
	}
	
	public List<Facet> listAllFacet(String facetType){
		return facetDAO.findByNodeType(facetType);
	}
	
	public List<Facet> listAllWord(String wordType){
		return facetDAO.findByNodeType(wordType);
	}
	public List<Relationtype> listAllRelation(){
		return relationtypeDAO.findAll();
	}
	
	public List<Checkoutrecord> listAllCheckoutRecord() {		
		return this.checkoutDAO.findAll();
	}
	
	public List<Activitystatistic> listAllActivitystatistic() {
		return this.activitystaticDAO.findAll();
	}
	public Asset getAssetById(String id) {		
		return this.assetDAO.findById(id);
	}
	
	
}
