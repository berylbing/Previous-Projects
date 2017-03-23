package org.action;

import javax.servlet.http.HttpServletRequest;

import org.algorithm.dataPretreatment.segmentation_weibo.SegFilter;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.entity.bean.Posts;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Clusteraction extends ActionSupport implements ModelDriven<Posts>,ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6786718784773026748L;
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
	
	public String cluster() throws Exception{
		SegFilter segfilter = new SegFilter();
		String isok = segfilter.seg_Filter();
		if(isok.equals("success")){
			System.out.println(isok);
			return "cluster_success";
			}
		return "error";
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
