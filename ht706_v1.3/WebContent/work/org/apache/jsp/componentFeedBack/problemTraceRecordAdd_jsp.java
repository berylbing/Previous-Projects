package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class problemTraceRecordAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005fselect_0026_005fproperty_005fonchange;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005fselect_0026_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fnested_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005fselect_0026_005fproperty_005fonchange.release();
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
      out.write("<script src=\"../js/calendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction change(a) {\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction excel() {\r\n");
      out.write("\t\twindow.open(\"excel/按考核对象统计.xls\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction appendRecord() {\r\n");
      out.write("\t\tvar r = document.getElementById(\"record\");\r\n");
      out.write("\t\tr.style.display = \"\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction saveRecord() {\r\n");
      out.write("               \r\n");
      out.write("               var a1 = document.getElementsByName(\"cname\");\r\n");
      out.write("               var a2 = document.getElementsByName(\"sx\")[0];\r\n");
      out.write("               var ax = a2.options[a2.selectedIndex].text\r\n");
      out.write("               \r\n");
      out.write("               var cellStrArray = new Array();\r\n");
      out.write("               cellStrArray[0] = \"<a onclick='problemQuery()'>2008ZX01023-001</a>\";\t\t\r\n");
      out.write("               cellStrArray[1] = a1[0].value;\t\r\n");
      out.write("               cellStrArray[2] = a1[1].value;\t  \t\r\n");
      out.write("               cellStrArray[3] = a1[2].value;\t\r\n");
      out.write("               cellStrArray[4] = ax;\r\n");
      out.write("\t\r\n");
      out.write("\t       var tb = document.getElementById(\"ta\");\r\n");
      out.write("\t       addRow(ta,-1,cellStrArray);  \t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\tvar r = document.getElementById(\"record\");\r\n");
      out.write("\t\tr.style.display = \"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("        //在表中增加行 tableobj:表格对象;trnumber:行号; TRSTRING:各TD中的值;\r\n");
      out.write("        function addRow(tableObj,trNumber,trString)\r\n");
      out.write("        {\r\n");
      out.write("            var trObj = tableObj.insertRow(trNumber);\r\n");
      out.write("            for(var i=0 ; i<trString.length ; i++)\r\n");
      out.write("            {\r\n");
      out.write("   \t       var tdObj = trObj.insertCell();\r\n");
      out.write("   \t       tdObj.insertAdjacentHTML(\"AfterBegin\",trString[i]);\r\n");
      out.write("            }\r\n");
      out.write("        }\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function problemQuery(rid){\r\n");
      out.write("         \twindow.location = \"../componentFeedBack/problemReport.do?method=listProblemReport&RID=\" + rid;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function n_open(rid){\r\n");
      out.write("    \t\tif(document.getElementById(\"dateOfInformation\").value == \"\")\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\talert(\"请选择执行日期\");\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(document.getElementById(\"content\").value == \"\")\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\talert(\"请填写执行内容\");\r\n");
      out.write("    \t\t\treturn;\r\n");
      out.write("    \t\t}\r\n");
      out.write("            \r\n");
      out.write("        \tvar actionPath = \"../componentFeedBack/problemTrace.do?method=addProblemTrace&RID=\" + rid;\r\n");
      out.write("        \tdocument.getElementById(\"ProblemTraceForm\").action = actionPath;\r\n");
      out.write("        \tdocument.getElementById(\"ProblemTraceForm\").submit();\r\n");
      out.write("        }\r\n");
      out.write("    \t\t\t\r\n");
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
      out.write("\t\t<td>问题汇总</td>\r\n");
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
      out.write("    ");
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
          out.write("\t       <td align=\"center\" width='60'>\r\n");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write(" </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  <div id=bc align=right>\r\n");
      out.write("  \t<input onclick='appendRecord()' type=button value=' 追 加 ' class='input_button'>  \t\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div id=\"record\" class=editblock style=\"display:none\">\r\n");
      out.write("\t");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("  <div id=bc align=right>\r\n");
      out.write("  \t<input onclick=\"n_open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\" type=button value=' 确 定 ' class='input_button'>  \t\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</div> \r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setMethod("post");
    _jspx_th_html_005fform_005f0.setAction("/componentFeedBack/problemTrace.do?method=addProblemTrace");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" id=\"tb\">\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t\t  <th align=\"right\" width=\"25%\">执行日期：</th>\r\n");
        out.write("\t\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t</tr>\t\r\n");
        out.write("\t\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t\t  <th align=\"right\" width=\"25%\">执行内容：</th>\r\n");
        out.write("\t\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t\t  <th align=\"right\" width=\"25%\">解决状态：</th>\r\n");
        out.write("\t\t\t  <td width=\"75%\">\r\n");
        out.write("\t\t\t        ");
        if (_jspx_meth_nested_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t  </td>\r\n");
        out.write("\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f0 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f0.setProperty("dateOfInformation");
    _jspx_th_nested_005ftext_005f0.setValue("");
    _jspx_th_nested_005ftext_005f0.setOnfocus("calendar(this,null,null,null)");
    int _jspx_eval_nested_005ftext_005f0 = _jspx_th_nested_005ftext_005f0.doStartTag();
    if (_jspx_th_nested_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
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
    _jspx_th_nested_005ftext_005f1.setProperty("content");
    int _jspx_eval_nested_005ftext_005f1 = _jspx_th_nested_005ftext_005f1.doStartTag();
    if (_jspx_th_nested_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_nested_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:select
    org.apache.struts.taglib.nested.html.NestedSelectTag _jspx_th_nested_005fselect_005f0 = (org.apache.struts.taglib.nested.html.NestedSelectTag) _005fjspx_005ftagPool_005fnested_005fselect_0026_005fproperty_005fonchange.get(org.apache.struts.taglib.nested.html.NestedSelectTag.class);
    _jspx_th_nested_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005fselect_005f0.setProperty("status");
    _jspx_th_nested_005fselect_005f0.setOnchange("change(this.value)");
    int _jspx_eval_nested_005fselect_005f0 = _jspx_th_nested_005fselect_005f0.doStartTag();
    if (_jspx_eval_nested_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_nested_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_nested_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_nested_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t\t<option value=\"0\">待解决</option>\r\n");
        out.write("\t\t\t\t\t<option value=\"1\">已解决</option>\t\t\t\t\t\t\r\n");
        out.write("\t\t\t        ");
        int evalDoAfterBody = _jspx_th_nested_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_nested_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_nested_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fselect_0026_005fproperty_005fonchange.reuse(_jspx_th_nested_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fselect_0026_005fproperty_005fonchange.reuse(_jspx_th_nested_005fselect_005f0);
    return false;
  }
}
