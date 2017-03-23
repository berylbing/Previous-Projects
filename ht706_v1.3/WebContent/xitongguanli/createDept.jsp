<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
		<title>������ϸ��Ϣ</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
			function save(){
		 		if(checkInput() == false)
		 			return;
		 		document.forms[0].submit();
		 	 }
			
		     function checkInput(){
		 		var inputs = document.forms[0].getElementsByTagName("INPUT");
		 		if(inputs["department.name"].value == ""){ alert("�����벿������");return false;}		 		
		 		return true;
		 	 }
		     function parent(){
				 location.href = "departmentAction.do?method=preParentDepartment&Id=<bean:write name="department" property="departmentId"/>";
			}
			function deltr() {
				var trs = document.getElementsByName("boxi");
				var flag = 0;
				for (var i=0; i<trs.length; i++) {
					if (trs[i].checked) {
						flag = 1;
						break;
					}
				}
				if (flag==0) {
					alert("��ѡ����Ҫɾ������Ŀ��");
					return false;
				}
				var ve = ta.all.tags("tr");
				for (var i=0; i<trs.length; i++) {
					if (trs[i].checked) {
						ve[i+1].removeNode(true);
						i--;
					}
				}
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
	<html:form action="/xitongguanli/departmentAction?method=createDepartment" method="POST">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					��������
				</td>
			</tr>
		</table>
		
		
		<nested:hidden property="parentId" value="${department.departmentId}"></nested:hidden>
		<div class=editblock>
			<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
				
				<tr height="35">
					<th align="right" width="35%">
						�������ƣ�
					</th>
					<td width="65%">
					
						<nested:text property="department.name" ></nested:text>
						
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						�ϼ����ţ�
					</th>
					<td>
					
					<logic:notEqual name="department" property="departmentId" value="-1">
					<bean:write name="department" property="name"/>
					</logic:notEqual>
					
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						����˵����
					</th>
					<td>
						<nested:text  property="department.description" />
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						���ŵ�ַ��
					</th>
					<td>
						<nested:text  property="department.address"/>
					</td>
				</tr>
				<tr height="35">
					<th align="right">
						��ϵ�绰��
					</th>
					<td>
						<nested:text  property="department.tele"/>
					</td>
				</tr>
			</table>
			<div id=bc align=right>
				<input  type="button" class="input_button" onClick="history.go(-1);" value=" �� �� ">	
				<input name="button22" type="button" class="input_button" onClick="save()" value=" �� �� ">
			</div>
			<br>
		</div>
		</html:form>
	</body>
</html:html>
