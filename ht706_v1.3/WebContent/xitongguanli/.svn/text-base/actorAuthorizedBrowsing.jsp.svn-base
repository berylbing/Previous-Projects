<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>
		<title>角色授权查询</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
		function selectActor(obj){
			location.href="safeControlAction.do?method=searchAllByActor&Id="+obj.options[obj.selectedIndex].value;	
		}
		
		</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td align="left">
					角色授权情况查询
				</td>
			</tr>
		</table>
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="right" width="20%">
					角色名称：
				</td>
				<td width="80%">
				<html:select  onchange="selectActor(this)"  property="id"  value="${actorId}">
					<html:optionsCollection name="actorLists"  label = "actorName" value = "actorId"/>
				</html:select>
				</td>
				
				<td align="right" colspan=4>
					
					&nbsp;&nbsp;
					<!--<input type='button' value=' 导 出 ' class="input_button" onclick="excel();">-->
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		<div class=list>
			<html:form action="/xitongguanli/safeControlAction.do?method=searchAllByActor"  >
			<table border="0">
				<tr>
					<th align="center" colspan='1' width="20%">
						角色
					</th>
					<th align="center" colspan='1' width="60%">
						授权情况
					</th>
					
				</tr>
				<logic:iterate id="element" name="actorList" >
					<tr>
						<td align="center">
							${element.actorName}
						</td>
						<td align="center">
						<table>
							<logic:iterate id="item"  name="element" property="actortoauthorizations" >
							<tr>
							<td align="center">
								${item.authorization.name}
							</td>
							<td align="center">
								${item.description }
							</td>
							</tr>
							</logic:iterate>
						</table>
						</td>
					</tr>
					
				</logic:iterate> 
			</table>
			</html:form>
		</div>
	</body>
</html>
</html:html>