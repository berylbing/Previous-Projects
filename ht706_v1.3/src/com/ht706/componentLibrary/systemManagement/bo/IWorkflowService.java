package com.ht706.componentLibrary.systemManagement.bo;

import java.util.List;
import java.util.Set;

import com.ht706.componentLibrary.systemManagement.actionForm.OrganizationForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.OrganizationTask;
/**
 * IWorkService½Ó¿Ú
 * 
 * @author: zhudz
 * @Time: 2010-10-12
 */
public interface IWorkflowService {
	
	public List<OrganizationForm> findOrganizationByTask(String taskName);
	public void create(final OrganizationTask ot);
	public void delete(String task, int[] id);
	public List findOrganizationByTaskAndUserId(String task, Integer userId);
	public List findDifferentTaskByUserId(Integer userId);
}
