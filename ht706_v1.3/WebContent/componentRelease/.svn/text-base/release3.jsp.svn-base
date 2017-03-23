<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">

<HTML><HEAD><TITLE>DHTML Tab script</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script src="../js/calendar.js" type="text/javascript"></script>
<link href="../js/dtree_search/dtree.css" rel="stylesheet" type="text/css">
<script src="../js/dtree_search/dtree.js" type="text/javascript"></script>
<STYLE type=text/css>
	BODY {
		MARGIN: 10px
	}
	.ad {
		MARGIN-TOP: 30px; PADDING-TOP: 10px
	}
	.macrolong_tabPane {
		BORDER-BOTTOM: #919b9c 1px solid; HEIGHT: 21px
	}
	.macrolong_aTab {
		BORDER-RIGHT: #919b9c 1px solid; PADDING-RIGHT: 5px; PADDING-LEFT: 5px; PADDING-BOTTOM: 5px; BORDER-LEFT: #919b9c 1px solid; PADDING-TOP: 5px; BORDER-BOTTOM: #919b9c 1px solid; FONT-FAMILY: Trebuchet MS, Lucida Sans Unicode, Arial, sans-serif
	}
	.macrolong_tabPane DIV {
		BACKGROUND-POSITION: left bottom; PADDING-LEFT: 3px; FLOAT: left; MARGIN-LEFT: 0px; VERTICAL-ALIGN: middle; CURSOR: pointer; BOTTOM: -1px; MARGIN-RIGHT: 0px; BACKGROUND-REPEAT: no-repeat; POSITION: relative; HEIGHT: 100%
	}
	.macrolong_tabPane .tabActive {
		Z-INDEX: 10; BACKGROUND-IMAGE: url(images/tab_left_active.gif); MARGIN-LEFT: 0px; MARGIN-RIGHT: 0px
	}
	.macrolong_tabPane .tabInactive {
		Z-INDEX: 1; BACKGROUND-IMAGE: url(images/tab_left_inactive.gif); MARGIN-LEFT: 0px; MARGIN-RIGHT: 0px
	}
	.macrolong_tabPane .inactiveTabOver {
		BACKGROUND-IMAGE: url(images/tab_left_over.gif); MARGIN-LEFT: 0px; MARGIN-RIGHT: 0px
	}
	.macrolong_tabPane SPAN {
		PADDING-RIGHT: 3px; PADDING-LEFT: 3px; FONT-SIZE: 11px; FLOAT: left; VERTICAL-ALIGN: top; LINE-HEIGHT: 21px; FONT-FAMILY: arial
	}
	.macrolong_tabPane .tabActive SPAN {
		PADDING-BOTTOM: 1px; LINE-HEIGHT: 20px
	}
	.macrolong_tabPane IMG {
		FLOAT: left
	}
	
	input{
		font-size: 12px;
		color: #000000;
		background-color: #F1F4F5;
		border: 1px solid #49789C;
		padding:2px 0px 0px 5px;
	}	
</STYLE>

