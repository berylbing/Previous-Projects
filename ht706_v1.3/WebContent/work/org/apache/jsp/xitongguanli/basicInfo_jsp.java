package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basicInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.release();
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
          out.write("     <script src=\"../js/check.js\" type=\"text/javascript\"></script>  \r\n");
          out.write("     <script>\t\t\r\n");
          out.write("\t\tfunction basicInfoEdit() {\r\n");
          out.write("                     location.href = \"basicInfoAction.do?method=preBasicInfoForm\";\r\n");
          out.write("\t\t}\r\n");
          out.write("     </script>     \r\n");
          out.write("             \r\n");
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
          out.write("<div class=list>\r\n");
          out.write("<table>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<th colspan=3 align=left width=\"10%\">构件库基本信息表（UDM要求）</th>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center width=\"8%\">1</td>\r\n");
          out.write("\t\t<td width=\"20%\" align=\"center\">认证方法</td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<td width=\"72%\">");
          if (_jspx_meth_nested_005fwrite_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center>2</td>\r\n");
          out.write("\t\t<td align=\"center\">联系方式</td>\t\t\r\n");
          out.write("\t\t<td>");
          if (_jspx_meth_nested_005fwrite_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center>3</td>\r\n");
          out.write("\t\t<td align=\"center\">电子地址</td>\r\n");
          out.write("\t\t<td>");
          if (_jspx_meth_nested_005fwrite_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center>4</td>\r\n");
          out.write("\t\t<td align=\"center\">库分类机制</td>\t\t\r\n");
          out.write("\t\t<td>");
          if (_jspx_meth_nested_005fwrite_005f3(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center>5</td>\r\n");
          out.write("\t\t<td align=\"center\">库度量</td>\r\n");
          out.write("\t\t<td>");
          if (_jspx_meth_nested_005fwrite_005f4(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center>6</td>\r\n");
          out.write("\t\t<td align=\"center\">库限定</td>\r\n");
          out.write("\t\t<td>");
          if (_jspx_meth_nested_005fwrite_005f5(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\t\r\n");
          out.write("</table>\r\n");
          out.write("</div>\r\n");
          out.write("<div class=list>\r\n");
          out.write("<table>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<th colspan=3 align=left>其它信息表</th>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=center width=\"8%\">1</td>\r\n");
          out.write("\t\t<td width=\"20%\" align=\"center\">库建立时间</td>\r\n");
          out.write("\t\t<td width=\"72%\">");
          if (_jspx_meth_nested_005fwrite_005f6(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_logic_005fiterate_005f0.setId("element");
          _jspx_th_logic_005fiterate_005f0.setName("AdminList");
          _jspx_th_logic_005fiterate_005f0.setIndexId("index");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object element = null;
            java.lang.Integer index = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            element = (java.lang.Object) _jspx_page_context.findAttribute("element");
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\t<tr>\r\n");
              out.write("\t\t\t<td align=center width=\"8%\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index+2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t<td width=\"20%\" align=\"center\">库管理员</td>\r\n");
              out.write("\t\t\t<td width=\"72%\">");
              if (_jspx_meth_nested_005fwrite_005f7(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              element = (java.lang.Object) _jspx_page_context.findAttribute("element");
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write(" \r\n");
          out.write("\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("  <div id=bc align=right>\r\n");
          out.write("  \t<input onclick='basicInfoEdit()' type=button value=' 编 辑 ' class='input_button'>  \t\r\n");
          out.write("  </div><br>\r\n");
          out.write("\r\n");
          out.write("</body>\r\n");
          out.write("\r\n");
          out.write("</html>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_nested_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f0 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f0.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f0.setProperty("library.certificationMethods");
    int _jspx_eval_nested_005fwrite_005f0 = _jspx_th_nested_005fwrite_005f0.doStartTag();
    if (_jspx_th_nested_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f1 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f1.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f1.setProperty("library.contactMethod");
    int _jspx_eval_nested_005fwrite_005f1 = _jspx_th_nested_005fwrite_005f1.doStartTag();
    if (_jspx_th_nested_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f2 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f2.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f2.setProperty("library.electronicAddress");
    int _jspx_eval_nested_005fwrite_005f2 = _jspx_th_nested_005fwrite_005f2.doStartTag();
    if (_jspx_th_nested_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f3 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f3.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f3.setProperty("library.libraryClassificationMechanism");
    int _jspx_eval_nested_005fwrite_005f3 = _jspx_th_nested_005fwrite_005f3.doStartTag();
    if (_jspx_th_nested_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f4 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f4.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f4.setProperty("library.libraryMetrics");
    int _jspx_eval_nested_005fwrite_005f4 = _jspx_th_nested_005fwrite_005f4.doStartTag();
    if (_jspx_th_nested_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f5 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f5.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f5.setProperty("library.libraryRestrications");
    int _jspx_eval_nested_005fwrite_005f5 = _jspx_th_nested_005fwrite_005f5.doStartTag();
    if (_jspx_th_nested_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f6 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_nested_005fwrite_005f6.setName("BasicInfoForm");
    _jspx_th_nested_005fwrite_005f6.setProperty("dateOfCreation");
    int _jspx_eval_nested_005fwrite_005f6 = _jspx_th_nested_005fwrite_005f6.doStartTag();
    if (_jspx_th_nested_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_nested_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f7 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_nested_005fwrite_005f7.setName("element");
    _jspx_th_nested_005fwrite_005f7.setProperty("organization.name");
    int _jspx_eval_nested_005fwrite_005f7 = _jspx_th_nested_005fwrite_005f7.doStartTag();
    if (_jspx_th_nested_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f7);
    return false;
  }
}
