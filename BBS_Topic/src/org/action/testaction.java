package org.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.algorithm.dataPretreatment.crawler.Crawler;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.entity.bean.Posts;
//import org.entity.dao.PostsDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class testaction extends ActionSupport implements ModelDriven<Posts>,ServletRequestAware{

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
	
	public String queuell() throws Exception{
		String board_pre = "http://bbs.xjtu.edu.cn/BMYAXPSNOFWOHFJQQCBBWMQOLESYNICFESMC_B/tdoc?B=";
//		Crawler crawler = new Crawler();
//		String isok = crawler.Crawlerdb(board_pre);
//		List<Posts> postlist = postsdao.findAll();
//		for(Posts e : postlist){
////			System.out.println(isok);
//			System.out.println(e.getTitle());
//		}
//		request.setAttribute("postlist", postlist);
		return "qqqq";
	}

}
