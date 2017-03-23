/**
 * @FileName	IProblemReportDAO.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.dao
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.dao;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;


public interface IProblemReportDAO {
	public List<ProblemReport> findAll();
	public ProblemReport findById(java.lang.String id);
	public void save(ProblemReport transientInstance);
	public void update(ProblemReport problemReport);
	public List findByReportId(Object reportId);
	public List findByStatus(Object status);
	public List<ProblemReport> findByNumber(int start, int offset);
	public List<ProblemReport> listValidProblemReport();
}
