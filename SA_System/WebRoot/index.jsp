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
    <style type="text/css">
        #search-results a {
            color: #385F95;
            font:bold 11px tahoma, arial, helvetica, sans-serif;
            text-decoration:none;
        }
        
        #search-results a:hover {
            text-decoration:underline;
        }
        
        #search-results p {
            margin:3px !important;
        }
        
        .search-item {
            font:normal 11px tahoma, arial, helvetica, sans-serif;
            padding:3px 10px 3px 10px;
            border:1px solid #fff;
            border-bottom:1px solid #eeeeee;
            white-space:normal;
            color:#555;
        }
        .search-item h3 {
            display:block;
            font:inherit;
            font-weight:bold;
            color:#222;
        }

        .search-item h3 span {
            float: right;
            font-weight:normal;
            margin:0 0 5px 5px;
            width:100px;
            display:block;
            clear:none;
        }
        
        .x-form-clear-trigger {
            background-image: url(ext4.0/themes/images/default/form/clear-trigger.gif);
        }
        
        .x-form-search-trigger {
            background-image: url(ext4.0/themes/images/default/form/search-trigger.gif);
        }
    </style>
    <script type="text/javascript" src="ext4.0/bootstrap.js"></script>

    <!-- Shared -->
    <link rel="stylesheet" type="text/css" href="ext4.0/css/example.css" />

    <!-- Example -->
    <script type="text/javascript" src="ext4.0/custom-form.js"></script>
    
<%--    <script type="text/javascript">--%>
<%--    --%>
<%--    </script>--%>
    
  </head>
  
  <body>
<%--   	<h1>--%>
<%--   	<s:textfield size="4" label = "问题" id="question" name = "question" ></s:textfield>--%>
<%--   	</h1>--%>
<%--   	<h1>--%>
<%--  	<s:submit value="查找" method="Search_answer" ></s:submit>--%>
<%--  	</h1>--%>
<div id="search-panel">
</div>
  </body>
</html>
