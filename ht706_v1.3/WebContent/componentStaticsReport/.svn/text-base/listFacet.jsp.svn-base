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
		<td>刻面列表</td>
	</tr>
</table>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>               
      <th align="center">建立者</th>   
      <th align="center">刻面名称</th>          
      <th align="center">父结点</th>    
   	  <th align="center">所属规约</th>    
      <th align="center">最后修改时间</th> 
      <th align="center">说明</th> 
    </tr>
    
<logic:iterate id="facet" name="facetList" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'>${facet.creator}</td>      
      <td align="center" width='20%'>${facet.name}</td>      
      <td align="center" width='10%'>${facet.parentNode}</td>
      <td align="center" width='10%'>${facet.id.specification.version}</td>
      <td align="center" width='10%'>
      <bean:write name="facet" property="lastModifiedTime" format="yyyy-mm-dd"/>
      </td>
      <td align="center" width='10%'>${facet.description}</td>

     
    </tr>
</logic:iterate>

 </table>
</div>

</body>
</html>

