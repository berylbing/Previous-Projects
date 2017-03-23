<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>��������̳</title>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk">
	<link id="css" rel="stylesheet" type="text/css" href="../css/style_common.css" />
	<script src="../js/common.js" type="text/javascript"></script>
</head>
<body>
	<div class="wrap">
 	<div id="foruminfo">
 		<div id="userinfo">
 			<div id="nav">
 				<a href="index.do?method=viewIndex">��������̳</a> &raquo; ��ӭ���٣������� <script type="text/javascript">var date= new Date(); document.write(date.toLocaleString());	</script>
 			</div>
 		</div>	
 	</div>
 	
	<div id="announcement" onmouseover="annstop = 1" onmouseout="annstop = 0">
		<div id="announcementbody">
 			<ul>
			<logic:iterate id="bulletin" name="ForumHomeForm" property="forumBulletinList">	
				<li>
 					<a href="bulletin.do?method=viewBulletin" target="_blank">${bulletin.title}</a><em>(${bulletin.joindate})</em>
 				</li>
 			</logic:iterate>
 			</ul>
 		</div>
	</div>
	<script type="text/javascript">
				var anndelay = 3000;
				var annst = 0;
				var annstop = 0;
				var annrowcount = 0;
				var anncount = 0;
				var annlis = $('announcementbody').getElementsByTagName("LI");
				var annrows = new Array();
				var annstatus;
				function announcementScroll() {
					if(annstop) {
						annst = setTimeout('announcementScroll()', anndelay);
						return;
					}
					if(!annst) {
						var lasttop = -1;
						for(i = 0;i < annlis.length;i++) {
							if(lasttop != annlis[i].offsetTop) {
								if(lasttop == -1) {
									lasttop = 0;
								}
								annrows[annrowcount] = annlis[i].offsetTop - lasttop;
								annrowcount++;
							}
							lasttop = annlis[i].offsetTop;
						}
						if(annrows.length == 1) {
							$('announcement').onmouseover = $('announcement').onmouseout = null;
						} else {
							annrows[annrowcount] = annrows[1];
							$('announcementbody').innerHTML += '<br style="clear:both" />' + $('announcementbody').innerHTML;
							annst = setTimeout('announcementScroll()', anndelay);
						}
						annrowcount = 1;
						return;
					}
					if(annrowcount >= annrows.length) {
						$('announcementbody').scrollTop = 0;
						annrowcount = 1;
						annst = setTimeout('announcementScroll()', anndelay);
						} else {
						anncount = 0;
						announcementScrollnext(annrows[annrowcount]);
					}
				}
				function announcementScrollnext(time) {
					$('announcementbody').scrollTop++;
					anncount++;
					if(anncount != time) {
						annst = setTimeout('announcementScrollnext(' + time + ')', 10);
					} else {
						annrowcount++;
						annst = setTimeout('announcementScroll()', anndelay);
					}
				}
			</script>
			<script type="text/javascript">announcementScroll();</script>
	<div class="mainbox forumlist">
		<h3>
			��������̳
		</h3>
		<table cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<th>
						��̳
					</th>
					<td class="num">
						����/����
					</td>
					<td class="last">
						��󷢱�
					</td>
				</tr>
			</thead>
			<tbody>
				<logic:iterate id="forum" name="ForumHomeForm" property="forumForumList" >
				<tr>
						<th class="normal">
							<a href="forum.do?method=viewForum&forumId=${forum.forumid}" class="name" style="color:${forum.color}">${forum.forumname}</a>
							<p class="moderators">${forum.forumread}</p>
						</th>	
						<td class="num"> 
								${forum.topicnum } /${forum.postnum }
						</td>
						<td>
							<logic:notEqual name="forum" property="topicnum" value="0">
								<p>
									<a href="topic.do?forumId=${forum.forumid}&topicId=${forum.topicid}">${forum.topicname}</a>
								</p>
								<p class="moderators">
									By: <a href="#">${forum.username }</a> - <span class="time">${forum.posttime }</span>
								</p>
							</logic:notEqual>
							<logic:equal name="forum" property="topicnum" value="0">
								<p>
									����
								</p>
							</logic:equal>
					</td>
				</tr>
				</logic:iterate>
			</tbody>
		</table>	
		</div>
 	</div>
</body>
</html>