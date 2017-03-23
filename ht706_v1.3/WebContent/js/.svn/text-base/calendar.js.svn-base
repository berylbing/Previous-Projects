document.write("<div id=meizzCalendarLayer style='position: absolute; z-index: 9999; width: 180; height: 172; display: none'>");
document.write("<iframe name=meizzCalendarIframe scrolling=no frameborder=0 width=180 height=100%></iframe></div>");

function writeIframe(){	//HTML
    var strIframe = "<html><head><meta http-equiv='Content-Type' content='text/html; charset=gbk'><style>"+
    "*{ font-size: 12px; font-family: }"+
    ".bg{ color: "+ WebCalendar.lightColor +"; cursor: default; background-color: "+ WebCalendar.darkColor +";}"+
    "table#tableWeek td{ color: "+ WebCalendar.lightColor +";}"+
    "td#meizzYearHead, td#meizzYearMonth{color: "+ WebCalendar.wordColor +";background-color:"+ WebCalendar.dayBgColor +"}"+
	"td#Hours, td#Minutes, td#Seconds{color: "+ WebCalendar.wordColor +";background-color:"+ WebCalendar.wordDark +"}"+
    ".out{ text-align: center; border-top: 1px solid "+ WebCalendar.DarkBorder +"; border-left: 1px solid "+ WebCalendar.DarkBorder +";"+
    "		border-right: 1px solid "+ WebCalendar.lightColor +"; border-bottom: 1px solid "+ WebCalendar.lightColor +";}"+
    ".over{ text-align: center; border-top: 1px solid #FFFFFF; border-left: 1px solid #FFFFFF;"+
    "		border-bottom: 1px solid "+ WebCalendar.DarkBorder +"; border-right: 1px solid "+ WebCalendar.DarkBorder +"}"+
    "input{ border: 1px solid "+ WebCalendar.darkColor +"; padding-top: 1px; height: 18; cursor: hand;"+
    "       color:"+ WebCalendar.wordColor +"; background-color: "+ WebCalendar.btnBgColor +"}"+
    "</style></head><body onselectstart='return false' style='margin: 0px' oncontextmenu='return false'><form name=meizz>";

    strIframe += "<script language=javascript>"+
    "function document.onkeydown(){"+	//
	"	switch(window.event.keyCode){"+
	"		case 27 : parent.hiddenCalendar(); break;"+	//[ESC]
	"		case 37 : parent.prevM(); break;"+	//[]
	"		case 38 : parent.prevY(); break;"+	//[]
	"		case 39 : parent.nextM(); break;"+	//[]
	"		case 40 : parent.nextY(); break;"+	//[]
	"		case 78 : parent.returnNowTime(); break;"+	//[N]
	"		case 84 : parent.returnDate(new Date().getDate()+'/'+(new Date().getMonth() +1)+'/'+new Date().getFullYear()); break;"+	//[T]
	"	}"+
	"	window.event.keyCode = 0; window.event.returnValue= false;"+
	"}";

	if (WebCalendar.drag){ 
		strIframe += "var drag=false, cx=0, cy=0, o = parent.WebCalendar.calendar;"+
		"function document.onmousemove(){"+
		"	if(parent.WebCalendar.drag && drag){"+
		"		if(o.style.left==')o.style.left=0; if(o.style.top==')o.style.top=0;"+
		"		o.style.left = parseInt(o.style.left) + window.event.clientX-cx;o.style.top = parseInt(o.style.top) + window.event.clientY-cy;"+
		"}}"+
		"function dragStart(){cx=window.event.clientX; cy=window.event.clientY; drag=true;}";
	}

	strIframe += "</script>";

    strIframe += "<select name=tmpYearSelect onblur='parent.hiddenSelect(this)' style='z-index:1;position:absolute;top:1;left:35;display:none;"+
	"width:65px' onclick='parent.WebCalendar.thisYear =this.value; parent.hiddenSelect(this); parent.writeCalendar();' size=13></select>"+
    "<select name=tmpMonthSelect onblur='parent.hiddenSelect(this)' style='z-index:1; position:absolute;top:1;left:100;display:none; width:45px'"+
    " onclick='parent.WebCalendar.thisMonth=this.value; parent.hiddenSelect(this); parent.writeCalendar();' size=12></select>"+
	"<select name=tmpHourSelect onblur='parent.hiddenSelect(this)' style='z-index:1; position:absolute;top:18;left:50;display:none; width:37px'"+
    " onclick='parent.WebCalendar.nowHour=this.value; parent.hiddenSelect(this); parent.writeCalendar();' size=12></select>"+
	"<select name=tmpMinuteSelect onblur='parent.hiddenSelect(this)' style='z-index:1; position:absolute;top:18;left:90;display:none; width:37px'"+
    " onclick='parent.WebCalendar.nowMinute=this.value; parent.hiddenSelect(this); parent.writeCalendar();' size=12></select>"+
	"<select name=tmpSecondSelect onblur='parent.hiddenSelect(this)' style='z-index:1; position:absolute;top:18;left:130;display:none; width:37px'"+
    " onclick='parent.WebCalendar.nowSecond=this.value; parent.hiddenSelect(this); parent.writeCalendar();' size=12></select>"+

    "<table id=showTimeHeight width=142 height=166 class=bg border=0 cellspacing=1 cellpadding=0>"+
    "	<tr><td width=178 height=19 bgcolor='"+ WebCalendar.lightColor +"'>"+
    "    <table width=178 id=tableHead border=0 cellspacing=0 cellpadding=0><tr align=center>"+
    "    <td width=19 height=19 class=bg title='1()' style='cursor: hand' onclick='parent.prevY()'><b><<</b></td>"+
    "    <td width=15 height=19 class=bg title='1()' style='cursor: hand' onclick='parent.prevM()'><b><</b></td>"+
    "    <td width=65 id=meizzYearHead title='' onclick='parent.funYearSelect(parseInt(this.innerText, 10))'"+
    "        onmouseover='this.style.background=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    "        onmouseout='this.style.background=parent.WebCalendar.dayBgColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
    "    <td width=45 id=meizzYearMonth title='·' onclick='parent.funMonthSelect(parseInt(this.innerText, 10))'"+
    "        onmouseover='this.style.background=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    "        onmouseout='this.style.background=parent.WebCalendar.dayBgColor; this.style.color=parent.WebCalendar.wordColor'></td>"+
    "    <td width=15 class=bg title='1()' onclick='parent.nextM()' style='cursor: hand'><b>></b></td>"+
    "    <td width=19 class=bg title='1()' onclick='parent.nextY()' style='cursor: hand'><b>>></b></td></tr></table>"+
    "</td></tr><tr><td height=18><table id=tableWeek border=1 align=center width=178 cellpadding=0 cellspacing=0 ";
    
	if(WebCalendar.drag){
		strIframe += "onmousedown='dragStart()' onmouseup='drag=false' onmouseout='drag=false'";
	}
    
	strIframe += " borderColorLight='"+ WebCalendar.darkColor +"' borderColorDark='"+ WebCalendar.lightColor +"'>"+
    "    <tr align=center height=18><td width=22></td><td></td><td></td><td></td><td></td><td></td><td></td></tr></table>"+
    "</td></tr><tr><td valign=top width=178 bgcolor='"+ WebCalendar.lightColor +"'>"+
    "    <table height=106 width=178 border=0 cellspacing=0 cellpadding=0>";

	for(var x=0; x<5; x++){ 
		strIframe += "<tr>";
		for(var y=0; y<7; y++)  
			strIframe += "<td class=out id='meizzDay"+ (x*7+y) +"'></td>"; 
		strIframe += "</tr>";
	}
	strIframe += "<tr>";
	for(var x=35; x<42; x++) 
		strIframe += "<td class=out id='meizzDay"+ x +"'></td>";
	
	strIframe +="</tr></table></td></tr><tr id=showTime style='display:none'><td height=20 width=178 bgcolor='"+ WebCalendar.wordDark +"'>"+
	"<table border=0 cellpadding=0 cellspacing=0 align=center><tr height=20>"+
    "<td align=center width=38 style='padding-top:5px' title='(N)' style='cursor: hand' onclick='parent.returnNowTime()'>"+
	"<font color='"+ WebCalendar.todayColor +"'></font></td>"+
    "<td align=center width=35 id=Hours title='' onclick='parent.funHourSelect(parseInt(this.innerText, 10))'"+
	"        onmouseover='this.style.background=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    "        onmouseout='this.style.background=parent.WebCalendar.wordDark; this.style.color=parent.WebCalendar.wordColor'>11</td>"+
    "<td align=center width=2>:</td>"+
    "<td align=center width=35 id=Minutes title='' onclick='parent.funMinuteSelect(parseInt(this.innerText, 10))'"+
	"        onmouseover='this.style.background=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    "        onmouseout='this.style.background=parent.WebCalendar.wordDark; this.style.color=parent.WebCalendar.wordColor'>11</td>"+
    "<td align=center width=2>:</td>"+
    "<td align=center width=36 id=Seconds title='' onclick='parent.funSecondSelect(parseInt(this.innerText, 10))'"+
	"        onmouseover='this.style.background=parent.WebCalendar.darkColor; this.style.color=parent.WebCalendar.lightColor'"+
    "        onmouseout='this.style.background=parent.WebCalendar.wordDark; this.style.color=parent.WebCalendar.wordColor'>11</td>"+
	"</tr></table></td></tr>"+

	"<tr><td height=22 width=178 bgcolor='"+ WebCalendar.wordDark +"'>"+
	"<table border=0 cellpadding=0 cellspacing=0 width=178><tr height=22>"+
    "<td align=center vlign=middle title='(T)' style='cursor: hand' "+
	"onclick=\"parent.returnDate(new Date().getDate()+'/'+(new Date().getMonth() +1)+'/'+new Date().getFullYear())\">"+
	"<font color='"+ WebCalendar.todayColor +"'></font><font color='"+ WebCalendar.wordColor +"'>"+
	new Date().getFullYear() + "-" + appendZero(new Date().getMonth() +1) + "-" + appendZero(new Date().getDate())+"</font></td>"+
	"<td align=center valign=middle title='i' style='cursor: hand' onclick='parent.clearDate()'>"+
	"<font color='"+ WebCalendar.todayColor +"'></font></td>"+
	"<td align=center valign=middle title='([ESC])' style='cursor: hand' onclick='parent.hiddenCalendar()'></td>"+
	"</tr></table></td></tr>"+
	

	"<table></form></body></html>";
   
	with(WebCalendar.iframe){
        document.writeln(strIframe);
		document.close();
        for(var i=0; i<42; i++){
            WebCalendar.dayObj[i] = eval("meizzDay"+ i);
            WebCalendar.dayObj[i].onmouseover = dayMouseOver;
            WebCalendar.dayObj[i].onmouseout = dayMouseOut;
            WebCalendar.dayObj[i].onclick = returnDate;
        }
		if(WebCalendar.timeShow){
			getObjectById("meizzCalendarLayer").style.height = "193";
			eval("showTimeHeight").height = "186";
			eval("showTime").style.display = "";
		}
		else{
			getObjectById("meizzCalendarLayer").style.height = "172";
		}
    }
}

