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

import com.ht706.componentLibrary.componentSpecification.actionForm.RelationtypeForm;
import com.ht706.componentLibrary.componentSpecification.actionForm.SynonymForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.RelationtypeId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.bo.IComponentrelationService;
import com.ht706.componentLibrary.componentSpecification.bo.IRelationtypeService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationmodifyService;
import com.ht706.componentLibrary.componentSpecification.bo.ISynonymService;
import com.ht706.componentLibrary.util.Constant;
import com.ht706.componentLibrary.util.UUIDKey;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-09-1 
 *
 */
public class RelationtypeAction extends DispatchAction {
	IRelationtypeService relationtypeService;
	ISpecificationService specificationService;
	IComponentrelationService componentrelationService;

	public IComponentrelationService getComponentrelationService() {
		return componentrelationService;
	}

	public void setComponentrelationService(
			IComponentrelationService componentrelationService) {
		this.componentrelationService = componentrelationService;
	}

	public ISpecificationService getSpecificationService() {
		return specificationService;
	}

	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	public IRelationtypeService getRelationtypeService() {
		return relationtypeService;
	}

	public void setRelationtypeService(IRelationtypeService relationtypeService) {
		this.relationtypeService = relationtypeService;
	}

	

	/**
	 * 显示构建关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          当select= edit 时 /specification/relationEdit.jsp；
     * 					当select = search 时 /specification/relationBrowse.jsp
     * @exception       no
     */
	public ActionForward ShowRelationAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String spid = request.getParameter("spid");
		String select = request.getParameter("select");
		int totalPage = (int)Math.ceil((specificationService.findRelationtype(spid).size())/(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<Relationtype> list = specificationService.findRelationtypeByNumber(spid ,start, offset,page);
		request.setAttribute("totalPage", totalPage);
		System.out.println("0000000000000000000000000000000000000000");
		request.setAttribute("relationList", list);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", specificationService.findRelationtype(spid).size());
		request.setAttribute("spid", spid);

		if(select.equals("edit")){
			return mapping.findForward("showrelation");
		}
		else if(select.equals("search"))
		{
			return mapping.findForward("searchrelation");
		}
		return null;
		
	}

	/**
	 * 初始化新建构建关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/createRelationtype.jsp
     * @exception       no
     */
	public ActionForward preCreateRelationtype(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String spid = request.getParameter("spid");
		request.setAttribute("spid", spid);
		//创建时间初始化
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		return mapping.findForward("createrelation");
	}

	
	/**
	 * 新建构建关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/relationEdit.jsp
     * @exception       no
     */
	public ActionForward createRelationtype(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		RelationtypeForm rf = (RelationtypeForm)form;
		Relationtype relationtype = rf.getRelationtype();
		relationtype.setLastModifiedTime(Date.valueOf(rf.getCreatetime()));		
		RelationtypeId relationid = new RelationtypeId();
		relationid.setSpecification(specificationService.getById(rf.getSpid()));
		UUIDKey uuids = UUIDKey.getInstance();
		relationid.setRelationUuid(uuids.getNewUUID());
		relationtype.setId(relationid);
		relationtypeService.create(relationtype);

		request.setAttribute("spid", rf.getSpid());
		//分页
		int totalPage = (int)Math.ceil((specificationService.findRelationtype(rf.getSpid()).size())/(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<Relationtype> list = specificationService.findRelationtypeByNumber(rf.getSpid() ,start, offset,page);
		request.setAttribute("totalPage", totalPage);
		System.out.println("0000000000000000000000000000000000000000");
		request.setAttribute("relationList", list);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", specificationService.findRelationtype(rf.getSpid()).size());
		return mapping.findForward("showrelation");
	}

	/**
	 * 初始化编辑构建关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifyRelationtype.jsp
     * @exception       no
     */
	public ActionForward preModifyRelationtype(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = request.getParameter("Ids");
		String idr = request.getParameter("Idr");
		RelationtypeId relationid = new RelationtypeId();
		relationid.setRelationUuid(idr);
		relationid.setSpecification(specificationService.getById(ids));
		request.setAttribute("relationtype", relationtypeService.findById(relationid));
		request.setAttribute("relationid", idr);
		//创建时间初始化
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		return mapping.findForward("modifyrelation");
	}

	
	/**
	 * 修改构建关系action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/relationEdit.jsp
     * @exception       no
     */
	public ActionForward modifyRelationtype(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		RelationtypeForm rf = (RelationtypeForm)form;
		String spid = rf.getSpid();
		String relationid = rf.getRelationid();
		RelationtypeId relationtypeid = new RelationtypeId();
		relationtypeid.setRelationUuid(relationid);
		relationtypeid.setSpecification(specificationService.getById(spid));
		Relationtype relationtype = relationtypeService.findById(relationtypeid);
		relationtype.setLastModifiedTime(Date.valueOf(rf.getCreatetime()));
		relationtype.setRelationName(rf.getRelationtype().getRelationName());
		relationtype.setDescription(rf.getRelationtype().getDescription());
		relationtype.setRelationType(rf.getRelationtype().getRelationType());
		
		relationtypeService.modify(relationtype);
		request.setAttribute("spid", spid);
		//分页
		int totalPage = (int)Math.ceil((specificationService.findRelationtype(spid).size())/(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<Relationtype> list = specificationService.findRelationtypeByNumber(spid ,start, offset,page);
		request.setAttribute("totalPage", totalPage);
		System.out.println("0000000000000000000000000000000000000000");
		request.setAttribute("relationList", list);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", specificationService.findRelationtype(spid).size());
		return mapping.findForward("showrelation");
	}
	/**
	 * 删除术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return           /specification/relationEdit.jsp
     * @exception       no
     */
	public ActionForward deleteRelationtype(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("Id");
		String spid = request.getParameter("spid");
		RelationtypeId relationid = new RelationtypeId();
		relationid.setRelationUuid(id);
		relationid.setSpecification(specificationService.getById(spid));
		Relationtype relationtype = relationtypeService.findById(relationid);
		relationtypeService.delete(relationtype);

		request.setAttribute("spid", spid);
		
		//分页
		int totalPage = (int)Math.ceil((specificationService.findRelationtype(spid).size())/(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<Relationtype> list = specificationService.findRelationtypeByNumber(spid ,start, offset,page);
		request.setAttribute("totalPage", totalPage);
		System.out.println("0000000000000000000000000000000000000000");
		request.setAttribute("relationList", list);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", specificationService.findRelationtype(spid).size());
		return mapping.findForward("showrelation");
	}
	/**
	 * 验证删除术语对应的同义词action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return           /specification/check_ok.jsp(ok)
     * 					/specification/check_error.jsp(error)
     * @exception       no
     */
	public ActionForward checkdelete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String rid = request.getParameter("rid");
		int num = componentrelationService.findByRelationtype(rid);
		if(num==0){
			String temp = rid;
			request.setAttribute("value", temp);
			return mapping.findForward("check_ok");
		}else
		{
			String temp ="no";
			request.setAttribute("value", temp);
			return null;
		}
	}

}
