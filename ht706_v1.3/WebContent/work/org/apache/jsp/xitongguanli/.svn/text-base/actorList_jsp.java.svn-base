package org.apache.jsp.xitongguanli;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actorList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
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
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t<head>\r\n");
          out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
          out.write("\t\t<title>构件库管理系统</title>\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
          out.write("\t\t<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t\t<script  language=\"javascript\" type=\"text/javascript\">\r\n");
          out.write("\t\tvar href = \"\";\r\n");
          out.write("\t\tfunction deltr(){\r\n");
          out.write("\t\t\tdocument.getElementById(\"ActorForm\").submit();\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tfunction create(){\r\n");
          out.write("\t\t\tlocation.href = \"createActor.jsp\";\r\n");
          out.write("\t\t}\r\n");
          out.write("\t\tfunction checkIsDeleted(id){\r\n");
          out.write("\t\t\thref = \"actorAction.do?method=deleteActor&Id=\" + id; \t\t\r\n");
          out.write("\t \t\turl = \"actorAction.do?method=checkIsDeleted&Id=\"+id;\r\n");
          out.write("\t \t\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
          out.write("\t \t\txmlhttp.onreadystatechange=processor;\r\n");
          out.write("\t \t\txmlhttp.open(\"post\",url);\r\n");
          out.write("\t \t\txmlhttp.send(null);\t \t\t\r\n");
          out.write("\t \t}\r\n");
          out.write("\t \tfunction processor(){\r\n");
          out.write("\t \t\tif(xmlhttp.readyState==4)\r\n");
          out.write("\t \t\t\tif(xmlhttp.status==200){\t\t \t\t\t\t\t \t\t\t\r\n");
          out.write("\t \t\t\t\tif(xmlhttp.responseText == \"error\")\r\n");
          out.write("\t \t\t\t\t    if (!confirm(\"该角色已被分配给用户，确认要删除？\")) {\t\r\n");
          out.write("\t\t\t \t\t\t    return;\r\n");
          out.write("\t \t\t\t        }\r\n");
          out.write("\t \t\t\t\tlocation.href = href;\r\n");
          out.write("\t \t\t\t}\r\n");
          out.write("\t \t}\t\r\n");
          out.write("\t\t\r\n");
          out.write("\t\t</script>\r\n");
          out.write("\t</head>\r\n");
          out.write("\t<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=mainbody>\r\n");
          out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=title>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t角色定义\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t</table>\r\n");
          out.write("\t\t<input type=\"hidden\" name=\"hid\">\r\n");
          out.write("\t\t<div class=list>\r\n");
          out.write("\t\t ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_html_005fform_005f0.setAction("/xitongguanli/actorAction.do?method=deleteActor");
          int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
          if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n");
              out.write("\t\t\t<table id=ta>\r\n");
              out.write("\t\t\t\t<tr>\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t<th width=\"20%\">\r\n");
              out.write("\t\t\t\t\t\t名称\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th width=\"53%\">\r\n");
              out.write("\t\t\t\t\t\t角色职责\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t\t<th width=\"15%\">\r\n");
              out.write("\t\t\t\t\t\t编辑\r\n");
              out.write("\t\t\t\t\t</th>\r\n");
              out.write("\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              _jspx_th_logic_005fiterate_005f0.setId("element");
              _jspx_th_logic_005fiterate_005f0.setName("actorList");
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
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\r\n");
                  out.write("\t\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.actorName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.responsibility}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t<td align=\"center\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t<a href=\"actorAction.do?method=preActorForm&Id=");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("\" ><img src=\"../images/icon/icon_dianping.gif\" width=\"16\" height=\"16\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\tborder=\"0\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t</a>\r\n");
                  out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"checkIsDeleted('");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.actorId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("');\"><img src=\"../images/icon/del.gif\" width=\"16\" height=\"16\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\tborder=\"0\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t</a>\r\n");
                  out.write("\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\r\n");
                  out.write("\t\t\t\t\t");
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
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t</table>\r\n");
              out.write("\t\t\t\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
          out.write("\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=page>\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t<input name=\"button22\" type=\"button\" class=\"input_button\" onClick=\"create()\" value=\" 新 建 \">\r\n");
          out.write("\t\t\t\t\t<!--<input name=\"button2\" type=\"button\" class=\"input_button\" onClick=\"deltr()\" value=\" 删 除 \">\r\n");
          out.write("\t\t\t\t--></td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t</table>\r\n");
          out.write("\t</body>\r\n");
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
}
