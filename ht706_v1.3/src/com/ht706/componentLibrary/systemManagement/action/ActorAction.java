package com.ht706.componentLibrary.systemManagement.action;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.systemManagement.actionForm.ActorForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bo.IActorService;


/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */


public class ActorAction extends DispatchAction {
	private IActorService actorService;
	public void setActorService(IActorService actorService) {
		this.actorService = actorService;
	}
	public IActorService getActorService() {
		return actorService;
	}
	

	/**
	 * 查看角色列表action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Actor> actorList=actorService.listAll();
		request.setAttribute("actorList", actorList);
		return mapping.findForward("actorList");		
		// TODO Auto-generated method stub		
	}
	/**
	 * 创建新角色action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward createActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActorForm af=(ActorForm) form;
		actorService.create(af.getActor());
		return listActor(mapping, form, request, response);		
		// TODO Auto-generated method stub		
	}
	
	/**
	 * 初始化修改角色原信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preActorForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id = Integer.parseInt(request.getParameter("Id"));
		Actor actor=actorService.getById(id);
		request.setAttribute("af", actor);
		return mapping.findForward("modifyActor");
		// TODO Auto-generated method stub
		
	}

	/**
	 * 修改角色action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActorForm af=(ActorForm)form;
		actorService.modify(af.getActor());
		return this.listActor(mapping, form, request, response);
		// TODO Auto-generated method stub
		
	}
	/**
	 * 删除角色action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward deleteActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		int[] a = {Integer.parseInt(request.getParameter("Id"))};
		actorService.delete(a);
		return this.listActor(mapping, form, request, response);
	}
	public ActionForward checkName(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		String name = new String(request.getParameter("Name").getBytes("iso-8859-1"),"gb2312");		
		List actors = actorService.getByName(name);
		if(actors != null && actors.size()!= 0)
			response.getWriter().write("error");
		else
			response.getWriter().write("ok");
		return null;
	}
	public ActionForward checkIsDeleted(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		int id = Integer.parseInt(request.getParameter("Id"));
		
		Set users = actorService.listUserByActorId(id);
		if(users != null && users.size()!= 0)
			response.getWriter().write("error");
		else
			response.getWriter().write("ok");
		return null;
	}	
}
