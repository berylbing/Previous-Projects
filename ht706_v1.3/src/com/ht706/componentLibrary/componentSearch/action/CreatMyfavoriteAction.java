package com.ht706.componentLibrary.componentSearch.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.myFavorite.actionForm.MyFavoriteForm;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.util.UUIDKey;

public class CreatMyfavoriteAction extends DispatchAction {
	private IMyfavoriteService myfavoriteService;
	
	public ActionForward CreatMyfavorite (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		Myfavorite m=new Myfavorite();
		m.setAssetUniqueId((String)request.getParameter("AssetID"));
		m.setDateOfInformation(new Date());
		m.setParentNode((String)request.getParameter("AssetID"));
		UUIDKey key=UUIDKey.getInstance();
		m.setRecordId(key.getNewUUID());
		//m.setTypeIs("Checkout");
		m.setUrl("localhost");
		m.setUserId((String)request.getSession().getAttribute("UserName"));
		myfavoriteService.create(m);
		response.getWriter().print("<script>window.close();</script>");
		return null;
		
	}

	public ActionForward ShowMyFavouriteTree(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String UserId= (String)request.getSession().getAttribute("UserName"); 
		MyFavoriteForm f=new MyFavoriteForm();
		f.setList(myfavoriteService.getMyFavouriteList(UserId));
		request.setAttribute("MyFavouriteTreeForm", f);
		System.out.println("----------------------------id:"+request.getParameter("id"));
		request.setAttribute("AssetId",request.getParameter("id"));
		return mapping.findForward("tree");
	}
	
	public void setMyfavoriteService(IMyfavoriteService myfavoriteService) {
		this.myfavoriteService = myfavoriteService;
	}

	public IMyfavoriteService getMyfavoriteService() {
		return myfavoriteService;
	}
}
