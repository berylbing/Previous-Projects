<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<%@page import="org.jbpm.api.ProcessInstance"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>工作流查看</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="js/check.js" type="text/javascript"></script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>待审批表单</td>
  </tr>
</table>
	<hr color=#97D2FF>
<div class=list>
  <table id=ta>
    <tr> 
      <th width="20%">登记号</th>
      <th width="20%">当前任务名称</th> 
      <th width="20%">所属的工作流</th> 
      <th width="20%">申请人</th>             
      <th width="20%">操作</th>
    </tr>
    <logic:iterate id="element" name="tasks" >
    
    <tr> 
      <td align="center">${element.task.id}</td>
      <td align="center">${element.task.name}</td>
      <td align="center">${element.description}</td>   
      <td align="center">${element.owner}</td>     
      <td align="center">
      <logic:iterate id="ele" name="element" property="out" >
			<a href="jbpmTest.do?method=Go&name=${element.task.id}&go=${ele}">${ele}</a>
		</logic:iterate>
		<a href="../${element.actionName}">查看详细信息</a>
      </td>
    </tr>
	</logic:iterate>
  </table>

	</div>
<hr color=#97D2FF>
</body>
</html>
