package com.ht706.componentLibrary.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.security.Authentication;
import org.springframework.security.context.SecurityContextImpl;
import org.springframework.security.userdetails.UserDetails;

import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;
import com.ht706.componentLibrary.util.MessageBox;
import com.ht706.componentLibrary.util.security.FilterSecurityInterceptorByDB;


public class DefaultAction extends DispatchAction {
	
	private FilterSecurityInterceptorByDB sec;
	private IOrganizationDAO organizationDAO;

	//管理员登录验证
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		
		SecurityContextImpl s=(SecurityContextImpl)request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
		if(s!=null){
			Authentication a=(Authentication)s.getAuthentication();
			UserDetails u=(UserDetails)a.getPrincipal();
			Organization o=(Organization)organizationDAO.findByUserName(u.getUsername()).get(0);
			request.getSession().setAttribute("UserRealName", o.getName());
			request.getSession().setAttribute("UserName", u.getUsername());
			request.getSession().setAttribute("UserID", o.getUserId());
		}
		//sec.refresh();
		return mapping.findForward("default");
	}
	public FilterSecurityInterceptorByDB getSec() {
		return sec;
	}
	public void setSec(FilterSecurityInterceptorByDB sec) {
		this.sec = sec;
	}
	public ActionForward execute2(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		MessageBox m = new MessageBox();
		m.setImage("2");//要显示的图片
		m.setMessage("错误！");//加入错误信息
		request.setAttribute("message", m);
		return mapping.findForward("errormessagebox");
	}
	//setter and getter
	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}
	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}
}
