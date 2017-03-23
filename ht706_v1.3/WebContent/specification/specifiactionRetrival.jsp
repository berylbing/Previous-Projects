<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<%@ page import="com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification,java.util.List" language="java"%>
<%@ page import="com.ht706.componentLibrary.util.Constant" language="java"%>
<% 
   List<Specification> list=(List)request.getAttribute("specificationList");
   int totalPage=(Integer)request.getAttribute("totalPage");
   int pageNumber=1;
   if(request.getParameter("page")!=null){
         pageNumber=Integer.parseInt(request.getParameter("page"));
   }
%>


<html>
<head>
<title>发布规约</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="js/check.js" type="text/javascript"></script>
<script>
	function changex1() {
		var v = document.getElementsByTagName("div");
		for (var i=1; i<v.length; i++) {
			v[i].style.display = "";
		}
	}
	
	function deltr() {
                
                if(!confirm("确认删除此记录吗?")) return;
				var e = window.event.srcElement;
				while(e.tagName!='TR') 
  				  e = e.parentNode;
				var str = e.innerText.split(" ",2);
				var id = str[1];
				location.href = "SpecificationAction.do?method=deleteSpecification&Id="+id;
	}

	
	function tijiao() {
                
                if(!confirm("确认提交审批吗?")) return;
               
                var e = window.event.srcElement;
        		while(e.tagName!='TR') 
        			  e = e.parentNode;
        		var str = e.innerText.split(" ",2);
        		var id = str[1];
        		location.href = "SpecificationAction.do?method=tijiaoSpecification&Id="+id;          
	}
	
       function switchPage(v,id)
       {
	    if(v==0)
	    {    
				location.href = "SpecificationAction.do?method=precreateSpecification&Reason=";
	    }
	    if(v==1)
	    {    
	        var b = parent.parent.document.getElementById("hid");
	        b.value = "查阅";	        
	        
	        var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
	        a.src = "menuFrame1.jsp";
	    }
	    if(v==3)
	    {
	    	var b = parent.parent.document.getElementById("hid");
		    b.value = id;	  
	        var a = parent.parent.document.getElementsByTagName("IFRAME")[0];
	        a.src = "specification/menuFrame1.jsp?Id="+id;	
	        window.top.rightFrame.location.href="SpecificationAction.do?method=getSpecification&Id="+id;     
	    }	        
       }

	function newSpecification() {
		location.href = "SpecificationAction.do?method=precreateSpecification";
	}
	
	 function toPage(obj) {
	     location.href = 'SpecificationAction.do?method=listSpecification&page=' + obj.value;
	}	
</script>

<style>
	a { cursor:hand; }
</style>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>
<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>规约信息</td>
	</tr>
</table>

<table border=0 width='100%' cellSpacing=6>
	
</table>

<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>            
      <th align="center">序号</th>       
      <th align="center">版本号</th>
      <th align="center">创建日期</th>
      <th align="center">创建者</th>      
      <th align="center">发布形式</th>
      <th align="center">规约状态</th>
      <th align="center">操作</th>
   
    </tr>

  	<logic:iterate id="element" name="specificationList" indexId = "index">
					<tr>
						<td align="center">
							<a href="menuFrame1.jsp?Id=${element.specUuid}" target="_parent" >${pagelines*(pageNumbers-1)+index+1}</a>
						</td>
						<td align="center" style="display: none">
							${element.specUuid}
						</td>
						<td align="center">
							<a href="menuFrame1.jsp?Id=${element.specUuid}" target="_parent" >${element.version}</a>
						</td>
						<td align="center">
							<bean:write name="element" property="dateOfInformation" format="yyyy-MM-dd"/>
						</td>
						<td align="center">
							${element.creator}

						</td>
						<td align="center">
							<logic:equal name="element" property="releaseType" value='${2}'>内部发布</logic:equal>
							<logic:equal name="element" property="releaseType" value='${1}'>全局发布</logic:equal>
						</td>
						<td align="center">
							<logic:equal name="element" property="status" value='${1}'>草稿</logic:equal>
							<logic:equal name="element" property="status" value='${2}'>审批中</logic:equal>
							<logic:equal name="element" property="status" value='${3}'>已批准</logic:equal>
							<logic:equal name="element" property="status" value='${4}'>当前</logic:equal>
							<logic:equal name="element" property="status" value='${5}'>历史</logic:equal>
						</td>
						<td align="center">
							<logic:equal name="element" property="status" value='${1}'>
								<a href="menuFrame11.jsp?Id=${element.specUuid}&Reason=${element.reason}" target="_parent" ><img src="../images/icon/icon_dianping.gif" width="16" height="16"
										border="0">
								</a>&nbsp
								<img onclick="deltr()" src="../images/icon/del.gif" width="16" height="16" border="0">&nbsp
								<img src="../images/icon/icon_ok.gif" onclick='tijiao()' width="16" height="16"
										border="0">
								
							</logic:equal>
							<logic:equal name="element" property="status" value='${2}'>
								
							</logic:equal>
							<logic:equal name="element" property="status" value='${3}'>
								<img src="../images/icon/tuijian.gif" onclick='alert("已批准 ！ ")' width="16" height="16"
										border="0">
								
							</logic:equal>
							<logic:equal name="element" property="status" value='${4}'>
								<img src="../images/icon/search.gif" onclick='alert("当前  ！ ")' width="16" height="16"
										border="0">
								
							</logic:equal>
							<logic:equal name="element" property="status" value='${5}'>
								<img src="../images/icon/search.gif" onclick='alert("当前  ！ ")' width="16" height="16"
										border="0">
								
							</logic:equal>
							
						</td>
						
					</tr>
					
				</logic:iterate> 

 </table>
</div>
<table  width="100%" border="0" cellspacing="0" cellpadding="0"
	class=page>
<tr>
<td align="right">
<div >	
		<font size=2px color="black">(${pagelines*(pageNumbers-1)+1}-${pagelines*pageNumbers}) 共${totalSize}  第${pageNumbers}页/共${totalPage}页</font>
				<%if(pageNumber<=1){%>
		             <font size=2px color="black">首页</font>
		        <%}else{%>
		              <a href="SpecificationAction.do?method=listSpecification&page=1"><font size=2px>首页</font></a>
		        <% }%>
                 <%if(pageNumber<=1){%>
		             <font size=2px color="black">上一页</font>
		        <%}else{%>
		              <a href="SpecificationAction.do?method=listSpecification&page=<%=(pageNumber-1)%>"><font size=2px>上一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">下一页</font>
		        <%}else{%>
		              <a href="SpecificationAction.do?method=listSpecification&page=<%=(pageNumber+1)%>"><font size=2px>下一页</font></a>
		        <% }%>
		        <%if(pageNumber>=totalPage){%>
		             <font size=2px color="black">末页</font>
		        <%}else{%>
		              <a href="SpecificationAction.do?method=listSpecification&page=<%=totalPage %>"><font size=2px>末页</font></a>
		        <% }%>
				<font size=2px>第</font><select name="page" onchange="toPage(this)">
				 <% for(int i=1;i<=totalPage;i++){%>
				<option value="<%=i %>"
				<%if(i==pageNumber){%> selected<%} %>><%=i %></option>
				<% } %>	
				</select><font size=2px>页</font>

</div>
</td>
</tr>
</table>
<table align="left" width="100%">
      <tr> 
      <td align="left">
      <input type='button' value='新建规约' class="input_button" onclick="newSpecification()">&nbsp;&nbsp;
      </td>
      </tr>
</table>


</body>
</html>
