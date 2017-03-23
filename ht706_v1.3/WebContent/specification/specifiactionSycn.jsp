<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="js/check.js" type="text/javascript"></script>
<script>
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}

	function excel() {
		window.open("excel/按考核对象统计.xls");
	}
	
	function checkSpecification() {
		window.open("menuFrame1.jsp");
	}	
</script>

<style>
	a { cursor:hand; }
</style>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>待同步规约</td>
	</tr>
</table>


<div class=list>
<li>交大：不需做</li>
<!--<table>-->
<!--	<tr>-->
<!--		<th width="10%">规约版本号</th>-->
<!--		<th width="9%">建立日期</th>-->
<!--		<th width="9%">发送者</th>-->
<!--		<th width="9%">接收者</th>	-->
<!--		<th width="9%">执行状态</th>-->
<!--		<th>操作</th>-->
<!--	</tr>	-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a onclick="checkSpecification()">S200080</a></td>-->
<!--		<td width="9%" align="center">2009-09-09</td>-->
<!--		<td width="9%" align="center">10.17.12.180</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">本地接收</td>-->
<!--		<td width="9%" align="center"><a onclick="alert('在数据库中执行同步操作')">同步</a></td>-->
<!--	</tr>	-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">S200081</a></td>-->
<!--		<td width="9%" align="center">2009-09-10</td>-->
<!--		<td width="9%" align="center">10.17.12.181</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">本地接收</td>-->
<!--		<td width="9%" align="center">同步过期</td>-->
<!--	</tr>	-->
<!--</table>-->
</div>
</div>
</body>
</html>
