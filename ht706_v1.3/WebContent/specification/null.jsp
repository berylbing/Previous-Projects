<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title> New Document </title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="js/check.js" type="text/javascript"></script>
<script>
function load(){
	var tree = parent.document.getElementById("leftFrame1");
    	tree.src = "FacetAction.do?method=ShowFacetTreeAction&temp=edit&"+parent.location.search.substr(1);
    	
}

</script>
</head>

<body onload = "load()">
</body>
</html>
