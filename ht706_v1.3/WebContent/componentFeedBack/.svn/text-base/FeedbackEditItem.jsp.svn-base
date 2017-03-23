<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<html>
<head>
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>

	function n_open(iId, path,recordId){
		if(document.getElementById("feedbackItem.itemName").value == "")
		{
			alert("请填入名称");
			return;
		}
		if(document.getElementById("feedbackItem.scoreStandard").value == "")
		{
			alert("请填入标准分");
			return;
		}
		if(/^\d*(\.\d*)?$/.test(document.getElementById("feedbackItem.scoreStandard").value) == false)
		{
			alert("请填入正确的标准分");
			return;
		}
		if(document.getElementById("feedbackItem.detail").value == "")
		{
			alert("请填入评分细则");
			return;
		}
		if(document.getElementById("feedbackItem.score").value == "")
		{
			var std = Number(document.getElementById("feedbackItem.scoreStandard").value);
			var mine = std * 0.8;
			document.getElementById("feedbackItem.score").value = mine + "";
		}
		else if(/^\d*(\.\d*)?$/.test(document.getElementById("feedbackItem.score").value) == false)
		{
			alert("请填入正确的得分");
			return;
		}
		if(parseFloat(document.getElementById("feedbackItem.scoreStandard").value) < parseFloat(document.getElementById("feedbackItem.score").value)) 
		{
			alert("请填入正确的得分");
			return;
		}	
		
		var actionPath = path + "/componentFeedBack/feedback.do?method=modifyFeedbackItem&itemId=" + iId + "&recordId=" + recordId;
		document.getElementById("FeedbackForm").action = actionPath;
		document.getElementById("FeedbackForm").submit();
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>编辑反馈项</td>
  </tr>
</table>
  
<input type="hidden" name="hid">

<div class=editblock >

	<html:form method="post" action="/componentFeedBack/feedback.do?method=modifyFeedbackItem">
		<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">

			<tr height="35"> 
			  <th align="right" width="35%">项名称：</th>
			  <td width="65%"><nested:text property="feedbackItem.itemName" value="${feedbackItem.itemName}"/></td>
			</tr>
			<tr height="35"> 
			  <th align="right">所属项分类：</th>
			  <td>
	              <html:select name="sx" property="itemFunctionID" value="${feedbackItem.itemFunction.id}">			
						<html:optionsCollection name="itemFunctionList"  label = "funcName" value = "id"/>			
			      </html:select>
			  </td>
			</tr>			
			<tr height="35"> 
			  <th align="right">分值：</th>
			  <td><nested:text property="feedbackItem.scoreStandard" value="${feedbackItem.scoreStandard}"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right">评分细则：</th>
			  <td><nested:text property="feedbackItem.detail" value="${feedbackItem.detail}"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right">备注：</th>
			  <td><nested:text property="feedbackItem.description" value="${feedbackItem.description}"/></td>
			</tr>
			<tr height="35"> 
			  <th align="right">得分：</th>
			  <td><nested:text property="feedbackItem.score" value="${feedbackItem.score}"/></td>
			</tr>													
		</table>
	
        <div id=bc align=right>
        <input name="button23" type="button" class="input_button" value=" 保 存 " onclick="n_open(${feedbackItem.itemId},'${pageContext.request.contextPath}','${recordId}')">
        </div><br>
    </html:form>
  </div>  

</body>
</html>
