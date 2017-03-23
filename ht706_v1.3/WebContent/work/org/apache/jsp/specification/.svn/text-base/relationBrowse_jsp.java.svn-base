package org.apache.jsp.specification;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import java.util.List;
import com.ht706.componentLibrary.util.Constant;

public final class relationBrowse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.release();
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
 
   int totalPage=(Integer)request.getAttribute("totalPage");
   int pageNumber=1;
   if(request.getParameter("page")!=null){
         pageNumber=Integer.parseInt(request.getParameter("page"));
   }

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t    function toPage(obj) {\r\n");
      out.write("\t\t     location.href = 'RelationtypeAction.do?method=ShowRelationAction&select=search&spid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&page=' + obj.value;\r\n");
      out.write("\t\t}\r\n");
      out.write("     </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
      out.write("\tclass=mainbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=title>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>已定义构件关系</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!--如果页面中有提示信息，可放此处--->\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=info>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>只能选择一项进行处理</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!--如果页面中有提示信息，可放此处  over--->\r\n");
      out.write("\r\n");
      out.write("<hr color=#97D2FF>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=list>\r\n");
      out.write("<table id=\"ta\">\r\n");
      if (_jspx_meth_nested_005fhidden_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"10%\">序号</th>\r\n");
      out.write("\t\t<th width=\"20%\">关系名称</th>\r\n");
      out.write("\t\t<th width=\"20%\">对应关系</th>\t\t\r\n");
      out.write("\t\t<th>关系说明</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("element");
      _jspx_th_logic_005fiterate_005f0.setName("relationList");
      _jspx_th_logic_005fiterate_005f0.setIndexId("index");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object element = null;
        java.lang.Integer index = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        element = (java.lang.Object) _jspx_page_context.findAttribute("element");
        index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
        do {
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagelines*(pageNumbers-1)+index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.relationName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.relationType }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t<td align=\"center\">\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${element.description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t</td>\r\n");
          out.write("\t\t\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          element = (java.lang.Object) _jspx_page_context.findAttribute("element");
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
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<hr color=#97D2FF>\r\n");
      out.write("<table  width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n");
      out.write("\tclass=page>\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"right\">\r\n");
      out.write("<div >\t\r\n");
      out.write("\t\t<font size=2px color=\"black\">(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagelines*(pageNumbers-1)+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('-');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagelines*pageNumbers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(')');
      out.write(' ');
      out.write('共');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write(' ');
      out.write('第');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNumbers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('页');
      out.write('/');
      out.write('共');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("页</font>\r\n");
      out.write("\t\t\t\t");
if(pageNumber<=1){
      out.write("\r\n");
      out.write("\t\t             <font size=2px color=\"black\">首页</font>\r\n");
      out.write("\t\t        ");
}else{
      out.write("\r\n");
      out.write("\t\t              <a href=\"RelationtypeAction.do?method=ShowRelationAction&select=search&spid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&page=1\"><font size=2px>首页</font></a>\r\n");
      out.write("\t\t        ");
 }
      out.write("\r\n");
      out.write("                 ");
if(pageNumber<=1){
      out.write("\r\n");
      out.write("\t\t             <font size=2px color=\"black\">上一页</font>\r\n");
      out.write("\t\t        ");
}else{
      out.write("\r\n");
      out.write("\t\t              <a href=\"RelationtypeAction.do?method=ShowRelationAction&select=search&spid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&page=");
      out.print((pageNumber-1));
      out.write("\"><font size=2px>上一页</font></a>\r\n");
      out.write("\t\t        ");
 }
      out.write("\r\n");
      out.write("\t\t        ");
if(pageNumber>=totalPage){
      out.write("\r\n");
      out.write("\t\t             <font size=2px color=\"black\">下一页</font>\r\n");
      out.write("\t\t        ");
}else{
      out.write("\r\n");
      out.write("\t\t              <a href=\"RelationtypeAction.do?method=ShowRelationAction&select=search&spid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&page=");
      out.print((pageNumber+1));
      out.write("\"><font size=2px>下一页</font></a>\r\n");
      out.write("\t\t        ");
 }
      out.write("\r\n");
      out.write("\t\t        ");
if(pageNumber>=totalPage){
      out.write("\r\n");
      out.write("\t\t             <font size=2px color=\"black\">末页</font>\r\n");
      out.write("\t\t        ");
}else{
      out.write("\r\n");
      out.write("\t\t              <a href=\"RelationtypeAction.do?method=ShowRelationAction&select=search&spid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&page=");
      out.print(totalPage );
      out.write("\"><font size=2px>末页</font></a>\r\n");
      out.write("\t\t        ");
 }
      out.write("\r\n");
      out.write("\t\t\t\t<font size=2px>第</font><select name=\"page\" onchange=\"toPage(this)\">\r\n");
      out.write("\t\t\t\t ");
 for(int i=1;i<=totalPage;i++){
      out.write("\r\n");
      out.write("\t\t\t\t<option value=\"");
      out.print(i );
      out.write("\"\r\n");
      out.write("\t\t\t\t");
if(i==pageNumber){
      out.write(" selected");
} 
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\t\r\n");
      out.write("\t\t\t\t</select><font size=2px>页</font>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
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

  private boolean _jspx_meth_nested_005fhidden_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nested:hidden
    org.apache.struts.taglib.nested.html.NestedHiddenTag _jspx_th_nested_005fhidden_005f0 = (org.apache.struts.taglib.nested.html.NestedHiddenTag) _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.nested.html.NestedHiddenTag.class);
    _jspx_th_nested_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nested_005fhidden_005f0.setParent(null);
    _jspx_th_nested_005fhidden_005f0.setProperty("spid");
    _jspx_th_nested_005fhidden_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${spid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_nested_005fhidden_005f0 = _jspx_th_nested_005fhidden_005f0.doStartTag();
    if (_jspx_th_nested_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnested_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_nested_005fhidden_005f0);
    return false;
  }
}
