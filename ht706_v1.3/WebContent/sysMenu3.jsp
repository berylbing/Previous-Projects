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
				<div>��������</div>
				<span ></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="componentFeedBack/standardFeedback.do?method=listAllStandardFeedback" target="rightFrame">�������۱�׼</a></li>									
					<li><a href="componentFeedBack/feedback.do?method=listAllFeedback" target="rightFrame">����������</a></li>
		
					<li><a href="componentFeedBack/itemFunction.do?method=listAllItemFunction" target="rightFrame">������������</a></li>
					
					<li><a href="componentFeedBack/feedback.do?method=feedbackStatics" target="rightFrame">��������ͳ��</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>�������</div>
				<span ></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="componentFeedBack/problemReport.do?method=listAllProblemReport" target="rightFrame">���ⱨ�浥</a></li>									
					<li><a href="componentFeedBack/problemReport.do?method=listAllProblemReportForTrace" target="rightFrame">������ٹ���</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>��������</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="forum/index.do?method=adminIndex" target="rightFrame">������̳</a></li>
		<!--			<li><a href="null.htm" target="rightFrame">�������</a></li>
					<li><a href="null.htm" target="rightFrame">��������</a></li>		
					  -->			
				</ul>
			</dd>
		</dl>

	</div>
<div id="divCollapsedNav" class="navTocColor" style="display:none;width:100%;height:100%;"> 
<a href="javascript:ToggleNav();" title="չ���������" id="linkNavClosed"><img src="images/toc2.gif" alt="չ���������" border="0"></a> 
</div>
</body>
</html>