function TWebCalendar(){ //’
    this.daysMonth  = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);	//"y
    this.day        = new Array(42);            //~o
    this.dayObj     = new Array(42);            //
    this.dateStyle  = null;                     //'
    this.objExport  = null;                     //
    this.eventSrc   = null;                     //^J
    this.inputDate  = null;                     //(d/m/yyyy)
    this.thisYear   = new Date().getFullYear(); //iij’
    this.thisMonth  = new Date().getMonth()+ 1; //uiij’
    this.thisDay    = new Date().getDate();     //iij’
	this.nowHour	= new Date().getHours();	//iij’
	this.nowMinute	= new Date().getMinutes();	//iij’
	this.nowSecond	= new Date().getSeconds();	//iij’
    this.today      = this.thisDay +"/"+ this.thisMonth +"/"+ this.thisYear;   //(d/m/yyyy)
    this.iframe     = window.frames("meizzCalendarIframe"); // iframe 
    this.calendar   = getObjectById("meizzCalendarLayer");  //IJ
    this.dateReg    = "";           //''
    this.yearFallB  = 60;           //
    this.yearFallA  = 20;           //
    this.format     = "yyyy-mm-dd"; //'
    this.timeShow   = false;        //
    this.showType   = 'DAY';        //'(YEAR)(MONTH)lb(DAY)I(TIME)
    this.drag       = false;         //
    this.darkColor  = "#4B83BB";    //I
    this.lightColor = "#F7FBFF";    //
    this.btnBgColor = "#FFFFF5";    //It
    this.wordColor  = "#000080";    //
    this.wordDark   = "#DEEAF6";    //I
    this.dayBgColor = "#ffffff";    //
    this.todayColor = "#CC3300";    //εi
    this.DarkBorder = "#F7FBFF";    //
}

