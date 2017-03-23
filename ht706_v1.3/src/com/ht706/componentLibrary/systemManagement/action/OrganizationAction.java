package com.ht706.componentLibrary.systemManagement.action;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;

import com.ht706.componentLibrary.systemManagement.actionForm.OrganizationForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.bo.IOrganizationService;

/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */




public class OrganizationAction extends DispatchAction {
	private IOrganizationService organizationService;
	public void setOrganizationService(IOrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	public IOrganizationService getOrganizationService() {
		return organizationService;
	}
	/**
	 * �����֯��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward getDepartmentTree(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String select = request.getParameter("select");
		if(select!=null)
			request.setAttribute("select", select);
		else
			request.setAttribute("select", -1);
		List<Department> departmentList =organizationService.listAllDepartment();
		departmentList.get(0).setParentDepartment(new Department(-1));
		request.setAttribute("departmentList", departmentList);
		return mapping.findForward("deptTree");		
				
	}
	/**
	 * ����һ�����ŵ�����Ա��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward searchOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sid=request.getParameter("Id");
		String select=request.getParameter("select");
		int id=0;
		if(sid!=null)id= Integer.parseInt(sid);
		List<Organization> organizationList=organizationService.searchOrganizationByDepartment(id);
		request.setAttribute("select", select);
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("departmentId", id);
		request.setAttribute("departmentName", organizationService.getDepartmentName(id));
		
		if(request.getParameter("callbackname") == null)
			return mapping.findForward("organizationList");
		else
			return mapping.findForward("organizationListYBY");
				
	}
	/**
	 * �޸�action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward modifyOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		OrganizationForm of=(OrganizationForm)form;		
		Organization or=of.getOrganization();
		
		int id= or.getDepartmentId();
		if(of.getBirthDay() != "" && of.getBirthDay() != null)
			or.setBirthDay(sdf.parse(of.getBirthDay()));
		or.setDepartmentId(id);
		
		Md5PasswordEncoder encoder=new Md5PasswordEncoder();

		or.setPassword( encoder.encodePassword(or.getPassword(), null));
		
		organizationService.modify(or);
	
		List<Organization> organizationList=organizationService.searchOrganizationByDepartment(id);
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("departmentId", id);
		request.setAttribute("departmentName", organizationService.getDepartmentName(id));
		request.setAttribute("select", -1);
		return mapping.findForward("organizationList");
		
		
	}
	/**
	 * �鿴��Ϣ��ʼ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward getOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sid=request.getParameter("Id");
		int id=0;
		if(sid!=null)id= Integer.parseInt(sid);
		Organization or=organizationService.getById(id);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		request.setAttribute("date", or.getBirthDay() == null?null:sdf.format(or.getBirthDay()));		
		request.setAttribute("organization", or);
		request.setAttribute("departmentId", or.getDepartmentId());
		request.setAttribute("departmentName", organizationService.getDepartmentName(or.getDepartmentId()));
		return mapping.findForward("getOrganization");
		
		
	}
	
	/**
	 * �޸���Ϣ��ʼ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preOrganizationForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sid=request.getParameter("Id");
		int id=0;
		if(sid!=null)id= Integer.parseInt(sid);
		Organization or=organizationService.getById(id);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		request.setAttribute("date", or.getBirthDay() == null?null:sdf.format(or.getBirthDay()));
		request.setAttribute("organization", or);
		request.setAttribute("departmentId", or.getDepartmentId());
		request.setAttribute("departmentName", organizationService.getDepartmentName(or.getDepartmentId()));
		return mapping.findForward("modifyOrganization");
		
		
	}
	/**
	 * �������޸ĸ��ڵ�Ԥ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preParentDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id= Integer.parseInt(request.getParameter("Id"));
		request.setAttribute("organizationId", id);
		
		List<Department> departmentList =organizationService.listAllDepartment();
		departmentList.get(0).setParentDepartment(new Department(-1));
		request.setAttribute("departmentList", departmentList);
		
		return mapping.findForward("parentDepartment");
		
	}
	/**
	 * �������޸ĸ��ڵ�action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward selectParentDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id= Integer.parseInt(request.getParameter("Id"));
		int pid=Integer.parseInt(request.getParameter("Pid"));
		Organization or=organizationService.getById(id);
		
		or.setDepartmentId(pid);
		request.setAttribute("organization", or);
		request.setAttribute("departmentId", or.getDepartmentId());
		request.setAttribute("departmentName", organizationService.getDepartmentName(or.getDepartmentId()));
		return mapping.findForward("modifyOrganization");
		
	}
	/**
	 * ɾ����Աaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward deleteOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		OrganizationForm af=(OrganizationForm)form;
		organizationService.delete(af.getSelectedOrganization());
		
		String sid=request.getParameter("Id");
		int id=0;
		if(sid!=null)id= Integer.parseInt(sid);
		List<Organization> organizationList=organizationService.searchOrganizationByDepartment(id);
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("departmentId", id);
		request.setAttribute("departmentName", organizationService.getDepartmentName(id));
		request.setAttribute("select", -1);
		return mapping.findForward("organizationList");
		
	}
	/**
	 * ��������Աaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward createOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String sid=request.getParameter("Id");
		int id=0;
		id= Integer.parseInt(sid);
		OrganizationForm of=(OrganizationForm)form;
		Organization organization=of.getOrganization();
		organization.setDepartmentId(id);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		if(of.getBirthDay() != "" && of.getBirthDay() != null)
			organization.setBirthDay(sdf.parse(of.getBirthDay()));
		
		Md5PasswordEncoder encoder=new Md5PasswordEncoder();
		organization.setPassword( encoder.encodePassword(organization.getPassword(), null));
		
		organizationService.create(organization);
		List<Organization> organizationList=organizationService.searchOrganizationByDepartment(id);
		request.setAttribute("organizationList", organizationList);
		request.setAttribute("departmentId", id);
		request.setAttribute("departmentName", organizationService.getDepartmentName(id));
		request.setAttribute("select", -1);
		
		return mapping.findForward("organizationList");
		
		
	}
	/**
	 * ������Ա�����Žڵ�Ԥ��action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preCreateOrganization(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sid=request.getParameter("Id");
		int id=0;
		id= Integer.parseInt(sid);
		request.setAttribute("departmentId", id);
		request.setAttribute("departmentName", organizationService.getDepartmentName(id));
		Organization org = new Organization();
		org.setSecurityLevel("����");
		org.setSex("��");
		request.setAttribute("organization",org);
		
		return mapping.findForward("createOrganization");
		
		
	}
	public ActionForward checkName(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name = new String(request.getParameter("Name").getBytes("iso-8859-1"),"gb2312");		
		List actors = organizationService.listByName(name);
		if(actors != null && actors.size()!= 0)
			response.getWriter().write("error");
		else
			response.getWriter().write("ok");
		
		return null;
		
		
	}


	
}
