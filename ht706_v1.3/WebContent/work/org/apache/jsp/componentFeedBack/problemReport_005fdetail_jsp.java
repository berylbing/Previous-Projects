package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class problemReport_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>构件问题报告</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction change() {\r\n");
      out.write("\r\n");
      out.write("\t}\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tclass=mainbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=title>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"left\"><span id=\"componentName\"><font color=\"red\">构件问题报告</font></span></td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"hid\">\r\n");
      out.write("\r\n");
      out.write("<div class=editblock >\r\n");
      out.write("<table border=\"0\">\r\n");
      out.write("     <tr><th colspan=\"4\">构件问题报告单</th></tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("        <td width=\"15%\" align=\"center\">问题编号<font color=\"red\">*</font></td>\r\n");
      out.write("        <td width=\"35%\" align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.reportId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        <td align=\"center\">报告人<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.reporter}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("       \r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("        <td align=\"center\">应用项目<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.project}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        <td align=\"center\">报告人单位<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.dept}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("        \r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("        <td align=\"center\">危害程度<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("        \t\t");
      if (_jspx_meth_logic_005fequal_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</td>           \r\n");
      out.write("        <td align=\"center\">解决状态<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fequal_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("        <td align=\"center\">发现日期<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.discoveryDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\t    \r\n");
      out.write("        <td align=\"center\">报告日期<font color=\"red\">*</font></td>\r\n");
      out.write("        <td align=\"left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.reportDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\t    \r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"15%\" align=\"center\">应用背景<font color=\"red\">*</font></td>\r\n");
      out.write("           <td colspan=\"3\" width=\"85%\" height=\"50\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.background}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"15%\" align=\"center\">问题描述<font color=\"red\">*</font></td>\r\n");
      out.write("           <td colspan=\"3\" width=\"85%\" height=\"50\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"15%\" align=\"center\">修改建议</td>\r\n");
      out.write("           <td colspan=\"3\" width=\"85%\" height=\"50\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.suggestion}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"15%\" align=\"center\">附件</td>\r\n");
      out.write("           <td colspan=\"3\" width=\"85%\"><a href=\"#\" onclick=\"window.open('excel/按考核对象统计.xls')\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemReport.file}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></td>\r\n");
      out.write("         </tr>         \r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<input type='button' value=' 返  回 ' class=\"input_button\" onclick=\"window.history.back()\">&nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_logic_005fequal_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent(null);
    _jspx_th_logic_005fequal_005f0.setName("problemReport");
    _jspx_th_logic_005fequal_005f0.setProperty("harm");
    _jspx_th_logic_005fequal_005f0.setValue("1");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('轻');
        out.write('微');
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent(null);
    _jspx_th_logic_005fequal_005f1.setName("problemReport");
    _jspx_th_logic_005fequal_005f1.setProperty("harm");
    _jspx_th_logic_005fequal_005f1.setValue("2");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('一');
        out.write('般');
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent(null);
    _jspx_th_logic_005fequal_005f2.setName("problemReport");
    _jspx_th_logic_005fequal_005f2.setProperty("harm");
    _jspx_th_logic_005fequal_005f2.setValue("3");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('严');
        out.write('重');
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent(null);
    _jspx_th_logic_005fequal_005f3.setName("problemReport");
    _jspx_th_logic_005fequal_005f3.setProperty("status");
    _jspx_th_logic_005fequal_005f3.setValue("0");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('待');
        out.write('解');
        out.write('决');
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent(null);
    _jspx_th_logic_005fequal_005f4.setName("problemReport");
    _jspx_th_logic_005fequal_005f4.setProperty("status");
    _jspx_th_logic_005fequal_005f4.setValue("1");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('已');
        out.write('解');
        out.write('决');
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
    return false;
  }
}
