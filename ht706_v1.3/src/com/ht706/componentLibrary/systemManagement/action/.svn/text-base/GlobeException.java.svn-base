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
			result+="父节点选择";
		}
		else if(re[0].charAt(0)=='p'){
			end+="信息预处理";
			int i =1;
			if(re[1].equals("reate")){
				i=2;
			}
			if(re[i].charAt(0)=='c'){
				result+="角色";
			}
			if(re[i].charAt(0)=='u'){
				result+="权限";
			}


			if(re[i].charAt(0)=='a'){
				result+="库基本信息";
			}
			if(re[i].charAt(0)=='e'){
				result+="部门";
			}
			if(re[i].charAt(0)=='r'){
				result+="人员";
			}
			if(re[1].equals("arent")){
				result+="父节点";
			}
		}
		else{
			if(re[0].charAt(0)=='f'){
				result+="查询";
			}
			if(re[0].charAt(0)=='c'){
				result+="新建";
			}
			if(re[0].charAt(0)=='m'){
				result+="修改";
			}
			if(re[0].charAt(0)=='l'){
				result+="查询";
				end+="列表";
			}
			if(re[0].charAt(0)=='d'){
				result+="删除";
			}

			if(re[0].charAt(0)=='g'){
				result+="查询";
			}
			if(re[1].charAt(0)=='c'){
				result+="角色";
			}
			if(re[1].charAt(0)=='u'){
				result+="权限";
			}


			if(re[1].charAt(0)=='a'){
				result+="库基本信息";
			}
			if(re[1].charAt(0)=='e'){
				result+="部门";
			}
			if(re[1].charAt(0)=='r'){
				result+="人员";
			}
		}
		result+=end;
		if(ex.getStackTrace()[1].getClassName()=="SafeControlAction"){
			Map<String,String> map = new HashMap<String,String>();
			map.put("modifyAuthorizationToActor", "修改权限角色对应关系");
			map.put("modifyActorToOrganization", "修改人员角色关系");
			map.put("searchAllByActor", "查找所有角色的相关权限");
			map.put("searchAuthorizationByActor", "通过角色查找权限");
			map.put("searchActorByOrganization", "通过人员查找角色");
			map.put("searchAllByOrganization", "人员授权查询");
			map.put("searchAllByAuthorization", "权限分配查询");
			result=map.get(ex.getStackTrace()[1].getMethodName());
			
		}
		m.setImage("0");//要显示的图片
		m.setMessage("错误: "+result+"出现异常！");//加入错误信息
		request.setAttribute("message", m);
		return mapping.findForward("errormessagebox");
		}
		catch(Exception e){
			MessageBox m = new MessageBox();
			m.setImage("0");//要显示的图片
			m.setMessage("错误：未知错误！");//加入错误信息
			request.setAttribute("message", m);
			return mapping.findForward("errormessagebox");
		}
	}




}
