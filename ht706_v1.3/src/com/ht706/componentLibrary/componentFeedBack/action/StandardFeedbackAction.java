/**
 * @FileName	StandardFeedbackAction.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.action
 * @author ������
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.action;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.componentFeedBack.actionForm.StandardFeedbackForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bo.IItemFunctionService;
import com.ht706.componentLibrary.componentFeedBack.bo.IStandardFeedbackService;
import com.ht706.componentLibrary.util.Constant;

/**
 * StandardFeedback Actionʵ����
 */
public class StandardFeedbackAction extends DispatchAction {
	
	private IStandardFeedbackService standardFeedbackService;
	private	IItemFunctionService itemFunctionService;
	
	public IItemFunctionService getItemFunctionService() {
		return itemFunctionService;
	}

	public void setItemFunctionService(IItemFunctionService itemFunctionService) {
		this.itemFunctionService = itemFunctionService;
	}

	public IStandardFeedbackService getStandardFeedbackService() {
		return standardFeedbackService;
	}

	public void setStandardFeedbackService(
			IStandardFeedbackService standardFeedbackService) {
		this.standardFeedbackService = standardFeedbackService;
	}
	
	
	
	//�½�StandardFeedback���Action
	/**
	 * ����һ���µķ�����׼֮ǰ��Ԥ����
	 * �����ڵ�ǰ��Ч�ķ�����׼�����ȡ�ñ�׼���������µı�׼��
	 * ����ǰû��һ����Ч�ķ�����׼�����ȡ��
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preCreate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StandardFeedback currentSF = standardFeedbackService.getCurrentStandardFeedback();
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		if(currentSF !=null ) {
			sfForm.setAbout(currentSF.getAbout());
			sfForm.setVersion(currentSF.getVersion());
		} else {
			sfForm.setAbout("");
			sfForm.setVersion("");
		}
		return mapping.findForward("preCreateStandardFeedback");
	}
	
	/**
	 * ����һ���µķ�����׼�������ݿⱣ���¼
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward create(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		StandardFeedback sf = new StandardFeedback();
		
		//�Ի�����Ϣ�Ĵ�����������ʱ�䣬������״̬(�½���Ϊ�ݸ�)��
		//�����ݵİ汾(��ǰ��Ч�汾)���汾��Ϣ���汾������Ϣ
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		sf.setDateOfInformation(Date.valueOf(date));
		sf.setCreatorId((String)request.getSession().getAttribute("UserName"));
		sf.setStatus("2");
		sf.setVersion(sfForm.getVersion());
		sf.setAbout(sfForm.getAbout());
		StandardFeedback currentSF = standardFeedbackService.getCurrentStandardFeedback();
		if(currentSF != null) {
			sf.setAccordingToVersion(currentSF.getVersion());
			for (Object o : currentSF.getStandardfeedbackitems()) {
				StandardFeedbackItem sfItem = (StandardFeedbackItem) o;
				StandardFeedbackItem newItem = new StandardFeedbackItem();
				newItem.setDescription(sfItem.getDescription());
				newItem.setDetail(sfItem.getDetail());
				newItem.setItemFunction(sfItem.getItemFunction());
				newItem.setItemName(sfItem.getItemName());
				newItem.setScoreStandard(sfItem.getScoreStandard());
				newItem.setStandardfeedback(sf);
				sf.getStandardfeedbackitems().add(newItem);
			} 
		} else {
			sf.setAccordingToVersion("");
		}
		standardFeedbackService.create(sf);
		request.setAttribute("SfId", sf.getSfId());
		return mapping.findForward("createStandardFeedback");
	}
	
	//�޸�һ��������׼
	/**
	 * ���޸ķ�����׼֮ǰ��ȡҪ�޸ĵķ�����׼������
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preModify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfID = Integer.parseInt(request.getParameter("SfID"));
		StandardFeedback sf = standardFeedbackService.getStandardFeedbackById(SfID);
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		if(sf !=null ) {
			sfForm.setAbout(sf.getAbout());
			sfForm.setVersion(sf.getVersion());
			sfForm.setCreatorId(sf.getCreatorId());
		} else {
			sfForm.setAbout("");
			sfForm.setVersion("");
			sfForm.setCreatorId("");
		}	
		request.setAttribute("SfId", SfID);
		return mapping.findForward("preModifyStandardFeedback");
	}
	
	/**
	 * �޸ķ�����׼�����ݣ����浽���ݿ�
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward modify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		int SfId = Integer.parseInt(request.getParameter("SfId"));
		StandardFeedback sf = standardFeedbackService.getStandardFeedbackById(SfId);
		//�Ի�����Ϣ�Ĵ�����������ʱ�䣬������״̬���汾��Ϣ���汾������Ϣ
		//sf.setVersion(sfForm.getVersion());
		sf.setAbout(sfForm.getAbout());
		standardFeedbackService.modify(sf);
		request.setAttribute("SfId", SfId);
		return mapping.findForward("modifyStandardFeedback");
	}
	
	
	//�½����޸ı�׼�����ķ�����
	/**
	 * �г���ǰ������׼�ķ�������½����޸ķ������Ԥ����
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preManageStandardFeedbackItems(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Integer SfId = (Integer) request.getAttribute("SfId");
		StandardFeedback sf = standardFeedbackService.getStandardFeedbackById(SfId);
		request.setAttribute("standardFeedbackItems", sf.getStandardfeedbackitems());
		String totalScoreStandard = standardFeedbackService.getTotalScoreStandard(SfId);
		request.setAttribute("totalScoreStandard", totalScoreStandard);
		return mapping.findForward("preManageStandardFeedbackItems");
	}
	
	/**
	 * ���һ���µı�׼�������Ԥ������ȡ���������
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preAddStandardFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfId = Integer.parseInt(request.getParameter("SfId"));
		List<ItemFunction> itemFunctions = itemFunctionService.listAll();
		request.setAttribute("SfId", SfId);
		request.setAttribute("itemFunctionList", itemFunctions);
		return mapping.findForward("preAddStandardFeedbackItem");
	}
	
	/**
	 * �ڴ���������׼�Ĺ����д������������ڴ���������׼��ʱ��������ݿ�
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward addStandardFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfId = Integer.parseInt(request.getParameter("SfId"));
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		StandardFeedbackItem sfItem = sfForm.getStandardFeedbackItem();
		ItemFunction iF = itemFunctionService.getItemFunctionById(sfForm.getItemFunctionID());
		sfItem.setItemFunction(iF);
		if(sfItem.getScoreStandard().startsWith(".")) {
			sfItem.setScoreStandard("0" + sfItem.getScoreStandard());
		}
		standardFeedbackService.createStandardFeedBackItem(sfItem, SfId);
		request.setAttribute("SfId", SfId);
		return mapping.findForward("addStandardFeedbackItem");
	}

	/**
	 * �Է�����༭��Ԥ����
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preModifyStandardFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ItemFunction> itemFunctions = itemFunctionService.listAll();
		request.setAttribute("itemFunctionList", itemFunctions);
		int SfId = Integer.parseInt(request.getParameter("SfId"));
		request.setAttribute("SfId", SfId);
		int iId = Integer.parseInt(request.getParameter("itemId"));
		StandardFeedbackItem sfItem = standardFeedbackService.getStandardFeedbackItemById(iId);
		request.setAttribute("standardFeedbackItem", sfItem);
		return mapping.findForward("preModifyStandardFeedbackItem");
	}
	
	/**
	 * ������ı༭�޸�
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward modifyStandardFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		int iId = Integer.parseInt(request.getParameter("itemId"));
		StandardFeedbackItem sfItem = standardFeedbackService.getStandardFeedbackItemById(iId);
		StandardFeedbackItem sfItemForm = sfForm.getStandardFeedbackItem();
		sfItem.setItemName(sfItemForm.getItemName());
		sfItem.setScoreStandard(Double.toString(Double.parseDouble(sfItemForm.getScoreStandard())));
		sfItem.setDetail(sfItemForm.getDetail());
		sfItem.setDescription(sfItemForm.getDescription());
		ItemFunction iF = itemFunctionService.getItemFunctionById(sfForm.getItemFunctionID());
		sfItem.setItemFunction(iF);
		standardFeedbackService.modifyStandardFeedBackItem(sfItem);
		int SfId = Integer.parseInt(request.getParameter("SfId"));
		request.setAttribute("SfId", SfId);
		return mapping.findForward("modifyStandardFeedbackItem");
	}	
	
	/**
	 * �������ɾ��
	 * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward deleteStandardFeedbackItem(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfId = Integer.parseInt(request.getParameter("SfId"));
		int iId = Integer.parseInt(request.getParameter("itemId"));
		standardFeedbackService.deleteStandardFeedBackItemById(iId);
		request.setAttribute("SfId", SfId);
		return mapping.findForward("deleteStandardFeedbackItem");
	}
	

	//Other Action
	/**
	 * ɾ����׼����
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfID = Integer.parseInt(request.getParameter("SfID"));
		standardFeedbackService.delete(SfID);
		return mapping.findForward("deleteStandardFeedbackSuccess");
	}
	
	/**
	 * ��Чһ��������׼�ݸ�Ϊ��ǰ������׼
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward validate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfID = Integer.parseInt(request.getParameter("SfID"));
		standardFeedbackService.validate(SfID);
		return mapping.findForward("validate");
	}
	
	/**
	 * ��ʾһ��������׼����ϸ��Ϣ
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward listStandardFeedback(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int SfID = Integer.parseInt(request.getParameter("SfID"));
		StandardFeedback sf = standardFeedbackService.getStandardFeedbackById(SfID);
		StandardFeedbackForm sfForm = (StandardFeedbackForm) form;
		sfForm.setStandardFeedback(sf);
		if(sf !=null ) {
			List<StandardFeedbackItem> list = new ArrayList<StandardFeedbackItem>();
			for (Object o : sf.getStandardfeedbackitems()) {
				list.add((StandardFeedbackItem) o);
			}
			sfForm.setStandFeedbackItems(list);
		}
		String totalScoreStandard = standardFeedbackService.getTotalScoreStandard(SfID);
		request.setAttribute("totalScoreStandard", totalScoreStandard);
		return mapping.findForward("listStandardFeedback");
	}
	
	/**
	 * �г����еķ�����׼
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward listAllStandardFeedback(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int totalSize = standardFeedbackService.listAllStandardFeedback().size();
		int totalPage = (int)Math.ceil( totalSize /(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<StandardFeedback> standardFeedbackList = standardFeedbackService.findByNumber(start, offset);
		request.setAttribute("standardFeedbackList", standardFeedbackList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", totalSize);
		return mapping.findForward("listStandardFeedbackSuccess");
	}
	
	/**
	 * �г�һ�����ⷴ��������ϸ��Ϣ
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward checkVersion(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String version = request.getParameter("version");
		if(standardFeedbackService.findByVersion(version) == null)
		{
			request.setAttribute("value", "����ʹ��");
			return mapping.findForward("check_ok");
		}
		else{
			request.setAttribute("value", "�汾���Ѵ���");
			return mapping.findForward("check_error");
		}
	}
	
	/**
	 * ���������׼
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward checkOut(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return null;
	}

//	public ActionForward searchStandardFeedbackByCreateDate(ActionMapping mapping, ActionForm form,
//			HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		
//		return null;
//	}
}
