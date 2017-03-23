<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>构件问题报告</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script src="../js/calendar.js" type="text/javascript"></script>
<script>


// 检测问题编号是否可用
function checkReportId()
{
	var reportId = document.getElementById("reportId").value;
	var url = "../componentFeedBack/problemReport.do?method=checkReportId&reportId=" + reportId;
	xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	xmlhttp.onreadystatechange = processor;
	xmlhttp.open("post",url);
	xmlhttp.send(null);
}


// 处理检测编号的结果
function processor()
{
	if(xmlhttp.readyState==4)
		if(xmlhttp.status==200){	
			document.getElementById("error").innerHTML=xmlhttp.responseText;
		}
}

function n_open(uuid){
	// added by wanghao
	// 表单验证
	// reportId, project, dept, background, description, suggestion
	var error;
	
	if(document.getElementById("reportId").value == "" )
	{
		alert("请填写问题编号");
		return;
	}

	error = document.getElementById("error").innerText;
	if(error == "问题编号已存在 ")
	{
		alert("问题编号已存在");
		return;
	}

	if(document.getElementById("project").value == "")
	{
		alert("请填写应用项目");
		return;
	}

	if(document.getElementById("dept").value == "")
	{
		alert("请填写报告人单位");
		return;
	}

	if(document.getElementById("discoveryDate").value == "")
	{
		alert("请选择发现日期");
		return;
	}

	if(document.getElementById("background").value == "")
	{
		alert("请填写应用背景");
		return;
	}

	if(document.getElementById("description").value == "")
	{
		alert("请填写问题描述");
		return;
	}

	if(document.getElementById("suggestion").value == "")
	{
		alert("请填写应用修改建议");
		return;
	}
		
	if(!confirm("提交问题报告至构件库管理员?")) return;
//	var uuid = request.getParamater("AssetUUID");
	var actionPath = "../componentFeedBack/problemReport.do?method=create&AssetUUID="+uuid;
	document.getElementById("ProblemReportForm").action = actionPath;
	document.getElementById("ProblemReportForm").submit();
}
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left"><span id="componentName"><font color="red">构件问题报告</font></span></td>
	</tr>	
</table>

<input type="hidden" name="hid">

<div class=editblock >
<html:form method="post" action="/componentFeedBack/problemReport.do?method=create" enctype= "multipart/form-data">
<table border="0">
     <tr><th colspan="4">构件问题报告单</th></tr>

     <tr>
        <td width="15%" align="center">问题编号<font color="red">*</font></td>
        <td width="35%" align="left"><nested:text property="reportId" onchange="checkReportId()"/><label id="error"></label></td>
     </tr>
     <tr>
        <td align="center">应用项目<font color="red">*</font></td>
        <td align="left"><nested:text property="project" /></td>
        <td align="center">报告人单位<font color="red">*</font></td>
        <td align="left"><nested:text property="dept" /></td>
        
     </tr>
     <tr>
        <td align="center">危害程度<font color="red">*</font></td>
        <td align="left">
		    	<nested:select property="harm" onchange="change(this.value)" value="1">			
				<option value="1">轻微</option>
				<option value="2">一般</option>
				<option value="3" selected>严重</option>											
		        </nested:select>        
        </td>
     <td align="center">发现日期<font color="red">*</font></td>
        <td align="left">
         <nested:text  property="discoveryDate" value="" onfocus="calendar(this,null,null,null)" size="20" />
		<img style="cursor:hand;" name="img1" src="../images/icon/calendarIcon.gif" border=0 width="17" height="17" >
	   
	    </td>
     </tr>

         <tr>
           <td width="15%" align="center">应用背景<font color="red">*</font></td>
           <td colspan="3" width="85%">
           		<nested:textarea property="background" cols="85%" rows="3"/>
           </td>
         </tr>
         <tr>
           <td width="15%" align="center">问题描述<font color="red">*</font></td>
           <td colspan="3" width="85%">
              <nested:textarea property="description" cols="85%" rows="3"/>
           </td>
         </tr>
         <tr>
           <td width="15%" align="center">修改建议</td>
           <td colspan="3" width="85%">
              <nested:textarea property="suggestion" cols="85%" rows="3"/>
           </td>
         </tr>
         <tr>
           <td width="15%" align="center">附件</td>
           <td colspan="3" width="85%"><html:file property="file" name="ProblemReportForm"></html:file></td>
         </tr>         

</table>
</html:form>
</div>

  <div id=bc align=right>	
      <input type='button' value=' 提  交 ' class="input_button" onclick="n_open('<%= request.getParameter("AssetUUID")%>');">&nbsp;	     
  </div><br>

</body>
</html>
