package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bo.IDepartmentService;
import com.ht706.componentLibrary.systemManagement.dao.IDepartmentDAO;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class DepartmentServiceImpl implements IDepartmentService {
	private IDepartmentDAO departmentDAO;


	public List listAll() {
		// TODO Auto-generated method stub
		return departmentDAO.findAll();
	}

	public Department getById(Integer id) {
		// TODO Auto-generated method stub
		return departmentDAO.findById(id);
	}

	public void create(final Department transientInstance) {
		// TODO Auto-generated method stub
		
							departmentDAO.save(transientInstance);
						

	}

	public void modify(final Department transientInstance) {
		// TODO Auto-generated method stub
		
							departmentDAO.update(transientInstance);
						

	}

	public void setDepartmentDAO(IDepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	public IDepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}



	public void delete(final Department department) {
		
							departmentDAO.delete( department);
						
		
	}

}
