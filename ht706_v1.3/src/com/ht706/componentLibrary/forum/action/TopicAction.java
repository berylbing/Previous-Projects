package com.ht706.componentLibrary.forum.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.forum.actionForm.ForumTopicForm;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.bo.IForumThreadService;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;

public class TopicAction extends Action {
	private IForumForumService forumForumService;
	private IForumTopicService forumTopicService;
	private IForumThreadService forumThreadService;
	public IForumForumService getForumForumService() {
		return forumForumService;
	}

	public void setForumForumService(IForumForumService forumForumService) {
		this.forumForumService = forumForumService;
	}
	public void setForumTopicService(IForumTopicService forumTopicService) {
		this.forumTopicService = forumTopicService;
	}

	public IForumTopicService getForumTopicService() {
		return this.forumTopicService;
	}

	public void setForumThreadService(IForumThreadService forumThreadService) {
		this.forumThreadService = forumThreadService;
	}

	public IForumThreadService getForumThreadService() {
		return forumThreadService;
	}
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception{
		ForumTopicForm ftf = new ForumTopicForm();	
		String fid = request.getParameter("forumId");
		int fid2=Integer.parseInt(fid);
		String tid = request.getParameter("topicId");
		int tid2=Integer.parseInt(tid);
		ftf.setForumForum(forumForumService.getForumForumByForumId(fid2));
		ftf.setForumTopic(forumTopicService.getForumTopicByTopicId(tid2));
		ftf.setForumThreadList(forumThreadService.getForumThreadListByTopicId(tid2));
		request.setAttribute("ForumTopicForm", ftf);
		forumTopicService.modifyHitNum(tid2);
		return mapping.findForward("suc");
		
	}
	
}
