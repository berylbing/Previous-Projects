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
		<script>
		
		function selectActor(obj){
			location.href="safeControlAction.do?method=searchAuthorizationByActor&Id="+obj.options[obj.selectedIndex].value;	
		}
		function save(){
			
			document.getElementById("actorToElementForm").submit();
		}
	
	
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	<html:form action="/xitongguanli/safeControlAction?method=modifyAuthorizationToActor">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					URL分配
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="left" width="20%">
					权限名称：
				</td>
				<td width="80%">
				<html:select  onchange="selectActor(this)"  property="id"  value="${actorId}">
					<html:optionsCollection name="actorList"  label = "actorName" value = "actorId"/>
				</html:select>
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		<div class=list>
			<table id=ta>
				<tr>
					<th width="12%" height="26">
						<input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('boxi')">
					</th>
					<th width="15%">
						权限
					</th>
					<th width="73%">
						权限描述
					</th>
				</tr>
					<logic:iterate id="element" name="allAut">
	
						<tr>
							<td align="center">
								<html:multibox name="actorToElementForm" property="selectedElement"  >
									<bean:write name="element" property="authorizationId"/>
					     		</html:multibox>
							</td>
							<td align="center">
								${element.name}
							</td>
							<td align="center">
								${element.description}
							</td>
						</tr>
					</logic:iterate> 
				
			</table>
		</div>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=page>
			<tr>
				<td>
					<input name="button22" type="button" class="input_button" onClick="save()" value=" 保 存 ">
				</td>
			</tr>
		</table>
	</html:form>
	   <script type="text/javascript">

              <!--

            var theObj1Array;
              theObj1Array = 

            	  document.getElementsByName( "selectedElement");
              for(var   i=0;i <theObj1Array.length;i++) 
              { 
            	  theObj1Array[i].checked=false;
            	  <logic:iterate id="element" name="actorToauthorizationList">
                  	if(theObj1Array[i].value==${element.authorizationId})theObj1Array[i].checked=true;
                  </logic:iterate> 
              } 
              -->

          </script> 
	</body>
</html>
</html:html>