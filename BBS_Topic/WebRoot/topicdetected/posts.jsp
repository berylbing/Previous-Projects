<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>测试系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="css/style.css" rel="stylesheet" type="text/css" />
    <link href="css/layout.css" rel="stylesheet" type="text/css" />

    <script src="css/maxheight.js" type="text/javascript"></script>
  </head>
  
  <%@ taglib prefix = "s" uri = "/struts-tags" %>
  
  <body id="index" onload="new ElementMaxHeight();">
  <div id="header_tall">
		<div id="main">
			<!--header -->
			<div id="header">
				<div class="h_logo">
						<div class="left">
						<img alt="" src="images/logo.jpg" /><br />
					</div>
					<div class="right">
						<a href="http://www.csscss.org">RSS</a>				</div>
					<div class="clear"></div>
				</div>
				<div id="menu">
					<div class="rightbg">
						<div class="leftbg">
							<div class="padding">
								<ul>
									<li><span>About us</span></li>
									<li><a href="index-1.html">数据获取</a></li>
									<li><a href="index-2.html">中文分词过滤</a></li>
									<li><a href="index-3.html">动态增量式聚类</a></li>
									<li><a href="index-4.html">热点话题排序</a></li>
									<li class="last"><a href="index-5.html">Contacts</a></li>
								</ul>
								<br class="clear" />
							</div>
						</div>
					</div>
				</div>
				<div class="content">
					<img alt="" src="images/header_t1.jpg" /><br />
					<img alt="" src="images/header_t2.jpg" /><br />
					<div class="text">
					<label>网络论坛热点话题发现系统</label>
					</div>
					<a href="http://www.csscss.org"><img alt="" src="images/header_click_here.jpg" /></a><div class="clear"></div>
				</div>
			</div>
			<!--header end-->
			 <table>
   				<tr>
   					<td>TopicID</td>
   					<td>Title</td>
   				</tr>
   				<s:iterator value="%{#request.postlist}" id = "element">
   					<tr>
   						<td><s:property value = "#element.topicId"/></td>
   						<td><s:property value = "#element.title"/></td>
   					</tr>
   				</s:iterator>
   			</table>
			<!--footer -->
			<div id="footer">
				<div class="indent">
					&copy;2011 Solutions Online &bull; <a href="index-6.html">Privacy Policy</a>				</div>
			</div>
			<!--footer end-->
		</div>
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


    
  </body>
</html>
