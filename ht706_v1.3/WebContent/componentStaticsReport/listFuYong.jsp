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
		<td>����ͳ���嵥</td>
	</tr>
</table>
<div class=list>  
<table>
    <tr>
		<th colspan=4 align=left width="10%">�����������Ϣ</th>
	</tr>
	<tr>
	<td width="15%">����������</td>
	<td width="46%">${library.name}</td>
	<td width="15%">���</td>
	<td width="26%">${libraryUniqueId}</td>
	</tr>
	<tr>
	<td width="15%">ͳ����</td>
	<td width="46%">˭����</td>
	<td width="15%">ͳ������</td>
	<td width="26%">��ǰ���ڣ���</td>
	</tr>	
	
</table>
</div>

<div class=list>  
<table border="0" id="ta">
    <tr>            
      <th align="center">���</th> 
      <th align="center">��������</th>
      <th align="center">������</th>        
      <th align="center">����ʱ��</th>            
      <th align="center">����Ŀ��</th>       
      <th align="center">ʹ����Ŀ</th> 
    </tr>
    
<logic:iterate id="checkout" name="Checkoutlist" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'>${checkout.email}</td>  
      <td align="center" width='10%'>${checkout.proposer}</td>    
      <td align="center" width='20%'>
      <bean:write name="checkout" property="dateOfInformation" format="yyyy-mm-dd"/>
      </td>      
      <td align="center" width='10%'>${checkout.purpose}</td>
      <td align="center" width='10%'>${checkout.project}</td>
     
    </tr>
</logic:iterate>

 </table>
</div>

</body>
</html>

