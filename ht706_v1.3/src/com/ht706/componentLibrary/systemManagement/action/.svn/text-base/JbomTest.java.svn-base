package com.ht706.componentLibrary.systemManagement.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.jbpm.api.Deployment;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.ManagementService;
import org.jbpm.api.ProcessDefinition;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskService;
import org.jbpm.api.model.Activity;
import org.jbpm.api.model.ActivityCoordinates;
import org.jbpm.api.task.Task;
import org.jbpm.pvm.internal.model.ExecutionImpl;
import org.jbpm.pvm.internal.model.ProcessDefinitionImpl;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ht706.componentLibrary.systemManagement.action.TaskTemp;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bo.IOrganizationService;
import com.ht706.componentLibrary.systemManagement.bo.IWorkflowService;
import com.ht706.componentLibrary.systemManagement.bo.impl.WorkflowServiceImpl;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;
import com.ht706.componentLibrary.util.ReadXML;

/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */


public class JbomTest extends DispatchAction {
	 private ProcessEngine processEngine = null;
	 private ExecutionService executionService = null;
    private RepositoryService repositoryService = null;
    private TaskService taskService = null;
    private HistoryService historyService = null;
    private ManagementService managementService = null;
	private Session session;
	private SessionFactory sessionFactory;
    private IWorkflowService workflowService = null;
    private IOrganizationService organizationService = null;
    private ReadXML readXML = new ReadXML();
    
	public ActionForward Fabu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		repositoryService= processEngine.getRepositoryService();
		List xmlList = readXML.getFileName();
		
		for (Iterator iterator = xmlList.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			repositoryService.createDeployment().addResourceFromClasspath(str).deploy();
		}
		
		/*repositoryService.createDeployment().addResourceFromClasspath("workflow_CreateSpecification.jpdl.xml").deploy();
		repositoryService.createDeployment().addResourceFromClasspath("workflow_ProblemReport.jpdl.xml").deploy();
		repositoryService.createDeployment().addResourceFromClasspath("workflow_ReleaseComponent.jpdl.xml").deploy();
		repositoryService.createDeployment().addResourceFromClasspath("workflow_StandardFeedback.jpdl.xml").deploy();
		repositoryService.createDeployment().addResourceFromClasspath("workflow_UpdateSpecification.jpdl.xml").deploy();

		repositoryService.createDeployment().addResourceFromClasspath("workflow_ComponentCheckout.jpdl.xml").deploy();*/
		

		return this.Show(mapping, form, request, response);
		// TODO Auto-generated method stub		
	}
	public ActionForward ShowWorkFlow(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		executionService = processEngine.getExecutionService();
		List<ProcessInstance> pis = executionService.createProcessInstanceQuery().list();
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>> ();
		for(ProcessInstance ele : pis){
			
			ArrayList<String> l= new ArrayList<String>();
			
			
			l.add(ele.getId());
			String temp = (String) executionService.getVariable(ele.getId(), "description");
			l.add(temp);
			temp = (String) executionService.getVariable(ele.getId(), "owner");
			l.add(temp);
			list.add(l);
		}
		request.setAttribute("list", list);
		return mapping.findForward("list");
		// TODO Auto-generated method stub		
	}
	
	public ActionForward DeletePD(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name=request.getParameter("name");
		repositoryService= processEngine.getRepositoryService();
		repositoryService.deleteDeploymentCascade(name);
		return this.Show(mapping, form, request, response);
	}
	public ActionForward DeletePI(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name=request.getParameter("name");
		executionService = processEngine.getExecutionService();
		executionService.deleteProcessInstanceCascade(name);
		return this.Show(mapping, form, request, response);
	}

	public ActionForward View(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("id");
		
		repositoryService = processEngine.getRepositoryService();
		executionService = processEngine.getExecutionService();
		ProcessInstance processInstance = executionService.findProcessInstanceById(id);
		Set<String> activityNames = processInstance.findActiveActivityNames();
		
		ActivityCoordinates ac = repositoryService.getActivityCoordinates(processInstance.getProcessDefinitionId(),activityNames.iterator().next());
		request.setAttribute("ac", ac);
		request.setAttribute("id", id);
		ProcessDefinition processDefinition = repositoryService
		.createProcessDefinitionQuery().processDefinitionId(
				processInstance.getProcessDefinitionId()).uniqueResult();
		request.setAttribute("name", "img/jbpm_img/workflow_"+processDefinition.getKey()+".png");
		/*System.out.println("workflow_"+processDefinition.getKey()+".png");
		System.out.println(processDefinition.getKey());*/
		return mapping.findForward("view");
	}
	public ActionForward Start(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name=request.getParameter("name");
		System.out.println("name: " + name);
		executionService = processEngine.getExecutionService();
		Map map= new HashMap();
		map.put("owner", "22");
		map.put("cc", "b");
		map.put("flag", 3);

		executionService.startProcessInstanceById(name, map,"1S23");
		
		return this.Show(mapping, form, request, response);
	}
