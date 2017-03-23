<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
  <head>
     <title>���ù����������Ϣ</title>
     <meta http-equiv="Content-Type" content="text/html; charset=gbk">
     <link href="../css/common.css" rel="stylesheet" type="text/css">
     <script src="../js/check.js" type="text/javascript"></script>     
     <script src="../js/calendar.js" type="text/javascript"></script>
     <script>

	function saveBasicInfo() {
		if(checkData()){
			document.getElementById("BasicInfoForm").submit();
		}
	}
	function checkData(){
		if(document.getElementById("library.certificationMethods").value==""){alert("������'��֤����'");return false;}
		if(document.getElementById("library.contactMethod").value==""){alert("������'��ϵ��ʽ'");return false;}
		if(document.getElementById("library.electronicAddress").value==""){alert("������'���ӵ�ַ'");return false;}
		if(document.getElementById("library.libraryClassificationMechanism").value==""){alert("������'��������'");return false;}
		if(document.getElementById("library.libraryMetrics").value==""){alert("������'�����'");return false;}
		if(document.getElementById("library.libraryRestrications").value==""){alert("������'���޶�'");return false;}
		if(document.getElementById("dateOfCreation").value==""){alert("������'�⽨��ʱ��'");return false;}
		if(document.getElementById("library.name").value==""){alert("������'�⽨����'");return false;}
		return true;

	}
			
</script>
  </head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>������Ϣ����</td>
	</tr>
</table>

<html:form action="/xitongguanli/basicInfoAction?method=modifyBasicInfo" method="POST">

<div class=editblock >
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">��֤������</th>

		  <td width="75%"><nested:text  property="library.certificationMethods" value="${bf.library.certificationMethods}"/>  </td>

		</tr>				
		<tr height="35"> 
		  <th align="right" width="25%">��ϵ��ʽ��</th>
		  <td width="75%"><nested:text  property="library.contactMethod" value="${bf.library.contactMethod}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right" width="25%">���ӵ�ַ��</th>
		  <td width="75%"><nested:text  property="library.electronicAddress" value="${bf.library.electronicAddress}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right" width="25%">�������ƣ�</th>
		  <td width="75%"><nested:text  property="library.libraryClassificationMechanism" value="${bf.library.libraryClassificationMechanism}"/></td>
		</tr>				
		<tr height="35"> 
		  <th align="right">�������</th>
		  <td width="75%"><nested:text  property="library.libraryMetrics" value="${bf.library.libraryMetrics}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">���޶���</th>
		  <td width="75%"><nested:text  property="library.libraryRestrications" value="${bf.library.libraryRestrications}"/></td>
		</tr>	
		<tr height="35"> 
		  <th align="right" width="25%">�⽨��ʱ�䣺</th>
		  <td width="75%"><nested:text  property="dateOfCreation" value="${bf.dateOfCreation}" onfocus="calendar(this,null,null,null)" size="40" /></td>

		</tr>	
		<tr height="35"> 
		  <th align="right" width="25%">�⽨���ˣ�</th>
		  <td width="75%"><input type="text" name="library.name" value="${bf.library.name}" size="50"></td>
		</tr>
	</table>
  <div id=bc align=right>
  	<input onclick='saveBasicInfo()' type="button" value=' �� �� ' class='input_button'>
  </div><br>
</html:form>
</body>
</html:html>