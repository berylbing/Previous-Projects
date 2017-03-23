<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>
		<title>Ȩ�޷��������ѯ</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script>
		function selectModule(obj){
			location.href="safeControlAction.do?method=searchAllByAuthorization&ModuleId="+obj.options[obj.selectedIndex].value;	
		}
		function selectAuthorization(obj){
			var module = document.getElementsByName("_module")[0].value;
			location.href="safeControlAction.do?method=searchAllByAuthorization&Id="+obj.options[obj.selectedIndex].value + "&ModuleId=" + module;	
		}
		
		</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td align="left">
					Ȩ����Ȩ�����ѯ
				</td>
			</tr>
		</table>
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="right" width="10%">
					ģ�����ƣ�
				</td>
				<td  width="20%">
					<html:select  onchange="selectModule(this)"  property="_module"  value="${moduleId}">
						<html:option value="-1" >����ģ��</html:option>
						<html:option value="0" >��������</html:option>
						<html:option value="1" >������Լ</html:option>
						<html:option value="2" >�����뽻��</html:option>
						<html:option value="3" >ϵͳ����</html:option>
						<html:option value="4" >�ҵ��ղ�</html:option>
						<html:option value="5" >�������</html:option>
						<html:option value="6" >������</html:option>
					</html:select>
				</td>
				<td align="right" width="10%">
					Ȩ�����ƣ�
				</td>
				<td width="30%">
					<html:select  onchange="selectAuthorization(this)"  property="id"  value="${Id}">
						<html:optionsCollection name="authorizationSelectList"  label = "name" value = "authorizationId"/>
					</html:select>
				</td>
				
				<td align="right" colspan=4>
					
					&nbsp;&nbsp;
					<!--<input type='button' value=' �� �� ' class="input_button" onclick="excel();">-->
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		<div class=list>
			<html:form action="/xitongguanli/safeControlAction.do?method=searchAllByAuthorization"  >
			<table border="0">
				<tr>
					<th align="center" colspan='1' width="20%">
						Ȩ������
					</th>
					<th align="center" colspan='1' width="60%">
						��Ȩ���
					</th>
					
				</tr>
				<logic:iterate id="element" name="authorizationList" >
					<tr>
						<td align="center">
							${element.name}
						</td>
						<td align="center">
						<table>
							<logic:iterate id="item"  name="element" property="actortoauthorizations" >
							<tr>
							<td align="center">
								${item.actor.actorName}
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