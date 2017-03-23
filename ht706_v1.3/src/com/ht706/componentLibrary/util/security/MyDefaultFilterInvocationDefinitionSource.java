package com.ht706.componentLibrary.util.security;

import java.util.Collection;

import java.util.LinkedHashMap;

import org.springframework.security.ConfigAttributeDefinition;
import org.springframework.security.intercept.web.DefaultFilterInvocationDefinitionSource;

import org.springframework.security.util.UrlMatcher;

public class MyDefaultFilterInvocationDefinitionSource extends
		DefaultFilterInvocationDefinitionSource {

	public MyDefaultFilterInvocationDefinitionSource(UrlMatcher urlMatcher,
			LinkedHashMap requestMap) {
		super(urlMatcher, requestMap);
		// TODO Auto-generated constructor stub
	}
	 public ConfigAttributeDefinition getAttributes(Object object) throws IllegalArgumentException {
		 ConfigAttributeDefinition c=super.getAttributes(object);
		 //System.out.println("==========ob: "+object+"========ConfigAttributeDefinition"+c);
	    return c;
	 }
	 public Collection getConfigAttributeDefinitions() {
		 Collection c=super.getConfigAttributeDefinitions();
//		 for(Object i:c){
//			 System.out.println("==========Collection: "+i);
//		 }
		 return c;
	 }
}
