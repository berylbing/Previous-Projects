package com.ht706.componentLibrary.systemManagement.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.ht706.componentLibrary.systemManagement.actionForm.LoginForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;

/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */


public class LoginAction extends Action {
	private IOrganizationDAO organizationDAO;
	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}
	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}
	


	/**
	 * 管理员身份登录action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward adminLogin(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		return mapping.findForward("admin");
	}
	/**
	 * 普通用户身份登录action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward userLogin(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		return mapping.findForward("user");
	}

}
