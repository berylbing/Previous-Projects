<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>ͬ��ʲ�ѯ</td>
  </tr>
</table>
<!--���ҳ��������ʾ��Ϣ���ɷŴ˴�--->
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=info>
	<tr>
		<td>ֻ��ѡ��һ����д���</td>
	</tr>
</table>
<!--���ҳ��������ʾ��Ϣ���ɷŴ˴�  over--->

<div class=list>
<table>
	<tr>
		<th width="20%">���</th>
		<th width="30%">�����е�����</th>
		<th>ͬ���</th>
	</tr>
	<logic:iterate id="element" name="synonymLists" indexId = "index">
	<tr>
		<td>
			${index+1 }
		</td>
		<td>
			${element.name }
		</td>
		<td>
			${element.description }
		</td>
	</tr>
	</logic:iterate>
</table>

</div>
<!--
  <div id=bc align=right>
  	<input onclick='bc()' type=button value=' �� ѯ ' class='input_button'>  	
  </div><br>
-->
</body>
</html>
