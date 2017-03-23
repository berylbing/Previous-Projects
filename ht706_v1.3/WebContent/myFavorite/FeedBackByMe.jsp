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
	function deltr(recordId,path) {
		if(!confirm("确认删除此记录吗?")) return;
		window.location = path + "/componentFeedBack/feedback.do?method=delete&recordId=" + recordId;
	}	
	
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}

	function excel() {
	
	}
	

	function switchPage()
	{
	       var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
	       a.src = "menuFrame1.htm";
	}
	
	function w_open(v){
		open_window(v,900,500);
		return;	
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
		<td>我发布的反馈单</td>
	</tr>
</table>
<input type="hidden" name="hid">
<div class=list>
  <table border="0">
    <tr>            
      <th align="center">序号</th>    
      <th align="center">反馈单号</th>           
      <th align="center">构件名称</th>
      <th align="center">反馈日期</th>
       <th align="center">状态</th>
      <th align="center">操作</th>       
    </tr>
   <logic:iterate id="element" name="FeedbackFormList" property="feedbacks" indexId="index"> 
	<tr>         
      <td align="center" width='10%'>${index+1 }</td>
      <td align="center" width='20%'><a href="../componentFeedBack/feedback.do?method=listFeedback&recordId=${element.recordId}"><bean:write name="element" property="registryId"/></a></td>      
      <td align="center" width='25%'><bean:write name="element" property="asset.name"/></td>  
      <td align="center" width='25%'><bean:write name="element" property="dateOfInformation"/></td>
      <td align="center" width='10%'>
				<logic:equal name="element" property="status" value="0">草稿</logic:equal>
				<logic:equal name="element" property="status" value="1">审核中</logic:equal>
				<logic:equal name="element" property="status" value="2">已批准</logic:equal>
			</td>     
      <td align="center" width='10%'>
        <logic:equal name="element" property="status" value="0">
	      	<img alt="编辑" onclick="location.href='../componentFeedBack/feedback.do?method=preModify&recordId=${element.recordId}'" src="../images/icon/icon_dianping.gif">&nbsp  
			<img alt="删除" onclick="deltr('${element.recordId}','${pageContext.request.contextPath}')" src="../images/icon/del.gif">&nbsp
		</logic:equal>
      </td>       
  </tr>

	</logic:iterate>
           
 </table>
</div>


</body>
</html>

