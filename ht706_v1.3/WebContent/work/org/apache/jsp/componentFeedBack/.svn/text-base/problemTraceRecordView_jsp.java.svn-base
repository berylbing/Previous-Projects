package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class problemTraceRecordView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.release();
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
      out.write("<title>构件问题报告追踪</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("\tfunction problemQuery(rid){\r\n");
      out.write("     \twindow.location = \"../componentFeedBack/problemReport.do?method=listProblemReport&RID=\" + rid;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\timg { cursor:hand; }\r\n");
      out.write("\ta { cursor:hand; }\r\n");
      out.write("\tdl { margin:0; margin-bottom:0 }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tclass=mainbody>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=title>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>问题跟踪记录</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<hr color=#97D2FF>\r\n");
      out.write("\r\n");
      out.write("<div class=list>\r\n");
      out.write("  <table border=\"0\" id=\"ta\">\r\n");
      out.write("    <tr>               \r\n");
      out.write("      <th align=\"center\">问题编号</th>\r\n");
      out.write("      <th align=\"center\">责任人</th>      \r\n");
      out.write("      <th align=\"center\">执行日期</th>\r\n");
      out.write("      <th align=\"center\">执行内容</th>      \r\n");
      out.write("      <th align=\"center\">解决状态</th>    \r\n");
      out.write("    </tr>\r\n");
      out.write("   ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("problemTrace");
      _jspx_th_logic_005fiterate_005f0.setName("problemTraceList");
      _jspx_th_logic_005fiterate_005f0.setIndexId("index");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object problemTrace = null;
        java.lang.Integer index = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        problemTrace = (java.lang.Object) _jspx_page_context.findAttribute("problemTrace");
        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
        do {
          out.write("\r\n");
          out.write("\t   <tr>\r\n");
          out.write("\t      <td align=\"center\" width='120'><a onclick=\"problemQuery('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemTrace.problemreport.recordId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemTrace.reportId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td> \r\n");
          out.write("\t      <td align=\"center\" width='60'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemTrace.person}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t      <td align=\"center\" width='80'>");
          if (_jspx_meth_nested_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("\t      <td align=\"center\" width='90'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${problemTrace.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t        <!-- 解决状态还不确定 -->\r\n");
          out.write("\t      <td align=\"center\" width='60'>\r\n");
          out.write("\t      \t\t");
          if (_jspx_meth_logic_005fequal_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t      </td>\r\n");
          out.write("\t   </tr> \t\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          problemTrace = (java.lang.Object) _jspx_page_context.findAttribute("problemTrace");
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
      out.write("\r\n");
      out.write("   \r\n");
      out.write(" </table>\r\n");
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

  private boolean _jspx_meth_nested_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:write
    org.apache.struts.taglib.nested.bean.NestedWriteTag _jspx_th_nested_005fwrite_005f0 = (org.apache.struts.taglib.nested.bean.NestedWriteTag) _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.nested.bean.NestedWriteTag.class);
    _jspx_th_nested_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_nested_005fwrite_005f0.setName("problemTrace");
    _jspx_th_nested_005fwrite_005f0.setProperty("dateOfInformation");
    int _jspx_eval_nested_005fwrite_005f0 = _jspx_th_nested_005fwrite_005f0.doStartTag();
    if (_jspx_th_nested_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_nested_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_logic_005fequal_005f0.setName("problemTrace");
    _jspx_th_logic_005fequal_005f0.setProperty("status");
    _jspx_th_logic_005fequal_005f0.setValue("0");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('待');
        out.write('解');
        out.write('决');
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

  private boolean _jspx_meth_logic_005fequal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_logic_005fequal_005f1.setName("problemTrace");
    _jspx_th_logic_005fequal_005f1.setProperty("status");
    _jspx_th_logic_005fequal_005f1.setValue("1");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('已');
        out.write('解');
        out.write('决');
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
}
