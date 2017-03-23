package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showTask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005findexId_005fid_005fcollection;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005findexId_005fid_005fcollection = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005findexId_005fid_005fcollection.release();
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

    java.lang.Object _jspx_e_1 = null;
    java.lang.Integer _jspx_ind_1 = null;

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
          out.write("<html>\r\n");
          out.write("\t<head>\r\n");
          out.write("\t\t<title>工作流列表</title>\r\n");
          out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
          out.write("\t\t<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
          out.write("\t\t<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t</head>\r\n");
          out.write("\t<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=mainbody>\r\n");
          out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t工作流配置\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t</table>\t\r\n");
          out.write("\t\t<hr color=#97D2FF>\r\n");
          out.write("\t\t<div class=list>\r\n");
          out.write("\t\t<table border=\"0\">\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"20%\">\r\n");
          out.write("\t\t\t\t\t\t工作流名称\r\n");
          out.write("\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"30%\">\r\n");
          out.write("\t\t\t\t\t\t工作流介绍\r\n");
          out.write("\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t\t<th align=\"center\" colspan='1' width=\"50%\">\r\n");
          out.write("\t\t\t\t\t\t可配置的任务\r\n");
          out.write("\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_logic_005fiterate_005f0.setId("element");
          _jspx_th_logic_005fiterate_005f0.setName("taskList");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object element = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            element = (java.lang.Object) _jspx_page_context.findAttribute("element");
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t<td align=\"center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ element.xml }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td align=\"center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ element.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
              out.write("\t\t\t\t\t\t<table>\r\n");
              out.write("\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005findexId_005fid_005fcollection.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              _jspx_th_logic_005fiterate_005f1.setId("e");
              _jspx_th_logic_005fiterate_005f1.setIndexId("ind");
              _jspx_th_logic_005fiterate_005f1.setCollection((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.taskList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
              int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object e = null;
                java.lang.Integer ind = null;
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f1.doInitBody();
                }
                e = (java.lang.Object) _jspx_page_context.findAttribute("e");
                ind = (java.lang.Integer) _jspx_page_context.findAttribute("ind");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t<tr align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"80%\">");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\" width=\"20%\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"workflowAction.do?method=preOrganizationTask&task=");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("&xml=");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.xml}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\" >\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/icon/icon_dianping.gif\" width=\"16\" height=\"16\" alt=\"配置\" title=\"配置\" border=\"0\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                  e = (java.lang.Object) _jspx_page_context.findAttribute("e");
                  ind = (java.lang.Integer) _jspx_page_context.findAttribute("ind");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005findexId_005fid_005fcollection.reuse(_jspx_th_logic_005fiterate_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005findexId_005fid_005fcollection.reuse(_jspx_th_logic_005fiterate_005f1);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t</table>\r\n");
              out.write("\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              element = (java.lang.Object) _jspx_page_context.findAttribute("element");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write(" \r\n");
          out.write("\t\t\t</table>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t</body>\r\n");
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
