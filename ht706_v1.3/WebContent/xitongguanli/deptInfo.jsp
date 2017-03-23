<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
		<title>部门详细信息</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
		function create(){
			  location.href = "departmentAction.do?method=preCreateDepartment&Id=<bean:write name="department" property="departmentId"/>";
		}
		function modify(){
			  location.href = "departmentAction.do?method=preDepartmentForm&Id=<bean:write name="department" property="departmentId"/>";
		}
	function deltr() {
		location.href = "departmentAction.do?method=deleteDepartment&Id=<bean:write name="department" property="departmentId"/>";
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
	function updateDeptTree(){
		window.parent.document.frames[0].location.reload();
	}
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody onload="updateDeptTree()">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					部门详细信息
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<div class=editblock>
			<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
				
				<tr height="35">
					<th align="right" width="35%">
						部门名称：
					</th>
					<td width="65%">
						<bean:write name="department" property="name"/>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						上级部门：
					</th>
					<td>
					
				<logic:notEqual name="department" property="parentDepartment.departmentId" value="-1">
					<bean:write name="department" property="parentDepartment.name"/>
					</logic:notEqual>
					
						
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						部门说明：
					</th>
					<td>
						<bean:write name="department" property="description"/>
					</td>
				</tr>
				
				<tr height="35">
					<th align="right">
						部门地址：
					</th>
					<td>
						<bean:write name="department" property="address"/>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						联系电话：
					</th>
					<td>
						<bean:write name="department" property="tele"/>
					</td>
				</tr>
			</table>
			<div id=bc align=right>
				<input name="button22" type="button" class="input_button" onClick="create()" value=" 新 建 ">
				<input name="button22" type="button" class="input_button" onClick="modify()" value=" 修 改 ">
					<logic:notEqual name="department" property="parentDepartment.departmentId" value="-1">
					<input name="button2" type="button" class="input_button" onClick="deltr()" value=" 删 除 ">
					</logic:notEqual>
			</div>
			<br>
		</div>
	</body>
</html:html>
