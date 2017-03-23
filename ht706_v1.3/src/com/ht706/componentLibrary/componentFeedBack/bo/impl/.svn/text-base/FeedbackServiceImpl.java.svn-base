/**
 * @FileName	FeedbackServiceImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo.impl
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
import com.ht706.componentLibrary.componentFeedBack.bo.IFeedbackService;
import com.ht706.componentLibrary.componentFeedBack.dao.IFeedbackDAO;
import com.ht706.componentLibrary.componentFeedBack.dao.IFeedbackItemDAO;

/**
 * FeedbackService Service接口实现类
 * @method 	listAllFeedback			列出所有反馈表
 * @method 	getFeedbackById			通过Id查找反馈表
 * @method 	create					创建反馈表
 * @method 	modify					修改反馈表
 * @method 	delete					删除反馈表
 * @method 	getFeedbackItemById		通过Id查找反馈表项
 * @method 	createFeedbackItem		新建反馈表项
 * @method 	modifyFeedbackItem		修改反馈表项
 * @method 	deleteFeedbackItemById	删除反馈表项
 * @method	getTotalScoreStandard	计算所有反馈表项标准总分
 * @method 	getTotalScore			计算所有反馈表项得分总分
 * @method 	checkOut				列出所有反馈表
 */
public class FeedbackServiceImpl implements IFeedbackService {

	private IFeedbackDAO feedbackDAO;
	private IFeedbackItemDAO feedbackItemDAO;
    
	public IFeedbackDAO getFeedbackDAO() {
		return feedbackDAO;
	}

	public void setFeedbackDAO(IFeedbackDAO feedbackDAO) {
		this.feedbackDAO = feedbackDAO;
	}

	public IFeedbackItemDAO getFeedbackItemDAO() {
		return feedbackItemDAO;
	}

	public void setFeedbackItemDAO(IFeedbackItemDAO feedbackItemDAO) {
		this.feedbackItemDAO = feedbackItemDAO;
	}

	public void checkOut() {
		
	}

	public void create(Feedback feedBack) {
		feedbackDAO.save(feedBack);
	}

	public Feedback getFeedbackById(String recordId) {
		Feedback feedback = feedbackDAO.findById(recordId);
		return feedback;
	}

	public List<Feedback> listAllFeedback() {
		List<Feedback> feedbackList = null;
		feedbackList = feedbackDAO.findAll();	
		return feedbackList;
		
	}

	public void createFeedbackItem(FeedbackItem feedbackItem, String recordId) {
		Feedback fb = feedbackDAO.findById(recordId);
		feedbackItem.setFeedback(fb);
		fb.getFeedbackitems().add(feedbackItem);
		feedbackDAO.update(fb);
	}

	public FeedbackItem getFeedbackItemById(int itemId) {
		return feedbackItemDAO.findById(itemId);
	}

	public void modifyFeedbackItem(FeedbackItem feedbackItem) {
		feedbackItemDAO.save(feedbackItem);
		
	}

	public void deleteFeedbackItemById(int itemId) {
		FeedbackItem feedbackItem = feedbackItemDAO.findById(itemId);
		feedbackItemDAO.delete(feedbackItem);
	}

	public void modify(Feedback feedback) {
		feedbackDAO.update(feedback);
	}

	public void delete(String recordId) {
		Feedback fb = feedbackDAO.findById(recordId);
		feedbackDAO.delete(fb);
	}

	public String getTotalScore(String recordId) {
		Feedback fb = feedbackDAO.findById(recordId);
		Set<FeedbackItem> fbItems = fb.getFeedbackitems();
		Double totalScore = 0.0;
		for (FeedbackItem feedbackItem : fbItems) {
			if (feedbackItem.getScore() != null || feedbackItem.getScore().equals("")) {
			totalScore += Double.parseDouble(feedbackItem.getScore());
			}
		}
		return totalScore.toString();
	}

	public String getTotalScoreStandard(String recordId) {
		Feedback fb = feedbackDAO.findById(recordId);
		Set<FeedbackItem> fbItems = fb.getFeedbackitems();
		Double totalScore = 0.0;
		for (FeedbackItem feedbackItem : fbItems) {
			totalScore += Double.parseDouble(feedbackItem.getScoreStandard());
		}
		return totalScore.toString();
	}

	public Feedback findByRegistryId(String registryId) {
		// TODO Auto-generated method stub
		List<Feedback> lst = feedbackDAO.findByRegistryId(registryId);
		if(lst.size() == 0)
		{
			return null;
		}
		else
		{
			return lst.get(0);
		}
	}

	public List<Feedback> listValidFeedback() {
		List<Feedback> feedbackList = null;
		feedbackList = feedbackDAO.findByStatus(2);	
		return feedbackList;
	}

	public List<Feedback> findByNumber(int start, int offset) {
		return feedbackDAO.findByNumber(start, offset);
	}



}
