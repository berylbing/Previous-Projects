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

	function excel(v) {		
		open_window("Checkout.do?method=preCheckout&Asset="+v, 700,350);
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
		     open_window('../componentFeedBack/problemReport.do?method=preCreate&AssetUUID='+uuid,900,500);		        	        
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
	function searchByRelation(v){
		se=document.getElementById("S_relation"+v);
				path=location.pathname;
		for(var index=1;index<path.length;index++)
		{
			if(path.charAt(index)=='/') break;
		}
		tmp=path.substring(0,index);
		document.getElementById("ComponentListForm").action=tmp+"/componentSearch/SearchByRelationAction.do?asset="+v+"&relation="+se.options[se.selectedIndex].value;
		//alert(document.getElementById("ComponentListForm").action);
		document.getElementById("ComponentListForm").submit();
	}
	function gotoForum(){
 		open_window('../forum/index.do?method=viewIndex',900,500);
 	}
 		function creatMyfavorite(v){
 		open_window('CreatMyfavoriteAction.do?method=ShowMyFavouriteTree&id='+v,400,400);
 	}
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<html:form action="/componentSearch/PageChange" method="post">
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
      <th align="center">序号</th>       
      <th align="center">构件名称</th>
      <th align="center">发布日期</th>
      <th align="center">提供者</th>      
      <th align="center">所属领域</th>
      <th align="center">操作</th>      
    </tr>
	<logic:iterate id="list" name="ComponentListForm" property="componentList" indexId="index" 
	length='<%= String.valueOf(Constant.PAGE_LINES) %>' 
offset='<%= String.valueOf(((ComponentListForm)request.getAttribute("ComponentListForm")!=null )
	?(Constant.PAGE_LINES*((ComponentListForm)request.getAttribute("ComponentListForm")).getPage())
	:0) %>'
	> 

			    <tr>         
			      <td align="left" width='30'>${index+1}</td>
			      <td align="left" width='220'><a onclick="w_open('/componentRelease/ComponentList.do?method=viewComponentAction&ID=${list.uniqueId}')"><bean:write name="list" property="name"/></a></td>      
			      <td align="left" width='80'><bean:write name="list" property="acceptanceDate"></bean:write></td>
			      <td align="center" width='90'><bean:write name="list" property="provider"></bean:write></td>
			      <td align="center" width='60'><bean:write name="list" property="domain" /></td>     
			      <td align="left" width='150'>
			         <img alt="下载" onclick="excel('${list.uniqueId}')" src="../images/icon/beiyong.gif">&nbsp         
			         <img alt="交流" onclick="gotoForum()" src="../images/icon/square.gif">&nbsp
			         <img alt="反馈" onclick="n_open(4,'${list.uniqueId}')" src="../images/icon/icon_liulan.gif">&nbsp
			         <img alt="收藏" onclick="creatMyfavorite('${list.uniqueId}')" src="../images/icon/icon_saveattach.gif">&nbsp
			         <img alt="报告问题" onclick="n_open(7,'${list.uniqueId}')" src="../images/ComponentForum1/new_post.gif">&nbsp  
			         <select id="S_relation${list.uniqueId}" size="1">
			         	<logic:iterate id="lista" name="ComponentListForm" property="relationTypes">
							<option value='${lista.relationName}'>${lista.relationName}</option>	
						</logic:iterate>
			         </select>
			         <img alt="通过构建关系查询" onclick="searchByRelation('${list.uniqueId}')" src="../images/icon/search.gif">&nbsp                 
			      </td>
			    </tr>
	</logic:iterate> 
   
 </table>
</div>

 <table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=page>
	<tr>
		<td align="right">(${(ComponentListForm.page)*PAGE_LINES+1}－${(ComponentListForm.page+1)*PAGE_LINES})/共${ComponentListForm.allNum } &nbsp
							第${ComponentListForm.page+1 }页/共${ALL_PAGE}页&nbsp
							<a onclick='jumpToPage(${0})'> 首页</a> &nbsp
							<a onclick='jumpToPage(${ComponentListForm.page-1})'> 上一页</a> &nbsp
							<a onclick='jumpToPage(${ComponentListForm.page+1})'>下一页</a>&nbsp 
							<a onclick='jumpToPage(${ALL_PAGE})'>尾页</a> &nbsp跳转至： 			
		     <select name="menu1" onChange="jumpto(this)" size="1">			     
			     <% 
			     int curpage=((ComponentListForm)request.getAttribute("ComponentListForm")).getPage();
			    	 for(int i=0;i<x;i++)
			    	 	if(i==curpage)out.println("<option selected>"+(i+1)+"</option>");
			    	 	else out.println("<option>"+(i+1)+"</option>");
			     %>
		     </select>
		</td>
	</tr>
</table>

<br>
</html:form>
</body>
</html>

