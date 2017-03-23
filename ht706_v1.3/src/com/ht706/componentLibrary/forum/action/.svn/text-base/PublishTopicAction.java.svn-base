package com.ht706.componentLibrary.forum.action;

import java.net.InetAddress;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.forum.actionForm.ForumForumForm;
import com.ht706.componentLibrary.forum.actionForm.ForumPublishTopicForm;
import com.ht706.componentLibrary.forum.bean.hbm.ForumThread;
import com.ht706.componentLibrary.forum.bean.hbm.ForumTopic;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.bo.IForumThreadService;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;

public class PublishTopicAction extends Action {
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
		ForumPublishTopicForm fptf = (ForumPublishTopicForm)form;
		int fid =fptf.getForumId();
		int userid = (Integer) request.getSession().getAttribute("UserID");	
		String username =(String)request.getSession().getAttribute("UserName");
		
		ForumTopic forumTopic = new ForumTopic();
		forumTopic.setForumid(fid);
		forumTopic.setTopicname(fptf.getTopicName());
		forumTopic.setHitnum(0);
		forumTopic.setReplynum(0);
		forumTopic.setReplyname("");
		Date now = new Date();
		forumTopic.setPosttime(now);
		forumTopic.setReplytime(now);
		forumTopic.setUserid(userid);
		forumTopic.setUsername(username);
		forumTopicService.createTopic(forumTopic);

		ForumThread forumThread = new ForumThread();
		forumThread.setUserid(userid);
		forumThread.setUsername(username);
		forumThread.setTopicid(forumTopic.getTopicid());
		forumThread.setPosttime(now);
		InetAddress addr = InetAddress.getLocalHost();
		String ip=addr.getHostAddress().toString();
		forumThread.setPostip(ip);
		forumThread.setContent(fptf.getContent());
	
		forumThreadService.createThread(forumThread);
	
		ForumForumForm fff = new ForumForumForm();
		fff.setForumForum(forumForumService.getForumForumByForumId(fptf.getForumId()));
		fff.setTopicList(forumTopicService.getForumTopicListByForumId(fptf.getForumId()));
		request.setAttribute("ForumForumForm",fff);
	
		return mapping.findForward("suc");
	}
}
