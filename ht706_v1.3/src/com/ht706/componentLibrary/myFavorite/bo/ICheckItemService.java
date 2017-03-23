package com.ht706.componentLibrary.myFavorite.bo;

import java.util.ArrayList;
import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;


public interface ICheckItemService {
	public ArrayList<Facet> showFacetList();
	
	public Asset searchComponentByAssetUniqueID(String assetUniqueID);
	public List<Asset> searchAssetByParentNode(String parentNode);
	
	public  void delete(final String[] assetUniqueID);
	
	public List<Feedback> searchFeedbackByMe(String id);
	public Feedback searchFeedbackByRecordID(String RecordID);
	
	public List<ProblemReport> listProblemReportByMe(String UserId);
	public ProblemReport searchProblemReportByRecordID(String RecordID);

	public List<Specificationmodify> searchSpecificationmodifyByMe(String userID);
	public Specificationmodify searchSpecificationmodifyByRecordID(String RecordID);

	public List<Checkoutrecord> searchCheckoutByMe(String userID);
	public Checkoutrecord searchCheckoutByRecordID(String recordId);
}
