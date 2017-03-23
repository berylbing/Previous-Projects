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
	function deltr() {
		var trs = document.getElementsByName("boxi");
		var flag = 0;
		for (var i=0; i<trs.length; i++) {
			if (trs[i].checked) {
				flag = 1;
				break;
			}
		}
		if (flag==0) {
			alert("请选择您要删除的项目！");
			return false;
		}
		var ve = ta.all.tags("tr");
		for (var i=0; i<trs.length; i++) {
			if (trs[i].checked) {
				ve[i+1].removeNode(true);
				i--;
			}
		}
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
	
	function n_open(IndexId, path){
		if(document.getElementById("standardFeedbackItem.itemName").value == "")
		{
			alert("请填写项名称");
			return;
		}
		if(document.getElementById("standardFeedbackItem.scoreStandard").value == "")
		{
			alert("请填写分值");
			return;
		}
		if(/^\d*(\.\d*)?$/.test(document.getElementById("standardFeedbackItem.scoreStandard").value) == false)
		{
			alert("请填写正确的分值");
			return;
		}
		if(document.getElementById("standardFeedbackItem.detail").value == "")
		{
			alert("请填写评分细则");
			return;
		}
		
		var actionPath = path + "/componentFeedBack/standardFeedback.do?method=modifyStandardFeedbackItemForEdit&IndexId=" + IndexId;
		document.getElementById("StandardFeedbackForm_Edit").action = actionPath;
		document.getElementById("StandardFeedbackForm_Edit").submit();
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

	<html:form method="post" action="/componentFeedBack/standardFeedback.do?method=modifyStandardFeedbackItemForEdit">
		<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
			<!-- 
			<tr height="35"> 
			  <th align="right" width="35%">项编号：</th>
			  <td width="65%"><nested:write name="standardFeedbackItem" property="itemId"/></td>
			</tr>	
			 -->
			<tr height="35"> 
			  <th align="right" width="35%">项名称：</th>
			  <td width="65%"><nested:text property="standardFeedbackItem.itemName" value="${standardFeedbackItem.itemName}"/></td>
			</tr>
			<tr height="35"> 
			  <th align="right">所属项分类：</th>
			  <td>
	                <html:select name="sx" property="itemFunctionID" value="${standardFeedbackItem.itemFunction.id}">			
						<html:optionsCollection name="itemFunctionList"  label = "funcName" value = "id"/>			
			        </html:select>
			  </td>
			</tr>			
			<tr height="35"> 
			  <th align="right">分值：</th>
			  <td><nested:text property="standardFeedbackItem.scoreStandard" value="${standardFeedbackItem.scoreStandard}"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right">评分细则：</th>
			  <td><nested:text property="standardFeedbackItem.detail" value="${standardFeedbackItem.detail}"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right">备注：</th>
			  <td><nested:text property="standardFeedbackItem.description" value="${standardFeedbackItem.description}"/></td>
			</tr>												
		</table>
	
        <div id=bc align=right>
        <input name="button23" type="button" class="input_button" value=" 保 存 " onclick="n_open(${IndexId},'${pageContext.request.contextPath}')">
	 <!--  <input name="button22" type="submit" class="input_button"  value=" 保 存 ">--> 
        </div><br>
    </html:form>
  </div>  

</body>
</html>
