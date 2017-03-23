package org.apache.jsp.forum;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postThreadDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/forum/head.jsp");
    _jspx_dependants.add("/forum/foot.jsp");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.release();
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
      out.write("   \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("\t<title>构件库论坛</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../js/fckeditor/fckeditor.js\"></script>\r\n");
      out.write("\t<script src=\"../js/common.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.mainbox {border: 1px solid #CAD9EA; padding: 0px; margin-bottom: 10px;} /* 定义 边框 内边距 底外边距 */\r\n");
      out.write("\t\t\t.mainbox h3{ line-height:20px; padding-left:1em;background: #409bdd url(\"../images/forum/header_head.gif\"); background-repeat: repeat-x; background-position: 0 0; color: #FFF;}\r\n");
      out.write("\t\t\t.mainbox table { width: 100%; }\r\n");
      out.write("\t\t\t.mainbox tbody th, .mainbox tbody td { border-top: 1px solid #CAD9EA; padding: 5px; }\r\n");
      out.write("\t\t\t.mainbox tbody cite, .mainbox tbody em { line-height: 1.3em; }\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tfunction postCheck(){\r\n");
      out.write("\t\t\t\tvar oEditor = FCKeditorAPI.GetInstance('content');\r\n");
      out.write("\t\t\t\tvar oDOM = oEditor.EditorDocument;\r\n");
      out.write("\t\t\t\tvar content = oDOM.body.innerText;\r\n");
      out.write("\t\t\t\tif(trim(content).length<1){\r\n");
      out.write("\t\t\t\t\talert(\"请输内容!\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"content\").value=content;\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"ForumPublishThreadForm\").submit();\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction trim(string){\r\n");
      out.write("  \t\t\t return string.replace(/\\s/g,\"\");\r\n");
      out.write(" \t\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<h2>\r\n");
      out.write("\t\t<a href=\"index.do?method=viewIndex\" title=\"构件库论坛\"><img src=\"../images/logo.gif\" border='0' /></a>\r\n");
      out.write("\t</h2>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"foruminfo\">\r\n");
      out.write("\t\t\t\t<div id=\"userinfo\">\r\n");
      out.write("\t\t\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.do?method=viewIndex\">构件库论坛</a> &raquo; \r\n");
      out.write("\t\t\t\t\t\t<a href=\"forum.do?method=viewForum&forumId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumPublishThreadForm.forumId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumPublishThreadForm.forumName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a> &raquo; \r\n");
      out.write("\t\t\t\t\t\t<a href=\"topic.do?forumId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumPublishThreadForm.forumId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&topicId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumPublishThreadForm.topicId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumPublishThreadForm.topicName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a> &raquo;\r\n");
      out.write("\t\t\t\t\t\t回复主题 \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p id=\"copyright\">\r\n");
      out.write("\t\tPowered by <strong><a href=\"http://www.xjtu.edu.cn\" target=\"_blank\">xjtuse</a></strong>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setAction("/forum/publishThread.do");
    _jspx_th_html_005fform_005f0.setMethod("post");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div class=\"mainbox formbox\">\r\n");
        out.write("\t\t\t\t\t<h3>\r\n");
        out.write("\t\t\t\t\t\t编辑回复\r\n");
        out.write("\t\t\t\t\t</h3>\r\n");
        out.write("\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\">\r\n");
        out.write("\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t<th valign=\"top\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t内容\r\n");
        out.write("\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<script type=\"text/javascript\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar sBasePath = \"../js/fckeditor/\" ;\r\n");
        out.write("\t\t\t\t\t\t\t\t\tvar oFCKeditor = new FCKeditor(\"content\") ;\r\n");
        out.write("\t\t\t\t\t\t\t\t\toFCKeditor.BasePath\t= sBasePath ;\r\n");
        out.write("\t\t\t\t\t\t\t\t\toFCKeditor.ToolbarSet = 'Forum' ;\r\n");
        out.write("\t\t\t\t\t\t\t\t\toFCKeditor.Height = \"300\";\r\n");
        out.write("\t\t\t\t\t\t\t\t\toFCKeditor.Width = \"800\";\r\n");
        out.write("\t\t\t\t\t\t\t\t\toFCKeditor.Value\t=\" \";\r\n");
        out.write("\t\t\t\t\t\t\t\t\toFCKeditor.Create() ;\r\n");
        out.write("\t\t\t\t\t\t\t\t</script>\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t<tr class=\"btns\">\r\n");
        out.write("\t\t\t\t\t\t\t<th>\r\n");
        out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
        out.write("\t\t\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t\t<button type=\"button\" name=\"topicsubmit\" id=\"postsubmit\" onclick=\"postCheck()\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t发表回复\r\n");
        out.write("\t\t\t\t\t\t\t\t</button>\r\n");
        out.write("\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<br />\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005fhidden_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005fhidden_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f0.setProperty("content");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f1.setProperty("topicId");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f2.setProperty("forumId");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }
}
