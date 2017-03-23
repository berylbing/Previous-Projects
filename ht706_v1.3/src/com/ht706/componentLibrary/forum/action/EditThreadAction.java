package com.ht706.componentLibrary.forum.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.forum.actionForm.ForumPublishThreadForm;
import com.ht706.componentLibrary.forum.bo.IForumForumService;
import com.ht706.componentLibrary.forum.bo.IForumThreadService;
import com.ht706.componentLibrary.forum.bo.IForumTopicService;

public class EditThreadAction extends Action{
	private IForumThreadService forumThreadService;
	private IForumForumService forumForumService;
	private IForumTopicService forumTopicService;
	public IForumThreadService getForumThreadService() {
		return forumThreadService;
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
	public IForumTopicService getForumTopicService() {
		return forumTopicService;
	}
	public void setForumTopicService(IForumTopicService forumTopicService) {
		this.forumTopicService = forumTopicService;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		System.out.println("----------------------------------------editSt");
		ForumPublishThreadForm fptf = new ForumPublishThreadForm();
		int fid = Integer.parseInt(request.getParameter("forumId"));
		int tid = Integer.parseInt(request.getParameter("topicId"));
		fptf.setForumId(fid);
		fptf.setForumName(forumForumService.getForumForumByForumId(fid).getForumname());
		fptf.setTopicId(tid);
		fptf.setTopicName(forumTopicService.getForumTopicByTopicId(tid).getTopicname());
		request.setAttribute("ForumPublishThreadForm", fptf);
		return mapping.findForward("suc");
	}
}
