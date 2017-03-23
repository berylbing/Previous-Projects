<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix = "s" uri = "/struts-tags" %>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
    <title>语义分析系统</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <link rel="stylesheet" type="text/css" href="ext4.0/css/ext-all.css" />
    <link rel="stylesheet" type="text/css" href="ext4.0/css/example.css" />
    
    <script type="text/javascript" src="ext4.0/bootstrap.js"></script>
    <script type="text/javascript" src="ext4.0/paging.js"></script>
    <style>
        .x-grid-cell-topic b {
            display: block;
        }
        .x-grid-cell-topic .x-grid-cell-inner {
            white-space: normal;
        }
        .x-grid-cell-topic a {
            color: #385F95;
            text-decoration: none;
        }
        .x-grid-cell-topic a:hover {
            text-decoration:underline;
        }
		.x-grid-cell-topic .x-grid-cell-innerf {
			padding: 5px;
		}
		.x-grid-rowbody {
	        padding: 0 5px 5px 5px; 
		}
    </style>
  </head>
  
  <body>
  <div class="x-panel x-grid x-panel-default x-vertical-scroller-present">
   	<h1>
<!--   	<label>问题：</label>-->
   	<s:textfield size="50"  id="question" name = "question" ></s:textfield>
  	<s:submit value="查找" align="middle"  method="Search_answer" ></s:submit>
  	</h1>
	</div>
	<div id="topic-grid"></div>
  </body>
</html>
