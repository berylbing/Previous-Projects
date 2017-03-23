/**
 * Copyright (c) 2010, 
 * 
 * @FileName: FacetAction.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.action
 * @author: yby
 * @Time: 2010-08-31 
 */

package com.ht706.componentLibrary.componentSpecification.action;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentSpecification.actionForm.FacetListForm;
import com.ht706.componentLibrary.componentSpecification.actionForm.SpecificationForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.bo.ISynonymService;
import com.ht706.componentLibrary.systemManagement.bo.ILibraryService;
import com.ht706.componentLibrary.util.MessageBox;
import com.ht706.componentLibrary.util.UUIDKey;


/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class FacetAction extends DispatchAction {
	public IFacetService facetServices;
	public ISpecificationService specificationService;
	private ILibraryService libraryService;
	public ISynonymService synonymService;

	
	public ISynonymService getSynonymService() {
		return synonymService;
	}

	public void setSynonymService(ISynonymService synonymService) {
		this.synonymService = synonymService;
	}

	public ILibraryService getLibraryService() {
		return libraryService;
	}

	public void setLibraryService(ILibraryService libraryService) {
		this.libraryService = libraryService;
	}

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

	/**
	 * 显示刻面树action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetTreeBrowse_3.jsp(edit)  
     * 					/specification/facetTreeBrowse_2.jsp(show) 
     * 					/specification/facetTreeBrowse_4.jsp(synonym)
     * 					/specification/facetTreeBrowse_5.jsp(view)
     * @exception       no
     */
	public ActionForward ShowFacetTreeAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String spid = request.getParameter("spid");
		String temp = request.getParameter("temp");
		FacetListForm f=new FacetListForm();
		f.setFacetList(specificationService.findFacet(spid));
		request.setAttribute("facetListForm", f);
		System.out.println("temptemptttttttttttttt"+temp);
		if(temp.equals("show"))
			return mapping.findForward("showFacetTree");
		if(temp.equals("synonym")){
			System.out.println("temptemptttttttttttttt"+temp);
			return mapping.findForward("synonymFacetTree");
		}
		if(temp.equals("edit"))
			return mapping.findForward("editFacetTree");
		if(temp.equals("view"))
			return mapping.findForward("viewFacetTree");
		return null;
		
	}
	
	/**
	 * 获取显示一个刻面action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetInfo.jsp
     * 					/specification/facetInfo_view.jsp(select=view)
     * @exception       no
     */
	public ActionForward ShowFacetAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String fid=request.getParameter("Idf");
		Facet facet;
		//刻面id
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(fid);
		facetid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		facet=facetServices.getById(facetid);
		request.setAttribute("facetss", facet);
		//显示时间
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(facet.getLastModifiedTime());
		request.setAttribute("createtime", date);
		//显示创建者
		String creator[] = facet.getCreator().split("/");
		request.setAttribute("creator", creator[0]);
		//显示父节点
		//刻面父id
		FacetId facetpid = new FacetId();
		facetpid.setFacetUuid(facet.getParentNode());
		facetpid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		if(facet.getParentNode().equals("-1"))
			{}
		else
			request.setAttribute("parent",facetServices.getById(facetpid).getName() );

		//跳转
		String select = request.getParameter("select");
		if(select.equals("view"))
			return mapping.findForward("facetInfo_view");
		return mapping.findForward("facetInfo");	
	}
	
	
	/**
	 * 初始化修改刻面信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifyFacetInfo.jsp
     * @exception       no
     */
	public ActionForward preFacetForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FacetId facetid = new FacetId();
		String idf = request.getParameter("Idf");
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		Facet facet=facetServices.getById(facetid);
		//初始化修改时间
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		//提取创建者
		String creators[] = facet.getCreator().split("/");
		request.setAttribute("creator", creators[0]);
		request.setAttribute("facet", facet);
		//没有父节点的情况
		FacetId facetpid = new FacetId();
		facetpid.setFacetUuid(facet.getParentNode());
		facetpid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		if(facet.getParentNode().equals("-1"))
		{}
		else
			request.setAttribute("parents",facetServices.getById(facetpid).getName() );
		return mapping.findForward("modifyFacetInfo");		
	}

	/**
	 * 修改刻面信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/null.jsp
     * @exception       no
     */
	public ActionForward modifyFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FacetListForm df= (FacetListForm) form ;
		String ids = df.getFacetids();
		String idf = df.getFacetidf();
		String pids = df.getFacetpids();
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet = facetServices.getById(facetid);
		//保存节点说明
		facet.setDescription(df.getFacet().getDescription());
		//保存时间
		facet.setLastModifiedTime(Date.valueOf(df.getCreatetime()));
		//保存名称
		facet.setName(df.getFacet().getName());
		//保存父节点
		facet.setParentNode(pids);
		//保存发布类型
		facet.setReleaseType(df.getFacet().getReleaseType());
		//保存节点类型
		facet.setNodeType(df.getNodetype());
		facetServices.modify(facet);
		
		request.setAttribute("treefid", idf);
		request.setAttribute("spid", ids);
		return mapping.findForward("null");	
		
	}
	/**
	 * 初始化修改刻面树父节点action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetTreeBrowse_1.jsp
     * @exception       no
     */
	public ActionForward preParentFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = request.getParameter("Ids");
		request.setAttribute("facetIdf", request.getParameter("Idf"));
		request.setAttribute("facetIds", ids);
		FacetListForm f=new FacetListForm();
		f.setFacetList(specificationService.findFacet(ids));
		request.setAttribute("facetListForm", f);
		return mapping.findForward("showFacetParent");
		
	}

	/**
	 * 修改刻面树父节点action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifyFacetInfo.jsp
     * @exception       no
     */
	public ActionForward selectParentFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idf = request.getParameter("Idf");
		String ids = request.getParameter("Ids");
		String pidf = request.getParameter("Pidf");
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet=facetServices.getById(facetid);
		//若选择的是本节点，则不做任何修改;如果选中根节点，节点类型要变为刻面
		if(pidf.equals(idf))
		{
			request.setAttribute("facet", facet);
			FacetId facetpid0 = new FacetId();
			facetpid0.setFacetUuid(facet.getParentNode());
			facetpid0.setSpecification(specificationService.getById(ids));
			request.setAttribute("parents",facetServices.getById(facetpid0).getName() );
		}
		else{
			facet.setParentNode(pidf);
			
			FacetId facetpid = new FacetId();
			facetpid.setFacetUuid(pidf);
			facetpid.setSpecification(specificationService.getById(ids));
			if(facetServices.getById(facetpid).getParentNode().equals("-1"))
			{
				facet.setNodeType("刻面");
			}
			else
			{
				facet.setNodeType("术语");
			}
			request.setAttribute("parents",facetServices.getById(facetpid).getName() );	
			request.setAttribute("facet", facet);
		}
		//初始化修改时间
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		//提取创建者
		String creators[] = facet.getCreator().split("/");
		request.setAttribute("creator", creators[0]);
		request.setAttribute("facet", facet);
		return mapping.findForward("modifyFacetInfo");
		
	}

	/**
	 * 删除刻面action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/null.jsp
     * @exception       no
     */
	public ActionForward deleteFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idf = request.getParameter("Idf");
		String ids = request.getParameter("Ids");
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet = facetServices.getById(facetid);
		List<Facet> facetlist = facetServices.findbyParentNode(idf);
		for(Facet item : facetlist)
		{
			item.setParentNode(facet.getParentNode());
		}
		facetServices.delete(facet);
		//删除刻面对应的同义词
		if(synonymService.findByFacet(ids, idf).isEmpty()){}
		else{
			List<Synonym> synonymlist = synonymService.findByFacet(ids, idf);
			for(Synonym item : synonymlist)
			{
				synonymService.delete(item);
			}
		}
		request.setAttribute("treefid", idf);
		request.setAttribute("spid", ids);
		return mapping.findForward("null");	
		
	}

	/**
	 * 初始化创建新刻面action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetInfo_1.jsp
     * @exception       ids idf UserRealName
     */
	public ActionForward preCreateFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idf = request.getParameter("Idf");
		String ids = request.getParameter("Ids");
		//初始化父节点及节点类型
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet = facetServices.getById(facetid);
		if(facet.getParentNode().equals("-1"))
			facet.setNodeType("刻面");
		else facet.setNodeType("术语");
		request.setAttribute("facet", facet);
		//初始化规约id
		request.setAttribute("facetids", ids);
		//初始化修改时间
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		//初始化创建者
		try{
			String UserRealName = request.getSession().getAttribute("UserRealName").toString();
			request.setAttribute("creator", UserRealName);
		}
		catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");//要显示的图片
			m.setMessage("错误: 请登录！");//加入错误信息
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}

		return mapping.findForward("createFacet");
	}

	/**
	 * 创建新刻面action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/null.jsp
     * @exception       no
     */
	public ActionForward createFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FacetListForm df= (FacetListForm) form ;
		String ids = df.getFacetids();
		String pids = df.getFacetpids();
		Facet facet = df.getFacet();
		FacetId facetid = new FacetId();
		//设置主键
		//设置规约为当前操作中的规约
		facetid.setSpecification(specificationService.getById(ids));
		//设置facetid
		UUIDKey uuids = UUIDKey.getInstance();
		facetid.setFacetUuid(uuids.getNewUUID());
		facet.setId(facetid);
		//设置创建时间
		facet.setLastModifiedTime(Date.valueOf(df.getCreatetime()));
		//设置父节点
		facet.setParentNode(pids);
		/*//如果是parentnode是根节点的话则nodetype为“刻面”，否则为“术语”,这里默认根节点的pid为-1
		FacetId facetpid = new FacetId();
		facetpid.setFacetUuid(pids);
		facetpid.setSpecification(specificationService.getById(ids));
		String nodetempid=facetServices.getById(facetpid).getParentNode();
		if(nodetempid.equals("-1"))
			facet.setNodeType("刻面");
		else facet.setNodeType("术语");*/
		facet.setNodeType(df.getNodetype());
		//facet.setReleaseType(df.getFacet().getReleaseType());
		//设置创建者
		try{
			String UserRealName = request.getSession().getAttribute("UserRealName").toString();
			String UserId = request.getSession().getAttribute("UserID").toString();
			String lid = libraryService.listAll().get(0).getLibraryUniqueId();
			String creators = UserRealName+"/"+UserId+"/"+lid;
			facet.setCreator(creators);
		}
		catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");//要显示的图片
			m.setMessage("错误: 请登录！");//加入错误信息
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
		facetServices.create(facet);
		
		request.setAttribute("treefid", facet.getId().getFacetUuid());
		request.setAttribute("spid", facet.getId().getSpecification());
		return mapping.findForward("null");	
		
	}

	
	
	
}
