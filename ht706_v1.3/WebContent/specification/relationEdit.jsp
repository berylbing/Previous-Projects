<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype,java.util.List" language="java"%>
<%@ page import="com.ht706.componentLibrary.util.Constant" language="java"%>
<% 
   int totalPage=(Integer)request.getAttribute("totalPage");
   int pageNumber=1;
   if(request.getParameter("page")!=null){
         pageNumber=Integer.parseInt(request.getParameter("page"));
   }
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script>
function toPage(obj) {
    location.href = 'RelationtypeAction.do?method=ShowRelationAction&select=edit&spid=${spid}&page=' + obj.value;
}
	function deltr() {
		if(!confirm("ȷ��ɾ���˼�¼��?")) return;
		var e = window.event.srcElement;
		while(e.tagName!='TR') 
			  e = e.parentNode;
		var str = e.innerText.split(" ",2);
		var id = str[1];
		
		url = "RelationtypeAction.do?method=checkdelete&rid="+id;
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.onreadystatechange=processor;
		xmlhttp.open("post",url);
		xmlhttp.send(null);
	}	

	function processor(){
		if(xmlhttp.readyState==4)
			if(xmlhttp.status==200){	
				if(xmlhttp.responseText=="")
				{
					alert("������ϵ���ڱ�ʹ�ø�������ɾ����");
				}
				else
				{
					var temp=xmlhttp.responseText.split("<span style=\"color: green\">",2);
					var text=temp[1].split("</span>",2);
					var idr = text[0];
					location.href = "RelationtypeAction.do?method=deleteRelationtype&spid=${spid}&Id="+idr;
				}
			}
	}
	function newrelation()
	{
		location.href="RelationtypeAction.do?method=preCreateRelationtype&spid=${spid}";
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>


<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>���幹����ϵ</td>
	</tr>
</table>
<!--���ҳ��������ʾ��Ϣ���ɷŴ˴�--->
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=info>
	<tr>
		<td>ֻ��ѡ��һ����д���</td>
	</tr>
</table>
<!--���ҳ��������ʾ��Ϣ���ɷŴ˴�  over--->

<hr color=#97D2FF>

<!--����Ѷ����ϵ�ѱ�����,��ʾ����ɾ��  over--->
<div class=list>
<table id="ta">
<nested:hidden property="spid" value="${spid}"></nested:hidden>
	<tr>
		<th width="10%">���</th>
		<th width="20%">��ϵ����</th>
		<th width="20%">��Ӧ��ϵ</th>		
		<th>��ϵ˵��</th>
		<th>����</th>
	</tr>
	<logic:iterate id="element" name="relationList"  indexId = "index">
	<tr>
		<td align="center">
			${index+1 }
		</td>
		<td style="display: none;">
			${element.id.relationUuid }
		</td>
		<td align="center">
			${element.relationName }
		</td>
		<td align="center">
			${element.relationType }
		</td>
		<td align="center">
			${element.description }
		</td>
		
		<td align="center">
			<a href="RelationtypeAction.do?method=preModifyRelationtype&Ids=${element.id.specification.specUuid}&Idr=${element.id.relationUuid}"  ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
										border="0">
			</a>&nbsp
			<img onclick="deltr()" src="../images/icon/del.gif" width="16" height="16" border="0">&nbsp					
		</td>
	</tr>
	
	</logic:iterate>
</table>
<table  width="100%" border="0" cellspacing="0" cellpadding="0"
	class=page>
<tr>
<td align="right">
<div >	
		<font size=2px color="black">(${pagelines*(pageNumbers-1)+1}-${pagelines*pageNumbers}) ��${totalSize}  ��${pageNumbers}ҳ/��${totalPage}ҳ</font>
				<%if(pageNumber<=1){%>
		             <font size=2px color="black">��ҳ</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=edit&spid=${spid}&page=1"><font size=2px>��ҳ</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">��һҳ</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=edit&spid=${spid}&page=<%=(pageNumber-1)%>"><font size=2px>��һҳ</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">��һҳ</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=edit&spid=${spid}&page=<%=(pageNumber+1)%>"><font size=2px>��һҳ</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">ĩҳ</font>
		        <%}else{%>
		              <a href="RelationtypeAction.do?method=ShowRelationAction&select=edit&spid=${spid}&page=<%=totalPage %>"><font size=2px>ĩҳ</font></a>
		        <% }%>
				<font size=2px>��</font><select name="page" onchange="toPage(this)">
				 <% for(int i=1;i<=totalPage;i++){%>
				<option value="<%=i %>"
				<%if(i==pageNumber){%> selected<%} %>><%=i %></option>
				<% } %>	
				</select><font size=2px>ҳ</font>

</div>
</td>
</tr>
</table>
</div>
  <div id=bc align=right>
  	<input onclick="newrelation()" type=button value=' �� �� ' class='input_button'>  	
  </div><br>

</body>
</html>