var WebCalendar = new TWebCalendar();
var outObject1,outObject2,outObject3,outObject4; //openDate()K,"tú"

function openDate(obj,type){ //
	outObject1 = obj;
	outObject2 = null;
	outObject3 = null;
	outObject4 = null;
	//^3’
	if(type=="YEAR" || type=="MONTH" || type=="DAY"){
		WebCalendar.showType = type;
		WebCalendar.timeShow = false;
	}
	if(type=="TIME"){
		WebCalendar.showType = type;
		WebCalendar.timeShow = true;
		WebCalendar.nowHour	= new Date().getHours();
		WebCalendar.nowMinute = new Date().getMinutes();
		WebCalendar.nowSecond = new Date().getSeconds();
	}
	if(type == null){
		WebCalendar.showType = "DAY";
		WebCalendar.timeShow = false;
	}
	WebCalendar.thisYear   = new Date().getFullYear();
    WebCalendar.thisMonth  = new Date().getMonth()+ 1;
    WebCalendar.thisDay    = new Date().getDate();
	//^3’'y
	calendar(obj);
}

function openDateWithinTwoColumn(obj1,obj2,type){ //
	outObject1 = obj1;
	outObject2 = obj2;
	outObject3 = null;
	outObject4 = null;
	//^3’
	if(type=="MONTH"){
		WebCalendar.showType = type;
		WebCalendar.timeShow = false;
	}
	else{
		alert("^oMONTH");
		return;
	}

	WebCalendar.thisYear   = new Date().getFullYear();
    WebCalendar.thisMonth  = new Date().getMonth()+ 1;
    WebCalendar.thisDay    = new Date().getDate();
	//^3’'y
	calendar(obj1,obj2)
}

