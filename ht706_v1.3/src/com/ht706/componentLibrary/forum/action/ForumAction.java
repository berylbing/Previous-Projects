package com.ht706.componentLibrary.forum.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.forum.actionForm.ForumForumForm;
import com.ht706.componentLibrary.forum.bean.hbm.ForumForum;
import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;

public class ForumAction extends DispatchAction{
	private IForumForumService forumForumService;
	private IForumTopicService forumTopicService;
	public IForumTopicService getForumTopicService() {
		return forumTopicService;
	}

	public void setForumTopicService(IForumTopicService forumTopicService) {
		this.forumTopicService = forumTopicService;
	}

	public void setForumForumService(IForumForumService forumForumService) {
		this.forumForumService = forumForumService;
	}

	public IForumForumService getForumForumService() {
		return forumForumService;
	}
	public ActionForward viewForum(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String fid=(String)request.getParameter("forumId");//获取文件夹树结点ID
		int fid2=Integer.parseInt(fid);//强制类型转换为int		
		
		ForumForumForm fff =new ForumForumForm();
		fff.setForumForum(forumForumService.getForumForumByForumId(fid2));
		fff.setTopicList(forumTopicService.getForumTopicListByForumId(fid2));
		request.setAttribute("ForumForumForm", fff);
		return mapping.findForward("view");
	}
	public ActionForward modifyTopicList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String fid=(String)request.getParameter("forumId");//获取文件夹树结点ID
		int fid2=Integer.parseInt(fid);//强制类型转换为int		
		
		ForumForumForm fff =new ForumForumForm();
		fff.setForumForum(forumForumService.getForumForumByForumId(fid2));
		fff.setTopicList(forumTopicService.getForumTopicListByForumId(fid2));
		request.setAttribute("ForumForumForm", fff);
		return mapping.findForward("manage");
	}
	public ActionForward deleteTopic(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String tid= (String ) request.getParameter("topicId");
		ForumTopic topic = forumTopicService.getForumTopicByTopicId(Integer.parseInt(tid));
		forumTopicService.deleteTopic(topic);
		return modifyTopicList(mapping, form, request, response);
	}
	public ActionForward createForum(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		ForumForumForm fff =(ForumForumForm)form;
		ForumForum ff = new ForumForum();
		ff.setForumname(fff.getForumForum().getForumname());
		ff.setForumread(fff.getForumForum().getForumread());
		ff.setColor(fff.getForumForum().getColor());
		ff.setRule(fff.getForumForum().getRule());
		ff.setPostnum(0);
		ff.setTopicnum(0);
		this.forumForumService.createForum(ff);
		return mapping.findForward("index2");
	}
	
	public ActionForward preModifyForum(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String fid=(String)request.getParameter("forumId");//获取文件夹树结点ID
		int fid2=Integer.parseInt(fid);//强制类型转换为int		
		
		ForumForum ff = forumForumService.getForumForumByForumId(fid2);
		
		request.setAttribute("ff", ff);
		return mapping.findForward("modify");
	}
	public ActionForward modifyForum(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		ForumForumForm fff =(ForumForumForm)form;
		ForumForum ff = fff.getForumForum();
		ForumForum ff2= this.forumForumService.getForumForumByForumId(ff.getForumid());
		ff2.setForumname(ff.getForumname());
		ff2.setForumread(ff.getForumread());
		ff2.setColor(ff.getColor());
		ff2.setRule(ff.getRule());
		this.forumForumService.modifyForum(ff2);
		return mapping.findForward("index2");
	}
	public ActionForward deleteForum(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String fid=(String)request.getParameter("forumId");//获取文件夹树结点ID
		int fid2=Integer.parseInt(fid);//强制类型转换为int		
		
		
		List<ForumTopic> toplist = forumTopicService.getForumTopicListByForumId(fid2);
		for(ForumTopic ele : toplist){
			forumTopicService.deleteTopic(ele);
		}
		
		this.forumForumService.deleteForum(this.forumForumService.getForumForumByForumId(fid2));
		return mapping.findForward("index2");
	}
	
}
