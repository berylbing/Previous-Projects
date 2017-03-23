package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jbpm.api.ProcessInstance;

public final class pendingAudit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
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

    java.lang.Object _jspx_ele_1 = null;

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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>工作流查看</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=mainbody>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>待审批表单</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t<hr color=#97D2FF>\r\n");
      out.write("<div class=list>\r\n");
      out.write("  <table id=ta>\r\n");
      out.write("    <tr> \r\n");
      out.write("      <th width=\"20%\">登记号</th>\r\n");
      out.write("      <th width=\"20%\">当前任务名称</th> \r\n");
      out.write("      <th width=\"20%\">所属的工作流</th> \r\n");
      out.write("      <th width=\"20%\">申请人</th>             \r\n");
      out.write("      <th width=\"20%\">操作</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("element");
      _jspx_th_logic_005fiterate_005f0.setName("tasks");
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
          out.write("    \r\n");
          out.write("    <tr> \r\n");
          out.write("      <td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("      <td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.task.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("      <td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>   \r\n");
          out.write("      <td align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.owner}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>     \r\n");
          out.write("      <td align=\"center\">\r\n");
          out.write("      ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
          _jspx_th_logic_005fiterate_005f1.setId("ele");
          _jspx_th_logic_005fiterate_005f1.setName("element");
          _jspx_th_logic_005fiterate_005f1.setProperty("out");
          int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object ele = null;
            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f1.doInitBody();
            }
            ele = (java.lang.Object) _jspx_page_context.findAttribute("ele");
            do {
              out.write("\r\n");
              out.write("\t\t\t<a href=\"jbpmTest.do?method=Go&name=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("&go=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ele}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('"');
              out.write('>');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ele}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</a>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
              ele = (java.lang.Object) _jspx_page_context.findAttribute("ele");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
          out.write("\r\n");
          out.write("\t\t<a href=\"../");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.actionName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">查看详细信息</a>\r\n");
          out.write("      </td>\r\n");
          out.write("    </tr>\r\n");
          out.write("\t");
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
      out.write("\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<hr color=#97D2FF>\r\n");
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