//	public ActionForward GO2(ActionMapping mapping, ActionForm form,
//			HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//		String name=request.getParameter("name");
//		String go=request.getParameter("go");
//		go= new String(go.getBytes("ISO-8859-1"),"gbk");
//		this.executionService=this.processEngine.getExecutionService();
//		this.taskService=this.processEngine.getTaskService();
//		List<Task> ta = this.taskService..createTaskQuery().processInstanceId(name).list();
//		this.taskService.completeTask(ta.get(0).getId(), go);
//		Transaction trans= session.beginTransaction();
//		taskService.getVariable(ta.getId(), "actionName");
//		String hql="update User user set user.age=20 where user.age=18";
//		Query queryupdate=session.createQuery(hql);
//		int ret=queryupdate.executeUpdate();
//		trans.commit();
//		
//		
//		
//
//		return this.Show(mapping, form, request, response);
//		
//	}
	
	public ActionForward Go(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name=request.getParameter("name");
		String go=request.getParameter("go");
		go= new String(go.getBytes("ISO-8859-1"),"gbk");
		executionService=this.processEngine.getExecutionService();
		this.taskService=this.processEngine.getTaskService();
		String EID=taskService.getTask(name).getExecutionId();
		
		try {
			this.taskService.completeTask(name, go);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if (processEngine.getExecutionService().findProcessInstanceById(EID) == null)
			return this.Show(mapping, form, request, response);
		session = this.sessionFactory.openSession();
		Transaction trans= session.beginTransaction();
		String table = (String) executionService.getVariable(EID, "table");
		
		String property = (String) executionService.getVariable(EID, "property");
		String UUID = (String) executionService.getVariable(EID, "UUID");
		String ID = (String) executionService.getVariable(EID, "id");
		
		List<Task> ts = taskService.createTaskQuery().processInstanceId(EID).list();
		if (ts != null && !ts.isEmpty())
		{
			String val="";
			for(Task t : ts)
			{
				val += (String) executionService.getVariable(EID,t.getActivityName() );
			}
			String hql = "";
			if (!val.equals(""))
			{
				hql = "update "+(char)(table.charAt(0)+'A'-'a')+table.substring(1)+" "+table+" set "+table+"."+property+"='"+val+"' where "+table+"."+UUID+"='"+ID+"'";
				System.out.println("hql:---->" + hql);
				Query queryupdate = session.createQuery(hql);
				int ret = queryupdate.executeUpdate();
			}
			
		
		}
		
		
		trans.commit();
		session.close();
		
		return this.Show(mapping, form, request, response);
	}
	
	public  ActionForward Show(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		repositoryService= processEngine.getRepositoryService();
		executionService = processEngine.getExecutionService();
		this.taskService = processEngine.getTaskService();
		//从OrganizationTask表中查找当前Task所对应的
		String name = (String)request.getSession().getAttribute("UserName");
		//System.out.println("--------->" + name);
		//List<Task> tasks =taskService.findPersonalTasks(name);
		List<ProcessDefinition> pds = repositoryService.createProcessDefinitionQuery().list();
		List<ProcessInstance> pis = executionService.createProcessInstanceQuery().list();
		
		List<TaskTemp> tts = new ArrayList<TaskTemp>();
		Organization o = (Organization) organizationService.listByUserName(name).get(0);
		System.out.println(o.getUserName());
		List taskNameList = workflowService.findDifferentTaskByUserId(o.getUserId());
		
		if (taskNameList != null && !taskNameList.isEmpty()) 
		{
			for (int i = 0; i < taskNameList.size(); i ++)
			{
				String taskName = (String) taskNameList.get(i);
				List<Task> tasks = taskService.findPersonalTasks(taskName);
				for(Task t : tasks)
				{
					TaskTemp temp = new TaskTemp();
					temp.setOwner((String) taskService.getVariable(t.getId(), "owner"));
					temp.setTask(t);
					temp.setOut(taskService.getOutcomes(t.getId()));
					temp.setId((String) taskService.getVariable(t.getId(), "id"));
					temp.setActionName((String) taskService.getVariable(t.getId(), "actionName") + temp.getId());	
					temp.setDescription((String) taskService.getVariable(t.getId(), "description"));
					tts.add(temp);
				}
			}
		}
		
		List<Task> myOwnTasks = taskService.findPersonalTasks(name);
		for(Task t : myOwnTasks)
		{
			TaskTemp temp = new TaskTemp();
			temp.setOwner((String) taskService.getVariable(t.getId(), "owner"));
			temp.setTask(t);
			temp.setOut(taskService.getOutcomes(t.getId()));
			temp.setId((String) taskService.getVariable(t.getId(), "id"));
			temp.setActionName((String) taskService.getVariable(t.getId(), "actionName") + temp.getId());	
			temp.setDescription((String) taskService.getVariable(t.getId(), "description"));
			System.out.println("des***************************" + temp.getDescription());
			tts.add(temp);
		}
		
		
		request.setAttribute("names", pds);
		request.setAttribute("pis", pis);
		request.setAttribute("tasks", tts);
		
		/*动态显示所有节点
		ProcessInstance processInstance = executionService.findProcessInstanceById(executionService.createProcessInstanceQuery().list().get(0).getId());
		//获得所有的activity
		ExecutionImpl executionimpl = (ExecutionImpl) processInstance; //Execution的实例
		ProcessDefinitionImpl  processDefinitionImpl = executionimpl.getProcessDefinition(); //ProcessDefinition的实例

		Map<String,Activity> mapActivity  = (Map<String, Activity>) processDefinitionImpl.getActivitiesMap(); //获得给流程下所有的activity

		for(String str : mapActivity.keySet()){
		       if(mapActivity.get(str).getType() == "task") { //判断节点类型
		          System.out.println(str);//该任务节点的名称
		        }
		} */
		return mapping.findForward("showJbpm");	
	}	
	
	
	
	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}
	public RepositoryService getRepositoryService() {
		return repositoryService;
	}

	public void setExecutionService(ExecutionService executionService) {
		this.executionService = executionService;
	}
	public ExecutionService getExecutionService() {
		return executionService;
	}
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
	public TaskService getTaskService() {
		return taskService;
	}
	public void setHistoryService(HistoryService historyService) {
		this.historyService = historyService;
	}
	public HistoryService getHistoryService() {
		return historyService;
	}
	public void setManagementService(ManagementService managementService) {
		this.managementService = managementService;
	}
	public ManagementService getManagementService() {
		return managementService;
	}
	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}
	public ProcessEngine getProcessEngine() {
		return processEngine;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public IWorkflowService getWorkflowService() {
		return workflowService;
	}
	public void setWorkflowService(IWorkflowService workflowService) {
		this.workflowService = workflowService;
	}
	public IOrganizationService getOrganizationService() {
		return organizationService;
	}
	public void setOrganizationService(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	
}

