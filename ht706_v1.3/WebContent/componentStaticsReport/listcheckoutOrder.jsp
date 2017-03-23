<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">

<html>
<head>
<title>构件下载排行榜</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<br>

<input type="hidden" name="hid">

<div class=list>
  <table border="0">
    <tr>            
      <th align="center">序号</th>    
      <th align="center">构建编号</th>
      <th align="center">构建名称</th>           
      <th align="center">下载次数</th>           
    </tr>
   <logic:iterate id="checkout" name="checkoutOrderList" indexId="index"> 
	<tr>         
      <td align="center" width='10%'>${index+1}</td>
      <td align="center" width='30%'>${checkout.uniqueId}</td>      
      <td align="center" width='25%'>${checkout.name}</td>
      <td align="center" width='25%'>${checkout.num}</td>        
    </tr>
	</logic:iterate>
           
 </table>
</div>


</body>
</html>

