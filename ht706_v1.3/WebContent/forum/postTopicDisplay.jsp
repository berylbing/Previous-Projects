<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
   <%@ taglib uri="/tags/struts-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk">
	<title>构件库论坛</title>
	<link rel="stylesheet" type="text/css" href="../css/style_common.css" />
	<script type="text/javascript" src="../js/fckeditor/fckeditor.js"></script>
	<script src="../js/common.js" type="text/javascript"></script>
	<script type="text/javascript">
		
			function postCheck(){
				var oEditor = FCKeditorAPI.GetInstance('content');
				var oDOM = oEditor.EditorDocument;
				var content = oDOM.body.innerText;
				if(document.getElementById("topicName").value==""){
					alert("请输入标题!");
					return false;
				}
				if(trim(content).length<1){
					alert("请输内容!");
					return false;
				}
				document.getElementById("content").value=content;
				document.getElementById("ForumPublishTopicForm").submit();
	
			}
			
			function trim(string){
  			 return string.replace(/\s/g,"");
 			}
	</script>
</head>
<body>
	<div class="wrap">
			<div id="foruminfo">
				<div id="userinfo">
					<div id="nav">
						<a href="index.do?method=viewIndex">构件库论坛</a> &raquo; 
						<a href="forum.do?method=viewForum&forumId=${ForumPublishTopicForm.forumId }">${ForumPublishTopicForm.forumName}</a> &raquo; 
						发新主题
					</div>
				</div>
			</div>
			<html:form action="/forum/publishTopic.do" method="post">
				<div class="mainbox formbox">
					<h3>
						编辑主题
					</h3>
					<table cellspacing="0" cellpadding="0">
						<tr>
							<th style="border-bottom: 0">
								<label for="subject">
									标题
								</label>
							</th>
							<td style="border-bottom: 0">
								<html:text property="topicName"/>
							</td>
						</tr>
						<tr>
							<th valign="top">
								<label>
									内容
								</label>
							</th>
							<td valign="top">
								<script type="text/javascript">
									var sBasePath = "../js/fckeditor/" ;
									var oFCKeditor = new FCKeditor("content") ;
									oFCKeditor.BasePath	= sBasePath ;
									oFCKeditor.ToolbarSet = 'Forum' ;
									oFCKeditor.Height = "300";
									oFCKeditor.Width = "800" ;
									oFCKeditor.Value= " " ;
									oFCKeditor.Create() ;
								</script>								
							</td>
						</tr>
						<tr class="btns">
							<th>
								&nbsp;
							</th>
							<td>
								<button type="button" name="topicsubmit" id="postsubmit" onclick="postCheck()">
									发表主题
								</button>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:hidden property="content"/>
				<html:hidden property="forumId"/>
			</html:form>
		</div>
</body>
</html>