package com.ht706.componentLibrary.systemManagement.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.systemManagement.actionForm.BasicInfoForm;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Contactis;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
import com.ht706.componentLibrary.systemManagement.bo.ILibraryService;

/**
 * 
 * @Document:
 * @author: zd
 * @Time: 2010-08-31 
 *
 */



public class BasicInfoAction extends DispatchAction {
	
	private ILibraryService libraryService;
	
	public ILibraryService getLibraryService() {
		return libraryService;
	}

	public void setLibraryService(ILibraryService libraryService) {
		this.libraryService = libraryService;
	}
	/**
	 * 修改时原信息准备action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preBasicInfoForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BasicInfoForm bf=new BasicInfoForm();
		Library library= libraryService.getById("1");
		if(library!=null){
			bf.setLibrary(library);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			bf.setDateOfCreation(sdf.format(library.getDateOfCreation()));
			request.setAttribute("bf", bf);
			return mapping.findForward("editor");
		}
		else return mapping.getInputForward();
	}
	/**
	 * 修改action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward modifyBasicInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		BasicInfoForm bf=(BasicInfoForm)form;
		Library library=bf.getLibrary();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		library.setDateOfCreation(sdf.parse(bf.getDateOfCreation()));
		library.setLibraryUniqueId("1");
		libraryService.modify(library);
		this.getBasicInfo(mapping, form, request, response);
		return mapping.findForward("basicInfo");
	}

	/**
	 * 显示库基本属性action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward getBasicInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		BasicInfoForm bf=new BasicInfoForm();
		Library library= libraryService.getById("1");
		if(library!=null){
			bf.setLibrary(library);
			request.setAttribute("BasicInfoForm", bf);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			bf.setDateOfCreation(sdf.format(library.getDateOfCreation()));
			Set<Contactis> contactisesList=bf.getLibrary().getContactises();
			request.setAttribute("AdminList", contactisesList);
			return mapping.findForward("basicInfo");
		}
		else return mapping.getInputForward();
	}
	

}
