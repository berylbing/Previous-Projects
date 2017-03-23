package com.ht706.componentLibrary.forum.action;

import java.net.InetAddress;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.forum.actionForm.ForumPublishThreadForm;
import com.ht706.componentLibrary.forum.actionForm.ForumTopicForm;
import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.bo.IForumThreadService;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;

public class PublishThreadAction extends Action {
	private IForumTopicService forumTopicService;
	private IForumThreadService forumThreadService;
	private IForumForumService forumForumService;
	public void setForumTopicService(IForumTopicService forumTopicService) {
		this.forumTopicService = forumTopicService;
	}
	public IForumTopicService getForumTopicService() {
		return forumTopicService;
	}
	public void setForumThreadService(IForumThreadService forumThreadService) {
		this.forumThreadService = forumThreadService;
	}
	public IForumForumService getForumForumService() {
		return forumForumService;
	}
	public void setForumForumService(IForumForumService forumForumService) {
		this.forumForumService = forumForumService;
	}
	public IForumThreadService getForumThreadService() {
		return forumThreadService;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		
		ForumPublishThreadForm fptf=(ForumPublishThreadForm)form;
		int fid=fptf.getForumId();
		int tid=fptf.getTopicId();
		int userid = (Integer) request.getSession().getAttribute("UserID");	
		String username =(String)request.getSession().getAttribute("UserName");
		
		ForumThread	forumThread = new ForumThread();
		forumThread.setContent(fptf.getContent());
		forumThread.setTopicid(tid);
		forumThread.setPosttime(new Date());
		forumThread.setUserid(userid);
		forumThread.setUsername(username);
		InetAddress addr = InetAddress.getLocalHost();
		String ip=addr.getHostAddress().toString();
		forumThread.setPostip(ip);
		
		forumThreadService.createThread(forumThread);
		
		ForumTopicForm ftf = new ForumTopicForm();	
		ftf.setForumForum(forumForumService.getForumForumByForumId(fid));
		ftf.setForumTopic(forumTopicService.getForumTopicByTopicId(tid));
		ftf.setForumThreadList(forumThreadService.getForumThreadListByTopicId(tid));
		request.setAttribute("ForumTopicForm", ftf);
		return mapping.findForward("suc");
	}
}
