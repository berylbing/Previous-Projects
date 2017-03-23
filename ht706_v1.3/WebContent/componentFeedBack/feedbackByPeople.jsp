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
	function deltr(recordId,path) {
		if(!confirm("ȷ��ɾ���˼�¼��?")) return;
		window.location = path + "/componentFeedBack/feedback.do?method=delete&recordId=" + recordId;
	}
		
	function w_open(v){
		open_window(v,900,500);
		return;		
	}
	 function toPage(obj) {
	     location.href = 'feedback.do?method=listAllFeedback&page=' + obj.value;
	}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>��������������</td>
	</tr>
</table>


<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">���</th>     
      <th align="center">�ǼǺ�</th>            
      <th align="center">��������</th>
      <th align="center">��������</th>
      <th align="center">������</th>        
    </tr>
   
<logic:iterate id="feedback" name="feedbackList" indexId="index">
    <tr>         
      <td align="center" width='5%'>${index+1}</td>
      <td align="center" width='10%'><a href="feedback.do?method=listFeedback&recordId=${feedback.recordId}"><nested:write name="feedback" property="registryId"/></a></td>      
      <td align="center" width='20%'><a onclick="w_open('../componentRelease/ComponentList.do?method=viewComponentAction&ID=${feedback.asset.uniqueId}')">${feedback.asset.name}</a></td>      
      <td align="center" width='10%'><nested:write name="feedback" property="dateOfInformation"/></td>
      <td align="center" width='10%'><nested:write name="feedback" property="provider"/></td>
        
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
		              <a href="feedback.do?method=listAllFeedback&page=1"><font size=2px>��ҳ</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">��һҳ</font>
		        <%}else{%>
		              <a href="feedback.do?method=listAllFeedback&page=<%=(pageNumber-1)%>"><font size=2px>��һҳ</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">��һҳ</font>
		        <%}else{%>
		              <a href="feedback.do?method=listAllFeedback&page=<%=(pageNumber+1)%>"><font size=2px>��һҳ</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">ĩҳ</font>
		        <%}else{%>
		              <a href="feedback.do?method=listAllFeedback&page=<%=totalPage %>"><font size=2px>ĩҳ</font></a>
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

</body>
</html>
