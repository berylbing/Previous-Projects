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
<title>构件库论坛</title>
	<script type="text/javascript">
		
			function postCheck(){
				if(document.getElementById("title").value==""){
					alert("请输入标题!");
					return false;
				}
				if(document.getElementById("content").value==""){
					alert("请输入内容!");
					return false;
				}
				document.getElementById("ForumBulletinForm").submit();
			}
			
	</script>
</head>
<body>
	<div class="wrap">
 		<div id="foruminfo">
 			<div id="userinfo">
 				<div id="nav">
 					<a href="index.do?method=adminIndex">管理首页</a> &raquo; 
 					<a href="bulletin.do?method=manageBulletin">管理公告信息</a> &raquo;
 					发布新公告 
 				</div>
 			</div>	
 		</div>
 		<html:form action="/forum/bulletin.do?method=publishBulletin" method="post">
 		<div class="mainbox">
 			<h3>
 				发布新公告
 			</h3>
 			<table cellspacing="0" cellpadding="0">
				<tr height="35"> 
		  			<th align="right" width="25%"><b>公告标题:</b></th>
		  			<td width="75%"><html:text property="title" name="ForumBulletinForm"/></td>
				</tr>
				<tr height="35"> 
		  			<th align="right" width="25%"><b>公告内容:</b></th>
		  			<td width="75%"><html:textarea property="content" name="ForumBulletinForm"/></td>
				</tr>
				<tr class="btns">
					<th>
						&nbsp;
					</th>
					<td>
						<button type="button" id="postsubmit" onclick="postCheck()">
							发表公告
						</button>
					</td>
				</tr>
 			</table>
 		</div>
 		</html:form>
 	</div>
</body>
</html>