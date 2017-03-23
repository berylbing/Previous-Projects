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
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					流程实例列表
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<div class=list>
			<table id=ta>
				<tr>
					<th width="40%">
						NAME
					</th>
					
					<th width="40%">
						OWNER
					</th>
					<th width="20%">
						
					</th>
					
				</tr>

					<logic:iterate id="element" name="list">
	
						<tr>
							
							<logic:iterate id="ele" name="element" offset="0" length="1">
								
							
								<logic:iterate id="ele2" name="element" offset="1" length="1">
	
						
									<td><a href="jbpmTest.do?method=View&id=${ele}">${ele2}</a></td>
							
	
								</logic:iterate> 
									
							</logic:iterate>
								<logic:iterate id="ele2" name="element" offset="2" length="1">
	
						
									<td>${ele2}</td>
							
	
								</logic:iterate> 
<!--							<logic:iterate id="ele" name="element" offset="0" length="1">-->
<!--								-->
<!--							<td>-->
<!--								<a href="jbpmTest.do?method=View&id=${ele}">查看流程跟踪图-->
<!--								</a>-->
<!--								</td>-->
<!--							</logic:iterate>-->
							
						</tr>
	
					</logic:iterate> 
				
			</table>
		
		</div>
		
	</body>
</html:html>
