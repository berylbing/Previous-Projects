package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedbackByStatics_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>软件构件库管理系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\ta { cursor:hand; }\r\n");
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
      out.write("\t\t<td>构件反馈统计</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr color=#97D2FF>\r\n");
      out.write("\r\n");
      out.write("<div class=list>\r\n");
      out.write("<!-- \r\n");
      out.write("  <table border=\"0\" id=\"ta\">\r\n");
      out.write("    <tr>            \r\n");
      out.write("      <th align=\"center\">序号</th>       \r\n");
      out.write("      <th align=\"center\">构件名称</th>\r\n");
      out.write("      <th align=\"center\">有效反馈次数</th>     \r\n");
      out.write("      <th align=\"center\">平均得分</th>    \r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    <tr>         \r\n");
      out.write("      <td align=\"left\" width='30'>1</td>\r\n");
      out.write("      <td align=\"left\" width='220'><a onclick=\"detail()\">雷达构件</a></td>      \r\n");
      out.write("      <td align=\"left\" width='80'>2</td>\r\n");
      out.write("      <td align=\"center\" width='60'>90</td>      \r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>         \r\n");
      out.write("      <td align=\"left\" width='30'>2</td>\r\n");
      out.write("      <td align=\"left\" width='220'><a onclick=\"detail()\">计算构件</a></td>      \r\n");
      out.write("      <td align=\"left\" width='80'>1</td>\r\n");
      out.write("      <td align=\"center\" width='60'>80</td>      \r\n");
      out.write("    </tr>\r\n");
      out.write("   \r\n");
      out.write("    <tr>          \r\n");
      out.write("      <td align=\"left\" width='30'>3</td>\r\n");
      out.write("      <td align=\"left\" width='220'><a onclick=\"detail()\">指令构件</a></td>      \r\n");
      out.write("      <td align=\"left\" width='80'>1</td>\r\n");
      out.write("      <td align=\"center\" width='60'>90</td>      \r\n");
      out.write("    </tr>    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <tr>      \r\n");
      out.write("      <td align=\"left\" width='30'>4</td>\r\n");
      out.write("      <td align=\"left\" width='220'><a onclick=\"detail()\">控制构件</a></td>      \r\n");
      out.write("      <td align=\"left\" width='80'>1</td>\r\n");
      out.write("      <td align=\"center\" width='60'>100</td>      \r\n");
      out.write("    </tr>        \r\n");
      out.write("\r\n");
      out.write(" </table>\r\n");
      out.write("  -->\r\n");
      out.write(" \t<table border=\"0\" id=\"ta\">\r\n");
      out.write("\t    <tr>            \r\n");
      out.write("\t     <th align=\"center\">序号</th>       \r\n");
      out.write("\t      <th align=\"center\">构件名称</th>\r\n");
      out.write("\t      <th align=\"center\">有效反馈次数</th>     \r\n");
      out.write("\t      <th align=\"center\">平均得分</th>        \r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t   \r\n");
      out.write("\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("feedbackStatics");
      _jspx_th_logic_005fiterate_005f0.setName("feedbackStaticsList");
      _jspx_th_logic_005fiterate_005f0.setIndexId("index");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object feedbackStatics = null;
        java.lang.Integer index = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        feedbackStatics = (java.lang.Object) _jspx_page_context.findAttribute("feedbackStatics");
        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
        do {
          out.write("\r\n");
          out.write("\t\t    <tr>         \r\n");
          out.write("\t\t      <td align=\"center\" width='30'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t      <td align=\"center\" width='220'><a href=\"feedback.do?method=listFeedback&recordId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feedback.recordId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feedbackStatics.asset.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>      \r\n");
          out.write("\t\t      <td align=\"center\" width='80'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feedbackStatics.feedbackTimes}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>      \r\n");
          out.write("\t\t      <td align=\"center\" width='60'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${feedbackStatics.averageScore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t    </tr>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          feedbackStatics = (java.lang.Object) _jspx_page_context.findAttribute("feedbackStatics");
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
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!--\r\n");
      out.write("<table border=0 width='100%' cellSpacing=6>\r\n");
      out.write("\t<tr>\t\r\n");
      out.write("\t\t<td align=\"right\" colspan=4>\r\n");
      out.write("\t\t\t<input type='button' value=' 导 出 ' class=\"input_button\" onclick=\"excel()\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type='button' value=' 选 择 ' class=\"input_button\" onclick=\"selectComponent()\">\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("  -->\r\n");
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
