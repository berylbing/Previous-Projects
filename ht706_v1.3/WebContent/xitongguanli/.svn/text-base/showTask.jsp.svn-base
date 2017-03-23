<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html:html>
<html>
	<head>
		<title>工作流列表</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<link href="../css/common.css" rel="stylesheet" type="text/css">
		<script src="../js/check.js" type="text/javascript"></script>
	</head>
	<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
			<tr>
				<td>
					工作流配置
				</td>
			</tr>
		</table>	
		<hr color=#97D2FF>
		<div class=list>
		<table border="0">
			<tr>
					<th align="center" colspan='1' width="20%">
						工作流名称
					</th>
					<th align="center" colspan='1' width="30%">
						工作流介绍
					</th>
					<th align="center" colspan='1' width="50%">
						可配置的任务
					</th>
				</tr>
				<logic:iterate id="element" name="taskList">
					<tr>
						<td align="center">${ element.xml }</td>
						<td align="center">${ element.description }</td>
						<td align="center">
						<table>
							<logic:iterate id="e" indexId="ind"  collection="${element.taskList}">
								<tr align="center">
									<td align="center" width="80%">${e}</td>
									<td align="center" width="20%">
										<a href="workflowAction.do?method=preOrganizationTask&task=${e}&xml=${element.xml}" >
										<img src="../images/icon/icon_dianping.gif" width="16" height="16" alt="配置" title="配置" border="0">
										</a>
									</td>
								</tr>
							</logic:iterate>
						</table>
						</td>
					</tr>
					
				</logic:iterate> 
			</table>
		</div>
	</body>
</html>
</html:html>