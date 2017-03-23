/**
 * @FileName	FeedbackAction.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.action
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.action;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessEngine;


import com.ht706.componentLibrary.componentFeedBack.actionForm.FeedbackForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bo.IFeedbackService;
import com.ht706.componentLibrary.componentFeedBack.bo.IItemFunctionService;
import com.ht706.componentLibrary.componentFeedBack.bo.IStandardFeedbackService;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bo.IComponentService;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.util.Constant;
import com.ht706.componentLibrary.util.UUIDKey;


/**
 * Feedback Action实现类
 */
public class FeedbackAction extends DispatchAction {
	
	private IFeedbackService feedbackService;
	private IStandardFeedbackService standardFeedbackService;
	private IItemFunctionService itemFunctionService;
	private IComponentService componentService;
	private IMyfavoriteService myfavoriteService;
	private ProcessEngine processEngine;
	
	public IMyfavoriteService getMyfavoriteService() {
		return myfavoriteService;
	}

	public void setMyfavoriteService(IMyfavoriteService myfavoriteService) {
		this.myfavoriteService = myfavoriteService;
	}

	public IComponentService getComponentService() {
		return componentService;
	}

	public void setComponentService(IComponentService componentService) {
		this.componentService = componentService;
	}

	public IStandardFeedbackService getStandardFeedbackService() {
		return standardFeedbackService;
	}

	public void setStandardFeedbackService(
			IStandardFeedbackService standardFeedbackService) {
		this.standardFeedbackService = standardFeedbackService;
	}

	public IFeedbackService getFeedbackService() {
		return feedbackService;
	}

	public void setFeedbackService(IFeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	public IItemFunctionService getItemFunctionService() {
		return itemFunctionService;
	}

	public void setItemFunctionService(IItemFunctionService itemFunctionService) {
		this.itemFunctionService = itemFunctionService;
	}

	
	public ProcessEngine getProcessEngine() {
		return processEngine;
	}

	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}

	/*	Create Feedback Action	*/
	/**
	 * 创建反馈记录之前，从当前反馈标准中读取反馈项内容
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preCreate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String AssetUUID = request.getParameter("AssetUUID");
		if(AssetUUID!=null) {
			request.setAttribute("AssetUUID", AssetUUID);
		}
		
		FeedbackForm f=new FeedbackForm();
		request.setAttribute("FeedbackForm", f);
		return mapping.findForward("preCreate");
	}
	
	
	/**
	 * 创建一个反馈记录
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward create(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FeedbackForm fbForm = (FeedbackForm) form;
		StandardFeedback sf = standardFeedbackService.getCurrentStandardFeedback();
		Feedback fb = new Feedback();
		/*	文件上传	*/
		String filePath = Constant.Element_Upload_Feedback_Root;
		FormFile file = fbForm.getFile();//取得上传的文件
		try {
			UUIDKey key=UUIDKey.getInstance();
			InputStream stream = file.getInputStream();//把文件读入
			filePath +=key.getNewUUID()+ file.getFileName();//上传到指定的upload包中
			OutputStream bos = new FileOutputStream(filePath);//建立一个上传文件的输出流
			int bytesRead = 0;
			byte[] buffer = new byte[Constant.File_Buffer_size];
			while ( (bytesRead = stream.read(buffer,0,Constant.File_Buffer_size)) != -1) {
				bos.write(buffer, 0, bytesRead);//将文件写入服务器
			}
			bos.close();
			stream.close();
		}catch(Exception ex){
			ex.printStackTrace();
			mapping.findForward("File_UpLoad_Error");
		}
		
		
		
		UUIDKey key = UUIDKey.getInstance();
		fb.setRecordId(key.getNewUUID());
		String assetUUID = request.getParameter("AssetUUID");
		Asset as = componentService.ViewComponentService(assetUUID);
		fb.setAsset(as);
		fb.setProvider((String)request.getSession().getAttribute("UserRealName"));
		fb.setRegistryId(fbForm.getRegistryId());
		Date date = new Date();   
        java.sql.Date intime = new java.sql.Date(date.getTime());       
		fb.setBackground(fbForm.getBackground());
		fb.setDateOfInformation(intime);
		fb.setDescription(fbForm.getDescription());
		fb.setEnviroment(fbForm.getEnviroment());
		//fb.setFile(fbForm.getFile());
		fb.setSfId(sf.getSfId());
		fb.setStatus(0);
		
