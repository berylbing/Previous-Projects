/**
 * @FileName	IStandardFeedbackDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;

public interface IStandardFeedbackDAO {
	public void save(StandardFeedback transientInstance);
	public void delete(StandardFeedback persistentInstance);
	public void update(StandardFeedback transientInstance);
	public StandardFeedback findById(java.lang.Integer id);
	public List<StandardFeedback> findByExample(StandardFeedback instance);
	public List<StandardFeedback> findByProperty(String propertyName, Object value);
	public List<StandardFeedback> findByCreatorId(Object creatorId);
	public List<StandardFeedback> findByStatus(Object status);
	public List<StandardFeedback> findByVersion(Object version);
	public List<StandardFeedback> findByAccordingToVersion(Object accordingToVersion);
	public List<StandardFeedback> findByAbout(Object about);
	public List<StandardFeedback> findAll();
	public StandardFeedback merge(StandardFeedback detachedInstance);
	public void attachDirty(StandardFeedback instance);
	public void attachClean(StandardFeedback instance);
	public List<StandardFeedback> findByNumber(int start, int offset);
	
}
