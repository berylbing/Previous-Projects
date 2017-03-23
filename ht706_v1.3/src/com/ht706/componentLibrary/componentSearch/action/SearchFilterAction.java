package com.ht706.componentLibrary.componentSearch.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.componentSearch.actionForm.FacetListForm;
import com.ht706.componentLibrary.componentSearch.actionForm.SearchFilterForm;
import com.ht706.componentLibrary.componentSearch.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;

public class SearchFilterAction extends Action {
	
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
	 * 对构件按条件进行查找操作
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward execute (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		ComponentListForm cf=new ComponentListForm();
		cf.setComponentList(facetService.serchComponentByFilter((SearchFilterForm)form));
		cf.setPage(0);
		cf.setRelationTypes(specificationService.findcurRelationtype());
		request.setAttribute("ComponentListForm", cf);
		//request.getSession().setAttribute("ComponentListForm", cf);
		
		
		return mapping.findForward("list");
	}
}
