<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>网络论坛热点话题发现系统</title>
<link href="css/main.css" rel="stylesheet" type="text/css"  />
</head>

<script language="javascript" type="text/javascript">
function seg_on(){
	alert("正在分词过滤 ，请稍等！  ");
<%--	window.open ("topicdetected/clawer_on.html", "newwindow", "height=200, width=400,toolbar=no,menubar=no, scrollbars=yes, resizable=no, location=yes, status=yes") 　--%>
}
function crawler_on(){
	alert("正在获取web数据，请稍等！  ");
<%--	window.open ("topicdetected/clawer_on.html", "newwindow", "height=200, width=400,toolbar=no,menubar=no, scrollbars=yes, resizable=no, location=yes, status=yes") 　--%>
}

function cluster_on(){
	alert("正在聚类，请稍等！  ");
<%--	window.open ("topicdetected/clawer_on.html", "newwindow", "height=200, width=400,toolbar=no,menubar=no, scrollbars=yes, resizable=no, location=yes, status=yes") 　--%>
}

</script>

<body>
<div id="doc">
 <div id="header">
   <img src="images/bt.png" alt="网络论坛热点话题发现系统" />
 </div>
 <!--header-->
 <div id="menu">
					<div class="rightbg">
						<div class="leftbg">
							<div class="padding">
								<ul>
									<li><a href="#">关于我们</a></li>
									<li><a href="#">兵马俑</a></li>
									<li><a href="#">水木清华</a></li>
									<li><a href="#">联系我们</a></li>
								</ul>
								<br class="clear" />
							</div>
						</div>
					</div>
				</div>
 <div id="main">
 </div>
 <div id="main1">
  <div class="right">
  <p>聚类中</p>
  <div id="nextstep">
  <a href="index1-4.html">下一步</a>
  </div>
  </div>
  <div class="left">
   <ul>
    <li><a href="DataPretreatmentaction_crawler" onclick="crawler_on()">数据获取</a></li>
	<li><a href="DataPretreatmentaction_segfilter" onclick="seg_on()">中文分词过滤</a></li>
	<li><a href="Clusteraction_cluster" onclick = "cluster_on()">单边增量聚类</a></li>
	<li><a href="index1-4.html">热点话题排序</a></li>
   </ul>
  </div>
  <div class="clear"></div>
  </div>
 <!--main-->
 <div id="footer">
 <hr />
 </div>
</div>
 <!--doc-->
</body>
</html>
<script language="javascript" type="text/javascript">
alert("分词过滤完成！ ");

</script>

