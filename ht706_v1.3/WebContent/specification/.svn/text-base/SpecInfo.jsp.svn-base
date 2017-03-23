<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
	function change(u){

	}
	function load(){
			var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
			var menu = parent.document.getElementById("leftFrame");
			menu.src = "SpecificationAction.do?method=preSpeMenu&temp=view&Id=${specification.specUuid}";
		}
	
	
</script>
</head>

<body onload = "load()" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<!--<hr color=#97D2FF>-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
		<tr>          
		   <td><div id="aspect"><b>当前规约描述</b></div></td>
		</tr>		
</table>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">规约版本：</th>
		  <td width="75%">
		   ${specification.version}
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">前导规约：</th>
		  <td>
              ${prespecificationid}
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">依据的申请单：</th>
		  <td>
		      ${specification.reason}
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">发布类型：</th>
		  <td>
				<logic:equal name="specification" property="releaseType" value='${2}'>内部发布</logic:equal>
				<logic:equal name="specification" property="releaseType" value='${1}'>全局发布</logic:equal> 
		  </td>
		</tr>						
		<tr height="35"> 
		  <th align="right">规约说明：</th>
		  <td width="75%">
		  	<bean:write name="specification" property="description"/>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">库名称：</th>
		  <td width="75%">
		  ${lid} 
		  </td>
		</tr>			
		<tr height="35"> 
		  <th align="right">创建者：</th>
		  <td width="75%">
		  ${creator}
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">创建时间：</th>
		  <td width="75%">
		  ${createtime}
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">状态：</th>
		  <td width="75%">
		  	<logic:equal name="specification" property="status" value='${1}'>草稿</logic:equal>
		  	<logic:equal name="specification" property="status" value='${2}'>审批中</logic:equal> 
		  	<logic:equal name="specification" property="status" value='${3}'>已批准</logic:equal>
		  	<logic:equal name="specification" property="status" value='${4}'>当前</logic:equal>
		  	<logic:equal name="specification" property="status" value='${5}'>历史</logic:equal>
		  </td>
		</tr>									
	</table>
			
  <div id=bc align=right>

  </div><br>

</div> 
</body>
</html>
