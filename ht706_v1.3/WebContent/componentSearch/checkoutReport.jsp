<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="java.util.Date" language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>�������ⱨ��</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script src="../js/calendar.js" type="text/javascript"></script>
<script>

	function change() {

	}	
</script>

</head>
<html:form action="/componentSearch/Checkout.do?method=checkout" method="post">
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<div class=editblock >
<table border="0">
     <tr height="20"><th colspan="4">���������¼��</th></tr>

     <tr>
        <td width="15%" align="center">��������</td>
        <td width="35%" align="left"><bean:write name="CheckoutForm" property="asset.name"/></td>
        <td align="center">������ʶ</td>
        <td align="left"><bean:write name="CheckoutForm" property="asset.uniqueId"/></td>
        
     </tr>
     <tr>
        <td align="center">������</td>
        <td align="left"><html:text name="CheckoutForm" property="checkout.proposer" value='<%=(String)request.getSession().getAttribute("UserRealName") %>'/></td>
        <td align="center">����ʱ��</td>
        <td align="left"><html:text name="CheckoutForm" property="dateOfInformation" value='<%=new Date().toLocaleString().substring(0,10) %>'  onfocus="calendar(this,null,null,null)"/></td>        
     </tr>
     <tr>
        <td align="center">����Ŀ��</td>
        <td align="left" colspan="3">
        <html:radio name="CheckoutForm" property="checkout.purpose" value="����">����</html:radio>
        <html:radio name="CheckoutForm" property="checkout.purpose" value="�޸�">�޸�</html:radio>
        <html:radio name="CheckoutForm" property="checkout.purpose" value="����">����</html:radio>
                 
        </td>
     </tr>
     <tr>
        <td align="center">Ӧ����Ŀ<font color="red">*</font></td>
        <td align="left" colspan="3"><html:text name="CheckoutForm" property="checkout.project" /></td>	    
     </tr>
         <tr>
           <td width="15%" align="center">����˵��<font color="red">*</font></td>
           <td colspan="3" width="85%" height="50">
               <html:textarea name="CheckoutForm" property="checkout.reason" />
           </td>
           
         </tr>
         <tr>
           <td width="15%" align="center">����Э��</td>
           <td colspan="3" width="85%" height="50"><html:text name="CheckoutForm" property="checkout.agreement" /></td>
         </tr>
      <html:hidden name="CheckoutForm" property="checkout.uniqueId" value='${CheckoutForm.asset.uniqueId}'/>
</table>
     <input type="submit" value="����" >
     <input type="button" value="ȡ��" onclick="window.close()">     
</div>
</html:form>
</body>
</html>
