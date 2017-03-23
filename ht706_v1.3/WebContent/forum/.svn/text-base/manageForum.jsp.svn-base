<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/style_common.css" />
<script src="js/common.js" type="text/javascript"></script>
<title>构件库论坛</title>
</head>
<body>
	<div class="wrap">
 	<div id="foruminfo">
 		<div id="userinfo">
 			<div id="nav">
 				<a href="index.do?method=adminIndex">管理首页</a> &raquo;
 				管理构件论坛
 			</div>
 		</div>	
 	</div>
 	<div class="mainbox forumlist">
		<h3>
			构建件论坛
		</h3>
		<table cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<th>
						论坛
					</th>
					<td>
						论坛说明
					</td>
					<td>
						主题/帖子
					</td>
					<td>
						论坛颜色
					</td>
					<td>
						操作
					</td>
				</tr>
			</thead>
			<tbody>
				<logic:iterate id="forum" name="ForumHomeForm" property="forumForumList" >
				<tr>
						<th class="normal">
							<a href="forum.do?method=viewForum&forumId=${forum.forumid}" class="name" style="color:${forum.color}" target="_blank">${forum.forumname}</a>
						</th>
						<td>
							${forum.forumread}
						</td>	
						<td> 
							${forum.topicnum}/${forum.postnum}
						</td>
						<td>
							${forum.color}
						</td>
						<td>
							<a href="forum.do?method=preModifyForum&forumId=${forum.forumid}">修改</a>
							<a href="forum.do?method=deleteForum&forumId=${forum.forumid}">删除</a>
						</td>
				</tr>
				</logic:iterate>
			</tbody>
			</table>
 		</div>
 		<div class="managelink">
				<a href="newForum.jsp" >创建新论坛</a>
		</div>
 	</div>
</body>
</html>