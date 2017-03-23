package com.ht706.componentLibrary.systemManagement.bo;

import java.util.List;

import org.apache.struts.action.ActionForward;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Actortoauthorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Usertoactor;
/**
 * ISafeControlService½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */
public interface ISafeControlService {
	public Actor findFistActor()
		throws Exception;
	public Actor findActor(final int id)
		throws Exception;
	public List searchAuthorizationByActor(final Actor actor)
		throws Exception;
	public List searchModuleAuthorizationByActor(final Actor actor,final int moduleId)
		throws Exception;
	public void modifyAuthorizationToActor(final int ids[],final int id)
		throws Exception;
	public List searchActorByOrganization(final int organizationId)
		throws Exception;
	public void modifyActorToOrganization(final Usertoactor userToActor)
		throws Exception;
	public List searchAllByActor(final int actorId)
		throws Exception;
	public List searchAllByOrganization(final int organizationId)
		throws Exception;
	public List searchAllByAuthorization(final int authorizationId)
		throws Exception;
	public List<Actor> listAllActor();
	public List<Authorization> listAllAuthorization();
	public List<Authorization> listAuthorizationByModule(String module);
	public Organization findFistOrganization();
	public Organization findOrganization(int parseInt);
	public List<Organization> listAllOrganization();
	public List<Department> listAllDepartment();
	public void modifyActorToOrganization(int[] selectedElement, int id);
	public Authorization findAuthorization(final int id);
}
