<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>
		<title>工作流权限分配</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
		function selectTask(obj, xml){
			location.href="workflowAction.do?method=preOrganizationTask&task="+obj.options[obj.selectedIndex].value+"&xml="+xml;	
		}
		function deleteO(){
			document.getElementById("organizationTaskForm").submit();
		}
		function create(){
			location.href = "workflowAction.do?method=preCreateOrganizationTask&task=${task}";
		}
		function selectOrganization(param){
			var returnVal = open_ModelWindow('multiOrganizationSelector.htm',600,400,param);
		}
		function confirmUser(userId,select){
			var flag = window.parent.opener.document.getElementById("_OrganizationSelector").value;					
			if(flag == "organizationToAuthorization")	
				window.parent.opener.location.href="safeControlAction.do?method=searchAllByOrganization&Id=" + userId;
			else
				window.parent.opener.location.href="safeControlAction.do?method=searchActorByOrganization&Id=" + userId;
			window.parent.close();
		}
		</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	<html:form  action="/xitongguanli/workflowAction?method=deleteOrganizationTask">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td align="left">
					工作流权限分配
				</td>
			</tr>
		</table>
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="left" width="20%">
					当前配置文件：${xml}
				</td>
				<td>
				</td>
			</tr>
			<tr>
				<td align="left" width="20%">
					选择工作流任务名称：
				</td>
				<td width="80%">
				<html:select  onchange="selectTask(this, '${xml}')"  property="task"  value="${task}">
					 <html:options name= "taskList"/> 
				</html:select>
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		<div class=list>
		<html:hidden property="taskName" value="${task}"/>
		<html:hidden property="xml" value="${xml}"/>
		<html:hidden property="_OrganizationSelector" value="createOrganizationTask"/>
<!--			<input type="hidden" id="_OrganizationSelector" value="createOrganizationTask"/>-->
<!--			<input type="hidden" id="taskName" value="${task}"/>-->
<!--			<input type="hidden" id="xml" value="${xml}"/>-->
			<table border="0">
				<tr>
					<th width="10%" height="26">
						<input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('selectedOrganization')">
					</th>
					<th align="center" colspan='1' width="20%">
						人员姓名
					</th>
					<th align="center" colspan='1' width="20%">
						人员登录名
					</th>
					<th align="center" colspan='1' width="10%">
						性别
					</th>
					<th align="center" colspan='1' width="20%">
						电话
					</th>
					<th align="center" colspan='1' width="20%">
						联系地址
					</th>
				</tr>
				<logic:iterate id="element" name="organizationList">
	
						<tr>
								<td align="center">								
									<html:multibox name="organizationTaskForm" property="selectedOrganization" onclick="checkItem('boxa')">
										<bean:write name="element" property="organization.userId"/>					
						     		</html:multibox>
								</td>
						<td align="center">
							${element.organization.userName}
						</td>
						<td align="center">
							${element.organization.name}
						</td>
						<td align="center">
							${element.organization.sex}
						</td>
						<td align="center">
							${element.organization.telephone}
						</td>
						<td align="center">
							${element.organization.address}
						</td>
						</tr>
					</logic:iterate> 
			</table>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=page>
			<tr>
				<td>
					<input  type="button" class="input_button" onClick="selectOrganization(window)" value=" 新 建 ">
					<input name="button2" type="button" class="input_button" onClick="deleteO()" value=" 删 除 ">
					
				</td>
			</tr>
		</table>
		</html:form>
	</body>
</html>
</html:html>