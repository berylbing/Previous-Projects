package com.ht706.componentLibrary.myFavorite.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.actionForm.FeedbackForm;
import com.ht706.componentLibrary.componentFeedBack.actionForm.ProblemReportForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;

public class ProblemByMe extends DispatchAction{
	/**
	 * ��ʾ�ҵ����ⱨ�浥�б�FeedbackByMeAction
     * @param form 		ProblemReportForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��/myFavorite/problemByMe.jsp
     * @exception       no
     */
	public ActionForward ProblemByMeAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		//String id=(String)request.getParameter("ID");//��ȡ�ļ��������ID	
		String UserID = (String)request.getSession().getAttribute("UserName");
		//�ҳ�ProblemReportList����ʾ
		ProblemReportForm pf=new ProblemReportForm();
		pf.setProblembyme(service.listProblemReportByMe(UserID));
		request.setAttribute("ProblemReportForm", pf);
		request.getSession().setAttribute("ProblemReportForm", pf);
		return mapping.findForward("problembyme");
	}
	
	private ICheckItemService service;

	public ICheckItemService getService() {
		return service;
	}
	public void setService(ICheckItemService service) {
		this.service = service;
	}

}