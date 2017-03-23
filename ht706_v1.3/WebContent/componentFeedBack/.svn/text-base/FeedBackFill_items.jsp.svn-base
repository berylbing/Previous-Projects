<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>软件服务反馈</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function w_open(v,iId,recordId,path){
	    if(v==0) {
	    	window.location = path + "/componentFeedBack/feedback.do?method=preModifyFeedbackItem&itemId=" + iId + "&recordId=" + recordId;	
	    } else { 
	       window.location = path + "/componentFeedBack/feedback.do?method=deleteFeedbackItem&itemId=" + iId + "&recordId=" + recordId;
	    }
	}

	
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left">填写反馈项</td>
	</tr>	
</table>

<hr color=#97D2FF>
<div class=list>
<table border="0">
	<tr>
	  <th align="center" width="5%">序号</th>
	  <th align="center" colspan='2' width="25%">考核内容</th>
	  <th align="center" width="10%">分值</th>
	  <th align="center" width="30%">评分细则</th>
	  <th align="center" width="20%">备注</th>
	  <th align="center" width="5%">得分</th> 
	  <th align="center" width="5%">操作</th> 
	</tr>
	<logic:iterate id="element" name="feedbackItems" indexId="index">
		<tr>
			<td align="center">${index+1}</td>
			<td align="center">
			   <b>${element.itemName}</b><br>
			</td>
			<td align="center">
			   <b>${element.itemFunction.funcName}</b><br>
			</td>
			<td align="center">${element.scoreStandard}</td>
			<td align="center">
			   ${element.detail}	   		   	   
			</td>
			<td align="center">${element.description}
			</td>
			<td align="center">${element.score}</td>		
			<td align="center"><img onclick="w_open(0,'${element.itemId}','${recordId}','${pageContext.request.contextPath}')" src="../images/icon/icon_dianping.gif" width="16" height="16" border="0">&nbsp;&nbsp;&nbsp;<img onclick="w_open(1,'${element.itemId}','${recordId}','${pageContext.request.contextPath}')" src="../images/icon/del.gif" width="16" height="16" border="0"></td>	 
		
		</tr>
	</logic:iterate>
	<tr>

		<td align="center" colspan='1'>合计:</td>
		<td align="center" colspan='1'>标准分:</td>
		<td align="center" width='100'>${totalScoreStandard}</td>
		<td align="center" colspan='1'>得分:</td>
		<td align="center" width='100'>${totalScore}</td>
		<td align="center"></td>
		<td align="center"></td>
	</tr>
</table>
  <div id=bc align=right>
   	  <input onclick="location.href='feedback.do?method=preAddFeedbackItem&recordId=${recordId}'" type='button' value=' 新  项 ' class="input_button">&nbsp;	
      <logic:equal name="isCreateAsset" value="false">
      		<input type='button' value=' 完  成 ' class="input_button" onclick="window.close()">&nbsp;	     
 	  </logic:equal>
 	  <logic:equal name="isCreateAsset" value="true">
      		<input type='button' value=' 完  成 ' class="input_button" onclick="window.location.href='../componentRelease/ComponentList.do?method=showComponentAction'">&nbsp;	     
 	  </logic:equal> 
  </div><br>
 </div>
</body>
</html>
