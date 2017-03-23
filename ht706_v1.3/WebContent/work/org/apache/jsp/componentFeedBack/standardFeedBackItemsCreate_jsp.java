package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class standardFeedBackItemsCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>软件构件库管理系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction w_open(v,iId,sid,path){\r\n");
      out.write("\r\n");
      out.write("            if(v==0) {\r\n");
      out.write("            \twindow.location = path + \"/componentFeedBack/standardFeedback.do?method=preModifyStandardFeedbackItem&SfId=\" + sid + \"&itemId=\" + iId;\t\r\n");
      out.write("            } else { \r\n");
      out.write("               window.location = path + \"/componentFeedBack/standardFeedback.do?method=deleteStandardFeedbackItem&SfId=\" + sid + \"&itemId=\" + iId;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tclass=mainbody>\r\n");
      out.write("\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      _jspx_th_html_005fform_005f0.setMethod("post");
      _jspx_th_html_005fform_005f0.setAction("/componentFeedBack/standardFeedback.do?");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
          out.write("\tclass=title>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=\"left\">新建标准反馈项</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("<div class=list>\r\n");
          out.write("<table border=\"0\">\r\n");
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t  <th align=\"center\" width=\"5%\">序号</th>\r\n");
          out.write("\t  <th align=\"center\" colspan='2' width=\"25%\">考核内容</th>\r\n");
          out.write("\t  <th align=\"center\" width=\"10%\">分值</th>\r\n");
          out.write("\t  <th align=\"center\" width=\"35%\">评分细则</th>\r\n");
          out.write("\t  <th align=\"center\" width=\"20%\">备注</th>\r\n");
          out.write("\t  <th align=\"center\" width=\"5%\">操作</th> \r\n");
          out.write("\t</tr>\r\n");
          out.write("\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_logic_005fiterate_005f0.setId("standardFeedbackItem");
          _jspx_th_logic_005fiterate_005f0.setName("standardFeedbackItems");
          _jspx_th_logic_005fiterate_005f0.setIndexId("index");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object standardFeedbackItem = null;
            java.lang.Integer index = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            standardFeedbackItem = (java.lang.Object) _jspx_page_context.findAttribute("standardFeedbackItem");
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            do {
              out.write("\r\n");
              out.write("\t\t<tr>\r\n");
              out.write("\t\t\t<td align=\"center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t<td align=\"center\">\r\n");
              out.write("\t\t\t   <b>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.itemName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</b><br>\r\n");
              out.write("\t\t\t</td>\r\n");
              out.write("\t\t\t<td align=\"center\">\r\n");
              out.write("\t\t\t   <b>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.itemFunction.funcName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</b><br>\r\n");
              out.write("\t\t\t</td>\r\n");
              out.write("\t\t\t<td align=\"center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.scoreStandard}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t<td align=\"center\">\r\n");
              out.write("\t\t\t   ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("   \t\t   \t   \r\n");
              out.write("\t\t\t</td>\r\n");
              out.write("\t\t\t<td align=\"center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\r\n");
              out.write("\t\t\t</td>\t\t\r\n");
              out.write("\t\t\t<td align=\"center\"><img onclick=\"w_open(0,'");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.itemId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SfId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\" src=\"../images/icon/icon_dianping.gif\" width=\"16\" height=\"16\" border=\"0\">&nbsp;&nbsp;&nbsp;<img onclick=\"w_open(1,'");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${standardFeedbackItem.itemId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SfId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\" src=\"../images/icon/del.gif\" width=\"16\" height=\"16\" border=\"0\"></td>\t \r\n");
              out.write("\t\t\r\n");
              out.write("\t\t</tr>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              standardFeedbackItem = (java.lang.Object) _jspx_page_context.findAttribute("standardFeedbackItem");
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
          out.write("\t<tr>\r\n");
          out.write("\r\n");
          out.write("\t\t<td align=\"center\" colspan='2'>标准分合计：</td>\r\n");
          out.write("\t\t<td align=\"center\" width='100'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalScoreStandard}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t<td align=\"center\"></td>\r\n");
          out.write("\t\t<td align=\"center\"></td>\r\n");
          out.write("\t\t<td align=\"left\"></td>\t\t\r\n");
          out.write("\t</tr>\r\n");
          out.write("</table>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("  <div id=bc align=right>\r\n");
          out.write("      <input onclick=\"location.href='standardFeedback.do?method=preAddStandardFeedbackItem&SfId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SfId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'\" type='button' value=' 新  项 ' class=\"input_button\">&nbsp;\t\r\n");
          out.write("      <input type='button' value=' 确  定 ' class=\"input_button\" onclick=\"window.location.href='standardFeedback.do?method=listAllStandardFeedback'\">&nbsp;\t     \r\n");
          out.write("  </div><br>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
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
}
