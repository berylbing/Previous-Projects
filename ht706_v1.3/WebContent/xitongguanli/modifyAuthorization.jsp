<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>

	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>���������ϵͳ</title>
		

		<link href="../css/common.css" rel="stylesheet" type="text/css">
     <script src="../js/check.js" type="text/javascript"></script>
     <script type="text/javascript">
     	function save(){
	 		if(checkInput() == false)
	 			return;
	 		var testName = document.getElementsByName("authorization.name")[0].value;	 		
	 		if(testName == authorName)
	 			document.forms[0].submit();
	 		else
				checkName();	 		
	 	 }
	     function checkInput(){
	 		var inputs = document.forms[0].getElementsByTagName("INPUT");
	 		if(inputs["authorization.name"].value == ""){ alert("������Ȩ������");return false;}
	 		
	 		if(inputs["authorization.description"].value == ""){ alert("������Ȩ������");return false;}
	 			 		
	 		return true;
	 	 }
	     function checkName(){
	 		var name=document.getElementsByName("authorization.name")[0].value;
	 		url = "authorizationAction.do?method=checkName&Name="+name;
	 		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	 		xmlhttp.onreadystatechange=processor;
	 		xmlhttp.open("post",url);
	 		xmlhttp.send(null);
	 		
	 	}
	 	function processor(){
	 		if(xmlhttp.readyState==4)
	 			if(xmlhttp.status==200)
		 		{	 			
	 				if(xmlhttp.responseText == "ok")
	 					document.forms[0].submit();
	 				else
		 				alert("Ȩ�����Ѵ��ڣ�����������");
	 			}
	 	}
     </script>     
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					�޸�Ȩ��
				</td>
			</tr>
		</table>
	<html:form action="/xitongguanli/authorizationAction?method=modifyAuthorization" method="POST">
	<nested:hidden property="authorization.authorizationId" value="${af.authorizationId}"></nested:hidden>
		<div class=editblock >
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">Ȩ�����ƣ�</th>

		  <td width="75%"><nested:text  property="authorization.name" value="${af.name}"/>  </td>

		</tr>				
		<tr height="35"> 
		  <th align="right" width="25%">Ȩ��ְ��</th>
		  <td width="75%"><nested:text  property="authorization.description" value="${af.description}"/></td>
		</tr>		
		<tr height="35"> 
		  <th align="right" width="25%">����ģ�飺</th>
		  <td width="75%">		  
		  	<html:select  property="authorization.module"  value="${af.module}">
				<html:option value="0" >��������</html:option>
				<html:option value="1" >������Լ</html:option>
				<html:option value="2" >�����뽻��</html:option>
				<html:option value="3" >ϵͳ����</html:option>
				<html:option value="4" >�ҵ��ղ�</html:option>
				<html:option value="5" >�������</html:option>
				<html:option value="6" >������</html:option>
			</html:select>
		  </td>
		</tr>
	</table>
	<script type="text/javascript">
		var authorName = document.getElementsByName("authorization.name")[0].value;
	</script>
  <div id=bc align=right>
  	<input  type="button" class="input_button" onClick="history.go(-1);" value=" �� �� ">	
  	<input onclick='save()' type=button value=' �� �� ' class='input_button'>
  </div><br>
  </div>
</html:form>
	</body>
</html:html>
