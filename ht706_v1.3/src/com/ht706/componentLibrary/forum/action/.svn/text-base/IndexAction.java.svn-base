package com.ht706.componentLibrary.forum.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.forum.actionForm.ForumIndexForm;
import com.ht706.componentLibrary.forum.bo.IForumBulletinService;
import com.ht706.componentLibrary.forum.bo.IForumForumService;

public class IndexAction extends DispatchAction{
	private IForumBulletinService forumBulletinService;
	private IForumForumService forumForumService;
	public IForumForumService getForumForumService() {
		return forumForumService;
	}
	public void setForumForumService(IForumForumService forumForumService) {
		this.forumForumService = forumForumService;
	}
	public IForumBulletinService getForumBulletinService(){
		return this.forumBulletinService;
	}
	public void setForumBulletinService(IForumBulletinService forumBulletinService){
		this.forumBulletinService=forumBulletinService;
	}


	public ActionForward viewIndex(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{

		ForumIndexForm fhf = new ForumIndexForm();
		fhf.setForumBulletinList(forumBulletinService.getForumBulletinList());
		fhf.setForumForumList(forumForumService.getForumFroumList());
		request.setAttribute("ForumHomeForm", fhf);
		return mapping.findForward("view");
	}
	public ActionForward adminIndex(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{

		ForumIndexForm fhf = new ForumIndexForm();
		fhf.setForumBulletinList(forumBulletinService.getForumBulletinList());
		fhf.setForumForumList(forumForumService.getForumFroumList());
		request.setAttribute("ForumHomeForm", fhf);
		return mapping.findForward("admin");
	}
	public ActionForward manageForumList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{

		ForumIndexForm fhf = new ForumIndexForm();
		fhf.setForumForumList(forumForumService.getForumFroumList());
		request.setAttribute("ForumHomeForm", fhf);
		return mapping.findForward("manage");
	}
	
}
