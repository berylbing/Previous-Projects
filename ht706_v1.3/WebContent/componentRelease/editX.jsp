<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>���������ϵͳ</title>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<link href="css/common.css" rel="stylesheet" type="text/css">
<script src="../js/calendar.js" type="text/javascript"></script>
<script>

	function saveElement() {
		if(checkData()){
			path=window.location.href;//alert(path);
			index=path.indexOf("assetId=");
			//alert(index);
			if(index==-1) assetid=getElementById("assetId").value;
			else assetid="&"+path.substring(index);
			//alert(assetid);
			v=document.getElementById("isUpdate").value;	//alert(v);
			if(v==null || v=="" ) {
				document.getElementById("ComponentElementForm").action+=assetid;
				document.getElementById("ComponentElementForm").target="_self";
				form=document.getElementById("ComponentElementForm");
				if(form.getAttribute('enctype')!='multipart/form-data'&&form.encoding!='multipart/form-data'){
				  if(form.encoding){
				      form.setAttribute('encoding','multipart/form-data');
				  }else{
				      form.setAttribute('enctype','multipart/form-data');
				  }
				}
				document.getElementById("ComponentElementForm").submit();
			}else {
				document.getElementById("ComponentElementForm").action+=(assetid+"&elementId="+v);
				//document.getElementById("ComponentElementForm").action+=assetid;
				//alert(document.getElementById("ComponentElementForm").action);
				document.getElementById("ComponentElementForm").submit();
				//window.opener.location.reload();
				window.close();
			}
		}
	}
	function checkData(){
		if(document.getElementById("element.name").value==""){alert("������'Ԫ������'");return false;}
		if(document.getElementById("element.elementType").value==""){alert("������'����'");return false;}
		return true;

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
 <html:form action="/componentRelease/CreatComponentElement.do?method=creatComponentElementAction" method="post"  target="mmFrame">
  <html:hidden property="isUpdate"/>
  <html:hidden property="assetId"/>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>
  <tr>
    <td>Ԫ������</td>
  </tr>

</table><hr color=#97D2FF>
<div class=editblock >
	<table width="80%" border="0" align="center" cellpadding="0" cellspacing="0">
		<tr height="35"> 
		  <th align="right" width="25%">Ԫ�����ƣ�</th>
		  <td width="75%"><html:text property="element.name" name="ComponentElementForm"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">���ͣ�</th>
		  <td><html:text property="element.elementType" name="ComponentElementForm"/></td>
		</tr>
		<tr height="35"> 
		  <th align="right">���ʣ�</th>
		  <td><html:select name="ComponentElementForm" property="element.media" size="1" >			
					<html:option value="����">����</html:option>
					<html:option value="ֽ��">ֽ��</html:option>
					<html:option value="����">����</html:option>							
		      </html:select></td>
		</tr>
		<tr height="35"> 
		  <th align="right">�ṩ�ߣ�</th>
		  <td><html:text property="element.provider" name="ComponentElementForm" value='<%=(String)request.getSession().getAttribute("UserRealName") %>'></html:text></td>
		</tr>
		<tr height="35"> 
		  <th align="right">�ṩ���ڣ�</th>
		  <td><html:text property="dateOfInformation" name="ComponentElementForm"  onfocus="calendar(this,null,null,null)" size="11"/></td>
		</tr>
		<logic:empty property="isUpdate" name="ComponentElementForm" >
			<tr height="35"> 
			  <th align="right">�ļ���</th>
			  <td><html:file property="elementFile" name="ComponentElementForm"></html:file></td>
			</tr>
		</logic:empty>
		<tr height="35"> 
		  <th align="right">Ԫ��������</th>
		  <td>
		  	<html:textarea property="element.description" name="ComponentElementForm" cols="30"></html:textarea>
		  </td>
		</tr>						
	</table>
  <div id=bc align=right>
  	<input onclick='saveElement()' type="button" value=' �� �� ' class='input_button'>
  </div><br>

</div>
  </html:form>
</body>
</html>
