<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link rel="stylesheet" type="text/css" href="../css/style_common.css" />
	<script src="../js/common.js" type="text/javascript"></script>
<title>构件库论坛</title>
</head>
<script type="text/javascript">
		
			function postCheck(){
				if(document.getElementById("forumForum.forumname").value==""){
					alert("请输入论坛名称");
					return;
					}
				else if(document.getElementById("forumForum.forumread").value==""){
					alert("请输入论坛说明");
					return;
					}
				else
					document.getElementById("ForumForumForm").submit();
			}
			
			function trim(string){
  			 return string.replace(/\s/g,"");
 			}
	</script>
<body>
	<div class="wrap">
 	<div id="foruminfo">
 		<div id="userinfo">
 			<div id="nav">
 				<a href="index.do?method=adminIndex">管理首页</a> &raquo;
 				<a href="index.do?method=manageForumList">管理构件论坛</a> &raquo;
 				修改论坛
 			</div>
 		</div>	
 	</div>
 	<html:form action="/forum/forum.do?method=modifyForum" method="post">
 	<div class="mainbox forumlist">
		<h3>
			构件库论坛
		</h3>
		<table cellspacing="0" cellpadding="0">
				<tr>
					<th>
						论坛名称
					</th>
					<td>
						<nested:hidden property="forumForum.forumid" value="${ff.forumid}"></nested:hidden>
						<nested:text property="forumForum.forumname" value="${ff.forumname}"></nested:text>
					</td>
				</tr>
				<tr>
					<th>
					   	 论坛说明
					</th>
					<td>
						<nested:text property="forumForum.forumread" value="${ff.forumread}"></nested:text>
					</td>
				</tr>
				<tr>	
					<th>
						论坛颜色
					</th>	
					<td>
						<html:select   property="forumForum.color"  value="${ff.color}">
						<html:option value="black" >黑色</html:option>
						<html:option value="red" >红色</html:option>
						<html:option value="green" >绿色</html:option>
						<html:option value="yellow" >黄色</html:option>
						<html:option value="blue" >蓝色</html:option>
						</html:select>	
					</td>
				</tr>
				<tr>
					<th>
						论坛规则
					</th>
					<td>
						<nested:textarea property="forumForum.rule" value="${ff.rule}"></nested:textarea>
					</td>
				</tr>
			<tr class="btns">
				<th>
					&nbsp;
				</th>
					<td>
						<button type="button" name="forumsubmit" id="postsubmit" onclick="postCheck()">
							保存
						</button>
					</td>
			</tr>
			</table>
 		</div>
 		</html:form>
 	</div>
</body>
</html>