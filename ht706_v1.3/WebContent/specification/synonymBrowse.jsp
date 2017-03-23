<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>同义词查询</td>
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

<div class=list>
<table>
	<tr>
		<th width="20%">序号</th>
		<th width="30%">刻面中的术词</th>
		<th>同义词</th>
	</tr>
	<logic:iterate id="element" name="synonymLists" indexId = "index">
	<tr>
		<td>
			${index+1 }
		</td>
		<td>
			${element.name }
		</td>
		<td>
			${element.description }
		</td>
	</tr>
	</logic:iterate>
</table>

</div>
<!--
  <div id=bc align=right>
  	<input onclick='bc()' type=button value=' 查 询 ' class='input_button'>  	
  </div><br>
-->
</body>
</html>
