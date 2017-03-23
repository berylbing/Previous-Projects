package com.ht706.componentLibrary.componentRelease.action;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

import com.ht706.componentLibrary.componentRelease.actionForm.ComponentForm;
import com.ht706.componentLibrary.componentRelease.actionForm.componentElementForm;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Elimentfiles;
import com.ht706.componentLibrary.componentRelease.bo.IComponentElementService;
import com.ht706.componentLibrary.componentRelease.bo.impl.ComponentElementService;
import com.ht706.componentLibrary.util.Constant;
import com.ht706.componentLibrary.util.UUIDKey;


public class ComponentElementManagementAction extends DispatchAction {
	
	public ActionForward ShowComponentElementAction (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		return null;
	}
	
	/**
	 * �½�����Ԫ��
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */ 
	public ActionForward creatComponentElementAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		System.out.println("--------------------------------------creatComponentElementAction");
		componentElementForm f=(componentElementForm)form;
		String assetId=(String)request.getParameter("assetId");
		String isUpdate=(String)request.getParameter("isUpdate");
		ComponentForm ff=(ComponentForm)request.getSession().getAttribute("ComponentForm");

		if(assetId==null || assetId.equals("")){
			SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
			if(f.getDateOfInformation()!=null && !f.getDateOfInformation().equals(""))f.getElement().setDateOfInformation(formate.parse(f.getDateOfInformation()));		
			Element e= f.getElement();
			if(isUpdate==null || isUpdate.equals("")){
				try {

						String filePath=Constant.Element_Upload_Base_Root;
						FormFile file = f.getElementFile();//ȡ���ϴ����ļ�
					
						UUIDKey key=UUIDKey.getInstance();
						InputStream stream = file.getInputStream();//���ļ�����
						String rename=key.getNewUUID();
						filePath +=(rename+ file.getFileName());//�ϴ���ָ����upload����
						OutputStream bos = new FileOutputStream(filePath);//����һ���ϴ��ļ��������
						System.out.println("--------------------filepath:"+filePath);
						int bytesRead = 0;
						byte[] buffer = new byte[Constant.File_Buffer_size];
						while ( (bytesRead = stream.read(buffer,0,Constant.File_Buffer_size)) != -1) {
							bos.write(buffer, 0, bytesRead);//���ļ�д�������
						}
						bos.close();
						stream.close();
						
						Elimentfiles ef=new Elimentfiles();
						ef.setElement(e);
						
						ef.setFilePath(Constant.Element_Upload_Base_Root+rename+ file.getFileName());
						e.getElimentfileses().add(ef);
						ff.getElements().add(e);
					}catch(Exception ex){
						ex.printStackTrace();
						mapping.findForward("File_UpLoad_Error");
					}

					System.out.println("-----------------------------size1:"+ff.getElements().size());
					return mapping.findForward("File_UpLoad_Ok");
				}
			else {
				Element ele=ff.getElements().get(Integer.valueOf(isUpdate));
				ele.setElementUniqueId (e.getElementUniqueId());
				ele.setName ( e.getName());
				ele.setElementType ( e.getElementType());
				ele.setMedia ( e.getMedia());
				ele.setDateOfInformation (e.getDateOfInformation());
				ele.setCertificationState ( e.getCertificationState());
				ele.setProvider ( e.getProvider());
				ele.setDescription ( e.getDescription());
				ele.setElimentfileses ( e.getElimentfileses());
				ele.setIsmadeofs ( e.getIsmadeofs());
			}System.out.println("-----------------------------size2:"+ff.getElements().size());
			request.getSession().setAttribute("ComponentForm",ff);
			return null;
		}else {
			
				SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
				if(f.getDateOfInformation()!=null && !f.getDateOfInformation().equals(""))f.getElement().setDateOfInformation(formate.parse(f.getDateOfInformation()));
				if(isUpdate==null || isUpdate.equals("")){
					try {
						System.out.print("-----------------------:creatComponentElementAction2");
						UUIDKey key=UUIDKey.getInstance();
						Element e=f.getElement();
						
						e.setElementUniqueId(key.getNewUUID());
						
						FormFile file = f.getElementFile();//ȡ���ϴ����ļ�
					
						InputStream stream = file.getInputStream();//���ļ�����
						String filePath =Constant.Element_Upload_Base_Root+e.getElementUniqueId()+ file.getFileName();//�ϴ���ָ����upload����
						OutputStream bos = new FileOutputStream(filePath);//����һ���ϴ��ļ��������
						System.out.println("--------------------filepath:"+filePath);
						int bytesRead = 0;
						byte[] buffer = new byte[Constant.File_Buffer_size];
						while ( (bytesRead = stream.read(buffer,0,Constant.File_Buffer_size)) != -1) {
							bos.write(buffer, 0, bytesRead);//���ļ�д�������
						}
						bos.close();
						stream.close();
						
						Elimentfiles ef=new Elimentfiles();
						ef.setElement(e);
						ef.setFilePath(Constant.Element_Upload_Base_Root+e.getElementUniqueId()+ file.getFileName());
						e.getElimentfileses().add(ef);
						elementService.creatComponentElementService(e, assetId);	
					}catch(Exception ex){
						ex.printStackTrace();
						mapping.findForward("File_UpLoad_Error");
					}
				
					return mapping.findForward("File_UpLoad_Ok2");
				}	else {
					f.getElement().setElementUniqueId(isUpdate);	
					elementService.editComponentElementService(f.getElement());
					return null;
				}
				
		}		
	}
	
	/**
	 * ɾ������Ԫ��
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */ 
	public ActionForward deleteElementAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		String str=(String)request.getParameter("index");
		String s[]=str.split(",");
		String assetId=(String)request.getParameter("assetId");
		if(assetId==null || assetId.equals("")){
			ComponentForm ff=(ComponentForm)request.getSession().getAttribute("ComponentForm");
			int index;
			for(String i:s){
			//	System.out.println("----------------------------"+i);
				index=Integer.valueOf(i);
				ff.getElements().remove(index);
			}
		}else {
			//int index;
			for(String i:s){
				//index=Integer.valueOf(i);
				//ff.getElements().remove(index);
				elementService.deleteComponentElementService(i);
			}
		}
		return null;
	}
	
	/**
	 * �༭����Ԫ��
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          ��תȥ��
     * @exception       no
     */ 
	public ActionForward EditComponentElementAction(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		
		String id=request.getParameter("elementId");
		String index=request.getParameter("elementIndex");
		System.out.println("-----------------------------elementId:"+id+"index:"+index);
		if(id==null || id.equals("")){
			if(index==null || index.equals("")) return null;
			else {
				int i=Integer.valueOf(index);
				componentElementForm f=new componentElementForm();
				ComponentForm ff=(ComponentForm)request.getSession().getAttribute("ComponentForm");
				f.setDateOfInformation(ff.getElements().get(i).getDateOfInformation().toLocaleString());
				f.setElement(ff.getElements().get(i));
				f.setIsUpdate(index);
				request.setAttribute("ComponentElementForm", f);
				return mapping.findForward("editElement_new");
			}
		}else {
			componentElementForm f=new componentElementForm();
			Element e=elementService.getElementById(id);
			f.setElement(e);
			f.setDateOfInformation(e.getDateOfInformation().toString());
			f.setIsUpdate(id);
			String assetId=(String)request.getParameter("assetId");
			f.setAssetId(assetId);
			request.setAttribute("ComponentElementForm", f);
			return mapping.findForward("editElement");
		}
	}

	private IComponentElementService elementService;

	public IComponentElementService getElementService() {
		return elementService;
	}

	public void setElementService(IComponentElementService elementService) {
		this.elementService = elementService;
	} 
}
