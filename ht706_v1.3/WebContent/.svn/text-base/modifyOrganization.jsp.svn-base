<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
	<script src="js/calendar.js" type="text/javascript"></script>
	<script src="js/check.js" type="text/javascript"></script>
		<title>构件库管理系统</title>

		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="css/common.css" rel="stylesheet" type="text/css">
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
		function save(){
	 		if(checkInput() == false)
	 			return;
	 		
	 		
	 			document.forms[0].submit();
 		
	 	 }
		function checkInput(){
			var inputs = document.forms["organizationForm"].getElementsByTagName("INPUT");
			
			
			if(inputs["organization.name"].value == ""){ alert("请输入姓名");return false;}
			if(inputs["organization.password"].value == ""){alert("请输入密码");return false;}
			if(inputs["password"].value == ""){alert("请输入确认密码");return false;}
			if(inputs["password"].value != inputs["organization.password"].value)
			{	
				alert("确认密码与密码不一致,请重新输入！");
				inputs["password"].value = "";
				return false;
			}
			if(inputs["organization.idNumber"].value == ""){alert("请输入身份证号码");return false;}
			if(!isIdCardNo(inputs["organization.idNumber"].value)){return false;}
			if(inputs["birthDay"].value == ""){alert("请输入出生日期");return false;}
			return true;
		}
		function checkName(){
	 		var name=document.getElementsByName("organization.name")[0].value;
	 		url = "organizationAction.do?method=checkName&Name="+name;
	 		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	 		xmlhttp.onreadystatechange=processor;
	 		xmlhttp.open("post",url);
	 		xmlhttp.send(null);
	 		
	 	}
	 	
		function parent(){
			 location.href = "organizationAction.do?method=preParentDepartment&Id=${organization.userId}";
		}
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					修改人员信息
				</td>
			</tr>
		</table>
			<html:form action="/personalInfo?method=modify" method="POST">
		<div class=editblock>
		<nested:hidden property="organization.userId" value="${organization.userId}"></nested:hidden>
			<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
				<tr height="35">
					<th align="right" width="25%">
						登录名：
					</th>
					<td width="75%">
						<nested:hidden property="organization.userName" value="${organization.userName}" ></nested:hidden>
						
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						姓名：
					</th>
					<td width="75%">
						<nested:text property="organization.name" value="${organization.name}" size="50"></nested:text>
						<span style="color:red;">*必填</span>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						性别：
					</th>					
					<td>					
						<html:radio property="organization.sex" value="男" styleId="男"></html:radio> 男 &nbsp;&nbsp;
						<html:radio property="organization.sex" value="女" styleId="女"></html:radio> 女&nbsp;&nbsp;					
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						密码：
					</th>
					<td width="75%">
						<nested:password property="organization.password" value="${organization.password}" size="50"></nested:password>
						<span style="color:red;">*必填</span>
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						确认密码：
					</th>
					<td width="75%">
						<nested:password property="password" size="50"></nested:password>
						<span style="color:red;">*必填，请重新输入密码</span>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						所属部门：
					</th>
					<td>
						${departmentName }
						<nested:hidden property="organization.departmentId" value="${departmentId}"  ></nested:hidden>
						
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						身份证：
					</th>
					<td width="75%">
						<nested:text property="organization.idNumber" size="50" value="${organization.idNumber}" size="50"></nested:text>
						<span style="color:red;">*必填，注意格式</span>
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						出生日期：
					</th>
					<td width="75%">
						<nested:text property="birthDay"  onfocus="calendar(this,null,null,null)" size="50" value="${date}" size="50"></nested:text>
						<span style="color:red;">*必填，请单击后选择</span>
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						联系地址：
					</th>
					<td width="75%">
						<nested:text property="organization.address"  value="${organization.address}" size="50"></nested:text>
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						电话：
					</th>
					<td width="75%">
						<nested:text property="organization.telephone" value="${organization.telephone}" size="50"></nested:text>
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						邮箱：
					</th>
					<td width="75%">
						<nested:text property="organization.email" value="${organization.email}" size="50"></nested:text>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						密级：
					</th>
					<td>
					${organization.securityLevel}
					<nested:hidden property="organization.securityLevel" value="${organization.securityLevel}"  ></nested:hidden>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						说明：
					</th>
					<td>
						<nested:text property="organization.describtion" value="${organization.describtion}" size="50"></nested:text>
					</td>
				</tr>
				
			</table>
			 <script type="text/javascript">
			 	var orgName = document.getElementsByName("organization.name")[0].value;
              <!--

            	
                
                document.getElementById("OrganizationForm").elements["<bean:write name="organization" property="sex"/>"].checked = true;

              -->

          </script> 
			<div id=bc align=right>
			
				<!--
  	<input onclick='bc()' type=button value=' 新 建 ' class='input_button'>
  	<input onclick='bc()' type=button value=' 删 除 ' class='input_button'>
    -->			<input  type="button" class="input_button" onClick="history.go(-1);" value=" 返 回 ">	
				<input onclick='save()' type=button value=' 保 存 ' class='input_button'>
			</div>
			<br>
			
		</div>
		</html:form>
	</body>
</html:html>
