<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>
		<title>构件库管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
		
		function selectOrganization(){			
			//open_window('OrganizationSelector.htm',600,400);
			open_ModelWindow('OrganizationSelector.htm',600,400,window);	
		}
		function save(){
			
			document.getElementById("actorToElementForm").submit();
		}
	
	function w_open(v){
		hid.value = v;
		if (v == 1) {
			if (document.getElementById("sourceId") != null)
				document.getElementById("sourceId").id = "";
			event.srcElement.parentElement.parentElement.parentElement.id = "sourceId";
		}
		open_window('edit.htm',400,300);
	}
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					人员授权查询
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<input type="hidden" id="_OrganizationSelector" value="organizationToAuthorization"/>
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="right" width="20%">
					人员名称：
					<html:hidden property="id" value="${userId}"/>
				</td>
				<td width="80%">
				<span id="_USERNAME" >${userName }</span>
				<input  type="button" class="input_button" onClick="selectOrganization()" value="人员选择">
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		<div class=list>
			<table border="0">
				<tr>
					<th align="center" colspan='1' width="20%">
						角色
					</th>
					<th align="center" colspan='1' width="60%">
						授权情况
					</th>
					
				</tr>
				<logic:iterate id="element" name="actorList" >
					<tr>
						<td align="center">
							${element.actorName}
						</td>
						<td align="center">
						<table>
							<logic:iterate id="item"  name="element" property="actortoauthorizations" >
							<tr>
							<td align="center">
								${item.authorization.name}
							</td>
							<td align="center">
								${item.description }
							</td>
							</tr>
							</logic:iterate>
						</table>
						</td>
					</tr>
					
				</logic:iterate> 
			</table>
		</div>
	

	  
	</body>
</html>
</html:html>