package com.ht706.componentLibrary.myFavorite.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.actionForm.FeedbackForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;

public class FeedbackByMe extends DispatchAction{
	/**
	 * 显示我的问题反馈单列表FeedbackByMeAction
     * @param form 		FeedbackFormForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向/myFavorite/FeedBackByMe.jsp
     * @exception       no
     */
	public ActionForward FeedbackByMeAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String UserID = (String)request.getSession().getAttribute("UserName");
		//找出FeedBackList并显示
		FeedbackForm cf=new FeedbackForm();
		cf.setFeedbacks(service.searchFeedbackByMe(UserID));
		request.setAttribute("FeedbackFormList", cf);
		return mapping.findForward("feedbacklist");
	}
	
	private ICheckItemService service;

	public ICheckItemService getService() {
		return service;
	}
	public void setService(ICheckItemService service) {
		this.service = service;
	}

}