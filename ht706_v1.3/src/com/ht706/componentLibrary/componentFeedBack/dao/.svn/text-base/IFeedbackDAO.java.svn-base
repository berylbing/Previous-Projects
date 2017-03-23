/**
 * @FileName	IFeedbackDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;

public interface IFeedbackDAO {
	public void save(Feedback transientInstance);
	public void delete(Feedback persistentInstance);
	public Feedback findById(java.lang.String id);
	public List<Feedback> findByExample(Feedback instance);
	public List<Feedback> findByProperty(String propertyName, Object value);
	public List<Feedback> findByRegistryId(Object registryId);
	public List<Feedback> findByDescription(Object description);
	public List<Feedback> findBySfId(Object sfId);
	public List<Feedback> findByProvider(Object provider);
	public List<Feedback> findByFile(Object file);
	public List<Feedback> findByBackground(Object background);
	public List<Feedback> findByEnviroment(Object enviroment);
	public List<Feedback> findByStatus(Object status);
	public List<Feedback> findAll();
	public Feedback merge(Feedback detachedInstance);
	public void attachDirty(Feedback instance);
	public void attachClean(Feedback instance);
	public void update(Feedback transientInstance);
	public List<Feedback> findByNumber(int start, int offset);

}
