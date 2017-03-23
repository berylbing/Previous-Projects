<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="java.util.List" language="java"%>
<%@ page import="com.ht706.componentLibrary.util.Constant" language="java"%>
<% 
   int totalPage=(Integer)request.getAttribute("totalPage");
   int pageNumber=1;
   if(request.getParameter("page")!=null){
         pageNumber=Integer.parseInt(request.getParameter("page"));
   }
%>
<html>
<head>
<title>构件问题报告追踪</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>

	function problemQuery(rid){
		window.location = "../componentFeedBack/problemReport.do?method=listProblemReport&RID=" + rid;
	}

	function toPage(obj) {
	     location.href = 'problemReport.do?method=listAllProblemReportForTrace&page=' + obj.value;
	}
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>问题解决状态跟踪</td>
	</tr>
</table>

<BR>

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>       
      <th align="center">问题编号</th>
      <th align="center">构件名称</th> 
      <th align="center">状态</th>               
      <th align="center">操作</th>    
    </tr>
    <logic:iterate id="problemReport" name="problemReportList" indexId="index">
    <tr>         
      <td align="center" width='30'>${index+1}</td>
      <td align="center" width='120'><a onclick="problemQuery('${problemReport.recordId}')">${problemReport.reportId}</a></td>   
      <td align="center" width='60'>${problemReport.asset.name}</td>
      <td align="center" width='60'>
      			<logic:equal name="problemReport" property="status" value="1">审核中</logic:equal>
      			<logic:equal name="problemReport" property="status" value="2">待解决</logic:equal>
				<logic:equal name="problemReport" property="status" value="3">已解决</logic:equal>
      </td>
      <td align="center" width='60'>
      			<logic:equal name="problemReport" property="status" value="2">
      				<img alt="追加记录" onclick="location.href='problemTrace.do?method=preAddProblemTrace&RID=${problemReport.recordId}'" src="../images/icon/icon_dianping.gif">&nbsp
      			</logic:equal>
				<logic:equal name="problemReport" property="status" value="3">
					<img alt="查看" onclick="location.href='problemTrace.do?method=listAllProblemTraceByRid&RID=${problemReport.recordId}'" src="../images/icon/search.gif">&nbsp
				</logic:equal>
	  </td>      
    </tr>
	</logic:iterate>

 </table>
 <table  width="100%" border="0" cellspacing="0" cellpadding="0"
	class=page>
<tr>
<td align="right">
<div >	
		<font size=2px color="black">(${pagelines*(pageNumbers-1)+1}-${pagelines*pageNumbers}) 共${totalSize}  第${pageNumbers}页/共${totalPage}页</font>
				<%if(pageNumber<=1){%>
		             <font size=2px color="black">首页</font>
		        <%}else{%>
		              <a href="problemReport.do?method=listAllProblemReportForTrace&page=1"><font size=2px>首页</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">上一页</font>
		        <%}else{%>
		              <a href="problemReport.do?method=listAllProblemReportForTrace&page=<%=(pageNumber-1)%>"><font size=2px>上一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">下一页</font>
		        <%}else{%>
		              <a href="problemReport.do?method=listAllProblemReportForTrace&page=<%=(pageNumber+1)%>"><font size=2px>下一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">末页</font>
		        <%}else{%>
		              <a href="problemReport.do?method=listAllProblemReportForTrace&page=<%=totalPage %>"><font size=2px>末页</font></a>
		        <% }%>
				<font size=2px>第</font><select name="page" onchange="toPage(this)">
				 <% for(int i=1;i<=totalPage;i++){%>
				<option value="<%=i %>"
				<%if(i==pageNumber){%> selected<%} %>><%=i %></option>
				<% } %>	
				</select><font size=2px>页</font>

</div>
</td>
</tr>
</table>
</div>

</body>
</html>
