package org.apache.jsp.specification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class specifiactionSycn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction changex1() {\r\n");
      out.write("\t\tvar v = document.getElementsByTagName(\"div\");\r\n");
      out.write("\t\tfor (var i=1; i<v.length; i++) {\r\n");
      out.write("\t\t\tv[i].style.display = \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction excel() {\r\n");
      out.write("\t\twindow.open(\"excel/按考核对象统计.xls\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkSpecification() {\r\n");
      out.write("\t\twindow.open(\"menuFrame1.jsp\");\r\n");
      out.write("\t}\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\ta { cursor:hand; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tclass=mainbody>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=title>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>待同步规约</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=list>\r\n");
      out.write("<li>交大：不需做</li>\r\n");
      out.write("<!--<table>-->\r\n");
      out.write("<!--\t<tr>-->\r\n");
      out.write("<!--\t\t<th width=\"10%\">规约版本号</th>-->\r\n");
      out.write("<!--\t\t<th width=\"9%\">建立日期</th>-->\r\n");
      out.write("<!--\t\t<th width=\"9%\">发送者</th>-->\r\n");
      out.write("<!--\t\t<th width=\"9%\">接收者</th>\t-->\r\n");
      out.write("<!--\t\t<th width=\"9%\">执行状态</th>-->\r\n");
      out.write("<!--\t\t<th>操作</th>-->\r\n");
      out.write("<!--\t</tr>\t-->\r\n");
      out.write("<!--\t<tr>-->\r\n");
      out.write("<!--\t\t<td width=\"10%\" align=\"center\"><a onclick=\"checkSpecification()\">S200080</a></td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">2009-09-09</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">10.17.12.180</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">10.17.12.151</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">本地接收</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\"><a onclick=\"alert('在数据库中执行同步操作')\">同步</a></td>-->\r\n");
      out.write("<!--\t</tr>\t-->\r\n");
      out.write("<!--\t<tr>-->\r\n");
      out.write("<!--\t\t<td width=\"10%\" align=\"center\"><a href=\"#\">S200081</a></td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">2009-09-10</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">10.17.12.181</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">10.17.12.151</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">本地接收</td>-->\r\n");
      out.write("<!--\t\t<td width=\"9%\" align=\"center\">同步过期</td>-->\r\n");
      out.write("<!--\t</tr>\t-->\r\n");
      out.write("<!--</table>-->\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
