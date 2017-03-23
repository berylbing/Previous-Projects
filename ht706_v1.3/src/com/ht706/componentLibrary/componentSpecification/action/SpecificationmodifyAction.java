/**
 * Copyright (c) 2010, 
 * 
 * @FileName: SpecificationmodifyAction.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.action
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.action;

import java.sql.Date;
import java.text.SimpleDateFormat;
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

import com.ht706.componentLibrary.componentSpecification.actionForm.SpecificationmodifyForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationmodifyService;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.systemManagement.bo.IOrganizationService;
import com.ht706.componentLibrary.util.UUIDKey;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class SpecificationmodifyAction extends DispatchAction {
	private ISpecificationmodifyService  specificationmodifyService;
	private ISpecificationService specificationService;
	private IOrganizationService organizationService;
	private IMyfavoriteService myfavoriteService;
	
	public IMyfavoriteService getMyfavoriteService() {
		return myfavoriteService;
	}
	public void setMyfavoriteService(IMyfavoriteService myfavoriteService) {
		this.myfavoriteService = myfavoriteService;
	}
	public IOrganizationService getOrganizationService() {
		return organizationService;
	}
	public void setOrganizationService(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	public ISpecificationService getSpecificationService() {
		return specificationService;
	}
	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	private ProcessEngine processEngine;
	
	
	public ProcessEngine getProcessEngine() {
		return processEngine;
	}
	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}
	public ISpecificationmodifyService getSpecificationmodifyService() {
		return specificationmodifyService;
	}
	public void setSpecificationmodifyService(
			ISpecificationmodifyService specificationmodifyService) {
		this.specificationmodifyService = specificationmodifyService;
	}

	/**
	 * ���������� ����δ��ʹ�õĵı������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/selectReason.jsp
     * @exception       no
     */
	public ActionForward searchSpecificationmodify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Specificationmodify> spmlist = specificationmodifyService.listApproval();
		List<Specificationmodify> splist = specificationService.listmodify();
		spmlist.removeAll(splist);
		for(Specificationmodify item :spmlist)
		{
			item.setReason(organizationService.getById(item.getApplicant()).getUserName()) ;
		}
		request.setAttribute("specificationmodifyList", spmlist);
		
		return mapping.findForward("listApproval");
	}
	/**
	 * ���ұ������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/selectReason.jsp
     * @exception       no
     */
	public ActionForward listSpecificationmodify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Specificationmodify> spmlist = specificationmodifyService.listAll();
		for(Specificationmodify item :spmlist)
		{
			item.setReason(organizationService.getById(item.getApplicant()).getUserName()) ;
		}
		request.setAttribute("specificationmodifyList", spmlist);
		String select = request.getParameter("select");
		if(select.equals("edit"))
			return mapping.findForward("listspecmodify2");
		else if(select.equals("search"))
			return mapping.findForward("listspecmodify");
		return null;
	}

	/**
	 * �����������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/specificationmodifyInfo.jsp
     * @exception       no
     */
	public ActionForward SpecificationmodifyInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("Id");
		Specificationmodify spm = specificationmodifyService.findById(id);
		request.setAttribute("specification", spm);
		return mapping.findForward("specmodifyInfo");
		
	}
	
	/**
	 * �½�������뵥action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/specificationModifyInfo_2.jsp
     * @exception       no
     */
	public ActionForward createSpecificationmodify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SpecificationmodifyForm smf = (SpecificationmodifyForm)form;
		Specificationmodify specmodify = smf.getSpecification();
		UUIDKey uuids = UUIDKey.getInstance();
		specmodify.setId(uuids.getNewUUID());

		//�����޸���
		int selects = 0;
		selects = smf.getGuanxi()+smf.getShuyu()+smf.getTongyi();
		System.out.println("select="+selects);
		specmodify.setSelectedItem(selects);
		//specmodify.setDateOfInformation(smf.getSpecification().getDateOfInformation());
		specmodify.setStatus("�ݸ�");
		specmodify.setDateOfInformation(Date.valueOf(smf.getCreatetime()));
		specificationmodifyService.create(specmodify);
		
		List<Specificationmodify> spmlist = specificationmodifyService.listAll();
		request.setAttribute("specificationmodifyList", spmlist);
		
		
		//jbpm
		ExecutionService executionService = processEngine.getExecutionService();
		Map<String , Object > map= new HashMap<String,Object>();
		String username = (String) request.getSession().getAttribute("UserName");
		map.put("owner",  username );
		map.put("id", specmodify.getId());
		
		map.put("actionName", "specification/SpecificationmodifyAction.do?method=SpecificationmodifyInfo&Id=");
		map.put("table", "specificationmodify");
		
		map.put("property", "status");
		map.put("UUID", "id");
		
		map.put("��Լ������뵥�ݸ�","�ݸ�");
		map.put("���","���");
		map.put("����Ա���","����Ա���");
		map.put("����׼","������");
		map.put("description", "��Լ���������");
		executionService.startProcessInstanceByKey("UpdateSpecification", map, specmodify.getId());
		
		/*	�˴���Ҫ��myFavoriate�����˼�¼		*/
		Myfavorite my = new Myfavorite();
		my.setRecordId(specmodify.getId());
		System.out.println("specmodify.getId()"+specmodify.getId());
