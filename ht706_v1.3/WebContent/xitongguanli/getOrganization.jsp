<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
		<title>���������ϵͳ</title>
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
					�½���Ա
				</td>
			</tr>
		</table>
			
		<div class=editblock>
		
			<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
				<tr height="35">
					<th align="right" width="25%">
						��¼����
					</th>
					<td width="75%">
						${organization.userName}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						������
					</th>
					<td width="75%">
						${organization.name}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						�Ա�
					</th>
					<td width="75%">
						${organization.sex}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						���룺
					</th>
					<td width="75%">
						${organization.password}
					</td>
				</tr>
				
				<tr height="35">
					<th align="right">
						�������ţ�
					</th>
					<td>
						${departmentName }
						
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						���֤��
					</th>
					<td width="75%">
						${organization.idNumber}
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						�������ڣ�
					</th>
					<td width="75%">
						${date}
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						��ϵ��ַ��
					</th>
					<td width="75%">
						${organization.address}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						�绰��
					</th>
					<td width="75%">
						${organization.telephone}
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						���䣺
					</th>
					<td width="75%">
						${organization.email}
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						�ܼ���
					</th>
					<td>
					${organization.securityLevel}
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						˵����
					</th>
					<td>
						${organization.describtion}
					</td>
				</tr>
				
			</table>
			 
			<div id=bc align=right>
			
				<!--
  	<input onclick='bc()' type=button value=' �� �� ' class='input_button'>
  	<input onclick='bc()' type=button value=' ɾ �� ' class='input_button'>
    -->
				<input onclick='ret()' type=button value='���� ' class='input_button'>
			</div>
			<br>
			
		</div>
		
	</body>
</html:html>
