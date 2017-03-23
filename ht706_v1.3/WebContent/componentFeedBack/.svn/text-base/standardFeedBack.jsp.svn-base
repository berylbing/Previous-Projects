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

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td align="left">标准反馈项</td>
	</tr>
</table>
<html:form method="post" action="/componentFeedBack/standardFeedback.do">
<div class=list>
<table border="0">
	<tr>
	  <td align="center" width="30%"><b>版本信息:</b></td>
	  <td>
	      <nested:write property="standardFeedback.version"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>版本说明:</b></td>
	  <td>
	      <nested:write property="standardFeedback.about"/>
	  </td>
	</tr>
	<tr>
	  <td align="center" width="30%"><b>前导版本:</b></td>
	  <td>
	      <nested:write property="standardFeedback.accordingToVersion"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>创建者:</b></td>
	  <td>
	      <nested:write property="standardFeedback.creatorId"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>创建时间:</b></td>
	  <td>
	      <nested:write property="standardFeedback.dateOfInformation"/>
	  </td>
	</tr>
</table>

<table border="0">
	<tr>
	   <th align="center" width="5%">序号</th>
	  <th align="center" colspan='2' width="25%">考核内容</th>
	  <th align="center" width="10%">分值</th>
	  <th align="center" width="35%">评分细则</th>
	  <th align="center" width="25%">备注</th>
	</tr>
	
	<nested:iterate id="element" property="standFeedbackItems" indexId="index">
		<tr>
			<td align="center">${index+1}</td>
			<td align="center">
			   <b><nested:write property="itemName"/></b><br>
			</td>
			<td align="center">
			   <b><nested:write property="itemFunction.funcName"/></b><br>
			</td>
			<td align="center"><nested:write property="scoreStandard"/></td>
			<td align="center">
			   <nested:write property="detail"/>	   		   	   
			</td>
			<td align="center"><nested:write property="description"/>
			</td>	
		</tr>
	</nested:iterate>

	<tr>

		<td align="center" colspan='2'>标准分合计：</td>
		<td align="center" width='100'>${totalScoreStandard}</td>
		<td align="center"></td>
		<td align="center"></td>
	</tr>

</table>
</div>
</html:form>


  <div id=bc align=right>
      <input type='button' value=' 返  回 ' class="input_button" onclick="window.history.back()">&nbsp;	
  </div><br>

</body>
</html>
