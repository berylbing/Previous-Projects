package org.apache.jsp.specification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectReason_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fcheckbox_0026_005fvalue_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_0026_005fvalue_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_0026_005fvalue_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.release();
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
      out.write("<title>选择所依据的申请单</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function save(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar s= document.getElementsByName(\"id\");\r\n");
      out.write("\t\tvar s2=\"\";\r\n");
      out.write("\t\tfor(var i=0;i<s.length;i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(s[i].checked)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\ts2=s2+s[i].value+\",\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\ts2=s2.substr(0,s2.length-1);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twindow.opener.document.getElementById(\"_Reasons\").innerHTML = s2;\r\n");
      out.write("\t\twindow.opener.document.getElementsByName(\"specification.reason\")[0].value = s2;\r\n");
      out.write("\t\twindow.close();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("function onload()\r\n");
      out.write("{\r\n");
      out.write("\tvar s= document.getElementsByName(\"id\");\r\n");
      out.write("\tvar temp = location.search.substr(1).split(\"&\");\r\n");
      out.write("\tif(temp.length>2){\r\n");
      out.write("\t\ttemp = temp[2].split(\"=\");\r\n");
      out.write("\t\tvar reasons = temp[1].split(\",\");\r\n");
      out.write("\t\tfor(var i=0;i<s.length;i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\ts[i].checked = false;\r\n");
      out.write("\t\t\tfor(var j=0; j<reasons.length;j++)\r\n");
      out.write("       \t\t\tif(s[i].value== reasons[j])s[i].checked=true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\ta { cursor:hand; }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"onload()\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tclass=mainbody>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=title>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>已审批的申请单</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<hr color=#97D2FF>\r\n");
      out.write("\r\n");
      out.write("<div class=list>\r\n");
      out.write("  <table border=\"0\" id=\"ta\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th width=\"12%\" height=\"26\">\r\n");
      out.write("\t\t\t<input type=\"checkbox\" name=\"boxa\" value=\"checkbox\" onclick=\"checkBoxAll('id')\">\r\n");
      out.write("\t  </th>                \r\n");
      out.write("      <th align=\"center\">登记号</th>\r\n");
      out.write("       <th align=\"center\">申请人</th> \r\n");
      out.write("        <th align=\"center\">申请时间</th> \r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("    </tr>\r\n");
      out.write("  \t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("element");
      _jspx_th_logic_005fiterate_005f0.setName("specificationmodifyList");
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
          out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_html_005fcheckbox_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.registryId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\r\n");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write(" </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<table align=\"left\" width=\"100%\">\r\n");
      out.write("      <tr> \r\n");
      out.write("      <td align=\"left\">\r\n");
      out.write("        <input name=\"button22\" type=\"button\" class=\"input_button\" onClick=\"save()\" value=\" 确定 \">&nbsp;&nbsp;\r\n");
      out.write("      </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</script>     \r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_html_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_005fcheckbox_005f0 = (org.apache.struts.taglib.html.CheckboxTag) _005fjspx_005ftagPool_005fhtml_005fcheckbox_0026_005fvalue_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_html_005fcheckbox_005f0.setName("element");
    _jspx_th_html_005fcheckbox_005f0.setProperty("id");
    _jspx_th_html_005fcheckbox_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.registryId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fcheckbox_005f0 = _jspx_th_html_005fcheckbox_005f0.doStartTag();
    if (_jspx_th_html_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fcheckbox_0026_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fcheckbox_0026_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fcheckbox_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("element");
    _jspx_th_bean_005fwrite_005f0.setProperty("dateOfInformation");
    _jspx_th_bean_005fwrite_005f0.setFormat("yyyy-MM-dd");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fformat_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }
}
