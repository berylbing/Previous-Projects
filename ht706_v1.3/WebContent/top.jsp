<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>������������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="css/top.css" rel="stylesheet" type="text/css">
</head>
<script>
	var tempClass="";
	function overThis(p){
		tempClass=p.className;
		p.className="over";
	}
	function outThis(p){
		p.className=tempClass;
	}
	
	//������Class
	var firstId=null;
	function clickThis(p){
		firstId.className="";
		p.className="on";
		tempClass="on";
		firstId=p;
	}
	function init(){
		//alert(parent.downFrame.cols)
		var d = new Date();
		var td = d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate();
		document.getElementsByTagName("span")[0].innerText = td;
		firstId=document.getElementById("firstId");
	}
	function goback() {
		for (var i=0; i<window.history.length; i++)
			window.history.back();
	}
	function logout(){
		url=window.location.href;
		index=url.lastIndexOf("/");
		url=url.substring(0,index);
		url+="/j_spring_security_logout";
		window.parent.location.href=url;
	}
</script>
<style>
</style>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	onLoad="init()";>
<table width="100%" height="100%" border="0" cellpadding="0"
	cellspacing="0" class=top>
	<tr>
		<td class="logo">
		<div class=subNav>   ϵͳ����Ա����ӭ���������ǣ�<span></span> | <a onclick="logout()">�˳�</a> | <a
			href="#">����</a></div>
		</td>
	</tr>
</table>
</body>
</html>
