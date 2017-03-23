package com.ht706.componentLibrary.login.action;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.systemManagement.actionForm.OrganizationForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bo.IOrganizationService;

public class personalInfo extends DispatchAction  {

	IOrganizationService organizationService;
	public ActionForward view(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		int id = (Integer)request.getSession().getAttribute("UserID");
	
		
		Organization or=organizationService.getById(id);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		request.setAttribute("date", sdf.format(or.getBirthDay()));
		request.setAttribute("organization", or);
		request.setAttribute("departmentId", or.getDepartmentId());
		request.setAttribute("departmentName", organizationService.getDepartmentName(or.getDepartmentId()));
		return mapping.findForward("getOrganization");
		
	}
	public ActionForward preModify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		int id = (Integer)request.getSession().getAttribute("UserID");
	

		Organization or=organizationService.getById(id);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		request.setAttribute("date", sdf.format(or.getBirthDay()));
		request.setAttribute("organization", or);
		request.setAttribute("departmentId", or.getDepartmentId());
		request.setAttribute("departmentName", organizationService.getDepartmentName(or.getDepartmentId()));
		return mapping.findForward("modifyOrganization");
		
	}
	public ActionForward modify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id = (Integer)request.getSession().getAttribute("UserID");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		
		OrganizationForm of=(OrganizationForm)form;
		
		Organization or=of.getOrganization();
		or.setBirthDay(sdf.parse(of.getBirthDay()));
		
		organizationService.modify(or);
		
		
	
		request.setAttribute("date", sdf.format(or.getBirthDay()));
		request.setAttribute("organization", or);
		request.setAttribute("departmentId", or.getDepartmentId());
		request.setAttribute("departmentName", organizationService.getDepartmentName(or.getDepartmentId()));
		return view(mapping, form, request, response);
		
		
	}
	public IOrganizationService getOrganizationService() {
		return organizationService;
	}
	public void setOrganizationService(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}

}
