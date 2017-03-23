package com.ht706.componentLibrary.componentRelease.action;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.TaskService;
import org.jbpm.api.task.Task;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentRelease.actionForm.ComponentForm;
import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation;
import com.ht706.componentLibrary.componentRelease.bo.IComponentElementService;
import com.ht706.componentLibrary.componentRelease.bo.IComponentService;
import com.ht706.componentLibrary.componentSearch.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.util.UUIDKey;


public class ComponentManagementAction extends DispatchAction {
	
	/**
	 * 列出构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward showComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		
		ComponentListForm f=new ComponentListForm();
		String name=(String)request.getSession().getAttribute("UserName");
		f.setComponentList(service.showComponentService(name));
		request.setAttribute("ComponentListForm", f);
		return mapping.findForward("suc");
	}
	
	/**
	 * 删除构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward deleteComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String index=(String)request.getParameter("ID");
		//String i=(String)request.getAttribute("ID");
		service.deleteComponentService(index);
		//删除相应的工作流
		ExecutionService executionService = processEngine.getExecutionService();
		executionService.deleteProcessInstanceCascade("ReleaseComponent." + index);
		return mapping.findForward("back");
	}
	
	
	/**
	 * 新建构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward creatComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String update=(String)request.getParameter("update");
		ComponentForm f=(ComponentForm)form;
		Asset a=f.getAsset();
		SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
		if(f.getVersionDate()!=null && !f.getVersionDate().equals(""))a.setVersionDate(formate.parse(f.getVersionDate()));
		if(f.getDateOfInformation()!=null && !f.getDateOfInformation().equals(""))a.setDateOfInformation(formate.parse(f.getDateOfInformation()));
		if(f.getAcceptanceDate()!=null && !f.getAcceptanceDate().equals(""))a.setAcceptanceDate(formate.parse(f.getAcceptanceDate()));
		a.setApprovedState("已提交");
		
		f.getCosteffect().setDateOfInformation(new Date());
		f.getRecommendation().setDateOfInformation(new Date().toString());
		a.getRecommendations().add(f.getRecommendation());
		a.getCosteffects().add(f.getCosteffect());
		f.getRecommendation().setAsset(a);
		f.getCosteffect().setAsset(a);
		a.setProvider((String)request.getSession().getAttribute("UserName"));
		
		String facets[]=f.getSelected();   //save facet
		if(facets!=null && facets.length>0){
			String facet=new String();
			for(String i:facets){
				facet+=(i+",");	
			}
			a.setClassificationMachanism(facet);
		}
		UUIDKey key=UUIDKey.getInstance();
		if(update!=null && update.equals("true")) service.editComponentService(a);
		else {
			Ismadeof is;
			for(Element e:f.getElements()){
				//System.out.println("-------------------------------Update Asset action");
				e.setElementUniqueId(key.getNewUUID());
				e.setCertificationState(1);
				is=new Ismadeof();
				is.setAsset(a);
				is.setElement(e);
				a.getIsmadeofs().add(is);
			}
			
			a.setUniqueId(key.getNewUUID());
			//System.out.println("-------------------------------creat Asset action");
			service.creatComponentService(a);	
			request.getSession().setAttribute("ComponentForm", null);

		}
		Componentrelation r;
		String relations[];	
		if(f.getRelatedAsset()!=null){
			for(String i:f.getRelatedAsset()){
				r=new Componentrelation();
				r.setSourceAsset(a.getUniqueId());
				relations=i.split(",");
				System.out.println("................................"+i);
				r.setTargetAsset(relations[0]);
				r.setRelationType(relations[1]);
				service.creatComponentRelation(r);
			}
		}
		//jbpm
		//直接create，没有设置草稿的步骤
		ExecutionService executionService = processEngine.getExecutionService();
		TaskService taskService = this.processEngine.getTaskService();
		String EEID = "ReleaseComponent." + a.getUniqueId();
		
		Map<String , Object > map= new HashMap<String,Object>();
		String username = (String) request.getSession().getAttribute("UserName");
		map.put("owner",  username);
		map.put("id", a.getUniqueId());
		map.put("actionName", "componentRelease/ComponentList.do?method=viewComponentAction&ID=");
		
		map.put("table", "asset");
		map.put("property", "approvedState");
		map.put("UUID", "uniqueId");
		
		map.put("构件草稿","草稿");
		map.put("审核","已提交");
		map.put("入库","已批准");
		map.put("flag", null);
		map.put("description", "构件发布(入库)工作流");
		executionService.startProcessInstanceByKey("ReleaseComponent", map, a.getUniqueId());
		List<Task> ta = taskService.createTaskQuery().processInstanceId(EEID).list();
		taskService.completeTask(ta.get(0).getId(), "提交");
		
		return mapping.findForward("back");
	}
	
	
	/**
	 * 保存构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward saveComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String update=(String)request.getParameter("update");
		ComponentForm f=(ComponentForm)form;
		Asset a=f.getAsset();
		SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
		if(f.getVersionDate()!=null && !f.getVersionDate().equals(""))a.setVersionDate(formate.parse(f.getVersionDate()));
		if(f.getDateOfInformation()!=null && !f.getDateOfInformation().equals(""))a.setDateOfInformation(formate.parse(f.getDateOfInformation()));
		if(f.getAcceptanceDate()!=null && !f.getAcceptanceDate().equals(""))a.setAcceptanceDate(formate.parse(f.getAcceptanceDate()));
		a.setApprovedState("草稿");
		
		f.getRecommendation().setDateOfInformation(new Date().toString());
		f.getCosteffect().setDateOfInformation(new Date());
		a.getRecommendations().add(f.getRecommendation());
		a.getCosteffects().add(f.getCosteffect());
		f.getRecommendation().setAsset(a);
		f.getCosteffect().setAsset(a);
		a.setProvider((String)request.getSession().getAttribute("UserName"));
		
		String facets[]=f.getSelected();   //save facet
		if(facets!=null && facets.length>0){
			String facet=new String();
			for(String i:facets){
				facet+=(i+",");	
			}
			a.setClassificationMachanism(facet);
		}
		UUIDKey key=UUIDKey.getInstance();
		if(update!=null && update.equals("true")) service.editComponentService(a);
		else {
			Ismadeof is;
			for(Element e:f.getElements()){
				e.setElementUniqueId(key.getNewUUID());
				e.setCertificationState(1);
				is=new Ismadeof();
				is.setAsset(a);
				is.setElement(e);
				a.getIsmadeofs().add(is);
			}
			
			a.setUniqueId(key.getNewUUID());
			service.creatComponentService(a);	
			request.getSession().removeAttribute("ComponentForm");

		}
		Componentrelation r;
		String relations[];
		if(f.getRelatedAsset()!=null){
			for(String i:f.getRelatedAsset()){
				r=new Componentrelation();
				r.setSourceAsset(a.getUniqueId());
				relations=i.split(",");
				System.out.println("................................"+i);
				r.setTargetAsset(relations[0]);
				r.setRelationType(relations[1]);
				service.creatComponentRelation(r);
			}
		}
		//jbpm
		//a=service.ViewComponentService(a.getUniqueId());
		//System.out.println("................................feedback:"+a.getFeedbacks());
		if(update!=null && update.equals("true")) {
//			Iterator<Feedback> it=a.getFeedbacks().iterator();
//			if(it.hasNext()) {
//				
//				Feedback b=(Feedback)it.next();
//				System.out.println("...............................you dong xi :"+b.getRecordId());
//				request.setAttribute("recordId", b.getRecordId());
//				return mapping.findForward("to_edit_feedback");
//			}
		//	else 
				return mapping.findForward("back");
		}
		else{
			ExecutionService executionService = processEngine.getExecutionService();
			Map<String , Object > map= new HashMap<String,Object>();
			String username = (String) request.getSession().getAttribute("UserName");
			map.put("owner",  username);
			map.put("id", a.getUniqueId());
			map.put("actionName", "componentRelease/ComponentList.do?method=viewComponentAction&ID=");
			map.put("table", "asset");
			map.put("property", "approvedState");
			map.put("UUID", "uniqueId");
			map.put("servicePath", request.getRealPath("/"));
			map.put("构件草稿","草稿");
			map.put("审核","已提交");
			map.put("入库","已批准");
			map.put("flag", null);
			map.put("description", "构件发布(入库)工作流");
			executionService.startProcessInstanceByKey("ReleaseComponent", map, a.getUniqueId());
			request.setAttribute("AssetUUID", a.getUniqueId());
			request.setAttribute("createAsset", "true");
			return mapping.findForward("to_creat_feedback");
		}

	}
	
	
	/**
	 * 编辑构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward editComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String id=(String)request.getParameter("ID");
		ComponentForm f=new ComponentForm();
		f.reset(mapping, request);
		Asset a=service.ViewComponentService(id);
		
		int size=a.getRecommendations().size();
		Recommendation recommendation;
		Costeffect costeffect;
		if(size>0)recommendation=(Recommendation) ((a.getRecommendations().toArray())[0]);
		else recommendation=new Recommendation();
		size=a.getCosteffects().size();
		if(size>0)costeffect=(Costeffect)((a.getCosteffects().toArray())[0]);
		else costeffect=new Costeffect();
		f.setRecommendation(recommendation);
		f.setCosteffect(costeffect);
		f.setAsset(a);
		f.setElements(elementService.searchComponentElementService(id));
		f.setDateOfInformation(a.getDateOfInformation().toString());
		f.setVersionDate(a.getVersionDate().toString());
		f.setAcceptanceDate(a.getAcceptanceDate().toString());
		
		f.setFacetList(facetService.showFacetList());
		//read facet 
		if(a.getClassificationMachanism()!=null && a.getClassificationMachanism().length()>0){
			String facets[]=a.getClassificationMachanism().split(",");
			if(facets!=null && facets.length>0){
				f.setSelected(facets);
			}
		}

		f.setRelationTypes(specificationService.findcurRelationtype());
		
		f.setRelated_Assets(service.searchRelatedAsset(id));
		
		request.setAttribute("ComponentForm", f);
		request.getSession().setAttribute("ComponentForm", f);
		return mapping.findForward("editComponent");
//		return mapping.findForward("suc");
	}
	
	
	/**
	 * 提交构件构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward submitComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		
		String i=(String)request.getParameter("ID");
		service.submitComponentService(i);
		//工作流进行下一个Task
		TaskService taskService = this.processEngine.getTaskService();
		List<Task> ta = taskService.createTaskQuery().processInstanceId("ReleaseComponent." + i).list();
		taskService.completeTask(ta.get(0).getId(), "提交");
		
		return mapping.findForward("back");
	}
	
	
	/**
	 * 查看一个构件
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward viewComponentAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String id=(String)request.getParameter("ID");
		ComponentForm f=new ComponentForm();
		Asset a=service.ViewComponentService(id);
		f.setAsset(a);
		f.setElements(elementService.searchComponentElementService(id));
		
		int size=a.getRecommendations().size();
		Recommendation recommendation;
		Costeffect costeffect;
		if(size>0)recommendation=(Recommendation) ((a.getRecommendations().toArray())[0]);
		else recommendation=new Recommendation();
		size=a.getCosteffects().size();
		if(size>0)costeffect=(Costeffect)((a.getCosteffects().toArray())[0]);
		else costeffect=new Costeffect();
		f.setRecommendation(recommendation);
		f.setCosteffect(costeffect);
		
		f.setFacetList(facetService.showFacetList());
		if(f.getAsset().getClassificationMachanism()!=null && f.getAsset().getClassificationMachanism().length()>0){
			String facets[]=f.getAsset().getClassificationMachanism().split(",");
			if(facets!=null && facets.length>0){
				f.setSelected(facets);
			}
		}
		request.setAttribute("ComponentForm", f);
		
		f.setRelationTypes(specificationService.findcurRelationtype());
		
		f.setRelated_Assets(service.searchRelatedAsset(id));
		
		return mapping.findForward("viewComponent");
	}
	/**
	 * 为新建构件提供刻面树和定义好的构件关系
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */ 
	public ActionForward preFacetTree(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		
		ComponentForm f=new ComponentForm();
		f.reset(mapping, request);
		f.setFacetList(facetService.showFacetList());
		f.setRelationTypes(specificationService.findcurRelationtype());
		
		
		request.setAttribute("ComponentForm", f);
		request.getSession().setAttribute("ComponentForm", f);
		return mapping.findForward("release3");
//		return mapping.findForward("suc");
	}
	