<SCRIPT type=text/javascript>
	var textPadding = 3; // Padding at the left of tab text - bigger value gives you wider tabs
	var strictDocType = true; 
	var xmlhttp;
	var tabObj;
	var activeTabIndex = -1;
	var MSIE = navigator.userAgent.indexOf('MSIE')>=0?true:false;
	var navigatorVersion = navigator.appVersion.replace(/.*?MSIE (\d\.\d).*/g,'$1')/1;
	
		
	function setPadding(obj,padding){
		var span = obj.getElementsByTagName('SPAN')[0];
		span.style.paddingLeft = padding + 'px';	
		span.style.paddingRight = padding + 'px';	
	}
	function showTab(tabIndex)
	{
		
		if(activeTabIndex>=0){
			if(activeTabIndex==tabIndex)return;
			var obj = document.getElementById('tabTab'+activeTabIndex);
			obj.className='tabInactive';
			var img = obj.getElementsByTagName('IMG')[0];
			img.src = '../images/tab_right_inactive.gif';
			document.getElementById('tabView' + activeTabIndex).style.display='none';
		}
		
		var thisObj = document.getElementById('tabTab'+tabIndex);		
		thisObj.className='tabActive';
		var img = thisObj.getElementsByTagName('IMG')[0];
		img.src = '../images/tab_right_active.gif';
		document.getElementById('tabView' + tabIndex).style.display='block';
		activeTabIndex = tabIndex;
		

		var parentObj = thisObj.parentNode;
		var aTab = parentObj.getElementsByTagName('DIV')[0];
		countObjects = 0;
		var startPos = 2;
		var previousObjectActive = false;
		while(aTab){
			if(aTab.tagName=='DIV'){
				if(previousObjectActive){
					previousObjectActive = false;
					startPos-=2;
				}
				if(aTab==thisObj){
					startPos-=2;
					previousObjectActive=true;
					setPadding(aTab,textPadding+1);
				}else{
					setPadding(aTab,textPadding);
				}
				
				aTab.style.left = startPos + 'px';
				countObjects++;
				startPos+=2;
			}			
			aTab = aTab.nextSibling;
		}
		
		return;
	}
	
	function tabClick()
	{
		showTab(this.id.replace(/[^\d]/g,''));
		
	}
	
	function rolloverTab()
	{
		if(this.className.indexOf('tabInactive')>=0){
			this.className='inactiveTabOver';
			var img = this.getElementsByTagName('IMG')[0];
			img.src = '../images/tab_right_over.gif';
		}
		
	}
	function rolloutTab()
	{
		if(this.className ==  'inactiveTabOver'){
			this.className='tabInactive';
			var img = this.getElementsByTagName('IMG')[0];
			img.src = '../images/tab_right_inactive.gif';
		}
		
	}
	
	function initTabs(tabTitles,activeTab,width,height)
	{
		tabObj = document.getElementById('macrolong_tabView');
		width = width + '';
		if(width.indexOf('%')<0)width= width + 'px';
		tabObj.style.width = width;
		
		height = height + '';
		if(height.length>0){
			if(height.indexOf('%')<0)height= height + 'px';
			tabObj.style.height = height;
		}
		
		var tabDiv = document.createElement('DIV');
		
		var firstDiv = tabObj.getElementsByTagName('DIV')[0];
		
		tabObj.insertBefore(tabDiv,firstDiv);
		tabDiv.className = 'macrolong_tabPane';
		for(var no=0;no<tabTitles.length;no++){
			var aTab = document.createElement('DIV');
			aTab.id = 'tabTab' + no;
			aTab.onmouseover = rolloverTab;
			aTab.onmouseout = rolloutTab;
			aTab.onclick = tabClick;
			aTab.className='tabInactive';
			tabDiv.appendChild(aTab);
			var span = document.createElement('SPAN');
			span.innerHTML = tabTitles[no];
			aTab.appendChild(span);
			
			var img = document.createElement('IMG');
			img.valign = 'bottom';
			img.src = '../images/tab_right_inactive.gif';
			// IE5.X FIX
			if((navigatorVersion && navigatorVersion<6) || (MSIE && !strictDocType)){
				img.style.styleFloat = 'none';
				img.style.position = 'relative';	
				img.style.top = '4px'
				span.style.paddingTop = '4px';
				aTab.style.cursor = 'hand';
			}	// End IE5.x FIX
			aTab.appendChild(img);
		}

		var tabs = tabObj.getElementsByTagName('DIV');
		var divCounter = 0;
		for(var no=0;no<tabs.length;no++){
			if(tabs[no].className=='macrolong_aTab'){
				if(height.length>0)tabs[no].style.height = height;
				tabs[no].style.display='none';
				tabs[no].id = 'tabView' + divCounter;
				divCounter++;
			}			
		}		
		showTab(activeTab);
	}
	
	function nones() {
		var v = document.getElementById("item").style.display;
		if (v == "")
			document.getElementById("item").style.display = "none";
		else
			document.getElementById("item").style.display = "";
	}
	
	function expand() {

	        var e = window.event.srcElement;
	        
	        if(e.src.indexOf("NodeImg1.GIF")>0)
	            e.src = "../images/NodeImg2.GIF";
	        else
	            e.src = "../images/NodeImg1.GIF";

	        while(e.tagName!='DL') 
                    e=e.parentNode;
               
	        var v = e.getElementsByTagName("div")[0];
        
		if (v.style.display == "") 
		    v.style.display = "none";		
		else
		    v.style.display = "";
	}
	
	function expand1() {
	        var e = window.event.srcElement;
	        
	        if(e.src.indexOf("NodeImg1.GIF")>0)
	            e.src = "../images/NodeImg2.GIF";
	        else
	            e.src = "../images/NodeImg1.GIF";
               
	        var v = document.getElementById("glossary");
        
		if (v.style.display == "") 
		    v.style.display = "none";		
		else
		    v.style.display = "";
	}
	
	function deltr() {
		var trs;
		var ve;
  			
		   trs = document.getElementsByName("elementUniqueId");
		   ve = ta1.all.tags("tr");		     	   
		   
		var flag = 0;
		for (var i=0; i<trs.length; i++) {
			if (trs[i].checked) {
				flag = 1;
				break;
			}
		}
		if (flag==0) {
			alert("请选择您要删除的项目！");
			return false;
		}
		path=location.pathname;
		for(var index=1;index<path.length;index++)
		{
			if(path.charAt(index)=='/') break;
		}
		tmp=path.substring(0,index);
		url=tmp+"/componentRelease/CreatComponentElement.do?method=deleteElementAction&index=";	
		//url="/HT706/componentRelease/CreatComponentElement.do?method=deleteElementAction&index="
		for (var i=0; i<trs.length; i++) {
			if (trs[i].checked) {
				url=url+i+',';
			}
		}

		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		xmlhttp.onreadystatechange=processor;
		xmlhttp.open("post",url);
		xmlhttp.send(null);
		
	}
	function processor(){
		if(xmlhttp.readyState==4)
			if(xmlhttp.status==200){
					
			   trs = document.getElementsByName("elementUniqueId");
			   ve = ta1.all.tags("tr");	
			   for (var i=0; i<trs.length; i++) {
					if (trs[i].checked) {
					ve[i+1].removeNode(true);
					i--;
					}
				}	   
			}
	}
	
	
	function w_open(){
		//location.href = "editX_new.jsp";
		//open_window('editX_new.jsp',400,400);
		open_window('editX_new.jsp',400,400);
		//alert("sdfsdaf");
		
	}
	
	function editElement(v){
		path=location.pathname;
		for(var index=1;index<path.length;index++)
		{
			if(path.charAt(index)=='/') break;
		}
		tmp=path.substring(0,index);
		//document.write(tmp+"/componentRelease/CreatComponentElement.do?method=EditComponentElementAction&elementIndex="+v);
		//asset=document.getElementById("asset.uniqueId").value;
		//open_window("/HT706/CreatComponentElement.do?method=EditComponentElementAction&elementIndex="+v,400,400);
		open_window(tmp+"/componentRelease/CreatComponentElement.do?method=EditComponentElementAction&elementIndex="+v, 400,400);
	}
	function gotoPage(){
                location.href = "myComponent.htm";
	}
	
	function costEffect1(){
	        showModalDialog("costEffect1.htm", "UUID","dialogHeight:400px; dialogWidth:400px; help:no");
	}

	function costEffect2(){
	        showModalDialog("costEffect2.htm", "UUID","dialogHeight:400px; dialogWidth:400px; help:no");
	}
	
	function costEffect3(){
	        showModalDialog("costEffect3.htm", "UUID","dialogHeight:400px; dialogWidth:400px; help:no");
	}		
	function Relation_open(){
		open_window('menuFrameC0_1.htm',900,600);
	}				
	</SCRIPT>
