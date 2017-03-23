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
				<div>库信息统计</div>
				<span ></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="ReportAction.do?method=listGeneralInfo" target="rightFrame">库总体信息</a></li>				
					<li><a href="null.htm" target="rightFrame">相邻库信息</a></li>	
					<li><a href="null.htm" target="rightFrame">按条件统计</a></li>									
					
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>构件信息统计</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="ReportAction.do?method=listRSC" target="rightFrame">可用RSC清单</a></li>
					<li><a href="ReportAction.do?method=listFuYong" target="rightFrame">复用统计清单</a></li>				
					<li><a href="ReportAction.do?method=listCheckoutByOrder" target="rightFrame">构件下载排行榜</a></li>
					<li><a href="null.htm" target="rightFrame">构件信息统计</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>用户信息统计</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="null.htm" target="rightFrame">角色与权限信息</a></li>				
					<li><a href="ReportAction.do?method=listUserStatics" target="rightFrame">用户信息统计</a></li>
				</ul>
			</dd>
		</dl>

	</div>
<div id="divCollapsedNav" class="navTocColor" style="display:none;width:100%;height:100%;"> 
<a href="javascript:ToggleNav();" title="展开导航框架" id="linkNavClosed"><img src="images/toc2.gif" alt="展开导航框架" border="0"></a> 
</div>
</body>
</html>
