package com.ht706.componentLibrary.myFavorite.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.actionForm.FeedbackForm;
import com.ht706.componentLibrary.componentSearch.actionForm.CheckoutForm;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;

public class CheckoutByMe extends DispatchAction{
	/**
	 * 显示我的出库记录单列表CheckoutByMe
     * @param form 		CheckoutForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向/myFavorite/myCheckout.jsp
     * @exception       no
     */
	public ActionForward CheckoutByMe (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String UserID = (String)request.getSession().getAttribute("UserName");
		CheckoutForm cf=new CheckoutForm();
		cf.setCheckoutrecords(service.searchCheckoutByMe(UserID));
		request.setAttribute("CheckoutForm", cf);		
		return mapping.findForward("checkoutlist");
	}
	
	private ICheckItemService service;

	public ICheckItemService getService() {
		return service;
	}
	public void setService(ICheckItemService service) {
		this.service = service;
	}

}