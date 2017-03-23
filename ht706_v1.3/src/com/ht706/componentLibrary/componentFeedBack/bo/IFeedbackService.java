/**
 * @FileName	IFeedbackService.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.Feedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.FeedbackItem;
/**
 * IFeedbackService Service接口
 * @method 	listAllFeedback			列出所有反馈表
 * @method 	listValidFeedback		列出有效反馈表
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

public interface IFeedbackService {
	public List<Feedback> listAllFeedback();
	public List<Feedback> listValidFeedback();
	public Feedback getFeedbackById(String recordId);
	//public List searchFeedbackByCreateDate(int fromYear, int toYesr);
	public void checkOut();
	public String getTotalScoreStandard(String recordId);
	public String getTotalScore(String recordId);
	public void create(Feedback feedBack);
	public void createFeedbackItem(FeedbackItem feedbackItem, String recordId);
	public FeedbackItem getFeedbackItemById(int itemId);
	public void modifyFeedbackItem(FeedbackItem feedbackItem);
	public void deleteFeedbackItemById(int itemId);
	public void modify(Feedback feedback);
	public void delete(String recordId);
	public Feedback findByRegistryId(String registryId);
	public List<Feedback> findByNumber(int start, int offset);

	
}
