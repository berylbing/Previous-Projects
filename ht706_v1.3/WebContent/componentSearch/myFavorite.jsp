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
<link href="../js/dtree/dtree.css" rel="stylesheet" type="text/css">
<script src="../js/dtree/dtree_NoCheckBox.js" type="text/javascript"></script>
<style>
	img { behavior:url(treelist.htc);cursor:hand; }
	dl { margin:0; margin-bottom:0 }
	<!--
	span { background: url("../images/ifile.GIF");width: 18px; height: 17px; }	
	-->
</style>
</head>

<body leftmargin="0" topmargin="5">
<html:form action="/myFavorite/CheckItem.do" target="mainFrame">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td style="cursor: hand;color: #2979ce"><img onclick="nones()" src="../images/ifile.GIF">&nbsp;
    <a href="checkItem.htm" target="mainFrame">收藏夹</a></td>
  </tr> 
  <tr>
  	<td>
	    <p><a href="javascript: d.openAll();">open all</a> | <a href="javascript: d.closeAll();">close all</a></p>  
		<script type="text/javascript">  
	    	d=new dTree('d');
	    	d.add(0,-1,"收藏夹",'',"收藏夹",'mainFrame');

	    	<logic:iterate id="list" name="MyFavouriteTreeForm" property="list">
		    	<logic:empty property="assetUniqueId" name="list">
					d.add('${list.recordId}', // id
					'${list.parentNode}',//pid
					'${list.nodeName}',//node name
					'CreatMyfavoriteAction.do?method=CreatMyfavorite&PID=${list.recordId}&AssetID=${AssetId}',//url
					'${list.nodeName}',//title
					'' //Target for the node.
					);
				</logic:empty>
			</logic:iterate>

	  		document.write(d);
	    </script>
	</td>
  </tr>
</table>
</html:form>
</body>
</html>
