<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>

	function w_open(v,iId,sid,path){

            if(v==0) {
            	window.location = path + "/componentFeedBack/standardFeedback.do?method=preModifyStandardFeedbackItem&SfId=" + sid + "&itemId=" + iId;	
            } else { 
               window.location = path + "/componentFeedBack/standardFeedback.do?method=deleteStandardFeedbackItem&SfId=" + sid + "&itemId=" + iId;
            }

	}

</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<html:form method="post" action="/componentFeedBack/standardFeedback.do?">

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left">新建标准反馈项</td>
	</tr>
</table>

<div class=list>
<table border="0">

	<tr>
	  <th align="center" width="5%">序号</th>
	  <th align="center" colspan='2' width="25%">考核内容</th>
	  <th align="center" width="10%">分值</th>
	  <th align="center" width="35%">评分细则</th>
	  <th align="center" width="20%">备注</th>
	  <th align="center" width="5%">操作</th> 
	</tr>
	<logic:iterate id="standardFeedbackItem" name="standardFeedbackItems" indexId="index">
		<tr>
			<td align="center">${index+1}</td>
			<td align="center">
			   <b>${standardFeedbackItem.itemName}</b><br>
			</td>
			<td align="center">
			   <b>${standardFeedbackItem.itemFunction.funcName}</b><br>
			</td>
			<td align="center">${standardFeedbackItem.scoreStandard}</td>
			<td align="center">
			   ${standardFeedbackItem.detail}   		   	   
			</td>
			<td align="center">${standardFeedbackItem.description}
			</td>		
			<td align="center"><img onclick="w_open(0,'${standardFeedbackItem.itemId}','${SfId}','${pageContext.request.contextPath}')" src="../images/icon/icon_dianping.gif" width="16" height="16" border="0">&nbsp;&nbsp;&nbsp;<img onclick="w_open(1,'${standardFeedbackItem.itemId}','${SfId}','${pageContext.request.contextPath}')" src="../images/icon/del.gif" width="16" height="16" border="0"></td>	 
		
		</tr>
	</logic:iterate>
	<tr>

		<td align="center" colspan='2'>标准分合计：</td>
		<td align="center" width='100'>${totalScoreStandard}</td>
		<td align="center"></td>
		<td align="center"></td>
		<td align="left"></td>		
	</tr>
</table>
</div>

  <div id=bc align=right>
      <input onclick="location.href='standardFeedback.do?method=preAddStandardFeedbackItem&SfId=${SfId}'" type='button' value=' 新  项 ' class="input_button">&nbsp;	
      <input type='button' value=' 确  定 ' class="input_button" onclick="window.location.href='standardFeedback.do?method=listAllStandardFeedback'">&nbsp;	     
  </div><br>
</html:form>
</body>
</html>
