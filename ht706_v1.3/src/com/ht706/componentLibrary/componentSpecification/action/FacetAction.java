/**
 * Copyright (c) 2010, 
 * 
 * @FileName: FacetAction.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.action
 * @author: yby
 * @Time: 2010-08-31 
 */

package com.ht706.componentLibrary.componentSpecification.action;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.ht706.componentLibrary.componentSpecification.actionForm.FacetListForm;
import com.ht706.componentLibrary.componentSpecification.actionForm.SpecificationForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.FacetId;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;
import com.ht706.componentLibrary.componentSpecification.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bo.ISpecificationService;
import com.ht706.componentLibrary.componentSpecification.bo.ISynonymService;
import com.ht706.componentLibrary.systemManagement.bo.ILibraryService;
import com.ht706.componentLibrary.util.MessageBox;
import com.ht706.componentLibrary.util.UUIDKey;


/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public class FacetAction extends DispatchAction {
	public IFacetService facetServices;
	public ISpecificationService specificationService;
	private ILibraryService libraryService;
	public ISynonymService synonymService;

	
	public ISynonymService getSynonymService() {
		return synonymService;
	}

	public void setSynonymService(ISynonymService synonymService) {
		this.synonymService = synonymService;
	}

	public ILibraryService getLibraryService() {
		return libraryService;
	}

	public void setLibraryService(ILibraryService libraryService) {
		this.libraryService = libraryService;
	}

	public IFacetService getFacetServices() {
		return facetServices;
	}

	public void setFacetServices(IFacetService facetServices) {
		this.facetServices = facetServices;
	}

	public ISpecificationService getSpecificationService() {
		return specificationService;
	}

	public void setSpecificationService(ISpecificationService specificationService) {
		this.specificationService = specificationService;
	}

	/**
	 * ��ʾ������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetTreeBrowse_3.jsp(edit)  
     * 					/specification/facetTreeBrowse_2.jsp(show) 
     * 					/specification/facetTreeBrowse_4.jsp(synonym)
     * 					/specification/facetTreeBrowse_5.jsp(view)
     * @exception       no
     */
	public ActionForward ShowFacetTreeAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String spid = request.getParameter("spid");
		String temp = request.getParameter("temp");
		FacetListForm f=new FacetListForm();
		f.setFacetList(specificationService.findFacet(spid));
		request.setAttribute("facetListForm", f);
		System.out.println("temptemptttttttttttttt"+temp);
		if(temp.equals("show"))
			return mapping.findForward("showFacetTree");
		if(temp.equals("synonym")){
			System.out.println("temptemptttttttttttttt"+temp);
			return mapping.findForward("synonymFacetTree");
		}
		if(temp.equals("edit"))
			return mapping.findForward("editFacetTree");
		if(temp.equals("view"))
			return mapping.findForward("viewFacetTree");
		return null;
		
	}
	
	/**
	 * ��ȡ��ʾһ������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetInfo.jsp
     * 					/specification/facetInfo_view.jsp(select=view)
     * @exception       no
     */
	public ActionForward ShowFacetAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		String fid=request.getParameter("Idf");
		Facet facet;
		//����id
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(fid);
		facetid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		facet=facetServices.getById(facetid);
		request.setAttribute("facetss", facet);
		//��ʾʱ��
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(facet.getLastModifiedTime());
		request.setAttribute("createtime", date);
		//��ʾ������
		String creator[] = facet.getCreator().split("/");
		request.setAttribute("creator", creator[0]);
		//��ʾ���ڵ�
		//���游id
		FacetId facetpid = new FacetId();
		facetpid.setFacetUuid(facet.getParentNode());
		facetpid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		if(facet.getParentNode().equals("-1"))
			{}
		else
			request.setAttribute("parent",facetServices.getById(facetpid).getName() );

		//��ת
		String select = request.getParameter("select");
		if(select.equals("view"))
			return mapping.findForward("facetInfo_view");
		return mapping.findForward("facetInfo");	
	}
	
	
	/**
	 * ��ʼ���޸Ŀ�����Ϣaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifyFacetInfo.jsp
     * @exception       no
     */
	public ActionForward preFacetForm(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FacetId facetid = new FacetId();
		String idf = request.getParameter("Idf");
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		Facet facet=facetServices.getById(facetid);
		//��ʼ���޸�ʱ��
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		//��ȡ������
		String creators[] = facet.getCreator().split("/");
		request.setAttribute("creator", creators[0]);
		request.setAttribute("facet", facet);
		//û�и��ڵ�����
		FacetId facetpid = new FacetId();
		facetpid.setFacetUuid(facet.getParentNode());
		facetpid.setSpecification(specificationService.getById(request.getParameter("Ids")));
		if(facet.getParentNode().equals("-1"))
		{}
		else
			request.setAttribute("parents",facetServices.getById(facetpid).getName() );
		return mapping.findForward("modifyFacetInfo");		
	}

	/**
	 * �޸Ŀ�����Ϣaction
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/null.jsp
     * @exception       no
     */
	public ActionForward modifyFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FacetListForm df= (FacetListForm) form ;
		String ids = df.getFacetids();
		String idf = df.getFacetidf();
		String pids = df.getFacetpids();
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet = facetServices.getById(facetid);
		//����ڵ�˵��
		facet.setDescription(df.getFacet().getDescription());
		//����ʱ��
		facet.setLastModifiedTime(Date.valueOf(df.getCreatetime()));
		//��������
		facet.setName(df.getFacet().getName());
		//���游�ڵ�
		facet.setParentNode(pids);
		//���淢������
		facet.setReleaseType(df.getFacet().getReleaseType());
		//����ڵ�����
		facet.setNodeType(df.getNodetype());
		facetServices.modify(facet);
		
		request.setAttribute("treefid", idf);
		request.setAttribute("spid", ids);
		return mapping.findForward("null");	
		
	}
	/**
	 * ��ʼ���޸Ŀ��������ڵ�action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetTreeBrowse_1.jsp
     * @exception       no
     */
	public ActionForward preParentFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = request.getParameter("Ids");
		request.setAttribute("facetIdf", request.getParameter("Idf"));
		request.setAttribute("facetIds", ids);
		FacetListForm f=new FacetListForm();
		f.setFacetList(specificationService.findFacet(ids));
		request.setAttribute("facetListForm", f);
		return mapping.findForward("showFacetParent");
		
	}

	/**
	 * �޸Ŀ��������ڵ�action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/modifyFacetInfo.jsp
     * @exception       no
     */
	public ActionForward selectParentFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idf = request.getParameter("Idf");
		String ids = request.getParameter("Ids");
		String pidf = request.getParameter("Pidf");
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet=facetServices.getById(facetid);
		//��ѡ����Ǳ��ڵ㣬�����κ��޸�;���ѡ�и��ڵ㣬�ڵ�����Ҫ��Ϊ����
		if(pidf.equals(idf))
		{
			request.setAttribute("facet", facet);
			FacetId facetpid0 = new FacetId();
			facetpid0.setFacetUuid(facet.getParentNode());
			facetpid0.setSpecification(specificationService.getById(ids));
			request.setAttribute("parents",facetServices.getById(facetpid0).getName() );
		}
		else{
			facet.setParentNode(pidf);
			
			FacetId facetpid = new FacetId();
			facetpid.setFacetUuid(pidf);
			facetpid.setSpecification(specificationService.getById(ids));
			if(facetServices.getById(facetpid).getParentNode().equals("-1"))
			{
				facet.setNodeType("����");
			}
			else
			{
				facet.setNodeType("����");
			}
			request.setAttribute("parents",facetServices.getById(facetpid).getName() );	
			request.setAttribute("facet", facet);
		}
		//��ʼ���޸�ʱ��
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		//��ȡ������
		String creators[] = facet.getCreator().split("/");
		request.setAttribute("creator", creators[0]);
		request.setAttribute("facet", facet);
		return mapping.findForward("modifyFacetInfo");
		
	}

	/**
	 * ɾ������action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/null.jsp
     * @exception       no
     */
	public ActionForward deleteFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idf = request.getParameter("Idf");
		String ids = request.getParameter("Ids");
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet = facetServices.getById(facetid);
		List<Facet> facetlist = facetServices.findbyParentNode(idf);
		for(Facet item : facetlist)
		{
			item.setParentNode(facet.getParentNode());
		}
		facetServices.delete(facet);
		//ɾ�������Ӧ��ͬ���
		if(synonymService.findByFacet(ids, idf).isEmpty()){}
		else{
			List<Synonym> synonymlist = synonymService.findByFacet(ids, idf);
			for(Synonym item : synonymlist)
			{
				synonymService.delete(item);
			}
		}
		request.setAttribute("treefid", idf);
		request.setAttribute("spid", ids);
		return mapping.findForward("null");	
		
	}

	/**
	 * ��ʼ�������¿���action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/facetInfo_1.jsp
     * @exception       ids idf UserRealName
     */
	public ActionForward preCreateFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String idf = request.getParameter("Idf");
		String ids = request.getParameter("Ids");
		//��ʼ�����ڵ㼰�ڵ�����
		FacetId facetid = new FacetId();
		facetid.setFacetUuid(idf);
		facetid.setSpecification(specificationService.getById(ids));
		Facet facet = facetServices.getById(facetid);
		if(facet.getParentNode().equals("-1"))
			facet.setNodeType("����");
		else facet.setNodeType("����");
		request.setAttribute("facet", facet);
		//��ʼ����Լid
		request.setAttribute("facetids", ids);
		//��ʼ���޸�ʱ��
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");   
		String date = sDateFormat.format(new java.util.Date());
		request.setAttribute("createtime", Date.valueOf(date));
		//��ʼ��������
		try{
			String UserRealName = request.getSession().getAttribute("UserRealName").toString();
			request.setAttribute("creator", UserRealName);
		}
		catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");//Ҫ��ʾ��ͼƬ
			m.setMessage("����: ���¼��");//���������Ϣ
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}

		return mapping.findForward("createFacet");
	}

	/**
	 * �����¿���action
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          /specification/null.jsp
     * @exception       no
     */
	public ActionForward createFacet(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		FacetListForm df= (FacetListForm) form ;
		String ids = df.getFacetids();
		String pids = df.getFacetpids();
		Facet facet = df.getFacet();
		FacetId facetid = new FacetId();
		//��������
		//���ù�ԼΪ��ǰ�����еĹ�Լ
		facetid.setSpecification(specificationService.getById(ids));
		//����facetid
		UUIDKey uuids = UUIDKey.getInstance();
		facetid.setFacetUuid(uuids.getNewUUID());
		facet.setId(facetid);
		//���ô���ʱ��
		facet.setLastModifiedTime(Date.valueOf(df.getCreatetime()));
		//���ø��ڵ�
		facet.setParentNode(pids);
		/*//�����parentnode�Ǹ��ڵ�Ļ���nodetypeΪ�����桱������Ϊ�����,����Ĭ�ϸ��ڵ��pidΪ-1
		FacetId facetpid = new FacetId();
		facetpid.setFacetUuid(pids);
		facetpid.setSpecification(specificationService.getById(ids));
		String nodetempid=facetServices.getById(facetpid).getParentNode();
		if(nodetempid.equals("-1"))
			facet.setNodeType("����");
		else facet.setNodeType("����");*/
		facet.setNodeType(df.getNodetype());
		//facet.setReleaseType(df.getFacet().getReleaseType());
		//���ô�����
		try{
			String UserRealName = request.getSession().getAttribute("UserRealName").toString();
			String UserId = request.getSession().getAttribute("UserID").toString();
			String lid = libraryService.listAll().get(0).getLibraryUniqueId();
			String creators = UserRealName+"/"+UserId+"/"+lid;
			facet.setCreator(creators);
		}
		catch (Exception e) {
			MessageBox m = new MessageBox();
			m.setImage("2");//Ҫ��ʾ��ͼƬ
			m.setMessage("����: ���¼��");//���������Ϣ
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
		facetServices.create(facet);
		
		request.setAttribute("treefid", facet.getId().getFacetUuid());
		request.setAttribute("spid", facet.getId().getSpecification());
		return mapping.findForward("null");	
		
	}

	
	
	
}
