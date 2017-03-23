<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
	<head>
		<title>构件库管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
	function deltr() {
		document.getElementById("AuthorizationForm").submit();
	}
	
	function create(v){
		location.href = "createAuthorization.jsp";
	}
	function selectModule(obj){
		location.href="authorizationAction.do?method=listAuthorization&ModuleId="+obj.options[obj.selectedIndex].value;	
	}	
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					权限定义
				</td>
			</tr>
		</table>
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="right" width="20%">
					模块名称：
				</td>
				<td width="80%">
					<html:select  onchange="selectModule(this)"  property="id"  value="${moduleId}">
						<html:option value="-1" >所有模块</html:option>
						<html:option value="0" >构件发布</html:option>
						<html:option value="1" >构件规约</html:option>
						<html:option value="2" >反馈与交流</html:option>
						<html:option value="3" >系统管理</html:option>
						<html:option value="4" >我的收藏</html:option>
						<html:option value="5" >报表管理</html:option>
						<html:option value="6" >工作流</html:option>
					</html:select>
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<div class=list>
		 <html:form action="/xitongguanli/authorizationAction.do?method=deleteAuthorization"  > 
			<table id=ta>
				<tr>					
					<th width="20%">
						名称
					</th>
					<th width="53%">
						描述
					</th>
					<th width="15%">
						修改
					</th>
				</tr>
					<logic:iterate id="element" name="authorizationList">	
						<tr>							
							<td align="center">
								${element.name}
							</td>
							<td align="center">
								${element.description}
							</td>
							<td align="center">
								<a href="authorizationAction.do?method=preAuthorizationForm&Id=${element.authorizationId}" ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
										border="0">
								</a>
							</td>
						</tr>
	
					</logic:iterate> 
				
			</table>
		</html:form>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=page>
			<tr>
				<td>
					<!--<input name="button22" type="button" class="input_button" onClick="create(0)" value=" 新 建 ">
					<input name="button2" type="button" class="input_button" onClick="deltr()" value=" 删 除 ">
					-->
				</td>
			</tr>
		</table>
	</body>
</html:html>
