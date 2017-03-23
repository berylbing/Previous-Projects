<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>构件问题报告</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>

	function change() {

	}	
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left"><span id="componentName"><font color="red">构件问题报告</font></span></td>
	</tr>	
</table>

<input type="hidden" name="hid">

<div class=editblock >
<table border="0">
     <tr><th colspan="4">构件问题报告单</th></tr>

     <tr>
        <td width="15%" align="center">问题编号<font color="red">*</font></td>
        <td width="35%" align="left">${problemReport.reportId}</td>
        <td align="center">报告人<font color="red">*</font></td>
        <td align="left">${problemReport.reporter}</td>
       
     </tr>
     <tr>
        <td align="center">应用项目<font color="red">*</font></td>
        <td align="left">${problemReport.project}</td>
        <td align="center">报告人单位<font color="red">*</font></td>
        <td align="left">${problemReport.dept}</td>
        
     </tr>
     <tr>
        <td align="center">危害程度<font color="red">*</font></td>
        <td align="left">
        		<logic:equal name="problemReport" property="harm" value="1">轻微</logic:equal>
				<logic:equal name="problemReport" property="harm" value="2">一般</logic:equal>
				<logic:equal name="problemReport" property="harm" value="3">严重</logic:equal>
		</td>           
        <td align="center">解决状态<font color="red">*</font></td>
        <td align="left">
				<logic:equal name="problemReport" property="status" value="0">待解决</logic:equal>
				<logic:equal name="problemReport" property="status" value="1">已解决</logic:equal>
		</td>
     </tr>
     <tr>
        <td align="center">发现日期<font color="red">*</font></td>
        <td align="left">${problemReport.discoveryDate}</td>	    
        <td align="center">报告日期<font color="red">*</font></td>
        <td align="left">${problemReport.reportDate}</td>	    
     </tr>

         <tr>
           <td width="15%" align="center">应用背景<font color="red">*</font></td>
           <td colspan="3" width="85%" height="50">${problemReport.background}</td>
         </tr>
         <tr>
           <td width="15%" align="center">问题描述<font color="red">*</font></td>
           <td colspan="3" width="85%" height="50">${problemReport.description}</td>
         </tr>
         <tr>
           <td width="15%" align="center">修改建议</td>
           <td colspan="3" width="85%" height="50">${problemReport.suggestion}</td>
         </tr>
         <tr>
           <td width="15%" align="center">附件</td>
           <td colspan="3" width="85%"><a href="#" onclick="window.open('excel/按考核对象统计.xls')">${problemReport.file}</a></td>
         </tr>         

</table>
<input type='button' value=' 返  回 ' class="input_button" onclick="window.history.back()">&nbsp;
</div>

</body>
</html>
