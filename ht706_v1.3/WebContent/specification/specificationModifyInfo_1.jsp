<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>�������</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script>
	function getIniValue()
	{
	    var ini = parent.frames[0].document.getElementsByTagName("A");

	    for(var i=0;i<ini.length;i++)
	    {
	        if(ini[i].style.color == "#ff5d00")
	        {
	           var s = document.getElementById("itemName");
	           s.innerHTML = ini[i].innerHTML;
	           break;
	        }   
	    }
	}

</script>
</head>

<body onload="" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>�������</td>
	</tr>
	
</table>
<!--���ҳ��������ʾ��Ϣ���ɷŴ˴�--->
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=info>
	<tr>
		${facetid}
	</tr>
</table>
<!--���ҳ��������ʾ��Ϣ���ɷŴ˴�  over--->

<hr color=#97D2FF>


<div class=list>
<table id="ta">
	<tr>
		<th align="center" width="10%">���</th>
		<th align="center" width="20%">�ǼǺ�</th>
		<th align="center" width="20%">������</th>
		<th align="center" width="10%">�Ǽ�����</th>
		<th align="center" width="20%">����״̬</th>
	</tr>
	<logic:iterate id="element" name="specificationmodifyList" indexId="index">
		<tr>
		<td align="center">
			${index+1}
		</td>
		<td align="center">
			<a href="SpecificationmodifyAction.do?method=SpecificationmodifyInfo&Id=${element.id}" >${element.registryId}</a>	
		</td>
		<td align="center">
			${element.applicant}
		</td>
		<td align="center">
			<bean:write name="element" property="dateOfInformation" format="yyyy-MM-dd"></bean:write>
		</td>
		<td align="center">
			${element.status}
		</td>
		
		</tr>
	</logic:iterate>
</table>

</div>

  <br>
</body>
</html>