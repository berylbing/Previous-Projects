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
	
</script>

</head>
<body> 
	<div id=menuContainer> 
		<dl>
			<dt> 
				<div>�������</div>
				<span ></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="FacetAction.do?method=ShowFacetTreeAction&temp=show&spid=${spid}" target="rightFrame">���������</a></li>
					<li><a href="facetTreeEdit.jsp?spid=${spid}" target="rightFrame">�༭����</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>ͬ��ʹ���</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="SynonymAction.do?method=ListSynonymAction&spid=${spid}" target="rightFrame">ͬ��ʲ�ѯ</a></li>
					<li><a href="synonymEdit.jsp?spid=${spid}" target="rightFrame">����ͬ���</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>��ϵ����</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="RelationtypeAction.do?method=ShowRelationAction&select=search&spid=${spid}" target="rightFrame">������ϵ��ѯ</a></li>
					<li><a href="RelationtypeAction.do?method=ShowRelationAction&select=edit&spid=${spid}" target="rightFrame">������ϵ����</a></li>
				</ul>
			</dd>
		</dl>

		<dl>
			<dt> 
				<div>��ѯͳ��</div>
				<span></span>
			</dt>
			<dd> 
				<ul>
					<li><a href="SpecificationAction.do?method=listSpecification" target="rightFrame">���й�Լ</a></li>	
					<li><a href="specifiactionSycn.jsp" target="rightFrame">��ͬ����Լ</a></li>					
				</ul>
			</dd>
		</dl>

	</div>
<div id="divCollapsedNav" class="navTocColor" style="display:none;width:100%;height:100%;"> 
<!--<a href="javascript:ToggleNav();" title="չ���������" id="linkNavClosed"><img src="images/toc2.gif" alt="չ���������" border="0"></a> -->
</div>


</body>
</html>
