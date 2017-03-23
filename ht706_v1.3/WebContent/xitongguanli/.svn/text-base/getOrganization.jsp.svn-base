<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
		<title>构件库管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<style>
input {
	font-size: 12px;
	color: #000000;
	background-color: #F1F4F5;
	border: 1px solid #49789C;
	padding: 2px 0px 0px 5px;
}
</style>
		<script>
	function ret(){
		location.href = "organizationAction.do?method=searchOrganization&Id=${departmentId}&select=-1";
	}
	
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					新建人员
				</td>
			</tr>
		</table>
			
		<div class=editblock>
		
			<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
				<tr height="35">
					<th align="right" width="25%">
						登录名：
					</th>
					<td width="75%">
						${organization.userName}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						姓名：
					</th>
					<td width="75%">
						${organization.name}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						性别：
					</th>
					<td width="75%">
						${organization.sex}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						密码：
					</th>
					<td width="75%">
						${organization.password}
					</td>
				</tr>
				
				<tr height="35">
					<th align="right">
						所属部门：
					</th>
					<td>
						${departmentName }
						
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						身份证：
					</th>
					<td width="75%">
						${organization.idNumber}
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						出生日期：
					</th>
					<td width="75%">
						${date}
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						联系地址：
					</th>
					<td width="75%">
						${organization.address}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						电话：
					</th>
					<td width="75%">
						${organization.telephone}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						邮箱：
					</th>
					<td width="75%">
						${organization.email}
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						密级：
					</th>
					<td>
					${organization.securityLevel}
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						说明：
					</th>
					<td>
						${organization.describtion}
					</td>
				</tr>
				
			</table>
			 
			<div id=bc align=right>
			
				<!--
  	<input onclick='bc()' type=button value=' 新 建 ' class='input_button'>
  	<input onclick='bc()' type=button value=' 删 除 ' class='input_button'>
    -->
				<input onclick='ret()' type=button value='返回 ' class='input_button'>
			</div>
			<br>
			
		</div>
		
	</body>
</html:html>
