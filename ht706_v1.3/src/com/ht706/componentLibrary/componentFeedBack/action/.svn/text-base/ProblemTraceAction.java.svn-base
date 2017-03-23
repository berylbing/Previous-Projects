/**
 * @FileName	ProblemTraceAction.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.action
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.action;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.actionForm.ProblemTraceForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemTrace;
import com.ht706.componentLibrary.componentFeedBack.bo.IProblemReportService;
import com.ht706.componentLibrary.componentFeedBack.bo.IProblemTraceService;

/**
 * ProblemTrace Action实现类
 */
public class ProblemTraceAction extends DispatchAction {
	
	private IProblemTraceService problemTraceService;
	private IProblemReportService problemReportService;

	public IProblemTraceService getProblemTraceService() {
		return problemTraceService;
	}

	public void setProblemTraceService(IProblemTraceService problemTraceService) {
		this.problemTraceService = problemTraceService;
	}
	
	public IProblemReportService getProblemReportService() {
		return problemReportService;
	}

	public void setProblemReportService(IProblemReportService problemReportService) {
		this.problemReportService = problemReportService;
	}
	
	/**
	 * 列出所有的问题追踪
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listAllProblemTraceByRid(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String rid = request.getParameter("RID");
		ProblemReport pr = problemReportService.findByRid(rid);
		Set<ProblemTrace> problemTraceList = pr.getProblemtraces();
		request.setAttribute("problemTraceList", problemTraceList);
		return mapping.findForward("listAllProblemTraceByRid");
	}
	
	/**
	 * 添加问题追踪的预处理
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preAddProblemTrace(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String rid = request.getParameter("RID");
		ProblemReport pr = problemReportService.findByRid(rid);
		Set<ProblemTrace> problemTraceList = pr.getProblemtraces();
		request.setAttribute("problemTraceList", problemTraceList);
		request.setAttribute("RID", rid);
		return mapping.findForward("preAddProblemTrace");
	}
	
	/**
	 * 添加一个问题追踪
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward addProblemTrace(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String rid = request.getParameter("RID");
		ProblemTraceForm ptForm = (ProblemTraceForm) form;
		ProblemReport pr = problemReportService.findByRid(rid);
		ProblemTrace pt = new ProblemTrace();
		pt.setContent(ptForm.getContent());
		pt.setPerson((Integer)request.getSession().getAttribute("UserID"));
		pt.setReportId(pr.getReportId());
		pt.setProblemreport(pr);
		pt.setStatus(ptForm.getStatus());
		if (ptForm.getStatus().equals("1")) {
			pr.setStatus("3");
		}
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		pt.setDateOfInformation(format.parse(ptForm.getDateOfInformation()));
		pr.getProblemtraces().add(pt);
		problemReportService.modify(pr);
		request.setAttribute("RID", rid);
		return mapping.findForward("addProblemTrace");
	}
	
}
