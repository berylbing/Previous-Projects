package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>软件构件库管理系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"css/top.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar tempClass=\"\";\r\n");
      out.write("\tfunction overThis(p){\r\n");
      out.write("\t\ttempClass=p.className;\r\n");
      out.write("\t\tp.className=\"over\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction outThis(p){\r\n");
      out.write("\t\tp.className=tempClass;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//处理点击Class\r\n");
      out.write("\tvar firstId=null;\r\n");
      out.write("\tfunction clickThis(p){\r\n");
      out.write("\t\tfirstId.className=\"\";\r\n");
      out.write("\t\tp.className=\"on\";\r\n");
      out.write("\t\ttempClass=\"on\";\r\n");
      out.write("\t\tfirstId=p;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction init(){\r\n");
      out.write("\t\t//alert(parent.downFrame.cols)\r\n");
      out.write("\t\tvar d = new Date();\r\n");
      out.write("\t\tvar td = d.getFullYear()+\"-\"+(d.getMonth()+1)+\"-\"+d.getDate();\r\n");
      out.write("\t\tdocument.getElementsByTagName(\"span\")[0].innerText = td;\r\n");
      out.write("\t\tfirstId=document.getElementById(\"firstId\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction goback() {\r\n");
      out.write("\t\tfor (var i=0; i<window.history.length; i++)\r\n");
      out.write("\t\t\twindow.history.back();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tonLoad=\"init()\";>\r\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tcellspacing=\"0\" class=top>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"logo\">\r\n");
      out.write("\t\t<div class=subNav>   系统管理员，欢迎您！今天是：<span></span> | <a href=\"#\" onclick=\"goback();\">退出</a> | <a\r\n");
      out.write("\t\t\thref=\"#\">帮助</a></div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
