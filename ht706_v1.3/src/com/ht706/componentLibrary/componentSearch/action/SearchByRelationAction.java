package com.ht706.componentLibrary.componentSearch.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.componentSearch.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;

public class SearchByRelationAction extends Action {
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
	 * �Թ������������в��Ҳ���
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */ 
	public ActionForward execute (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		ComponentListForm cf=(ComponentListForm)form;
		String assetId=(String)request.getParameter("asset");
		String relation=(String)request.getParameter("relation");
		System.out.println("id:"+assetId+"---------------------------r: "+relation);
		cf.setComponentList(facetService.serchComponentByRelation(assetId, relation));
		cf.setRelationTypes(specificationService.findcurRelationtype());
		request.setAttribute("ComponentListForm", cf);
		return mapping.findForward("list");
	}
}
