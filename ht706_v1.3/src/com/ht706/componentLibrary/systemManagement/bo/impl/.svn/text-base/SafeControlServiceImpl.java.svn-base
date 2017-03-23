package com.ht706.componentLibrary.systemManagement.bo.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actortoauthorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Usertoactor;
import com.ht706.componentLibrary.systemManagement.bo.ISafeControlService;
import com.ht706.componentLibrary.systemManagement.dao.IActorDAO;
import com.ht706.componentLibrary.systemManagement.dao.IActorToAuthorizationDAO;
import com.ht706.componentLibrary.systemManagement.dao.IAuthorizationDAO;
import com.ht706.componentLibrary.systemManagement.dao.IDepartmentDAO;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;
import com.ht706.componentLibrary.systemManagement.dao.IUserToActorDAO;
import com.ht706.componentLibrary.util.security.IFilterSecurityInterceptorByDB;
/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */
public class SafeControlServiceImpl implements ISafeControlService {
	private IUserToActorDAO userToActorDAO;
	private IActorToAuthorizationDAO actorToAuthorizationDAO;
	private IAuthorizationDAO authorizationDAO; 
	private IOrganizationDAO organizationDAO;
	private IFilterSecurityInterceptorByDB filterSecurityInterceptorByDB;

	private IDepartmentDAO departmentDAO;

	private IActorDAO actorDAO;
	public Actor findFistActor()
	throws Exception
	{
		return (Actor)actorDAO.findAll().get(0);
	}

	public Actor findActor(final int id)
	throws Exception
	{
		return (Actor)actorDAO.findById(id);
	}
	public Authorization findAuthorization(final int id)
	{
		return authorizationDAO.findById(id);
	}
	public List searchAuthorizationByActor(final Actor actor)
			throws Exception {
		List<Actortoauthorization> atal= actorToAuthorizationDAO.findByProperty("actor", actor);
		List<Authorization> a = new ArrayList<Authorization>();
		for(Actortoauthorization item : atal)
		{
			a.add(item.getAuthorization());
		}
		return 	a;
		// TODO Auto-generated method stub		
	}
	public List searchModuleAuthorizationByActor(final Actor actor,final int moduleId)
		throws Exception {
		
		List<Actortoauthorization> atal= actorToAuthorizationDAO.findByProperty("actor", actor);
		List<Authorization> a = new ArrayList<Authorization>();
		for(Actortoauthorization item : atal)
		{
			if(item.getAuthorization().getModule() == ("" + moduleId))
				a.add(item.getAuthorization());
		}
		return 	a;		
	}
	public void modifyAuthorizationToActor(final int ids[], final int id)
			throws Exception {
		
			Actortoauthorization ata;
			
			Set<Actortoauthorization> atalist = actorDAO.findById(id).getActortoauthorizations();
			for(Actortoauthorization element:atalist){
				
				actorToAuthorizationDAO.delete(element);
			}; 
//			for(int i = 0;i<=actorToAuthorizationDAO.findByProperty("actor", actorDAO.findById(id)).size();i++)
//			{
//				ata = (Actortoauthorization)actorToAuthorizationDAO.findByProperty("actor", actorDAO.findById(id)).get(0);
//				actorToAuthorizationDAO.delete(ata);
//			}
			if(ids!=null){
				for(int i =  0 ; i < ids.length ; i ++){
					Actortoauthorization nata = new Actortoauthorization();
					nata.setActor(actorDAO.findById(id));
					nata.setAuthorization(authorizationDAO.findById(ids[i]));
					actorToAuthorizationDAO.save(nata);
				}
			}	
			filterSecurityInterceptorByDB.refresh();
	}
	public List searchActorByOrganization(int organizationId)
			throws Exception {
		
		List<Usertoactor> atal= userToActorDAO.findByProperty("organization", organizationDAO.findById(organizationId));
		List<Actor> a = new ArrayList<Actor>();
		for(Usertoactor item : atal)
		{
			a.add(item.getActor());
		}
		return 	a;
		// TODO Auto-generated method stub		
	}
	
