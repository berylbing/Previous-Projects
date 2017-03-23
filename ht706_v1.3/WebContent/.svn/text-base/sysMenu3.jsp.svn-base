<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="css/menuHTC.css" rel="stylesheet" type="text/css">
<script>	
	function ToggleNav() {
		if(divCollapsedNav.style.display == "none")	{
			divCollapsedNav.style.display = "";
			menuContainer.style.display = "none";
			parent.frmstOuter.cols = "18,*"
			parent.document.all ('leftFrame').noResize = true;
			parent.document.all ('leftFrame').framespacing= 0;
		} else {
			menuContainer.style.display = "";
			divCollapsedNav.style.display = "none";
			parent.frmstOuter.cols = "200,*"
			parent.document.all ('leftFrame').noResize = false;
		}
	}
	var firstId=null;
</script>

</head>
<body ondblclick="ToggleNav();"> 
	<div id=menuContainer> 
		<dl>
			<dt> 
				<div>反馈管理</div>
				<span ></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="componentFeedBack/standardFeedback.do?method=listAllStandardFeedback" target="rightFrame">质量评价标准</a></li>									
					<li><a href="componentFeedBack/feedback.do?method=listAllFeedback" target="rightFrame">反馈单管理</a></li>
		
					<li><a href="componentFeedBack/itemFunction.do?method=listAllItemFunction" target="rightFrame">反馈项类别管理</a></li>
					
					<li><a href="componentFeedBack/feedback.do?method=feedbackStatics" target="rightFrame">构件反馈统计</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>问题管理</div>
				<span ></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="componentFeedBack/problemReport.do?method=listAllProblemReport" target="rightFrame">问题报告单</a></li>									
					<li><a href="componentFeedBack/problemReport.do?method=listAllProblemReportForTrace" target="rightFrame">问题跟踪过程</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>交流管理</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="forum/index.do?method=adminIndex" target="rightFrame">构件论坛</a></li>
		<!--			<li><a href="null.htm" target="rightFrame">事务管理</a></li>
					<li><a href="null.htm" target="rightFrame">发布公告</a></li>		
					  -->			
				</ul>
			</dd>
		</dl>

	</div>
<div id="divCollapsedNav" class="navTocColor" style="display:none;width:100%;height:100%;"> 
<a href="javascript:ToggleNav();" title="展开导航框架" id="linkNavClosed"><img src="images/toc2.gif" alt="展开导航框架" border="0"></a> 
</div>
</body>
</html>
