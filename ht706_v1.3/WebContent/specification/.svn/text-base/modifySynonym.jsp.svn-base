<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/calendar.js" type="text/javascript"></script>
<style>
	input{
		font-size: 12px;
		color: #000000;
		background-color: #F1F4F5;
		border: 1px solid #49789C;
		padding:2px 0px 0px 5px;
	}
</style>

<script>
	function save(){
		var name = document.getElementsByName("synonym.targetItem")[0].value;
		if(name=="")
		{
			alert("请填写同义词名称 ！ ");
			return false;
		}
		document.getElementById("synonymForm").submit();
		return true;
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<html:form action="/specification/SynonymAction?method=modifySynonym" method="POST">

<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>编辑"${facetname}"的同义词</td>
  </tr>
</table>

<div class=editblock >
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
	<nested:hidden property="synonym.synonymUuid" value="${synonym.synonymUuid}"></nested:hidden>
	<nested:hidden property="synonym.specUuid" value="${spid}"></nested:hidden>
	<nested:hidden property="synonym.sourceItem" value="${idf}"></nested:hidden>
		<tr height="35"> 
		  <th align="right" width="25%">名称：</th>
		  <td width="75%"><nested:text property="synonym.targetItem" value="${synonym.targetItem}" size="50"></nested:text></td>
		</tr>				
		<tr height="35"> 
		  <th align="right">最后修改时间：</th>
		  <td width="75%">
			<html:text property="createtime" value="${createtime}"  readonly="true" onfocus="calendar(this,null,null,null)" size="40"></html:text>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">说明：</th>
		  <td><nested:text property="synonym.description" value="${synonym.description}" size="50"></nested:text></td>
		</tr>									
	</table>
  <div id=bc align=right>
  	<input onclick='save()' type=button value=' 保 存 ' class='input_button'>
  </div><br>

</div> 
</html:form>
</body>
</html>
