/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationmodifyAction.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.action
 * @author: yby
 * @Time: 2010-09-1 
 */
package com.ht706.componentLibrary.componentSpecification.action;


import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentSpecification.actionForm.SynonymForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationmodifyService;
import com.ht706.componentLibrary.componentSpecification.bo.ISynonymService;
import com.ht706.componentLibrary.util.UUIDKey;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-09-1 
 *
 */
public class SynonymAction extends DispatchAction {
	public ISynonymService synonymService;
	public ISpecificationService specificationService;
	public IFacetService facetServices;

	public IFacetService getFacetServices() {
		return facetServices;
	}

	public void setFacetServices(IFacetService facetServices) {
		this.facetServices = facetServices;
	}

	public ISpecificationService getSpecificationService() {
		return specificationService;
	}

	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	public ISynonymService getSynonymService() {
		return synonymService;
	}

	public void setSynonymService(ISynonymService synonymService) {
		this.synonymService = synonymService;
	}

	/**
	 * 显示术语对应的同义词的列表action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/synonymBrowse.jsp
     * @exception       no
     */
	public ActionForward ListSynonymAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = request.getParameter("spid");
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkListSynonymAction"+ids);
		List<Facet> facetlist = specificationService.findFacet(ids);
		List<Facet> synonymlists = new ArrayList<Facet>();
		for(Facet item : facetlist)
		{
			String synonymstring = "";
			List<Synonym> synonymlist = synonymService.findByFacet(ids, item.getId().getFacetUuid());
			if(item.getNodeType().equals("术语"))
			{
				for(Synonym element : synonymlist)
				{
					synonymstring = synonymstring +","+ element.getTargetItem();
				}
				if(synonymstring.equals("")){}
				else{
					synonymstring = synonymstring.substring(1);
					item.setDescription(synonymstring);	
					synonymlists.add(item);
				}
			}
		}
		request.setAttribute("synonymLists", synonymlists);
		return mapping.findForward("listsynonym");
	}
	
	/**
	 * 显示术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/synonymInfo.jsp
     * 					/specification/null_view.jsp
     * @exception       no
     */
	public ActionForward ShowSynonymAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = request.getParameter("Ids");
		String idf = request.getParameter("Idf");
		FacetId id = new FacetId();
		id.setFacetUuid(idf);
		id.setSpecification(specificationService.getById(ids));
		String node = facetServices.getById(id).getNodeType();
		if(node.equals("术语"))
		{
			request.setAttribute("synonymList", synonymService.findByFacet(ids,idf));
			request.setAttribute("facetid", idf);
			request.setAttribute("spceid", ids);
			request.setAttribute("facetname", facetServices.getById(id).getName());
			return mapping.findForward("showsynonym");
		}	
		else{
			return mapping.findForward("null_view");
		}
	}

	/**
	 * 初始化新建术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/synonymInfo.jsp
     * @exception       no
     */
	public ActionForward preCreateSynonym(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = request.getParameter("Ids");
		String idf = request.getParameter("Idf");

		request.setAttribute("facetid", idf);
		request.setAttribute("spceid", ids);
		//刻面
		FacetId id = new FacetId();
		id.setFacetUuid(idf);
		id.setSpecification(specificationService.getById(ids));
		request.setAttribute("facetname", facetServices.getById(id).getName());
		//初始化时间
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		return mapping.findForward("createsynonym");
	}

	
	/**
	 * 新建术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/synonymInfo.jsp
     * @exception       no
     */
	public ActionForward createSynonym(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SynonymForm sf = (SynonymForm)form;
		Synonym s = sf.getSynonym();
		UUIDKey uuids0 = UUIDKey.getInstance();
		s.setSynonymUuid(uuids0.getNewUUID());
		s.setSpecUuid(sf.getSpceid());
		s.setSourceItem(sf.getFacetid());
		s.setLastModifiedTime(Date.valueOf(sf.getCreatetime()));
		synonymService.create(s);
		
		request.setAttribute("synonymList", synonymService.findByFacet(sf.getSpceid(),sf.getFacetid()));
		request.setAttribute("facetid", sf.getFacetid());
		request.setAttribute("spceid", sf.getSpceid());
		return mapping.findForward("showsynonym");
	}

	/**
	 * 初始化编辑术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifySynonym.jsp
     * @exception       no
     */
	public ActionForward preModifySynonym(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("Id");
		Synonym synonym = synonymService.findById(id);
		String idf=synonym.getSourceItem();
		String ids=synonym.getSpecUuid();
		request.setAttribute("synonym", synonym);
		request.setAttribute("spid", ids);
		request.setAttribute("idf", idf);
		FacetId fid = new FacetId();
		fid.setFacetUuid(idf);
		fid.setSpecification(specificationService.getById(ids));
		request.setAttribute("facetname", facetServices.getById(fid).getName());
		//初始化时间
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		return mapping.findForward("modifysynonym");
	}

	
	/**
	 * 修改术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/synonymInfo.jsp
     * @exception       no
     */
	public ActionForward modifySynonym(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SynonymForm sf = (SynonymForm)form;
		Synonym s = sf.getSynonym();
		s.setLastModifiedTime(Date.valueOf(sf.getCreatetime()));
		synonymService.modify(s);
		String idf = s.getSourceItem();
		String ids = s.getSpecUuid();
		request.setAttribute("synonymList", synonymService.findByFacet(ids,idf));
		request.setAttribute("facetid", idf);
		request.setAttribute("spceid", ids);
		//对应刻面
		FacetId fid = new FacetId();
		fid.setFacetUuid(idf);
		fid.setSpecification(specificationService.getById(ids));
		request.setAttribute("facetname", facetServices.getById(fid).getName());
		return mapping.findForward("showsynonym");
	}
	/**
	 * 删除术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/synonymInfo.jsp
     * @exception       no
     */
	public ActionForward deleteSynonym(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("Id");
		Synonym synonym = synonymService.findById(id);
		synonymService.delete(synonym);
		request.setAttribute("synonymList", synonymService.findByFacet(synonym.getSpecUuid(),synonym.getSourceItem()));
		request.setAttribute("facetid", synonym.getSourceItem());
		request.setAttribute("spceid", synonym.getSpecUuid());
		//对应刻面
		FacetId fid = new FacetId();
		fid.setFacetUuid(synonym.getSourceItem());
		fid.setSpecification(specificationService.getById(synonym.getSpecUuid()));
		request.setAttribute("facetname", facetServices.getById(fid).getName());
		return mapping.findForward("showsynonym");
	}

}
