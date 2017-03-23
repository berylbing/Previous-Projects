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
	<title>构件库论坛</title>
	<link rel="stylesheet" type="text/css" href="../css/style_common.css" />
	<script src="../js/common.js" type="text/javascript"></script>
</head>
<body>
	<div class="wrap">
		<div id="foruminfo">
 			<div id="userinfo">
 				<div id="nav">
 					<a href="index.do?method=adminIndex">管理首页</a> &raquo;
 					管理论坛帖子
 				</div>
 			</div>	
 		</div>
			<logic:notEmpty name="ForumForumForm" property="forumForum.rule">
			<table class="portalbox" cellpadding="0" cellspacing="1">
				<tr>
					<td>
						<h3>
							本版规则
						</h3>
						<bean:write name="ForumForumForm" property="forumForum.rule"></bean:write>
					</td>
				</tr>
			</table>
			</logic:notEmpty>
			
			<div class="mainbox threadlist">
				<h3>
					<bean:write name="ForumForumForm" property="forumForum.forumname"/>
				</h3>
				<table cellspacing="0" cellpadding="0" >
					<thead>
						<tr>
							<td class="folder">
								&nbsp;
							</td>
							<td class="icon">
								&nbsp;
							</td>
							<th class="title" >
								标题
							</th>
							<td class="author">
								作者
							</td>
							<td class="nums">
								回复/查看
							</td>	
							<td class="lastpost">
								操作
							</td>

						</tr>
					</thead>

					
					<tbody class="topic">
						<logic:iterate id="topic"name="ForumForumForm" property="topicList">
						<tr>
							<td class="folder">
								<a href="topic.do?forumId=${topic.forumid }&topicId=${topic.topicid}" title="新窗口打开" target="_blank"><img src="../images/forum/icon/common.gif" /></a>
							</td>
							<td class="icon">
								&nbsp;
							</td>
							<th>
								<span>
									<a href="topic.do?forumId=${topic.forumid }&topicId=${topic.topicid}"><span>${topic.topicname}</span></a>
								</span>
							</th>
							<td class="author">
								<br><a>${topic.username }</a><br/>
								<em>${topic.posttime}</em>
							</td>
							<td class="nums">
								<font color=#000000>${topic.replynum }</font> / <em>${topic.hitnum }</em>
							</td>
							<td class="lastpost">
								<a href="forum.do?method=deleteTopic&forumId=${topic.forumid }&topicId=${topic.topicid}" class="name" style="color:${forum.color}" >删除</a>
							</td>
						</tr>
						</logic:iterate>
					</tbody>		
				</table>
		</div>
	</div>
</body>
</html>