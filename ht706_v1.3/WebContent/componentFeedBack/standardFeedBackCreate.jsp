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
	function checkVersion()
	{
		var version = document.getElementById("version").value;
		var url = "../componentFeedBack/standardFeedback.do?method=checkVersion&version=" + version;
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.onreadystatechange = processor;
		xmlhttp.open("post",url);
		xmlhttp.send(null);
	}
	// added by wanghao
	// 处理检测编号的结果
	function processor()
	{
		if(xmlhttp.readyState==4)
			if(xmlhttp.status==200){	
				document.getElementById("error").innerHTML=xmlhttp.responseText;
			}
	}
	function n_open(path, sid){
		if(document.getElementById("version").value == "")
		{
			alert("请填写版本信息");
			return;
		}
		var error = document.getElementById("error").innerText;
		if(error == "版本号已存在 ")
		{
			alert("版本号已存在");
			return;
		}
		if(document.getElementById("about").value == "")
		{
			alert("请填写版本说明");
			return;
		}	
		var actionPath = path + "/componentFeedBack/standardFeedback.do?method=create";
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
		<td align="left">标准反馈表</td>
	</tr>
</table>
<html:form method="post" action="/componentFeedBack/standardFeedback.do?method=create">
<div class=list>
<table border="0">
	<tr>
	  <td align="center" width="30%"><b>版本信息:</b></td>
	  <td>
	      <nested:text property="version" onblur="checkVersion()"/><label id="error"></label>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>版本说明:</b></td>
	  <td>
	      <nested:text property="about"/>
	  </td>
	</tr>
</table>

</div>

  <div id=bc align=right>
  	  <input name="button23" type="button" class="input_button" value=" 创  建 " onclick="n_open('${pageContext.request.contextPath}')">     
      <input type='button' value=' 返  回 ' class="input_button" onclick="window.history.back()">&nbsp;	     
  </div><br>
</html:form>
</body>
</html>
