<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>
		<title>构件库管理系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">				
		<script src="../js/check.js" type="text/javascript"></script>
		<script src="../js/tab.js" type="text/javascript"></script>
		<link href="../css/tab.css" rel="stylesheet" type="text/css">
		
		<script type="text/javascript">	
			function selectActor(obj){
				location.href="safeControlAction.do?method=searchAuthorizationByActor&Id="+obj.options[obj.selectedIndex].value;	
			}
			function save()
			{
				var modules = document.getElementsByName("tab_module_frame");
				var length = modules.length;
				var authorizationSelected = "";				
				for(var i=0;i<length;i++)
				{
					var authorizations = modules[i].contentWindow.document.getElementsByName("selectedElement");
					var length1 = authorizations.length;
					for(var j=0;j<length1;j++)
					{
						if(authorizations[j].checked == true)
							authorizationSelected += authorizations[j].value + ";";
					}
				}							
				document.getElementById("actorToElementForm").action += "&authorsSelected=" + authorizationSelected;				
				document.getElementById("actorToElementForm").submit();
			}
		</script>		
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>	
	<html:form action="/xitongguanli/safeControlAction?method=modifyAuthorizationToActor&Id=${actorId}">
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					角色权限定义
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="right" width="20%">
					角色名称：
				</td>
				<td width="80%">
				<html:select  onchange="selectActor(this)"  property="id"  value="${actorId}">
					<html:optionsCollection name="actorList"  label = "actorName" value = "actorId"/>
				</html:select>
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		
		<DIV id=macrolong_tabView >		
			<DIV class=macrolong_aTab style="overflow: auto;">				
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=0"></iframe>
			</DIV>
			<DIV class=macrolong_aTab style="overflow: auto;">
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=1"></iframe>
			</DIV>
			<DIV class=macrolong_aTab style="overflow: auto;">
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=2"></iframe>
			</DIV>
			<DIV class=macrolong_aTab style="overflow: auto;">
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=3"></iframe>
			</DIV>			
			<DIV class=macrolong_aTab style="overflow: auto;">
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=4"></iframe>
			</DIV>
			<DIV class=macrolong_aTab style="overflow: auto;">
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=5"></iframe>
			</DIV>
			<DIV class=macrolong_aTab style="overflow: auto;">
				<iframe name="tab_module_frame" frameborder="0" width="100%" height="100%" style="overflow: auto" 
					src="safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=${actorId}&moduleId=6"></iframe>
			</DIV>
		</DIV>
		<br />		
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=page>
			<tr><td>
				<input name="button22" type="button" class="input_button" onClick="save()" value=" 保 存 ">
			</td></tr>
		</table>
	</html:form>	   
      <SCRIPT type=text/javascript>
	    	initTabs(Array('构件发布','构件规约','反馈与交流','系统管理','我的收藏','报表管理','工作流'),0,'100%',300);
  	  </SCRIPT>
	</body>
</html>
</html:html>