package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actorAuthorized_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.release();
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.release();
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
      if (_jspx_meth_html_005fhtml_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_html_005fhtml_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
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
        out.write("\t\t<title>构件库管理系统</title>\r\n");
        out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
        out.write("\t\t<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\t\t\t\t\r\n");
        out.write("\t\t<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
        out.write("\t\t<script src=\"../js/tab.js\" type=\"text/javascript\"></script>\r\n");
        out.write("\t\t<link href=\"../css/tab.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t<script type=\"text/javascript\">\t\r\n");
        out.write("\t\t\tfunction selectActor(obj){\r\n");
        out.write("\t\t\t\tlocation.href=\"safeControlAction.do?method=searchAuthorizationByActor&Id=\"+obj.options[obj.selectedIndex].value;\t\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tfunction save()\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\t\tvar modules = document.getElementsByName(\"tab_module_frame\");\r\n");
        out.write("\t\t\t\tvar length = modules.length;\r\n");
        out.write("\t\t\t\tvar authorizationSelected = \"\";\t\t\t\t\r\n");
        out.write("\t\t\t\tfor(var i=0;i<length;i++)\r\n");
        out.write("\t\t\t\t{\r\n");
        out.write("\t\t\t\t\tvar authorizations = modules[i].contentWindow.document.getElementsByName(\"selectedElement\");\r\n");
        out.write("\t\t\t\t\tvar length1 = authorizations.length;\r\n");
        out.write("\t\t\t\t\tfor(var j=0;j<length1;j++)\r\n");
        out.write("\t\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t\tif(authorizations[j].checked == true)\r\n");
        out.write("\t\t\t\t\t\t\tauthorizationSelected += authorizations[j].value + \";\";\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t}\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\tdocument.getElementById(\"actorToElementForm\").action += \"&authorsSelected=\" + authorizationSelected;\t\t\t\t\r\n");
        out.write("\t\t\t\tdocument.getElementById(\"actorToElementForm\").submit();\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t</script>\t\t\r\n");
        out.write("\t</head>\r\n");
        out.write("\t<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=mainbody>\t\r\n");
        out.write("\t");
        if (_jspx_meth_html_005fform_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
          return true;
        out.write("\t   \r\n");
        out.write("      <SCRIPT type=text/javascript>\r\n");
        out.write("\t    \tinitTabs(Array('构件发布','构件规约','反馈与交流','系统管理','我的收藏','报表管理','工作流'),0,'100%',300);\r\n");
        out.write("  \t  </SCRIPT>\r\n");
        out.write("\t</body>\r\n");
        out.write("</html>\r\n");
        int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhtml.reuse(_jspx_th_html_005fhtml_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_html_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/xitongguanli/safeControlAction?method=modifyAuthorizationToActor&Id=${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t角色权限定义\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t\t<input type=\"hidden\" name=\"hid\">\r\n");
        out.write("\t\t<table border=0 width='100%' cellSpacing=6>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td align=\"right\" width=\"20%\">\r\n");
        out.write("\t\t\t\t\t角色名称：\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t<td width=\"80%\">\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t\t<hr color=#97D2FF>\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t<DIV id=macrolong_tabView >\t\t\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\t\t\t\t\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=0\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=1\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=2\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=3\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\t\t\t\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=4\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=5\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\r\n");
        out.write("\t\t\t<DIV class=macrolong_aTab style=\"overflow: auto;\">\r\n");
        out.write("\t\t\t\t<iframe name=\"tab_module_frame\" frameborder=\"0\" width=\"100%\" height=\"100%\" style=\"overflow: auto\" \r\n");
        out.write("\t\t\t\t\tsrc=\"safeControlAction.do?method=searchModuleAuthorizationByActor&actorId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&moduleId=6\"></iframe>\r\n");
        out.write("\t\t\t</DIV>\r\n");
        out.write("\t\t</DIV>\r\n");
        out.write("\t\t<br />\t\t\r\n");
        out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=page>\r\n");
        out.write("\t\t\t<tr><td>\r\n");
        out.write("\t\t\t\t<input name=\"button22\" type=\"button\" class=\"input_button\" onClick=\"save()\" value=\" 保 存 \">\r\n");
        out.write("\t\t\t</td></tr>\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fselect_005f0.setOnchange("selectActor(this)");
    _jspx_th_html_005fselect_005f0.setProperty("id");
    _jspx_th_html_005fselect_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fproperty_005fonchange.reuse(_jspx_th_html_005fselect_005f0);
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
    _jspx_th_html_005foptionsCollection_005f0.setName("actorList");
    _jspx_th_html_005foptionsCollection_005f0.setLabel("actorName");
    _jspx_th_html_005foptionsCollection_005f0.setValue("actorId");
    int _jspx_eval_html_005foptionsCollection_005f0 = _jspx_th_html_005foptionsCollection_005f0.doStartTag();
    if (_jspx_th_html_005foptionsCollection_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foptionsCollection_0026_005fvalue_005fname_005flabel_005fnobody.reuse(_jspx_th_html_005foptionsCollection_005f0);
    return false;
  }
}
