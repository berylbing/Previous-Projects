<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>���������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<script src="../js/calendar.js" type="text/javascript"></script>
<link href="../css/common.css" rel="stylesheet" type="text/css">
<link href="css/common.css" rel="stylesheet" type="text/css">
<script>
	function save(){
		if(checkInput() == false)
			return;
		document.getElementsByName("MyFavoriteForm")[0].submit();
		}
		function checkInput(){
			var inputs = document.forms["MyFavoriteForm"].getElementsByTagName("INPUT");
			if(inputs["myfavorite.nodeName"].value == ""){ alert("�������ļ�������");return false;}
			if(inputs["dateOfInformation"].value == ""){ alert("�������ļ��е��ṩ����");return false;}
			return true;
		}
	    				
</script>
<style>
	input{
		font-size: 12px;
		color: #000000;
		background-color: #F1F4F5;
		border: 1px solid #49789C;
		padding:2px 0px 0px 5px;
	}
</style>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<html:form action="/myFavorite/OperateOfMyFavoriteAction?method=updateMyFavoriteAction" method="POST">
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>�༭�ղؼ�</td>
  </tr>

</table><hr color=#97D2FF>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
	<html:hidden name="MyFavoriteForm" property="myfavorite.recordId"></html:hidden>
	<html:hidden name="MyFavoriteForm" property="myfavorite.description"></html:hidden>
	<html:hidden name="MyFavoriteForm" property="myfavorite.url"></html:hidden>
		<tr height="35"> 
		  <th align="right" width="25%">�ļ������ƣ�</th>
		  <td width="75%"><html:text property="myfavorite.nodeName" name="MyFavoriteForm"/>
		  <span style="color:red;">*����</span>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">���ͣ�</th>
		  <td>myFavorite<html:hidden property="myfavorite.typeIs" name="MyFavoriteForm" value="myFavorite"/></td>
		</tr>
		<tr height="35"> 
		   <th align="right">������ļ��У�</th> 
		  <td><html:select property="myfavorite.parentNode" value="${recordId}" size="1" >			
				<html:optionsCollection name="list"  label="nodeName" value="recordId"/>											
		      </html:select>
		 </td>
		</tr>
		<tr height="35"> 
		  <th align="right">�ṩ���ڣ�</th>
		  <td><html:text property="dateOfInformation" name="MyFavoriteForm" onfocus="calendar(this,null,null,null)" size="11"/>
		  <span style="color:red;">*����</span>
		  </td>
		  
		</tr>
		<tr height="35"> 
		  <th align="right">�ļ���������</th>
		  <td><html:textarea property="myfavorite.description" name="MyFavoriteForm"/></td>
		</tr>					
	</table>
  <div id=bc align=center>
  	<input onclick="save()"  type="button" value=' �� �� ' class='input_button'>
  	<input onclick="window.history.back()" type="button" value=' �� �� '  class='input_button'>
  </div><br>

</div>
  </html:form>
</body>
</html>
