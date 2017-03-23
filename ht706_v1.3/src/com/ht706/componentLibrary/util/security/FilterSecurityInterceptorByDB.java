package com.ht706.componentLibrary.util.security;

import java.util.LinkedHashMap;
import org.springframework.security.intercept.web.FilterInvocationDefinitionSource;
import org.springframework.security.intercept.web.FilterSecurityInterceptor;
import org.springframework.security.util.UrlMatcher;

import com.ht706.componentLibrary.util.security.bo.IUserService;


public class FilterSecurityInterceptorByDB extends FilterSecurityInterceptor implements IFilterSecurityInterceptorByDB{
	private IUserService service;

	public void setService(IUserService service) {
		this.service = service;
	}

	public IUserService getService() {
		return service;
	}
	 public void refresh(){
	    UrlMatcher urlMatcher = new MyAntUrlPathMatcher();
	    LinkedHashMap requestMap = service.getURLMap(); 
		super.setObjectDefinitionSource(new MyDefaultFilterInvocationDefinitionSource(urlMatcher,requestMap));
	 }
	 
	public void setObjectDefinitionSource(FilterInvocationDefinitionSource newSource) {
//	       System.out.println("--------------------------------class: "+newSource.getClass());
//	       for(Object i:newSource.getConfigAttributeDefinitions()){
//	    	   System.out.println("------------------ConfigAttributeDefinitions: "+i);
//	    	   //System.out.println("------------------Attributes: "+newSource.getAttributes("/index2.html"));
//	       }
//		super.setObjectDefinitionSource(newSource);
		refresh();
	}
}
