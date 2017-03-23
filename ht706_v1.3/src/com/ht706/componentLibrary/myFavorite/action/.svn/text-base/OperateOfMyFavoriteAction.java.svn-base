package com.ht706.componentLibrary.myFavorite.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentFeedBack.actionForm.FeedbackForm;
import com.ht706.componentLibrary.myFavorite.actionForm.MyFavoriteForm;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.ICheckItemService;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.util.UUIDKey;

public class OperateOfMyFavoriteAction extends DispatchAction{
	
	/**
	 * 新建我的收藏文件夹createMyFavoriteAction
     * @param form 	    MyFavoriteForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向/myFavorite/add_M.jsp
     * @exception       no
     */
	public ActionForward addMyFavoriteAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		String UserID = (String)request.getSession().getAttribute("UserName");
		
		MyFavoriteForm f=new MyFavoriteForm();
		f.setList(service.serachMyFavoriteFolds(UserID));
		request.setAttribute("MyFavoriteForm", f);
		request.setAttribute("list", f.getList());
		return mapping.findForward("addMyFavorite");
	}
	
	
	/**
	 * 保存新建我的收藏文件夹createMyFavoriteAction
     * @param form 		MyFavoriteForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向/myFavorite/add_M.jsp
     * @exception       no
     */
	public ActionForward createMyFavoriteAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String UserID = (String)request.getSession().getAttribute("UserName"); 
		MyFavoriteForm mff = (MyFavoriteForm)form;
		Myfavorite mf = new Myfavorite();
		UUIDKey key = UUIDKey.getInstance();
		
		SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
		
		mf.setRecordId(key.getNewUUID());
		mf.setNodeName(mff.getMyfavorite().getNodeName());
		
		if(mff.getMyfavorite().getParentNode()==null)
			mf.setParentNode("0");
		else
			mf.setParentNode(mff.getMyfavorite().getParentNode());
		
		mf.setUrl(mff.getMyfavorite().getUrl());
		mf.setDescription(mff.getMyfavorite().getDescription());
		mf.setDateOfInformation(formate.parse(mff.getDateOfInformation()));
		
		mf.setTypeIs("myFavorite");
		mf.setUserId(UserID);
		service.create(mf);
		
		return mapping.findForward("operate");
	}
	
	
	/**
	 * 删除我的收藏文件夹createMyFavoriteAction
     * @param form 		MyFavoriteForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward deleteMyFavoriteAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String nodeId=(String)request.getParameter("nodeId");
		String UserID = (String)request.getSession().getAttribute("UserName");
	    service.delete(nodeId);		
		return mapping.findForward("operate");
	}
	
	
	/**
	 * 修改我的收藏文件夹-显示createMyFavoriteAction
     * @param form 		MyFavoriteForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward editMyFavoriteAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String nodeId=(String)request.getParameter("nodeId");
	    Myfavorite m=service.getMyFavorite(nodeId);
	    MyFavoriteForm mff= new MyFavoriteForm();
	    mff.setMyfavorite(m);	    
	    
        String UserID = (String)request.getSession().getAttribute("UserName");
		mff.setList(service.serachMyFavoriteModifyFolds(UserID,nodeId));		
		request.setAttribute("list", mff.getList());
		request.setAttribute("MyFavoriteForm", mff);	    
		return mapping.findForward("editMyFavorite");
	}
	
	
	/**
	 * 更新我的收藏文件夹createMyFavoriteAction
     * @param form 		MyFavoriteForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward updateMyFavoriteAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		MyFavoriteForm mff = (MyFavoriteForm)form;		
		String UserID = (String)request.getSession().getAttribute("UserName");		
		request.setAttribute("list", mff.getList());		
		SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
		mff.getMyfavorite().setDateOfInformation(formate.parse(mff.getDateOfInformation()));
		mff.getMyfavorite().setUserId(UserID);	
		mff.getMyfavorite().setTypeIs("myFavorite");
		service.update(mff.getMyfavorite());

		return mapping.findForward("operate");
	}
	
	
	/**
	 * 检查我的收藏文件夹createMyFavoriteAction
     * @param form 		MyFavoriteForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */	
	public ActionForward checkName(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String name = new String(request.getParameter("Name"));
		String UserID = (String)request.getSession().getAttribute("UserName");
		List<Myfavorite> m = service.listCheckedResult(UserID,name);
		if(m == null || m.size()== 0)
			response.getWriter().write("ok");
		else
			response.getWriter().write("error");
		
		return null;
	}
	
	
	private IMyfavoriteService service;

	public IMyfavoriteService getService() {
		return service;
	}
	public void setService(IMyfavoriteService service) {
		this.service = service;
	}

}