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
		
		function selectOrganization(){
			//open_window('OrganizationSelector.htm',600,400);
			open_ModelWindow('OrganizationSelector.htm',600,400,window);
		}
		function save(){
			
			document.getElementById("actorToElementForm").submit();
		}
	
	function w_open(v){
		hid.value = v;
		if (v == 1) {
			if (document.getElementById("sourceId") != null)
				document.getElementById("sourceId").id = "";
			event.srcElement.parentElement.parentElement.parentElement.id = "sourceId";
		}
		open_window('edit.htm',400,300);
	}
</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
	<html:form action="/xitongguanli/safeControlAction?method=modifyActorToOrganization">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					人员角色定义
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<input type="hidden" id="_OrganizationSelector" value="organizationToActor"/>
		<table border=0 width='100%' cellSpacing=6>
			<tr>
				<td align="right" width="20%">
					人员名称：
					<html:hidden property="id" value="${userId}"/>
				</td>
				<td width="80%">
					<span id="_USERNAME" >${userName }</span>
					<input  type="button" class="input_button" onClick="selectOrganization()" value="人员选择">
				</td>
			</tr>
		</table>
		<hr color=#97D2FF>
		<div class=list>
			<table id=ta>
				<tr>
					<th width="12%" height="26">
						<input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('selectedElement')">
					</th>
					<th width="15%">
						角色
					</th>
					<th width="73%">
						角色描述
					</th>
				</tr>
					<logic:iterate id="element" name="allAut">
	
						<tr>
							<td align="center">
								<html:multibox name="actorToElementForm" property="selectedElement" onclick="checkItem('boxa')" >
									<bean:write name="element" property="actorId"/>
					     		</html:multibox>
							</td>
							<td align="center">
								${element.actorName}
							</td>
							<td align="center">
								${element.responsibility}
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
            	  <logic:iterate id="element" name="actorList">
                  	if(theObj1Array[i].value==${element.actorId})theObj1Array[i].checked=true;
                  </logic:iterate> 
              } 
              -->

          </script> 
	</body>
</html>
</html:html>