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
		<td>规约信息</td>
	</tr>
</table>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">序号</th> 
      <th align="center">构件名称</th>         
      <th align="center">关键词</th>            
      <th align="center">领域</th>    
      <th align="center">密级</th>
      <th align="center">语言</th> 
    </tr>
    
<logic:iterate id="asset" name="assetList" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'>${asset.name}</td>      
      <td align="center" width='20%'>${asset.keyword}</td>      
      <td align="center" width='10%'>${asset.domain}</td>
      <td align="center" width='10%'>${asset.securityClassification}</td>
      <td align="center" width='10%'>${asset.language}</td>
     
    </tr>
</logic:iterate>

 </table>
</div>

</body>
</html>

