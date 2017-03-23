package com.ht706.componentLibrary.systemManagement.bo;

import java.util.List;
import java.util.Set;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Actor;
/**
 * IActorService½Ó¿Ú
 * 
 * @author: zd
 * @Time: 2010-08-31 
 */
public interface IActorService {
	public void create(final Actor transientInstance);
	public void modify(final Actor transientInstance);
	public void delete(final int id[]);
	public List listAll();
	public Actor getById(java.lang.Integer id);
	public List getByName(String name);
	public Set listUserByActorId(int id);
	
}
