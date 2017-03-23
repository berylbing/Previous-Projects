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
		function create(){
			  location.href = "FacetAction.do?method=preCreateFacet&Idf=<bean:write name="facetss" property="id.facetUuid"/>&Ids=<bean:write name="facetss" property="id.specification.specUuid"/>&select=${select}";
		}
		function modify(){
			  location.href = "FacetAction.do?method=preFacetForm&Idf=<bean:write name="facetss" property="id.facetUuid"/>&Ids=<bean:write name="facetss" property="id.specification.specUuid"/>&select=${select}";
		}
		function deltr() {
			if(confirm("确定删除此结点吗?"))
				location.href = "FacetAction.do?method=deleteFacet&Idf=<bean:write name="facetss" property="id.facetUuid"/>&Ids=<bean:write name="facetss" property="id.specification.specUuid"/>&select=${select}";
		}
	
</script>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<br>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">名称：</th> 
		  <td width="75%"><bean:write name="facetss" property="name"/></td>
		</tr>
		
		<tr height="35"> 
		  <th align="right">节点类型：</th>
		  <td>
                <bean:write name="facetss" property="nodeType"/>
		  </td>
		</tr>
		
		<tr height="35"> 
		  <th align="right">父节点：</th>
		  <td>
		       <logic:notEqual name="facetss" property="parentNode" value="-1">
					${parent}
				</logic:notEqual>
		  </td>
		</tr>	
		<tr height="35"> 
		  <th align="right">发布类型：</th>
		  <td>
				<logic:equal name="facetss" property="releaseType" value='${1}'>内部发布</logic:equal>
				<logic:equal name="facetss" property="releaseType" value='${0}'>全局发布</logic:equal> 
		  </td>
		</tr>							
		<tr height="35"> 
		  <th align="right">节点说明：</th>
		  <td><bean:write name="facetss" property="description"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">最后修改时间：</th>
		  <td width="75%">
		  ${createtime}
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
		  <td>${facetss.id.specification.version}</td>
		</tr>									
	</table>
  <div id=bc align=right>
  	<input name="button22" type="button" class="input_button" onClick="create()" value=" 新 建 ">
	<input name="button22" type="button" class="input_button" onClick="modify()" value=" 修改">
	<logic:notEqual name="facetss" property="parentNode" value="-1">
		<input name="button2" type="button" class="input_button" onClick="deltr()" value=" 删 除 ">
	</logic:notEqual>
  </div>

</div> 
</body>
</html>
