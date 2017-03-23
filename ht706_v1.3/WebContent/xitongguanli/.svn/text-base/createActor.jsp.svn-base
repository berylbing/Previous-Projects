<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>构件库管理系统</title>
		

		<link href="../css/common.css" rel="stylesheet" type="text/css">

     <script src="../js/check.js" type="text/javascript"></script>   
     <script type="text/javascript">
	     function save(){
	 		if(checkInput() == false)
	 			return;	 		
 			checkName();	 		
	 	 }
	     function checkInput(){
	 		var inputs = document.forms["actorForm"].getElementsByTagName("INPUT");
	 		if(inputs["actor.actorName"].value == ""){ alert("请输入角色名称");return false;}	 		
	 		if(inputs["actor.responsibility"].value == ""){ alert("请输入角色职责");return false;}
	 			 		
	 		return true;
	 	 }
	     function checkName(){
	 		var name=document.getElementsByName("actor.actorName")[0].value;
	 		url = "actorAction.do?method=checkName&Name="+name;
	 		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	 		xmlhttp.onreadystatechange=processor;
	 		xmlhttp.open("post",url);
	 		xmlhttp.send(null);
	 		
	 	}
	 	function processor(){
	 		if(xmlhttp.readyState==4)
	 			if(xmlhttp.status==200){		 			
	 				if(xmlhttp.responseText == "ok")
	 					document.forms[0].submit();
	 				else
		 				alert("角色名已存在，请重新输入");
	 			}
	 	}
     </script>

	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					新增角色
				</td>
			</tr>
		</table>
	<html:form action="/xitongguanli/actorAction?method=createActor" method="POST">
	
	<div class=editblock >
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">角色名称：</th>

		  <td width="75%"><nested:text  property="actor.actorName" />  </td>

		</tr>						
		<tr height="35"> 
		  <th align="right" width="25%">角色职责：</th>
		  <td width="75%"><nested:text  property="actor.responsibility" /></td>
		</tr>
	</table>	
  <div id=bc align=right>
	<input  type="button" class="input_button" onClick="history.go(-1);" value=" 返 回 ">	
  	<input onclick='save()' type=button value=' 保 存 ' class='input_button'>

  </div><br>
  </div>
</html:form>
	</body>
</html:html>
