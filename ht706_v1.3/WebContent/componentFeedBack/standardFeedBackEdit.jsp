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
	function n_open(path, sid){

		if(document.getElementById("about").value == "")
		{
			alert("����д�汾˵��");
			return;
		}	
		var actionPath = path + "/componentFeedBack/standardFeedback.do?method=modify&SfId=" + sid;
		document.getElementById("StandardFeedbackForm").action = actionPath;
		document.getElementById("StandardFeedbackForm").submit();
	}
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left">��׼������</td>
	</tr>
</table>
<html:form method="post" action="/componentFeedBack/standardFeedback.do?method=modify">
<div class=list>
<table border="0">
	<tr>
	  <td align="center" width="30%"><b>�汾��Ϣ:</b></td>
	  <td>
	      <nested:write property="version"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>�汾˵��:</b></td>
	  <td>
	      <nested:text property="about"/>
	  </td>
	</tr>

</table>

</div>


  <div id=bc align=right>
  	  <input name="button23" type="button" class="input_button" value=" ��  �� " onclick="n_open('${pageContext.request.contextPath}','${SfId}')">     
      <input type='button' value=' ��  �� ' class="input_button" onclick="window.history.back()">&nbsp;	     
  </div><br>
</html:form>
</body>
</html>

