<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>

	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
		<title>构件库管理系统</title>
		
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
		<script  language="javascript" type="text/javascript">
		var href = "";
		function deltr(){
			document.getElementById("ActorForm").submit();
		}
		function create(){
			location.href = "createActor.jsp";
		}
		function checkIsDeleted(id){
			href = "actorAction.do?method=deleteActor&Id=" + id; 		
	 		url = "actorAction.do?method=checkIsDeleted&Id="+id;
	 		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	 		xmlhttp.onreadystatechange=processor;
	 		xmlhttp.open("post",url);
	 		xmlhttp.send(null);	 		
	 	}
	 	function processor(){
	 		if(xmlhttp.readyState==4)
	 			if(xmlhttp.status==200){		 					 			
	 				if(xmlhttp.responseText == "error")
	 				    if (!confirm("该角色已被分配给用户，确认要删除？")) {	
			 			    return;
	 			        }
	 				location.href = href;
	 			}
	 	}	
		
		</script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					角色定义
				</td>
			</tr>
		</table>
		<input type="hidden" name="hid">
		<div class=list>
		 <html:form action="/xitongguanli/actorAction.do?method=deleteActor"  > 
			<table id=ta>
				<tr>					
					<th width="20%">
						名称
					</th>
					<th width="53%">
						角色职责
					</th>
					<th width="15%">
						编辑
					</th>
				</tr>
					<logic:iterate id="element" name="actorList">
	
						<tr>							
							<td align="center">
								${element.actorName}
							</td>
							<td align="center">
								${element.responsibility}
							</td>
							<td align="center">
								<a href="actorAction.do?method=preActorForm&Id=${element.actorId}" ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
										border="0">
								</a>
								<a href="#" onclick="checkIsDeleted('${element.actorId}');"><img src="../images/icon/del.gif" width="16" height="16"
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
					<input name="button22" type="button" class="input_button" onClick="create()" value=" 新 建 ">
					<!--<input name="button2" type="button" class="input_button" onClick="deltr()" value=" 删 除 ">
				--></td>
			</tr>
		</table>
	</body>
</html:html>
