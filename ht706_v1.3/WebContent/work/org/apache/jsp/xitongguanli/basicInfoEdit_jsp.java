package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basicInfoEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.release();
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
        out.write("  <head>\r\n");
        out.write("     <title>配置构件库基本信息</title>\r\n");
        out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
        out.write("     <link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
        out.write("     <script src=\"../js/check.js\" type=\"text/javascript\"></script>     \r\n");
        out.write("     <script src=\"../js/calendar.js\" type=\"text/javascript\"></script>\r\n");
        out.write("     <script>\r\n");
        out.write("\r\n");
        out.write("\tfunction saveBasicInfo() {\r\n");
        out.write("\t\tif(checkData()){\r\n");
        out.write("\t\t\tdocument.getElementById(\"BasicInfoForm\").submit();\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\r\n");
        out.write("\tfunction checkData(){\r\n");
        out.write("\t\tif(document.getElementById(\"library.certificationMethods\").value==\"\"){alert(\"请输入'认证方法'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"library.contactMethod\").value==\"\"){alert(\"请输入'联系方式'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"library.electronicAddress\").value==\"\"){alert(\"请输入'电子地址'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"library.libraryClassificationMechanism\").value==\"\"){alert(\"请输入'库分类机制'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"library.libraryMetrics\").value==\"\"){alert(\"请输入'库度量'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"library.libraryRestrications\").value==\"\"){alert(\"请输入'库限定'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"dateOfCreation\").value==\"\"){alert(\"请输入'库建立时间'\");return false;}\r\n");
        out.write("\t\tif(document.getElementById(\"library.name\").value==\"\"){alert(\"请输入'库建立人'\");return false;}\r\n");
        out.write("\t\treturn true;\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("\t\t\t\r\n");
        out.write("</script>\r\n");
        out.write("  </head>\r\n");
        out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
        out.write("\tclass=mainbody>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
        out.write("\tclass=title>\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t\t<td>基本信息配置</td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        out.write("\r\n");
        if (_jspx_meth_html_005fform_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</body>\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_html_005fform_005f0.setAction("/xitongguanli/basicInfoAction?method=modifyBasicInfo");
    _jspx_th_html_005fform_005f0.setMethod("POST");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("<div class=editblock >\r\n");
        out.write("\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">认证方法：</th>\r\n");
        out.write("\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  </td>\r\n");
        out.write("\r\n");
        out.write("\t\t</tr>\t\t\t\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">联系方式：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">电子地址：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">库分类机制：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\t\t\t\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">库度量：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">库限定：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f5(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">库建立时间：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f6(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t</tr>\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">库建立人：</th>\r\n");
        out.write("\t\t  <td width=\"75%\"><input type=\"text\" name=\"library.name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"50\"></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        out.write("  <div id=bc align=right>\r\n");
        out.write("  \t<input onclick='saveBasicInfo()' type=\"button\" value=' 保 存 ' class='input_button'>\r\n");
        out.write("  </div><br>\r\n");
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

  private boolean _jspx_meth_nested_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f0 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f0.setProperty("library.certificationMethods");
    _jspx_th_nested_005ftext_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.certificationMethods}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005ftext_005f0 = _jspx_th_nested_005ftext_005f0.doStartTag();
    if (_jspx_th_nested_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f1 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f1.setProperty("library.contactMethod");
    _jspx_th_nested_005ftext_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.contactMethod}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005ftext_005f1 = _jspx_th_nested_005ftext_005f1.doStartTag();
    if (_jspx_th_nested_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f2 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f2.setProperty("library.electronicAddress");
    _jspx_th_nested_005ftext_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.electronicAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005ftext_005f2 = _jspx_th_nested_005ftext_005f2.doStartTag();
    if (_jspx_th_nested_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f3 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f3.setProperty("library.libraryClassificationMechanism");
    _jspx_th_nested_005ftext_005f3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.libraryClassificationMechanism}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005ftext_005f3 = _jspx_th_nested_005ftext_005f3.doStartTag();
    if (_jspx_th_nested_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f4 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f4.setProperty("library.libraryMetrics");
    _jspx_th_nested_005ftext_005f4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.libraryMetrics}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005ftext_005f4 = _jspx_th_nested_005ftext_005f4.doStartTag();
    if (_jspx_th_nested_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f5 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f5.setProperty("library.libraryRestrications");
    _jspx_th_nested_005ftext_005f5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.library.libraryRestrications}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005ftext_005f5 = _jspx_th_nested_005ftext_005f5.doStartTag();
    if (_jspx_th_nested_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f6 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f6.setProperty("dateOfCreation");
    _jspx_th_nested_005ftext_005f6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bf.dateOfCreation}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_nested_005ftext_005f6.setOnfocus("calendar(this,null,null,null)");
    _jspx_th_nested_005ftext_005f6.setSize("40");
    int _jspx_eval_nested_005ftext_005f6 = _jspx_th_nested_005ftext_005f6.doStartTag();
    if (_jspx_th_nested_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_nested_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_nested_005ftext_005f6);
    return false;
  }
}
