package org.apache.jsp.forum;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class management_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/forum/foot.jsp");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>构件库论坛</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".mainbox {border: 1px solid #CAD9EA; padding: 0px; margin-bottom: 10px;} /* 定义 边框 内边距 底外边距 */\r\n");
      out.write("\t.mainbox h3{ line-height:20px; padding-left:1em;background: #409bdd url(\"../images/forum/header_head.gif\"); background-repeat: repeat-x; background-position: 0 0; color: #FFF;}\r\n");
      out.write("\t.mainbox table { width: 100%; }\r\n");
      out.write("\t.mainbox tbody th, .mainbox tbody td { border-top: 1px solid #CAD9EA; padding: 5px; }\r\n");
      out.write("\t.mainbox tbody cite, .mainbox tbody em { line-height: 1.3em; }\t\r\n");
      out.write("\t.forumlist table { width: 100%;border-collapse: separate;  } /* 定义 表格宽度 定义表格的边框是否被合并为一个单一的边框*/\r\n");
      out.write("\r\n");
      out.write("\t.forumlist thead th, .forumlist thead td { background: url(\"../images/forum/portalbox_bg.gif\");padding: 2px 5px;line-height: 22px;color: #666;}\r\n");
      out.write("\t.forumlist tbody th, .forumlist tbody td { height: 60px; border-top: 1px solid #CAD9EA;;color: #666; padding: 5px 5px;  background-color: #F5FAFE; }\r\n");
      out.write("\t.forumlist th { text-align: left; padding-left: 70px !important;}\r\n");
      out.write("\t.forumlist table tbody .new{ background-image: url(../images/forum/icon/topic_permit.gif); background-repeat: no-repeat; background-position: 20px 40%; }\r\n");
      out.write("\t.forumlist table tbody .normal{ background-image: url(../images/forum//icon/topic_unpermit.gif); background-repeat: no-repeat; background-position: 20px 40%; }\r\n");
      out.write("\t.forumlist tbody th .name{ font-size: 120%; font-weight: bold;}\r\n");
      out.write("\t.forumlist .num {width:12%;text-align: center;font-size: 90%;}\r\n");
      out.write("\t.forumlist .last {width:17%;text-align:left; padding-left:20px;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\t<link id=\"css\" rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("\t<script src=\"../js/common.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write(" \t<div id=\"foruminfo\">\r\n");
      out.write(" \t\t<div id=\"userinfo\">\r\n");
      out.write(" \t\t\t<div id=\"nav\">\r\n");
      out.write(" \t\t\t\t<a href=\"index.do?method=viewIndex\">进入构件论坛</a> &raquo; 欢迎光临，现在是 <script type=\"text/javascript\">var date= new Date(); document.write(date.toLocaleString());\t</script>\r\n");
      out.write(" \t\t\t</div>\r\n");
      out.write(" \t\t</div>\t\r\n");
      out.write(" \t</div>\r\n");
      out.write(" \t\r\n");
      out.write("\t<div id=\"announcement\" onmouseover=\"annstop = 1\" onmouseout=\"annstop = 0\">\r\n");
      out.write("\t\t<div id=\"announcementbody\">\r\n");
      out.write(" \t\t\t<ul>\r\n");
      out.write("\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("bulletin");
      _jspx_th_logic_005fiterate_005f0.setName("ForumHomeForm");
      _jspx_th_logic_005fiterate_005f0.setProperty("forumBulletinList");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object bulletin = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        bulletin = (java.lang.Object) _jspx_page_context.findAttribute("bulletin");
        do {
          out.write("\t\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write(" \t\t\t\t\t<a href=\"bulletin.do?method=viewBulletin\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a><em>(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bulletin.joindate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")</em>\r\n");
          out.write(" \t\t\t\t</li>\r\n");
          out.write(" \t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          bulletin = (java.lang.Object) _jspx_page_context.findAttribute("bulletin");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
      out.write("\r\n");
      out.write(" \t\t\t</ul>\r\n");
      out.write(" \t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tvar anndelay = 3000;\r\n");
      out.write("\t\t\t\tvar annst = 0;\r\n");
      out.write("\t\t\t\tvar annstop = 0;\r\n");
      out.write("\t\t\t\tvar annrowcount = 0;\r\n");
      out.write("\t\t\t\tvar anncount = 0;\r\n");
      out.write("\t\t\t\tvar annlis = $('announcementbody').getElementsByTagName(\"LI\");\r\n");
      out.write("\t\t\t\tvar annrows = new Array();\r\n");
      out.write("\t\t\t\tvar annstatus;\r\n");
      out.write("\t\t\t\tfunction announcementScroll() {\r\n");
      out.write("\t\t\t\t\tif(annstop) {\r\n");
      out.write("\t\t\t\t\t\tannst = setTimeout('announcementScroll()', anndelay);\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(!annst) {\r\n");
      out.write("\t\t\t\t\t\tvar lasttop = -1;\r\n");
      out.write("\t\t\t\t\t\tfor(i = 0;i < annlis.length;i++) {\r\n");
      out.write("\t\t\t\t\t\t\tif(lasttop != annlis[i].offsetTop) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif(lasttop == -1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlasttop = 0;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\tannrows[annrowcount] = annlis[i].offsetTop - lasttop;\r\n");
      out.write("\t\t\t\t\t\t\t\tannrowcount++;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tlasttop = annlis[i].offsetTop;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(annrows.length == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t$('announcement').onmouseover = $('announcement').onmouseout = null;\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tannrows[annrowcount] = annrows[1];\r\n");
      out.write("\t\t\t\t\t\t\t$('announcementbody').innerHTML += '<br style=\"clear:both\" />' + $('announcementbody').innerHTML;\r\n");
      out.write("\t\t\t\t\t\t\tannst = setTimeout('announcementScroll()', anndelay);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tannrowcount = 1;\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(annrowcount >= annrows.length) {\r\n");
      out.write("\t\t\t\t\t\t$('announcementbody').scrollTop = 0;\r\n");
      out.write("\t\t\t\t\t\tannrowcount = 1;\r\n");
      out.write("\t\t\t\t\t\tannst = setTimeout('announcementScroll()', anndelay);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tanncount = 0;\r\n");
      out.write("\t\t\t\t\t\tannouncementScrollnext(annrows[annrowcount]);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tfunction announcementScrollnext(time) {\r\n");
      out.write("\t\t\t\t\t$('announcementbody').scrollTop++;\r\n");
      out.write("\t\t\t\t\tanncount++;\r\n");
      out.write("\t\t\t\t\tif(anncount != time) {\r\n");
      out.write("\t\t\t\t\t\tannst = setTimeout('announcementScrollnext(' + time + ')', 10);\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tannrowcount++;\r\n");
      out.write("\t\t\t\t\t\tannst = setTimeout('announcementScroll()', anndelay);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">announcementScroll();</script>\r\n");
      out.write("\t<div class=\"mainbox forumlist\">\r\n");
      out.write("\t\t<h3>\r\n");
      out.write("\t\t\t构件库论坛\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t论坛\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<td class=\"num\">\r\n");
      out.write("\t\t\t\t\t\t主题/帖子\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"last\">\r\n");
      out.write("\t\t\t\t\t\t最后发表\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t操作\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f1.setParent(null);
      _jspx_th_logic_005fiterate_005f1.setId("forum");
      _jspx_th_logic_005fiterate_005f1.setName("ForumHomeForm");
      _jspx_th_logic_005fiterate_005f1.setProperty("forumForumList");
      int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object forum = null;
        if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f1.doInitBody();
        }
        forum = (java.lang.Object) _jspx_page_context.findAttribute("forum");
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<th class=\"normal\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"forum.do?method=viewForum&forumId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.forumid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"name\" style=\"color:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.color}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" target=\"_blank\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.forumname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t<p class=\"moderators\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.forumread}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t</th>\t\r\n");
          out.write("\t\t\t\t\t\t<td class=\"num\"> \r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.topicnum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write('/');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.postnum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fnotEqual_005f0(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fequal_005f0(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"#\">管理窗口</a>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
          forum = (java.lang.Object) _jspx_page_context.findAttribute("forum");
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
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"managelink\">\r\n");
      out.write("\t<a href=\"bulletin.do?method=manageBulletin\" >管理公告信息</a> \r\n");
      out.write("\t<a href=\"index.do?method=manageForumList\">管理构建论坛</a>\t\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p id=\"copyright\">\r\n");
      out.write("\t\tPowered by <strong><a href=\"http://www.xjtu.edu.cn\" target=\"_blank\">xjtuse</a></strong>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write(" \t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_logic_005fnotEqual_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fnotEqual_005f0.setName("forum");
    _jspx_th_logic_005fnotEqual_005f0.setProperty("topicnum");
    _jspx_th_logic_005fnotEqual_005f0.setValue("0");
    int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<p>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"topic.do?forumId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.forumid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&topicId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.topicid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" target=\"_blank\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.topicname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t\t\t\t\t<p class=\"moderators\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\tBy: <a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a> - <span class=\"time\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${forum.posttime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f0.setName("forum");
    _jspx_th_logic_005fequal_005f0.setProperty("topicnum");
    _jspx_th_logic_005fequal_005f0.setValue("0");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<p>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t暂无\r\n");
        out.write("\t\t\t\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t\t\t\t");
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
}
