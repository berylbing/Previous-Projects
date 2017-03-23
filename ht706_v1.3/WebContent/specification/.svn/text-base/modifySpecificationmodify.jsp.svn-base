<%@ page contentType="text/html; charset=gbk" %>
<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>构件库管理系统</title>
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
function selectOrganization(name){	
	document.getElementById('_callbackname').value = name;
	open_window('../xitongguanli/OrganizationSelector.htm',600,400);	
}
function checkversion(){
	var rr=document.getElementsByName("specification.registryId")[0].value;
	url = "SpecificationmodifyAction.do?method=checkSpecificationmodifyVersion&rid="+rr;
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
	var registryId = document.getElementsByName("specification.registryId")[0].value;
	var applicant = document.getElementsByName("specification.applicant")[0].value;
	var reason = document.getElementsByName("specification.reason")[0].value;
	var reasonBy = document.getElementsByName("specification.reasonBy")[0].value;
	var scheme = document.getElementsByName("specification.scheme")[0].value;
	var schemeBy = document.getElementsByName("specification.schemeBy")[0].value;
	var attitude = document.getElementsByName("specification.attitude")[0].value;
	var attitudeBy = document.getElementsByName("specification.attitudeBy")[0].value;
	var error = document.getElementById("error").innerText;
	
	if(registryId=="")
	{
		alert("请填写登记号！ ");
		return false;
	}
	if(applicant=="")
	{
		alert("请填写申请人！ ");
		return false;
	}
	if(reason=="")
	{
		alert("请填写修改理由！ ");
		return false;
	}
	if(reasonBy==""||schemeBy==""||attitudeBy=="")
	{
		alert("缺少签名！ ");
		return false;
	}
	if(scheme=="")
	{
		alert("请填写修改方案！ ");
		return false;
	}
	if(attitude=="")
	{
		alert("请填写单位意见！ ");
		return false;
	}
	if(error == "该登记号已存在，不能使用！")
	{
		alert("该登记号已存在，不能使用！ ");
		return false;
	}
	document.getElementsByName("specificationmodifyForm")[0].submit();
	return true;
	
}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<!--<hr color=#97D2FF>-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
		<tr>          
		   <td><div id="aspect"><b>修改变更申请单</b></div></td>
		</tr>
	</table>
	<input type="hidden" id="_OrganizationSelector" value="modifySpecification"/>
	<input type="hidden" id="_callbackname" value=""/>
<html:form action="/specification/SpecificationmodifyAction?method=modifySpecificationmodify" method="POST">
<nested:hidden property="specification.id" value="${specification.id}"></nested:hidden>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">登记号：</th>
		  <td width="75%"><nested:text  property="specification.registryId"  value="${specification.registryId}"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">申请人：</th>
		  <td>
                <nested:text readonly="true" property="applicant" value="${applicant}" />
                <nested:hidden  property="specification.applicant" value="${specification.applicant}"></nested:hidden>               
                <input type="button" class="input_button" value=" 选择人员 " onclick="selectOrganization('specification.applicant')"/>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">登记时间：</th>
		  <td width="75%">
			<html:text property="createtime"  value='${createtime}'  readonly="true" onfocus="calendar(this,null,null,null)" size="40"></html:text>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">修改项：</th>
		  <td>
		  	<html:checkbox  property="shuyu" value='${1}' >刻面术语</html:checkbox>
		  	<html:checkbox  property="tongyi" value='${2}' >同义词</html:checkbox>
		  	<html:checkbox  property="guanxi" value='${4}' >构建关系</html:checkbox>	 
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">修改理由：</th>
		  <td>
		  		<nested:text  property="specification.reason"  value="${specification.reason}"/>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">签名：</th>
		  <td>
                <nested:text readonly="true" property="reasonBy" value="${reasonBy}" />
                <nested:hidden  property="specification.reasonBy" value="${specification.reasonBy}"></nested:hidden>                
                <input type="button" class="input_button"  value=" 选择人员 " onclick="selectOrganization('specification.reasonBy')"/>
		  </td>
		</tr>							
		<tr height="35"> 
		  <th align="right">修改方案：</th>
		  <td width="75%"><nested:text  property="specification.scheme" value="${specification.scheme}" />  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">签名：</th>
		  <td>
                <nested:text readonly="true"  property="schemeBy" value="${schemeBy}" />
                <nested:hidden  property="specification.schemeBy" value="${specification.schemeBy}"></nested:hidden>                
                <input type="button" class="input_button"  value=" 选择人员 " onclick="selectOrganization('specification.schemeBy')"/>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">单位意见：</th>
		  <td width="75%"><nested:text  property="specification.attitude" value="${specification.attitude}" /> </td>
		</tr>
		<tr height="35"> 
		  <th align="right">签名：</th>
		  <td>
                <nested:text readonly="true" property="attitudeBy" value="${attitudeBy}" />
                <nested:hidden  property="specification.attitudeBy" value="${specification.attitudeBy}"></nested:hidden>                
                <input type="button" class="input_button"  value=" 选择人员 " onclick="selectOrganization('specification.attitudeBy')"/>
		  </td>
		</tr>						
		
		<tr height="35"> 
		  <th align="right">状态：</th>
		  <td width="75%">
		   <logic:equal name="specification" property="status" value="审核">审核</logic:equal>
		  	<logic:equal name="specification" property="status" value="草稿">草稿</logic:equal> 
		  	<logic:equal name="specification" property="status" value="已审核">已审核</logic:equal>
		  	<logic:equal name="specification" property="status" value="管理员审核">管理员审核</logic:equal>
		  	<nested:hidden  property="specification.status" value="${specification.status}"></nested:hidden> 
		  </td>
		</tr>									
	</table>
			
  <div id=bc align=right>
  	<nested:submit  style='input_button' >保 存</nested:submit>
<!--  	<input onclick='alert("数据已保存")' type=button value=' 确 定 ' class='input_button'>-->
  </div><br>
</div> 
</html:form>
</body>
<script>
if(${specification.selectedItem}==1)
	document.getElementsByName("shuyu")[0].checked=true;
if(${specification.selectedItem}==2)
	document.getElementsByName("tongyi")[0].checked=true;
if(${specification.selectedItem}==3){
	document.getElementsByName("shuyu")[0].checked=true;
	document.getElementsByName("tongyi")[0].checked=true;
	}
if(${specification.selectedItem}==4)
	document.getElementsByName("guanxi")[0].checked=true;
if(${specification.selectedItem}==5){
	document.getElementsByName("shuyu")[0].checked=true;
	document.getElementsByName("guanxi")[0].checked=true;
}
if(${specification.selectedItem}==6){
	document.getElementsByName("tongyi")[0].checked=true;
	document.getElementsByName("guanxi")[0].checked=true;
}
if(${specification.selectedItem}==7)
	{
	document.getElementsByName("shuyu")[0].checked=true;
	document.getElementsByName("tongyi")[0].checked=true;
	document.getElementsByName("guanxi")[0].checked=true;
	}
  
</script>
</html>
