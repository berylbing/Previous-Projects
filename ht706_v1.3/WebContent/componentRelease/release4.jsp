<%@ page contentType="text/html; charset=gbk" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-nested" prefix="nested" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">

<HTML><HEAD><TITLE>构件详细信息</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<link href="../css/common.css" rel="stylesheet" type="text/css">
<script src="../js/check.js" type="text/javascript"></script>
<script src="../js/dtree_search/dtree.js" type="text/javascript"></script>
<link href="../js/dtree_search/dtree.css" rel="stylesheet" type="text/css">
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
</STYLE>

<SCRIPT type=text/javascript>
	var textPadding = 3; // Padding at the left of tab text - bigger value gives you wider tabs
	var strictDocType = true; 
	
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
	
	function deltr(tabi) {
		var trs;
		var ve;
  			
		if(tabi==0){
		   trs = document.getElementsByName("boxi");
		   ve = ta1.all.tags("tr");		   
		}   
		if(tabi==1){
		   trs = document.getElementsByName("boxj");	
		   ve = ta2.all.tags("tr");		   
		}   	   
		   
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
			   
		
		for (var i=0; i<trs.length; i++) {
			if (trs[i].checked) {
				ve[i+1].removeNode(true);
				i--;
			}
		}
	}
	
	function w_open(v){
		hid.value = v;
		
		//V=2:新建构件关系;V=1:修改构件元素信息;V=0:新建构件元素
		if (v == 2) {
		        open_window('menuFrameC0_1.htm',900,600);
		        return;
		}		
		
		if (v == 1) {
			if (document.getElementById("sourceId") != null)
				document.getElementById("sourceId").id = "";
			event.srcElement.parentElement.parentElement.parentElement.id = "sourceId";
		}
		open_window('editX.htm',400,400);
	}			
	</SCRIPT>
</HEAD>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class=mainbody>

<table width="100%" border="0" cellspacing="0" cellpadding="0" class=title>	
	<tr>
		<td align="left">构件详细信息</td>
	</tr>
</table>

     <div class=list>
	  <table width="90%">
	    <tr> 
	      <th colspan="4" height="26">统计数据</th>	      		      			      	      
	    </tr><tr> 
	      <td align="left"><b>检索次数</b></td>
	      <td align="left">80</td>
	      <td align="left"><b>复用次数</b></td>	
	      <td align="left">2</td>		      	      	      		      		      		      
	    </tr><tr> 
	      <td align="left"><b>问题报告次数</b></td>
	      <td align="left">3</td>
	      <td align="left"><b>构件分级</b></td>
	      <td align="left">五级</td>	      		      		      
	    </tr>
	  </table>
     </div>
  
<hr color=#97D2FF>
  
<input type="hidden" name="hid">

