package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class problemReport_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005fselect_0026_005fvalue_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005fselect_0026_005fvalue_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005fselect_0026_005fvalue_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.release();
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
      out.write("<script src=\"../js/calendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// 检测问题编号是否可用\r\n");
      out.write("function checkReportId()\r\n");
      out.write("{\r\n");
      out.write("\tvar reportId = document.getElementById(\"reportId\").value;\r\n");
      out.write("\tvar url = \"../componentFeedBack/problemReport.do?method=checkReportId&reportId=\" + reportId;\r\n");
      out.write("\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\txmlhttp.onreadystatechange = processor;\r\n");
      out.write("\txmlhttp.open(\"post\",url);\r\n");
      out.write("\txmlhttp.send(null);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// 处理检测编号的结果\r\n");
      out.write("function processor()\r\n");
      out.write("{\r\n");
      out.write("\tif(xmlhttp.readyState==4)\r\n");
      out.write("\t\tif(xmlhttp.status==200){\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"error\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function n_open(uuid){\r\n");
      out.write("\t// added by wanghao\r\n");
      out.write("\t// 表单验证\r\n");
      out.write("\t// reportId, project, dept, background, description, suggestion\r\n");
      out.write("\tvar error;\r\n");
      out.write("\t\r\n");
      out.write("\tif(document.getElementById(\"reportId\").value == \"\" )\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请填写问题编号\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\terror = document.getElementById(\"error\").innerText;\r\n");
      out.write("\tif(error == \"问题编号已存在 \")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"问题编号已存在\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"project\").value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请填写应用项目\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"dept\").value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请填写报告人单位\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"discoveryDate\").value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请选择发现日期\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"background\").value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请填写应用背景\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"description\").value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请填写问题描述\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"suggestion\").value == \"\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"请填写应用修改建议\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\tif(!confirm(\"提交问题报告至构件库管理员?\")) return;\r\n");
      out.write("//\tvar uuid = request.getParamater(\"AssetUUID\");\r\n");
      out.write("\tvar actionPath = \"../componentFeedBack/problemReport.do?method=create&AssetUUID=\"+uuid;\r\n");
      out.write("\tdocument.getElementById(\"ProblemReportForm\").action = actionPath;\r\n");
      out.write("\tdocument.getElementById(\"ProblemReportForm\").submit();\r\n");
      out.write("}\r\n");
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
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  <div id=bc align=right>\t\r\n");
      out.write("      <input type='button' value=' 提  交 ' class=\"input_button\" onclick=\"n_open('");
      out.print( request.getParameter("AssetUUID"));
      out.write("');\">&nbsp;\t     \r\n");
      out.write("  </div><br>\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setMethod("post");
    _jspx_th_html_005fform_005f0.setAction("/componentFeedBack/problemReport.do?method=create");
    _jspx_th_html_005fform_005f0.setEnctype("multipart/form-data");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<table border=\"0\">\r\n");
        out.write("     <tr><th colspan=\"4\">构件问题报告单</th></tr>\r\n");
        out.write("\r\n");
        out.write("     <tr>\r\n");
        out.write("        <td width=\"15%\" align=\"center\">问题编号<font color=\"red\">*</font></td>\r\n");
        out.write("        <td width=\"35%\" align=\"left\">");
        if (_jspx_meth_nested_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<label id=\"error\"></label></td>\r\n");
        out.write("     </tr>\r\n");
        out.write("     <tr>\r\n");
        out.write("        <td align=\"center\">应用项目<font color=\"red\">*</font></td>\r\n");
        out.write("        <td align=\"left\">");
        if (_jspx_meth_nested_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("        <td align=\"center\">报告人单位<font color=\"red\">*</font></td>\r\n");
        out.write("        <td align=\"left\">");
        if (_jspx_meth_nested_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("        \r\n");
        out.write("     </tr>\r\n");
        out.write("     <tr>\r\n");
        out.write("        <td align=\"center\">危害程度<font color=\"red\">*</font></td>\r\n");
        out.write("        <td align=\"left\">\r\n");
        out.write("\t\t    \t");
        if (_jspx_meth_nested_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("        \r\n");
        out.write("        </td>\r\n");
        out.write("     <td align=\"center\">发现日期<font color=\"red\">*</font></td>\r\n");
        out.write("        <td align=\"left\">\r\n");
        out.write("         ");
        if (_jspx_meth_nested_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t<img style=\"cursor:hand;\" name=\"img1\" src=\"../images/icon/calendarIcon.gif\" border=0 width=\"17\" height=\"17\" >\r\n");
        out.write("\t   \r\n");
        out.write("\t    </td>\r\n");
        out.write("     </tr>\r\n");
        out.write("\r\n");
        out.write("         <tr>\r\n");
        out.write("           <td width=\"15%\" align=\"center\">应用背景<font color=\"red\">*</font></td>\r\n");
        out.write("           <td colspan=\"3\" width=\"85%\">\r\n");
        out.write("           \t\t");
        if (_jspx_meth_nested_005ftextarea_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("           </td>\r\n");
        out.write("         </tr>\r\n");
        out.write("         <tr>\r\n");
        out.write("           <td width=\"15%\" align=\"center\">问题描述<font color=\"red\">*</font></td>\r\n");
        out.write("           <td colspan=\"3\" width=\"85%\">\r\n");
        out.write("              ");
        if (_jspx_meth_nested_005ftextarea_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("           </td>\r\n");
        out.write("         </tr>\r\n");
        out.write("         <tr>\r\n");
        out.write("           <td width=\"15%\" align=\"center\">修改建议</td>\r\n");
        out.write("           <td colspan=\"3\" width=\"85%\">\r\n");
        out.write("              ");
        if (_jspx_meth_nested_005ftextarea_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("           </td>\r\n");
        out.write("         </tr>\r\n");
        out.write("         <tr>\r\n");
        out.write("           <td width=\"15%\" align=\"center\">附件</td>\r\n");
        out.write("           <td colspan=\"3\" width=\"85%\">");
        if (_jspx_meth_html_005ffile_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("         </tr>         \r\n");
        out.write("\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f0 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f0.setProperty("reportId");
    _jspx_th_nested_005ftext_005f0.setOnchange("checkReportId()");
    int _jspx_eval_nested_005ftext_005f0 = _jspx_th_nested_005ftext_005f0.doStartTag();
    if (_jspx_th_nested_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f1 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f1.setProperty("project");
    int _jspx_eval_nested_005ftext_005f1 = _jspx_th_nested_005ftext_005f1.doStartTag();
    if (_jspx_th_nested_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f2 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f2.setProperty("dept");
    int _jspx_eval_nested_005ftext_005f2 = _jspx_th_nested_005ftext_005f2.doStartTag();
    if (_jspx_th_nested_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_nested_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:select
    org.apache.struts.taglib.nested.html.NestedSelectTag _jspx_th_nested_005fselect_005f0 = (org.apache.struts.taglib.nested.html.NestedSelectTag) _005fjspx_005ftagPool_005fnested_005fselect_0026_005fvalue_005fproperty_005fonchange.get(org.apache.struts.taglib.nested.html.NestedSelectTag.class);
    _jspx_th_nested_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005fselect_005f0.setProperty("harm");
    _jspx_th_nested_005fselect_005f0.setOnchange("change(this.value)");
    _jspx_th_nested_005fselect_005f0.setValue("1");
    int _jspx_eval_nested_005fselect_005f0 = _jspx_th_nested_005fselect_005f0.doStartTag();
    if (_jspx_eval_nested_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_nested_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_nested_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_nested_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t<option value=\"1\">轻微</option>\r\n");
        out.write("\t\t\t\t<option value=\"2\">一般</option>\r\n");
        out.write("\t\t\t\t<option value=\"3\" selected>严重</option>\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t        ");
        int evalDoAfterBody = _jspx_th_nested_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_nested_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_nested_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fselect_0026_005fvalue_005fproperty_005fonchange.reuse(_jspx_th_nested_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fselect_0026_005fvalue_005fproperty_005fonchange.reuse(_jspx_th_nested_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f3 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f3.setProperty("discoveryDate");
    _jspx_th_nested_005ftext_005f3.setValue("");
    _jspx_th_nested_005ftext_005f3.setOnfocus("calendar(this,null,null,null)");
    _jspx_th_nested_005ftext_005f3.setSize("20");
    int _jspx_eval_nested_005ftext_005f3 = _jspx_th_nested_005ftext_005f3.doStartTag();
    if (_jspx_th_nested_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_nested_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fsize_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_nested_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_nested_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:textarea
    org.apache.struts.taglib.nested.html.NestedTextareaTag _jspx_th_nested_005ftextarea_005f0 = (org.apache.struts.taglib.nested.html.NestedTextareaTag) _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextareaTag.class);
    _jspx_th_nested_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftextarea_005f0.setProperty("background");
    _jspx_th_nested_005ftextarea_005f0.setCols("85%");
    _jspx_th_nested_005ftextarea_005f0.setRows("3");
    int _jspx_eval_nested_005ftextarea_005f0 = _jspx_th_nested_005ftextarea_005f0.doStartTag();
    if (_jspx_th_nested_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_nested_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_nested_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:textarea
    org.apache.struts.taglib.nested.html.NestedTextareaTag _jspx_th_nested_005ftextarea_005f1 = (org.apache.struts.taglib.nested.html.NestedTextareaTag) _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextareaTag.class);
    _jspx_th_nested_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftextarea_005f1.setProperty("description");
    _jspx_th_nested_005ftextarea_005f1.setCols("85%");
    _jspx_th_nested_005ftextarea_005f1.setRows("3");
    int _jspx_eval_nested_005ftextarea_005f1 = _jspx_th_nested_005ftextarea_005f1.doStartTag();
    if (_jspx_th_nested_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_nested_005ftextarea_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_nested_005ftextarea_005f1);
    return false;
  }

  private boolean _jspx_meth_nested_005ftextarea_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:textarea
    org.apache.struts.taglib.nested.html.NestedTextareaTag _jspx_th_nested_005ftextarea_005f2 = (org.apache.struts.taglib.nested.html.NestedTextareaTag) _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextareaTag.class);
    _jspx_th_nested_005ftextarea_005f2.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftextarea_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftextarea_005f2.setProperty("suggestion");
    _jspx_th_nested_005ftextarea_005f2.setCols("85%");
    _jspx_th_nested_005ftextarea_005f2.setRows("3");
    int _jspx_eval_nested_005ftextarea_005f2 = _jspx_th_nested_005ftextarea_005f2.doStartTag();
    if (_jspx_th_nested_005ftextarea_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_nested_005ftextarea_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftextarea_0026_005frows_005fproperty_005fcols_005fnobody.reuse(_jspx_th_nested_005ftextarea_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ffile_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:file
    org.apache.struts.taglib.html.FileTag _jspx_th_html_005ffile_005f0 = (org.apache.struts.taglib.html.FileTag) _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_005ffile_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ffile_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ffile_005f0.setProperty("file");
    _jspx_th_html_005ffile_005f0.setName("ProblemReportForm");
    int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
    if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
    return false;
  }
}
