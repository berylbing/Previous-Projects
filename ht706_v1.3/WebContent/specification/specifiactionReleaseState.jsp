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
<script src="js/check.js" type="text/javascript"></script>
<script>
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}

	function excel() {
		window.open("excel/�����˶���ͳ��.xls");
	}
	
	function init()
	{
	     var args = window.dialogArguments;
	     var ta = document.getElementById("ta");
	     
	     if (args==1) {
             //��ǰ��Լ,�ɷ��͸�ָ����
                 
             }else{
             //��ʷ��Լ,�����鿴,���ɷ���
                      var rowindex;
	              for(rowindex=1;rowindex < ta.rows.length;rowindex++)
	              {
	                 ta.rows[rowindex].cells[5].innerHTML="&nbsp;"		            
		      } 
             } 

	}

</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody onload="init()">

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>��Լ��Ϣ�������</td>
	</tr>
</table>


<div class=list>
<li>���󣺲�����</li>
<!--<table id="ta">-->
<!--	<tr>-->
<!--		<th width="10%">���</th>-->
<!--		<th width="9%">��������</th>-->
<!--		<th width="9%">������</th>-->
<!--		<th width="9%">������</th>	-->
<!--		<th width="9%">ִ��״̬</th>-->
<!--		<th>����</th>-->
<!--	</tr>-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">1</a></td>-->
<!--		<td width="9%" align="center">2009-08-08</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">10.17.12.152</td>-->
<!--		<td width="9%" align="center">���ͳɹ�</td>-->
<!--		<td width="9%" align="center">&nbsp;</td>-->
<!--	</tr>-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">2</a></td>-->
<!--		<td width="9%" align="center">2009-08-08</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">10.17.12.153</td>-->
<!--		<td width="9%" align="center">���ͳɹ�</td>-->
<!--		<td width="9%" align="center">&nbsp;</td>-->
<!--	</tr>-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">3</a></td>-->
<!--		<td width="9%" align="center">2009-08-08</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">10.17.12.154</td>-->
<!--		<td width="9%" align="center">���ͳɹ�</td>-->
<!--		<td width="9%" align="center">&nbsp;</td>-->
<!--	</tr>		-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">4</a></td>-->
<!--		<td width="9%" align="center">2009-08-08</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">10.17.12.159</td>-->
<!--		<td width="9%" align="center">���ͳɹ�</td>-->
<!--		<td width="9%" align="center"><a href="#">&nbsp;</td>-->
<!--	</tr>	-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">5</a></td>-->
<!--		<td width="9%" align="center">2009-08-08</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">10.17.12.161</td>-->
<!--		<td width="9%" align="center">���ͳɹ�</td>-->
<!--		<td width="9%" align="center"><a href="#">&nbsp;</a></td>-->
<!--	</tr>	-->
<!--	<tr>-->
<!--		<td width="10%" align="center"><a href="#">6</a></td>-->
<!--		<td width="9%" align="center">2009-08-08</td>-->
<!--		<td width="9%" align="center">10.17.12.151</td>-->
<!--		<td width="9%" align="center">10.17.12.121</td>-->
<!--		<td width="9%" align="center">����ʧ��</td>-->
<!--		<td width="9%" align="center"><a href="#">����</a></td>-->
<!--	</tr>	-->
<!--</table>-->
</div>
</div>
</body>
</html>