function openDateWithinThreeColumn(obj1,obj2,obj3,type){ //
	outObject1 = obj1;
	outObject2 = obj2;
	outObject3 = obj3;
	outObject4 = null;
	//^3’
	if(type=="DAY"){
		WebCalendar.showType = type;
		WebCalendar.timeShow = false;
	}
	else{
		alert("^oDAY");
		return;
	}

	WebCalendar.thisYear   = new Date().getFullYear();
    WebCalendar.thisMonth  = new Date().getMonth()+ 1;
    WebCalendar.thisDay    = new Date().getDate();
	//^3’'y
	calendar(obj1,obj2,obj3)
}

function openDateWithinFourColumn(obj1,obj2,obj3,obj4,type){ //
	outObject1 = obj1;
	outObject2 = obj2;
	outObject3 = obj3;
	outObject4 = obj4;
	//^3’
	if(type=="TIME"){
		WebCalendar.showType = type;
		WebCalendar.timeShow = true;
		WebCalendar.nowHour	= new Date().getHours();
		WebCalendar.nowMinute = new Date().getMinutes();
		WebCalendar.nowSecond = new Date().getSeconds();
	}
	else{
		alert("^oTIME");
		return;
	}

	WebCalendar.thisYear   = new Date().getFullYear();
    WebCalendar.thisMonth  = new Date().getMonth()+ 1;
    WebCalendar.thisDay    = new Date().getDate();
	//^3’'y
	calendar(obj1,obj2,obj3,obj4)
}
function calendar(obj1,obj2,obj3,obj4){ //
    var e = window.event.srcElement;  
	writeIframe();
    var o = WebCalendar.calendar.style; 
	WebCalendar.eventSrc = e;
	
	if (arguments.length == 0) WebCalendar.objExport = e;
    else WebCalendar.objExport = eval(arguments[0]);

	outObject1 = WebCalendar.objExport;

    WebCalendar.iframe.tableWeek.style.cursor = WebCalendar.drag ? "move" : "default";
	var t = e.offsetTop,  h = e.clientHeight, l = e.offsetLeft, p = e.type;
	
	while (e = e.offsetParent){
		t += e.offsetTop; 
		l += e.offsetLeft;
	}

    o.display = ""; WebCalendar.iframe.document.body.focus();
    var cw = WebCalendar.calendar.clientWidth, ch = WebCalendar.calendar.clientHeight;
    var dw = document.body.clientWidth, dl = document.body.scrollLeft, dt = document.body.scrollTop;
    
    if (document.body.clientHeight + dt - t - h >= ch) o.top = (p=="image")? t + h : t + h + 6;
    else o.top  = (t - dt < ch) ? ((p=="image")? t + h : t + h + 6) : t - ch;
    if (dw + dl - l >= cw) o.left = l; 
	else o.left = (dw >= cw) ? dw - cw + dl : dl;

    if  (!WebCalendar.timeShow) WebCalendar.dateReg = /^(\d{1,4})(-|\/|.)(\d{1,2})\2(\d{1,2})$/;
    else WebCalendar.dateReg = /^(\d{1,4})(-|\/|.)(\d{1,2})\2(\d{1,2}) (\d{1,2}):(\d{1,2}):(\d{1,2})$/;

    try{
		var objValue = WebCalendar.objExport.value
		if(obj2 && obj2.value != ""){
			objValue += "-" + obj2.value;
		}
		if(obj3 && obj3.value != ""){
			objValue += "-" + obj3.value;
		}
		if(obj4 && obj4.value != ""){
			objValue += " " + obj4.value;
		}

		if (objValue.trim() != ""){
			if(objValue.trim().length == 4){
				objValue = objValuee.trim() + "-01-01"
			}
			if(objValue.trim().length == 7){
				objValue = objValue.trim() + "-01"
			}

            WebCalendar.dateStyle = objValue.match(WebCalendar.dateReg);

			if (WebCalendar.dateStyle == null){
                WebCalendar.thisYear   = new Date().getFullYear();
                WebCalendar.thisMonth  = new Date().getMonth()+ 1;
                WebCalendar.thisDay    = new Date().getDate();
                //alert("iд\nг");
                writeCalendar(); 
				//return false;
            }
            else{
                WebCalendar.thisYear   = parseInt(WebCalendar.dateStyle[1], 10);
                WebCalendar.thisMonth  = parseInt(WebCalendar.dateStyle[3], 10);
                WebCalendar.thisDay    = parseInt(WebCalendar.dateStyle[4], 10);
				if(WebCalendar.dateStyle.length > 5){
					WebCalendar.nowHour	= parseInt(WebCalendar.dateStyle[5], 10);
					WebCalendar.nowMinute = parseInt(WebCalendar.dateStyle[6], 10);
					WebCalendar.nowSecond = parseInt(WebCalendar.dateStyle[7], 10);
				}

                WebCalendar.inputDate  = parseInt(WebCalendar.thisDay, 10) +"/"+ parseInt(WebCalendar.thisMonth, 10) +"/"+ parseInt(WebCalendar.thisYear, 10); 
				writeCalendar();
            }
        }  
		else writeCalendar();
    }  
	catch(e){
		writeCalendar();
	}
}