		Set<StandardFeedbackItem> sfItems = (Set<StandardFeedbackItem>) sf.getStandardfeedbackitems();
		Set<FeedbackItem> fbItems = new HashSet<FeedbackItem>(0);
		for(StandardFeedbackItem item : sfItems){
			FeedbackItem tempItem= new FeedbackItem();
			tempItem.setDescription(item.getDescription());
			tempItem.setItemName(item.getItemName());
			tempItem.setDetail(item.getDetail());
			tempItem.setItemFunction(item.getItemFunction());
			tempItem.setScoreStandard(item.getScoreStandard());
			tempItem.setFeedback(fb);
			String scoreStandard = item.getScoreStandard();
			Double score = Double.parseDouble(scoreStandard);
			score = score * 0.8;
			tempItem.setScore(score.toString());
			fbItems.add(tempItem);
		}
		fb.setFeedbackitems(fbItems);
		feedbackService.create(fb);
		request.setAttribute("recordId", fb.getRecordId());
		/*	此处还要对myFavoriate表插入此记录		*/
		Myfavorite my = new Myfavorite();
		my.setRecordId(fb.getRecordId());
		my.setAssetUniqueId(as.getUniqueId());
		my.setAssetName(as.getName());
		my.setDateOfInformation(intime);
		my.setParentNode("-2");
		my.setTypeIs("Feedback");
		my.setUrl("localhost");
		my.setUserId((String)request.getSession().getAttribute("UserName"));
		myfavoriteService.create(my);
		
		//判断是新建构件时的反馈还是一般的反馈
		if (request.getParameter("createAsset").equals("true")) {
			request.setAttribute("isCreateAsset", "true");
		} else {
			request.setAttribute("isCreateAsset", "false");
		}
		
		//jbpm
		ExecutionService executionService = processEngine.getExecutionService();
		Map<String , Object > map= new HashMap<String,Object>();
		String username = (String) request.getSession().getAttribute("UserName");
		map.put("owner",  username );
		map.put("id", fb.getRecordId());
		
		map.put("actionName", "componentFeedBack/feedback.do?method=listFeedback&recordId=");
		map.put("table", "feedback");
		
		map.put("property", "status");
		map.put("UUID", "recordId");
		
		map.put("质量评价草稿","0");
		map.put("审核","1");
		map.put("已批准","2");
		map.put("description", "质量评价及反馈工作流");
		
		executionService.startProcessInstanceByKey("StandardFeedback", map, fb.getRecordId());
		
