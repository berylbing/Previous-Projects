<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>软件服务反馈</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	//added by wanghao
	//检测问题编号是否可用
	function checkRegistryId(recordId)
	{
		var registryId = document.getElementById("registryId").value;
		var url = "../componentFeedBack/feedback.do?method=checkRegistryId&registryId=" + registryId + "&recordId=" + recordId;
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.onreadystatechange = processor;
		xmlhttp.open("post",url);
		xmlhttp.send(null);
	}
	
	//added by wanghao
	//处理检测编号的结果
	function processor()
	{
		if(xmlhttp.readyState==4)
			if(xmlhttp.status==200){	
				document.getElementById("error").innerHTML=xmlhttp.responseText;
			}
	}
	function c_open(path, uuid, createAsset) {
		if(document.getElementById("registryId").value == "" )
		{
			alert("请填写登记号");
			return;
		}
		var error = document.getElementById("error").innerText;
		if(error == "登记号已存在 ")
		{
			alert("登记号已存在");
			return;
		}
		if(document.getElementById("background").value == "" )
		{
			alert("请填写应用背景");
			return;
		}
		if(document.getElementById("enviroment").value == "" )
		{
			alert("请填写使用环境");
			return;
		}
		var actionPath = path + "/componentFeedBack/feedback.do?method=create&AssetUUID=" + uuid + "&createAsset=" + createAsset;
		document.getElementById("FeedbackForm").action = actionPath;
		document.getElementById("FeedbackForm").submit();
	}
	
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left">填写反馈单</td>
	</tr>	
</table>

<input type="hidden" name="hid">

<div class=list>
<html:form method="post" action="componentFeedBack/feedback.do?method=create" enctype= "multipart/form-data">
<table border="0">
	<tr>
	 <td align="center" width="30%"><b>登记号:</b></td>
	  <td>
	      <nested:text property="registryId" onblur="checkRegistryId('')"/>
	      <label id="error"></label>
	  </td>
	</tr>
	
	<tr>
	  <td align="center" width="30%"><b>应用背景:</b></td>
	  <td>
	      <nested:text property="background"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="30%"><b>使用环境:</b></td>
	  <td>
	      <nested:text property="enviroment"/>
	  </td>
	</tr>
	<tr>    
	  <td align="center" width="30%"><b>其它说明:</b></td>
	  <td>
	      <nested:text property="description"/>
	  </td>		  	  
	</tr>
	<tr>    
	  <td align="center" width="30%"><b>附件:</b></td>
	  <td>
	 	<html:file property="file" name="FeedbackForm"></html:file>
	</td>		  	  
	</tr>
</table>

  <div id=bc align=right>
      <input type='button' value=' 提  交 ' class="input_button" onclick="c_open('${pageContext.request.contextPath}','${AssetUUID}','${createAsset}')">&nbsp;	     
  </div><br>
</html:form>
</div>
</body>
</html>
