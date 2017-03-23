<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function newComponent() {
               location.href = "PreFacetTree.do?method=preFacetTree";
	}
	
	function w_open(v){

		open_window(v,900,500);
		return;		
	}
	
	function deltr(v) {
                
              if(!confirm("确认删除此记录吗?")) return;
				location.href ="ComponentList.do?method=deleteComponentAction&ID="+v;
	}
	
	function submit(v) {
                
                if(!confirm("确认提交此记录吗?")) return;
 				location.href ="ComponentList.do?method=submitComponentAction&ID="+v;              
	}	
	function edit(v){
			location.href="ComponentList.do?method=editComponentAction&ID="+v;
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

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>我建立的构件</td>
	</tr>
</table>

<input type="hidden" name="hid">

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>       
      <th align="center">构件名称</th>
      <th align="center">发布日期</th>    
      <th align="center">所属领域</th>
      <th align="center">状态</th>        
      <th align="center">操作</th>      
    </tr>
   
<logic:iterate id="list" name="ComponentListForm" property="componentList" indexId="index"> 
	<tr>         
      <td align="left" width='30'>${index+1 }</td>
      <td align="left" width='220'><a onclick="w_open('ComponentList.do?method=viewComponentAction&ID=${list.uniqueId}')"><bean:write name="list" property="name"/></a></td>      
      <td align="left" width='80'><bean:write name="list" property="versionDate"/></td>
      <td align="center" width='60'><bean:write name="list" property="domain"/></td>  
      <td align="center" width='90'><bean:write name="list" property="approvedState"/></td>         
      <td align="left" width='150'>
      <logic:notEqual value="已批准" name="list" property="approvedState">
	      	<logic:notEqual value="已提交" name="list" property="approvedState">
		         <img alt="编辑" onclick="edit('${list.uniqueId}')" src="../images/icon/icon_dianping.gif">      
		         <img alt="删除" onclick="deltr('${list.uniqueId}')" src="../images/icon/del.gif">
		         <img alt="提交" onclick="submit('${list.uniqueId}')" src="../images/icon/icon_ok.gif">
	 		</logic:notEqual>
 		</logic:notEqual>
      </td>
    </tr>
	</logic:iterate>       
 </table>
</div>

<div id=bc align=right>
     <input onclick='newComponent()' type=button value=' 新 建' class='input_button'>  	
</div><br>

</body>
</html>

