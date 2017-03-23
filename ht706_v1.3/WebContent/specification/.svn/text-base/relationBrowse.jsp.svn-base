<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype,java.util.List" language="java"%>
<%@ page import="com.ht706.componentLibrary.util.Constant" language="java"%>
<% 
   int totalPage=(Integer)request.getAttribute("totalPage");
   int pageNumber=1;
   if(request.getParameter("page")!=null){
         pageNumber=Integer.parseInt(request.getParameter("page"));
   }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	    function toPage(obj) {
		     location.href = 'RelationtypeAction.do?method=ShowRelationAction&select=search&spid=${spid}&page=' + obj.value;
		}
     </script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>已定义构件关系</td>
	</tr>
</table>
<!--如果页面中有提示信息，可放此处--->
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=info>
	<tr>
		<td>只能选择一项进行处理</td>
	</tr>
</table>
<!--如果页面中有提示信息，可放此处  over--->

<hr color=#97D2FF>


<div class=list>
<table id="ta">
<nested:hidden property="spid" value="${spid}"></nested:hidden>
	<tr>
		<th width="10%">序号</th>
		<th width="20%">关系名称</th>
		<th width="20%">对应关系</th>		
		<th>关系说明</th>
	</tr>
	<logic:iterate id="element" name="relationList" indexId="index">
	<tr>
		<td align="center">
			${pagelines*(pageNumbers-1)+index+1}
		</td>
		<td align="center">
			${element.relationName }
		</td>
		<td align="center">
			${element.relationType }
		</td>
		<td align="center">
			${element.description }
		</td>
		
	</tr>
	
	</logic:iterate>
</table>

</div>
<hr color=#97D2FF>
<table  width="100%" border="0" cellspacing="0" cellpadding="0"
	class=page>
<tr>
<td align="right">
<div >	
		<font size=2px color="black">(${pagelines*(pageNumbers-1)+1}-${pagelines*pageNumbers}) 共${totalSize}  第${pageNumbers}页/共${totalPage}页</font>
				<%if(pageNumber<=1){%>
		             <font size=2px color="black">首页</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=search&spid=${spid}&page=1"><font size=2px>首页</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">上一页</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=search&spid=${spid}&page=<%=(pageNumber-1)%>"><font size=2px>上一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">下一页</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=search&spid=${spid}&page=<%=(pageNumber+1)%>"><font size=2px>下一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">末页</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=search&spid=${spid}&page=<%=totalPage %>"><font size=2px>末页</font></a>
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
</body>
</html>