</HEAD>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>
<html:form action="/componentRelease/CreatComponent.do" method="post">

<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>	
	<tr>
		<td align="left">发布构件</td>
	</tr>
</table>

<input type="hidden" name="hid">

<DIV id=macrolong_tabView>
<!--构件基本信息分页-->
	<DIV class=macrolong_aTab>
		<div class=editblock >		
		<table width="90%" border="0" align="center" >
		  <tr> 
		    <td colspan="2" rowspan="3"><div align="center"> 
		       <B> 构件基本信息</B> 
		      </div></td>
		    <td width="10%" align="left">构件名称</td>
		    <td width="20%" align="left"><html:text property="asset.name" name="ComponentForm"/></td>
		  </tr>
		  <tr> 
		    <td align="left">安全分类</td>
		    <td align="left">
		    	<html:select name="ComponentForm" property="asset.securityClassification" size="1" >			
					<html:option value="内部" >内部</html:option>
					<html:option value="公开">公开</html:option>
					<html:option value="秘密">秘密</html:option>	
					<html:option value="机密">机密</html:option>
					<html:option value="绝密">绝密</html:option>											
		        </html:select>
		    </td>
		  </tr>
		  <tr> 
		    <td align="left">最后修改日期</td>
		    <td align="left"><html:text property="dateOfInformation" name="ComponentForm"  onfocus="calendar(this,null,null,null)" size="11"/></td>
		  </tr>
		  <tr> 
		    <td width="10%" align="left">目标环境</td>
		    <td colspan="3" align="left"><html:text property="asset.targetEnvironment" name="ComponentForm"/></td>
		  </tr>		  
		  <tr>  
		    <td align="left">关键词</td>
		    <td align="left"><html:text property="asset.keyword" name="ComponentForm"/></td>
		    <td align="left">领域</td>    
		    <td align="left">
		    	<html:select name="ComponentForm" property="asset.domain" size="1" >			
					<html:option value="通用">通用</html:option>
					<html:option value="导弹">导弹</html:option>
					<html:option value="雷达">雷达</html:option>	
										
		        </html:select>
		    </td>
		  </tr> 		  
		  <tr> 
		    <td align="left">版本</td>
		    <td align="left"><html:text property="asset.version" name="ComponentForm"/></td>
		    <td align="left">版本形成日期</td>
		    <td align="left"><html:text property="versionDate" name="ComponentForm" onfocus="calendar(this,null,null,null)" size="11"/></td>
		  </tr>  		  
		  <tr> 
		    <td align="left">代理发布号</td>
		    <td align="left"><html:text property="asset.agencyPublicationNumber" name="ComponentForm"/></td>
		    <td align="left">接受日期</td>
		    <td align="left"><html:text property="acceptanceDate" name="ComponentForm" onfocus="calendar(this,null,null,null)" size="11"/></td>
		  </tr> 		  
		  <tr> 
		    <td align="left">语言</td>
		    <td align="left">
		    	<html:select name="ComponentForm" property="asset.language" size="1" >			
					<html:option value="C语言">C语言</html:option>
					<html:option value="JAVA语言">JAVA语言</html:option>
					<html:option value="C#">C#</html:option>	
					<html:option value="PB">PB</html:option>
					<html:option value="其它">其它</html:option>											
		        </html:select>
		    </td>
			<td align="left">所在库</td>
		    <td align="left">
		    	<input type="text"  disabled="true" value="本项自动填入"/>
			    </td>
		  </tr>
		  <tr>
		    <td align="left">获取成本(元)</td>
		    <td align="left"><html:text property="asset.cost" name="ComponentForm"/></td>
		    <td align="left">构件大小(KB)</td>
		    <td align="left"><html:text property="asset.transferSize" name="ComponentForm"/></td>
		  </tr>
		  <tr> 
		  	<td align="left">状态</td>
		    <td align="left">草稿</td>
		    <td align="left">担保</td>
		    <td align="left"><html:text property="asset.warranties" name="ComponentForm"/></td>
		  </tr>
		  <tr>
		    <td align="left">参考</td>
		    <td colspan="3" align="left"><html:text property="asset.reference" name="ComponentForm"/></td>
		  </tr>
		  <tr>
		    <td align="left">外部可检索度</td>
		    <td align="left">
		    	<html:select name="ComponentForm" property="asset.retrievableExtent" size="1" >			
					<html:option value="1">公开</html:option>
					<html:option value="2">付费</html:option>
					<html:option value="3">私有</html:option>	
				</html:select>   
		    </td> 
		    <td align="left">与标准符合性</td>
		    <td align="left"><html:text property="asset.complianceToStandards" name="ComponentForm"/></td>   
		  </tr>
		  <tr>
		    <td align="left">使用限制说明</td>
		    <td colspan="3" align="left"><html:text property="asset.restriction" name="ComponentForm"/></td>
		  </tr>  
		  <tr>
		    <td align="left">发布声明</td>
		    <td colspan="3" align="left"><html:text property="asset.distributionStatement" name="ComponentForm"/></td>
		  </tr>    
		  <tr> 
		    <td colspan="4"><div align="center"><strong>构件摘要</strong></div></td>
		  </tr>
		  <tr>
		    <td colspan="4" align="left">
		      <html:textarea property="asset.abstract_" name="ComponentForm" cols="120"/>
		    </td>
		  </tr>
		  <tr> 
		    <td colspan="4"><div align="center"><strong>应用历史</strong></div></td>
		  </tr>
		  <tr>
		    <td colspan="4" align="left">
		      <html:textarea property="asset.history" name="ComponentForm" cols="120"/>
		    </td>
		  </tr>
		  <tr> 
		    <td colspan="4"><div align="center"><strong>构件认证</strong></div></td>
		  </tr>
		  <tr>
		    <td colspan="4" align="left">
		      <html:textarea property="asset.certification" name="ComponentForm" cols="120"/>
		    </td>
		  </tr>		  
		</table>
		</div>	    	
	</DIV>  
