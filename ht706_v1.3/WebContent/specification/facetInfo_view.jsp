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
		
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<br>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">���ƣ�</th> 
		  <td width="75%"><bean:write name="facetss" property="name"/></td>
		</tr>
		
		<tr height="35"> 
		  <th align="right">�ڵ����ͣ�</th>
		  <td>
                <bean:write name="facetss" property="nodeType"/>
		  </td>
		</tr>
		
		<tr height="35"> 
		  <th align="right">���ڵ㣺</th>
		  <td>
		       <logic:notEqual name="facetss" property="parentNode" value="-1">
					${parent}
				</logic:notEqual>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">�������ͣ�</th>
		  <td>
				<logic:equal name="facetss" property="releaseType" value='${1}'>�ڲ�����</logic:equal>
				<logic:equal name="facetss" property="releaseType" value='${0}'>ȫ�ַ���</logic:equal> 
		  </td>
		</tr>							
		<tr height="35"> 
		  <th align="right">�ڵ�˵����</th>
		  <td><bean:write name="facetss" property="description"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">����޸�ʱ�䣺</th>
		  <td width="75%">
		  ${createtime}
		  </td>
		</tr>		
		<tr height="35"> 
		  <th align="right">�����ߣ�</th>
		  <td width="75%">
		  ${creator}
		  </td>
		 </tr>
		<tr height="35"> 
		  <th align="right">������Լ��</th>
		  <td>${facetss.id.specification.version}</td>
		</tr>									
	</table>
  <div id=bc align=right>

  </div>

</div> 
</body>
</html>
