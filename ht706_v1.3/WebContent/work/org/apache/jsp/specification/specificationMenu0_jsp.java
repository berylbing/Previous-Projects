package org.apache.jsp.specification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class specificationMenu0_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt> \r\n");
      out.write("\t\t\t\t<div>规约管理</div>\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"SpecificationAction.do?method=listSpecification\" target=\"rightFrame\">规约建立与查询</a></li>\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"specificationStaticsDetail.jsp\" target=\"rightFrame\">信息统计</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt> \r\n");
      out.write("\t\t\t\t<div>同步规约</div>\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"specifiactionSycn.jsp\" target=\"rightFrame\">待同步规约</a></li>\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"specifiactionReleaseState.jsp\" target=\"rightFrame\">规约发布情况</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<dl>\r\n");
      out.write("\t\t\t<dt> \r\n");
      out.write("\t\t\t\t<div>规约变更</div>\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dd> \r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"SpecificationmodifyAction.do?method=listSpecificationmodify&select=search\" target=\"rightFrame\">查看变更申请单</a></li>\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"SpecificationmodifyAction.do?method=listSpecificationmodify&select=edit\" target=\"rightFrame\">建立变更申请单</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</dd>\r\n");
      out.write("\t\t</dl>\t\t\r\n");
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
