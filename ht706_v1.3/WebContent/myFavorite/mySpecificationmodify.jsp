<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">

<html>
<head>
<title>我的申请单记录</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<br>
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>我建立的申请单</td>
	</tr>
</table>
<input type="hidden" name="hid">
<div class=list>
  <table border="0">
    <tr>            
      <th align="center">序号</th>    
      <th align="center">登记号</th>           
      <th align="center">申请人</th>
      <th align="center">申请日期</th>
      <th align="center">状态</th>       
    </tr>
   <logic:iterate id="modify" name="SpecificationmodifyForm" property="modify" indexId="index"> 
	<tr>         
      <td align="center" width='10%'>${index+1 }</td>
      <td align="center" width='30%'><a href="../componentSpecification/SpecificationmodifyAction.do?method=SpecificationmodifyInfo&Id=${modify.registryId}"><bean:write name="modify" property="registryId"/></a></td>      
      <td align="center" width='25%'><bean:write name="modify" property="applicant"/></td>  
      <td align="center" width='25%'><bean:write name="modify" property="dateOfInformation"/></td>
      <td align="center" width='20%'><bean:write name="modify" property="status"/></td>       
    </tr>

	</logic:iterate>
           
 </table>
</div>


</body>
</html>

