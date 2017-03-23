<%@ page contentType="text/html; charset=utf-8" %>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function w_open(v){
		open_window(v,900,500);
		return;		
	}
	function toPage(obj) {
	     location.href = 'feedback.do?method=feedbackStatics&page=' + obj.value;
	}
</script>
<style>
	a { cursor:hand; }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>构件反馈统计</td>
	</tr>
</table>



<hr color=#97D2FF>

<div class=list>
 	<table border="0" id="ta">
	    <tr>            
	     <th align="center">序号</th>       
	      <th align="center">构件名称</th>
	      <th align="center">有效反馈次数</th>     
	      <th align="center">平均得分</th>        
	    </tr>
	   
		<logic:iterate id="feedbackStatics" name="feedbackStaticsList" indexId="index">
		    <tr>         
		      <td align="center" width='30'>${index+1}</td>
		      <td align="center" width='220'><a onclick="w_open('../componentRelease/ComponentList.do?method=viewComponentAction&ID=${feedbackStatics.asset.uniqueId}')">${feedbackStatics.asset.name}</a></td>      
		      <td align="center" width='80'>${feedbackStatics.feedbackTimes}</td>      
		      <td align="center" width='60'>${feedbackStatics.averageScore}</td>
		    </tr>
		</logic:iterate>
	</table>
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
		              <a href="feedback.do?method=feedbackStatics&page=1"><font size=2px>首页</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">上一页</font>
		        <%}else{%>
		              <a href="feedback.do?method=feedbackStatics&page=<%=(pageNumber-1)%>"><font size=2px>上一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">下一页</font>
		        <%}else{%>
		              <a href="feedback.do?method=feedbackStatics&page=<%=(pageNumber+1)%>"><font size=2px>下一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">末页</font>
		        <%}else{%>
		              <a href="feedback.do?method=feedbackStatics&page=<%=totalPage %>"><font size=2px>末页</font></a>
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
<!--
<table border=0 width='100%' cellSpacing=6>
	<tr>	
		<td align="right" colspan=4>
			<input type='button' value=' 导 出 ' class="input_button" onclick="excel()">&nbsp;&nbsp;
			<input type='button' value=' 选 择 ' class="input_button" onclick="selectComponent()">			
		</td>
	</tr>
</table>
  -->
</body>
</html>
