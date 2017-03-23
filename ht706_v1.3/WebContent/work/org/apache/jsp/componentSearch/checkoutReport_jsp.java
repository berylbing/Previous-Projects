package org.apache.jsp.componentSearch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class checkoutReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fname_005fnobody.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>构件问题报告</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<link href=\"../css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/check.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/calendar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction change() {\r\n");
      out.write("\r\n");
      out.write("\t}\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      _jspx_th_html_005fform_005f0.setAction("/componentSearch/Checkout.do?method=checkout");
      _jspx_th_html_005fform_005f0.setMethod("post");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\"\r\n");
          out.write("\tclass=mainbody>\r\n");
          out.write("\r\n");
          out.write("<div class=editblock >\r\n");
          out.write("<table border=\"0\">\r\n");
          out.write("     <tr height=\"20\"><th colspan=\"4\">构件出库记录单</th></tr>\r\n");
          out.write("\r\n");
          out.write("     <tr>\r\n");
          out.write("        <td width=\"15%\" align=\"center\">构件名称</td>\r\n");
          out.write("        <td width=\"35%\" align=\"left\">");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("        <td align=\"center\">构件标识</td>\r\n");
          out.write("        <td align=\"left\">");
          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("        \r\n");
          out.write("     </tr>\r\n");
          out.write("     <tr>\r\n");
          out.write("        <td align=\"center\">申请人</td>\r\n");
          out.write("        <td align=\"left\">");
          //  html:text
          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
          _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
          _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005ftext_005f0.setName("CheckoutForm");
          _jspx_th_html_005ftext_005f0.setProperty("checkout.proposer");
          _jspx_th_html_005ftext_005f0.setValue((String)request.getSession().getAttribute("UserRealName") );
          int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
          if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
          out.write("</td>\r\n");
          out.write("        <td align=\"center\">申请时间</td>\r\n");
          out.write("        <td align=\"left\">");
          //  html:text
          org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
          _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
          _jspx_th_html_005ftext_005f1.setName("CheckoutForm");
          _jspx_th_html_005ftext_005f1.setProperty("dateOfInformation");
          _jspx_th_html_005ftext_005f1.setValue(new Date().toLocaleString().substring(0,10) );
          _jspx_th_html_005ftext_005f1.setOnfocus("calendar(this,null,null,null)");
          int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
          if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fvalue_005fproperty_005fonfocus_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
          out.write("</td>        \r\n");
          out.write("     </tr>\r\n");
          out.write("     <tr>\r\n");
          out.write("        <td align=\"center\">出库目的</td>\r\n");
          out.write("        <td align=\"left\" colspan=\"3\">\r\n");
          out.write("        ");
          if (_jspx_meth_html_005fradio_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_html_005fradio_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          if (_jspx_meth_html_005fradio_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                 \r\n");
          out.write("        </td>\r\n");
          out.write("     </tr>\r\n");
          out.write("     <tr>\r\n");
          out.write("        <td align=\"center\">应用项目<font color=\"red\">*</font></td>\r\n");
          out.write("        <td align=\"left\" colspan=\"3\">");
          if (_jspx_meth_html_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("</td>\t    \r\n");
          out.write("     </tr>\r\n");
          out.write("         <tr>\r\n");
          out.write("           <td width=\"15%\" align=\"center\">出库说明<font color=\"red\">*</font></td>\r\n");
          out.write("           <td colspan=\"3\" width=\"85%\" height=\"50\">\r\n");
          out.write("               ");
          if (_jspx_meth_html_005ftextarea_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("           </td>\r\n");
          out.write("           \r\n");
          out.write("         </tr>\r\n");
          out.write("         <tr>\r\n");
          out.write("           <td width=\"15%\" align=\"center\">反馈协议</td>\r\n");
          out.write("           <td colspan=\"3\" width=\"85%\" height=\"50\">");
          if (_jspx_meth_html_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("         </tr>\r\n");
          out.write("      ");
          if (_jspx_meth_html_005fhidden_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("</table>\r\n");
          out.write("     <input type=\"submit\" value=\"出库\" >\r\n");
          out.write("     <input type=\"button\" value=\"取消\" onclick=\"window.close()\">     \r\n");
          out.write("</div>\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("CheckoutForm");
    _jspx_th_bean_005fwrite_005f0.setProperty("asset.name");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("CheckoutForm");
    _jspx_th_bean_005fwrite_005f1.setProperty("asset.uniqueId");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
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
    _jspx_th_html_005fradio_005f0.setName("CheckoutForm");
    _jspx_th_html_005fradio_005f0.setProperty("checkout.purpose");
    _jspx_th_html_005fradio_005f0.setValue("复用");
    int _jspx_eval_html_005fradio_005f0 = _jspx_th_html_005fradio_005f0.doStartTag();
    if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f0.doInitBody();
      }
      do {
        out.write('复');
        out.write('用');
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
    _jspx_th_html_005fradio_005f1.setName("CheckoutForm");
    _jspx_th_html_005fradio_005f1.setProperty("checkout.purpose");
    _jspx_th_html_005fradio_005f1.setValue("修改");
    int _jspx_eval_html_005fradio_005f1 = _jspx_th_html_005fradio_005f1.doStartTag();
    if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f1.doInitBody();
      }
      do {
        out.write('修');
        out.write('改');
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

  private boolean _jspx_meth_html_005fradio_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:radio
    org.apache.struts.taglib.html.RadioTag _jspx_th_html_005fradio_005f2 = (org.apache.struts.taglib.html.RadioTag) _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.html.RadioTag.class);
    _jspx_th_html_005fradio_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fradio_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fradio_005f2.setName("CheckoutForm");
    _jspx_th_html_005fradio_005f2.setProperty("checkout.purpose");
    _jspx_th_html_005fradio_005f2.setValue("其它");
    int _jspx_eval_html_005fradio_005f2 = _jspx_th_html_005fradio_005f2.doStartTag();
    if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fradio_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fradio_005f2.doInitBody();
      }
      do {
        out.write('其');
        out.write('它');
        int evalDoAfterBody = _jspx_th_html_005fradio_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fradio_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fradio_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_html_005fradio_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fradio_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_html_005fradio_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ftext_005f2.setName("CheckoutForm");
    _jspx_th_html_005ftext_005f2.setProperty("checkout.project");
    int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
    if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_005ftextarea_005f0 = (org.apache.struts.taglib.html.TextareaTag) _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ftextarea_005f0.setName("CheckoutForm");
    _jspx_th_html_005ftextarea_005f0.setProperty("checkout.reason");
    int _jspx_eval_html_005ftextarea_005f0 = _jspx_th_html_005ftextarea_005f0.doStartTag();
    if (_jspx_th_html_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftextarea_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ftext_005f3.setName("CheckoutForm");
    _jspx_th_html_005ftext_005f3.setProperty("checkout.agreement");
    int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
    if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fhidden_005f0.setName("CheckoutForm");
    _jspx_th_html_005fhidden_005f0.setProperty("checkout.uniqueId");
    _jspx_th_html_005fhidden_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CheckoutForm.asset.uniqueId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fname_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }
}
