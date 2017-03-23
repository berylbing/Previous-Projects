package org.apache.jsp.specification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createSpecification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fsize_005freadonly_005fproperty_005fonfocus_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fsize_005freadonly_005fproperty_005fonfocus_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty.release();
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fsize_005freadonly_005fproperty_005fonfocus_005fnobody.release();
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
      out.write("<title>构件库管理系统</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/calendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\tinput{\r\n");
      out.write("\t\tfont-size: 12px;\r\n");
      out.write("\t\tcolor: #000000;\r\n");
      out.write("\t\tbackground-color: #F1F4F5;\r\n");
      out.write("\t\tborder: 1px solid #49789C;\r\n");
      out.write("\t\tpadding:2px 0px 0px 5px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write(" function selectReason(){\r\n");
      out.write("\t open_window(\"SpecificationmodifyAction.do?method=searchSpecificationmodify\",800,600);\r\n");
      out.write("\t }\r\n");
      out.write(" function checkversion(){\r\n");
      out.write("\t\tvar vv=document.getElementsByName(\"specification.version\")[0].value;\r\n");
      out.write("\t\turl = \"SpecificationAction.do?method=checkSpecificationVersion&version=\"+vv;\r\n");
      out.write("\t\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\txmlhttp.onreadystatechange=processor;\r\n");
      out.write("\t\txmlhttp.open(\"post\",url);\r\n");
      out.write("\t\txmlhttp.send(null);\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction processor(){\r\n");
      out.write("\t\tif(xmlhttp.readyState==4)\r\n");
      out.write("\t\t\tif(xmlhttp.status==200){\t\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"error\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction check_null()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar version = document.getElementsByName(\"specification.version\")[0].value;\r\n");
      out.write("\t\tvar reason = document.getElementsByName(\"specification.reason\")[0].value;\r\n");
      out.write("\t\tvar error = document.getElementById(\"error\").innerText;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(version==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"请填写规约版本号！ \");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(error == \"该版本号已存在，不能使用！\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"该版本号已存在，不能使用！ \");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(reason==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"请选择依据的申请单！ \");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.getElementsByName(\"specificationForm\")[0].submit();\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" >\r\n");
      out.write("<!--<hr color=#97D2FF>-->\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
      out.write("\t\t<tr>          \r\n");
      out.write("\t\t   <td><div id=\"aspect\"><b>新建规约</b></div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\tdocument.all(\"specification.releaseType\")[1].checked=true;\r\n");
      out.write("</script>\r\n");
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
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setAction("/specification/SpecificationAction?method=createSpecification");
    _jspx_th_html_005fform_005f0.setMethod("POST");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<div class=editblock >\r\n");
        out.write("\t\r\n");
        out.write("\t<table width=\"80%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">依据的申请单：</th>\r\n");
        out.write("\t\t  <td>\r\n");
        out.write("\t\t  <span id=\"_Reasons\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reasons}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reasons}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t  ");
        if (_jspx_meth_nested_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t        <input  type=\"button\" class=\"input_button\" onClick=\"selectReason()\" value=\"选择申请单\">\r\n");
        out.write("\t\t  </td>\r\n");
        out.write("\t\t</tr>\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\" width=\"25%\">规约版本：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">\r\n");
        out.write("\t\t  ");
        if (_jspx_meth_nested_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t  <label id=\"error\"></label>\r\n");
        out.write("\t\t  </td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">前导规约：</th>\r\n");
        out.write("\t\t  <td>\r\n");
        out.write("                ");
        if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t  </td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">发布类型：</th>\r\n");
        out.write("\t\t  <td>\r\n");
        out.write("\t\t  \t\t");
        if (_jspx_meth_html_005fradio_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005fradio_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("\t\t  </td>\r\n");
        out.write("\t\t</tr>\t\t\t\t\t\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">规约说明：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        if (_jspx_meth_nested_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("  </td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">创建时间：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t  </td>\r\n");
        out.write("\t\t</tr>\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">库名称：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t</tr>\t\t\t\r\n");
        out.write("\t\t<tr height=\"35\"> \r\n");
        out.write("\t\t  <th align=\"right\">创建者：</th>\r\n");
        out.write("\t\t  <td width=\"75%\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${creator}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t</tr>\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\r\n");
        out.write("\t</table>\r\n");
        out.write("\t\t\t\r\n");
        out.write("  <div id=bc align=right>\r\n");
        out.write("  \t<input onclick=\"check_null()\" type=button value=' 保 存 ' class='input_button'>\r\n");
        out.write("  </div><br>\r\n");
        out.write("</div> \r\n");
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

  private boolean _jspx_meth_nested_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:hidden
    org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_005fhidden_005f0 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
    _jspx_th_nested_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_nested_005fhidden_005f0.setProperty("specification.reason");
    _jspx_th_nested_005fhidden_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reasons}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005fhidden_005f0 = _jspx_th_nested_005fhidden_005f0.doStartTag();
    if (_jspx_th_nested_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005fhidden_005f0);
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
    _jspx_th_nested_005ftext_005f0.setProperty("specification.version");
    _jspx_th_nested_005ftext_005f0.setOnchange("checkversion()");
    int _jspx_eval_nested_005ftext_005f0 = _jspx_th_nested_005ftext_005f0.doStartTag();
    if (_jspx_th_nested_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fonchange_005fnobody.reuse(_jspx_th_nested_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fselect_005f0.setProperty("prespecificationid");
    _jspx_th_html_005fselect_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_005foptionsCollection_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty.reuse(_jspx_th_html_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foptionsCollection_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:optionsCollection
    org.apache.struts.taglib.html.OptionsCollectionTag _jspx_th_html_005foptionsCollection_005f0 = (org.apache.struts.taglib.html.OptionsCollectionTag) _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.get(org.apache.struts.taglib.html.OptionsCollectionTag.class);
    _jspx_th_html_005foptionsCollection_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foptionsCollection_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    _jspx_th_html_005foptionsCollection_005f0.setName("preSp");
    _jspx_th_html_005foptionsCollection_005f0.setLabel("version");
    _jspx_th_html_005foptionsCollection_005f0.setValue("version");
    int _jspx_eval_html_005foptionsCollection_005f0 = _jspx_th_html_005foptionsCollection_005f0.doStartTag();
    if (_jspx_th_html_005foptionsCollection_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fradio_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f0 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_005fradio_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fradio_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fradio_005f0.setProperty("specification.releaseType");
    _jspx_th_html_005fradio_005f0.setName("specificationForm");
    _jspx_th_html_005fradio_005f0.setValue("1");
    int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
    if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f0.doInitBody();
      }
      do {
        out.write("全局发布");
        int evalDoAfterBody = _jspx_th_html_005fradio_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fradio_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_html_005fradio_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_html_005fradio_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fradio_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f1 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_005fradio_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fradio_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fradio_005f1.setProperty("specification.releaseType");
    _jspx_th_html_005fradio_005f1.setName("specificationForm");
    _jspx_th_html_005fradio_005f1.setValue("2");
    int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
    if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f1.doInitBody();
      }
      do {
        out.write("本地发布");
        int evalDoAfterBody = _jspx_th_html_005fradio_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fradio_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_html_005fradio_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_html_005fradio_005f1);
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
    _jspx_th_nested_005ftext_005f1.setProperty("specification.description");
    int _jspx_eval_nested_005ftext_005f1 = _jspx_th_nested_005ftext_005f1.doStartTag();
    if (_jspx_th_nested_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_nested_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fsize_005freadonly_005fproperty_005fonfocus_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ftext_005f0.setProperty("createtime");
    _jspx_th_html_005ftext_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${createtime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_html_005ftext_005f0.setReadonly(true);
    _jspx_th_html_005ftext_005f0.setOnfocus("calendar(this,null,null,null)");
    _jspx_th_html_005ftext_005f0.setSize("40");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fsize_005freadonly_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fsize_005freadonly_005fproperty_005fonfocus_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }
}
