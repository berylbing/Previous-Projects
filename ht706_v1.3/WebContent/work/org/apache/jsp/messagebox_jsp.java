package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class messagebox_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      com.ht706.componentLibrary.util.MessageBox message = null;
      synchronized (request) {
        message = (com.ht706.componentLibrary.util.MessageBox) _jspx_page_context.getAttribute("message", PageContext.REQUEST_SCOPE);
        if (message == null){
          message = new com.ht706.componentLibrary.util.MessageBox();
          _jspx_page_context.setAttribute("message", message, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

try{
	String messageType = request.getParameter("messageType");
	if((message==null ||message.getMessage()==null || "".equals(message.getMessage()) )&& messageType!=null)
	{
		if("refreshCheck".equals(messageType)){
			message.setMessage("此处的刷新等于数据提交，不可重复提交。");
		}else if("".equals(messageType)){
			
		}
	}

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/messagebox.js\"></script>\r\n");
      out.write("<TITLE>信息发布</TITLE>\r\n");
      out.write("<META http-equiv=Content-Type content=\"text/html; charset=GBK\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".style2 {\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tcolor: #0066FF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(" </style>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/JavaScript\">\r\n");
      out.write("\r\n");
      out.write("function MM_reloadPage(init) {  //reloads the window if Nav4 resized\r\n");
      out.write("  if (init==true) with (navigator) { \r\n");
      out.write("  \tif ((appName==\"Netscape\")&&(parseInt(appVersion)==4)) {\r\n");
      out.write("    \t\tdocument.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; \r\n");
      out.write("    \t}\r\n");
      out.write("  }\r\n");
      out.write("  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();\r\n");
      out.write("}\r\n");
      out.write("MM_reloadPage(true);\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
/*如果为提示框(不自动转发)*/
      out.write("\r\n");
      out.write("<BODY bgcolor=\"#ECF2FF\" >\r\n");
      out.write(" <br>\r\n");
      out.write(" <br>\r\n");
      out.write("<TABLE  align=center border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("       ");
if( message.getImage().equals("0") ){
      out.write("\r\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/sysError.gif\" >\r\n");
      out.write("       ");
 }else if( message.getImage().equalsIgnoreCase("1") ){
      out.write("\r\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/sysInfo.gif\" >\r\n");
      out.write("       ");
}else{
      out.write("\r\n");
      out.write("        <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/sysInfo.gif\" >\r\n");
      out.write("       ");
}
      out.write("\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD>\r\n");
      out.write("    <br>\r\n");
      out.write("\t<div id=\"Layer1\" style=\"position:absolute; width:200px; height:115px; z-index:1\">\r\n");
      out.write("          <div id=\"Layer2\" style=\"position:absolute; width:338px; height:38px; z-index:1; left: 90px; top: -146px;\"> \r\n");
      out.write("            <span class=\"style2\"> ");
      out.print(message.getMessage());
      out.write("</span> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("     <BR>\r\n");
      out.write("      <p><BR>\r\n");
      out.write("  </TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=\"center\">\r\n");
      out.write("      <TABLE  border=0>\r\n");
      out.write("        <TBODY>\r\n");
      out.write("        </TBODY>\r\n");
      out.write("      </TABLE>\r\n");
      out.write("    </TD>\r\n");
      out.write("  </TR> \r\n");
      out.write("</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\t <form name=\"goform\" method=\"post\" action=\"#\">\r\n");
      out.write("     </form>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
}catch(Exception ex){
	ex.printStackTrace();
}
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
