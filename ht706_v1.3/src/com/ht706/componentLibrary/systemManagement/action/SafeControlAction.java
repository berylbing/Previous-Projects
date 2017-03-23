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
	 * �޸�Ȩ�޽�ɫ��Ӧ��ϵaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
	 * �޸���Ա��ɫ��ϵaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
	 * �������н�ɫ�����Ȩ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward searchAllByActor(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Actor> actorList = new ArrayList<Actor>();
		List<Actor> actorLists = safeControlService.listAllActor();
		Actor acall = new Actor() ;
		acall.setActorId(-1);
		acall.setActorName("���н�ɫ");
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
	 * ͨ����ɫ����Ȩ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
	 * ͨ����ɫ����ÿ��ģ���Ȩ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
	 * ͨ����Ա���ҽ�ɫaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
	 * ��Ա��Ȩ��ѯaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
	 * Ȩ�޷����ѯaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
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
