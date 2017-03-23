<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>构件问题报告追踪</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
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
	
	function problemQuery(rid){
     	window.location = "../componentFeedBack/problemReport.do?method=listProblemReport&RID=" + rid;
    }
	
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>问题跟踪记录</td>
	</tr>
</table>

<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>               
      <th align="center">问题编号</th>
      <th align="center">责任人</th>      
      <th align="center">执行日期</th>
      <th align="center">执行内容</th>      
      <th align="center">解决状态</th>    
    </tr>
   <logic:iterate id="problemTrace" name="problemTraceList" indexId="index">
	   <tr>
	      <td align="center" width='120'><a onclick="problemQuery('${problemTrace.problemreport.recordId}')">${problemTrace.reportId}</a></td> 
	      <td align="center" width='60'>${problemTrace.person}</td>
	      <td align="center" width='80'><nested:write name="problemTrace" property="dateOfInformation"/></td>
	      <td align="center" width='90'>${problemTrace.content}</td>
	        <!-- 解决状态还不确定 -->
	      <td align="center" width='60'>
	      		<logic:equal name="problemTrace" property="status" value="0">待解决</logic:equal>
				<logic:equal name="problemTrace" property="status" value="1">已解决</logic:equal>
	      </td>
	   </tr> 	
   </logic:iterate>
   
 </table>
</div>

</body>
</html>
