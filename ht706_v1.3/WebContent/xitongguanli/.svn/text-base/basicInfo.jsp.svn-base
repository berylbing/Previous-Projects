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
     <script>		
		function basicInfoEdit() {
                     location.href = "basicInfoAction.do?method=preBasicInfoForm";
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
<div class=list>
<table>
	<tr>
		<th colspan=3 align=left width="10%">构件库基本信息表（UDM要求）</th>
	</tr>
	<tr>
		<td align=center width="8%">1</td>
		<td width="20%" align="center">认证方法</td>
		
		<td width="72%"><nested:write name="BasicInfoForm" property="library.certificationMethods"/></td>

	</tr>
	<tr>
		<td align=center>2</td>
		<td align="center">联系方式</td>		
		<td><nested:write name="BasicInfoForm" property="library.contactMethod"/></td>
	</tr>
	<tr>
		<td align=center>3</td>
		<td align="center">电子地址</td>
		<td><nested:write name="BasicInfoForm" property="library.electronicAddress"/></td>
	</tr>
	<tr>
		<td align=center>4</td>
		<td align="center">库分类机制</td>		
		<td><nested:write name="BasicInfoForm" property="library.libraryClassificationMechanism"/></td>
	</tr>
	<tr>
		<td align=center>5</td>
		<td align="center">库度量</td>
		<td><nested:write name="BasicInfoForm" property="library.libraryMetrics"/></td>
	</tr>	
	<tr>
		<td align=center>6</td>
		<td align="center">库限定</td>
		<td><nested:write name="BasicInfoForm" property="library.libraryRestrications"/></td>
	</tr>	
</table>
</div>
<div class=list>
<table>
	<tr>
		<th colspan=3 align=left>其它信息表</th>
	</tr>
	<tr>
		<td align=center width="8%">1</td>
		<td width="20%" align="center">库建立时间</td>
		<td width="72%"><nested:write name="BasicInfoForm" property="dateOfCreation"/></td>
	</tr>
		<logic:iterate id="element" name="AdminList" indexId="index">

		<tr>
			<td align=center width="8%">${index+2}</td>
			<td width="20%" align="center">库管理员</td>
			<td width="72%"><nested:write name="element" property="organization.name"/></td>
		</tr>

	</logic:iterate> 

</table>

</div>


  <div id=bc align=right>
  	<input onclick='basicInfoEdit()' type=button value=' 编 辑 ' class='input_button'>  	
  </div><br>

</body>

</html>
</html:html>
