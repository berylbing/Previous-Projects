package org.apache.jsp.specification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facetTreeBrowse_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>构件库管理系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"../js/dtree/dtree.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/dtree/dtree_NoCheckBox.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"5\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td>\r\n");
      out.write("\t    <script type=\"text/javascript\">  \r\n");
      out.write("\t    \td=new dTree('d');\r\n");
      out.write("\t    \t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("list");
      _jspx_th_logic_005fiterate_005f0.setName("facetListForm");
      _jspx_th_logic_005fiterate_005f0.setProperty("facetList");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object list = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        list = (java.lang.Object) _jspx_page_context.findAttribute("list");
        do {
          out.write("\r\n");
          out.write("\t\t\td.add('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.id.facetUuid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', // id\r\n");
          out.write("\t\t\t'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.parentNode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("',//pid\r\n");
          out.write("\t\t\t'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("',//node name\r\n");
          out.write("\t\t\t'',//url\r\n");
          out.write("\t\t\t'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("',//title\r\n");
          out.write("\t\t\t'', //Target for the node.\r\n");
          out.write("\t\t\t'',//'/HT706/images/NodeImg1.gif',\r\n");
          out.write("\t\t\t'',//'/HT706/images/NodeImg2.gif',\r\n");
          out.write("\t\t\tfalse\r\n");
          out.write("\t\t\t);\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          list = (java.lang.Object) _jspx_page_context.findAttribute("list");
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
      out.write("\t    \t\r\n");
      out.write("\t  \t\tdocument.write(d);\r\n");
      out.write("\t  \t\td.openAll();\r\n");
      out.write("\t    </script>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