	public ActionForward deleteComponentRelationAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String assetid=request.getParameter("assetId");
		String str=request.getParameter("RassetId");
		String rassets[]=str.split(",");
		PrintWriter out = response.getWriter();
		if(service.deleteRelation(assetid, rassets)>-1)out.print("ok");
		else out.print("error");
		
		return null;
	}
	
	
	
	
//	public ActionForward creatRelations(ActionMapping mapping, ActionForm form,
//			HttpServletRequest request, HttpServletResponse response)
//	throws Exception{
//		String str=request.getParameter("assetId");
//		ComponentListForm f=(ComponentListForm)form;
//		Componentrelation r;
//		for(String i:f.getSelectedAsset()){
//			r=new Componentrelation();
//			r.setSourceAsset(str);
//			r.setTargetAsset(i);
//			r.setRelationType(relationType)
//		}
//		return null;
////		return mapping.findForward("suc");
//	}
	
	
	
//	public ActionForward beforeCreatComponent(ActionMapping mapping, ActionForm form,
//			HttpServletRequest request, HttpServletResponse response)throws Exception{
//		ComponentForm f=(ComponentForm)request.getSession().getAttribute("ComponentForm");
//		if(f!=null){
//			f.getElements().clear();
//			f.setAsset(new Asset());
//			
//		}
//		return mapping.findForward("gotorelease3");
//	}
	private IComponentService service;
	private IComponentElementService elementService;
	private IFacetService facetService;
	private ISpecificationService specificationService;
	private ProcessEngine processEngine;
	public IComponentService getService() {
		return service;
	}
	public void setService(IComponentService service) {
		this.service = service;
	}

	public void setElementService(IComponentElementService elementService) {
		this.elementService = elementService;
	}

	public IComponentElementService getElementService() {
		return elementService;
	}

	public void setFacetService(IFacetService facetService) {
		this.facetService = facetService;
	}

	public IFacetService getFacetService() {
		return facetService;
	}

	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	public ISpecificationService getSpecificationService() {
		return specificationService;
	}
		public ProcessEngine getProcessEngine() {
		return processEngine;
	}

	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}

}