<DIV id=macrolong_tabView>
<!--构件基本信息分页-->
	<DIV class=macrolong_aTab>
		<div class=editblock >		
		<table width="90%" border="0" align="center">
		  <tr> 
		    <td colspan="2" rowspan="3"><div align="center"> 
		       <B> 构件基本信息</B> 
		      </div></td>
		    <td width="10%" align="center">构件名称</td>
		    <td width="20%"><nested:write property="asset.name" name="ComponentForm"/></td>
		  </tr>
		  <tr> 
		    <td align="center">安全分类</td>
		    <td><nested:write property="asset.securityClassification" name="ComponentForm"/></td>
		  </tr>
		  <tr> 
		    <td align="center">最后修改日期</td>
		    <td><nested:write property="asset.dateOfInformation" name="ComponentForm"/></td>
		  </tr>
		  <tr> 
		    <td width="10%" align="center">目标环境</td>
		    <td colspan="3"><nested:write property="asset.targetEnvironment" name="ComponentForm"/></td>
		  </tr>		  
		  <tr>  
		    <td align="center">关键词</td>
		    <td align="left"><nested:write property="asset.keyword" name="ComponentForm"/></td>
		    <td align="center">领域</td>    
		    <td align="left"><nested:write property="asset.domain" name="ComponentForm"/></td>
		  </tr> 		  
		  <tr> 
		    <td align="center">版本</td>
		    <td align="left"><nested:write property="asset.version" name="ComponentForm"/></td>
		    <td align="center">版本形成日期</td>
		    <td><nested:write property="asset.versionDate" name="ComponentForm"/></td>
		  </tr>  		  
		  <tr> 
		    <td align="center">代理发布号</td>
		    <td align="left"><nested:write property="asset.agencyPublicationNumber" name="ComponentForm"/></td>
		    <td align="center">接受日期</td>
		    <td><nested:write property="asset.acceptanceDate" name="ComponentForm"/></td>
		  </tr> 		  
		  <tr> 
		    <td align="center">语言</td>
		    <td align="left"><nested:write property="asset.language" name="ComponentForm"/></td>		    
		    <td align="center">所在库</td>
		    <td>
				<nested:write property="asset.library" name="ComponentForm"/>
		    </td>
		  </tr>
		  <tr>
		    <td align="center">获取成本(元)</td>
		    <td align="left"><nested:write property="asset.cost" name="ComponentForm"/></td>
		    <td align="center">构件大小(KB)</td>
		    <td><nested:write property="asset.transferSize" name="ComponentForm"/></td>
		  </tr>
		  <tr> 
		    <td align="center">状态</td>
		    <td align="left"><nested:write property="asset.approvedState" name="ComponentForm"/></td>
		    <td align="center">担保</td>
		    <td>&nbsp;</td>
		  </tr>
		  <tr>
		    <td align="center">参考</td>
		    <td colspan="3"><nested:write property="asset.reference" name="ComponentForm"/></td>
		  </tr>
		  <tr>
		    <td align="center">外部可检索度</td>
		    <td align="left"><nested:write property="asset.retrievableExtent" name="ComponentForm"/></td>  		     
		    <td align="center">与标准符合性</td>
		    <td><nested:write property="asset.complianceToStandards" name="ComponentForm"/></td>   
		  </tr>
		  <tr>
		    <td align="center">使用限制说明</td>
		    <td colspan="3"><nested:write property="asset.restriction" name="ComponentForm"/></td>
		  </tr>  
		  <tr>
		    <td align="center">发布声明</td>
		    <td colspan="3"><nested:write property="asset.distributionStatement" name="ComponentForm"/></td>
		  </tr>    
		  <tr> 
		    <td colspan="4"><div align="center"><strong>构件摘要</strong></div></td>
		  </tr>
		  <tr>
		    <td height="100" colspan="4" align="left">
 				<nested:write property="asset.abstract_" name="ComponentForm"/>
		    </td>
		  </tr>
		  <tr> 
		    <td colspan="4"><div align="center"><strong>应用历史</strong></div></td>
		  </tr>
		  <tr>
		    <td height="100" colspan="4" align="left">
				<nested:write property="asset.history" name="ComponentForm" />
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
		      <th width="20%" height="26">元素名称</th>
		      <th width="10%">类型</th>
		      <th width="10%">介质</th>	
		      <th width="10%">提供者</th>
		      <th width="10%">提供日期</th>
		      	      		      			      	      
		    </tr>
		    <!--  <tr> 
		      <td>构件需求文档</td>
		      <td>需求</td>
		      <td>文档</td>
		      <td>张三</td>
		      <td>2010-01-01</td>		      		      		      		      
		      <td><img onclick="w_open(1)" src="images/icon/icon_dianping.gif" width="16" height="16" border="0"></td>
		      </tr>-->
		    <logic:iterate id="list" name="ComponentForm" property="elements" indexId="index"> 
			    <tr> 
			      <td><bean:write name="list" property="name"/></td>
			      <td><bean:write name="list" property="elementType"/></td>
			      <td><bean:write name="list" property="media"/></td>
			      <td><bean:write name="list" property="provider"/></td>
			      <td><bean:write name="list" property="dateOfInformation"/></td>		      		      		      		      
			     
			   	</tr>
		    </logic:iterate>
		  </table>
		</div> 

	</DIV>
