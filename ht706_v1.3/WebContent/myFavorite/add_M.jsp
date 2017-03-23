<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>软件构件库系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<script src="../js/calendar.js" type="text/javascript"></script>
<link href="../css/common.css" rel="stylesheet" type="text/css">
<link href="css/common.css" rel="stylesheet" type="text/css">
<script>
	function save(){
			if(checkInput() == false)
				return;
			checkName();
		}
		function checkInput(){
			var inputs = document.forms["MyFavoriteForm"].getElementsByTagName("INPUT");
			if(inputs["myfavorite.nodeName"].value == ""){ alert("请输入文件夹名称");return false;}
			if(inputs["dateOfInformation"].value == ""){ alert("请输入文件夹的提供日期");return false;}
			return true;
		}
		
		function checkName(){
	 		var name=document.getElementsByName("myfavorite.nodeName")[0].value;
	 		url = "OperateOfMyFavoriteAction.do?method=checkName&Name="+name;
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
		 				alert("文件夹名称已存在，请重新输入");
	 			}
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
<html:form action="/myFavorite/OperateOfMyFavoriteAction?method=createMyFavoriteAction" method="POST">
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>添加收藏夹</td>
  </tr>

</table><hr color=#97D2FF>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">文件夹名称：</th>
		  <td width="75%"><html:text property="myfavorite.nodeName" name="MyFavoriteForm"/>
		  <span style="color:red;">*必填</span>
		  </td>
		  
		</tr>
		<tr height="35"> 
		  <th align="right">类型：</th>
		  <td>myFavorite<html:hidden property="myfavorite.typeIs" name="MyFavoriteForm" value="myFavorite"/></td>
		</tr>
		<tr height="35"> 
		   <th align="right">父结点文件夹：</th> 
		  <td><html:select property="myfavorite.parentNode" value="${recordId}" size="1" >			
				<html:optionsCollection name="list"  label="nodeName" value="recordId"/>											
		      </html:select>
		 </td>
		</tr>
		<tr height="35"> 
		  <th align="right">提供日期：</th>
		  <td><html:text property="dateOfInformation" name="MyFavoriteForm" onfocus="calendar(this,null,null,null)" size="11"/>
		  <span style="color:red;">*必填</span>
		  </td>
		  
		</tr>	
		<tr height="35"> 
		  <th align="right">文件夹描述：</th>
		  <td><html:textarea property="myfavorite.description" name="MyFavoriteForm"/></td>
		</tr>				
	</table>
  <div id=bc align=center>
  	<input onclick="save()"  type="button" value=' 保 存 ' class='input_button'>
  	<input onclick="window.history.back()" type="button" value=' 返 回 '  class='input_button'>
  </div><br>

</div>
  </html:form>
</body>
</html>
