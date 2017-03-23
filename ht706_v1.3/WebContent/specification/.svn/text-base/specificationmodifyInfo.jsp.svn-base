<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<style>
	input{
		font-size: 12px;
		color: #000000;
		background-color: #F1F4F5;
		border: 1px solid #49789C;
		padding:2px 0px 0px 5px;
	}
	
</style>

<script>
function turnback(){
	location.href = "SpecificationmodifyAction.do?method=listSpecificationmodify&select=search"
}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<!--<hr color=#97D2FF>-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
		<tr>          
		   <td><div id="aspect"><b>变更申请单</b></div></td>
		</tr>
	</table>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">登记号：</th>
		  <td width="75%">${specification.registryId}</td>
		</tr>
		<tr height="35"> 
		  <th align="right">申请人：</th>
		  <td>
		  ${specification.applicant}
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">修改项：</th>
		  <td>
		  	<logic:equal name="specification" property="status" value='${1}'>刻面术语</logic:equal>
		  	<logic:equal name="specification" property="status" value='${2}'>同义词</logic:equal> 
		  	<logic:equal name="specification" property="status" value='${3}'>反馈项</logic:equal>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">修改理由：</th>
		  <td>
		  	${specification.reason}
		  </td>
		</tr>						
		<tr height="35"> 
		  <th align="right">修改方案：</th>
		  <td width="75%">${specification.scheme}</td>
		</tr>
		<tr height="35"> 
		  <th align="right">单位意见：</th>
		  <td width="75%">${specification.attitude}</td>
		</tr>			
		<tr height="35"> 
		  <th align="right">登记时间：</th>
		  <td width="75%">
		  <bean:write name="specification" property="dateOfInformation" format="yyyy-MM-dd"></bean:write>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">状态：</th>
		  <td width="75%">
		  <logic:equal name="specification" property="status" value='${1}'>历史</logic:equal>
		  	<logic:equal name="specification" property="status" value='${2}'>草稿</logic:equal> 
		  	<logic:equal name="specification" property="status" value='${3}'>已批准</logic:equal>
		  </td>
		</tr>									
	</table>
			
  <div id=bc align=right>
  	<input onclick="turnback()" type=button value='返回' class='input_button'>  	
  </div>
  <br>

</div> 
</body>

</html>
