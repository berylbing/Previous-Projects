package com.ht706.componentLibrary.componentSearch.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.ht706.componentLibrary.util.Constant;


public class DonwloadAction extends Action {
	public ActionForward execute (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		try {

			String path=new String(request.getParameter("path").getBytes("ISO8859-1"),"gbk");
			File file=new File(path);
			FileInputStream fos = new FileInputStream(file);
			System.out.println("--------------------read file from path="+path+" name="+file.getName()+" len="+file.length());
			int bytesRead = 0;
			byte[] buffer = new byte[Constant.File_Buffer_size];
			response.reset();   
	        response.addHeader("Content-Disposition", "attachment;filename="+file.getName());   
	        response.addHeader("Content-Length", ""+file.length()); //设置返回的文件类型   
	        OutputStream toClient = new BufferedOutputStream(response.getOutputStream()); //得到向客户端输出二进制数据的对象     

	        response.setContentType("application/octet-stream"); //设置返回的文件类型   
	        while ( (bytesRead = fos.read(buffer,0,Constant.File_Buffer_size)) != -1) {
	        	toClient.write(buffer, 0, bytesRead);//将文件写入服务器
			}
	        fos.close();
	        
	        toClient.write(buffer); //输出数据   
	        toClient.flush();   
	        toClient.close(); 
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		
		return null;
	}
}
