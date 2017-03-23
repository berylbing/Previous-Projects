package com.ht706.componentLibrary.systemManagement.action;
import org.jbpm.api.listener.EventListener;
import org.jbpm.api.listener.EventListenerExecution;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ht706.componentLibrary.componentRelease.bo.IComponentService;
import com.ht706.componentLibrary.util.SpringContextUtil;

public class ProcessEventListener implements EventListener{
	private IComponentService service;
	
	
	public void notify(EventListenerExecution arg0) throws Exception {
		// TODO Auto-generated method stub
//		String path= (String) arg0.getVariable("servicePath");
//		System.out.println(path);
//		ApplicationContext ac = new FileSystemXmlApplicationContext(path+"/WEB-INF/applicationContext_temp.xml");
		//service=(IComponentService) ac.getBean("ComponentServiceProxy");
		service = (IComponentService) SpringContextUtil.getBean("ComponentServiceProxy");
		System.out.println((String)arg0.getVariable("id"));
		service.jbpm_Creat_Classificationindex((String)arg0.getVariable("id"));
		
		
		System.out.println("°¢¶Å´ó±¿µ°");
		
	}


	public void setService(IComponentService service) {
		this.service = service;
	}


	public IComponentService getService() {
		return service;
	}

}
