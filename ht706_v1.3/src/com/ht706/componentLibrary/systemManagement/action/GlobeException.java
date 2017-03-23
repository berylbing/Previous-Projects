package com.ht706.componentLibrary.systemManagement.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

import com.ht706.componentLibrary.util.MessageBox;

public class GlobeException extends ExceptionHandler {


	public ActionForward execute(Exception ex, ExceptionConfig ae,
			ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		// TODO Auto-generated method stub
		try{
		ex.getClass().getName();
		MessageBox m = new MessageBox();
		String className="";
		int index=-1;
		while(!className.equals("com.ht706.componentLibrary.systemManagement.action")){
			className =ex.getStackTrace()[++index].getClassName();
			className =className.substring(0, 50);
		}
		String fenxi=ex.getStackTrace()[index].getMethodName();
		String re[]=fenxi.split("[A-Z]");
		String result="",end="";
		if(re[0].equals("select")){
			result+="���ڵ�ѡ��";
		}
		else if(re[0].charAt(0)=='p'){
			end+="��ϢԤ����";
			int i =1;
			if(re[1].equals("reate")){
				i=2;
			}
			if(re[i].charAt(0)=='c'){
				result+="��ɫ";
			}
			if(re[i].charAt(0)=='u'){
				result+="Ȩ��";
			}


			if(re[i].charAt(0)=='a'){
				result+="�������Ϣ";
			}
			if(re[i].charAt(0)=='e'){
				result+="����";
			}
			if(re[i].charAt(0)=='r'){
				result+="��Ա";
			}
			if(re[1].equals("arent")){
				result+="���ڵ�";
			}
		}
		else{
			if(re[0].charAt(0)=='f'){
				result+="��ѯ";
			}
			if(re[0].charAt(0)=='c'){
				result+="�½�";
			}
			if(re[0].charAt(0)=='m'){
				result+="�޸�";
			}
			if(re[0].charAt(0)=='l'){
				result+="��ѯ";
				end+="�б�";
			}
			if(re[0].charAt(0)=='d'){
				result+="ɾ��";
			}

			if(re[0].charAt(0)=='g'){
				result+="��ѯ";
			}
			if(re[1].charAt(0)=='c'){
				result+="��ɫ";
			}
			if(re[1].charAt(0)=='u'){
				result+="Ȩ��";
			}


			if(re[1].charAt(0)=='a'){
				result+="�������Ϣ";
			}
			if(re[1].charAt(0)=='e'){
				result+="����";
			}
			if(re[1].charAt(0)=='r'){
				result+="��Ա";
			}
		}
		result+=end;
		if(ex.getStackTrace()[1].getClassName()=="SafeControlAction"){
			Map<String,String> map = new HashMap<String,String>();
			map.put("modifyAuthorizationToActor", "�޸�Ȩ�޽�ɫ��Ӧ��ϵ");
			map.put("modifyActorToOrganization", "�޸���Ա��ɫ��ϵ");
			map.put("searchAllByActor", "�������н�ɫ�����Ȩ��");
			map.put("searchAuthorizationByActor", "ͨ����ɫ����Ȩ��");
			map.put("searchActorByOrganization", "ͨ����Ա���ҽ�ɫ");
			map.put("searchAllByOrganization", "��Ա��Ȩ��ѯ");
			map.put("searchAllByAuthorization", "Ȩ�޷����ѯ");
			result=map.get(ex.getStackTrace()[1].getMethodName());
			
		}
		m.setImage("0");//Ҫ��ʾ��ͼƬ
		m.setMessage("����: "+result+"�����쳣��");//���������Ϣ
		request.setAttribute("message", m);
		return mapping.findForward("errormessagebox");
		}
		catch(Exception e){
			MessageBox m = new MessageBox();
			m.setImage("0");//Ҫ��ʾ��ͼƬ
			m.setMessage("����δ֪����");//���������Ϣ
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
	}




}
