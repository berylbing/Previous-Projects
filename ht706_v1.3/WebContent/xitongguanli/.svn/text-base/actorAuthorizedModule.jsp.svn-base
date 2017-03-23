<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>		
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">				
		<script src="../js/check.js" type="text/javascript"></script>				
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<div class=list>
			<table id=ta>
				<tr>
					<th width="12%" height="26">
						<input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('selectedElement')">
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
							<html:multibox name="actorToElementForm" property="selectedElement" onclick="checkItem('boxa')">
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