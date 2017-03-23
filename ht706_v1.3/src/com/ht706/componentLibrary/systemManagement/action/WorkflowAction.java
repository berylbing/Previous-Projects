package com.ht706.componentLibrary.systemManagement.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.systemManagement.actionForm.ActorForm;
import com.ht706.componentLibrary.systemManagement.actionForm.OrganizationForm;
import com.ht706.componentLibrary.systemManagement.actionForm.OrganizationTaskForm;
import com.ht706.componentLibrary.systemManagement.actionForm.TaskNameForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.OrganizationTask;
import com.ht706.componentLibrary.systemManagement.bo.IActorService;
import com.ht706.componentLibrary.systemManagement.bo.IOrganizationService;
import com.ht706.componentLibrary.systemManagement.bo.IWorkflowService;
import com.ht706.componentLibrary.util.ReadXML;


/**
 * 
 * @Document:
 * @author: zhudz
 * @Time: 2010-08-31 
 *
 */


public class WorkflowAction extends DispatchAction {
	
	private IWorkflowService workflowService;
	private IOrganizationService organizationService;
	private ReadXML readXML = null;
	private List xmlList = null;

	public IWorkflowService getWorkflowService() {
		return workflowService;
	}



	public IOrganizationService getOrganizationService() {
		return organizationService;
	}



	public void setOrganizationService(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}



	public void setWorkflowService(IWorkflowService workflowService) {
		this.workflowService = workflowService;
	}



	/**
	 * 从所有jpdl.xml文件中得到task名称
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<TaskNameForm> taskList = new ArrayList();
		readXML = new ReadXML();
		xmlList = this.getXMLList();
		for (int i = 0; i < xmlList.size(); i ++)
		{
			String xml = (String) xmlList.get(i);
			TaskNameForm tnf = new TaskNameForm();
			tnf.setDescription(readXML.getTaskDescription(readXML.getPath() + xml));
			tnf.setTaskList(readXML.getAllTaskName(readXML.getPath() + xml));
			tnf.setXml(xml);
			taskList.add(tnf);
		}
		
		request.setAttribute("taskList", taskList);
		return mapping.findForward("taskMap");		
	}	
	
	/**
	 * 列出了当前taskName与organization的对应关系
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward preOrganizationTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String task = new String(request.getParameter("task").getBytes("iso-8859-1"),"gbk");
	//	System.out.println(task);
		String xml = request.getParameter("xml");
	//	System.out.println(xml);
		List<OrganizationForm> organizationList = workflowService.findOrganizationByTask(task);
		List taskList = new ArrayList();
		taskList.addAll(readXML.getAllTaskName(readXML.getPath() + xml));
		System.out.println(taskList.size());
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("task", task);
		request.setAttribute("taskList", taskList);
		request.setAttribute("xml", xml);
		
		return mapping.findForward("listOrganizationTask");		
	}
	
	/**
	 * 创建organization与Task的对应关系
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward createOrganizationTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String task = new String(request.getParameter("task").getBytes("iso-8859-1"),"gbk");
		System.out.println("create " + task);
		Integer userId = Integer.parseInt(request.getParameter("Id"));
	//	System.out.println(userId);
		List temp = workflowService.findOrganizationByTaskAndUserId(task, userId);
		if (temp != null && !temp.isEmpty() && temp.size() != 0)
		{
			log.debug("createOrganizationTask():添加了重复的记录。省略");
		}
		else
		{
			OrganizationTask ot = new OrganizationTask();
			ot.setUserId(userId);
			ot.setExpression(task);
			workflowService.create(ot);
		}
		String xml = request.getParameter("xml");
		List<OrganizationForm> organizationList = workflowService.findOrganizationByTask(task);
		List taskList = new ArrayList();
		taskList.addAll(readXML.getAllTaskName(readXML.getPath() + xml));
		System.out.println(taskList);
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("task", task);
		request.setAttribute("taskList", taskList);
		request.setAttribute("xml", xml);
		
		return mapping.findForward("listOrganizationTask");		
	}
	
	/**
	 * 创建多个organization与Task的对应关系
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward multiCreateOrganizationTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		OrganizationTaskForm af = (OrganizationTaskForm) form;
		String task = af.getTaskName();
	//	System.out.println("////////////////////////////////////////create " + task);
		int[] array = af.getSelectedOrganization();
		for (int i = 0; i < array.length; i ++)
		{
			Integer userId = array[i];
	//		System.out.println(userId);
			List temp = workflowService.findOrganizationByTaskAndUserId(task, userId);
			if (temp != null && !temp.isEmpty() && temp.size() != 0)
			{
				log.debug("createOrganizationTask():添加了重复的记录。省略");
			}
			else
			{
				OrganizationTask ot = new OrganizationTask();
				ot.setUserId(userId);
				ot.setExpression(task);
				workflowService.create(ot);
			}
		}
		
		String xml = af.getXml();
	//	System.out.println("////////////////////////////////////////xml " + xml);
		
		List<OrganizationForm> organizationList = workflowService.findOrganizationByTask(task);
		List taskList = new ArrayList();
		taskList.addAll(readXML.getAllTaskName(readXML.getPath() + xml));
		System.out.println(taskList);
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("task", task);
		request.setAttribute("taskList", taskList);
		request.setAttribute("xml", xml);
		
		response.getOutputStream().print("<script>window.returnValue='true';window.close();</script>");

		//return mapping.findForward("listOrganizationTask");		
		return null;
	}
	
	public ActionForward deleteOrganizationTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		OrganizationTaskForm af = (OrganizationTaskForm)form;
		String task = af.getTaskName();
		/*System.out.println("id--->" + af.getSelectedOrganization()[0]);
		System.out.println("task: " + task);*/
		workflowService.delete(task, af.getSelectedOrganization());
		
		String xml = request.getParameter("xml");
		List<OrganizationForm> organizationList = workflowService.findOrganizationByTask(task);
		List taskList = new ArrayList();
		taskList.addAll(readXML.getAllTaskName(readXML.getPath() + xml));
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("task", task);
		request.setAttribute("taskList", taskList);
		request.setAttribute("xml", xml);
		
		return mapping.findForward("listOrganizationTask");		
	}
	
	/**
	 * 从jbpmFileName中读取工作流相关的配置文件名字
	 * @return 
	 */
	public List getXMLList()
	{
		if (this.xmlList != null && xmlList.size() != 0)
			return xmlList;
		else
		{
			return this.readXML.getFileName();
		}
	}
}
