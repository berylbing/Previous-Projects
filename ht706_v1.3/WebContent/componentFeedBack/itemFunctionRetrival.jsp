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
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}

	function excel() {
		window.open("excel/按考核对象统计.xls");
	}
	
	
	/* new function deltr */

	function deltr(itemFID,path) {
		if(!confirm("确认删除此记录吗?")) return;
		window.location = path + "/componentFeedBack/itemFunction.do?method=delete&itemFID=" + itemFID;
	}	

	function toPage(obj) {
	     location.href = 'itemFunction.do?method=listAllItemFunction&page=' + obj.value;
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>反馈项类别管理</td>
	</tr>
</table>


<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>       
      <th align="center">反馈项类别</th>
      <th align="center">类别描述</th>   
      <th align="center">操作</th>   
    </tr>
   <logic:iterate id="itemFunction" name="itemFunctionList" indexId="index">

		<tr>
			<td align="center" width='30'>${index+1}</td>
			<td align="center" width='80'><nested:write name="itemFunction" property="funcName"/></a></td>
			<td align="center" width='220'><nested:write name="itemFunction" property="description"/></td>

			
      		<td align="center" width='50'>
		         <img alt="编辑" onclick="location.href='itemFunction.do?method=preModify&itemFID=${itemFunction.id}'" src="../images/icon/icon_dianping.gif">&nbsp  
		         <img alt="删除" onclick="deltr('${itemFunction.id}','${pageContext.request.contextPath}')" src="../images/icon/del.gif">&nbsp
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
		              <a href="itemFunction.do?method=listAllItemFunction&page=1"><font size=2px>首页</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">上一页</font>
		        <%}else{%>
		              <a href="itemFunction.do?method=listAllItemFunction&page=<%=(pageNumber-1)%>"><font size=2px>上一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">下一页</font>
		        <%}else{%>
		              <a href="itemFunction.do?method=listAllItemFunction&page=<%=(pageNumber+1)%>"><font size=2px>下一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">末页</font>
		        <%}else{%>
		              <a href="itemFunction.do?method=listAllItemFunction&page=<%=totalPage %>"><font size=2px>末页</font></a>
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
  <div id=bc align=right>
  	<input onclick="location.href='newItemFunction.jsp'" type=button value=' 新 建 ' class='input_button'>  	
  </div><br>
</body>

</html>
