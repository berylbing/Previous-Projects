package com.ht706.componentLibrary.componentStaticsReport.bo;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Activitystatistic;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;

/**
 * IReportService½Ó¿Ú
 * 
 * @author: hxy
 * @Time: 2010-09-21 
 */
public interface IReportService {
	
	public List<Organization> listAllUser(); 
	public List<Asset> listAllAsset(); 
	public List<ProblemReport> listProblem(String problemstatus);
	public List<Feedback> listFeedback(int feedbackstatus);
	public List<Facet> listAllFacet(String facetType);
	public List<Facet> listAllWord(String wordType);
	public List<Relationtype> listAllRelation();
	
	public List<Checkoutrecord> listAllCheckoutRecord();
	public List<Activitystatistic> listAllActivitystatistic();
	public Asset getAssetById(String id);
}
