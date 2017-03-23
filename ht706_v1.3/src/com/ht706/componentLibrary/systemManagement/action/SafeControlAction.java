package com.ht706.componentLibrary.systemManagement.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;


import com.ht706.componentLibrary.systemManagement.actionForm.ActorToElementForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bo.ISafeControlService;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */





public class SafeControlAction extends DispatchAction {
	private ISafeControlService safeControlService;
	public void setSafeControlService(ISafeControlService safeControlService) {
		this.safeControlService = safeControlService;
	}
	public ISafeControlService getSafeControlService() {
		return safeControlService;
	}
	
	
	/**
	 * 修改权限角色对应关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyAuthorizationToActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {	
		
		int actorId = Integer.parseInt(request.getParameter("id"));
		String authorSelected = request.getParameter("authorsSelected");
		int[] ids = null;
		if(authorSelected != null && authorSelected != "")
		{
			String[] strId =  authorSelected.split(";");
			ids = new int[strId.length];
			for(int i=0;i<strId.length;i++)
				ids[i] = Integer.parseInt(strId[i]);
		}	
		safeControlService.modifyAuthorizationToActor(ids,actorId);				
		return this.searchAuthorizationByActor(mapping, form, request, response);	
				
	}

	/**
	 * 修改人员角色关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyActorToOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ActorToElementForm aef = (ActorToElementForm)form;
		safeControlService.modifyActorToOrganization(aef.getSelectedElement(),aef.getId());
		return this.searchActorByOrganization(mapping, form, request, response);		
				
	}
	/**
	 * 查找所有角色的相关权限action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward searchAllByActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Actor> actorList = new ArrayList<Actor>();
		List<Actor> actorLists = safeControlService.listAllActor();
		Actor acall = new Actor() ;
		acall.setActorId(-1);
		acall.setActorName("所有角色");
		actorLists.add(acall);
		int id=-1;
		if(request.getParameter("Id")==null||Integer.parseInt(request.getParameter("Id"))==-1){
		actorList= safeControlService.listAllActor();
		}
		else{
			id=Integer.parseInt(request.getParameter("Id"));
			Actor actor = safeControlService.findActor(id);
			actorList.add(0, actor);
		}
		request.setAttribute("actorId", id);
		request.setAttribute("actorList", actorList);
		request.setAttribute("actorLists",actorLists);
		return mapping.findForward("actorList");
				
	}
	/**
	 * 通过角色查找权限action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward searchAuthorizationByActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Actor actor;
		if(request.getParameter("Id")==null)
		{
			//Actor actor  = (Actor) actorService.listAll().get(0);
			actor = safeControlService.findFistActor();
		}
		else
			actor = safeControlService.findActor(Integer.parseInt(request.getParameter("Id")));
		List<Actor> actorList= safeControlService.listAllActor();
		request.setAttribute("actorId", actor.getActorId());
		request.setAttribute("actorList", actorList);		
		
		return mapping.findForward("actorToauthorizationList");			
				
	}
	/**
	 * 通过角色查找每个模块的权限action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward searchModuleAuthorizationByActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int actorId = Integer.parseInt(request.getParameter("actorId"));
		String moduleId = request.getParameter("moduleId");
		List<Authorization> actorToauthorizationList = safeControlService.searchAuthorizationByActor(safeControlService.findActor(actorId));
		List<Authorization> allAut=safeControlService.listAuthorizationByModule(moduleId);	
		
		request.setAttribute("actorToauthorizationList", actorToauthorizationList);
		request.setAttribute("allAut", allAut);
		return mapping.findForward("actorToModuleAuthorizationList");		
				
	}

	/**
	 * 通过人员查找角色action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward searchActorByOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Organization or;
		if(request.getParameter("Id")==null)
		{
			//Actor actor  = (Actor) actorService.listAll().get(0);
			or = safeControlService.findFistOrganization();
		}
		else
			or = safeControlService.findOrganization(Integer.parseInt(request.getParameter("Id")));
		
		List<Actor> ata = safeControlService.searchActorByOrganization(or.getUserId());
		List<Actor> allActor=safeControlService.listAllActor();
		request.setAttribute("userId", or.getUserId());
		request.setAttribute("userName", or.getUserName());
		request.setAttribute("actorList", ata);
		request.setAttribute("allAut", allActor);
		return mapping.findForward("organizationToactorList");			
				
	}
	/**
	 * 人员授权查询action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward searchAllByOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Organization or;
		if(request.getParameter("Id")==null)
		{
			//Actor actor  = (Actor) actorService.listAll().get(0);
			or = safeControlService.findFistOrganization();
		}
		else
			or = safeControlService.findOrganization(Integer.parseInt(request.getParameter("Id")));
		
		List<Actor> ata = safeControlService.searchActorByOrganization(or.getUserId());
		List<Actor> allActor=safeControlService.listAllActor();
		request.setAttribute("userId", or.getUserId());
		request.setAttribute("userName", or.getUserName());
		request.setAttribute("actorList", ata);
		return mapping.findForward("personAuthorizedBrowsing");		
				
	}
	/**
	 * 权限分配查询action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward searchAllByAuthorization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String module = request.getParameter("ModuleId");
		String Id = request.getParameter("Id");
		if(module != null && module.equals("-1"))
			module = null;
		List<Authorization> authorizationList = new ArrayList<Authorization>();
		List<Authorization> authorizationSelectList = safeControlService.listAuthorizationByModule(module);
		if(module == null){			
			if(Id==null){
				authorizationList= safeControlService.listAllAuthorization();
			}
			else{
				Authorization authorization = safeControlService.findAuthorization(Integer.parseInt(Id));
				authorizationList.add(0, authorization);
			}
		}
		else
		{
			if(Id == null){
				authorizationList= safeControlService.listAuthorizationByModule(module);
			}
			else{
				Authorization authorization = safeControlService.findAuthorization(Integer.parseInt(Id));
				authorizationList.add(0, authorization);
			}
		}
		request.setAttribute("authorizationList", authorizationList);
		request.setAttribute("authorizationSelectList", authorizationSelectList);
		request.setAttribute("moduleId", module == null?"-1":module);
		request.setAttribute("Id", Id);
		return mapping.findForward("authorizationList");	
				
	}
	
	public ActionForward searchURLByAuthorization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Actor actor;
		if(request.getParameter("Id")==null)
		{
			//Actor actor  = (Actor) actorService.listAll().get(0);
			actor = safeControlService.findFistActor();
		}
		else
			actor = safeControlService.findActor(Integer.parseInt(request.getParameter("Id")));
		List<Actor> actorList= safeControlService.listAllActor();
		List<Authorization> ata = safeControlService.searchAuthorizationByActor(actor);
		List<Authorization> allAut=safeControlService.listAllAuthorization();
		request.setAttribute("actorId", actor.getActorId());
		request.setAttribute("actorList", actorList);
		request.setAttribute("actorToauthorizationList", ata);
		request.setAttribute("allAut", allAut);
		return mapping.findForward("URLAssign");		
				
	}
	
}
