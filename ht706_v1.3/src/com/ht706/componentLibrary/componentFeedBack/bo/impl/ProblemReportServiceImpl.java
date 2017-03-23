/**
 * @FileName	ProblemReportServiceImpl.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo.impl
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo.impl;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentFeedBack.bo.IProblemReportService;
import com.ht706.componentLibrary.componentFeedBack.dao.IProblemReportDAO;

/**
 * ProblemReportService Service接口实现类
 * @method	listAllProblemReport	列出所有问题报告
 * @method	listValidProblemReport	列出非草稿问题报告
 * @method	findByRid				通过Id查找问题报告
 * @method	create					新建问题报告
 * @method	modify					修改问题报告
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
