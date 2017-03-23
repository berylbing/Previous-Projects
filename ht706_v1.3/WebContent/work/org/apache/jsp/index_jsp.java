package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
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
      if (_jspx_meth_html_005fhtml_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_html_005fhtml_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhtml_005f0.setParent(null);
    int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
    if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t<head>\r\n");
        out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
        out.write("<title>706所软件构件库管理系统</title>\r\n");
        out.write("<script>\r\n");
        out.write("\tfunction init(){\t\r\n");
        out.write("\t\tfirstId=document.getElementById(\"firstId\");\t\r\n");
        out.write("\t}\r\n");
        out.write("\t//处理点击Class\r\n");
        out.write("\tvar firstId=null;\r\n");
        out.write("\tfunction tabChang(p){\r\n");
        out.write("\t\tfirstId.className=\"\";\r\n");
        out.write("\t\tp.className=\"on\";\r\n");
        out.write("\t\tfirstId=p;\t\r\n");
        out.write("\t}\t\r\n");
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<style type=\"text/css\">\r\n");
        out.write("<!--\r\n");
        out.write("body {\r\n");
        out.write("\tmargin: 0px;\r\n");
        out.write("\t\r\n");
        out.write("\tcolor: #CCFFFF;\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("}\r\n");
        out.write("input {\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("\tcolor: #FFFFFF;\ttext-decoration: none;\r\n");
        out.write("\tbackground-color: #489fbf;\r\n");
        out.write("\tborder-top-width: 1px;\r\n");
        out.write("\tborder-right-width: 1px;\r\n");
        out.write("\tborder-bottom-width: 1px;\r\n");
        out.write("\tborder-left-width: 1px;\r\n");
        out.write("\tborder-top-style: solid;\r\n");
        out.write("\tborder-right-style: solid;\r\n");
        out.write("\tborder-bottom-style: solid;\r\n");
        out.write("\tborder-left-style: solid;\r\n");
        out.write("\tborder-top-color: #3c5e6a;\r\n");
        out.write("\tborder-right-color: #6dc6e8;\r\n");
        out.write("\tborder-bottom-color: #6dc6e8;\r\n");
        out.write("\tborder-left-color: #3c5e6a;\r\n");
        out.write("\tfont-family: Verdana;\r\n");
        out.write("\tfont-weight: bold;\r\n");
        out.write("\tletter-spacing: 0.2em;\r\n");
        out.write("}\r\n");
        out.write("#lable td {\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("\tline-height: 26px;\r\n");
        out.write("\tcolor: #ccffff;\r\n");
        out.write("\ttext-decoration: none;\r\n");
        out.write("\tborder-bottom: 1px solid #3c8ca6;\r\n");
        out.write("\ttext-indent: 1em;\r\n");
        out.write("}\r\n");
        out.write(".on{\r\n");
        out.write("\tborder-bottom: none!important;\r\n");
        out.write("\tborder-top: 1px solid #3c8ca6;\r\n");
        out.write("\tborder-right: 1px solid #3c8ca6;\r\n");
        out.write("\tborder-left: 1px solid #3c8ca6;\r\n");
        out.write("\tbackground-color: #006699;\r\n");
        out.write("\tfilter:progid:DXImageTransform.Microsoft.Gradient(gradienttype=0, startcolorstr=#3d97b4, endcolorstr=#5ab7d2);\r\n");
        out.write("}\r\n");
        out.write(".on a {\r\n");
        out.write("\tfont-size: 13px;\r\n");
        out.write("\tline-height: 26px;\r\n");
        out.write("\tfont-weight: bold!important;\r\n");
        out.write("\tcolor: #FFFFFF!important;\r\n");
        out.write("\ttext-decoration: none;\t\r\n");
        out.write("\t\r\n");
        out.write("}\r\n");
        out.write("#lable td .on a:hover{\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("\tline-height: 26px;\r\n");
        out.write("\tfont-weight: bold!important;\r\n");
        out.write("\tcolor: #FFFFFF!important;\r\n");
        out.write("\ttext-decoration: none;\t\r\n");
        out.write("\t\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("#lable td a {\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("\tcolor: #ccffff;\r\n");
        out.write("\ttext-decoration: none;\r\n");
        out.write("\t\r\n");
        out.write("}\r\n");
        out.write("#lable td a:hover {\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("\tline-height: 26px;\r\n");
        out.write("\tfont-weight: bold;\r\n");
        out.write("\tcolor: #FFFFFF;\r\n");
        out.write("\ttext-decoration: none;\t\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("-->\r\n");
        out.write("</style>\r\n");
        out.write("</head>\r\n");
        out.write("\r\n");
        out.write("<body onload=\"init()\" scroll=no>\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("<!--\r\n");
        out.write("var theForm = document.forms['form1'];\r\n");
        out.write("if (!theForm) {\r\n");
        out.write("    theForm = document.form1;\r\n");
        out.write("}\r\n");
        out.write("function __doPostBack(eventTarget, eventArgument) {\r\n");
        out.write("    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {\r\n");
        out.write("        theForm.__EVENTTARGET.value = eventTarget;\r\n");
        out.write("        theForm.__EVENTARGUMENT.value = eventArgument;\r\n");
        out.write("        theForm.submit();\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("// -->\r\n");
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("<form method=\"POST\" action=\"loginAction\" name=\"LoginForm\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\r\n");
        out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\">\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td style=\"min-height:80px;height:80px;\"></td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td height=\"407\" align=\"center\" valign=\"middle\"\r\n");
        out.write("\t\t\tbackground=\"images/log_02.jpg\">\r\n");
        out.write("\t\t<table width=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td width=\"148\" rowspan=\"3\"><img src=\"images/log_04.jpg\" width=\"148\"\r\n");
        out.write("\t\t\t\t\theight=\"407\" /></td>\r\n");
        out.write("\t\t\t\t<td height=\"203\" colspan=\"2\"><img src=\"images/log_05.jpg\"\r\n");
        out.write("\t\t\t\t\twidth=\"470\" height=\"203\" /></td>\r\n");
        out.write("\t\t\t\t<td width=\"142\" rowspan=\"3\"><img src=\"images/log_06.jpg\" width=\"142\"\r\n");
        out.write("\t\t\t\t\theight=\"407\" /></td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td width=\"367\" align=\"center\" valign=\"top\"\r\n");
        out.write("\t\t\t\t\tbackground=\"images/log_08.jpg\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
        out.write("\t\t\t\t\tid=\"lable\">\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<!--\r\n");
        out.write("\t\t\t\t\t\t<td width=\"100\" id=\"firstId\" class=\"on\" onclick=\"tabChang(this);\"><a name=\"index1.htm\" href=\"#\">系统管理员</a></td>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t-->\r\n");
        out.write("\t\t\t\t\t\t<td width=\"100\" id=\"firstId\" class=\"on\" onclick=\"tabChang(this);\"><a name=\"loginAction\" href=\"#\">管理员</a></td>\r\n");
        out.write("\t\t\t\t\t\t<td width=\"100\" class=\"\" onclick=\"tabChang(this);\"><a name=\"loginAction\" href=\"#\">普通用户</a></td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t</table>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<br />\r\n");
        out.write("\t\t\t\t<br />\r\n");
        out.write("\t\t\t\t用户名 <label><input type=\"text\" name=\"j_username\"/><br />\r\n");
        out.write("\t\t\t\t密  码 <input type=\"password\" name=\"j_password\"/>\r\n");
        out.write("\t\t\t\t  </label></td>\r\n");
        out.write("\t\t\t\t<td width=\"103\" height=\"103\" align=\"right\"><a \r\n");
        out.write("\t\t\t\t\tonclick=\"check(this)\">\r\n");
        out.write("\t\t\t\t\t<img src=\"images/log_09.jpg\" width=\"103\" height=\"103\"\r\n");
        out.write("\t\t\t\t\tborder=\"0\" /></a></td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td height=\"101\" colspan=\"2\" valign=\"bottom\"><img\r\n");
        out.write("\t\t\t\t\tsrc=\"images/log_10.jpg\" width=\"470\" height=\"101\" /></td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t\t<em></em></td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td height=\"50%\"></td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        out.write("\t</form>\r\n");
        out.write("</body>\r\n");
        out.write("<script>\r\n");
        out.write("\tfunction check(v) {\r\n");
        out.write("\t\tdocument.getElementById(\"LoginForm\").action=firstId.all.tags(\"a\")[0].name;\r\n");
        out.write("\t\tdocument.getElementById(\"LoginForm\").submit();\r\n");
        out.write("\t\t//v.href = firstId.all.tags(\"a\")[0].name;\r\n");
        out.write("\t}\r\n");
        out.write("</script>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
    return false;
  }
}
