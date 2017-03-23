package com.ht706.componentLibrary.componentSearch.action;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessEngine;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof;
import com.ht706.componentLibrary.componentRelease.bo.IComponentElementService;
import com.ht706.componentLibrary.componentRelease.bo.IComponentService;
import com.ht706.componentLibrary.componentSearch.actionForm.CheckoutForm;
import com.ht706.componentLibrary.componentSearch.actionForm.CheckoutList;
import com.ht706.componentLibrary.componentSearch.bo.ICheckoutService;
import com.ht706.componentLibrary.componentStaticsReport.bean.hbm.Checkoutrecord;


public class CheckoutAction extends DispatchAction {
	private IComponentService service;
	private IComponentElementService elementService;
	private ICheckoutService checkoutService;
	private ProcessEngine processEngine;
	
	public ActionForward checkout (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		CheckoutForm f=(CheckoutForm)form;
		System.out.println("------------------checkoutAction:  form:  asset: id: "+f.getCheckout().getUniqueId());
		Asset a=service.ViewComponentService(f.getCheckout().getUniqueId());
		CheckoutList cf=new CheckoutList();
		
		for(Ismadeof i:((Set<Ismadeof>)a.getIsmadeofs())){
			cf.getElements().add(i.getElement());
		}
		checkoutService.checkout(f.getCheckout());
		System.out.println("------------------checkoutAction: it is all ok");
		request.setAttribute("CheckoutList", cf);
		/*********************************************************/
		
		ExecutionService executionService = processEngine.getExecutionService();
		Map<String , Object > map= new HashMap<String,Object>();
		String username = (String) request.getSession().getAttribute("UserName");
		map.put("owner",  username );
		map.put("id", f.getCheckout().getRid());
		map.put("actionName", "myFavorite/CheckoutByMe.do?method=CheckoutByMe&id=");
		
		map.put("table", "checkoutrecord");
		map.put("property", "status");
		map.put("UUID", "rid");
		map.put("出库报告单","1");
		map.put("审核","2");
		map.put("出库","3");
		map.put("description", "构件出库工作流");
		
		executionService.startProcessInstanceByKey("ComponentCheckout", map,f.getCheckout().getRid());
		
		/*******************************************************/
		
		
		
		return mapping.findForward("checkoutlist");
	}
	
	public ActionForward preCheckout (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String id=request.getParameter("Asset");
		Asset a=service.ViewComponentService(id);
		CheckoutForm f=new CheckoutForm();
		f.setAsset(a);
		//f.setCheckout(new Checkoutrecord());
		request.setAttribute("CheckoutForm", f);
		return mapping.findForward("checkout");
	}
	
	
	public void setElementService(IComponentElementService elementService) {
		this.elementService = elementService;
	}
	public IComponentElementService getElementService() {
		return elementService;
	}
	public void setService(IComponentService service) {
		this.service = service;
	}
	public IComponentService getService() {
		return service;
	}

	public void setCheckoutService(ICheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	public ICheckoutService getCheckoutService() {
		return checkoutService;
	}

	public ProcessEngine getProcessEngine() {
		return processEngine;
	}

	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}
	
	
}
