package org.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.entity.Answers;
import org.search.Search_main;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SearchAction extends ActionSupport implements ModelDriven<Answers>,ServletRequestAware{

	/**
	 * @author bing
	 * @param args
	 * @Time 2012-2-25
	 */
	private static final long serialVersionUID = 1L;

	protected HttpServletRequest request;
	private ArrayList<Answers> answerlist = new ArrayList<Answers>();
	
	public Answers getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		
	}

	public String query() throws IOException{
		Search_main search = new Search_main();
		String question = request.getParameter("query");
		System.out.println(question);
		answerlist = search.Question_search(question);
		//System.out.println(question);
		return "success";
	}

	public ArrayList<Answers> getAnswerlist() {
		return answerlist;
	}

	public void setAnswerlist(ArrayList<Answers> answerlist) {
		this.answerlist = answerlist;
	}
	
}
