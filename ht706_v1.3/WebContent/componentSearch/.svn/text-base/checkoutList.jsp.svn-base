<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="java.util.Date" language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>构件问题报告</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script src="../js/calendar.js" type="text/javascript"></script>
<script>

	function change() {

	}	
	function downloadFile(v) {
		location.href="Download.do?path="+v;
	}	
</script>

</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>
	<DIV class=macrolong_aTab>
	        <div align="center"><B>构件元素</B></div>		
		<div class=list>
		  <table id=ta1>
		    <tr> 
		      <th width="20%">元素名称</th>
		      <th width="10%">类型</th>
		      <th width="10%">介质</th>	
		      <th width="10%">提供者</th>
		      <th width="10%">提供日期</th>	      			      	      
		    </tr>
		    <logic:iterate id="list" name="CheckoutList" property="elements" indexId="index"> 
			    <tr> 
			      <td>
			      	<logic:iterate id="lista" name="list" property="elimentfileses">
			      		<a onclick="downloadFile('${lista.filePath}')"><bean:write name="list" property="name"/></a>
			      	</logic:iterate>
			      </td>
			      <td><bean:write name="list" property="elementType"/></td>
			      <td><bean:write name="list" property="media"/></td>
			      <td><bean:write name="list" property="provider"/></td>
			      <td><bean:write name="list" property="dateOfInformation"/></td>		      		      		      		      
			   	</tr>
		    </logic:iterate>
		  </table>
		</div> 
</DIV>
</body>
</html>
