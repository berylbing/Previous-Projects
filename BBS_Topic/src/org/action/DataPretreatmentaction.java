package org.action;

import javax.servlet.http.HttpServletRequest;

import org.algorithm.dataPretreatment.crawler.Crawler;
import org.algorithm.dataPretreatment.segmentation_weibo.SegFilter;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.entity.bean.Posts;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DataPretreatmentaction extends ActionSupport implements ModelDriven<Posts>,ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 66440550580323732L;
	private Posts post = new Posts();
//	private PostsDAO postsdao = new PostsDAO();
	protected HttpServletRequest request;
//	private message;
	public Posts getModel() {
		// TODO Auto-generated method stub
		return post;
	}

	public void setServletRequest( HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	public String test(){
		System.out.println("ooooooooo");
		return "ss";
	}
	
	public String crawler() throws Exception{
//		String board_pre = "http://bbs.xjtu.edu.cn/BMYAXPSNOFWOHFJQQCBBWMQOLESYNICFESMC_B/tdoc?B=";
//		Crawler crawler = new Crawler();
//		String isok = crawler.Crawlerdb(board_pre);
//		if(isok.equals("success")){
//			System.out.println(isok);
//			return "crawler_success";
//			}
		return "error";
//		return "crawler_success";
	}
	
	public String segfilter() throws Exception{
		SegFilter segfilter = new SegFilter();
		String isok = segfilter.seg_Filter();
		if(isok.equals("success")){
			System.out.println(isok);
			return "seg_success";
			}
		return "error";
	}

}
