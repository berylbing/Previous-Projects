<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<title>整理收藏夹操作</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>
	function del(v)
	{
		if(v=='null'){			
				alert("请选择一个文件夹");
		}else
		{
			if(!confirm("确认删除此记录吗?")) return;
				location.href="../myFavorite/OperateOfMyFavoriteAction.do?method=deleteMyFavoriteAction&nodeId="+v;
		}
			
	}
	
	function modify(v)
	{
		if(v=='null'){
			alert("请选择一个文件夹");
		}else
		{
			location.href="../myFavorite/OperateOfMyFavoriteAction.do?method=editMyFavoriteAction&nodeId="+v;
		}
	
	}
</script>
<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody onload="window.parent.frames.leftFrame.location.reload()">
<html:form action="/myFavorite/OperateOfMyFavoriteAction.do" method="post">	

<br>
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>整理收藏夹</td>
	</tr>
</table>
<input type="hidden" name="hid">
<div class=list>
  <table border="0" align="center">
  <%String nodeId=(String)request.getParameter("nodeId"); %>
    <tr>
    <th>
      <input onclick="location.href='../myFavorite/OperateOfMyFavoriteAction.do?method=addMyFavoriteAction'" type='button' value='添加收藏夹' class="input_button">
    </th>
    </tr>
    <tr>
    <th>
    <input onclick="del('<%=nodeId %>')" type='button' value='删除收藏夹' class="input_button">
    </th>
    </tr>
    <tr>
    <th>
      <input onclick="modify('<%=nodeId %>')" type='button' value='修改收藏夹' class="input_button">
    </th>
    </tr>
            
 </table>
</div>
</html:form>
</body>
</html>