function funMonthSelect(){ //·
    var m = isNaN(parseInt(WebCalendar.thisMonth, 10)) ? new Date().getMonth() + 1 : parseInt(WebCalendar.thisMonth);
    var e = WebCalendar.iframe.document.forms[0].tmpMonthSelect;
    
	for (var i=1; i<10; i++) e.options.add(new Option("  " + i +"", i));
	for (var i=10; i<13; i++) e.options.add(new Option(" " + i +"", i));

    e.style.display = "";
	e.value = m; 
	e.focus(); 
	window.status = e.style.top;
}

function funYearSelect(){ //
    var n1 = WebCalendar.yearFallB;
	var n2 = WebCalendar.yearFallA;
    var e = WebCalendar.iframe.document.forms[0].tmpYearSelect;
    var y = isNaN(parseInt(WebCalendar.thisYear, 10)) ? new Date().getFullYear() : parseInt(WebCalendar.thisYear);
        y = (y <= 1000)? 1000 : ((y >= 9999)? 9999 : y);
    var min = (y - n1 >= 1000) ? y - n1 : 1000;
    var max = (y + n2 <= 9999) ? y + n2 : 9999;
        min = (max == 9999) ? max-n*2 : min;
        max = (min == 1000) ? min+n*2 : max;
    
	for (var i=min; i<=max; i++){
      e.options[e.options.length] = new Option(i +"", i+"", true, true);
    }

    e.style.display = "";
    e.value = y;
	e.focus();
}

