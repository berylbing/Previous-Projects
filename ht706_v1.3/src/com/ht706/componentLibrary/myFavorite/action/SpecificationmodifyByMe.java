package com.ht706.componentLibrary.myFavorite.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.actionForm.FeedbackForm;
import com.ht706.componentLibrary.componentSpecification.actionForm.SpecificationmodifyForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;

public class SpecificationmodifyByMe extends DispatchAction{
	/**
	 * ��ʾ�ҵ����뵥�б�SpecificationmodifyByMe
     * @param form 		SpecificationmodifyForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��/myFavorite/FeedBackByMe.jsp
     * @exception       no
     */
	public ActionForward SpecificationmodifyByMe(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String UserID = (String)request.getSession().getAttribute("UserName");
		//�ҳ�FeedBackList����ʾ
		SpecificationmodifyForm sf=new SpecificationmodifyForm();
		sf.setModify(service.searchSpecificationmodifyByMe(UserID));
		request.setAttribute("SpecificationmodifyForm", sf);
		request.getSession().setAttribute("SpecificationmodifyForm", sf);
		return mapping.findForward("Specificationmodify");
	}
	
	private ICheckItemService service;

	public ICheckItemService getService() {
		return service;
	}
	public void setService(ICheckItemService service) {
		this.service = service;
	}

}