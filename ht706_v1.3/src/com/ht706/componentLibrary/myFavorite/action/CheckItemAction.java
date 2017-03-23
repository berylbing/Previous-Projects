package com.ht706.componentLibrary.myFavorite.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;

public class CheckItemAction extends Action{
	
	/**
	 * ��ʾ�����б�CheckItemAction
     * @param form 		CheckItemForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��/myFavorite/checkItemC2.jsp
     * @exception       no
     */
	
	public ActionForward execute (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String id=(String)request.getParameter("ID");//��ȡ�ļ��������ID	
		
		//�ҳ�componentList����ʾ
		ComponentListForm cf=new ComponentListForm();
		cf.setComponentList(service.searchAssetByParentNode(id));
		cf.setPage(0);
//		cf.setNumPerPage(2);
		request.setAttribute("ComponentListForm", cf);
		request.getSession().setAttribute("ComponentListForm", cf);
		return mapping.findForward("list");
	}
	

	private ICheckItemService service;

	public ICheckItemService getService() {
		return service;
	}
	public void setService(ICheckItemService service) {
		this.service = service;
	}

}
