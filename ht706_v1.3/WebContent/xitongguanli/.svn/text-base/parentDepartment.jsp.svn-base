<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
		<title>部门列表</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		
		<link rel="StyleSheet" href="dtree.css" type="text/css" />
		<script src="../js/dtree.js" type="text/javascript"></script>
		<script type="text/javascript">
			function writeBack(id,name){
				
				//var doc=window.opener.document;
				var doc = window.dialogArguments;
				var deptId_callback = doc.getElementById("deptId_callback").value;
				var deptName_callback = doc.getElementById("deptName_callback").value;	
				
				doc.getElementsByName(deptId_callback)[0].value = id;
				doc.getElementById(deptName_callback).innerHTML = name;
				
				window.close();
			}
		</script>
		<style>
				img {
					behavior: url(../treelist.htc);
					cursor: hand;
				}
				
				dl {
					margin: 0;
					margin-bottom: 0
				}
				
				span {
					background: url("../images/ifile.GIF");
					width: 18px;
					height: 17px;
				}
		</style>
</head>
<body leftmargin="0" topmargin="5">

<div id="div_dtree" class="dtree" style="margin-left:20px;">
<script type="text/javascript">
d = new dTree('d');
d.config.target = "rightFrame2";


<logic:iterate id="element" name="departmentList">
	//departmentAction.do?method=selectParentDepartment&Id=${departmentId}&Pid=<bean:write name="element" property="departmentId"/>
	d.add('<bean:write name="element" property="departmentId"/>',
		  '<bean:write name="element" property="parentDepartment.departmentId"/>',		  	  
		  '<a href="javascript:writeBack(\'<bean:write name="element" property="departmentId"/>\',\'<bean:write name="element" property="name"/>\');"><bean:write name="element" property="name"/></a>',
		  "",		  
		  '','','','../images/img/folder.gif');
	
</logic:iterate>

document.getElementById('div_dtree').innerHTML = d;
//document.write(d);

</script>
</div>
</body>

</html>
