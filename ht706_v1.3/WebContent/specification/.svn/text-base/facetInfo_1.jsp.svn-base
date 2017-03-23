<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/calendar.js" type="text/javascript"></script>
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
	
	function save(){
		var name = document.getElementsByName("facet.name")[0].value;
		if(name=="")
		{
			alert("请填写刻面名称！ ");
			return false;
		}
		document.getElementById("facetListForm").submit();
		return true;
	}	
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<br>
<html:form action="/specification/FacetAction?method=createFacet" method="POST">
<nested:hidden property="facetpids" value="${facet.id.facetUuid}"></nested:hidden>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">名称：</th>
		  <td width="75%">
		  <nested:text property="facet.name" value="" size="50"></nested:text>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">节点类型：</th>
		  <td>
                <bean:write name="facet" property="nodeType"/>
                <nested:hidden property="nodetype" value="${facet.nodeType}"></nested:hidden>
		  </td>
		</tr>
		<tr height="35"> 
		  <th align="right">父节点：</th>
		  <td>
		        <logic:notEqual name="facet" property="name" value="-1">
					<bean:write name="facet" property="name"/>
				</logic:notEqual>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">发布类型：</th>
		  <td>
		  		<html:radio property="facet.releaseType"   value="0">全局发布</html:radio>
				<html:radio property="facet.releaseType"   value="1">内部发布</html:radio> 
		  </td>
		</tr>	
								
		<tr height="35"> 
		  <th align="right">节点说明：</th>
		  <td>
		  	<nested:text property="facet.description" value="" size="50"></nested:text>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">最后修改时间：</th>
		  <td width="75%">
			<html:text property="createtime" value="${createtime}"  readonly="true" onfocus="calendar(this,null,null,null)" size="40"></html:text>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">创建者：</th>
		  <td width="75%">
		  ${creator}
		  </td>
		 </tr>
		<tr height="35"> 
		  <th align="right">所属规约：</th>
		  <td>${facet.id.specification.version}</td>
		</tr>	
		<nested:hidden property="facetids" value="${facetids}"></nested:hidden>
	</table>
  <div id=bc align=right>
  	<input onclick='save()' type=button value=' 保 存 ' class='input_button'>
  </div><br>

</div> 
</html:form>
</body>
<script>
	document.all("facet.releaseType")[1].checked=true;
</script>
</html>
