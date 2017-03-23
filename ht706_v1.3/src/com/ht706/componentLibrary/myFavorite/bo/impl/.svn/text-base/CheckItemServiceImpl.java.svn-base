package com.ht706.componentLibrary.myFavorite.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.jgroups.tests.adaptjms.Request;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.IFacetDAO;
import com.ht706.componentLibrary.myFavorite.actionForm.CheckItemForm;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;
import com.ht706.componentLibrary.myFavorite.dao.IMyfavoriteDAO;
import com.ht706.componentLibrary.componentFeedBack.dao.IFeedbackDAO;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemReportDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationmodifyDAO;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.componentStaticsReport.dao.ICheckoutrecordDAO;

public class CheckItemServiceImpl implements ICheckItemService{
	private IMyfavoriteDAO myFavoriteDAO;
	
	public IMyfavoriteDAO getMyFavoriteDAO() {
		return myFavoriteDAO;
	}

	public void setMyFavoriteDAO(IMyfavoriteDAO myFavoriteDAO) {
		this.myFavoriteDAO = myFavoriteDAO;
	}
	//	private TransactionTemplate transactionTemplate;
	private IFacetDAO facetDAO;
	private IClassificationindexDAO classificationindexDAO;
	private IAssetDAO assetDAO;
	private IFeedbackDAO feedbackDAO;
	private IProblemReportDAO problemreportDAO;
	private ISpecificationmodifyDAO specificationmodifyDAO;
	private ICheckoutrecordDAO checkoutrecordDAO;


//	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//		this.transactionTemplate = transactionTemplate;
//	}
//
//	public TransactionTemplate getTransactionTemplate() {
//		return transactionTemplate;
//	}


	public void setCheckoutrecordDAO(ICheckoutrecordDAO checkoutrecordDAO) {
		this.checkoutrecordDAO = checkoutrecordDAO;
	}

	public ICheckoutrecordDAO getCheckoutrecordDAO() {
		return checkoutrecordDAO;
	}



	public IProblemReportDAO getProblemreportDAO() {
		return problemreportDAO;
	}

	public ISpecificationmodifyDAO getSpecificationmodifyDAO() {
		return specificationmodifyDAO;
	}

	public void setSpecificationmodifyDAO(
			ISpecificationmodifyDAO specificationmodifyDAO) {
		this.specificationmodifyDAO = specificationmodifyDAO;
	}

	public void setProblemreportDAO(IProblemReportDAO problemreportDAO) {
		this.problemreportDAO = problemreportDAO;
	}

	public void setFeedbackDAO(IFeedbackDAO feedbackDAO){
		this.feedbackDAO = feedbackDAO;
		
	}
	public IFeedbackDAO getFeedbackDAO(){
		return feedbackDAO;
	}
	public void setFacetDAO(IFacetDAO facetDAO) {
		this.facetDAO = facetDAO;
	}

	public IFacetDAO getFacetDAO() {
		return facetDAO;
	}

	public void setClassificationindexDAO(IClassificationindexDAO classificationindexDAO) {
		this.classificationindexDAO = classificationindexDAO;
	}

	public IClassificationindexDAO getClassificationindexDAO() {
		return classificationindexDAO;
	}

	public void setAssetDAO(IAssetDAO assetDAO) {
		this.assetDAO = assetDAO;
	}

	public IAssetDAO getAssetDAO() {
		return assetDAO;
	}

	public List<Asset> searchComponentByFaect() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Asset> serchComponentByFilter(CheckItemForm f) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Facet> showFacetList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Asset searchComponentByAssetUniqueID(String assetUniqueID) {
		// TODO Auto-generated method stub
		return assetDAO.findById(assetUniqueID);
	}

	/**
	 * 按父结点查找AssetUniqueId对应 的构件
     * @param 		int parentNode
     * @return      List<Asset>
     * @exception 	no
     */
	@SuppressWarnings("unchecked")
	public List<Asset> searchAssetByParentNode(String parentNode) {
		List<Myfavorite> myFavoriteList = myFavoriteDAO.findByParentNode(parentNode);
		List<Asset> assetList = new ArrayList();
		for(int i=0;i<myFavoriteList.size();i++){
			if(myFavoriteList.get(i).getAssetUniqueId()==null || myFavoriteList.get(i).getAssetUniqueId().equals(""))break;
			assetList.add(searchComponentByAssetUniqueID(myFavoriteList.get(i).getAssetUniqueId()));
		}
		return assetList;
	}
    
	
	
