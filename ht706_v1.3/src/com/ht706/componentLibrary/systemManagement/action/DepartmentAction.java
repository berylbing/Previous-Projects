package com.ht706.componentLibrary.systemManagement.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.systemManagement.actionForm.DepartmentForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Department;
import com.ht706.componentLibrary.systemManagement.bo.IDepartmentService;

/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */




public class DepartmentAction extends DispatchAction {
	private IDepartmentService departmentService;
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public IDepartmentService getDepartmentService() {
		return departmentService;
	}
	/**
	 * 获得部门树action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward getDepartmentTree(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Department> departmentList =departmentService.listAll();
		departmentList.get(0).setParentDepartment(new Department(-1));
		request.setAttribute("departmentList", departmentList);
		return mapping.findForward("deptTree");		
	}
	/**
	 * 显示一个部门action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward getDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String sid=request.getParameter("Id");
		int id=0;
		Department department;
		if(sid!=null)id= Integer.parseInt(sid);
		department=departmentService.getById(id);
		request.setAttribute("department", department);
		return mapping.findForward("deptInfo");	
	}
	/**
	 * 修改前获取原信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preDepartmentForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id= Integer.parseInt(request.getParameter("Id"));
		Department department=departmentService.getById(id);
		request.setAttribute("department", department);
		return mapping.findForward("editorDeptInfo");	
		
	}
	/**
	 * 修改部门信息action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DepartmentForm df= (DepartmentForm) form ;
		df.getDepartment().setParentDepartment(departmentService.getById(df.getParentId()));
		if(df.getParentId()==-1){
			df.getDepartment().setParentDepartment(new Department(-1));
		}
		departmentService.modify(df.getDepartment());
		request.setAttribute("department", df.getDepartment());
		return mapping.findForward("deptInfo");	
		
	}
	/**
	 * 删除部门action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward deleteDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id= Integer.parseInt(request.getParameter("Id"));
		Department department=departmentService.getById(id);
		request.setAttribute("department", department.getParentDepartment());
		departmentService.delete(department);
		
		return mapping.findForward("deptInfo");	
		
	}
	/**
	 * 创建新部门action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward createDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DepartmentForm df=((DepartmentForm)form);
		Department department=df.getDepartment();
		department.setParentDepartment(departmentService.getById(df.getParentId()));
		departmentService.create(department);
		request.setAttribute("department", department);
		return mapping.findForward("deptInfo");	
		
	}
	/**
	 * 创建新部门父节点预读action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preCreateDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id= Integer.parseInt(request.getParameter("Id"));
		Department department=departmentService.getById(id);
		request.setAttribute("department", department);
		return mapping.findForward("createDepartment");
		
	}
	/**
	 * 部门树修改父节点预读action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preParentDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String deptId = request.getParameter("Id");		
		List<Department> departmentList =departmentService.listAll();
		if(deptId != null && deptId !="")
		{	
			int id = Integer.parseInt(deptId);		
			for(int i=0,size = departmentList.size();i<size;i++)
			{
				if(departmentList.get(i).getDepartmentId() == id)
				{
					departmentList.remove(i);
					size = departmentList.size();
				}
			}
		}
		departmentList.get(0).setParentDepartment(new Department(-1));
		request.setAttribute("departmentList", departmentList);
		
		return mapping.findForward("parentDepartment");
		
	}
	/**
	 * 部门树修改父节点action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward selectParentDepartment(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int id= Integer.parseInt(request.getParameter("Id"));
		int pid=Integer.parseInt(request.getParameter("Pid"));
		Department department=departmentService.getById(id);
		Department pDepartment=departmentService.getById(pid);
		while(pDepartment.getDepartmentId()!=-1){
			if(id==pDepartment.getDepartmentId()){
				request.setAttribute("department", department);
				return mapping.findForward("editorDeptInfo");	
			}
			pDepartment=pDepartment.getParentDepartment();
		}
		department.setParentDepartment(departmentService.getById(pid));
		request.setAttribute("department", department);
		return mapping.findForward("editorDeptInfo");	
		
	}


	
}
