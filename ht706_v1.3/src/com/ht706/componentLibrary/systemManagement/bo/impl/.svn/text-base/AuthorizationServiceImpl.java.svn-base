package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.List;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bo.IAuthorizationService;
import com.ht706.componentLibrary.systemManagement.dao.IAuthorizationDAO;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class AuthorizationServiceImpl implements IAuthorizationService {
	
	private IAuthorizationDAO authorizationDAO;

	public void setAuthorizationDAO(IAuthorizationDAO authorizationDAO) {
		this.authorizationDAO = authorizationDAO;
	}

	public IAuthorizationDAO getAuthorizationDAO() {
		return authorizationDAO;
	}
	public void create(final Authorization transientInstance) {
		
							authorizationDAO.save(transientInstance);
							
						
	}
	public void modify(final Authorization transientInstance) {
		authorizationDAO.update(transientInstance);
		
		
	}
	public void delete(final int []id) {
		
							Authorization authorization;
							for(int i =  0 ; i < id.length ; i ++){
								authorization = authorizationDAO.findById(id[i]);
								authorizationDAO.delete(authorization);
							}
						
	}
	public List listAll(){
		return authorizationDAO.findAll();
	}
	public Authorization getById(java.lang.Integer id) {
		return authorizationDAO.findById(id);
	}

	public List listByModuleId(String id) {		
		return authorizationDAO.findByModuleId(id);
	}
	public List listByName(String name) {		
		return authorizationDAO.findByName(name);
	}
}
