<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
   <%@ taglib uri="/tags/struts-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gbk">
	<title>��������̳</title>
	<link rel="stylesheet" type="text/css" href="../css/style_common.css" />
	<script type="text/javascript" src="../js/fckeditor/fckeditor.js"></script>
	<script src="../js/common.js" type="text/javascript"></script>
	<script type="text/javascript">
		
			function postCheck(){
				var oEditor = FCKeditorAPI.GetInstance('content');
				var oDOM = oEditor.EditorDocument;
				var content = oDOM.body.innerText;
				if(trim(content).length<1){
					alert("��������!");
					return false;
				}
				document.getElementById("content").value=content;
				document.getElementById("ForumPublishThreadForm").submit();
	
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
						<a href="index.do?method=viewIndex">��������̳</a> &raquo; 
						<a href="forum.do?method=viewForum&forumId=${ForumPublishThreadForm.forumId}">${ForumPublishThreadForm.forumName}</a> &raquo; 
						<a href="topic.do?forumId=${ForumPublishThreadForm.forumId}&topicId=${ForumPublishThreadForm.topicId}">${ForumPublishThreadForm.topicName}</a> &raquo;
						�ظ����� 
					</div>
				</div>
			</div>
			<html:form action="/forum/publishThread.do" method="post">
				<div class="mainbox formbox">
					<h3>
						�༭�ظ�
					</h3>
					<table cellspacing="0" cellpadding="0">
						<tr>
							<th valign="top">
								<label>
									����
								</label>
							</th>
							<td valign="top">
								<script type="text/javascript">
									var sBasePath = "../js/fckeditor/" ;
									var oFCKeditor = new FCKeditor("content") ;
									oFCKeditor.BasePath	= sBasePath ;
									oFCKeditor.ToolbarSet = 'Forum' ;
									oFCKeditor.Height = "300";
									oFCKeditor.Width = "800";
									oFCKeditor.Value	=" ";
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
									����ظ�
								</button>
							</td>
						</tr>
					</table>
				</div>
				<br />
				<html:hidden property="content"/>
				<html:hidden property="topicId"/>
				<html:hidden property="forumId"/>
			</html:form>	
		</div>
</body>
</html>