<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>软件构件库管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function submitToServer() {
		window.close();
		//document.getElementById("SearchFilterForm").action="/HT706/CreatComponent.do?method=saveComponentAction&update=true";
		document.getElementById("SearchFilterForm").submit();
	}
	</script>
	<script type="text/javascript" for="searchType" event="onclick">
		
		//alert(value);
		if(value=="基于属性值"){
			document.getElementById("type1").style.display="";
			document.getElementById("type2").style.display="none";
		}
		if(value=="基于关键词"){
			document.getElementById("type1").style.display="none";
			document.getElementById("type2").style.display="";
		}

		}
	</script>
<style>
	input{
		font-size: 12px;
		color: #000000;
		background-color: #F1F4F5;
		border: 1px solid #49789C;
		padding:2px 0px 0px 5px;
	}
</style>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<html:form action="/componentSearch/SearchFilter" target="mainFrame">
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>高级检索</td>
  </tr>
</table><hr color=#97D2FF>
<br>
<div align="left">
	<input type="radio" name="searchType" value="基于属性值" checked>基于属性值	
	<input type="radio" name="searchType" value="基于关键词">基于关键词
</div>
<br>


<div class=editblock >
<div id="type1">
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" >
	
		<tr height="20"> 
		  <th align="right" width="25%">名称：</th>
		  <td width="15%">
				等于
		  </td>
		  <td width="50%"><html:text property="name" size="40"></html:text></td>
		  <td width="15%">
		  	<html:select property="logicType1" size="1" >			
					<html:option value="与">与</html:option>
					<html:option value="或">或</html:option>								
		        </html:select>
		  </td>		  
		</tr>
		<tr height="20"> 
		  <th align="right" width="25%">提供者：</th>
		  <td width="15%">
				等于
		  </td>
		  <td width="50%"><html:text property="provider" size="40"></html:text></td>
		  <td width="15%">
		  	<html:select property="logicType2" size="1" >			
					<html:option value="或">或</html:option>
					<html:option value="与">与</html:option>								
		    </html:select>
		  </td>			  
		</tr>
		<tr height="20"> 
		  <th align="right" width="25%">领域：</th>
		  <td width="15%">
		  	<html:select property="relationType1" size="1" >			
				<html:option value="等于">等于</html:option>
				<html:option value="包括">包括</html:option>								
		    </html:select>
		  </td>
		  <td width="50%"><html:text property="domain" size="40"/></td>
		  <td width="15%">
		  	<html:select property="logicType3" size="1" >			
					<html:option value="或">或</html:option>
					<html:option value="与">与</html:option>								
		        </html:select>
		  </td>			  
		</tr>	
		<tr height="20"> 
		  <th align="right" width="25%">形成日期：</th>
		  <td width="15%">
		  	<html:select property="relationType2" size="1" >			
					<html:option value="之前">之前</html:option>
					<html:option value="等于">等于</html:option>	
					<html:option value="之后">之后</html:option>								
		    </html:select>
		  </td>
		  <td width="50%"><html:text property="date" size="40"/></td>
		  <td width="15%">
		  </td>			  
		</tr>	
			
	</table>
	</div>
	<div id="type2" >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" >
	
		<tr height="20"> 
		  <th align="right" width="25%">关键字：</th>
		  <td width="15%">
				等于
		  </td>
		  <td width="50%"><html:text property="keyword" size="40"></html:text></td>
		  <td width="15%">

		  </td>		  
		</tr>
	</table>
	</div>
  <div id=bc align=right>
  	<input onclick='submitToServer()' type=button value=' 确 定 ' class='input_button'>
  </div>

</div>
  </html:form>
</body>

</html>
