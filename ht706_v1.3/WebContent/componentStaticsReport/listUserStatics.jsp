<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="js/check.js" type="text/javascript"></script>

<body>

<div class=list>
  <table border="0" id="ta">
    <tr>      
      <th align="center" colspan="3">用户信息统计</th>    
    </tr>
    <tr>
      <td>用户总数</td>    
      <td>${userNumber}</td>
      <td align="right"><a href="ReportAction.do?method=listByUser">查看人员明细&nbsp;&nbsp;&nbsp;</a></td>         
    </tr>
    <tr>
      <td>部门总数</td>
      <td>${departmentNumber}</td>  
      <td align="right"><a href="ReportAction.do?method=listByDepartment">查看人员明细&nbsp;&nbsp;&nbsp;</a></td>        
    </tr>
    <tr>
      <td>角色总数</td>
      <td>${actorNumber}</td> 
      <td align="right"><a href="ReportAction.do?method=listByActor">查看人员明细&nbsp;&nbsp;&nbsp;</a></td>           
    </tr>     
             
 </table>
</div>

</body>
</html>