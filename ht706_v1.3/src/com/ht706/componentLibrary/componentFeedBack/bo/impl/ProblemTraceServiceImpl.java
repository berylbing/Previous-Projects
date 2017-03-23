/**
 * @FileName	ProblemTraceServiceImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo.impl
 * @author ������
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo.impl;


import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemTrace;
import com.ht706.componentLibrary.componentFeedBack.bo.IProblemTraceService;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemTraceDAO;


/**
 * ProblemTraceService Service�ӿ�ʵ����
 * @method	addProblemTrace		���һ������׷��
 */
public class ProblemTraceServiceImpl implements IProblemTraceService {

	private IProblemTraceDAO problemTraceDAO;

	public IProblemTraceDAO getProblemTraceDAO() {
		return problemTraceDAO;
	}

	public void setProblemTraceDAO(IProblemTraceDAO problemTraceDAO) {
		this.problemTraceDAO = problemTraceDAO;
	}

	public void addProblemTrace(ProblemTrace problemTrace) {
		problemTraceDAO.save(problemTrace);
	}
	

}
