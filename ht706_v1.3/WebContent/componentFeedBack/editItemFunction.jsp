<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>������������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function submitForm()
	{
		if(document.getElementById("funcName").value == "")
		{
			alert("�������������");
			return;
		}
		if(document.getElementById("description").value == "")
		{
			alert("�������������");
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
    <td>�༭���������</td>
  </tr>
</table>
  
<input type="hidden" name="hid">

<div class=editblock >

	<html:form method="post" action="/componentFeedBack/itemFunction.do?method=modify&itemFID=${itemFunction.id}">
		<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
			
			<tr height="35"> 
			  <th align="right" width="35%">������ƣ�</th>
			  <td width="65%"><nested:text property="funcName" value="${itemFunction.funcName}" onblur="checkNull(this, '�������������')" size="50"/></td>
			</tr>				
			<tr height="35"> 
			  <th align="right">���������</th>
			  <td><nested:text property="description" onblur="checkNull(this, '�������������')" value="${itemFunction.description}" size="50"/></td>
			</tr>													
		</table>
	
        <div id=bc align=right>
	  		<input name="button22" type="button" onclick="submitForm()" class="input_button" value=" �� �� ">
        </div><br>
    </html:form>
  </div>  

</body>
</html>