<!--构件元素分页-->	
	<DIV class=macrolong_aTab>
	        <div align="center"><B>请定义构件的元素</B></div>		
		<div class=list>
		  <table id=ta1>
		    <tr> 
		      <th width="5%" height="26"><input type="checkbox" name="boxa" value="checkbox" onclick="checkBoxAll('elementUniqueId')"></th>
		      <th width="20%">元素名称</th>
		      <th width="10%">类型</th>
		      <th width="10%">介质</th>	
		      <th width="10%">提供者</th>
		      <th width="10%">提供日期</th>
		      <th width="10%">操作</th>		      		      			      	      
		    </tr>
		    <logic:iterate id="list" name="ComponentForm" property="elements" indexId="index"> 
			    <tr> 
			      <td><html:checkbox name="list" property="elementUniqueId" value='${index}' > ${list.elementUniqueId}</html:checkbox></td>
			      <td><bean:write name="list" property="name"/></td>
			      <td><bean:write name="list" property="elementType"/></td>
			      <td><bean:write name="list" property="media"/></td>
			      <td><bean:write name="list" property="provider"/></td>
			      <td><bean:write name="list" property="dateOfInformation"/></td>		      		      		      		      
			      <td><img onclick="editElement('${index}')" src="../images/icon/icon_dianping.gif" width="16" height="16" border="0"></td>
			   	</tr>
		    </logic:iterate>
		  </table>
		</div> 
		  <table width="100%" border="0" cellspacing="0" cellpadding="0" class=page>
		    <tr>
		      <td align="right">
			  <input name="button2" type="button" class="input_button" onClick="w_open()" value=" 新 建 ">
		          <input name="button2" type="button" class="input_button" onClick="deltr()" value=" 删 除 "> 
		      </td>
		    </tr>
		  </table>
	
	</DIV>
