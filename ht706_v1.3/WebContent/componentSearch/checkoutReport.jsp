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
</script>

</head>
<html:form action="/componentSearch/Checkout.do?method=checkout" method="post">
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<div class=editblock >
<table border="0">
     <tr height="20"><th colspan="4">构件出库记录单</th></tr>

     <tr>
        <td width="15%" align="center">构件名称</td>
        <td width="35%" align="left"><bean:write name="CheckoutForm" property="asset.name"/></td>
        <td align="center">构件标识</td>
        <td align="left"><bean:write name="CheckoutForm" property="asset.uniqueId"/></td>
        
     </tr>
     <tr>
        <td align="center">申请人</td>
        <td align="left"><html:text name="CheckoutForm" property="checkout.proposer" value='<%=(String)request.getSession().getAttribute("UserRealName") %>'/></td>
        <td align="center">申请时间</td>
        <td align="left"><html:text name="CheckoutForm" property="dateOfInformation" value='<%=new Date().toLocaleString().substring(0,10) %>'  onfocus="calendar(this,null,null,null)"/></td>        
     </tr>
     <tr>
        <td align="center">出库目的</td>
        <td align="left" colspan="3">
        <html:radio name="CheckoutForm" property="checkout.purpose" value="复用">复用</html:radio>
        <html:radio name="CheckoutForm" property="checkout.purpose" value="修改">修改</html:radio>
        <html:radio name="CheckoutForm" property="checkout.purpose" value="其它">其它</html:radio>
                 
        </td>
     </tr>
     <tr>
        <td align="center">应用项目<font color="red">*</font></td>
        <td align="left" colspan="3"><html:text name="CheckoutForm" property="checkout.project" /></td>	    
     </tr>
         <tr>
           <td width="15%" align="center">出库说明<font color="red">*</font></td>
           <td colspan="3" width="85%" height="50">
               <html:textarea name="CheckoutForm" property="checkout.reason" />
           </td>
           
         </tr>
         <tr>
           <td width="15%" align="center">反馈协议</td>
           <td colspan="3" width="85%" height="50"><html:text name="CheckoutForm" property="checkout.agreement" /></td>
         </tr>
      <html:hidden name="CheckoutForm" property="checkout.uniqueId" value='${CheckoutForm.asset.uniqueId}'/>
</table>
     <input type="submit" value="出库" >
     <input type="button" value="取消" onclick="window.close()">     
</div>
</html:form>
</body>
</html>
