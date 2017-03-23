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
<html:form method="post" action="/componentFeedBack/feedback.do">
<div class=list>
<table border="0">
	<tr>
	 <td align="center" width="30%"><b>登记号:</b></td>
	  <td>
	      <nested:write property="feedback.registryId"/>
	  </td>
	</tr>
	<tr>
	  <td align="center" width="30%"><b>构件名称:</b></td>
	  <td>
		<nested:write property="feedback.asset.name"/>
	  </td>
	</tr>

	<tr>
	  <td align="center" width="30%"><b>评价者:</b></td>
	  <td>
	      <nested:write property="feedback.provider"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>评价日期:</b></td>
	  <td>
	      <nested:write property="feedback.dateOfInformation"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>应用背景:</b></td>
	  <td>
	      <nested:write property="feedback.background"/>
	  </td>
	</tr>
	<tr>  
	  <td align="center" width="10%"><b>构件使用环境:</b></td>
	  <td>
	      <nested:write property="feedback.enviroment"/>
	  </td>
	</tr>
	<!-- 不清楚进度影响在数据库中的对应
	<tr>  
	  <td align="center" width="10%"><b>成本效益情况:</b></td>
	  <td>
	      <nested:write property="feedback.dateOfInformation"/>
	  </td>
	</tr>
	
	<tr>  
	  <td align="center" width="10%"><b>进度影响:</b></td>
	  <td>
	      <nested:write property="feedback.dateOfInformation"/>
	  </td>
	</tr>
	-->
	<tr>  
	  <td align="center" width="10%"><b>其他说明:</b></td>
	  <td>
	      <nested:write property="feedback.description"/>
	  </td>
	</tr>
</table>

<table border="0">
	<tr>
	  <th align="center" width="5%">序号</th>
	  <th align="center" colspan='2' width="25%">考核内容</th>
	  <th align="center" width="10%">分值</th>
	  <th align="center" width="30%">评分细则</th>
	  <th align="center" width="20%">备注</th>
	  <th align="center" width="5%">得分</th> 
	</tr>
	
	<nested:iterate id="element" property="feedbackItems" indexId="index">
		<tr>
			<td align="center">${index+1}</td>
			<td align="center">
			   <b>${element.itemName}</b><br>
			</td>
			<td align="center">
			   <b>${element.itemFunction.funcName}</b><br>
			</td>
			<td align="center"><nested:write property="scoreStandard"/></td>
			<td align="center">
			   <nested:write property="detail"/>	   		   	   
			</td>
			<td align="center"><nested:write property="description"/>
			</td>
			<td align="center"><nested:write property="score"/></td>		
		</tr>
	</nested:iterate>

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
</div>
</html:form>


  <div id=bc align=right>
      <input type='button' value=' 返  回 ' class="input_button" onclick="window.history.back()">&nbsp;	
  </div><br>

</body>
</html>
