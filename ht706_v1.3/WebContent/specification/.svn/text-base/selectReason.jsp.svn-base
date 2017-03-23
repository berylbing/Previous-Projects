<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>选择所依据的申请单</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="js/check.js" type="text/javascript"></script>
<script>

function save(){
		
		var s= document.getElementsByName("id");
		var s2="";
		for(var i=0;i<s.length;i++)
		{
			if(s[i].checked)
			{
				s2=s2+s[i].value+",";
				}
			}
		s2=s2.substr(0,s2.length-1);
		
		window.opener.document.getElementById("_Reasons").innerHTML = s2;
		window.opener.document.getElementsByName("specification.reason")[0].value = s2;
		window.close();
	}

function onload()
{
	var s= document.getElementsByName("id");
	var temp = location.search.substr(1).split("&");
	if(temp.length>2){
		temp = temp[2].split("=");
		var reasons = temp[1].split(",");
		for(var i=0;i<s.length;i++)
		{
			s[i].checked = false;
			for(var j=0; j<reasons.length;j++)
       			if(s[i].value== reasons[j])s[i].checked=true;
		}

	}
	
}
</script>

<style>
	a { cursor:hand; }
</style>
</head>

<body onload="onload()" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>已审批的申请单</td>
	</tr>
</table>

<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>
      <th width="12%" height="26">
			<input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('id')">
	  </th>                
      <th align="center">登记号</th>
       <th align="center">申请人</th> 
        <th align="center">申请时间</th> 
      
   
    </tr>
  	<logic:iterate id="element" name="specificationmodifyList" >
					<tr>
						<td align="center">
								<html:checkbox name="element" property="id" value='${element.registryId}' ></html:checkbox>
						</td>
						<td align="center">
							${element.registryId}
						</td>
						<td align="center">
							${element.reason}
						</td>
						<td align="center">
							<bean:write name="element" property="dateOfInformation" format="yyyy-MM-dd"/>
						</td>
					</tr>
					
	</logic:iterate> 

 </table>
</div>

<table align="left" width="100%">
      <tr> 
      <td align="left">
        <input name="button22" type="button" class="input_button" onClick="save()" value=" 确定 ">&nbsp;&nbsp;
      </td>
      </tr>
</table>

<div>
<script type="text/javascript">

   
</script>     
</div>
</body>
</html>
