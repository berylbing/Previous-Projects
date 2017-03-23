<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
	<script src="../js/calendar.js" type="text/javascript"></script>
	<script src="../js/check.js" type="text/javascript"></script>
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
		function save(){
	 		if(checkInput() == false)
	 			return;
	 		var testName = document.getElementsByName("organization.name")[0].value;	 		
	 		if(testName == orgName)
	 			document.forms[0].submit();
	 		else
				checkName();	 		
	 	 }
		function checkInput(){
			var inputs = document.forms["organizationForm"].getElementsByTagName("INPUT");
			if(inputs["organization.userName"].value == ""){ alert("请输入登录名");return false;}
			
			if(inputs["organization.name"].value == ""){ alert("请输入姓名");return false;}
			if(inputs["organization.password"].value == ""){alert("请输入密码");return false;}
			if(inputs["password"].value == ""){alert("请输入确认密码");return false;}
			if(inputs["password"].value != inputs["organization.password"].value)
			{	
				alert("确认密码与密码不一致,请重新输入！");
				inputs["password"].value = "";
				return false;
			}
			if(inputs["organization.idNumber"].value != "")
			{
				if(!isIdCardNo(inputs["organization.idNumber"].value)){return false;}
			}
			//if(inputs["birthDay"].value == ""){alert("请输入出生日期");return false;}
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
	 	function processor(){
	 		if(xmlhttp.readyState==4)
	 			if(xmlhttp.status==200)
		 		{	 			
	 				if(xmlhttp.responseText == "ok")
	 					document.forms[0].submit();
	 				else
		 				alert("登录名已存在，请重新输入");
	 			}
	 	}
		function parent(){
			var url = "departmentAction.do?method=preParentDepartment";			
			//open_window(url,400,300);
			open_ModelWindow(url,400,300,document);
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
			<html:form action="/xitongguanli/organizationAction?method=modifyOrganization" method="POST">
		<div class=editblock>
		<nested:hidden property="organization.userId" value="${organization.userId}"></nested:hidden>
			<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
				<tr height="35">
					<th align="right" width="25%">
						登录名：
					</th>
					<td width="75%">
						<nested:text property="organization.userName" value="${organization.userName}" size="50"></nested:text>
						<span style="color:red;">*必填</span>
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
						<input type="hidden" id="deptId_callback" value="organization.departmentId"/>
						<input type="hidden" id="deptName_callback" value="departmentName"/>
						<span id="departmentName">${departmentName }</span>
						<nested:hidden property="organization.departmentId" value="${departmentId}"  ></nested:hidden>
						<input  type="button" class="input_button" onClick="parent()" value="选择部门">
					</td>
				</tr>
				<tr height="35">
					<th align="right" width="25%">
						身份证：
					</th>
					<td width="75%">
						<nested:text property="organization.idNumber" size="50" value="${organization.idNumber}" size="50"></nested:text>
						
					</td>
				</tr>			
				<tr height="35">
					<th align="right" width="25%">
						出生日期：
					</th>
					<td width="75%">
						<nested:text property="birthDay"  onfocus="calendar(this,null,null,null)" size="50" value="${date}" size="50"></nested:text>
						
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
					<html:radio property="organization.securityLevel" value="公开" styleId="公开"></html:radio> 公开 &nbsp;&nbsp;
					<html:radio property="organization.securityLevel" value="内部" styleId="内部"></html:radio> 内部&nbsp;&nbsp;
					<html:radio property="organization.securityLevel" value="秘密" styleId="秘密"></html:radio> 秘密&nbsp;&nbsp;
					<html:radio property="organization.securityLevel" value="机密" styleId="机密"></html:radio> 机密 &nbsp;&nbsp;
					<html:radio property="organization.securityLevel" value="绝密" styleId="绝密"></html:radio> 绝密&nbsp;&nbsp;
						
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

            	var selectedRadio = document.getElementById("OrganizationForm").elements["<bean:write name="organization" property="securityLevel"/>"];
                selectedRadio.checked=true;
                
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
