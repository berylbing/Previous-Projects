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
		<td>�����б�</td>
	</tr>
</table>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">���</th>               
      <th align="center">������</th>   
      <th align="center">��������</th>          
      <th align="center">�����</th>    
   	  <th align="center">������Լ</th>    
      <th align="center">����޸�ʱ��</th> 
      <th align="center">˵��</th> 
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

