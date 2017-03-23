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
</head>

<body leftmargin="0" topmargin="5">
<table width="100%" border="0" cellspacing="0" cellpadding="0">

  <tr>
  	<td>
  	
	    <script type="text/javascript">  
	    	d=new dTree('d');
	    	
	    	<logic:iterate id="list" name="facetListForm" property="facetList">
			d.add('${list.id.facetUuid}', // id
			'${list.parentNode}',//pid
			'${list.name}',//node name
			'FacetAction.do?method=selectParentFacet&Idf=${facetIdf}&Ids=${facetIds}&Pidf=<bean:write name="list" property="id.facetUuid"/>&select=${select}',//url
			'${list.name}',//title
			'rightFrame1', //Target for the node.
			'',//'/HT706/images/NodeImg1.gif',
			'',//'/HT706/images/NodeImg2.gif',
			false
			);
			</logic:iterate>
	    	
	  		document.write(d);
	  		d.openAll();
	    </script>
	</td>
  </tr>
</table>
</body>
</html>
