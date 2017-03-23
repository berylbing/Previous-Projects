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
	function n_open(iId, SfId, path){
		if(document.getElementById("standardFeedbackItem.itemName").value == "")
		{
			alert("����д������");
			return;
		}
		if(document.getElementById("standardFeedbackItem.scoreStandard").value == "")
		{
			alert("����д��ֵ");
			return;
		}
		if(/^\d*(\.\d*)?$/.test(document.getElementById("standardFeedbackItem.scoreStandard").value) == false)
		{
			alert("����д��ȷ�ķ�ֵ");
			return;
		}
		if(document.getElementById("standardFeedbackItem.detail").value == "")
		{
			alert("����д����ϸ��");
			return;
		}
		
		var actionPath = path + "/componentFeedBack/standardFeedback.do?method=modifyStandardFeedbackItem&itemId=" + iId + "&SfId=" + SfId;
		document.getElementById("StandardFeedbackForm").action = actionPath;
		document.getElementById("StandardFeedbackForm").submit();
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>�༭������</td>
  </tr>
</table>
  
<input type="hidden" name="hid">

<div class=editblock >

	<html:form method="post" action="/componentFeedBack/standardFeedback.do?method=modifyStandardFeedbackItem">
		<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
			
			<tr height="35"> 
			  <th align="right" width="35%">�����ƣ�</th>
			  <td width="65%"><nested:text property="standardFeedbackItem.itemName" value="${standardFeedbackItem.itemName}"/></td>
			</tr>
			<tr height="35"> 
			  <th align="right">��������ࣺ</th>
			  <td>
	                <html:select name="sx" property="itemFunctionID" value="${standardFeedbackItem.itemFunction.id}">			
						<html:optionsCollection name="itemFunctionList"  label = "funcName" value = "id"/>			
			        </html:select>
			  </td>
			</tr>			
			<tr height="35"> 
			  <th align="right">��ֵ��</th>
			  <td><nested:text property="standardFeedbackItem.scoreStandard" value="${standardFeedbackItem.scoreStandard}"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right">����ϸ��</th>
			  <td><nested:text property="standardFeedbackItem.detail" value="${standardFeedbackItem.detail}"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right">��ע��</th>
			  <td><nested:text property="standardFeedbackItem.description" value="${standardFeedbackItem.description}"/></td>
			</tr>												
		</table>
	
        <div id=bc align=right>
        <input name="button23" type="button" class="input_button" value=" �� �� " onclick="n_open('${standardFeedbackItem.itemId}','${SfId}','${pageContext.request.contextPath}')">

        </div><br>
    </html:form>
  </div>  

</body>
</html>
