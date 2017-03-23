package org.apache.jsp.forum;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageBulletin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/forum/foot.jsp");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.release();
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<script src=\"js/common.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<title>构件库论坛</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div id=\"forumInfo\">\r\n");
      out.write("\t\t\t\t<div id=\"userInfo\">\r\n");
      out.write("\t\t\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.do?method=adminIndex\">管理首页</a> &raquo; \r\n");
      out.write("\t\t\t\t\t\t管理公告信息\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("bulletin");
      _jspx_th_logic_005fiterate_005f0.setName("ForumBulletinForm");
      _jspx_th_logic_005fiterate_005f0.setProperty("forumBulletinList");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object bulletin = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        bulletin = (java.lang.Object) _jspx_page_context.findAttribute("bulletin");
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<div class=\"announcements\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"announcementinfo\">\r\n");
          out.write("\t\t\t\t\t\t\t<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span> b#");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.bulletinid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&nbsp;作者: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" &nbsp; 起始时间: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.joindate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t&nbsp; \r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"bulletin.do?method=deleteBulletin&bulletinId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.bulletinid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">删除公告</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"announcementmessage\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.content }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          bulletin = (java.lang.Object) _jspx_page_context.findAttribute("bulletin");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"managelink\">\r\n");
      out.write("\t\t\t\t<a href=\"/HT706_v1.2/forum/postBulletin.jsp\" >发布新公告</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p id=\"copyright\">\r\n");
      out.write("\t\tPowered by <strong><a href=\"http://www.xjtu.edu.cn\" target=\"_blank\">xjtuse</a></strong>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
