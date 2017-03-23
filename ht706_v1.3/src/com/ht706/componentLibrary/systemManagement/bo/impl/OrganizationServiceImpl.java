package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bo.IOrganizationService;

import com.ht706.componentLibrary.systemManagement.dao.IDepartmentDAO;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;
import com.ht706.componentLibrary.systemManagement.dao.impl.DepartmentDAOImpl;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class OrganizationServiceImpl implements IOrganizationService {
	private IOrganizationDAO organizationDAO;
	private IDepartmentDAO departmentDAO;



	public List<Department> listAllDepartment() {
		// TODO Auto-generated method stub
		return departmentDAO.findAll();
	}

	public Organization getById(Integer id) {
		// TODO Auto-generated method stub
		return organizationDAO.findById(id);
	}

	public List<Organization> searchOrganizationByDepartment(Integer id) {
		// TODO Auto-generated method stub
		return organizationDAO.findByDepartmentId(id);
	}

	public void create(final Organization transientInstance) {
		
							organizationDAO.save(transientInstance);
						
	}

	public void modify(final Organization transientInstance) {
		
							organizationDAO.update(transientInstance);
						

	}

	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}

	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}

	public IDepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}

	public void setDepartmentDAO(IDepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}



	public String getDepartmentName(Integer id) {
		// TODO Auto-generated method stub
		return this.departmentDAO.findById(id).getName();
	}

	public void delete(final int[] id) {
		// TODO Auto-generated method stub
		
							Organization organization;
							for(int i =  0 ; i < id.length ; i ++){
								organization=organizationDAO.findById(id[i]);
								organizationDAO.delete(organization);
							}
						
		
	}
	public List listByName(String name){
		return this.organizationDAO.findByName(name);
	}

	public List listByUserName(String name) {
		return this.organizationDAO.findByUserName(name);
	}


}