//		my.setAssetUniqueId();
//		my.setAssetName(as.getName());
		my.setDateOfInformation(specmodify.getDateOfInformation());
		my.setParentNode("-2");
		my.setTypeIs("specificationmodify");
		my.setUrl("localhost");
		my.setUserId((String)request.getSession().getAttribute("UserName"));
		myfavoriteService.create(my);
		return mapping.findForward("listspecmodify2");
	}
	
	/**
	 * ɾ��������뵥action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/specificationModifyInfo_2.jsp
     * @exception       no
     */
	public ActionForward deleteSpecificationmodify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("Id");
		Specificationmodify spm = specificationmodifyService.findById(id);
		specificationmodifyService.delete(spm);
		List<Specificationmodify> spmlist = specificationmodifyService.listAll();
		request.setAttribute("specificationmodifyList", spmlist);
			
		//ɾ����Ӧ�Ĺ�����
		ExecutionService executionService = processEngine.getExecutionService();
		executionService.deleteProcessInstanceCascade("UpdateSpecification." + id);
		//ɾ���ҵ��ղؼ�¼
		myfavoriteService.delete(id);
		return mapping.findForward("listspecmodify2");
	}
	
	/**
	 * ��ʼ���޸ı�����뵥action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifySpecification.jsp
     * @exception       no
     */
	public ActionForward preModifySpecificationmodify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("Id");
		Specificationmodify spm = specificationmodifyService.findById(id);
		request.setAttribute("applicant", organizationService.getById(spm.getApplicant()).getName());
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(spm.getDateOfInformation());
		request.setAttribute("createtime", date);
		request.setAttribute("reasonBy", organizationService.getById(spm.getReasonBy()).getName());
		request.setAttribute("schemeBy", organizationService.getById(spm.getSchemeBy()).getName());
		request.setAttribute("attitudeBy", organizationService.getById(spm.getAttitudeBy()).getName());
		request.setAttribute("specification", spm);
		return mapping.findForward("modifyspecmodify");
		
	}
	
	/**
	 * �޸ı�����뵥action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/specificationModifyInfo_2.jsp
     * @exception       no
     */
	public ActionForward modifySpecificationmodify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SpecificationmodifyForm smf = (SpecificationmodifyForm)form;
//		Specificationmodify specmodify = specificationmodifyService.findById(smf.getSpecification().getId());
//		specmodify.setAttitude(smf.getSpecification().getAttitude());
//		specmodify.setReason(smf.getSpecification().getReason());
//		specmodify.setScheme(smf.getSpecification().getScheme());
//		specmodify.setRegistryId(smf.getSpecification().getRegistryId());
//		specmodify.setSelectedItem(smf.getSpecification().getSelectedItem());
		Specificationmodify specmodify = smf.getSpecification();
		specmodify.setDateOfInformation(Date.valueOf(smf.getCreatetime()));
		//�����޸���
		int selects = 0;
		selects = smf.getGuanxi()+smf.getShuyu()+smf.getTongyi();
		System.out.println("select="+selects);
		specmodify.setSelectedItem(selects);
		specificationmodifyService.modify(specmodify);
		System.out.println(smf.getSpecification().getAttitudeBy());
		List<Specificationmodify> spmlist = specificationmodifyService.listAll();
		request.setAttribute("specificationmodifyList", spmlist);
		return mapping.findForward("listspecmodify2");
	}
	
	/**
	 * ��֤��Լ�ĵǼǺŲ����ظ�action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/check_ok.jsp(ok)
     * 					/specification/check_error.jsp(error)
     * @exception       no
     */
	public ActionForward checkSpecificationmodifyVersion(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String rid = request.getParameter("rid");
		String spmid = request.getParameter("spmid");
		String rids = rid+" ";
		
		if(rids.split(",").length>1)
		{
			String temp = "�õǼǺ��в��ܰ���','";
			request.setAttribute("value", temp);
			return mapping.findForward("check_error");
		}
		if(specificationmodifyService.findByRegistryId(rid).isEmpty() && spmid==null)
		{
			String temp = "�õǼǺſ���ʹ�ã�";
			request.setAttribute("value", temp);
			return mapping.findForward("check_ok");
		}
		else if(spmid !=null && rid.equals(specificationmodifyService.findById(spmid).getRegistryId()))
				{
					String temp = "�õǼǺſ���ʹ�ã�";
					request.setAttribute("value", temp);
					return mapping.findForward("check_ok");
				}
			else{
					String temp = "�õǼǺ��Ѵ��ڣ�����ʹ�ã�";
					request.setAttribute("value", temp);
					return mapping.findForward("check_error");
				}
	}
	/**
	 * �ύ��Լ���뵥��������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/check_ok.jsp(ok)
     * 					/specification/check_error.jsp(error)
     * @exception       no
     */
	public ActionForward tijiaoSpecificationm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String spmid=request.getParameter("Id");

		specificationmodifyService.findById(spmid).setStatus("���");
		specificationmodifyService.modify(specificationmodifyService.findById(spmid));
		
		List<Specificationmodify> spmlist = specificationmodifyService.listAll();
		for(Specificationmodify item :spmlist)
		{
			item.setReason(organizationService.getById(item.getApplicant()).getUserName()) ;
		}
		request.setAttribute("specificationmodifyList", spmlist);
		TaskService taskService = this.processEngine.getTaskService();
		List<Task> ta = taskService.createTaskQuery().processInstanceId("UpdateSpecification."+spmid).list();
		taskService.completeTask(ta.get(0).getId(), "�ύ");
		
			return mapping.findForward("listspecmodify2");

	}


}
