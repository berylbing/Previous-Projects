package com.ht706.componentLibrary.myFavorite.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.myFavorite.actionForm.MyFavoriteForm;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;

public class PageChangeAction extends DispatchAction {
	public ICheckItemService service;
	public ICheckItemService getService() {
		return service;
	}

	public void setService(ICheckItemService service) {
		this.service= service;
	}

	
	/**
	 * �Թ����б���л�ҳ����
     * @param form 		ComponentListForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��/myFavorite/checkItemC2.jsp
     * @exception       no
     */
	public ActionForward pageChange(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		ComponentListForm cf=(ComponentListForm)request.getSession().getAttribute("ComponentListForm");
		return mapping.findForward("list");
	}
	//���ļ�����ɾ��componentList����
	public ActionForward deleteSelectedComponent(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		ComponentListForm componentListForm = (ComponentListForm)form;
		service.delete(componentListForm.getSelectedComponent());
		return mapping.findForward("list");
	}
}