<!--构件分类模式分页-->	
	<DIV class=macrolong_aTab>
	        <div align="center"><B>请选择刻面分类</B></div>
		<style>
			dl { margin:0; margin-bottom:0 }
		</style>
	
		<table width="100%" border="0" cellspacing="0" cellpadding="0" >
		  <tr>
		   	<td id="item" align="left">
			    <p><a href="javascript: d.openAll();">open all</a> | <a href="javascript: d.closeAll();">close all</a></p>  
			    <script type="text/javascript">  
			    	d=new dTree('d');
			    	
			    	<logic:iterate id="list" name="ComponentForm" property="facetList">
					d.add('${list.id.facetUuid}', // id
					'${list.parentNode}',//pid
					<logic:notEqual value="-1" name="list" property="parentNode">
						'<input type="checkbox" name="selected" value="${list.id.facetUuid}" id="${list.id.facetUuid}" disabled="disabled">${list.name}</checkbox>',//node name
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
			  		setTimeout(function(){
			  		<logic:notEmpty name="ComponentForm" property="selected">
						<logic:iterate id="list2" name="ComponentForm" property="selected" indexId="i">
						//alert("${i}");
		 					document.getElementById("${list2}").checked=true;
						</logic:iterate>
					</logic:notEmpty>
			  		},1000);

			    </script>
			</td>
		  </tr>


		</table>
	</DIV>  
<!--构件关系分页-->	
	<DIV class=macrolong_aTab>
	        <div align="center"><B>请定义构件间的关系</B></div>
		<div class=list>
		  <table width="90%" id=ta2>
		    <tr> 
		      <th width="20%" height="26">构件名称</th>
		      <th width="20%">相关构件编号</th>			      
		      <th width="10%">关系类型</th>	      		      			      	      
		    </tr>		    
		    <logic:iterate id="lista" name="ComponentForm" property="related_Assets">
			    <tr> 
			  
			      <td width="20%">${lista.sourceAsset}</td><!-- 构件名称暂时存在这里  -->
			      <td width="20%">${lista.targetAsset}</td>			      
			      <td width="10%"><bean:write name="lista" property="relationType"/></td>	      		      			      	      
			    </tr>
		    </logic:iterate>
		  </table>
		</div> 	        
	</DIV>

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
				    <td align='right'>SR(Saving due to avoided cost):</td><td align='left'><bean:write property="costeffect.sr" name="ComponentForm"/></td>
				    <td align='left'>
					    <bean:write name="ComponentForm" property="costeffect.unit" />			
					</td>
				</tr>
				<tr>
				    <td align='right'>L(Service Life):</td><td align='left'><bean:write property="costeffect.l" name="ComponentForm"/></td><td align='left'><bean:write property="costeffect.LRisk" name="ComponentForm"/></td>
				</tr>
				<tr>
				    <td align='right'>N(Demand):</td><td align='left'><bean:write property="costeffect.n" name="ComponentForm"/>&nbsp;&nbsp;&nbsp;</td><td align='left'><bean:write property="costeffect.NRisk" name="ComponentForm"/></td>
				</tr>				
				<tr>
				    <td align='right'>CR(Cost to Reuse):</td><td align='left'><bean:write property="costeffect.cr" name="ComponentForm"/></td><td align='left'><bean:write property="costeffect.crRisk" name="ComponentForm"/></td>
				</tr>
				<tr>
				    <td align='right'>TA(Accession Time):</td><td align='left'><bean:write property="costeffect.ta" name="ComponentForm"/></td><td align='left'>&nbsp;</td>
				</tr>
				<tr>
				    <td align='right'>CA(Accession Cost):</td><td align='left'><bean:write property="costeffect.ca" name="ComponentForm"/></td><td align='left'><bean:write property="costeffect.caRisk" name="ComponentForm"/></td>
				</tr>
				<tr>
				    <td align='right'>CM(Maintenance Cost):</td><td align='left'><bean:write property="costeffect.cm" name="ComponentForm"/>&nbsp;&nbsp;&nbsp;</td><td align='left'><bean:write property="costeffect.cmRisk" name="ComponentForm"/></td>
				</tr>					
				<tr>
				    <td align='right'>I(Discount Rate):</td><td align='left'><bean:write property="costeffect.i" name="ComponentForm"/></td><td align='left'>&nbsp;</td>
				</tr>
				<tr>
				    <td align='right'>说明:</td><td colspan='2' align='left'><bean:write property="costeffect.description" name="ComponentForm"/></td>
				</tr>	
				<tr>
				    <td colspan='3' align='right'></td>
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
				    <td align="left"><bean:write property="recommendation.functionality" name="ComponentForm" /></td>				    
				</tr>
			        <tr height="20">
				  <th align="center">可用性描述</th>			  	  
				</tr>			
				<tr>
				    <td align="left"><bean:write property="recommendation.usablity" name="ComponentForm" /></td>				    
				</tr>
			        <tr height="20">
				  <th align="center">原因说明</th>			  	  
				</tr>			
				<tr>
				    <td align="left"><bean:write property="recommendation.reason" name="ComponentForm" /></td>				    
				</tr>																			
			</table>
		</div> 		       
	</DIV>	
</DIV>
<!--下面是引用代码-->
<SCRIPT type=text/javascript>

  initTabs(Array('基本信息','组成元素','分类模式','构件关系','成本效益','推荐者需求'),0,'100%',300);
  function gotoForum(){
 // alert(window.opener.parent.frames[0].location);
  window.opener.parent.frames[0].location="../forum/index.do?method=viewIndex";
  window.close();
 // window.opener.parent.frames[0].href="../forum/index.do?method=viewIndex";
  	//open_window("../forum/index.do?method=viewIndex",1600,900);
  }
</SCRIPT>

<div>
	<input type="button" value="查看评价反馈信息" disabled="disabled">		
	<input type="button" value="查看相关问题报告" disabled="disabled">			
	<input type="button" value="进入论坛" onclick="gotoForum()">		
</div>

</BODY>
</HTML>
