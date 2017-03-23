package com.ht706.componentLibrary.systemManagement.bo;

import java.util.List;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Authorization;
/**
 * IAuthorizationService½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */
public interface IAuthorizationService {
	public void create(final Authorization transientInstance);
	public void modify(final Authorization transientInstance);
	public void delete(final int []id);
	public List listAll();
	public List listByModuleId(String id);
	public List listByName(String name);
	public Authorization getById(java.lang.Integer id);
}
