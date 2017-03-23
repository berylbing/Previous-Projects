/**
 * @FileName	ItemFunctionAction.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.action
 * @author ������
 * @Time 2010-9-2	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.ht706.componentLibrary.componentFeedBack.actionForm.ItemFunctionForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ItemFunction;
import com.ht706.componentLibrary.componentFeedBack.bo.IItemFunctionService;
import com.ht706.componentLibrary.util.Constant;
import com.ht706.componentLibrary.util.MessageBox;

/**
 * ItemFunction Actionʵ����
 * @param	itemFunctionService	ItemFunctionService����
 * @method 	listAllItemFunction	�г����������
 * @method 	getItemFunctionById	ͨ��itemFID��ѯ�����
 * @method 	create				����һ�������
 * @method 	preModify			�޸�һ��������Ԥ����
 * @method 	modify				�޸�һ�������
 * @method 	deleteById			ͨ��itemFIDɾ��һ�������
 */
public class ItemFunctionAction extends DispatchAction {
	
	private IItemFunctionService itemFunctionService;
	
	public IItemFunctionService getItemFunctionService() {
		return itemFunctionService;
	}
	public void setItemFunctionService(IItemFunctionService itemFunctionService) {
		this.itemFunctionService = itemFunctionService;
	}

	/**
	 * �г����еķ��������
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward listAllItemFunction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int totalSize = itemFunctionService.listAll().size();
		int totalPage = (int) Math.ceil(totalSize / (float) (Constant.PAGE_LINES));
		int page = 1;
		if (request.getParameter("page")!=null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page - 1) * (Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		
		List<ItemFunction> itemFunctionList = itemFunctionService.findByNumber(start, offset);
		request.setAttribute("itemFunctionList", itemFunctionList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNumbers", page);
		request.setAttribute("pagelines", offset);
		request.setAttribute("totalSize", totalSize);
		return mapping.findForward("listItemFunctionSuccess");
	}
	
	/**
	 * �������������
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward create(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ItemFunctionForm ifForm = (ItemFunctionForm) form;
		ItemFunction itemFunction = new ItemFunction();
		itemFunction.setFuncName(ifForm.getFuncName());
		itemFunction.setDescription(ifForm.getDescription());	
		itemFunctionService.create(itemFunction);
		return mapping.findForward("createSuccess");
	}
	
	/**
	 * �޸ķ���������Ԥ����
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward preModify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int itemFID = Integer.parseInt(request.getParameter("itemFID"));
		ItemFunction itemFunction = itemFunctionService.getItemFunctionById(itemFID);
		request.setAttribute("itemFunction", itemFunction);
		return mapping.findForward("preModifySuccess");
	}
	
	/**
	 * �޸ķ��������
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward modify(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ItemFunctionForm ifForm = (ItemFunctionForm) form;
		int itemFID = Integer.parseInt(request.getParameter("itemFID"));
		ItemFunction itemFunction = itemFunctionService.getItemFunctionById(itemFID);
		itemFunction.setFuncName(ifForm.getFuncName());
		itemFunction.setDescription(ifForm.getDescription());
		itemFunctionService.modify(itemFunction);
		return mapping.findForward("modifySuccess");
	}
	
	/**
	 * ɾ�����������
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int itemFID = Integer.parseInt(request.getParameter("itemFID"));
		try {
			itemFunctionService.deleteById(itemFID);
			return mapping.findForward("deleteSuccess");
		} catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");						//Ҫ��ʾ��ͼƬ
			m.setMessage("����: �����ѱ����ã�����ɾ����");			//���������Ϣ
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
		
	}
}
