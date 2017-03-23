<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">

<html>
<head>
<title>收藏夹信息</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}

	function excel() {
		//window.open("excel/XXX构件.rar");
		//location.href = "excel/XXX构件.rar";
		showModalDialog("checkoutReport.htm", "UUID","dialogHeight:350px; dialogWidth:700px; help:no");
	}
	

	function switchPage()
	{
	       var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
	       a.src = "menuFrame1.htm";
	}
	
	function w_open(v){

		open_window(v,900,500);
		return;		
	}
	
	function deltr() {
	var str=location.href;
	alert(str);
		document.getElementById("ComponentListForm").action+=("?method=deleteSelectedComponent");
		document.getElementById("ComponentListForm").submit();
		location.href=str;
	}
	
	function jumpToPage(page){
		document.getElementById("ComponentListForm").action+=("?method=pageChange&page="+page);
		alert(document.getElementById("ComponentListForm").action); 
		document.getElementById("ComponentListForm").submit();	
	}	
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>
<html:form action="/myFavorite/PageChange" method="post" >
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>收藏夹内容</td>
	</tr>
</table>

<input type="hidden" name="hid">

<div class=list>
  <table border="0" id="ta2">
    <tr>   
      <th height="26"><input type="checkbox" name="boxb" value="checkbox" onclick="checkBoxAll('boxj')"></th>             
      <th align="center">序号</th>       
      <th align="center">构件名称</th>
      <th align="center">发布日期</th>
      <th align="center">提供者</th>      
      <th align="center">所属领域</th>
      <th align="center">操作</th>      
    </tr>
   
    <logic:iterate id="element" name="ComponentListForm" property="componentList" indexId="index"> 
	<tr>
	  <td align="center" width='10'><html:multibox name="ComponentListForm" property="selectedComponent">
									<bean:write name="element" property="uniqueId"/>
					
					     		</html:multibox></td>         
      <td align="left" width='30'>${index+1 }</td>
      <td align="left" width='220'><a onclick="w_open('../componentRelease/ComponentList.do?method=viewComponentAction&ID=${element.uniqueId}')"><bean:write name="element" property="name"/></a></td>      
      <td align="center" width='60'><bean:write name="element" property="acceptanceDate"/></td>  
      <td align="center" width='90'><bean:write name="element" property="provider"/></td>
      <td align="center" width='90'><bean:write name="element" property="facet"/></td>          
      <td align="left" width='150'> 
             <img alt="下载" onclick="excel()" src="../images/icon/beiyong.gif">&nbsp         
             <img alt="交流" onclick="w_open(3)" src="../images/icon/square.gif">&nbsp
             <img alt="反馈" onclick="w_open(4)" src="../images/icon/icon_liulan.gif">&nbsp     
      </td>
    </tr>
	</logic:iterate>         
 </table>
</div>

  <div id=bc align=left>	
      <input type='button' value=' 删  除 ' class="input_button" onclick="deltr()">&nbsp;	     
  </div><br>
</html:form>
</body>
</html>