	public void modifyActorToOrganization(Usertoactor userToActor)
			throws Exception {	
		// TODO Auto-generated method stub		
	}
	public List searchAllByActor(int actorId)
			throws Exception {
				return null;		
		// TODO Auto-generated method stub		
	}
	public List searchAllByOrganization(int organizationId)
			throws Exception {
				return null;		
		// TODO Auto-generated method stub		
	}
	public List searchAllByAuthorization(int authorizationId)
			throws Exception {
				return null;		
		// TODO Auto-generated method stub		
	}

	public void setActorToAuthorizationDAO(IActorToAuthorizationDAO actorToAuthorizationDAO) {
		this.actorToAuthorizationDAO = actorToAuthorizationDAO;
	}
	public IActorToAuthorizationDAO getActorToAuthorizationDAO() {
		return actorToAuthorizationDAO;
	}
	public void setUserToActorDAO(IUserToActorDAO userToActorDAO) {
		this.userToActorDAO = userToActorDAO;
	}
	public IUserToActorDAO getUserToActorDAO() {
		return userToActorDAO;
	}
	public IActorDAO getActorDAO() {
		return actorDAO;
	}
	public void setActorDAO(IActorDAO actorDAO) {
		this.actorDAO = actorDAO;
	}
	public List<Actor> listAllActor() {
		// TODO Auto-generated method stub
		return actorDAO.findAll();
	}
	public List<Authorization> listAllAuthorization() {
		// TODO Auto-generated method stub
		return authorizationDAO.findAll();
	}
	public List<Authorization> listAuthorizationByModule(String id) {
		// TODO Auto-generated method stub
		return authorizationDAO.findByModuleId(id);
	}
	public IAuthorizationDAO getAuthorizationDAO() {
		return authorizationDAO;
	}
	public void setAuthorizationDAO(IAuthorizationDAO authorizationDAO) {
		this.authorizationDAO = authorizationDAO;
	}
	public Organization findFistOrganization() {
		// TODO Auto-generated method stub

		return (Organization) organizationDAO.findAll().get(0);
	}
	public Organization findOrganization(int parseInt) {
		// TODO Auto-generated method stub
		return organizationDAO.findById(parseInt);
	}
	public List<Organization> listAllOrganization() {
		// TODO Auto-generated method stub
		return organizationDAO.findAll();
	}
	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}
	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}

	public List<Department> listAllDepartment() {
		// TODO Auto-generated method stub
		return departmentDAO.findAll();
	}
	public IDepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}

	public void setDepartmentDAO(IDepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	public void modifyActorToOrganization(final int[] ids,final int id) {
		// TODO Auto-generated method stub
		
							Usertoactor ata;
							boolean flag=true;
							Set<Usertoactor> atalist = organizationDAO.findById(id).getUsertoactors();
							for(Usertoactor element:atalist){
								flag=true;
								if(ids!=null){
									for(int i =  0 ; i < ids.length ; i ++){
										if(element.getActor().getActorId()==ids[i]){
											flag=false;
											ids[i]=-1;
										}
									}
								}
								if(flag)userToActorDAO.delete(element);
							}; 
//							for(int i = 0;i<=actorToAuthorizationDAO.findByProperty("actor", actorDAO.findById(id)).size();i++)
//							{
//								ata = (Actortoauthorization)actorToAuthorizationDAO.findByProperty("actor", actorDAO.findById(id)).get(0);
//								actorToAuthorizationDAO.delete(ata);
//							}
							if(ids!=null){
								for(int i =  0 ; i < ids.length ; i ++){
									if(ids[i]==-1)continue;
									Usertoactor nata = new Usertoactor();
									nata.setActor(actorDAO.findById(ids[i]));
									nata.setOrganization(organizationDAO.findById(id));
									userToActorDAO.save(nata);
								}
							}
							filterSecurityInterceptorByDB.refresh();
							
						
	}

	public void setFilterSecurityInterceptorByDB(
			IFilterSecurityInterceptorByDB filterSecurityInterceptorByDB) {
		this.filterSecurityInterceptorByDB = filterSecurityInterceptorByDB;
	}

	public IFilterSecurityInterceptorByDB getFilterSecurityInterceptorByDB() {
		return filterSecurityInterceptorByDB;
	}
}