		return mapping.findForward("createSuccess");
	}
	
	/*	Modify Feedback Action	*/
	/**
	 * 在修改反馈单之前读取要修改的反馈单的内容
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preModify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String recordId = request.getParameter("recordId");
		if(recordId == null || recordId.equals("")) {
			recordId = (String) request.getAttribute("recordId");
		}
		Feedback fb = feedbackService.getFeedbackById(recordId);
		FeedbackForm fbForm = (FeedbackForm) form;
		if(fb !=null ) {
			fbForm.setBackground(fb.getBackground());
			fbForm.setDescription(fb.getDescription());
			fbForm.setEnviroment(fb.getEnviroment());
			//fbForm.setFile(fb.getFile());
			fbForm.setRegistryId(fb.getRegistryId());
		}
		request.setAttribute("recordId", recordId);
		return mapping.findForward("preModifyFeedback");
	}
	
	/**
	 * 修改反馈单的内容，保存到数据库
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FeedbackForm fbForm = (FeedbackForm) form;
		String recordId = request.getParameter("recordId");
		Feedback fb = feedbackService.getFeedbackById(recordId);
		//对基本信息的处理
		fb.setRegistryId(fbForm.getRegistryId());       
		fb.setBackground(fbForm.getBackground());
		fb.setDescription(fbForm.getDescription());
		fb.setEnviroment(fbForm.getEnviroment());
		//fb.setFile(fbForm.getFile());
		fb.setStatus(0);
		
		feedbackService.modify(fb);
		request.setAttribute("recordId", recordId);
		return mapping.findForward("modifyFeedback");
	}
	
	/*	Operation on FeedbackItem Action	*/
	public ActionForward preManageFeedbackItems(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String recordId = (String) request.getAttribute("recordId");
		Feedback fb = feedbackService.getFeedbackById(recordId);
		request.setAttribute("feedbackItems", fb.getFeedbackitems());
		String totalScoreStandard = feedbackService.getTotalScoreStandard(recordId);
		String totalScore = feedbackService.getTotalScore(recordId);
		request.setAttribute("totalScoreStandard", totalScoreStandard);
		request.setAttribute("totalScore", totalScore);
		return mapping.findForward("preManageFeedbackItems");
	}
	
	/**
	 * 添加一个新的反馈项的预处理，读取反馈项分类
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preAddFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String recordId = request.getParameter("recordId");
		request.setAttribute("recordId", recordId);
		List<ItemFunction> itemFunctions = itemFunctionService.listAll();
		request.setAttribute("itemFunctionList", itemFunctions);
		return mapping.findForward("preAddFeedbackItem");
	}
	
	/**
	 * 在创建反馈记录的过程中创建反馈项，该项将在创建反馈标准的时候存入数据库
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward addFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String recordId = request.getParameter("recordId");
		FeedbackForm fbForm = (FeedbackForm) form;
		FeedbackItem fbItem = fbForm.getFeedbackItem();
		if(fbItem.getItemName() != null && !fbItem.getItemName().equals("")){
			ItemFunction iF = itemFunctionService.getItemFunctionById(fbForm.getItemFunctionID());
			fbItem.setItemFunction(iF);
		}
		//如果没有填写得分，则默认为标准分的0.8倍(有bug，不行就放在页面处理)
		if(fbItem.getScore() == null || fbItem.getScore().equals("")) {
			String scoreStandard = fbItem.getScoreStandard();
			Double score = Double.parseDouble(scoreStandard);
			score = score * 0.8;
			fbItem.setScore(score.toString());
		}
		//奇怪的问题...一存到数据库就出错...
		if(fbItem.getScore().startsWith(".")) {
			fbItem.setScore("0" + fbItem.getScore());
		}
		System.out.println("----------------"+fbItem.getScore());
		if(fbItem.getScoreStandard().startsWith(".")) {
			fbItem.setScoreStandard("0" + fbItem.getScoreStandard());
		}
		feedbackService.createFeedbackItem(fbItem, recordId);
		request.setAttribute("recordId", recordId);
		return mapping.findForward("addFeedbackItem");
	}

	/**
	 * 在创建反馈记录的过程中对反馈项编辑的预处理
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preModifyFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ItemFunction> itemFunctions = itemFunctionService.listAll();
		request.setAttribute("itemFunctionList", itemFunctions);
		String recordId = request.getParameter("recordId");
		request.setAttribute("recordId", recordId);
		int iId = Integer.parseInt(request.getParameter("itemId"));
		FeedbackItem fbItem = feedbackService.getFeedbackItemById(iId);
		request.setAttribute("feedbackItem", fbItem);
		return mapping.findForward("preModifyFeedbackItem");
	}
	
	/**
	 * 在创建反馈记录的过程中反馈项的编辑修改
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		FeedbackForm fbForm = (FeedbackForm) form;
		int iId = Integer.parseInt(request.getParameter("itemId"));
		FeedbackItem fbItem = feedbackService.getFeedbackItemById(iId);
		FeedbackItem fbItemForm = fbForm.getFeedbackItem();
		fbItem.setDescription(fbItemForm.getDescription());
		fbItem.setDetail(fbItemForm.getDetail());
		ItemFunction iF = itemFunctionService.getItemFunctionById(fbForm.getItemFunctionID());
		fbItem.setItemFunction(iF);
		fbItem.setItemName(fbItemForm.getItemName());
		fbItem.setScoreStandard(fbItemForm.getScoreStandard());
		fbItem.setScore(fbItemForm.getScore());
		if(fbItem.getScore() == null || fbItem.getScore().equals("")) {
			String scoreStandard = fbItem.getScoreStandard();
			Double score = Double.parseDouble(scoreStandard);
			score = score * 0.8;
			fbItem.setScore(score.toString());
		}
		fbItem.setScoreStandard(Double.toString(Double.parseDouble(fbItem.getScoreStandard())));
		fbItem.setScore(Double.toString(Double.parseDouble(fbItem.getScore())));
		feedbackService.modifyFeedbackItem(fbItem);
		String recordId = request.getParameter("recordId");
		request.setAttribute("recordId", recordId);
		return mapping.findForward("modifyFeedbackItem");
	}	
	
	/**
	 * 在创建反馈记录的过程中删除反馈项
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward deleteFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String recordId = request.getParameter("recordId");
		int iId = Integer.parseInt(request.getParameter("itemId"));
		feedbackService.deleteFeedbackItemById(iId);
		request.setAttribute("recordId", recordId);
		return mapping.findForward("deleteFeedbackItem");
	}
	
	
	/*	Other Action */
