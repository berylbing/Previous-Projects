<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<html>
<head>
<title>构件问题报告追踪</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script src="../js/calendar.js" type="text/javascript"></script>
<script>
	function change(a) {

	}

	function excel() {
		window.open("excel/按考核对象统计.xls");
	}
	
	
	function appendRecord() {
		var r = document.getElementById("record");
		r.style.display = "";
	}
	
	function saveRecord() {
               
               var a1 = document.getElementsByName("cname");
               var a2 = document.getElementsByName("sx")[0];
               var ax = a2.options[a2.selectedIndex].text
               
               var cellStrArray = new Array();
               cellStrArray[0] = "<a onclick='problemQuery()'>2008ZX01023-001</a>";		
               cellStrArray[1] = a1[0].value;	
               cellStrArray[2] = a1[1].value;	  	
               cellStrArray[3] = a1[2].value;	
               cellStrArray[4] = ax;
	
	       var tb = document.getElementById("ta");
	       addRow(ta,-1,cellStrArray);  		
						
		var r = document.getElementById("record");
		r.style.display = "none";
	}
	
        //在表中增加行 tableobj:表格对象;trnumber:行号; TRSTRING:各TD中的值;
        function addRow(tableObj,trNumber,trString)
        {
            var trObj = tableObj.insertRow(trNumber);
            for(var i=0 ; i<trString.length ; i++)
            {
   	       var tdObj = trObj.insertCell();
   	       tdObj.insertAdjacentHTML("AfterBegin",trString[i]);
            }
        }	


        function problemQuery(rid){
         	window.location = "../componentFeedBack/problemReport.do?method=listProblemReport&RID=" + rid;
        }

        function n_open(rid){
    		if(document.getElementById("dateOfInformation").value == "")
    		{
    			alert("请选择执行日期");
    			return;
    		}
    		if(document.getElementById("content").value == "")
    		{
    			alert("请填写执行内容");
    			return;
    		}
            
        	var actionPath = "../componentFeedBack/problemTrace.do?method=addProblemTrace&RID=" + rid;
        	document.getElementById("ProblemTraceForm").action = actionPath;
        	document.getElementById("ProblemTraceForm").submit();
        }
    			
</script>

<style>
	img { cursor:hand; }
	a { cursor:hand; }
	dl { margin:0; margin-bottom:0 }
</style>

</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0"
	class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0"
	class=title>
	<tr>
		<td>问题汇总</td>
	</tr>
</table>

<hr color=#97D2FF>

<div class=list>
  <table border="0" id="ta">
    <tr>               
      <th align="center">问题编号</th>
      <th align="center">责任人</th>      
      <th align="center">执行日期</th>
      <th align="center">执行内容</th>      
      <th align="center">解决状态</th>    
    </tr>
    <logic:iterate id="problemTrace" name="problemTraceList" indexId="index">
	   <tr>
	      <td align="center" width='120'><a onclick="problemQuery('${problemTrace.problemreport.recordId}')">${problemTrace.reportId}</a></td> 
	      <td align="center" width='60'>${problemTrace.person}</td>
	      <td align="center" width='80'><nested:write name="problemTrace" property="dateOfInformation"/></td>
	      <td align="center" width='90'>${problemTrace.content}</td>
	        <!-- 解决状态还不确定 -->
	       <td align="center" width='60'>
	      		<logic:equal name="problemTrace" property="status" value="0">待解决</logic:equal>
				<logic:equal name="problemTrace" property="status" value="1">已解决</logic:equal>
	      </td>
	   </tr> 	
   </logic:iterate>
    

 </table>
</div>

  <div id=bc align=right>
  	<input onclick='appendRecord()' type=button value=' 追 加 ' class='input_button'>  	
  </div>

<br>

<div id="record" class=editblock style="display:none">
	<html:form method="post" action="/componentFeedBack/problemTrace.do?method=addProblemTrace">
		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" id="tb">
						
	
			<tr height="35"> 
			  <th align="right" width="25%">执行日期：</th>
			  <td width="75%"><nested:text property="dateOfInformation" value="" onfocus="calendar(this,null,null,null)"/></td>
			</tr>	
			<tr height="35"> 
			  <th align="right" width="25%">执行内容：</th>
			  <td width="75%"><nested:text property="content"/></td>
			</tr>
			<tr height="35"> 
			  <th align="right" width="25%">解决状态：</th>
			  <td width="75%">
			        <nested:select property="status" onchange="change(this.value)">			
					<option value="0">待解决</option>
					<option value="1">已解决</option>						
			        </nested:select>
			  </td>
			</tr>										
		</table>
	</html:form>
	
  <div id=bc align=right>
  	<input onclick="n_open('${RID}')" type=button value=' 确 定 ' class='input_button'>  	
  </div>
  
</div> 
</body>
</html>
