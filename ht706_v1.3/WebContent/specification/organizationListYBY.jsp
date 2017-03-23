<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>

	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>构件库管理系统</title>
		
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script  language="javascript" type="text/javascript">
		
		function deltr(){
			document.getElementById("OrganizationForm").submit();
		}
		function create(){
			location.href = "organizationAction.do?method=preCreateOrganization&Id=${departmentId}";
		}
		function confirmSelect(userId,userName){
			var temp = '<%= request.getParameter("callbackname")%>';
			alert(temp);
			window.parent.opener.document.getElementsByName(temp)[0].value = userId;
			window.parent.opener.document.getElementsByName(temp.split(".")[1])[0].value = userName;
			window.parent.close();
		}
		
		</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					人员列表
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<div class=list>
		 <html:form  action="/xitongguanli/organizationAction.do?method=deleteOrganization&Id=${departmentId}"  > 
			<table id=ta>
				<tr>
					<logic:notEqual name="select" value="3">
						<th width="12%" height="26">
							<input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('selectedOrganization')">
						</th>
					</logic:notEqual>
					<th width="73%">
						姓名
					</th>
					<logic:equal name="select" value="-1">
					<th width="15%">
						修改
					</th>
					</logic:equal>
				</tr>
					<logic:iterate id="element" name="organizationList">
	
						<tr>
							<logic:notEqual name="select" value="3">
								<td align="center">								
									<html:multibox name="organizationForm" property="selectedOrganization" onclick="checkItem('boxa')">
										<bean:write name="element" property="userId"/>					
						     		</html:multibox>
								</td>
							</logic:notEqual>
							<td align="left">													
								<logic:equal name="select" value="-1">
									<a href="organizationAction.do?method=getOrganization&Id=${element.userId}" >${element.name}</a>
								</logic:equal>								
								<logic:equal name="select" value="1">
									<a target="rightFrame" href="safeControlAction.do?method=searchActorByOrganization&Id=${element.userId}" >${element.name}</a>
								</logic:equal>
								<logic:equal name="select" value="2">
									<a target="rightFrame" href="safeControlAction.do?method=searchAllByOrganization&Id=${element.userId}" >${element.name}</a>
								</logic:equal>
								<logic:equal name="select" value="3">
									<a href="#" onclick="confirmSelect('${element.userId}','${element.name }')">${element.name}</a>
								</logic:equal>
							</td>
							<logic:equal name="select" value="-1">
								<td align="center">
									<a href="organizationAction.do?method=preOrganizationForm&Id=${element.userId}" ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
											border="0">
									</a>
								</td>
							</logic:equal>
						</tr>
	
					</logic:iterate> 
				
			</table>
		</html:form>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=page>
			<tr>
				<td>
				<logic:equal name="select" value="-1">
					<input name="button22" type="button" class="input_button" onClick="create()" value=" 新 建 ">
					<input name="button2" type="button" class="input_button" onClick="deltr()" value=" 删 除 ">
				</logic:equal>
				</td>
			</tr>
		</table>
	</body>
</html:html>
