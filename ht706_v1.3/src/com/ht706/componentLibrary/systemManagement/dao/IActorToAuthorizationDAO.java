package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actortoauthorization;

/**
 * IActorToAuthorizationDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */

public interface IActorToAuthorizationDAO{

	public void save(Actortoauthorization transientInstance);

	public void delete(Actortoauthorization persistentInstance);

	public Actortoauthorization findById(java.lang.Integer id);

	public List findByExample(Actortoauthorization instance);

	public List findByProperty(String propertyName, Object value);

	public List findByDescription(Object description);

	public List findAll();

	public Actortoauthorization merge(Actortoauthorization detachedInstance);

	public void attachDirty(Actortoauthorization instance);

	public void attachClean(Actortoauthorization instance);
}