function funHourSelect(){ //С
	var e = WebCalendar.iframe.document.forms[0].tmpHourSelect;
	var h = WebCalendar.iframe.Hours.innerText;
	
	for (var i=0; i<9; i++) e.options.add(new Option("0" + i, i));
	for (var i=10; i<24; i++) e.options.add(new Option(i, i));

    e.style.display = "";
	e.value = h; 
	e.focus(); 
	window.status = e.style.top;
}

function funMinuteSelect(){ //
	var e = WebCalendar.iframe.document.forms[0].tmpMinuteSelect;
	var m = WebCalendar.iframe.Minutes.innerText;

	for (var i=0; i<9; i++) e.options.add(new Option("0" + i, i));
	for (var i=10; i<60; i++) e.options.add(new Option(i, i));

    e.style.display = "";
	e.value = m; 
	e.focus(); 
	window.status = e.style.top;
}

function funSecondSelect(){ //
	var e = WebCalendar.iframe.document.forms[0].tmpSecondSelect;
	var s = WebCalendar.iframe.Seconds.innerText;

	for (var i=0; i<9; i++) e.options.add(new Option("0" + i, i));
	for (var i=10; i<60; i++) e.options.add(new Option(i, i));

    e.style.display = "";
	e.value = s; 
	e.focus(); 
	window.status = e.style.top;
}

function prevM(){  //·
    WebCalendar.iframe.document.forms[0].tmpYearSelect.style.display = "none";
	WebCalendar.iframe.document.forms[0].tmpMonthSelect.style.display = "none";
	WebCalendar.thisDay = 1;
    
	if (WebCalendar.thisMonth==1){
        if(WebCalendar.thisYear > 1000){
			WebCalendar.thisYear--;
		}
		else{
			WebCalendar.thisYear = 9999;
		}
        WebCalendar.thisMonth=13;
    }
	
    WebCalendar.thisMonth--;
	writeCalendar();
}

function nextM(){  //·
    WebCalendar.iframe.document.forms[0].tmpYearSelect.style.display = "none";
	WebCalendar.iframe.document.forms[0].tmpMonthSelect.style.display = "none";
	WebCalendar.thisDay = 1;
    
	if (WebCalendar.thisMonth==12){
        if(WebCalendar.thisYear < 9999){
			WebCalendar.thisYear++;
		}
		else{
			WebCalendar.thisYear = 1000;
		}
        WebCalendar.thisMonth=0;
    }
	
    WebCalendar.thisMonth++;
	writeCalendar();
}

function prevY(){  //
	WebCalendar.iframe.document.forms[0].tmpYearSelect.style.display = "none";
	WebCalendar.iframe.document.forms[0].tmpMonthSelect.style.display = "none";
	WebCalendar.thisDay = 1;
	if(WebCalendar.thisYear > 1000){
		WebCalendar.thisYear--;
	}
	else{
		WebCalendar.thisYear = 9999;
	}
	writeCalendar();
}

function nextY(){ //
	WebCalendar.iframe.document.forms[0].tmpYearSelect.style.display = "none";
	WebCalendar.iframe.document.forms[0].tmpMonthSelect.style.display = "none";
	WebCalendar.thisDay = 1;
	if(WebCalendar.thisYear < 9999){
		WebCalendar.thisYear++;
	}
	else{
		WebCalendar.thisYear = 1000;
	}
	writeCalendar();
}

function returnNowTime(){ //
	var hh = new Date().getHours();
	var mm = new Date().getMinutes();
	var ss = new Date().getSeconds();
	WebCalendar.iframe.Hours.innerText  = appendZero(hh);
	WebCalendar.iframe.Minutes.innerText  = appendZero(mm);
	WebCalendar.iframe.Seconds.innerText  = appendZero(ss);
}

