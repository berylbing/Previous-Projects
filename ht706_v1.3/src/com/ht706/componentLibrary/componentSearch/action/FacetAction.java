package com.ht706.componentLibrary.componentSearch.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;

import com.ht706.componentLibrary.componentSearch.actionForm.FacetListForm;
import com.ht706.componentLibrary.componentSearch.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;

public class FacetAction extends DispatchAction {
	public IFacetService facetService;
	private ISpecificationService specificationService;
	public IFacetService getFacetService() {
		return facetService;
	}

	public void setFacetService(IFacetService facetService) {
		this.facetService = facetService;
	}
	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	public ISpecificationService getSpecificationService() {
		return specificationService;
	}
	
	/**
	 * 显示构件列表action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward ShowFacetTreeAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		FacetListForm f=new FacetListForm();
		f.setFacetList(facetService.showFacetList());
		request.setAttribute("FacetListForm", f);
		System.out.println("--------------------"+f.getFacetList().size());
		return mapping.findForward("show");
	}
	
	
	/**
	 * 显示构件列表action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward ShowComponentListAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		FacetListForm ff=(FacetListForm)form;
		ComponentListForm cf=new ComponentListForm();
		cf.setRelationTypes(specificationService.findcurRelationtype());
		cf.setComponentList(facetService.searchComponentByFaect(ff.getSelected()));
		cf.setPage(0);
		
		request.setAttribute("ComponentListForm", cf);
		request.getSession().setAttribute("ComponentListForm", cf);
		return mapping.findForward("list");
	}
	
}