<!--构件分类模式分页-->	
	<DIV class=macrolong_aTab>
	        <div align="center"><B>请选择刻面分类</B></div>
		<style>
			dl { margin:0; margin-bottom:0 }
		</style>
	
		<table width="100%" border="0" cellspacing="0" cellpadding="0" >
		  <tr>
		    <td align="left" style="cursor: hand;color: #2979ce"><img onclick="nones()" src="../images/ifile.GIF">
		    <a href="checkItem.htm" target="mainFrame">导弹武器系统刻构件分类</a></td>
		  </tr>
		  <tr>
		  	<td id="item" align="left">
			    <p><a href="javascript: d.openAll();">open all</a> | <a href="javascript: d.closeAll();">close all</a></p>  
			    <script type="text/javascript">  
			    	d=new dTree('d');
			    	
			    	<logic:iterate id="list" name="ComponentForm" property="facetList">
					d.add('${list.id.facetUuid}', // id
					'${list.parentNode}',//pid
					<logic:notEqual value="-1" name="list" property="parentNode">
						'<input type="checkbox" name="selected" value="${list.id.facetUuid}" id="${list.id.facetUuid}" >${list.name}</checkbox>',//node name
					</logic:notEqual>
					<logic:equal value="-1" name="list" property="parentNode">
						"刻面树",//node name
					</logic:equal>
					'',//url
					'${list.name}',//title
					'mainFrame', //Target for the node.
					'',//'/HT706/images/NodeImg1.gif',
					'',//'/HT706/images/NodeImg2.gif',
					true
					);
					</logic:iterate>
			    	
			  		document.write(d);
			    </script>
			</td>
		  </tr>

		</table>
	</DIV>  
