<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script>
	function getIniValue()
	{
	    var ini = parent.frames[0].document.getElementsByTagName("A");

	    for(var i=0;i<ini.length;i++)
	    {
	        if(ini[i].style.color == "#ff5d00")
	        {
	           var s = document.getElementById("itemName");
	           s.innerHTML = ini[i].innerHTML;
	           break;
	        }   
	    }
	}

	function save()
	{
		location.href="createSpecificationmodify.jsp";
	}
	

	function deltr() {
        
        if(!confirm("确认删除此记录吗?")) return;
		var e = window.event.srcElement;
		while(e.tagName!='TR') 
			  e = e.parentNode;
		var str = e.innerText.split(" ",2);
		var id = str[1];
		location.href = "SpecificationmodifyAction.do?method=deleteSpecificationmodify&Id="+id;
}	
	function tijiao(){ 
        if(!confirm("确认提交审批吗?")) return;
        var e = window.event.srcElement;
		while(e.tagName!='TR') 
			  e = e.parentNode;
		var str = e.innerText.split(" ",2);
		var id = str[1];
		location.href = "SpecificationmodifyAction.do?method=tijiaoSpecificationm&Id="+id;    
		}
</script>
</head>

<body onload="" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td><span id="itemName">变更申请单</span></td>
	</tr>
	
</table>
<!--如果页面中有提示信息，可放此处--->
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=info>
	<tr>
	</tr>
</table>
<!--如果页面中有提示信息，可放此处  over--->

<hr color=#97D2FF>


<div class=list>
<table id="ta">
	<tr>
		<th width="10%">序号</th>
		<th width="20%">登记号</th>
		<th width="20%">申请人</th>
		<th width="20%">登记日期</th>
		<th width="10%">审批状态</th>
		<th width="20%">操作</th>
	</tr>
	<logic:iterate id="element" name="specificationmodifyList" indexId="index">
		<tr>
		<td align="center">
			${index+1}
		</td>
		<td style="display: none;">
			${element.id}
		</td>
		<td align="center">
			<a href="SpecificationmodifyAction.do?method=SpecificationmodifyInfo&Id=${element.id}" >${element.registryId}</a>	
		</td>
		<td align="center">
			${element.reason}
		</td>
		<td align="center">
			<bean:write name="element" property="dateOfInformation" format="yyyy-MM-dd"></bean:write>
		</td>
		<td align="center">
			${element.status}
		</td>
		<td align="center">
		<logic:equal name="element" property="status" value="草稿">
			<a href="SpecificationmodifyAction.do?method=preModifySpecificationmodify&Id=${element.id}" ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
										border="0">
			</a>&nbsp
			<img onclick="deltr()" src="../images/icon/del.gif" width="16" height="16" border="0">&nbsp
			<img src="../images/icon/icon_ok.gif" onclick='tijiao()' width="16" height="16" border="0">
		</logic:equal>
		<logic:notEqual name="element" property="status" value="草稿">
		</logic:notEqual>
		</td>
		</tr>
	</logic:iterate>
</table>

</div>
  <div id=bc align=left>
  	<input onclick="save()" type=button value=' 新 建 ' class='input_button'>  	
  </div><br>
</body>
</html>
