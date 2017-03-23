<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
	<head>
		<title>人员选择</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
	</head>
	<frameset cols="220,*" id="frmstOuter" border="0" style="margin-left: 10px;" >
		<frame src="../xitongguanli/organizationAction.do?method=getDepartmentTree&select=3" name="leftFrame" scrolling="NO" frameborder="1" bordercolor="#4faad8">
		<frame src="../xitongguanli/organizationAction.do?method=searchOrganization&select=3&callbackname=<%= request.getParameter("callbackname") %>" name="userFrame">
	</frameset>	
</html>
