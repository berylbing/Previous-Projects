<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head>
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">

</head>


<script type="text/javascript">

	var string = "<frameset frameborder=\"0\" border=0  ><frameset cols=\"220,*\" id=frmstOuter scrolling=\"no\" ><frame id=\"leftFrame\" src=\"SpecificationAction.do?method=preSpeMenu&temp=view&"+location.search.substr(1)+"\" name=\"leftFrame\" scrolling=\"NO\"  frameborder=\"6\" framespacing=6px bordercolor=\"#4faad8\"><frame id=\"rightFrame\" src=\"SpecificationAction.do?method=getSpecification&"+location.search.substr(1)+"\" name=\"rightFrame\"></frameset> </frameset>";
	document.write(string);
</script>
<body >

</body>
</html>
