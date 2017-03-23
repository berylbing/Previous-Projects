package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getOrganization_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
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
      out.write('\r');
      out.write('\n');
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
        out.write("\t<head>\r\n");
        out.write("\t\t<title>构件库管理系统</title>\r\n");
        out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
        out.write("\t\t<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
        out.write("\t\t<style>\r\n");
        out.write("input {\r\n");
        out.write("\tfont-size: 12px;\r\n");
        out.write("\tcolor: #000000;\r\n");
        out.write("\tbackground-color: #F1F4F5;\r\n");
        out.write("\tborder: 1px solid #49789C;\r\n");
        out.write("\tpadding: 2px 0px 0px 5px;\r\n");
        out.write("}\r\n");
        out.write("</style>\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\tfunction ret(){\r\n");
        out.write("\t\tlocation.href = \"organizationAction.do?method=searchOrganization&Id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${departmentId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&select=-1\";\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("</script>\r\n");
        out.write("\t</head>\r\n");
        out.write("\t<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n");
        out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t新建人员\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t</table>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t<div class=editblock>\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t登录名：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t姓名：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t性别：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t密码：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\">\r\n");
        out.write("\t\t\t\t\t\t所属部门：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${departmentName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t身份证：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.idNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\t\t\t\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t出生日期：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\t\t\t\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t联系地址：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t电话：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\" width=\"25%\">\r\n");
        out.write("\t\t\t\t\t\t邮箱：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td width=\"75%\">\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\">\r\n");
        out.write("\t\t\t\t\t\t密级：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.securityLevel}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr height=\"35\">\r\n");
        out.write("\t\t\t\t\t<th align=\"right\">\r\n");
        out.write("\t\t\t\t\t\t说明：\r\n");
        out.write("\t\t\t\t\t</th>\r\n");
        out.write("\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${organization.describtion}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t\t \r\n");
        out.write("\t\t\t<div id=bc align=right>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t\t<!--\r\n");
        out.write("  \t<input onclick='bc()' type=button value=' 新 建 ' class='input_button'>\r\n");
        out.write("  \t<input onclick='bc()' type=button value=' 删 除 ' class='input_button'>\r\n");
        out.write("    -->\r\n");
        out.write("\t\t\t\t<input onclick='ret()' type=button value='返回 ' class='input_button'>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t<br>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t\t\r\n");
        out.write("\t</body>\r\n");
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
}