function hiddenSelect(e){ //
	for(var i=e.options.length; i>-1; i--)
		e.options.remove(i); 
	e.style.display="none";
}

function getObjectById(id){ 
	if(document.all)
		return(eval("document.all."+ id));
	return(eval(id)); 
}

function hiddenCalendar(){ //
	getObjectById("meizzCalendarLayer").style.display = "none";
	WebCalendar.inputDate = null;
}

function clearDate(){  //i
    if(outObject1){
		outObject1.value="";
    }
	if(outObject2){
		outObject2.value="";
    }
	if(outObject3){
		outObject3.value="";
    }
	if(outObject4){
		outObject4.value="";
    }
	
	WebCalendar.inputDate = null;
	
    hiddenCalendar();
}

function appendZero(n){ //
	return(("00"+ n).substr(("00"+ n).length-2));
}

function String.prototype.trim(){
	return this.replace(/(^\s*)|(\s*$)/g,"");
}

function dayMouseOver(){
    this.className = "over";
    this.style.backgroundColor = WebCalendar.darkColor;
    
	if(WebCalendar.day[this.id.substr(8)].split("/")[1] == WebCalendar.thisMonth)
		this.style.color = WebCalendar.lightColor;
}

function dayMouseOut(){
    this.className = "out"; 
	var d = WebCalendar.day[this.id.substr(8)], a = d.split("/");
    this.style.removeAttribute('backgroundColor');
    
	if(a[1] == WebCalendar.thisMonth && d != WebCalendar.today){
        if(WebCalendar.dateStyle && a[0] == parseInt(WebCalendar.dateStyle[4], 10))
			this.style.color = WebCalendar.lightColor;
        
		this.style.color = WebCalendar.wordColor;
    }
}

function writeCalendar(){ //^J
    var y = WebCalendar.thisYear;
    var m = WebCalendar.thisMonth; 
    var d = WebCalendar.thisDay;
	var H = WebCalendar.nowHour;
	var M = WebCalendar.nowMinute;
	var S = WebCalendar.nowSecond;
    WebCalendar.daysMonth[1] = (0==y%4 && (y%100!=0 || y%400==0)) ? 29 : 28;

	if (!(y<=9999 && y >= 1000 && parseInt(m, 10)>0 && parseInt(m, 10)<13 && parseInt(d, 10)>0 && parseInt(d, 10)<32)){
        //alert("");
        WebCalendar.thisYear   = new Date().getFullYear();
        WebCalendar.thisMonth  = new Date().getMonth()+ 1;
        WebCalendar.thisDay    = new Date().getDate(); 
	}

	else if (!(parseInt(H, 10)>=0 && parseInt(m, 10)<24 && parseInt(M, 10)>=0 && parseInt(M, 10)<60 && parseInt(S, 10)>=0 && parseInt(S, 10)<60)){
        //alert("");
        WebCalendar.nowHour   = new Date().getHours();
        WebCalendar.nowMinute  = new Date().getMinutes();
        WebCalendar.nowSecond    = new Date().getSeconds(); 
	}

    y = WebCalendar.thisYear;
    m = WebCalendar.thisMonth;
    d = WebCalendar.thisDay;
	H = WebCalendar.nowHour;
	M = WebCalendar.nowMinute;
	S = WebCalendar.nowSecond;

    WebCalendar.iframe.meizzYearHead.innerText  = y +" ";
    WebCalendar.iframe.meizzYearMonth.innerText = parseInt(m, 10) +" ";
	WebCalendar.iframe.Hours.innerText  = appendZero(H);
	WebCalendar.iframe.Minutes.innerText  = appendZero(M);
	WebCalendar.iframe.Seconds.innerText  = appendZero(S);

    WebCalendar.daysMonth[1] = (0==y%4 && (y%100!=0 || y%400==0)) ? 29 : 28; //29
    var w = new Date(y, m-1, 1).getDay();
    var prevDays = m==1  ? WebCalendar.daysMonth[11] : WebCalendar.daysMonth[m-2];
    
	for(var i=(w-1); i>=0; i--){ // for  WebCalendar.day' d/m/yyyy
        WebCalendar.day[i] = prevDays +"/"+ (parseInt(m, 10)-1) +"/"+ y;
        if(m==1) WebCalendar.day[i] = prevDays +"/"+ 12 +"/"+ (parseInt(y, 10)-1);
        prevDays--;
    }
    for(var i=1; i<=WebCalendar.daysMonth[m-1]; i++) 
		WebCalendar.day[i+w-1] = i +"/"+ m +"/"+ y;
    for(var i=1; i<42-w-WebCalendar.daysMonth[m-1]+1; i++){
        WebCalendar.day[WebCalendar.daysMonth[m-1]+w-1+i] = i +"/"+ (parseInt(m, 10)+1) +"/"+ y;
        if(m==12) 
			WebCalendar.day[WebCalendar.daysMonth[m-1]+w-1+i] = i +"/"+ 1 +"/"+ (parseInt(y, 10)+1);
    }

    for(var i=0; i<42; i++){    //д
        var a = WebCalendar.day[i].split("/");
        WebCalendar.dayObj[i].innerText   = a[0];
        WebCalendar.dayObj[i].title       = a[2] +"-"+ appendZero(a[1]) +"-"+ appendZero(a[0]);
        WebCalendar.dayObj[i].bgColor     = WebCalendar.dayBgColor;
        WebCalendar.dayObj[i].style.color = WebCalendar.wordColor;
        
		if ((i<10 && parseInt(WebCalendar.day[i], 10)>20) || (i>27 && parseInt(WebCalendar.day[i], 10)<15))    //÷DZε
            WebCalendar.dayObj[i].style.color = WebCalendar.wordDark;

        if (WebCalendar.inputDate==WebCalendar.day[i]){    //ε
			WebCalendar.dayObj[i].bgColor = WebCalendar.darkColor;
			WebCalendar.dayObj[i].style.color = WebCalendar.lightColor;
		}
        if (WebCalendar.day[i] == WebCalendar.today){      //'y
			WebCalendar.dayObj[i].bgColor = WebCalendar.todayColor;
			WebCalendar.dayObj[i].style.color = WebCalendar.lightColor;
		}
    }
}