<!--构件关系分页-->	
	<DIV class=macrolong_aTab>
	        <div align="center"><B>请定义构件间的关系</B></div>
		<div class=list>
		  <table width="90%" id="ta2">
		    <tr> 
		      <th width="5%" height="26"><input type="checkbox" name="boxb" value="checkbox" onclick="checkBoxAll('relatedAsset1')"></th>
		      <th width="20%">构件名称</th>
		      <th width="20%">相关构件编号</th>			      
		      <th width="10%">关系类型</th>	      		      			      	      
		    </tr>
		  </table>
		</div> 
		  <table width="90%" border="0" cellspacing="0" cellpadding="0" class=page>
		    <tr>
		      <td align="right">
			  <input name="button2" type="button" class="input_button" onClick="Relation_open()" value=" 新 建 ">
		          <input name="button2" type="button" class="input_button" onClick="relation_deltr(0)" value=" 删 除 "> 
		      </td>
		    </tr>
		  </table>	        
	</DIV>
	
<!--质量评价分页-->	
	

<!--成本效益分析-->	
	<DIV class=macrolong_aTab>		
	        <div align="center"><B>成本效益分析</B></div>
		<div class=list>		        
			<table border="0">
			        <tr height="20">
				  <th align="center" width="10%">评价因子</th>
				  <th align="left" width="10%">评价值</th>
				  <th align="left" width="10%">风险校正后的取值</th>				  	  
				</tr>			
				<tr>
				    <td align='right'>SR(Saving due to avoided cost):</td>
				    <td align='left'><html:text property="costeffect.sr" name="ComponentForm"/></td>
				    <td align='left'>
				    	<html:select name="ComponentForm" property="costeffect.unit" size="1" >			
							<html:option value="人民币">人民币</html:option>
							<html:option value="美元">美元</html:option>
							<html:option value="日元">日元</html:option>	
							<html:option value="欧元">欧元</html:option>	
							<html:option value="英镑">英镑</html:option>							
		      			</html:select>
		      		</td>
				</tr>
				<tr>
				    <td align='right'>L(Service Life):</td><td align='left'><html:text property="costeffect.l" name="ComponentForm"/></td><td align='left'><html:text property="costeffect.LRisk" name="ComponentForm"/></td>
				</tr>
				<tr>
				    <td align='right'>N(Demand):</td><td align='left'><html:text property="costeffect.n" name="ComponentForm"/>&nbsp;&nbsp;&nbsp;<input type="button" value="分布设置" onclick="costEffect1()"></td><td align='left'><html:text property="costeffect.NRisk" name="ComponentForm"/></td>
				</tr>				
				<tr>
				    <td align='right'>CR(Cost to Reuse):</td><td align='left'><html:text property="costeffect.cr" name="ComponentForm"/></td><td align='left'><html:text property="costeffect.crRisk" name="ComponentForm"/></td>
				</tr>
				<tr>
				    <td align='right'>TA(Accession Time):</td><td align='left'><html:text property="costeffect.ta" name="ComponentForm"/></td><td align='left'>&nbsp;</td>
				</tr>
				<tr>
				    <td align='right'>CA(Accession Cost):</td><td align='left'><html:text property="costeffect.ca" name="ComponentForm"/></td><td align='left'><html:text property="costeffect.caRisk" name="ComponentForm"/></td>
				</tr>
				<tr>
				    <td align='right'>CM(Maintenance Cost):</td><td align='left'><html:text property="costeffect.cm" name="ComponentForm"/>&nbsp;&nbsp;&nbsp;<input type="button" value="分布设置" onclick="costEffect2()"></td><td align='left'><html:text property="costeffect.cmRisk" name="ComponentForm"/></td>
				</tr>					
				<tr>
				    <td align='right'>I(Discount Rate):</td><td align='left'><html:text property="costeffect.i" name="ComponentForm"/></td><td align='left'>&nbsp;</td>
				</tr>
				<tr>
				    <td align='right'>说明:</td><td colspan='2' align='left'><html:text property="costeffect.description" name="ComponentForm"/></td>
				</tr>	
				<tr>
				    <td colspan='3' align='right'><input type="button" value="测算" onclick="costEffect3()">&nbsp;&nbsp;&nbsp;</td>
				</tr>																
			</table>
		</div> 		      
	</DIV>