//	/**
//	 * 列出所有的反馈记录
//     * @param form 		ActionForm
//     * @param mapping   ActionMapping 
//     * @param response  HttpServletResponse
//     * @param request   HttpServletRequest
//     * @return          跳转去向
//     * @exception       no
//     */
//	public ActionForward listAllFeedback(ActionMapping mapping, ActionForm form,
//			HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		List<Feedback> feedbackList = feedbackService.listAllFeedback();
//		if(feedbackList!=null) {	
//			request.setAttribute("feedbackList", feedbackList);
//		}	
//		return mapping.findForward("listAllFeedback");
//		
//	}
	
	/**
	 * 列出有效的反馈记录
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listAllFeedback(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int totalSize = feedbackService.listValidFeedback().size();
		int totalPage = (int)Math.ceil( totalSize /(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		
		List<Feedback> feedbackList = feedbackService.findByNumber(start, offset);
		request.setAttribute("feedbackList", feedbackList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", totalSize);
		return mapping.findForward("listAllFeedback");
		
	}
	
	/**
	 * 列出一个反馈记录
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listFeedback(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String recordId = request.getParameter("recordId");
		Feedback feedback = feedbackService.getFeedbackById(recordId);
		FeedbackForm fbForm = (FeedbackForm) form;
		fbForm.setFeedback(feedback);
		if(feedback !=null ) {
			List<FeedbackItem> list = new ArrayList<FeedbackItem>();
			for (Object o : feedback.getFeedbackitems()) {
				list.add((FeedbackItem) o);
			}
			fbForm.setFeedbackItems(list);
		}
		String totalScoreStandard = feedbackService.getTotalScoreStandard(recordId);
		String totalScore = feedbackService.getTotalScore(recordId);
		request.setAttribute("totalScoreStandard", totalScoreStandard);
		request.setAttribute("totalScore", totalScore);
		return mapping.findForward("listFeedback");
	}
	
	/**
	 * 删除反馈单
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String recordId = request.getParameter("recordId");
		feedbackService.delete(recordId);
		//删除我的收藏
		myfavoriteService.delete(recordId);
		//删除相应的工作流
		ExecutionService executionService = processEngine.getExecutionService();
		executionService.deleteProcessInstanceCascade("StandardFeedback." + recordId);
		return mapping.findForward("deleteFeedbackSuccess");
	}
	
	/**
	 * 导出反馈单
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward checkOut(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return null;
	}
	
	/**
	 * 构件反馈统计
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward feedbackStatics(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int totalSize = componentService.findValidAsset().size();
		int totalPage = (int)Math.ceil( totalSize /(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		
		List<Asset> assetList = componentService.findValidAssetByNumber(start, offset);
		List<FeedbackForm> feedbackStaticsList = new ArrayList();
		System.out.println("--------------"+assetList);
		for (Asset asset : assetList) {
			FeedbackForm fbForm = new FeedbackForm();
			fbForm.setAsset(asset);
			Set<Feedback> fbSet = asset.getFeedbacks();
			Integer times = 0;
			double averageScore = 0.0;
			for (Feedback fb : fbSet) {
				if(fb.getStatus() == 2) {
					for (FeedbackItem i : fb.getFeedbackitems()) {
						averageScore += Double.parseDouble(i.getScore());
					}
					times += 1;
				}
			}
			fbForm.setFeedbackTimes(times);
			if(times == 0) {
				averageScore = 0;
			}
			else {
				averageScore = averageScore / times;
			}
			DecimalFormat df=new DecimalFormat("0.0");
			System.out.println(df.format(averageScore));
			fbForm.setAverageScore(df.format(averageScore));
			feedbackStaticsList.add(fbForm);
		}
		request.setAttribute("feedbackStaticsList", feedbackStaticsList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", totalSize);
		return mapping.findForward("feedbackStatics");
	}
	
	/**
	 * 动态检查登记号是否重复
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward checkRegistryId(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String registryId = request.getParameter("registryId");
		String recordId = request.getParameter("recordId");
		Feedback fb = feedbackService.findByRegistryId(registryId);
		if (fb == null) {
			request.setAttribute("value", "可以使用");
			return mapping.findForward("check_ok");
		} else if ( fb != null && fb.getRecordId().equals(recordId)) {
			request.setAttribute("value", "可以使用");
			return mapping.findForward("check_ok");
		} else {
			request.setAttribute("value", "登记号已存在");
			return mapping.findForward("check_error");
		}
	}
}