function returnDate(){  //'^u
    if(WebCalendar.objExport){
        var returnValue;
        var a = (arguments.length==0) ? WebCalendar.day[this.id.substr(8)].split("/") : arguments[0].split("/");
        var d = WebCalendar.format.match(/^(\w{4})(-|\/|.|)(\w{1,2})\2(\w{1,2})$/);
        
		if(d==null){
			alert("趨'\r\n\r\nP WebCalendar.format ");
			return false;
		}
		
        var flag = d[3].length==2 || d[4].length==2; //ж'
        
		returnY = a[2];
		returnM = flag ? appendZero(a[1]): a[1];
		returnD = flag ? appendZero(a[0]): a[0];
		returnHour = WebCalendar.iframe.Hours.innerText;
		returnMinute = WebCalendar.iframe.Minutes.innerText;
		returnSecond = WebCalendar.iframe.Seconds.innerText;

		if(WebCalendar.showType == "YEAR"){
			returnValue = returnY;
		}
		if(WebCalendar.showType == "MONTH"){
			returnValue = returnY + d[2] + returnM;
		}
		if(WebCalendar.showType == "DAY"){
			returnValue = returnY + d[2] + returnM + d[2] + returnD;
		}		
		if(WebCalendar.showType == "TIME" && WebCalendar.timeShow){
            returnValue = returnY + d[2] + returnM + d[2] + returnD + " " + returnHour + ":" + returnMinute + ":" + returnSecond;
        }
		
		if(outObject1 && !outObject2 && !outObject3){
			outObject1.value = returnValue;
		}
		if(outObject1 && outObject2 && !outObject3){
			outObject1.value = returnY;
			outObject2.value = returnM;
		}
		if(outObject1 && outObject2 && outObject3){
			outObject1.value = returnY;
			outObject2.value = returnM;
			outObject3.value = returnD;
		}
		if(outObject1 && outObject2 && outObject3 && outObject4){
			outObject1.value = returnY;
			outObject2.value = returnM;
			outObject3.value = returnD;
			outObject4.value = returnHour + ":" + returnMinute + ":" + returnSecond;
		}

        hiddenCalendar();
    }
}

function document.onfocusout(){
    if(WebCalendar.eventSrc != window.event.srcElement) 
		hiddenCalendar();
}