<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function submitForm()
	{
		if(document.getElementById("funcName").value == "")
		{
			alert("请填入类别名称");
			return;
		}
		if(document.getElementById("description").value == "")
		{
			alert("请填入类别描述");
			return;
		}

		var path  = "../componentFeedBack/itemFunction.do?method=modify&itemFID=${itemFunction.id}";
		document.getElementById("ItemFunctionForm").action = path;
		document.getElementById("ItemFunctionForm").submit();
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>编辑反馈项类别</td>
  </tr>
</table>
  
<input type="hidden" name="hid">

<div class=editblock >

	<html:form method="post" action="/componentFeedBack/itemFunction.do?method=modify&itemFID=${itemFunction.id}">
		<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
			
			<tr height="35"> 
			  <th align="right" width="35%">类别名称：</th>
			  <td width="65%"><nested:text property="funcName" value="${itemFunction.funcName}" onblur="checkNull(this, '请填入类别名称')" size="50"/></td>
			</tr>				
			<tr height="35"> 
			  <th align="right">类别描述：</th>
			  <td><nested:text property="description" onblur="checkNull(this, '请填入类别描述')" value="${itemFunction.description}" size="50"/></td>
			</tr>													
		</table>
	
        <div id=bc align=right>
	  		<input name="button22" type="button" onclick="submitForm()" class="input_button" value=" 保 存 ">
        </div><br>
    </html:form>
  </div>  

</body>
</html>
