	
	var textPadding = 3; // Padding at the left of tab text - bigger value gives you wider tabs
	var strictDocType = true; 
	
	var tabObj;
	var activeTabIndex = -1;
	var MSIE = navigator.userAgent.indexOf('MSIE')>=0?true:false;
	var navigatorVersion = navigator.appVersion.replace(/.*?MSIE (\d\.\d).*/g,'$1')/1;
	var path = "./images/labelMenu/";
		
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
			img.src = path + 'BQ_out_right.gif';
			document.getElementById('tabView' + activeTabIndex).style.display='none';
		}
		
		var thisObj = document.getElementById('tabTab'+tabIndex);		
		thisObj.className='tabActive';
		var img = thisObj.getElementsByTagName('IMG')[0];
		img.src = path + 'BQ_on_right.gif';
		//img.src = path + 'BQ_out_right.gif';		
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
			img.src = path + 'BQ_on_right.gif';
			//img.src = path + 'BQ_out_right.gif';
		}
		
	}
	function rolloutTab()
	{
		if(this.className ==  'inactiveTabOver'){
			this.className='tabInactive';
			var img = this.getElementsByTagName('IMG')[0];
			img.src = path + 'BQ_out_right.gif';
		}
		
	}
	
	function initTabs(tabTitles,activeTab,width,height,isDisabled)
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
		firstDiv.style.border="0px";
		tabObj.insertBefore(tabDiv,firstDiv);
		tabDiv.className = 'macrolong_tabPane';
		for(var no=0;no<tabTitles.length;no++){
			var aTab = document.createElement('DIV');
			aTab.id = 'tabTab' + no;
			aTab.onmouseover = rolloverTab;
			aTab.onmouseout = rolloutTab;
			
			if(isNaN(isDisabled)){
				if(isDisabled!="y")
					aTab.onclick = tabClick;
			}else{
					aTab.onclick = tabClick;
			}
			
			aTab.className='tabInactive';
			tabDiv.appendChild(aTab);
			var span = document.createElement('SPAN');
			
			span.innerHTML = "<div style='height:0'>"+tabTitles[no]+"</div>";
			aTab.appendChild(span);
			
			var img = document.createElement('IMG');
			img.valign = 'bottom';
			img.src = path + 'BQ_out_right.gif';
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