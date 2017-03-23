package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.List;
import java.util.Set;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bo.IActorService;
import com.ht706.componentLibrary.systemManagement.dao.IActorDAO;
import com.ht706.componentLibrary.systemManagement.dao.IUserToActorDAO;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class ActorServiceImpl implements IActorService {
	private IActorDAO actorDAO;
	private IUserToActorDAO userToActorDao;

	public void create(final Actor transientInstance) {

							actorDAO.save(transientInstance);

	}
	public void modify(final Actor transientInstance) {

	
							actorDAO.update(transientInstance);
							
					
	}
	public void delete(final int id[]) {
		
							Actor actor;
							for(int i =  0 ; i < id.length ; i ++){
								actor=actorDAO.findById(id[i]);
								actorDAO.delete(actor);
							}
						
		
	}
	public List listAll(){
		return actorDAO.findAll();
	}
	public Actor getById(java.lang.Integer id) {
		return actorDAO.findById(id);
	}
	public List getByName(String name) {
		return actorDAO.findByActorName(name);
	}
	
	//setter and getter
	public IActorDAO getActorDAO() {
		return actorDAO;
	}

	public void setActorDAO(IActorDAO actorDAO) {
		this.actorDAO = actorDAO;
	}
	public IUserToActorDAO getUserToActorDao(){
		return this.userToActorDao;
	}
	public void setUserToActorDao(IUserToActorDAO userToActorDao){
		this.userToActorDao = userToActorDao;
	}
	public Set listUserByActorId(int id) {		
		return this.actorDAO.findById(id).getUsertoactors();
		 
	}


	
	
}
