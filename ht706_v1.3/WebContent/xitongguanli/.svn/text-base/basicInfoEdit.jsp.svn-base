<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
  <head>
     <title>配置构件库基本信息</title>
     <meta http-equiv="Content-Type" content="text/html; charset=gbk">
     <link href="../css/common.css" rel="stylesheet" type="text/css">
     <script src="../js/check.js" type="text/javascript"></script>     
     <script src="../js/calendar.js" type="text/javascript"></script>
     <script>

	function saveBasicInfo() {
		if(checkData()){
			document.getElementById("BasicInfoForm").submit();
		}
	}
	function checkData(){
		if(document.getElementById("library.certificationMethods").value==""){alert("请输入'认证方法'");return false;}
		if(document.getElementById("library.contactMethod").value==""){alert("请输入'联系方式'");return false;}
		if(document.getElementById("library.electronicAddress").value==""){alert("请输入'电子地址'");return false;}
		if(document.getElementById("library.libraryClassificationMechanism").value==""){alert("请输入'库分类机制'");return false;}
		if(document.getElementById("library.libraryMetrics").value==""){alert("请输入'库度量'");return false;}
		if(document.getElementById("library.libraryRestrications").value==""){alert("请输入'库限定'");return false;}
		if(document.getElementById("dateOfCreation").value==""){alert("请输入'库建立时间'");return false;}
		if(document.getElementById("library.name").value==""){alert("请输入'库建立人'");return false;}
		return true;

	}
			
</script>
  </head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>基本信息配置</td>
	</tr>
</table>

<html:form action="/xitongguanli/basicInfoAction?method=modifyBasicInfo" method="POST">

<div class=editblock >
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">认证方法：</th>

		  <td width="75%"><nested:text  property="library.certificationMethods" value="${bf.library.certificationMethods}"/>  </td>

		</tr>				
		<tr height="35"> 
		  <th align="right" width="25%">联系方式：</th>
		  <td width="75%"><nested:text  property="library.contactMethod" value="${bf.library.contactMethod}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right" width="25%">电子地址：</th>
		  <td width="75%"><nested:text  property="library.electronicAddress" value="${bf.library.electronicAddress}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right" width="25%">库分类机制：</th>
		  <td width="75%"><nested:text  property="library.libraryClassificationMechanism" value="${bf.library.libraryClassificationMechanism}"/></td>
		</tr>				
		<tr height="35"> 
		  <th align="right">库度量：</th>
		  <td width="75%"><nested:text  property="library.libraryMetrics" value="${bf.library.libraryMetrics}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">库限定：</th>
		  <td width="75%"><nested:text  property="library.libraryRestrications" value="${bf.library.libraryRestrications}"/></td>
		</tr>	
		<tr height="35"> 
		  <th align="right" width="25%">库建立时间：</th>
		  <td width="75%"><nested:text  property="dateOfCreation" value="${bf.dateOfCreation}" onfocus="calendar(this,null,null,null)" size="40" /></td>

		</tr>	
		<tr height="35"> 
		  <th align="right" width="25%">库建立人：</th>
		  <td width="75%"><input type="text" name="library.name" value="${bf.library.name}" size="50"></td>
		</tr>
	</table>
  <div id=bc align=right>
  	<input onclick='saveBasicInfo()' type="button" value=' 保 存 ' class='input_button'>
  </div><br>
</html:form>
</body>
</html:html>