<!--其它-->	
	<DIV class=macrolong_aTab>		
	<div align="center"><B>推荐者需求</B></div> <br>
		<div class=list>		        
			<table border="0">
			        <tr height="20">
				  <th align="center">功能描述</th>			  	  
				</tr>			
				<tr>
				    <td align="left"><html:textarea property="recommendation.functionality" name="ComponentForm" rows="5" cols="120"/></td>				    
				</tr>
			        <tr height="20">
				  <th align="center">可用性描述</th>			  	  
				</tr>			
				<tr>
				    <td align="left"><html:textarea property="recommendation.usablity" name="ComponentForm" rows="5" cols="120"/></td>				    
				</tr>
			        <tr height="20">
				  <th align="center">原因说明</th>			  	  
				</tr>			
				<tr>
				    <td align="left"><html:textarea property="recommendation.reason" name="ComponentForm" rows="5" cols="120"/></td>				    
				</tr>																			
			</table>
		</div> 		       
	</DIV>	
</DIV>
<!--下面是引用代码-->
<SCRIPT type=text/javascript>
initTabs(Array('基本信息','组成元素','分类模式','构件关系','成本效益','其它'),0,'100%',300);

</SCRIPT>

  <br>
  <div id=bc align=center>
  	<input onclick="submitToServer('?method=saveComponentAction')" type=button value=' 保 存 ' class='input_button'>
  	
  </div>
</html:form>
</BODY>
<script type="text/javascript">
	function submitToServer(v) {

		if(checkData()){	
			saveData();
			document.getElementById("ComponentForm").action+=v;
			document.getElementById("ComponentForm").submit();
		}
	}
	function saveData(){
		checked=document.getElementsByName("relatedAsset");
		for(var i=0;i<checked.length;i++){
			//alert(checked[i].value);
			select=document.getElementsByName("relation");
			checked[i].value+=(","+select[i].options[select[i].selectedIndex].value);
			//alert(checked[i].value);
		}
	}
	function relation_deltr(n){
		var checked=document.getElementsByName("relatedAsset1");
		for(i=n;i<checked.length;i++){
			if(checked[i].checked){
				tb=document.getElementById('ta2').deleteRow(i+1);
				relation_deltr(i);
			}
		}
	}
	function checkData(){
		if(document.getElementById("asset.name").value==""){alert("请输入'构件名称'");return false;}
		if(document.getElementById("dateOfInformation").value==""){alert("请输入'最后修改日期'");return false;}
		if(document.getElementById("asset.targetEnvironment").value==""){alert("请输入'目标环境'");return false;}
		if(document.getElementById("asset.keyword").value==""){alert("请输入'关键词'");return false;}
		if(document.getElementById("asset.version").value==""){alert("请输入'版本'");return false;}
		if(document.getElementById("versionDate").value==""){alert("请输入'版本形成日期'");return false;}
		if(document.getElementById("acceptanceDate").value==""){alert("请输入'接受日期'");return false;}
		if(document.getElementById("asset.transferSize").value==""){alert("请输入'构件大小(KB)'");return false;}
		if(document.getElementById("asset.warranties").value==""){alert("请输入'担保'");return false;}
		if(document.getElementById("asset.reference").value==""){alert("请输入'参考'");return false;}
		if(document.getElementById("asset.complianceToStandards").value==""){alert("请输入'与标准符合性'");return false;}
		if(document.getElementById("asset.abstract_").value==""){alert("请输入'构件摘要'");return false;}
		return true;
	}
	
</script>

		   <span style="display:none;" id="hidden_Relation">        						
					<logic:iterate id="list" name="ComponentForm" property="relationTypes">
						<option value='${list.relationName}'>${list.relationName}</option>	
					</logic:iterate>
		  </span>
</HTML>

