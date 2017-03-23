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
<script src="js/common.js" type="text/javascript"></script>
<title>构件库论坛</title>
</head>
<body>
	<div class="wrap">
			<div id="forumInfo">
				<div id="userInfo">
					<div id="nav">
						<a href="index.do?method=adminIndex">管理首页</a> &raquo; 
						管理公告信息
					</div>
				</div>
			</div>
			<div class="box">
				<logic:iterate id="bulletin" name="ForumBulletinForm" property="forumBulletinList">
					<div class="announcements">
						<div class="announcementinfo">
							<span>${bulletin.title }</span> b#${bulletin.bulletinid}&nbsp;作者: ${bulletin.username} &nbsp; 起始时间: ${bulletin.joindate }
							&nbsp; 
							<a href="bulletin.do?method=deleteBulletin&bulletinId=${bulletin.bulletinid }">删除公告</a>
						</div>
						<div class="announcementmessage">
							${bulletin.content }
						</div>
					</div>
				</logic:iterate>
			</div>
			<div class="managelink">
				<a href="postBulletin.jsp" >发布新公告</a>
			</div>
		</div>
</body>
</html>