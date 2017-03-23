<%@ page contentType="text/html; charset=GBK" %>
<jsp:useBean id="message"  scope="request" class="com.ht706.componentLibrary.util.MessageBox" />
<%
try{
	String messageType = request.getParameter("messageType");
	if((message==null ||message.getMessage()==null || "".equals(message.getMessage()) )&& messageType!=null)
	{
		if("refreshCheck".equals(messageType)){
			message.setMessage("此处的刷新等于数据提交，不可重复提交。");
		}else if("".equals(messageType)){
			
		}
	}
%>
<HTML>
<HEAD>
<script src="<%=request.getContextPath()%>/js/messagebox.js"></script>
<TITLE>信息发布</TITLE>
<META http-equiv=Content-Type content="text/html; charset=GBK">

<style type="text/css">
.style2 {
	font-size: 14px;
	color: #0066FF;
	font-weight: bold;
}
 </style>
<script language="JavaScript" type="text/JavaScript">

function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) { 
  	if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    		document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; 
    	}
  }
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);

</script>
</HEAD>
<%/*如果为提示框(不自动转发)*/%>
<BODY bgcolor="#ECF2FF" >
 <br>
 <br>
<TABLE  align=center border=0>
<TBODY>
  <TR>
    <TD>
       <%if( message.getImage().equals("0") ){%>
        <img src="<%=request.getContextPath()%>/images/sysError.gif" >
       <% }else if( message.getImage().equalsIgnoreCase("1") ){%>
        <img src="<%=request.getContextPath()%>/images/sysInfo.gif" >
       <%}else{%>
        <img src="<%=request.getContextPath()%>/images/sysInfo.gif" >
       <%}%>
    </TD>
  </TR>
  <TR>
    <TD>
    <br>
	<div id="Layer1" style="position:absolute; width:200px; height:115px; z-index:1">
          <div id="Layer2" style="position:absolute; width:338px; height:38px; z-index:1; left: 90px; top: -146px;"> 
            <span class="style2"> <%=message.getMessage()%></span> </div>
    </div>
     <BR>
      <p><BR>
  </TR>
  <TR>
    <TD align="center">
      <TABLE  border=0>
        <TBODY>
        </TBODY>
      </TABLE>
    </TD>
  </TR> 
</TBODY>
</TABLE>
	 <form name="goform" method="post" action="#">
     </form>
</BODY>
</HTML>
<%}catch(Exception ex){
	ex.printStackTrace();
}%>