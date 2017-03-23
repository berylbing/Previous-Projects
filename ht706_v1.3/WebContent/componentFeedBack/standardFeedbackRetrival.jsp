<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="java.util.List" language="java"%>
<%@ page import="com.ht706.componentLibrary.util.Constant" language="java"%>
<% 
   int totalPage=(Integer)request.getAttribute("totalPage");
   int pageNumber=1;
   if(request.getParameter("page")!=null){
         pageNumber=Integer.parseInt(request.getParameter("page"));
   }
%>
<html>
<head>
<title>������������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script>

	function deltr(SfID,path) {
		if(!confirm("ȷ��ɾ���˼�¼��?")) return;
		window.location = path + "/componentFeedBack/standardFeedback.do?method=delete&SfID=" + SfID;
	}	

	function submit(SfID,path){
		if(!confirm("ȷ����Ч�˼�¼��?")) return;
		window.location = path + "/componentFeedBack/standardFeedback.do?method=validate&SfID=" + SfID;
	}

	 function toPage(obj) {
	     location.href = 'standardFeedback.do?method=listAllStandardFeedback&page=' + obj.value;
	}	
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>������׼</td>
	</tr>
</table>


<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">���</th>       
      <th align="center">�汾��</th>
      <th align="center">��������</th>
      <th align="center">������</th>      
      <th align="center">״̬</th>
      <th align="center">����</th>      
    </tr>
   <logic:iterate id="standardFeedback" name="standardFeedbackList" indexId="index">

		<tr>
			<td align="left" width='30'>${index+1}</td>
			<td align="left" width='220'><a href="standardFeedback.do?method=listStandardFeedback&SfID=${standardFeedback.sfId}"><nested:write name="standardFeedback" property="version"/></a></td>
			<td align="left" width='80'><nested:write name="standardFeedback" property="dateOfInformation"/></td>
			<td align="center" width='90'><nested:write name="standardFeedback" property="creatorId"/></td>
			<!-- 
				statusֵ�ĺ���
				0---��ʷ
				1---��ǰ
				2---�ݸ�
			 -->
			<td align="center" width='60'>
				<logic:equal name="standardFeedback" property="status" value="0">��ʷ</logic:equal>
				<logic:equal name="standardFeedback" property="status" value="1">��ǰ</logic:equal>
				<logic:equal name="standardFeedback" property="status" value="2">�ݸ�</logic:equal>
			</td>      
      		<td align="left" width='150'>
	         <logic:equal name="standardFeedback" property="status" value="2">
		         <img alt="�༭" onclick="location.href='standardFeedback.do?method=preModify&SfID=${standardFeedback.sfId}'" src="../images/icon/icon_dianping.gif">&nbsp  
		         <img alt="ɾ��" onclick="deltr('${standardFeedback.sfId}','${pageContext.request.contextPath}')" src="../images/icon/del.gif">&nbsp
		         <img alt="��Ч" onclick="submit('${standardFeedback.sfId}','${pageContext.request.contextPath}')" src="../images/icon/icon_ok.gif">&nbsp
	         </logic:equal> 
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
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=1"><font size=2px>��ҳ</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">��һҳ</font>
		        <%}else{%>
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=<%=(pageNumber-1)%>"><font size=2px>��һҳ</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">��һҳ</font>
		        <%}else{%>
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=<%=(pageNumber+1)%>"><font size=2px>��һҳ</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">ĩҳ</font>
		        <%}else{%>
		              <a href="standardFeedback.do?method=listAllStandardFeedback&page=<%=totalPage %>"><font size=2px>ĩҳ</font></a>
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
  <div id=bc align=left>
  	<input onclick="location.href='standardFeedback.do?method=preCreate'" type=button value=' �� �� ' class='input_button'>  	
  </div><br>
</body>

</html>
