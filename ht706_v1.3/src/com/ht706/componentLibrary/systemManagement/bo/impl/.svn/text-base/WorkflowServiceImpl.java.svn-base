package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.systemManagement.actionForm.OrganizationForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.OrganizationTask;
import com.ht706.componentLibrary.systemManagement.bo.IActorService;
import com.ht706.componentLibrary.systemManagement.bo.IWorkflowService;
import com.ht706.componentLibrary.systemManagement.dao.IActorDAO;
import com.ht706.componentLibrary.systemManagement.dao.IDepartmentDAO;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationTaskDAO;
import com.ht706.componentLibrary.systemManagement.dao.IUserToActorDAO;
/**
 * 
 * @Document:
 * @author: zhudz
 * @Time: 2010-10-12
 *
 */
public class WorkflowServiceImpl implements IWorkflowService {
	private IOrganizationTaskDAO organizationTaskDAO;
	private IOrganizationDAO organizationDAO;
	private IDepartmentDAO departmentDAO;
	public IOrganizationTaskDAO getOrganizationTaskDAO() {
		return organizationTaskDAO;
	}

	public void setOrganizationTaskDAO(IOrganizationTaskDAO organizationTaskDAO) {
		this.organizationTaskDAO = organizationTaskDAO;
	}
	
	

	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}

	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}
	
	public IDepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}

	public void setDepartmentDAO(IDepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	/**
	 * 根据task得到对应的责任人列表
	 */
	public List<OrganizationForm> findOrganizationByTask(String taskName) {
		List<OrganizationForm> organization = new ArrayList<OrganizationForm>();
		List list = organizationTaskDAO.findByProperty("expression", taskName);
		System.out.println(list.size());
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			OrganizationTask task = (OrganizationTask) iterator.next();
			Integer userId = task.getUserId();
			System.out.println(userId);
			Organization o = organizationDAO.findById(userId);
			OrganizationForm form = new OrganizationForm();
			form.setOrganization(o);
			System.out.println(form.getOrganization().getName());
			organization.add(form);
		}
		System.out.println("organization-->" + organization.size());
		return organization;
	}

	public void create(OrganizationTask ot) {
		this.organizationTaskDAO.save(ot);
	}

	public void delete(String task, int[] id) {
		OrganizationTask ot;
		for(int i =  0 ; i < id.length ; i ++){
			System.out.println(task);
			System.out.println(id[i]);
			OrganizationTask o = (OrganizationTask) this.findOrganizationByTaskAndUserId(task, id[i]).get(0);
			System.out.println("id:" + id[i]);
			organizationTaskDAO.delete(o);
		}
	}

	public List findOrganizationByTaskAndUserId(String task, Integer userId) {
		OrganizationTask instance = new OrganizationTask();
		instance.setExpression(task);
		instance.setUserId(userId);
		return organizationTaskDAO.findByExample(instance);
	}

	public List findDifferentTaskByUserId(Integer userId) {
		List taskList = organizationTaskDAO.findDifferentTaskByUserId(userId);
		System.out.println(taskList.size());
		
		/*List taskList = organizationTaskDAO.findByUserId(userId);
		Map map = new HashMap();
		for (Iterator iterator = taskList.iterator(); iterator.hasNext();) {
			OrganizationTask ot = (OrganizationTask) iterator.next();
			map.put(ot.getExpression(), ot.getUserId());
		}
		taskList = null;
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String key = (String) entry.getKey();
			taskList.add(key);
		}   */
		return taskList;
	}
	
	
	
	
}
