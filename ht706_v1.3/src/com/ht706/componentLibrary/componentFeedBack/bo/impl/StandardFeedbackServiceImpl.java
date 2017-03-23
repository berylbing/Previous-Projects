/**
 * @FileName	StandardFeedbackServiceImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo.impl
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo.impl;


import java.util.List;
import java.util.Set;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bo.IStandardFeedbackService;
import com.ht706.componentLibrary.componentFeedBack.dao.IStandardFeedbackDAO;
import com.ht706.componentLibrary.componentFeedBack.dao.IStandardFeedbackItemDAO;

/**
 * StandardFeedbackService Service接口实现类
 * @method	listAllStandardFeedback			列出所有反馈标准
 * @method 	create							创建反馈标准
 * @method 	delete							删除反馈标准
 * @method 	modify							修改反馈标准
 * @method 	getStandardFeedbackById			通过Id查找反馈标准
 * @method 	getCurrentStandardFeedback		找出当前反馈标准
 * @method 	getStandardFeedbackItemById		查找反馈标准项
 * @method 	createStandardFeedBackItem		创建反馈标准项
 * @method 	modifyStandardFeedBackItem		修改反馈标准项
 * @method	deleteStandardFeedBackItemById	删除反馈标准项
 * @method	getTotalScoreStandard			计算反馈标准项总分
 * @method	validate						生效反馈标准
 * @method	checkOut						导出反馈标准
 */

public class StandardFeedbackServiceImpl implements IStandardFeedbackService {
	
	private IStandardFeedbackDAO standardFeedbackDAO;
	
	private IStandardFeedbackItemDAO standardFeedbackItemDAO;

	public IStandardFeedbackDAO getStandardFeedbackDAO() {
		return standardFeedbackDAO;
	}

	public void setStandardFeedbackDAO(IStandardFeedbackDAO standardFeedbackDAO) {
		this.standardFeedbackDAO = standardFeedbackDAO;
	}

	public IStandardFeedbackItemDAO getStandardFeedbackItemDAO() {
		return standardFeedbackItemDAO;
	}

	public void setStandardFeedbackItemDAO(
			IStandardFeedbackItemDAO standardFeedbackItemDAO) {
		this.standardFeedbackItemDAO = standardFeedbackItemDAO;
	}

	public void create(StandardFeedback standardFeedBack) {
		standardFeedbackDAO.save(standardFeedBack);	
	}

	public void delete(int standardFeedBackId) {
		
		StandardFeedback sf = standardFeedbackDAO.findById(standardFeedBackId);
		standardFeedbackDAO.delete(sf);
	}
	
	public StandardFeedback getStandardFeedbackById(int standardFeedBackId) {
		
		StandardFeedback sf = standardFeedbackDAO.findById(standardFeedBackId);
		return sf;
	}

	public List<StandardFeedback> listAllStandardFeedback() {
		
		List<StandardFeedback> standardFeedbackList = null;
		standardFeedbackList = standardFeedbackDAO.findAll();
		return standardFeedbackList;

	}

	public void modify(StandardFeedback standardFeedBack) {
		standardFeedbackDAO.update(standardFeedBack);
	}

	public void modifyStandardFeedBackItem(
			StandardFeedbackItem standardFeedBackItem) {
		standardFeedbackItemDAO.update(standardFeedBackItem);
	}

	public StandardFeedbackItem getStandardFeedbackItemById(int id) {
		StandardFeedbackItem sfItem = null;
		sfItem = standardFeedbackItemDAO.findById(id); 
		return sfItem;
	}
	
	public StandardFeedback getCurrentStandardFeedback() {
		if(standardFeedbackDAO.findByStatus("1").isEmpty()) {
			return null;
		} else {
			return (StandardFeedback) standardFeedbackDAO.findByStatus("1").get(0); 
		}
	}
	
	public void createStandardFeedBackItem(
			StandardFeedbackItem standardFeedbackItem,
			int toStandardFeedbackId) {
		StandardFeedback sf = standardFeedbackDAO.findById(toStandardFeedbackId);
		standardFeedbackItem.setStandardfeedback(sf);
		sf.getStandardfeedbackitems().add(standardFeedbackItem);
		standardFeedbackDAO.update(sf);		
	}

	public void deleteStandardFeedBackItemById(int iId) {
		StandardFeedbackItem standardFeedbackItem = standardFeedbackItemDAO.findById(iId);
		standardFeedbackItemDAO.delete(standardFeedbackItem);
	}

	public String getTotalScoreStandard(int standardFeedbackId) {
		StandardFeedback sf = standardFeedbackDAO.findById(standardFeedbackId);
		Set<StandardFeedbackItem> sfItems = sf.getStandardfeedbackitems();
		Double totalScore = 0.0; 
		for (StandardFeedbackItem standardFeedbackItem : sfItems) {
			totalScore += Double.parseDouble(standardFeedbackItem.getScoreStandard());
		}
		return totalScore.toString();
	}
	
	public void validate(int standardFeedBackId) {
		
		List<StandardFeedback> standardFeedbackList = standardFeedbackDAO.findAll();
		for (Object o : standardFeedbackList) {
			StandardFeedback sf = (StandardFeedback) o;
			if(sf.getStatus().equals("1")) {
				sf.setStatus("0");
				standardFeedbackDAO.update(sf);
			}
		}
		for (Object o : standardFeedbackList) {
			StandardFeedback sf = (StandardFeedback) o;
			if(sf.getSfId()==standardFeedBackId) {
				sf.setStatus("1");
				standardFeedbackDAO.update(sf);
			}
		}
	}
	
	public void checkOut() {
			
	}

	public StandardFeedback findByVersion(String version) {
		List<StandardFeedback> lst = standardFeedbackDAO.findByVersion(version);
		if(lst.size() == 0)
		{
			return null;
		}
		else
		{
			return lst.get(0);
		}
	}

	public List<StandardFeedback> findByNumber(int start, int offset) {
		return standardFeedbackDAO.findByNumber(start, offset);
	}


}
