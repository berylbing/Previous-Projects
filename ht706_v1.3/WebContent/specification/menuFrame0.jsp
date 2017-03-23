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

<frameset frameborder="0" border=0  >
   <frameset cols="220,*" id=frmstOuter scrolling="no" >
      <frame src="specificationMenu0.jsp" name="leftFrame" scrolling="NO"  frameborder="6" framespacing=6px bordercolor="#4faad8">
      <frame src="SpecificationAction.do?method=listSpecification" name="rightFrame">
   </frameset>  
</frameset>
<noframes><body>

</body></noframes>
</html>
