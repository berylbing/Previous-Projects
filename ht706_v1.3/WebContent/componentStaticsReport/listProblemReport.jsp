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
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>问题报告单列表</td>
	</tr>
</table>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">序号</th> 
      <th align="center">报告人</th>         
      <th align="center">部门</th>            
      <th align="center">应用项目</th>    
      <th align="center">描述</th>
      <th align="center">建议</th> 
      <th align="center">报告日期</th> 
    </tr>
    
<logic:iterate id="problemreport" name="problemreportList" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'>${problemreport.reporter}</td>      
      <td align="center" width='20%'>${problemreport.dept}</td>      
      <td align="center" width='10%'>${problemreport.project}</td>
      <td align="center" width='10%'>${problemreport.description}</td>
      <td align="center" width='10%'>${problemreport.suggestion}</td>
       <td align="center" width='10%'>
       <bean:write name="problemreport" property="reportDate" format="yyyy-mm-dd"/>
       </td>
     
    </tr>
</logic:iterate>

 </table>
</div>

</body>
</html>

