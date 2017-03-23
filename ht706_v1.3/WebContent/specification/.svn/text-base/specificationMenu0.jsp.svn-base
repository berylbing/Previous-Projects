<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/menuHTC.css" rel="stylesheet" type="text/css">
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
				<div>规约管理</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="SpecificationAction.do?method=listSpecification" target="rightFrame">规约建立与查询</a></li>	
					<li><a href="specificationStaticsDetail.jsp" target="rightFrame">信息统计</a></li>					
				</ul>
			</dd>
		</dl>
		
		<dl>
			<dt> 
				<div>同步规约</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="specifiactionSycn.jsp" target="rightFrame">待同步规约</a></li>	
					<li><a href="specifiactionReleaseState.jsp" target="rightFrame">规约发布情况</a></li>					
				</ul>
			</dd>
		</dl>
		
		<dl>
			<dt> 
				<div>规约变更</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="SpecificationmodifyAction.do?method=listSpecificationmodify&select=search" target="rightFrame">查看变更申请单</a></li>	
					<li><a href="SpecificationmodifyAction.do?method=listSpecificationmodify&select=edit" target="rightFrame">建立变更申请单</a></li>					
				</ul>
			</dd>
		</dl>		

	</div>
<div id="divCollapsedNav" class="navTocColor" style="display:none;width:100%;height:100%;"> 
<a href="javascript:ToggleNav();" title="展开导航框架" id="linkNavClosed"><img src="images/toc2.gif" alt="展开导航框架" border="0"></a> 
</div>
</body>
</html>
