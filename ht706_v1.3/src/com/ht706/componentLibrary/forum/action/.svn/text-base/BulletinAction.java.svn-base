package com.ht706.componentLibrary.forum.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.forum.actionForm.ForumBulletinForm;
import com.ht706.componentLibrary.forum.bean.hbm.ForumBulletin;
import com.ht706.componentLibrary.forum.bo.IForumBulletinService;

public class BulletinAction extends DispatchAction{
	private IForumBulletinService forumBulletinService;
	
	public IForumBulletinService getForumBulletinService(){
		return this.forumBulletinService;
	}
	public void setForumBulletinService(IForumBulletinService forumBulletinService){
		this.forumBulletinService=forumBulletinService;
	}
	public ActionForward viewBulletin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{

		ForumBulletinForm fbf = new ForumBulletinForm();
		fbf.setForumBulletinList(forumBulletinService.getForumBulletinList());
		request.setAttribute("ForumBulletinForm", fbf);
		return mapping.findForward("view");
		
	}
	public ActionForward manageBulletin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{

		ForumBulletinForm fbf = new ForumBulletinForm();
		fbf.setForumBulletinList(forumBulletinService.getForumBulletinList());
		request.setAttribute("ForumBulletinForm", fbf);
		return mapping.findForward("manage");
		
	}
	public ActionForward publishBulletin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		int userid = (Integer) request.getSession().getAttribute("UserID");	
		String username =(String)request.getSession().getAttribute("UserName");
		
		ForumBulletinForm fbf = (ForumBulletinForm)form;
		ForumBulletin forumBulletin = new ForumBulletin();
		forumBulletin.setContent(fbf.getContent());
		forumBulletin.setJoindate(new Date());
		forumBulletin.setTitle(fbf.getTitle());
		forumBulletin.setUserid(userid);
		forumBulletin.setUsername(username);
		forumBulletinService.createBulletin(forumBulletin);
		
		return  manageBulletin(mapping,form,request,response);
		
	}
	public ActionForward deleteBulletin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		int bid = Integer.parseInt(request.getParameter("bulletinId"));
		ForumBulletin forumBulletin = forumBulletinService.getFuromBulletinByBulletinId(bid);
		forumBulletinService.deleteBulletinByBulletinId(forumBulletin);
		return manageBulletin(mapping,form,request,response);
		
	}
}
