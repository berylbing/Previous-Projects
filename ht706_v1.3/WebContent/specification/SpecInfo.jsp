<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>���������ϵͳ</title>
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
		   <td><div id="aspect"><b>��ǰ��Լ����</b></div></td>
		</tr>		
</table>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">��Լ�汾��</th>
		  <td width="75%">
		   ${specification.version}
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">ǰ����Լ��</th>
		  <td>
              ${prespecificationid}
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">���ݵ����뵥��</th>
		  <td>
		      ${specification.reason}
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">�������ͣ�</th>
		  <td>
				<logic:equal name="specification" property="releaseType" value='${2}'>�ڲ�����</logic:equal>
				<logic:equal name="specification" property="releaseType" value='${1}'>ȫ�ַ���</logic:equal> 
		  </td>
		</tr>						
		<tr height="35"> 
		  <th align="right">��Լ˵����</th>
		  <td width="75%">
		  	<bean:write name="specification" property="description"/>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">�����ƣ�</th>
		  <td width="75%">
		  ${lid} 
		  </td>
		</tr>			
		<tr height="35"> 
		  <th align="right">�����ߣ�</th>
		  <td width="75%">
		  ${creator}
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">����ʱ�䣺</th>
		  <td width="75%">
		  ${createtime}
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">״̬��</th>
		  <td width="75%">
		  	<logic:equal name="specification" property="status" value='${1}'>�ݸ�</logic:equal>
		  	<logic:equal name="specification" property="status" value='${2}'>������</logic:equal> 
		  	<logic:equal name="specification" property="status" value='${3}'>����׼</logic:equal>
		  	<logic:equal name="specification" property="status" value='${4}'>��ǰ</logic:equal>
		  	<logic:equal name="specification" property="status" value='${5}'>��ʷ</logic:equal>
		  </td>
		</tr>									
	</table>
			
  <div id=bc align=right>

  </div><br>

</div> 
</body>
</html>
