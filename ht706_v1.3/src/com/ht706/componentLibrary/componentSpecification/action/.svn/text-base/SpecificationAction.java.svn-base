/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationAction.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.action
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.action;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.TaskService;
import org.jbpm.api.task.Task;
//import org.jbpm.api.ExecutionService;
//import org.jbpm.api.ProcessEngine;
//import org.jbpm.api.TaskService;
//import org.jbpm.api.task.Task;

import com.ht706.componentLibrary.componentSpecification.actionForm.SpecificationForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.RelationtypeId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.IRelationtypeService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.bo.ISynonymService;
import com.ht706.componentLibrary.systemManagement.bo.ILibraryService;
import com.ht706.componentLibrary.util.Constant;
import com.ht706.componentLibrary.util.MessageBox;
import com.ht706.componentLibrary.util.UUIDKey;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class SpecificationAction extends DispatchAction {
	private ISpecificationService specificationService;
	private IRelationtypeService relationtypeService;
	private IFacetService facetServices;
	private ISynonymService synonymService;
	private ILibraryService libraryService;
	private ProcessEngine processEngine;

	public ProcessEngine getProcessEngine() {
		return processEngine;
	}
	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}
	public ILibraryService getLibraryService() {
		return libraryService;
	}
	public void setLibraryService(ILibraryService libraryService) {
		this.libraryService = libraryService;
	}
	public ISynonymService getSynonymService() {
		return synonymService;
	}
	public void setSynonymService(ISynonymService synonymService) {
		this.synonymService = synonymService;
	}
	public IRelationtypeService getRelationtypeService() {
		return relationtypeService;
	}
	public void setRelationtypeService(IRelationtypeService relationtypeService) {
		this.relationtypeService = relationtypeService;
	}
	
	public ISpecificationService getSpecificationService() {
		return specificationService;
	}
	public IFacetService getFacetServices() {
		return facetServices;
	}
	public void setFacetServices(IFacetService facetServices) {
		this.facetServices = facetServices;
	}
	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	/**
	 * 查看标准规约列表action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/specifiactionRetrival.jsp
     * @exception       no
     */
	public ActionForward listSpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		int totalPage = (int)Math.ceil((specificationService.listAll().size())/(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<Specification> list = specificationService.findByNumber(start, offset);
		//获取当前用户
		String creators ="" ;
		try{
			String UserRealName = request.getSession().getAttribute("UserRealName").toString();
			String UserId = request.getSession().getAttribute("UserID").toString();
			String lid = libraryService.listAll().get(0).getLibraryUniqueId();
			creators = UserRealName+"/"+UserId+"/"+lid;
		}
		catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");//要显示的图片
			m.setMessage("错误: 请登录！");//加入错误信息
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
		ArrayList<Specification> lists = new ArrayList<Specification>();
		for(Specification item : list)
		{
			if(item.getStatus()==1&&item.getCreator().equals(creators))
			{
				String tempcreator = item.getCreator().split("/")[0];
				item.setCreator(tempcreator);
				lists.add(item);
			}
			else if(item.getStatus()!=1){
				String tempcreator = item.getCreator().split("/")[0];
				item.setCreator(tempcreator);
				lists.add(item);
			}
		}
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("specificationList", lists);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", specificationService.listAll().size());
		
		return mapping.findForward("specificationList");
	}
	
	/**
	 * 获取规约详细信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/SpecInfo.jsp
     * @exception       no
     */
	public ActionForward getSpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		String id = request.getParameter("Id");
		Specification s = specificationService.getById(id);
		String temp = s.getCreator();
		String creator[] = temp.split("/");
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(s.getDateOfInformation());
		request.setAttribute("createtime", date);
		request.setAttribute("specification", s);
		request.setAttribute("lid", libraryService.getById(creator[2]).getName());
		request.setAttribute("creator", creator[0] );		
		//前导规约初始化
		String preid = "";
		if(s.getPrecedeSpec().equals(""))
		{
			preid = "无";
		}
		else
			preid = specificationService.getById(s.getPrecedeSpec()).getVersion();
		request.setAttribute("prespecificationid",preid);

		return mapping.findForward("specinfo");
	}
	
	/**
	 * 初始化规约左侧刻面菜单action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          如果temp=edit /specification/specificationMenu1.jsp；
     * 					如果temp=view /specification/specificationMenu2.jsp；
     * @exception       no
     */
	public ActionForward preSpeMenu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		String id = request.getParameter("Id");
		String temp = request.getParameter("temp");
		request.setAttribute("spid", id);
		if(temp.equals("edit"))
			return mapping.findForward("prespemenu1");
		else if(temp.equals("view"))
			return mapping.findForward("prespemenu2");
		return null;
	}
	
	/**
	 * 初始化修改规约原始信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifySpecification.jsp
     * @exception       no
     */
	public ActionForward preSpecificationForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String spid = request.getParameter("Id");
		Specification specification=specificationService.getById(spid);
		String creator[] = specification.getCreator().split("/");
		//lid中为库名称，数据库中存的是库ID
		request.setAttribute("lid", libraryService.getById(creator[2]).getName());
		request.setAttribute("creator", creator[0]);
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(specification.getDateOfInformation());
		request.setAttribute("createtime", date);
		List<Specification> presplist = specificationService.listPre();
		Specification sp = new Specification();
		sp.setSpecUuid("");
		sp.setVersion("");
		presplist.add(0, sp);
		
		String reasons = request.getParameter("Reason");
		request.setAttribute("Reason", reasons);
		//前导规约初始化
		String preid = "";
		if(specification.getPrecedeSpec().equals(""))
		{
			preid = "无";
		}
		else
			preid = specificationService.getById(specification.getPrecedeSpec()).getVersion();
		request.setAttribute("prespecificationid",preid);
		request.setAttribute("preSp", presplist);
		request.setAttribute("specification", specification);
		return mapping.findForward("modifySpecification");
	}
	
	/**
	 * 修改权限信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          listSpecification(mapping, form, request, response)
     * @exception       no
     */
	public ActionForward modifySpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SpecificationForm sf = (SpecificationForm)form;
		String spid = sf.getSpecification().getSpecUuid();
		Specification sp = specificationService.getById(spid);
		sp.setDescription(sf.getSpecification().getDescription());
		sp.setReleaseType(sf.getSpecification().getReleaseType());
		sp.setVersion(sf.getSpecification().getVersion());//缺少程序检查版本号填写时，不能重复！！！
		sp.setReason(sf.getSpecification().getReason());
		sp.setDateOfInformation(Date.valueOf(sf.getCreatetime()));
		specificationService.modify(sp);
		return this.listSpecification(mapping, form, request, response);
	}
	
	/**
	 * 初始化创建规约action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/createSpecification.jsp
     * @exception       no
     */
	public ActionForward precreateSpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
			System.out.println("====================precreateSpecification");
			List<Specification> presplist = specificationService.listPre();
			Specification sp = new Specification();
			sp.setSpecUuid("null");
			sp.setVersion("--无--");
			presplist.add(0, sp);
			request.setAttribute("preSp", presplist);
			String Reasons=request.getParameter("Reason");
			System.out.println("====================precreateSpecification+++"+Reasons);
			request.setAttribute("reasons", Reasons);
			//创建时间初始化
			SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
			String date = sDateFormat.format(new java.util.Date());
			request.setAttribute("createtime", Date.valueOf(date));
			//创建库初始化,这里lid存的是库名称，但是数据库中存的是库id
			request.setAttribute("lid", libraryService.listAll().get(0).getName());
			//当前用户
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
			return mapping.findForward("createSpecification");
	}
	
	/**
	 * 创建新规约action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return        
     *   /specification/SpecInfo.jsp
     * @exception       no
     */
	public ActionForward createSpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SpecificationForm sf = (SpecificationForm) form;
		Specification s = sf.getSpecification();
		UUIDKey uuids0 = UUIDKey.getInstance();
		s.setSpecUuid(uuids0.getNewUUID());
		//获取当前用户
		String UserRealName="";
		String lid;
		String UserId;
		try{
		UserRealName = request.getSession().getAttribute("UserRealName").toString();
		UserId = request.getSession().getAttribute("UserID").toString();
		lid = libraryService.listAll().get(0).getLibraryUniqueId();
		String creators = UserRealName+"/"+UserId+"/"+lid;
		s.setCreator(creators);
		}
		catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");//要显示的图片
			m.setMessage("错误: 请登录！");//加入错误信息
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
		SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");   
		s.setDateOfInformation(formate.parse(sf.getCreatetime()));
		//输入的是version，但是存储的时候是UUID
		if (sf.getPrespecificationid().equals("--无--")){
			s.setPrecedeSpec("");
			request.setAttribute("prespecificationid", "无");
		}
		else {
				Specification tempspe = specificationService.findByVersion(sf.getPrespecificationid());
				s.setPrecedeSpec(tempspe.getSpecUuid());
				request.setAttribute("prespecificationid", sf.getPrespecificationid());
			}
		s.setVersion(sf.getSpecification().getVersion());//缺少程序检查版本号填写时，不能重复！！！
		s.setReason(sf.getSpecification().getReason());
		System.out.println("xxxxxxxxxxxxxxxxx"+s.getPrecedeSpec()+"....."+sf.getSpecification().getReason());
		//一下是用于specinfo.jsp
		request.setAttribute("specification", s);
		request.setAttribute("lid", libraryService.getById(lid).getName());
		request.setAttribute("creator", UserRealName);
		request.setAttribute("createtime", sf.getCreatetime());
		s.setStatus(1);
		specificationService.create(s);
		
		
		/**
		 * 初始化刻面,如果没有前导规约，则创建一个根节点，该根节点 类型为根节点，名称为“刻面树”，父节点UUID为-1；如果有签到规约则整体复制；
		 */
		if (sf.getPrespecificationid().equals("--无--")){
			FacetId facetid = new FacetId();
			facetid.setSpecification(s);
			UUIDKey uuids = UUIDKey.getInstance();
			facetid.setFacetUuid(uuids.getNewUUID());
			Facet facet = new Facet();
			facet.setId(facetid);
			facet.setCreator(s.getCreator());		//edit
			facet.setDescription("根节点，不表示任何意义。");
			facet.setName("刻面树");
			facet.setNodeType("根节点"); 
			facet.setLastModifiedTime(new java.util.Date()); //edit
			facet.setParentNode("-1");
			facet.setReleaseType("1");
			facetServices.create(facet);
			System.out.println("create facet root!!!!!!!!!!!!");
		}
		else
		{
			List<Facet> facetlist = specificationService.findFacet(s.getPrecedeSpec());
			for (Facet item : facetlist) {
				Facet facet = new Facet();
				FacetId facetid = new FacetId();
				facetid.setSpecification(s);
				facetid.setFacetUuid(item.getId().getFacetUuid());
				facet.setId(facetid);
				facet.setCreator(item.getCreator());
				facet.setName(item.getName());
				facet.setNodeType(item.getNodeType());
				facet.setParentNode(item.getParentNode());
				facet.setReleaseType(item.getReleaseType());
				facet.setDescription(item.getDescription());
				facet.setLastModifiedTime(item.getLastModifiedTime());
				facetServices.create(facet);
			} 
		}
		/**
		 * 初始化RelationType
		 */
		if(sf.getPrespecificationid().equals("--无--")){}
		else{
			List<Relationtype> relationtypelist = specificationService.findRelationtype(s.getPrecedeSpec());
			for(Relationtype item : relationtypelist){
				Relationtype relationtype = new Relationtype();
				RelationtypeId relationid = new RelationtypeId();
				relationid.setRelationUuid(item.getId().getRelationUuid());
				relationid.setSpecification(s);
				relationtype.setId(relationid);
				relationtype.setDescription(item.getDescription());
				relationtype.setLastModifiedTime(item.getLastModifiedTime());
				relationtype.setRelationName(item.getRelationName());
				relationtype.setRelationType(item.getRelationType());
				relationtypeService.create(relationtype);
			}
		}
		
		
		
		/**
		 * 初始化Synonym
		 */
		if(sf.getPrespecificationid().equals("--无--")){}
		else{
			List<Synonym> synonymlist = synonymService.findBySpec(s.getPrecedeSpec());
			for(Synonym item : synonymlist)
			{
				Synonym synonym = new Synonym();
				UUIDKey uuids = UUIDKey.getInstance();
				synonym.setSynonymUuid(uuids.getNewUUID());
				synonym.setSpecUuid(s.getSpecUuid());
				synonym.setDescription(item.getDescription());
				synonym.setLastModifiedTime(item.getLastModifiedTime());
				synonym.setSourceItem(item.getSourceItem());
				synonym.setTargetItem(item.getTargetItem());
				synonymService.create(synonym);
			}	
		}
		//jbpm
		
		

		ExecutionService executionService = processEngine.getExecutionService();
		Map<String , Object > map= new HashMap<String,Object>();
		String username = (String) request.getSession().getAttribute("UserName");
		map.put("owner",  username );
		map.put("id", s.getSpecUuid());
		map.put("actionName", "specification/menuFrame1.jsp?Id=");
		map.put("table", "specification");
		map.put("property", "status");
		map.put("UUID", "specUuid");
		map.put("起草","1");
		map.put("审核","2");
		map.put("标准审核委员会","2");
		map.put("批准","3");
		map.put("flag", s.getReleaseType().intValue());
		map.put("description", "规约发布工作流");
		

		executionService.startProcessInstanceByKey("CreateSpecification", map,s.getSpecUuid());

		return mapping.findForward("specinfo");
	}
	
	/**
	 * 删除规约,删除相关的刻面，规约关系，同义词等信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          listSpecification(mapping, form, request, response)
     * @exception       no
     */
	public ActionForward deleteSpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String spid=request.getParameter("Id");
		Specification sp = specificationService.getById(spid);
		specificationService.delete(sp);
		if(synonymService.findBySpec(spid).isEmpty()){}
		else{
			List<Synonym> synonymlist = synonymService.findBySpec(spid);
			for(Synonym item : synonymlist)
			{
				synonymService.delete(item);
			}
		}
		
		//jbpm 删除相应的工作流实例
		ExecutionService executionService = processEngine.getExecutionService();
		executionService.deleteProcessInstanceCascade("CreateSpecification." + spid);
		
		return this.listSpecification(mapping, form, request, response);
	}


	/**
	 * 验证规约的版本号不能重复action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/check_ok.jsp(ok)
     * 					/specification/check_error.jsp(error)
     * @exception       no
     */
	public ActionForward checkSpecificationVersion(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String version = request.getParameter("version");
		String spid = request.getParameter("spid");
		if(specificationService.findByVersion(version)==null && spid==null)
		{
			String temp = "该版本号可以使用！";
			request.setAttribute("value", temp);
			return mapping.findForward("check_ok");
		}
		else if(spid !=null && version.equals(specificationService.getById(spid).getVersion()))
				{
					String temp = "该版本号可以使用！";
					request.setAttribute("value", temp);
					return mapping.findForward("check_ok");
				}
			else{
					String temp = "该版本号已存在，不能使用！";
					request.setAttribute("value", temp);
					return mapping.findForward("check_error");
		}
	}
	/**
	 * 提交规约到审批中action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/check_ok.jsp(ok)
     * 					/specification/check_error.jsp(error)
     * @exception       no
     */
	public ActionForward tijiaoSpecification(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String spid=request.getParameter("Id");
		TaskService taskService = this.processEngine.getTaskService();
		List<Task> ta = taskService.createTaskQuery().processInstanceId("CreateSpecification."+spid).list();
		taskService.completeTask(ta.get(0).getId(), "提交");
		specificationService.getById(spid).setStatus(2);
		specificationService.modify(specificationService.getById(spid));
		
		return this.listSpecification(mapping, form, request, response);
	}

}
