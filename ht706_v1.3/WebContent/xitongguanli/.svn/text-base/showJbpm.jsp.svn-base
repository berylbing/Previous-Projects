<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<%@page import="org.jbpm.api.ProcessInstance"%><html:html>
	<head>
		<title>构件库管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		
	</head>
	<body >
	<table>
	
	<logic:iterate id="element" name="names" >
	<tr>
		<td>${element.name}</td>
		<td>${element.id}</td>
		<td><a href="jbpmTest.do?method=DeletePD&name=${element.deploymentId}">delete</a></td>
		<td><a href="jbpmTest.do?method=Start&name=${element.id}">start</a></td>
		
	</tr>
	</logic:iterate>
	</table>
	<table>
	
	<logic:iterate id="element" name="pis" >
	<tr>
		<td>${element.name}</td>
		<td>${element.id}</td>
		
		<td><%=((ProcessInstance)element).findActiveActivityNames() %></td>
		
		
		<td>${element.state}</td>
		<td><a href="jbpmTest.do?method=DeletePI&name=${element.id}">delete</a></td>
		<td><a href="jbpmTest.do?method=Go2&name=${element.id}">Go</a></td>
		
	</tr>
	</logic:iterate>
	<!--  
	<logic:iterate id="element" name="tasks" >
	<tr>
		<td>${element.task.name}</td>
		<td>${element.task.id}</td>
		<logic:iterate id="ele" name="element" property="out" >
			<td><a href="jbpmTest.do?method=Go&name=${element.task.id}&go=${ele}">${ele}</a></td>
		</logic:iterate>
		<td><a href="../${element.actionName}">查看详细信息</a></td>
	</tr>
	</logic:iterate>-->
	</table>
	
	<table>
    <tr> 
      <th width="100">序号</th>
      <th width="100">登记号</th>
      <th width="100">表单名称</th>
      <th width="100">申请人</th>       
      <th width="200">操作</th>
    </tr>
    	<logic:iterate id="element" name="tasks" >
		<tr>
		<td>${index}</td>
		<td>${element.task.id}</td>
		<td>${element.task.name}</td>
		<td>${element.owner}</td>
		<td>
		<logic:iterate id="ele" name="element" property="out" >
			<a href="jbpmTest.do?method=Go&name=${element.task.id}&go=${ele}">${ele}</a>
		</logic:iterate>
		<a href="../${element.actionName}">查看详细信息</a>
		</td>
		</tr>
	</logic:iterate>
  
  </table>
	
	
	<html:form action="/xitongguanli/jbpmTest?method=Fabu" >
	<html:submit></html:submit>
	<a href="jbpmTest.do?method=Show">show</a>
	</html:form>
		
	</body>
</html:html>
