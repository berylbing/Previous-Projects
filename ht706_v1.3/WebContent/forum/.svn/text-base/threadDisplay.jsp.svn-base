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
		<link rel="stylesheet" type="text/css" href="../css/style_viewthread.css" />
		<script src="../js/common.js" type="text/javascript"></script>
		<style type="text/css">
		/* 标题栏样式 */
		.mainbox {border: 1px solid #CAD9EA; padding: 0px; margin-bottom: 10px;} /* 定义 边框 内边距 底外边距 */
			.mainbox h3{ line-height:20px; padding-left:1em;background: #409bdd url("../images/forum/header_head.gif"); background-repeat: repeat-x; background-position: 0 0; color: #FFF;}
			.mainbox table { width: 100%; }
			.mainbox tbody th, .mainbox tbody td { border-top: 1px solid #CAD9EA; padding: 5px; }
			.mainbox tbody cite, .mainbox tbody em { line-height: 1.3em; }
			.viewthread {padding-bottom: 1px;}
		</style>
</head>
<body>
<% int floor=0; %>
	<div class="wrap">
			<div id="foruminfo">
				<div id="userinfo">
					<div id="nav">
						<a href="index.do?method=viewIndex">构件库论坛</a> &raquo; <a href="forum.do?method=viewForum&forumId=${ForumTopicForm.forumForum.forumid}">
						<bean:write name="ForumTopicForm" property="forumForum.forumname"></bean:write></a>
						 &raquo; <bean:write name="ForumTopicForm" property="forumTopic.topicname"/>
					</div>
				</div>
			</div>
		<div class="forumcontrol">
			<table cellspacing="0" cellpadding="0">
				<tr>		
					<td width="100%">
					</td>
					<td align="left" width="100%">
						<span class="replybtn"> 
							<a  title="发新回复" href="editThread.do?forumId=${ForumTopicForm.forumForum.forumid}&topicId=${ForumTopicForm.forumTopic.topicid}"><img src="../images/forum/icon/reply.gif" alt="发新话题" /></a>&nbsp;&nbsp; 
						</span>
						<span class="postbtn">
							<a title="发表主题" href="editTopic.do?forumId=${ForumTopicForm.forumForum.forumid}" id="newspecial"><img src="../images/forum/icon/newtopic.gif" alt="发表主题" /></a>
						</span>
					</td>
				</tr>
			</table>
		</div>
		
		<div class="mainbox viewthread">
		
			<h3>标题 :${ForumTopicForm.forumTopic.topicname }
			</h3>
			<logic:iterate id="thread" name="ForumTopicForm" property="forumThreadList">
				<table cellspacing="0" cellpadding="0">
					<tr>
						<td class="postauthor">
							<cite> 
								<a href="" target="_blank">${thread.username}</a>
							</cite>
						
							<div class="avatar">
								<img src="../images/forum/userhead/man06.gif" />
							</div>
						<p>
								<em></em>
							</p>
<!--							<dl class="profile">-->
<!--								<dt>-->
<!--									帖子-->
<!--								</dt>-->
<!--								<dd>-->
<!--									&nbsp;-->
<!--								</dd>-->
<!--								<dt>-->
<!--									精华-->
<!--								</dt>-->
<!--								<dd>-->
<!--									&nbsp;-->
<!--								</dd>-->
<!--								<dt>-->
<!--									积分-->
<!--								</dt>-->
<!--								<dd>-->
<!--									&nbsp;-->
<!--								</dd>-->
<!--								<dt>-->
<!--									注册时间-->
<!--								</dt>-->
<!--								<dd>-->
<!--									&nbsp;-->
<!--								</dd>-->
<!--							</dl>-->
						</td>
						<td class="postcontent">
							<div class="postinfo">
								<strong><%=++floor%></strong>
								发表于${thread.posttime}&nbsp;
							</div>
							<div class="postmessage defaultpost">
							<%
									if(floor==1){
							%>
								<h2>
									${ForumTopicForm.forumTopic.topicname }
								</h2>
							<%
									}
							%>
								<div class="t_msgfont">
									${thread.content }
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td class="postauthor">
						</td>
						<td class="postcontent">
							<div class="postactions">
								<p>
									<strong onclick="scroll(0,0)" title="顶部">TOP</strong>
								</p>
							</div>
						</td>
					</tr>
				</table>
			</logic:iterate>
		</div>
		<div class="forumcontrol">
			<table cellspacing="0" cellpadding="0">
				<tr>		
					<td width="100%">
					</td>
					<td align="left" width="100%">
						<span class="replybtn"> 
							<a  title="发新回复" href="editThread.do?forumId=${ForumTopicForm.forumForum.forumid}&topicId=${ForumTopicForm.forumTopic.topicid}"><img src="../images/forum/icon/reply.gif" alt="发新话题" /></a>&nbsp;&nbsp; 
						</span>
						<span class="postbtn">
							<a title="发表主题" href="editTopic.do?forumId=${ForumTopicForm.forumForum.forumid}" id="newspecial"><img src="../images/forum/icon/newtopic.gif" alt="发表主题" /></a>
						</span>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>