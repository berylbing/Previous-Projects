package org.apache.jsp.forum;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forumDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/forum/head.jsp");
    _jspx_dependants.add("/forum/foot.jsp");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-nested.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.release();
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
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("\t<title>构件库论坛</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("\t<script src=\"../js/common.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t.portalbox { width: 100%; background: #CAD9EA; margin-bottom: 10px; border-collapse: separate; }\r\n");
      out.write("\t.portalbox td { padding: 10px; vertical-align: top; background: #FFF; background-repeat: repeat-x; background-position: 0 0; background-repeat: repeat-x; border: 1px solid #FFF; }\r\n");
      out.write("\t\t.portalbox h3 { margin: 0 0 0px; font-size: 1em; white-space: nowrap; }\r\n");
      out.write("\t\t.portalbox strong { font-weight: bold; margin-top: 4px;}\r\n");
      out.write("\t\t.portalbox em { color: #999; }\r\n");
      out.write("\t\t\t.portalbox em a { color: #999; }\r\n");
      out.write("\t\t\t.portalbox cite a { color: #069; }\r\n");
      out.write("\t\t#hottags a { white-space: nowrap; margin-right: 0.5em; }\r\n");
      out.write("\t\t#hottags h3 { clear:both; }\r\n");
      out.write("\t.mainbox {border: 1px solid #CAD9EA; padding: 0px; margin-bottom: 10px;} /* 定义 边框 内边距 底外边距 */\r\n");
      out.write("\t\t.mainbox h3{ line-height:20px; padding-left:1em;background: #409bdd url(\"../images/forum/header_head.gif\"); background-repeat: repeat-x; background-position: 0 0; color: #FFF;}\r\n");
      out.write("\t\t.mainbox table { width: 100%; }\r\n");
      out.write("\t\t.mainbox tbody th, .mainbox tbody td { border-top: 1px solid #CAD9EA; padding: 5px; }\r\n");
      out.write("\t\t.mainbox tbody cite, .mainbox tbody em { line-height: 1.3em; }\r\n");
      out.write("\t\t/* 论坛样式*/\t\r\n");
      out.write("\t.forumlist table { width: 100%;border-collapse: separate;  } /* 定义 表格宽度 定义表格的边框是否被合并为一个单一的边框*/\r\n");
      out.write("\t\t.forumlist thead th, .forumlist thead td { background: url(\"../images/forum/portalbox_bg.gif\");padding: 2px 5px;line-height: 22px;color: #666;}\r\n");
      out.write("\t\t.forumlist tbody th, .forumlist tbody td { height: 60px; border-top: 1px solid #CAD9EA;;color: #666; padding: 5px 5px;  background-color: #F5FAFE; }\r\n");
      out.write("\t\t.forumlist th { text-align: left; padding-left: 70px !important;}\r\n");
      out.write("\t\t.forumlist table tbody .new{ background-image: url(../images/forum/icon/topic_permit.gif); background-repeat: no-repeat; background-position: 20px 40%; }\r\n");
      out.write("\t\t.forumlist table tbody .normal{ background-image: url(../images/forum//icon/topic_unpermit.gif); background-repeat: no-repeat; background-position: 20px 40%; }\r\n");
      out.write("\t\t.forumlist tbody th .name{ font-size: 120%; font-weight: bold;}\r\n");
      out.write("\t\t.forumlist .master {width:11%;text-align:left;}\r\n");
      out.write("\t\t.forumlist .num {width:12%;text-align: center;font-size: 90%;}\r\n");
      out.write("\t\t.forumlist .last {width:17%;text-align:left; padding-left:20px;}\r\n");
      out.write("\r\n");
      out.write("\t\t.todaynum { color: #069;font-size: 100%; }\r\n");
      out.write("\t\t.moderators { color: #666; }\r\n");
      out.write("\t\t.moderators a { color: #069; }\r\n");
      out.write("\t\t.moderators .time { font-size: 90%; color: #666;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t.forumlist table,.threadlist table { border-collapse: separate; }\r\n");
      out.write("\t\t\t.forumlist tbody strong,.threadlist tbody strong , .formbox tbody strong   { color: #090; }\r\n");
      out.write("\t\t\t.threadlist tbody th, .threadlist tbody td { color: #666; padding: 1px 5px; background-color: #F5FAFE;  }\r\n");
      out.write("\t\t\t.threadlist th { text-align: left; font: 14px Tahoma,Helvetica,Arial,sans-serif; }\r\n");
      out.write("\t\t\t.threadlist tbody tr { height:30px; }\r\n");
      out.write("\t\t\t.threadlist .ann tr { height:25px; }\r\n");
      out.write("\t\t\t.threadlist th label { float: right; vertical-align: absmiddle;}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t.threadpages { background: url(../images/multipage.gif) no-repeat 0 100%; font-size: 11px; margin-left: 5px; white-space: nowrap; }\r\n");
      out.write("\t\t\t.threadpages a { padding-left: 8px; }\r\n");
      out.write("\t\t\t.threadpages a:hover { text-decoration: underline; }\r\n");
      out.write("\t\t\t.threadlist td.folder { text-align: center; width: 30px; }\r\n");
      out.write("\t\t.threadlist td.icon { text-align: center; padding: 3px 0; width: 30px; }\r\n");
      out.write("\t\t.threadlist th.title { width: 55%;font: 12px Tahoma,Helvetica,Arial,sans-serif;}\r\n");
      out.write("\t\t.threadlist th.status {  text-align: right;width:9%;  }\t\t\r\n");
      out.write("\t\t.threadlist td.nums { text-align: center; width: 10%; font: 12px Tahoma,Helvetica,Arial,sans-serif;  }\t\t\r\n");
      out.write("\t\t.threadlist td.author { width: 8%;  text-align: center; font: 12px Tahoma,Helvetica,Arial,sans-serif;  }\t\t\r\n");
      out.write("\t\t.threadlist td.lastpost { text-align: left; width: 18%; padding-left: 20px;  font: 12px Tahoma,Helvetica,Arial,sans-serif; }\t\t\r\n");
      out.write("\t\t.threadlist td.lastpost a , .threadlist td.author a { color: #069; font: 12px Tahoma,Helvetica,Arial,sans-serif;}\t\r\n");
      out.write("\t\t.threadlist td.author em, .threadlist td.lastpost em { font: 11px Tahoma,Helvetica,Arial,sans-serif;  }\t\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<h2>\r\n");
      out.write("\t\t<a href=\"index.do?method=viewIndex\" title=\"构件库论坛\"><img src=\"../images/logo.gif\" border='0' /></a>\r\n");
      out.write("\t</h2>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"foruminfo\">\r\n");
      out.write("\t\t\t\t<div id=\"userinfo\">\r\n");
      out.write("\t\t\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.do?method=viewIndex\">构件库论坛</a> &raquo; ");
      if (_jspx_meth_bean_005fwrite_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_logic_005fnotEmpty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<div class=\"forumcontrol\">\r\n");
      out.write("\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"postbtn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a title=\"发表主题\" href=\"editTopic.do?forumId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumForumForm.forumForum.forumid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"newspecial\"><img src=\"../images/forum/icon/newtopic.gif\" alt=\"发表主题\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"mainbox threadlist\">\r\n");
      out.write("\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_bean_005fwrite_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"folder\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t标题\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"author\">\r\n");
      out.write("\t\t\t\t\t\t\t\t作者\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"nums\">\r\n");
      out.write("\t\t\t\t\t\t\t\t回复/查看\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lastpost\">\r\n");
      out.write("\t\t\t\t\t\t\t\t最后发表\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"folder\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a title=\"新窗口打开\" href=\"bulletin.do?method=viewBulletin\" target=\"_blank\"><img src=\"../images/forum/icon/common.gif\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"bulletin.do?method=viewBulletin\">论坛公告</a>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"author\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"nums\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"lastpost\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<em>&nbsp;</em> <cite>&nbsp;</cite>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t<thead class=\"separation\">\r\n");
      out.write("\t\t\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"1\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font color=#000000><b>普通主题</b></font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody class=\"topic\">\r\n");
      out.write("\t\t\t\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("topic");
      _jspx_th_logic_005fiterate_005f0.setName("ForumForumForm");
      _jspx_th_logic_005fiterate_005f0.setProperty("topicList");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object topic = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        topic = (java.lang.Object) _jspx_page_context.findAttribute("topic");
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"folder\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<a href=\"topic.do?forumId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.forumid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&topicId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.topicid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" title=\"新窗口打开\" target=\"_blank\"><img src=\"../images/forum/icon/common.gif\" /></a>\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"icon\">\r\n");
          out.write("\t\t\t\t\t\t\t\t&nbsp;\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<th>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"topic.do?forumId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.forumid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&topicId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.topicid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.topicname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</span>\r\n");
          out.write("\t\t\t\t\t\t\t</th>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"author\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<br><a>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a><br/>\r\n");
          out.write("\t\t\t\t\t\t\t\t<em>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.posttime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</em>\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"nums\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<font color=#000000>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.replynum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</font> / <em>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.hitnum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</em>\r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td class=\"lastpost\">\r\n");
          out.write("\t\t\t\t\t\t\t\tBy: <a>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.replyname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a> - <em>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${topic.replytime }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</em> \r\n");
          out.write("\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          topic = (java.lang.Object) _jspx_page_context.findAttribute("topic");
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
      out.write("\t\t\t\t\t</tbody>\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"forumcontrol\">\r\n");
      out.write("\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\t\t\r\n");
      out.write("\t\t\t\t\t\t<td width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"postbtn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a title=\"发表主题\" href=\"editTopic.do?forumId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ForumForumForm.forumForum.forumid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"newspecial\"><img src=\"../images/forum/icon/newtopic.gif\" alt=\"发表主题\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style_common.css\" />\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<p id=\"copyright\">\r\n");
      out.write("\t\tPowered by <strong><a href=\"http://www.xjtu.edu.cn\" target=\"_blank\">xjtuse</a></strong>\r\n");
      out.write("\t</p>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent(null);
    _jspx_th_bean_005fwrite_005f0.setName("ForumForumForm");
    _jspx_th_bean_005fwrite_005f0.setProperty("forumForum.forumname");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEmpty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEmpty
    org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
    _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEmpty_005f0.setParent(null);
    _jspx_th_logic_005fnotEmpty_005f0.setName("ForumForumForm");
    _jspx_th_logic_005fnotEmpty_005f0.setProperty("forumForum.rule");
    int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<table class=\"portalbox\" cellpadding=\"0\" cellspacing=\"1\">\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t<h3>\r\n");
        out.write("\t\t\t\t\t\t\t本版规则\r\n");
        out.write("\t\t\t\t\t\t</h3>\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fnotEmpty_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEmpty_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("ForumForumForm");
    _jspx_th_bean_005fwrite_005f1.setProperty("forumForum.rule");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent(null);
    _jspx_th_bean_005fwrite_005f2.setName("ForumForumForm");
    _jspx_th_bean_005fwrite_005f2.setProperty("forumForum.forumname");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }
}
