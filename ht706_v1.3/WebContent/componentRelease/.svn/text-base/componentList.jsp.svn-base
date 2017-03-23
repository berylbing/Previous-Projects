<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm" language="java"%>
<%@ page import="com.ht706.componentLibrary.util.Constant" language="java"%>
<% request.setAttribute("PAGE_LINES",Constant.PAGE_LINES);
	ComponentListForm f=(ComponentListForm)request.getAttribute("ComponentListForm");
	int all=f.getAllNum(),x;
	if((all % Constant.PAGE_LINES)==0) x=all / Constant.PAGE_LINES;
	else x=all / Constant.PAGE_LINES+1;
	request.setAttribute("ALL_PAGE",x);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
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
		showModalDialog("checkoutReport.htm", "UUID","dialogHeight:350px; dialogWidth:700px; help:no");
		//window.open("excel/XXX构件.rar");
		//location.href = "excel/XXX构件.rar";
	}
	

	function switchPage()
	{
	       var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
	       a.src = "menuFrame1.jsp";
	}

	function deltr(rowIndex) {
                
        var ta = document.getElementById("ta");
		ta.deleteRow(rowIndex); 
	}
	
	function w_open(v){
			path=location.pathname;
		for(var index=1;index<path.length;index++)
		{
			if(path.charAt(index)=='/') break;
		}
		tmp=path.substring(0,index);
		//alert(tmp+v);
		open_window(tmp+v,900,500);		
	}
	function n_open(v,uuid){
		if (v == 4) {
	        open_window('../componentFeedBack/feedback.do?method=preCreate&AssetUUID='+uuid,900,500);
	        return;		
		}
		if (v == 7) {
	        open_window('../componentFeedBack/problemReport_new.jsp',900,500);		        
	        return;		
		}
		
		return;		
	}
	function jumpToPage(page){
		document.getElementById("ComponentListForm").action+=("?page="+page);
		document.getElementById("ComponentListForm").submit();	
	}
	function jumpto(v){
		jumpToPage(v.selectedIndex);
	}
	function b_c(){
		checkboxs=document.getElementsByName("fboxi");
			for(var i=0;i<checkboxs.length;i++){
				if(checkboxs[i].checked){
					tb=window.parent.parent.opener.document.getElementById("ta2");
					tr=tb.insertRow(tb.rows.length);
					td=tr.insertCell();
					td.innerHTML="<input type='checkbox' name=\"relatedAsset1\" checked='checked'>";
					//alert(td.innerHTML);
					td=tr.insertCell();
					td.innerHTML=document.getElementById("ta").rows[i+1].cells[2].innerHTML;
					//alert(td.innerHTML);
					td=tr.insertCell();
					td.innerHTML="<input type='checkbox' name=\"relatedAsset\" value='"+checkboxs[i].value+"' checked='checked' style=\"display:none;\"></input>"+checkboxs[i].value;
					//alert(td.innerHTML);
					td=tr.insertCell();
					td.innerHTML="<select name=\"relation\" style=\"width:80px;\" size=1>"+window.parent.parent.opener.document.getElementById("hidden_Relation").innerHTML+"</select>";
					
				//	alert(td.innerHTML);
					window.parent.parent.close();
				}
			}
	}
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<html:form action="/componentRelease/ComponentList?method=creatRelations" method="post">
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>查询结果</td>
		<td align="right"></td>		
	</tr>
</table>

<input type="hidden" name="hid">

<div class=list>
  <table border="0" id="ta">
    <tr> 
      <th width="5%" height="26"><input type="checkbox" name="fboxa" value="checkbox" onclick="checkBoxAll('fboxi')"></th>           
      <th align="center">序号</th>       
      <th align="center">构件名称</th>
      <th align="center">发布日期</th>
      <th align="center">提供者</th>      
      <th align="center">所属领域</th>     
    </tr>
		<logic:iterate id="list" name="ComponentListForm" property="componentList" indexId="index" 	> 
			    <tr>    
			      <td><input type="checkbox" name="fboxi" value="${list.uniqueId}" onclick="checkItem('fboxa')" id='${list.uniqueId}'></td>      
			      <td align="left" width='30'>${index+1}</td>
			      <td align="left" width='220'><a onclick="w_open('/componentRelease/ComponentList.do?method=viewComponentAction&ID=${list.uniqueId}')"><bean:write name="list" property="name"/></a></td>      
			      <td align="left" width='80'><bean:write name="list" property="acceptanceDate"></bean:write></td>
			      <td align="center" width='90'><bean:write name="list" property="provider"></bean:write></td>
			      <td align="center" width='60'><bean:write name="list" property="domain" /></td>     
			    </tr>
		</logic:iterate> 
   
 </table>
</div>
<input onclick='b_c()' type=button value=' 保 存 ' class='input_button'>
<br>
</html:form>
</body>
</html>

