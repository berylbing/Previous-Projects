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
		<td>术语列表</td>
	</tr>
</table>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>               
      <th align="center">建立者</th>   
      <th align="center">刻面名称</th>          
      <th align="center">父结点</th>    

      <th align="center">最后修改时间</th> 
      <th align="center">说明</th> 
    </tr>
    
<logic:iterate id="word" name="wordList" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'>${word.creator}</td>      
      <td align="center" width='20%'>${word.name}</td>      
      <td align="center" width='10%'>${word.parentNode}</td>

      <td align="center" width='10%'>
      <bean:write name="word" property="lastModifiedTime" format="yyyy-mm-dd"/>
      </td>
      
      <td align="center" width='10%'>${word.description}</td>

     
    </tr>
</logic:iterate>

 </table>
</div>

</body>
</html>

