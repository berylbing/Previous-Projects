package com.ht706.componentLibrary.systemManagement.bo;

import java.util.List;

import org.jbpm.api.ProcessEngine;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
/**
 * IOrganizationService½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */

public interface IOrganizationService {
	public void delete(int[] id);

	public List<Department> listAllDepartment();

	public Organization getById(Integer id);

	public List<Organization> searchOrganizationByDepartment(Integer id);

	public String getDepartmentName(Integer id);
	
	public void create(Organization transientInstance);

	public void modify(Organization transientInstance);
	
	public List listByName(String name);

	public List listByUserName(String name);
	

}
