package com.ht706.componentLibrary.componentSearch.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.componentSearch.bo.IFacetService;
import com.ht706.componentLibrary.util.Constant;

public class PageChangeAction extends Action {
	public IFacetService facetService;
	
	public IFacetService getFacetService() {
		return facetService;
	}

	public void setFacetService(IFacetService facetService) {
		this.facetService = facetService;
	}
	
	/**
	 * 对构件列表进行换页操作
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward execute (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		int page;
		try{
			page=Integer.valueOf(request.getParameter("page"));
		}catch(Exception e){
			page=0;
		}
		//ComponentListForm cf=(ComponentListForm)request.getAttribute("ComponentListForm");
		ComponentListForm cf=(ComponentListForm)form;
		//System.out.println("----------------------------------size: "+cf.getComponentList().size());
		int per=Constant.PAGE_LINES,all=cf.getAllNum();
		//System.out.println("------------page: "+page+" per: "+per+" all: "+all+"-----"+cf.getPage());
		//System.out.println("----------------------------------size: "+cf.getComponentList().size());
		if(per*page<all)cf.setPage(page);
		else cf.setPage(all/per);
		if(page<1)cf.setPage(0);
		request.setAttribute("ComponentListForm",cf);
		return mapping.findForward("list");
	}
}
