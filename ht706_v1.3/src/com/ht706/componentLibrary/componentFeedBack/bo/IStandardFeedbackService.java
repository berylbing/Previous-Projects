/**
 * @FileName	IStandardFeedbackService.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;

/**
 * IStandardFeedback Service接口
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

public interface IStandardFeedbackService {
	
	public void modify(StandardFeedback standardFeedBack);
	public void delete(int standardFeedBackId);
	
	/**获得当前生效的反馈标准*/
	public StandardFeedback getCurrentStandardFeedback();
	
	public void validate(int standardFeedBackId);
	public StandardFeedback getStandardFeedbackById(int standardFeedBackId);
	//public List searchStandardFeedbackByCreateDate(int fromYear, int toYear);
	public List<StandardFeedback> listAllStandardFeedback();
	public void checkOut();
	public String getTotalScoreStandard(int standardFeedbackId); 
	
	public void create(StandardFeedback standardFeedBack);
	public void createStandardFeedBackItem(StandardFeedbackItem standardFeedbackItem, int toStandardFeedbackId);
	public void modifyStandardFeedBackItem(StandardFeedbackItem standardFeedBackItem);
	public StandardFeedbackItem getStandardFeedbackItemById(int id);
	public void deleteStandardFeedBackItemById(int iId);
	public StandardFeedback findByVersion(String version);
	public List<StandardFeedback> findByNumber(int start, int offset);
}
