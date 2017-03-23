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
<div class="dtree">
<script type="text/javascript">
<!--
d = new dTree('d');
d.config.target = "rightFrame2";


<logic:iterate id="element" name="departmentList">
	d.add("<bean:write name="element" property="departmentId"/>","<bean:write name="element" property="parentDepartment.departmentId"/>","<bean:write name="element" property="name"/>","<bean:write name="element" property="url"/>",'','','','../images/img/folder.gif')
</logic:iterate>
document.write(d);
/-->
</script>
</div>
</body>

</html>
