package org.action;

import javax.servlet.http.HttpServletRequest;

import org.algorithm.dataPretreatment.segmentation_weibo.SegFilter;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.entity.bean.Posts;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class HotTopicsaction extends ActionSupport implements ModelDriven<Posts>,ServletRequestAware {

	/**
	 * @param args
	 */
	private Posts post = new Posts();
	protected HttpServletRequest request;

	public Posts getModel() {
		// TODO Auto-generated method stub
		return post;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	public String hottopics(){
		return "success";
	}
	public String hottopics2(){
		return "success2";
	}
	
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// }

}
