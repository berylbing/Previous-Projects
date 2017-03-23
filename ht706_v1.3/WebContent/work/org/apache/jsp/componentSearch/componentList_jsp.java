package org.apache.jsp.componentSearch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ht706.componentLibrary.componentRelease.actionForm.ComponentListForm;
import com.ht706.componentLibrary.util.Constant;

public final class componentList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005foffset_005fname_005flength_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005foffset_005fname_005flength_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005foffset_005fname_005flength_005findexId_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
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

    java.lang.Object _jspx_lista_1 = null;

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
 request.setAttribute("PAGE_LINES",Constant.PAGE_LINES);
	ComponentListForm f=(ComponentListForm)request.getAttribute("ComponentListForm");
	int all=f.getAllNum(),x;
	if((all % Constant.PAGE_LINES)==0) x=all / Constant.PAGE_LINES;
	else x=all / Constant.PAGE_LINES+1;
	request.setAttribute("ALL_PAGE",x);

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction changex1() {\r\n");
      out.write("\t\tvar v = document.getElementsByTagName(\"div\");\r\n");
      out.write("\t\tfor (var i=1; i<v.length; i++) {\r\n");
      out.write("\t\t\tv[i].style.display = \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction excel(v) {\t\t\r\n");
      out.write("\t\topen_window(\"Checkout.do?method=preCheckout&Asset=\"+v, 700,350);\r\n");
      out.write("\t\t//window.open(\"excel/XXX构件.rar\");\r\n");
      out.write("\t\t//location.href = \"excel/XXX构件.rar\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tfunction switchPage()\r\n");
      out.write("\t{\r\n");
      out.write("\t       var a = parent.parent.document.getElementsByTagName(\"IFRAME\")[0];\r\n");
      out.write("\t       a.src = \"menuFrame1.jsp\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction deltr(rowIndex) {\r\n");
      out.write("                \r\n");
      out.write("                var ta = document.getElementById(\"ta\");\r\n");
      out.write("\t\tta.deleteRow(rowIndex); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction w_open(v){\r\n");
      out.write("\t\t\tpath=location.pathname;\r\n");
      out.write("\t\tfor(var index=1;index<path.length;index++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(path.charAt(index)=='/') break;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ttmp=path.substring(0,index);\r\n");
      out.write("\t\t//alert(tmp+v);\r\n");
      out.write("\t\topen_window(tmp+v,900,500);\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction n_open(v,uuid){\r\n");
      out.write("\t\tif (v == 4) {\r\n");
      out.write("\t        open_window('../componentFeedBack/feedback.do?method=preCreate&AssetUUID='+uuid,900,500);\r\n");
      out.write("\t        return;\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (v == 7) {\r\n");
      out.write("\t\t     open_window('../componentFeedBack/problemReport.do?method=preCreate&AssetUUID='+uuid,900,500);\t\t        \t        \r\n");
      out.write("\t        return;\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn;\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction jumpToPage(page){\r\n");
      out.write("\t\tdocument.getElementById(\"ComponentListForm\").action+=(\"?page=\"+page);\r\n");
      out.write("\t\tdocument.getElementById(\"ComponentListForm\").submit();\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction jumpto(v){\r\n");
      out.write("\t\tjumpToPage(v.selectedIndex);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction searchByRelation(v){\r\n");
      out.write("\t\tse=document.getElementById(\"S_relation\"+v);\r\n");
      out.write("\t\t\t\tpath=location.pathname;\r\n");
      out.write("\t\tfor(var index=1;index<path.length;index++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(path.charAt(index)=='/') break;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ttmp=path.substring(0,index);\r\n");
      out.write("\t\tdocument.getElementById(\"ComponentListForm\").action=tmp+\"/componentSearch/SearchByRelationAction.do?asset=\"+v+\"&relation=\"+se.options[se.selectedIndex].value;\r\n");
      out.write("\t\t//alert(document.getElementById(\"ComponentListForm\").action);\r\n");
      out.write("\t\tdocument.getElementById(\"ComponentListForm\").submit();\r\n");
      out.write("\t}\r\n");
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
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" class=mainbody>\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      _jspx_th_html_005fform_005f0.setAction("/componentSearch/PageChange");
      _jspx_th_html_005fform_005f0.setMethod("post");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
          out.write("\tclass=title>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td>查询结果</td>\r\n");
          out.write("\t\t<td align=\"right\"></td>\t\t\r\n");
          out.write("\t</tr>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("<input type=\"hidden\" name=\"hid\">\r\n");
          out.write("\r\n");
          out.write("<div class=list>\r\n");
          out.write("  <table border=\"0\" id=\"ta\">\r\n");
          out.write("    <tr>            \r\n");
          out.write("      <th align=\"center\">序号</th>       \r\n");
          out.write("      <th align=\"center\">构件名称</th>\r\n");
          out.write("      <th align=\"center\">发布日期</th>\r\n");
          out.write("      <th align=\"center\">提供者</th>      \r\n");
          out.write("      <th align=\"center\">所属领域</th>\r\n");
          out.write("      <th align=\"center\">操作</th>      \r\n");
          out.write("    </tr>\r\n");
          out.write("\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005foffset_005fname_005flength_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_logic_005fiterate_005f0.setId("list");
          _jspx_th_logic_005fiterate_005f0.setName("ComponentListForm");
          _jspx_th_logic_005fiterate_005f0.setProperty("componentList");
          _jspx_th_logic_005fiterate_005f0.setIndexId("index");
          _jspx_th_logic_005fiterate_005f0.setLength( String.valueOf(Constant.PAGE_LINES) );
          _jspx_th_logic_005fiterate_005f0.setOffset( String.valueOf(((ComponentListForm)request.getAttribute("ComponentListForm")!=null )
	?(Constant.PAGE_LINES*((ComponentListForm)request.getAttribute("ComponentListForm")).getPage())
	:0) );
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object list = null;
            java.lang.Integer index = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            list = (java.lang.Object) _jspx_page_context.findAttribute("list");
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            do {
              out.write(" \r\n");
              out.write("\r\n");
              out.write("\t\t\t    <tr>         \r\n");
              out.write("\t\t\t      <td align=\"left\" width='30'>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t      <td align=\"left\" width='220'><a onclick=\"w_open('/componentRelease/ComponentList.do?method=viewComponentAction&ID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\">");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</a></td>      \r\n");
              out.write("\t\t\t      <td align=\"left\" width='80'>");
              if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("\t\t\t      <td align=\"center\" width='90'>");
              if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</td>\r\n");
              out.write("\t\t\t      <td align=\"center\" width='60'>");
              if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("</td>     \r\n");
              out.write("\t\t\t      <td align=\"left\" width='150'>\r\n");
              out.write("\t\t\t         <img alt=\"下载\" onclick=\"excel('");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\" src=\"../images/icon/beiyong.gif\">&nbsp         \r\n");
              out.write("\t\t\t         <img alt=\"交流\" onclick=\"w_open(3)\" src=\"../images/icon/square.gif\">&nbsp\r\n");
              out.write("\t\t\t         <img alt=\"反馈\" onclick=\"n_open(4,'");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\" src=\"../images/icon/icon_liulan.gif\">&nbsp\r\n");
              out.write("\t\t\t         <img alt=\"收藏\" onclick=\"w_open(6)\" src=\"../images/icon/icon_saveattach.gif\">&nbsp\r\n");
              out.write("\t\t\t         <img alt=\"报告问题\" onclick=\"n_open(7,'");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\" src=\"../images/ComponentForum1/new_post.gif\">&nbsp  \r\n");
              out.write("\t\t\t         <select id=\"S_relation");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" size=\"1\">\r\n");
              out.write("\t\t\t         \t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
              _jspx_th_logic_005fiterate_005f1.setId("lista");
              _jspx_th_logic_005fiterate_005f1.setName("ComponentListForm");
              _jspx_th_logic_005fiterate_005f1.setProperty("relationTypes");
              int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object lista = null;
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f1.doInitBody();
                }
                lista = (java.lang.Object) _jspx_page_context.findAttribute("lista");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t<option value='");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lista.relationName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write('\'');
                  out.write('>');
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lista.relationName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                  out.write("</option>\t\r\n");
                  out.write("\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                  lista = (java.lang.Object) _jspx_page_context.findAttribute("lista");
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
              out.write("\t\t\t         </select>\r\n");
              out.write("\t\t\t         <img alt=\"通过构建关系查询\" onclick=\"searchByRelation('");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("')\" src=\"../images/icon/search.gif\">&nbsp                 \r\n");
              out.write("\t\t\t      </td>\r\n");
              out.write("\t\t\t    </tr>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              list = (java.lang.Object) _jspx_page_context.findAttribute("list");
              index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005foffset_005fname_005flength_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write(" \r\n");
          out.write("   \r\n");
          out.write(" </table>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write(" <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
          out.write("\tclass=page>\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=\"right\">(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(ComponentListForm.page)*PAGE_LINES+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('－');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(ComponentListForm.page+1)*PAGE_LINES}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(')');
          out.write('/');
          out.write('共');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ComponentListForm.allNum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" &nbsp\r\n");
          out.write("\t\t\t\t\t\t\t第");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ComponentListForm.page+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('页');
          out.write('/');
          out.write('共');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ALL_PAGE}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("页&nbsp\r\n");
          out.write("\t\t\t\t\t\t\t<a onclick='jumpToPage(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${0}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")'> 首页</a> &nbsp\r\n");
          out.write("\t\t\t\t\t\t\t<a onclick='jumpToPage(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ComponentListForm.page-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")'> 上一页</a> &nbsp\r\n");
          out.write("\t\t\t\t\t\t\t<a onclick='jumpToPage(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ComponentListForm.page+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")'>下一页</a>&nbsp \r\n");
          out.write("\t\t\t\t\t\t\t<a onclick='jumpToPage(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ALL_PAGE}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")'>尾页</a> &nbsp跳转至： \t\t\t\r\n");
          out.write("\t\t     <select name=\"menu1\" onChange=\"jumpto(this)\" size=\"1\">\t\t\t     \r\n");
          out.write("\t\t\t     ");
 
			     int curpage=((ComponentListForm)request.getAttribute("ComponentListForm")).getPage();
			    	 for(int i=0;i<x;i++)
			    	 	if(i==curpage)out.println("<option selected>"+(i+1)+"</option>");
			    	 	else out.println("<option>"+(i+1)+"</option>");
			     
          out.write("\r\n");
          out.write("\t\t     </select>\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t</tr>\r\n");
          out.write("</table>\r\n");
          out.write("\r\n");
          out.write("<br>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("list");
    _jspx_th_bean_005fwrite_005f0.setProperty("name");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("list");
    _jspx_th_bean_005fwrite_005f1.setProperty("acceptanceDate");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f2.setName("list");
    _jspx_th_bean_005fwrite_005f2.setProperty("provider");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f3.setName("list");
    _jspx_th_bean_005fwrite_005f3.setProperty("domain");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }
}
