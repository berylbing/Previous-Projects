/**
 * @FileName	IFeedbackItemDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;

public interface IFeedbackItemDAO {

	public void save(FeedbackItem transientInstance);
	public void delete(FeedbackItem persistentInstance);
	public FeedbackItem findById(java.lang.Integer id);
	public List<FeedbackItem> findByExample(FeedbackItem instance);
	public List<FeedbackItem> findByProperty(String propertyName, Object value);
	public List<FeedbackItem> findByItemName(Object itemName);
	public List<FeedbackItem> findByScore(Object score);
	public List<FeedbackItem> findByDescription(Object description);
	public List<FeedbackItem> findAll();
	public FeedbackItem merge(FeedbackItem detachedInstance);
	public void attachDirty(FeedbackItem instance);
	public void attachClean(FeedbackItem instance);
	
}
