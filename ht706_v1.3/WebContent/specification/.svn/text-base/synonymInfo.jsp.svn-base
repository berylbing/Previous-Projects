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
		location.href="SynonymAction.do?method=preCreateSynonym&Ids=${spceid}&Idf=${facetid}";
	}
	

	function deltr() {
        
        if(!confirm("确认删除此记录吗?")) return;
		var e = window.event.srcElement;
		while(e.tagName!='TR') 
			  e = e.parentNode;
		var str = e.innerText.split(" ",2);
		var id = str[1];
		location.href = "SynonymAction.do?method=deleteSynonym&Id="+id;
}	
</script>
</head>

<body onload="" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td><span id="itemName">${facetname}</span></td>
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
<nested:hidden property="facetid" value="${facetid}"></nested:hidden>
<nested:hidden property="spceid" value="${spceid}"></nested:hidden>
	<tr>
		<th width="20%">序号</th>
		<th width="30%">词汇名</th>
		<th width="30%">操作</th>
	</tr>
	<logic:iterate id="element" name="synonymList" indexId="index">
		<tr>
		<td>
			${index+1}
		</td>
		<td style="display: none;">
			${element.synonymUuid}
		</td>
		<td>
			${element.targetItem}
		</td>
		<td>
			<a href="SynonymAction.do?method=preModifySynonym&Id=${element.synonymUuid}" ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
										border="0">
			</a>&nbsp
			<img onclick="deltr()" src="../images/icon/del.gif" width="16" height="16" border="0">
		</td>
		</tr>
	</logic:iterate>
</table>

</div>
  <div id=bc align=right>
  	<input onclick="save()" type=button value=' 新 建 ' class='input_button'>  	
  </div><br>
</body>
</html>
