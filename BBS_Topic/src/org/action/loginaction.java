package org.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class loginaction extends ActionSupport implements ModelDriven<String>,ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;
	protected String account = new String();
	protected String password = new String();
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setServletRequest( HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	public String getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public String login() throws Exception{
		String acc = request.getAttribute("account").toString();
		String pwd = request.getAttribute("password").toString();
		if(acc.equals("admin")&&pwd.equals("123"))
		{
			return "success";
		}

		return "error";
	}

}