	/**
	 * 删除文件夹中构件
     * @param 		String[] assetUniqueID
     * @return      void
     * @exception 	no
     */
	public void delete(final String[] assetUniqueID){
		Myfavorite myFavorite;
		for(int i =  0 ; i < assetUniqueID.length ; i ++){
			myFavorite=(Myfavorite)myFavoriteDAO.findByAssetUniqueId(assetUniqueID[i]).get(0);
			myFavoriteDAO.delete(myFavorite);
	}
	}
	
	/**
	 * 按父结点查找"我提交反馈单"对应 的反馈单
     * @param 		String parentNode
     * @return      List<FeedbackItem>
     * @exception 	no
     */
	@SuppressWarnings("unchecked")
	public List<Feedback> searchFeedbackByMe(String id) {
		// TODO Auto-generated method stub
			List<Myfavorite> myFavoriteList = myFavoriteDAO.findByParentNode("-2");
			List<Feedback> feedbackList = new ArrayList();
			for(int i=0;i<myFavoriteList.size();i++){
				if(myFavoriteList.get(i).getTypeIs().equals("Feedback")&&myFavoriteList.get(i).getUserId().equals(id)){
					Feedback ele=searchFeedbackByRecordID(myFavoriteList.get(i).getRecordId());
					if(ele!=null)
						feedbackList.add(ele);
				}
			}
			return feedbackList;
	}
	
	public Feedback searchFeedbackByRecordID(String RecordID){
		return feedbackDAO.findById(RecordID);
	}

	@SuppressWarnings("unchecked")
	public List<ProblemReport> listProblemReportByMe(String UserId) {
		// TODO Auto-generated method stub
		List<Myfavorite> myFavoriteList = myFavoriteDAO.findByParentNode("-2");
		List<ProblemReport> problemReportList = new ArrayList();
		for(int i=0;i<myFavoriteList.size();i++){
			if(myFavoriteList.get(i).getTypeIs().equals("ProblemReport")&&myFavoriteList.get(i).getUserId().equals(UserId)){
				ProblemReport ele=searchProblemReportByRecordID(myFavoriteList.get(i).getRecordId());
				if(ele!=null)
					problemReportList.add(ele);
			}
		}
		return problemReportList;
	}

	public ProblemReport searchProblemReportByRecordID(String RecordID) {
		// TODO Auto-generated method stub
		return problemreportDAO.findById(RecordID);
	}

	@SuppressWarnings("unchecked")
	public List<Specificationmodify> searchSpecificationmodifyByMe(String userID) {
		// TODO Auto-generated method stub
		List<Myfavorite> myFavoriteList = myFavoriteDAO.findByParentNode("-2");
		List<Specificationmodify> SpecificationmodifyList = new ArrayList();
		for(int i=0;i<myFavoriteList.size();i++){
			if(myFavoriteList.get(i).getTypeIs().equals("specificationmodify")&&myFavoriteList.get(i).getUserId().equals(userID)){
				Specificationmodify ele = searchSpecificationmodifyByRecordID(myFavoriteList.get(i).getRecordId());
				if(ele!=null)
					SpecificationmodifyList.add(ele);
			}
		}
		return SpecificationmodifyList;
	}

	public Specificationmodify searchSpecificationmodifyByRecordID(
			String RecordID) {
		// TODO Auto-generated method stub
		return specificationmodifyDAO.findById(RecordID);
	}

	
	@SuppressWarnings("unchecked")
	public List<Checkoutrecord> searchCheckoutByMe(String userID) {
		// TODO Auto-generated method stub
		List<Myfavorite> myFavoriteList = myFavoriteDAO.findByParentNode("-2");
		List<Checkoutrecord> CheckoutrecordList = new ArrayList();
		for(int i=0;i<myFavoriteList.size();i++){
			if(myFavoriteList.get(i).getTypeIs().equals("Checkout")&&myFavoriteList.get(i).getUserId().equals(userID)){
				Checkoutrecord ele=searchCheckoutByRecordID(myFavoriteList.get(i).getRecordId());
				if(ele!=null)
					CheckoutrecordList.add(ele);
			}
		}
		return CheckoutrecordList;
	}

	public Checkoutrecord searchCheckoutByRecordID(String recordId) {
		// TODO Auto-generated method stub
		return checkoutrecordDAO.findById(recordId);
	}

	
	
}



