<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>���������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/calendar.js" type="text/javascript"></script>
<script src="../js/check.js" type="text/javascript"></script>
<style>
	input{
		font-size: 12px;
		color: #000000;
		background-color: #F1F4F5;
		border: 1px solid #49789C;
		padding:2px 0px 0px 5px;
	}
	
</style>

<script>
 function selectReason(){
	 open_window("SpecificationmodifyAction.do?method=searchSpecificationmodify&select=${specification.specUuid}&reason=${specification.reason}",800,600);
	 }
 function checkversion(){
		var vv=document.getElementsByName("specification.version")[0].value;
		url = "SpecificationAction.do?method=checkSpecificationVersion&version="+vv;
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.onreadystatechange=processor;
		xmlhttp.open("post",url);
		xmlhttp.send(null);
		
	}
	function processor(){
		if(xmlhttp.readyState==4)
			if(xmlhttp.status==200){	
				document.getElementById("error").innerHTML=xmlhttp.responseText;
			}
	}
	function check_null()
	{
		var version = document.getElementsByName("specification.version")[0].value;
		var reason = document.getElementsByName("specification.reason")[0].value;
		var error = document.getElementById("error").innerText;
		
		if(version=="")
		{
			alert("����д��Լ�汾�ţ� ");
			return false;
		}
		if(error == "�ð汾���Ѵ��ڣ�����ʹ�ã� ")
		{
			alert("�ð汾���Ѵ��ڣ�����ʹ�ã� ");
			return false;
		}
		if(reason=="")
		{
			alert("��ѡ�����ݵ����뵥�� ");
			return false;
		}
		document.getElementsByName("specificationForm")[0].submit();
		return true;
		
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<!--<hr color=#97D2FF>-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
		<tr>          
		   <td><div id="aspect"><b>�޸Ĺ�Լ</b></div></td>
		</tr>
	</table>
<html:form action="/specification/SpecificationAction?method=modifySpecification" method="POST">
<nested:hidden property="specification.specUuid" value="${specification.specUuid}"></nested:hidden>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right">���ݵ����뵥��</th>
		  <td>
		  <span id="_Reasons">${Reason}</span>
		  <nested:hidden property="specification.reason" value="${Reason}"></nested:hidden>
		        <input  type="button" class="input_button" onClick="selectReason()" value="ѡ�����뵥">
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right" width="25%">��Լ�汾��</th>
		  <td width="75%">
		  <nested:text  property="specification.version" onchange="checkversion()" value="${specification.version}"/>
		  <label id="error"></label>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">ǰ����Լ��</th>
		  <td>
		  ${prespecificationid}
		  <nested:hidden property="prespecificationid" value="${prespecificationid}"></nested:hidden>
		  </td>
<!--		  <td>-->
<!--                <html:select  property="prespecificationid"  value="${prespecificationid}">-->
<!--					<html:optionsCollection name="preSp"  label = "version" value = "version"/>-->
<!--				</html:select>-->
<!--		  </td>-->
		</tr>
		
		<tr height="35"> 
		  <th align="right">�������ͣ�</th>
		  <td>
		  		<html:radio property="specification.releaseType"  name="specificationForm" value="1">ȫ�ַ���</html:radio>
				<html:radio property="specification.releaseType"  name="specificationForm" value="2">���ط���</html:radio> 
		  </td>
		</tr>						
		<tr height="35"> 
		  <th align="right">��Լ˵����</th>
		  <td width="75%"><nested:text  property="specification.description" value="${specification.description}" />  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">�����ƣ�</th>
		  <td width="75%">${lid}</td>
		</tr>			
		<tr height="35"> 
		  <th align="right">�����ߣ�</th>
		  <td width="75%">${creator}</td>
		</tr>	
		<tr height="35"> 
		  <th align="right">����ʱ�䣺</th>
		  <td width="75%">
		  <html:text property="createtime" value="${createtime}"  readonly="true" onfocus="calendar(this,null,null,null)" size="40"></html:text>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">״̬��</th>
		  <td width="75%">
		  <logic:equal name="specification" property="status" value='${1}'>�ݸ�</logic:equal>
		  	<logic:equal name="specification" property="status" value='${2}'>������</logic:equal> 
		  	<logic:equal name="specification" property="status" value='${3}'>����׼</logic:equal>
		  	<logic:equal name="specification" property="status" value='${4}'>��ǰ</logic:equal>
		  	<logic:equal name="specification" property="status" value='${5}'>��ʷ</logic:equal>
		  </td>
		</tr>									
	</table>
			
  <div id=bc align=right>
  	<input onclick="check_null()" type=button value=' �� �� ' class='input_button'>
  </div><br>

</div> 
</html:form>
</body>
<script>
if(${specification.releaseType}==1)
	document.all("specification.releaseType")[0].checked=true;
if(${specification.releaseType}==2)
	document.all("specification.releaseType")[1].checked=true;
  
</script>
</html>
