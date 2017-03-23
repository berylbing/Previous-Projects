/**
 * @FileName	IProblemReportService.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bo
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bo;

import java.util.List;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;

/**
 * IProblemReportService Service接口
 * @method	listAllProblemReport	列出所有问题报告
 * @method	findByRid				通过Id查找问题报告
 * @method	create					新建问题报告
 * @method	modify					修改问题报告
 */

public interface IProblemReportService {
	public List<ProblemReport> listAllProblemReport();
	public ProblemReport findByRid(String rid);
	public void create(ProblemReport problemReport);
	public void modify(ProblemReport problemReport);
	public ProblemReport findByReportId(String reportId);
	public List<ProblemReport> findByNumber(int start, int offset);
	public List<ProblemReport> listValidProblemReport();
		
}
