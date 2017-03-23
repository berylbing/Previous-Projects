<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>

	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>706所软件构件库管理系统</title>
<script>
	function init(){	
		firstId=document.getElementById("firstId");	
	}
	//处理点击Class
	var firstId=null;
	function tabChang(p){
		firstId.className="";
		p.className="on";
		firstId=p;	
	}	
</script>


<style type="text/css">
<!--
body {
	margin: 0px;
	
	color: #CCFFFF;
	font-size: 12px;
}
input {
	font-size: 12px;
	color: #FFFFFF;	text-decoration: none;
	background-color: #489fbf;
	border-top-width: 1px;
	border-right-width: 1px;
	border-bottom-width: 1px;
	border-left-width: 1px;
	border-top-style: solid;
	border-right-style: solid;
	border-bottom-style: solid;
	border-left-style: solid;
	border-top-color: #3c5e6a;
	border-right-color: #6dc6e8;
	border-bottom-color: #6dc6e8;
	border-left-color: #3c5e6a;
	font-family: Verdana;
	font-weight: bold;
	letter-spacing: 0.2em;
}
#lable td {
	font-size: 12px;
	line-height: 26px;
	color: #ccffff;
	text-decoration: none;
	border-bottom: 1px solid #3c8ca6;
	text-indent: 1em;
}
.on{
	border-bottom: none!important;
	border-top: 1px solid #3c8ca6;
	border-right: 1px solid #3c8ca6;
	border-left: 1px solid #3c8ca6;
	background-color: #006699;
	filter:progid:DXImageTransform.Microsoft.Gradient(gradienttype=0, startcolorstr=#3d97b4, endcolorstr=#5ab7d2);
}
.on a {
	font-size: 13px;
	line-height: 26px;
	font-weight: bold!important;
	color: #FFFFFF!important;
	text-decoration: none;	
	
}
#lable td .on a:hover{
	font-size: 12px;
	line-height: 26px;
	font-weight: bold!important;
	color: #FFFFFF!important;
	text-decoration: none;	
	
}

#lable td a {
	font-size: 12px;
	color: #ccffff;
	text-decoration: none;
	
}
#lable td a:hover {
	font-size: 12px;
	line-height: 26px;
	font-weight: bold;
	color: #FFFFFF;
	text-decoration: none;	
}

-->
</style>
</head>

<body onload="init()" scroll=no>
<script type="text/javascript">
<!--
var theForm = document.forms['form1'];
if (!theForm) {
    theForm = document.form1;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
// -->
</script>

<form method="POST" action="loginAction" name="LoginForm">

			
				
			
	
<table width="100%" height="100%" border="0" cellpadding="0">
	<tr>
		<td style="min-height:80px;height:80px;"></td>
	</tr>
	<tr>
		<td height="407" align="center" valign="middle"
			background="images/log_02.jpg">
		<table width="100" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="148" rowspan="3"><img src="images/log_04.jpg" width="148"
					height="407" /></td>
				<td height="203" colspan="2"><img src="images/log_05.jpg"
					width="470" height="203" /></td>
				<td width="142" rowspan="3"><img src="images/log_06.jpg" width="142"
					height="407" /></td>
			</tr>
			<tr>
				<td width="367" align="center" valign="top"
					background="images/log_08.jpg">

				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					id="lable">
					<tr>
					<!--
						<td width="100" id="firstId" class="on" onclick="tabChang(this);"><a name="index1.htm" href="#">系统管理员</a></td>							
					-->
						<td width="100" id="firstId" class="on" onclick="tabChang(this);"><a name="loginAction" href="#">管理员</a></td>
						<td width="100" class="" onclick="tabChang(this);"><a name="loginAction" href="#">普通用户</a></td>
					</tr>
				</table>

				<br />
				<br />
				用户名 <label><input type="text" name="j_username"/><br />
				密  码 <input type="password" name="j_password"/>
				  </label></td>
				<td width="103" height="103" align="right"><a 
					onclick="check(this)">
					<img src="images/log_09.jpg" width="103" height="103"
					border="0" /></a></td>
			</tr>
			<tr>
				<td height="101" colspan="2" valign="bottom"><img
					src="images/log_10.jpg" width="470" height="101" /></td>
			</tr>
		</table>
		<em></em></td>
	</tr>
	<tr>
		<td height="50%"></td>
	</tr>
</table>
	</form>
</body>
<script>
	function check(v) {
		document.getElementById("LoginForm").action=firstId.all.tags("a")[0].name;
		document.getElementById("LoginForm").submit();
		//v.href = firstId.all.tags("a")[0].name;
	}
</script>
</html:html>



