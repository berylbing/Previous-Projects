package com.ht706.componentLibrary.componentStaticsReport.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSearch.actionForm.CheckoutForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationmodifyService;
import com.ht706.componentLibrary.componentStaticsReport.CheckOutOrder;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Activitystatistic;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;
import com.ht706.componentLibrary.componentStaticsReport.bo.IReportService;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bo.IActorService;
import com.ht706.componentLibrary.systemManagement.bo.IDepartmentService;
import com.ht706.componentLibrary.systemManagement.bo.ILibraryService;


/**
 * 
 * @Document:
 * @author: hxy
 * @Time: 2010-09-21 
 * modified: wangpeng 2010-10-15
 */


public class ReportAction extends DispatchAction {
	private IReportService reportService;
	private ISpecificationmodifyService specificationmodifyService;
	private IDepartmentService departmentService;
	private IFacetService facetService;
	private ILibraryService libraryService;
	private IActorService actorService; 	
		
	
	public IActorService getActorService() {
		return actorService;
	}
	public void setActorService(IActorService actorService) {
		this.actorService = actorService;
	}
	public ILibraryService getLibraryService() {
		return libraryService;
	}
	public void setLibraryService(ILibraryService libraryService) {
		this.libraryService = libraryService;
	}
	public IFacetService getFacetService() {
		return facetService;
	}
	public void setFacetService(IFacetService facetService) {
		this.facetService = facetService;
	}
	public IReportService getReportService() {
		return reportService;
	}
	public void setReportService(IReportService reportService) {
		this.reportService = reportService;
	}
	public ISpecificationmodifyService getSpecificationmodifyService() {
		return specificationmodifyService;
	}
	public void setSpecificationmodifyService(
			ISpecificationmodifyService specificationmodifyService) {
		this.specificationmodifyService = specificationmodifyService;
	}
	public IDepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	/**
	 * 查看库总体信息 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listGeneralInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		//用户总人数统计
		List<Organization> organizationReportList= reportService.listAllUser();
		int userNumber = organizationReportList.size();
		
		//构件总个数
		List<Asset> assetReportList = reportService.listAllAsset();
		int assetNumber = assetReportList.size();
		
		//构件规约变更次数
		List<Specificationmodify> specificationmodifyList = specificationmodifyService.listApproval();
		int specificationmodifyNumber = specificationmodifyList.size();
		
		//出库总次数
		int checkoutTotal = this.reportService.listAllCheckoutRecord().size();
		
		//检索总次数
		int activitystaticTotal = this.reportService.listAllActivitystatistic().size();

		//问题报告总数
		String problemstatus = "1";
		List<ProblemReport> problemreportList = reportService.listProblem(problemstatus);
		int problemreportNumber = problemreportList.size();
		
		//反馈单总数
		int feedbackstatus = 1;
		List<Feedback> feedbackList = reportService.listFeedback(feedbackstatus);
		int feedbackNumber = feedbackList.size();
		
		//刻面总数
		String facetType = "刻面";
		List<Facet> facetList = reportService.listAllFacet(facetType);
		int facetNumber = facetList.size();
		
		//术语总数
		String wordType = "术语";
		List<Facet> wordList = reportService.listAllWord(wordType);
		int wordNumber = wordList.size();
		
		
		//已定义的关系总数
		List<Relationtype> relationList = reportService.listAllRelation();
		int relationNumber = relationList.size();
		
		request.setAttribute("userNumber", userNumber);		
		request.setAttribute("assetNumber", assetNumber);
		request.setAttribute("specificationmodifyNumber", specificationmodifyNumber);
		request.setAttribute("problemreportNumber", problemreportNumber);
		request.setAttribute("feedbackNumber", feedbackNumber);
		request.setAttribute("facetNumber", facetNumber);
		request.setAttribute("wordNumber", wordNumber);
		request.setAttribute("relationNumber", relationNumber);	
		request.setAttribute("checkoutNumber", checkoutTotal);
		request.setAttribute("activitystatisticNumber", activitystaticTotal);
		
		return mapping.findForward("organizationReportList");		
	}
	
	/**
	 * 列出用户信息 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Organization> userList = reportService.listAllUser();	
		List<Department> departmentList = departmentService.listAll();
		
		for( Organization user : userList){
			int deparmentId = user.getDepartmentId();			
			for (Department department : departmentList){
				if(deparmentId == department.getDepartmentId());
					user.setEmail( department.getName());
			}			
		}

		request.setAttribute("userList", userList);		
		return mapping.findForward("userReportList");		
	}
	
	/**
	 * 列出构件信息 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listAsset(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Asset> assetList = reportService.listAllAsset();	
		request.setAttribute("assetList", assetList);		
		return mapping.findForward("assetReportList");		
	}	
	
	/**
	 * 列出规约变更表 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listSpecificationModify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Specificationmodify> specificationmodifyList = specificationmodifyService.listApproval();
		request.setAttribute("specificationmodifyList", specificationmodifyList);		
		return mapping.findForward("specificationmodifyList");		
	}
	/**
	 * 列出问题报告总数
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listProblemReport(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		
		String problemstatus = "1";
		List<ProblemReport> problemreportList = reportService.listProblem(problemstatus);
		System.out.println(problemreportList+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
		request.setAttribute("problemreportList", problemreportList);		
		return mapping.findForward("problemreportList");		
	}
	/**
	 * 列出反馈总数
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listfeedback(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		
		int feedbackstatus = 1;
		List<Feedback> feedbackList = reportService.listFeedback(feedbackstatus);
		request.setAttribute("feedbackList", feedbackList);		
		return mapping.findForward("feedbackList");		
	}
	
	/**
	 * 列出刻面
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		
		String facetType = "刻面";
		List<Facet> facetList = reportService.listAllFacet(facetType);
		ArrayList<Facet> facetList2 = new ArrayList<Facet>(facetList);
		for(Facet item : facetList2)
		{
			String pid = item.getParentNode();
			FacetId facetid = new FacetId();
			facetid.setSpecification(item.getId().getSpecification());
			facetid.setFacetUuid(pid);
			item.setParentNode(facetService.getById(facetid).getName());
			
			String creator[] = item.getCreator().split("/");
			item.setCreator(creator[0]);
			
			facetid.setFacetUuid(item.getId().getFacetUuid());
			item.getId().setSpecification(facetService.getById(facetid).getId().getSpecification());
		}
		
		request.setAttribute("facetList", facetList2);		
		return mapping.findForward("facetList");		
	}
	
	/**
	 * 列出术语
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listWord(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		
		String wordType = "术语";
		List<Facet> wordList = reportService.listAllWord(wordType);
		ArrayList<Facet> wordList2 = new ArrayList<Facet>(wordList);
		for(Facet item : wordList2)
		{
			
			String pid = item.getParentNode();
			FacetId facetid = new FacetId();
			facetid.setSpecification(item.getId().getSpecification());
			facetid.setFacetUuid(pid);
			item.setParentNode(facetService.getById(facetid).getName());
			
			String creator[] = item.getCreator().split("/");
			item.setCreator(creator[0]);			
		
		}
		request.setAttribute("wordList", wordList2);		
		return mapping.findForward("wordList");		
	}
	
	/**
	 * 列出关系
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listRelation(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		
		List<Relationtype> relationList = reportService.listAllRelation();
		request.setAttribute("relationList", relationList);		
		return mapping.findForward("relationList");		
	}
		
	/**
	 * 列出可用RSC信息 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listRSC(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Asset> assetList = reportService.listAllAsset();
		List<Library> libraryList = libraryService.listAll();
		Library library = libraryList.get(0);
		int assetNumber = assetList.size();
		request.setAttribute("assetList", assetList);	
		request.setAttribute("library", library);
		request.setAttribute("assetNumber", assetNumber);
		return mapping.findForward("RSCList");		
		
	}
	
	/**
	 * 列出用户信息统计 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listUserStatics(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Organization> organizationReportList= reportService.listAllUser();
		int userNumber = organizationReportList.size();
		
		List<Department> departmentList = departmentService.listAll();
		int departmentNumber = departmentList.size();		
		
		List<Actor> actorList = actorService.listAll();
		int actorNumber = actorList.size();		
		
		request.setAttribute("userNumber", userNumber);
		request.setAttribute("departmentNumber", departmentNumber);
		request.setAttribute("actorNumber", actorNumber);
		return mapping.findForward("UserStatics");	

	}	
	
	/**
	 * 按部门统计人数 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listByDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Organization> organizationReportList= reportService.listAllUser();
		List<Department> departmentList = departmentService.listAll();
		int departmentNumber = departmentList.size();
		
		for( Department depart : departmentList){
			int departNum = 0;
			int departmentId = depart.getDepartmentId();
			for (Organization user : organizationReportList){
				if(user.getDepartmentId() == departmentId)
				departNum ++;				
			}
			String departNumber = Integer.toString(departNum);
			depart.setTele(departNumber);
		}		
		
		request.setAttribute("departmentList", departmentList);		
		return mapping.findForward("ByDepartment");	

	}	
	
	/**
	 * 按角色统计人数 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listByActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Actor> actorList = actorService.listAll();
		int actorNum = actorList.size();
		for(Actor actor : actorList){
			int actorNumber = actor.getUsertoactors().size();
			String actorNumber1 = Integer.toString(actorNumber);
			actor.setResponsibility(actorNumber1);
		}
		
		request.setAttribute("actorList", actorList);	
		
	

		return mapping.findForward("ByActor");	

	}	
	
	/**
	 * 列出所有用户信息 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listByUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Organization> userList = reportService.listAllUser();	
		List<Department> departmentList = departmentService.listAll();
		for( Organization user : userList){
			int deparmentId = user.getDepartmentId();			
			for (Department department : departmentList){
				if(deparmentId == department.getDepartmentId());
					user.setEmail( department.getName());
			}			
		}

		request.setAttribute("userList", userList);		
		return mapping.findForward("ByUser");		
	}
	/**
	 * 列出所有出库记录 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listCheckOut(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Checkoutrecord> checkoutList = reportService.listAllCheckoutRecord();
		CheckoutForm cf=new CheckoutForm();
		cf.setCheckoutrecords(checkoutList);
		request.setAttribute("CheckoutForm", cf);		
		return mapping.findForward("checkoutrecordList");		
	}
	
	/**
	 * 列出所有检索记录 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listActivityStatic(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Activitystatistic> activityList = reportService.listAllActivitystatistic();
		request.setAttribute("activityList", activityList);		
		return mapping.findForward("activitystaticList");		
	}
	/**
	 * 构件下载排名  
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listCheckoutByOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Checkoutrecord> checkoutList = reportService.listAllCheckoutRecord();
		Map<String,Integer> orderMap = new HashMap<String,Integer>();
		
		for(int i=0,size = checkoutList.size();i<size;i++)
		{
			String uniqueId = checkoutList.get(i).getUniqueId();
			Integer num = orderMap.get(uniqueId);
			orderMap.put(uniqueId, num == null?1:num+1);
		}
		
		List<Map.Entry<String, Integer>> checkouts = new ArrayList<Map.Entry<String, Integer>>(
				orderMap.entrySet());		
		
		Collections.sort(checkouts, new Comparator<Map.Entry<String, Integer>>() {   
	           public int compare(Map.Entry<String, Integer> o1,   
	              Map.Entry<String, Integer> o2) {   
	              return (o2.getValue() - o1.getValue());   
			   }   
		});
		
		List<CheckOutOrder> checkoutOrders = new ArrayList<CheckOutOrder>();		
		for(int i=0,orderSize = checkouts.size();i<orderSize;i++)
		{
			Map.Entry<String, Integer> item = checkouts.get(i);
			Asset asset = reportService.getAssetById(item.getKey());
			if(asset == null)
				continue;
			checkoutOrders.add(i, new CheckOutOrder(item.getKey(),asset.getName(),item.getValue()));
		}
		
		request.setAttribute("checkoutOrderList", checkoutOrders);		
		return mapping.findForward("checkorderList");		
	}
	
	/**
	 * 列出复用统计清单 
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /StaticsReport/libGeneralInfo.jsp
     * @exception       no
     */
	
	public ActionForward listFuYong(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {				
		
		List<Asset> assetList = reportService.listAllAsset();
		List<Checkoutrecord> Checkoutlist = reportService.listAllCheckoutRecord();	
		
	
		for(Checkoutrecord cr : Checkoutlist){
			
			String uniqueId = cr.getUniqueId();
			for (Asset asset : assetList){
				
				if(uniqueId.equals(asset.getUniqueId()) ){
					System.out.println("!!!!!!!!!!!!!!!!!!!!&&&&&&&&&&&&&&&&&&&&************");		
					cr.setEmail(asset.getName());
					//System.out.println(cr.getEmail()+"!!!!!!!!!!!!!!!!!!!!&&&&&&&&&&&&&&&&&&&&************");
				}
				
				
			}
		}
		
		
		request.setAttribute("Checkoutlist", Checkoutlist);	
		return mapping.findForward("fuYongList");		
	}

}
