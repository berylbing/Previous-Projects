<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>������������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>��ϵ�б�</td>
	</tr>
</table>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">���</th>               
      <th align="center">��ϵ����</th>   
      <th align="center">��ϵ����</th>              
      <th align="center">����޸�ʱ��</th> 
      <th align="center">˵��</th> 
    </tr>
    
<logic:iterate id="relation" name="relationList" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'>${relation.relationType}</td>      
      <td align="center" width='20%'>${relation.relationName}</td> 
      <td align="center" width='10%'>
      <bean:write name="relation" property="lastModifiedTime" format="yyyy-mm-dd"/></td>
      <td align="center" width='10%'>${relation.description}</td>

     
    </tr>
</logic:iterate>

 </table>
</div>

</body>
</html>

