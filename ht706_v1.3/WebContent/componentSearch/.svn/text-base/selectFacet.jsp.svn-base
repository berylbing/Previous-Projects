<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<link href="../js/dtree_search/dtree.css" rel="stylesheet" type="text/css">
<script src="../js/dtree_search/dtree.js" type="text/javascript"></script>
<style>
	img { behavior:url(treelist.htc);cursor:hand; }
	dl { margin:0; margin-bottom:0 }
	<!--
	span { background: url("images/ifile.GIF");width: 18px; height: 17px; }	
	-->
</style>
</head>

<body leftmargin="0" topmargin="5">
<html:form action="/componentSearch/FacetAction.do?method=ShowComponentListAction" target="mainFrame">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td style="cursor: hand;color: #2979ce"><img onclick="nones()" src="../images/ifile.GIF">
    <a href="checkItem.htm" target="mainFrame">系统刻面分类</a></td>
  </tr>
  <tr>
  	<td>
	    <p><a href="javascript: d.openAll();">open all</a> | <a href="javascript: d.closeAll();">close all</a></p>  
	    <script type="text/javascript">  
	    	d=new dTree('d');
	    	
	    	<logic:iterate id="list" name="FacetListForm" property="facetList">
					d.add('${list.id.facetUuid}', // id
					'${list.parentNode}',//pid
					<logic:notEqual value="-1" name="list" property="parentNode">
						'<input type="checkbox" name="selected" value="${list.id.facetUuid}" id="${list.id.facetUuid}"onclick="selectChildTree(d,this)">${list.name}</input>',//node name
					</logic:notEqual>
					<logic:equal value="-1" name="list" property="parentNode">
						"刻面树",//node name
					</logic:equal>
					'',//url
					'${list.name}',//title
					'mainFrame', //Target for the node.
					'',//'/HT706/images/NodeImg1.gif',
					'',//'/HT706/images/NodeImg2.gif',
					true
					);
				</logic:iterate>
	  		document.write(d);
	    </script>
	    
	</td>
  </tr>
</table>
<br><br>
<hr>
<html:submit >确定</html:submit>
</html:form>
</body>
</html>
