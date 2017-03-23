/**
 * @FileName	ProblemReportAction.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.action
 * @author 贾乐松
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.action;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessEngine;

import com.ht706.componentLibrary.componentFeedBack.actionForm.ProblemReportForm;
import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;
import com.ht706.componentLibrary.componentFeedBack.bo.IProblemReportService;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bo.IComponentService;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.util.Constant;
import com.ht706.componentLibrary.util.UUIDKey;






/**
 * ProblemReport Action实现类
 */
public class ProblemReportAction extends DispatchAction {
	private IProblemReportService problemReportService;
	private IComponentService componentService;
	private IMyfavoriteService myfavoriteService;
	private ProcessEngine processEngine;
	
	public IComponentService getComponentService() {
		return componentService;
	}

	public void setComponentService(IComponentService componentService) {
		this.componentService = componentService;
	}

	public IMyfavoriteService getMyfavoriteService() {
		return myfavoriteService;
	}

	public void setMyfavoriteService(IMyfavoriteService myfavoriteService) {
		this.myfavoriteService = myfavoriteService;
	}

	public IProblemReportService getProblemReportService() {
		return problemReportService;
	}

	public void setProblemReportService(IProblemReportService problemReportService) {
		this.problemReportService = problemReportService;
	}
	
	public ProcessEngine getProcessEngine() {
		return processEngine;
	}

	public void setProcessEngine(ProcessEngine processEngine) {
		this.processEngine = processEngine;
	}

	/**
	 * 列出所有问题反馈单
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listAllProblemReport(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int totalSize = problemReportService.listValidProblemReport().size();
		int totalPage = (int)Math.ceil( totalSize /(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<ProblemReport> prList = problemReportService.findByNumber(start, offset);
		request.setAttribute("problemReportList", prList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", totalSize);
		return mapping.findForward("listAllProblemReport");
	}
	
	/**
	 * 在问题跟踪页面列出所有问题反馈单
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listAllProblemReportForTrace(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int totalSize = problemReportService.listValidProblemReport().size();
		int totalPage = (int)Math.ceil( totalSize /(float)(Constant.PAGE_LINES));
		int page = 1;
		if(request.getParameter("page")!=null){
			page = Integer.parseInt(request.getParameter("page"));
		}
		int start = (page-1)*(Constant.PAGE_LINES);
		int offset = Constant.PAGE_LINES;
		List<ProblemReport> prList = problemReportService.findByNumber(start, offset);
		request.setAttribute("problemReportList", prList);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("pageNumbers",page );
		request.setAttribute("pagelines",offset );
		request.setAttribute("totalSize", totalSize);
		return mapping.findForward("listAllProblemReportForTrace");
	}
	
	/**
	 * 列出一个问题反馈单的详细信息
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward listProblemReport(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String rid = request.getParameter("RID");
		ProblemReport problemReport = problemReportService.findByRid(rid);
		if(problemReport != null) {
			request.setAttribute("problemReport", problemReport);
		}
		return mapping.findForward("listProblemReport");
	}
	
	/**
	 * 创建一个问题反馈单预处理
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward preCreate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String assetUUID = request.getParameter("AssetUUID");
		request.setAttribute("AssetUUID", assetUUID);
		return mapping.findForward("precreate");
	}
	
	/**
	 * 创建一个问题反馈单
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest 
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward create(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ProblemReportForm prForm = (ProblemReportForm) form;
		ProblemReport pr = new ProblemReport();
		/*	文件上传	*/
		String filePath = Constant.Element_Upload_ProblemReport_Root;
		FormFile file = prForm.getFile();//取得上传的文件
		try {
			UUIDKey key=UUIDKey.getInstance();
			InputStream stream = file.getInputStream();//把文件读入
			filePath +=key.getNewUUID()+ file.getFileName();//上传到指定的upload包中
			OutputStream bos = new FileOutputStream(filePath);//建立一个上传文件的输出流
			int bytesRead = 0;
			byte[] buffer = new byte[Constant.File_Buffer_size];
			while ( (bytesRead = stream.read(buffer,0,Constant.File_Buffer_size)) != -1) {
				bos.write(buffer, 0, bytesRead);//将文件写入服务器
			}
			bos.close();
			stream.close();
		}catch(Exception ex){
			ex.printStackTrace();
			mapping.findForward("File_UpLoad_Error");
		}
		
		UUIDKey key = UUIDKey.getInstance();
		String recordId = key.getNewUUID();
		pr.setRecordId(recordId);
		String assetUUID = request.getParameter("AssetUUID");
		Asset as = componentService.ViewComponentService(assetUUID);
		pr.setAsset(as);
		pr.setBackground(prForm.getBackground());
		pr.setDept(prForm.getDept());
		pr.setDescription(prForm.getDescription());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		pr.setDiscoveryDate(format.parse(prForm.getDiscoveryDate()));
		pr.setHarm(prForm.getHarm());
		pr.setProject(prForm.getProject());
		Date date = new Date();   
        java.sql.Date intime = new java.sql.Date(date.getTime());  
		pr.setReportDate(intime);
		pr.setReporter((String)request.getSession().getAttribute("UserName"));
		pr.setReportId(prForm.getReportId());
		pr.setSuggestion(prForm.getSuggestion());
		pr.setStatus("0");
		pr.setProblemtraces(null);
		problemReportService.create(pr);
		

		/*	此处还要对myFavoriate表插入此记录		*/
		Myfavorite my = new Myfavorite();
		my.setRecordId(pr.getRecordId());
		my.setAssetUniqueId(as.getUniqueId());
		my.setAssetName(as.getName());
		my.setDateOfInformation(intime);
		my.setParentNode("-2");
		my.setTypeIs("ProblemReport");
		my.setUrl("localhost");
		my.setUserId((String)request.getSession().getAttribute("UserName"));
		myfavoriteService.create(my);
		
		//jbpm
		//System.out.println("jbpm------------------------------------------------------------------");
		ExecutionService executionService = processEngine.getExecutionService();
		Map<String , Object > map = new HashMap<String,Object>();
		String username = (String) request.getSession().getAttribute("UserName");
		map.put("owner",  username );
		map.put("id", recordId);
		map.put("actionName", "componentFeedBack/problemReport.do?method=listProblemReport&RID=");
		
		map.put("table", "problemReport");
		map.put("property", "status");
		map.put("UUID", "recordId");
		
		map.put("报告单草稿","0");
		map.put("审核","1");
		map.put("问题记录","2");
		map.put("问题分析","2");
		map.put("description", "问题报告单跟踪工作流");
		executionService.startProcessInstanceByKey("ProblemReport", map, recordId);
		
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.print("<script>window.close();</script>");
		out.flush();
		out.close();
		return null;
		
		//return mapping.findForward("createSuccess");
	}
	
	/**
	 * 列出一个问题反馈单的详细信息
     * @param form 		ActionForm
     * @param mapping   ActionMapping 
     * @param response  HttpServletResponse
     * @param request   HttpServletRequest
     * @return          跳转去向
     * @exception       no
     */
	public ActionForward checkReportId(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String reportId = request.getParameter("reportId");
		if(problemReportService.findByReportId(reportId) == null)
		{
			request.setAttribute("value", "可以使用");
			return mapping.findForward("check_ok");
		}
		else{
			request.setAttribute("value", "问题编号已存在");
			return mapping.findForward("check_error");
		}
	}
	
	
	
}
