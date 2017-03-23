/**
 * @FileName	IStandardFeedbackService.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo
 * @author ������
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedback;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.StandardFeedbackItem;

/**
 * IStandardFeedback Service�ӿ�
 * @method	listAllStandardFeedback			�г����з�����׼
 * @method 	create							����������׼
 * @method 	delete							ɾ��������׼
 * @method 	modify							�޸ķ�����׼
 * @method 	getStandardFeedbackById			ͨ��Id���ҷ�����׼
 * @method 	getCurrentStandardFeedback		�ҳ���ǰ������׼
 * @method 	getStandardFeedbackItemById		���ҷ�����׼��
 * @method 	createStandardFeedBackItem		����������׼��
 * @method 	modifyStandardFeedBackItem		�޸ķ�����׼��
 * @method	deleteStandardFeedBackItemById	ɾ��������׼��
 * @method	getTotalScoreStandard			���㷴����׼���ܷ�
 * @method	validate						��Ч������׼
 * @method	checkOut						����������׼
 */

public interface IStandardFeedbackService {
	
	public void modify(StandardFeedback standardFeedBack);
	public void delete(int standardFeedBackId);
	
	/**��õ�ǰ��Ч�ķ�����׼*/
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
