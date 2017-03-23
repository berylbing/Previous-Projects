package com.ht706.componentLibrary.util.security.bo.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

import org.springframework.security.ConfigAttribute;
import org.springframework.security.ConfigAttributeDefinition;
import org.springframework.security.SecurityConfig;
import org.springframework.security.intercept.web.RequestKey;
import com.ht706.componentLibrary.util.security.bean.hbm.Actorandurl;
import com.ht706.componentLibrary.util.security.bo.IUserService;
import com.ht706.componentLibrary.util.security.dao.IActorandurlDAO;



public class UserService implements IUserService {
	private IActorandurlDAO actorandurlDAO;
	public LinkedHashMap getURLMap() {
        LinkedHashMap map = new LinkedHashMap();
        ArrayList<Actorandurl> ar= ( ArrayList<Actorandurl>)actorandurlDAO.findAll();
        for(Actorandurl j:ar){
        	//System.out.println("-------------------- "+j.getId().getResponsibility()+" : "+j.getId().getUrl());
        }
        HashMap<String,HashSet<String>> urlToRole=new  HashMap<String,HashSet<String>>();
        for(Actorandurl i:ar){
        	if(urlToRole.containsKey(i.getId().getUrl())) {
        		urlToRole.get(i.getId().getUrl()).add(i.getId().getResponsibility());
        	}else {
        		HashSet<String> tmp=new HashSet<String>();
        		tmp.add(i.getId().getResponsibility());
        		urlToRole.put(i.getId().getUrl(), tmp);
        	}
        }
        ArrayList<ConfigAttribute> roles;
        for(String j:urlToRole.keySet()){
        	roles=new ArrayList<ConfigAttribute>();
        	HashSet<String> tmp=urlToRole.get(j);
        	//System.out.println("-------------------------url: "+j);
        	for(String m:tmp){
        		roles.add(new SecurityConfig(m));
        		//System.out.println("--------------------------------role: "+m);
        	}
        	map.put(new RequestKey(j),new ConfigAttributeDefinition(roles));
        }
        for(Object k:map.keySet()){
        	System.out.println("-------------------------key: "+k+"        ConfigAttributeDefinition: "+map.get(k));
        }

	
		return map;
	
	}
	public void setActorandurlDAO(IActorandurlDAO actorandurlDAO) {
		this.actorandurlDAO = actorandurlDAO;
	}
	public IActorandurlDAO getActorandurlDAO() {
		return actorandurlDAO;
	}
}