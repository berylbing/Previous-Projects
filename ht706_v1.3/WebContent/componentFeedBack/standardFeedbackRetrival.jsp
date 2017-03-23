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
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>

	function deltr(SfID,path) {
		if(!confirm("确认删除此记录吗?")) return;
		window.location = path + "/componentFeedBack/standardFeedback.do?method=delete&SfID=" + SfID;
	}	

	function submit(SfID,path){
		if(!confirm("确认生效此记录吗?")) return;
		window.location = path + "/componentFeedBack/standardFeedback.do?method=validate&SfID=" + SfID;
	}

	 function toPage(obj) {
	     location.href = 'standardFeedback.do?method=listAllStandardFeedback&page=' + obj.value;
	}	
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>反馈标准</td>
	</tr>
</table>


<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>       
      <th align="center">版本号</th>
      <th align="center">创建日期</th>
      <th align="center">创建者</th>      
      <th align="center">状态</th>
      <th align="center">操作</th>      
    </tr>
   <logic:iterate id="standardFeedback" name="standardFeedbackList" indexId="index">

		<tr>
			<td align="left" width='30'>${index+1}</td>
			<td align="left" width='220'><a href="standardFeedback.do?method=listStandardFeedback&SfID=${standardFeedback.sfId}"><nested:write name="standardFeedback" property="version"/></a></td>
			<td align="left" width='80'><nested:write name="standardFeedback" property="dateOfInformation"/></td>
			<td align="center" width='90'><nested:write name="standardFeedback" property="creatorId"/></td>
			<!-- 
				status值的含义
				0---历史
				1---当前
				2---草稿
			 -->
			<td align="center" width='60'>
				<logic:equal name="standardFeedback" property="status" value="0">历史</logic:equal>
				<logic:equal name="standardFeedback" property="status" value="1">当前</logic:equal>
				<logic:equal name="standardFeedback" property="status" value="2">草稿</logic:equal>
			</td>      
      		<td align="left" width='150'>
	         <logic:equal name="standardFeedback" property="status" value="2">
		         <img alt="编辑" onclick="location.href='standardFeedback.do?method=preModify&SfID=${standardFeedback.sfId}'" src="../images/icon/icon_dianping.gif">&nbsp  
		         <img alt="删除" onclick="deltr('${standardFeedback.sfId}','${pageContext.request.contextPath}')" src="../images/icon/del.gif">&nbsp
		         <img alt="生效" onclick="submit('${standardFeedback.sfId}','${pageContext.request.contextPath}')" src="../images/icon/icon_ok.gif">&nbsp
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
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=1"><font size=2px>首页</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">上一页</font>
		        <%}else{%>
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=<%=(pageNumber-1)%>"><font size=2px>上一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">下一页</font>
		        <%}else{%>
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=<%=(pageNumber+1)%>"><font size=2px>下一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">末页</font>
		        <%}else{%>
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=<%=totalPage %>"><font size=2px>末页</font></a>
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
  <div id=bc align=left>
  	<input onclick="location.href='standardFeedback.do?method=preCreate'" type=button value=' 新 建 ' class='input_button'>  	
  </div><br>
</body>

</html>
