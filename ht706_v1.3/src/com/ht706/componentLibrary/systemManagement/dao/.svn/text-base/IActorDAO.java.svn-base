package com.ht706.componentLibrary.systemManagement.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
/**
 *  IActorDAO½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */
public interface IActorDAO {
	public void save(Actor transientInstance);

	public void delete(Actor persistentInstance);

	public Actor findById(java.lang.Integer id);

	public List findByExample(Actor instance);

	public List findByProperty(String propertyName, Object value);

	public List findByActorName(Object actorName);

	public List findByResponsibility(Object responsibility);

	public List findAll();

	public Actor merge(Actor detachedInstance);

	public void attachDirty(Actor instance);

	public void attachClean(Actor instance);

	public void update(Actor transientInstance);
}
