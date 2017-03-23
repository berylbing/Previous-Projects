<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<title>我的问题报告单</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
    function problemQuery(rid){
        	window.location = "../componentFeedBack/problemReport.do?method=listProblemReport&RID=" + rid;
        }
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}

	

	function switchPage()
	{
	       var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
	       a.src = "menuFrame1.htm";
	}
	
	function w_open(v){
		hid.value = v;

		if (v == 8) {
		        //showModalDialog("problemReport_1.htm", "UUID","dialogHeight:500px; dialogWidth:900px; help:no");
		        open_window('problemReport_2.htm',900,500);		        
		        return;		
		}

		if (v == 7) {
		        //showModalDialog("problemReport_1.htm", "UUID","dialogHeight:500px; dialogWidth:900px; help:no");
		        open_window('problemReport_1.htm',900,500);		        
		        return;		
		}

		if (v == 6) {
		        showModalDialog("myFavorite_1.htm", "UUID","dialogHeight:280px; dialogWidth:550px; help:no");
		        return;		
		}
		
		if (v == 5) {
		        showModalDialog("release4.htm", "UUID","dialogHeight:500px; dialogWidth:900px; help:no");		
		        return;		
		}
		
		if (v == 4) {
		        //showModalDialog("FeedBackFill_1.htm", "UUID","dialogHeight:500px; dialogWidth:900px; help:no");		
		        open_window('FeedBackFill_1.htm',900,500);
		        return;		
		}		

		if (v == 3) {
		        open_window('communication.htm',900,500);
		        return;		
		}
		
		if (v == 1) {
			if (document.getElementById("sourceId") != null)
				document.getElementById("sourceId").id = "";
			event.srcElement.parentElement.parentElement.parentElement.id = "sourceId";
		        return;
		}
		
		if (v == 0) {
		        showModalDialog("searchFilter.htm", "","dialogHeight:300px; dialogWidth:500px; help:no");		        	        
		        return;		
		}		

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

<br>
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>我的问题报告单</td>
	</tr>
</table>
<input type="hidden" name="hid">
<div class=list>
  <table border="0">
    <tr>
      <th align="center">序号</th>
      <th align="center">问题单号</th>
      <th align="center">构件号称</th>
      <th align="center">报告日期</th>
      <th align="center">解决状态</th>
    </tr>
    <logic:iterate id="problemReport" name="ProblemReportForm" property="problembyme" indexId="index">
     <tr>
	     <td align="center" width='30'>${index+1 }</td>
	      <td align="center" width='120'><a onclick="problemQuery('${problemReport.recordId}')"><bean:write name="problemReport" property="reportId"/></a></td>   
	      <td align="center" width='60'><bean:write name="problemReport" property="asset.name"></bean:write></td>
	      <td align="center" width='80'><bean:write name="problemReport" property="reportDate"></bean:write></td>
	      <td align="center" width='60'>
      			<!-- 还不确定状态是什么 -->
      			<logic:equal name="problemReport" property="status" value="0">草稿</logic:equal>
				<logic:equal name="problemReport" property="status" value="1">审批中</logic:equal>
				<logic:equal name="problemReport" property="status" value="2">已批准</logic:equal>
	  </td>       
       </logic:iterate>
            
 </table>
</div>

</body>
</html>

