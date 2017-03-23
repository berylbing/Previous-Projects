package com.ht706.componentLibrary.systemManagement.action;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.systemManagement.actionForm.AuthorizationForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bo.IAuthorizationService;


/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */



public class AuthorizationAction extends DispatchAction {
	private IAuthorizationService authorizationService;
	public void setAuthorizationService(IAuthorizationService authorizationService) {
		this.authorizationService = authorizationService;
	}
	public IAuthorizationService getAuthorizationService() {
		return authorizationService;
	}
	/**
	 * 查看权限action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listAuthorization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String module = request.getParameter("ModuleId");
		if(module != null && module.equals("-1"))
			module = null;
		List<Authorization> authorizationList=authorizationService.listByModuleId(module);		
		request.getSession().setAttribute("authorizationList", authorizationList);
		request.setAttribute("moduleId", module == null?"-1":module);		
		return mapping.findForward("authorizationList");		
		// TODO Auto-generated method stub		
	}
	/**
	 * 初始化修改权限原始信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preAuthorizationForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id = Integer.parseInt(request.getParameter("Id"));
		Authorization authorization=authorizationService.getById(id);
		request.setAttribute("af", authorization);
		return mapping.findForward("modifyAuthorization");
		// TODO Auto-generated method stub
	}
	/**
	 * 修改权限信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyAuthorization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AuthorizationForm af = (AuthorizationForm)form;
		authorizationService.modify(af.getAuthorization());
		return this.listAuthorization(mapping, form, request, response);
		// TODO Auto-generated method stub
	}
	/**
	 * 创建新权限action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward createAuthorization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AuthorizationForm af = (AuthorizationForm) form;
		authorizationService.create(af.getAuthorization());
		return listAuthorization(mapping,form,request,response);
	}
	/**
	 * 删除权限action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward deleteAuthorization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AuthorizationForm af=(AuthorizationForm)form;
		authorizationService.delete(af.getSelectedAuthorization());
		return this.listAuthorization(mapping, form, request, response);
	}
	public ActionForward checkName(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name = new String(request.getParameter("Name").getBytes("iso-8859-1"),"gb2312");		
		List actors = authorizationService.listByName(name);
		if(actors != null && actors.size()!= 0)
			response.getWriter().write("error");
		else
			response.getWriter().write("ok");		
		return null;
	}

}
