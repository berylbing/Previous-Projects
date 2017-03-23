package com.ht706.componentLibrary.myFavorite.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.myFavorite.actionForm.MyFavoriteForm;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.util.UUIDKey;

public class ShowMyFavouriteTreeAction extends DispatchAction {	
	private IMyfavoriteService service;
	private boolean checked=false;

	public IMyfavoriteService getService() {
		return service;
	}
	public void setService(IMyfavoriteService service) {
		this.service = service;
	}
	
	/**
	 * ��ʾ�ղؼ��б�ShowMyFavouriteTreeAction
     * @param form 		MyFavouriteTreeForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��/myFavorite/myFavorite.jsp
     * @exception       no
     */
	public ActionForward ShowMyFavouriteTree(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String UserId= (String)request.getSession().getAttribute("UserName"); 
		MyFavoriteForm f=new MyFavoriteForm();
		List<Myfavorite> m = service.checkRoot();
		if(m.isEmpty())
			checked=false;
		else
			checked=true;
		if(checked==false){
			synchronized (this) {
				Myfavorite mf = new Myfavorite();
				UUIDKey key = UUIDKey.getInstance();
				mf.setRecordId(key.getNewUUID());
				mf.setTypeIs("myFavorite");
				mf.setNodeName("�ҵ��ղ�");
				mf.setParentNode("0");
				mf.setUserId("-1");
				service.create(mf);
				checked=true;
				f.setList(service.serachMyFavoriteFolds(UserId));				
			}
		}else{
			f.setList(service.serachMyFavoriteFolds(UserId));
		}
		request.setAttribute("MyFavouriteTreeForm", f);
		return mapping.findForward("tree");
	}
	/**
	 * ��ʾ�����ղؼ��б�ShowMyFavouriteTreeAction
     * @param form 		MyFavouriteTreeForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��/myFavorite/AllMyFavorite.jsp
     * @exception       no
     */
	public ActionForward AllShowMyFavouriteTree(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String UserID= (String)request.getSession().getAttribute("UserName");
		MyFavoriteForm f=new MyFavoriteForm();
		f.setList(service.serachMyFavoriteFolds(UserID));
		request.setAttribute("MyFavouriteTreeForm", f);
		return mapping.findForward("alltree");
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public boolean isChecked() {
		return checked;
	}
}
