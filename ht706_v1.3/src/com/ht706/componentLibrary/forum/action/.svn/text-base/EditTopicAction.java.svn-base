package com.ht706.componentLibrary.forum.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.forum.actionForm.ForumPublishTopicForm;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.bo.IForumThreadService;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;

public class EditTopicAction extends Action {
	
	private IForumThreadService forumThreadService;
	private IForumForumService forumForumService;
	private IForumTopicService forumTopicService;
	
	public void setForumThreadService(IForumThreadService forumThreadService) {
		this.forumThreadService = forumThreadService;
	}
	public IForumThreadService getForumThreadService() {
		return forumThreadService;
	}
	public IForumForumService getForumForumService() {
		return forumForumService;
	}
	public void setForumForumService(IForumForumService forumForumService) {
		this.forumForumService = forumForumService;
	}
	public IForumTopicService getForumTopicService() {
		return forumTopicService;
	}
	public void setForumTopicService(IForumTopicService forumTopicService) {
		this.forumTopicService = forumTopicService;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		ForumPublishTopicForm fptf = new ForumPublishTopicForm();
		int fid = Integer.parseInt(request.getParameter("forumId"));
		fptf.setForumId(fid);
		fptf.setForumName(forumForumService.getForumForumByForumId(fid).getForumname());
		request.setAttribute("ForumPublishTopicForm", fptf);
		return mapping.findForward("suc");
	}

}
