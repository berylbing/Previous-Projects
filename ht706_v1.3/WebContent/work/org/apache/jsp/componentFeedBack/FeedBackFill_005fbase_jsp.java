package org.apache.jsp.componentFeedBack;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FeedBackFill_005fbase_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonblur_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonblur_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonblur_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.release();
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>软件服务反馈</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t//added by wanghao\r\n");
      out.write("\t//检测问题编号是否可用\r\n");
      out.write("\tfunction checkRegistryId(recordId)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar registryId = document.getElementById(\"registryId\").value;\r\n");
      out.write("\t\tvar url = \"../componentFeedBack/feedback.do?method=checkRegistryId&registryId=\" + registryId + \"&recordId=\" + recordId;\r\n");
      out.write("\t\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\txmlhttp.onreadystatechange = processor;\r\n");
      out.write("\t\txmlhttp.open(\"post\",url);\r\n");
      out.write("\t\txmlhttp.send(null);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//added by wanghao\r\n");
      out.write("\t//处理检测编号的结果\r\n");
      out.write("\tfunction processor()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\tif(xmlhttp.status==200){\t\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"error\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction c_open(path, uuid) {\r\n");
      out.write("\t\tif(document.getElementById(\"registryId\").value == \"\" )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"请填写登记号\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar error = document.getElementById(\"error\").innerText;\r\n");
      out.write("\t\tif(error == \"登记号已存在 \")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"登记号已存在\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.getElementById(\"background\").value == \"\" )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"请填写应用背景\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.getElementById(\"enviroment\").value == \"\" )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"请填写使用环境\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar actionPath = path + \"/componentFeedBack/feedback.do?method=create&AssetUUID=\" + uuid;\r\n");
      out.write("\t\tdocument.getElementById(\"FeedbackForm\").action = actionPath;\r\n");
      out.write("\t\tdocument.getElementById(\"FeedbackForm\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t<td align=\"left\">填写反馈单</td>\r\n");
      out.write("\t</tr>\t\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"hid\">\r\n");
      out.write("\r\n");
      out.write("<div class=list>\r\n");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005fenctype_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setMethod("post");
    _jspx_th_html_005fform_005f0.setAction("componentFeedBack/feedback.do?method=create");
    _jspx_th_html_005fform_005f0.setEnctype("multipart/form-data");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<table border=\"0\">\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t <td align=\"center\" width=\"30%\"><b>登记号:</b></td>\r\n");
        out.write("\t  <td>\r\n");
        out.write("\t      ");
        if (_jspx_meth_nested_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t      <label id=\"error\"></label>\r\n");
        out.write("\t  </td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t\r\n");
        out.write("\t<tr>\r\n");
        out.write("\t  <td align=\"center\" width=\"30%\"><b>应用背景:</b></td>\r\n");
        out.write("\t  <td>\r\n");
        out.write("\t      ");
        if (_jspx_meth_nested_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t  </td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>  \r\n");
        out.write("\t  <td align=\"center\" width=\"30%\"><b>使用环境:</b></td>\r\n");
        out.write("\t  <td>\r\n");
        out.write("\t      ");
        if (_jspx_meth_nested_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t  </td>\r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>    \r\n");
        out.write("\t  <td align=\"center\" width=\"30%\"><b>其它说明:</b></td>\r\n");
        out.write("\t  <td>\r\n");
        out.write("\t      ");
        if (_jspx_meth_nested_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t  </td>\t\t  \t  \r\n");
        out.write("\t</tr>\r\n");
        out.write("\t<tr>    \r\n");
        out.write("\t  <td align=\"center\" width=\"30%\"><b>附件:</b></td>\r\n");
        out.write("\t  <td>\r\n");
        out.write("\t \t");
        if (_jspx_meth_html_005ffile_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</td>\t\t  \t  \r\n");
        out.write("\t</tr>\r\n");
        out.write("</table>\r\n");
        out.write("\r\n");
        out.write("  <div id=bc align=right>\r\n");
        out.write("      <input type='button' value=' 提  交 ' class=\"input_button\" onclick=\"c_open('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${AssetUUID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">&nbsp;\t     \r\n");
        out.write("  </div><br>\r\n");
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
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f0 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonblur_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f0.setProperty("registryId");
    _jspx_th_nested_005ftext_005f0.setOnblur("checkRegistryId('')");
    int _jspx_eval_nested_005ftext_005f0 = _jspx_th_nested_005ftext_005f0.doStartTag();
    if (_jspx_th_nested_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonblur_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonblur_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
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
    _jspx_th_nested_005ftext_005f1.setProperty("background");
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
    _jspx_th_nested_005ftext_005f2.setProperty("enviroment");
    int _jspx_eval_nested_005ftext_005f2 = _jspx_th_nested_005ftext_005f2.doStartTag();
    if (_jspx_th_nested_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_nested_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:text
    org.apache.struts.taglib.nested.html.NestedTextTag _jspx_th_nested_005ftext_005f3 = (org.apache.struts.taglib.nested.html.NestedTextTag) _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedTextTag.class);
    _jspx_th_nested_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_nested_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005ftext_005f3.setProperty("description");
    int _jspx_eval_nested_005ftext_005f3 = _jspx_th_nested_005ftext_005f3.doStartTag();
    if (_jspx_th_nested_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f3);
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
    _jspx_th_html_005ffile_005f0.setName("FeedbackForm");
    int _jspx_eval_html_005ffile_005f0 = _jspx_th_html_005ffile_005f0.doStartTag();
    if (_jspx_th_html_005ffile_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ffile_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ffile_005f0);
    return false;
  }
}
