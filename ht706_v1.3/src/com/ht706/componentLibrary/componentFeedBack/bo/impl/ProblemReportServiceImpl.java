/**
 * @FileName	ProblemReportServiceImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo.impl
 * @author ������
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo.impl;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentFeedBack.bo.IProblemReportService;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemReportDAO;

/**
 * ProblemReportService Service�ӿ�ʵ����
 * @method	listAllProblemReport	�г��������ⱨ��
 * @method	listValidProblemReport	�г��ǲݸ����ⱨ��
 * @method	findByRid				ͨ��Id�������ⱨ��
 * @method	create					�½����ⱨ��
 * @method	modify					�޸����ⱨ��
 */
public class ProblemReportServiceImpl implements IProblemReportService {

	private IProblemReportDAO problemReportDAO;

	public IProblemReportDAO getProblemReportDAO() {
		return problemReportDAO;
	}

	public void setProblemReportDAO(IProblemReportDAO problemReportDAO) {
		this.problemReportDAO = problemReportDAO;
	}

	public List<ProblemReport> listAllProblemReport() {
		return problemReportDAO.findAll();
	}

	public ProblemReport findByRid(String rid) {	
		return problemReportDAO.findById(rid);
	}

	public void create(ProblemReport problemReport) {
		problemReportDAO.save(problemReport);
	}

	public void modify(ProblemReport problemReport) {
		problemReportDAO.update(problemReport);
		
	}

	public ProblemReport findByReportId(String reportId) {
		List lst = problemReportDAO.findByReportId(reportId);
		if (lst.size() == 0) {
			return null;
		}
		else {
			return (ProblemReport) lst.get(0);
		}
		
	}

	public List<ProblemReport> findByNumber(int start, int offset) {
		return problemReportDAO.findByNumber(start, offset);
	}

	public List<ProblemReport> listValidProblemReport() {
		return problemReportDAO.listValidProblemReport();
	}

}
