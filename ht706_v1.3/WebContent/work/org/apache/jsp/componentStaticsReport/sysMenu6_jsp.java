package org.apache.jsp.componentStaticsReport;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysMenu6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../css/menuHTC.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script>\t\r\n");
      out.write("\tfunction ToggleNav() {\r\n");
      out.write("\t\tif(divCollapsedNav.style.display == \"none\")\t{\r\n");
      out.write("\t\t\tdivCollapsedNav.style.display = \"\";\r\n");
      out.write("\t\t\tmenuContainer.style.display = \"none\";\r\n");
      out.write("\t\t\tparent.frmstOuter.cols = \"18,*\"\r\n");
      out.write("\t\t\tparent.document.all ('leftFrame').noResize = true;\r\n");
      out.write("\t\t\tparent.document.all ('leftFrame').framespacing= 0;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tmenuContainer.style.display = \"\";\r\n");
      out.write("\t\t\tdivCollapsedNav.style.display = \"none\";\r\n");
      out.write("\t\t\tparent.frmstOuter.cols = \"200,*\"\r\n");
      out.write("\t\t\tparent.document.all ('leftFrame').noResize = false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tvar firstId=null;\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body ondblclick=\"ToggleNav();\"> \r\n");
      out.write("\t<div id=menuContainer> \r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt> \r\n");
      out.write("\t\t\t\t<div>库信息统计</div>\r\n");
      out.write("\t\t\t\t<span ></span>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"ReportAction.do?method=listGeneralInfo\" target=\"rightFrame\">库总体信息</a></li>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"null.htm\" target=\"rightFrame\">相邻库信息</a></li>\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"null.htm\" target=\"rightFrame\">按条件统计</a></li>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt> \r\n");
      out.write("\t\t\t\t<div>构件信息统计</div>\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"ReportAction.do?method=listRSC\" target=\"rightFrame\">可用RSC清单</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"null.htm\" target=\"rightFrame\">复用统计清单</a></li>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"ReportAction.do?method=listCheckoutByOrder\" target=\"rightFrame\">构件下载排行榜</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"null.htm\" target=\"rightFrame\">构件信息统计</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt> \r\n");
      out.write("\t\t\t\t<div>用户信息统计</div>\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"null.htm\" target=\"rightFrame\">角色与权限信息</a></li>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"ReportAction.do?method=listUserStatics\" target=\"rightFrame\">用户信息统计</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<div id=\"divCollapsedNav\" class=\"navTocColor\" style=\"display:none;width:100%;height:100%;\"> \r\n");
      out.write("<a href=\"javascript:ToggleNav();\" title=\"展开导航框架\" id=\"linkNavClosed\"><img src=\"images/toc2.gif\" alt=\"展开导航框架\" border=\"0\"></a> \r\n");
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
