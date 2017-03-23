function Size(width,height)
{
	this.Width = width;
	this.Height = height;
}
function GetSizeForMax(s,width,height)
{
	if(width > s.Width && height > s.Height)return s;
	if(height == null)
	{
		height = width
	}
	var size = width > height ? width : height;
	
	var w, h;
	var a;
	//a = s.Width > s.Height ? s.Width : s.Height;
	//a = a / size;
	
	a = s.Width/width < s.Height/height ? s.Width/width : s.Height/height;
	w = s.Width/a;
	h = s.Height/a;
	if(w > width | h > height)
	{
		if(w > width )
		{
			a = width / w;
		}
		else
		{
			a = height / h;
		}
		w = w * a;
		h = h * a;
	}
	s.Width = w;
	s.Height = h;
	return s;
}	
	
function GetSizeForMax1(s,max)
{
	var m = 0
	if(s.Width > s.Height)
	{
		m = s.Width ;
	}
	else
	{
		m = s.Height;
	}
	if(m > max)
	{
		m = m / max;
		s.Height = (s.Height / m);
		s.Width = (s.Width / m);
	}
	return s;
}

	function InputNum(obj)
	{
		if(event.keyCode >= 48 && event.keyCode <=57 ||event.keyCode ==8 || event.keyCode >= 96 && event.keyCode <=105) 
		{
			return true;
		}
		return false;
	}

	function checkKey(key,str,em)
	{
		var o = key;
		if(o.value == "" || o.value == null)
		{
			if(str != null)
				alert(str);
			else
				alert("请输入关键字！");
			return false;
		}
		else if(isNull(o.value))
		{
			if(em != null)
				alert(em);
			else
				alert("关键字不能为空！");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	function isNull(str)
	{
		var len = '';
		for(i = 0; i < str.length; i++) 
		{
			len = len + ' ';
		}
		return (len == str);
	}
		

function Size(width,height)
{
	this.Width = width;
	this.Height = height;
}

///对象的绝对Left
function getLeft(e){
	var t = e.offsetTop;
	var l = e.offsetLeft;
	while(e = e.offsetParent){
		t += e.offsetTop;
		l += e.offsetLeft;
	}
	//alert("top="+t+"/nleft="+l);
	return l
}

///对象的绝对Top
function getTop(e){
	var t = e.offsetTop;
	var l = e.offsetLeft;
	while(e = e.offsetParent)
	{
		t += e.offsetTop;
		l += e.offsetLeft;
	}
	//alert("top="+t+"/nleft="+l);
	return t
}

function goodsImageError(object)
{
	var o = null;
	if(window.event != null)o = window.event;
	if(o != null)
	{
		o.srcElement.style.visibility = "visible";
		o.srcElement.src = "Skin/" + CurrentSkinName + DefaultGoodsPic;;
		o.srcElement.onerror = null;
	}
}

function setBigImageNewSize(object)
{
	if(window.event == null)return;
	var src = window.event.srcElement;
	var maxWidth = src.attributes["MaxWidth"];
	src.style.visibility = "visible";
	if(maxWidth != null)
	{
		maxWidth = parseInt(maxWidth.value);
		//alert(maxWidth);
		var s = new Size(src.width,src.height);
		s = GetSizeForMax(s,maxWidth);
		if(s.Width != 0 && s.Height != 0)
		{
			src.width = s.Width;
			src.height = s.Height;
		}
		//src.width = 100;
		//src.height = 100;
		src.onerror = goodsImageError;
		if(!src.loaded)
		{
			src.loaded = true;
		}
		else
		{
			src.onload = null;
		}
		src.src = src.src;
		//alert(src.width);
	}
}


//会员中心订单导航,显示为当前菜单
function SetCurrentNavi(o)
{
	var arr = Array(document.getElementById("navi0"),document.getElementById("navi1"),document.getElementById("navi2"),document.getElementById("navi3"),document.getElementById("navi4"));
	for(var i = 0;i < arr.length;i++)
	{
		if(arr[i])
		{
			if(o != i)
			{
				arr[i].className = "OrderQuery_Item03";
			}
			else
			{
				arr[i].className = "OrderQuery_Normal";
			}
		}
	}
}

function checkMemberLogin(control,sumbitID)
{
	sumbitID = document.getElementById(sumbitID);
	if(window.event)
	{
		var keyCode = window.event.keyCode;
		if(keyCode == 13)
		{
			sumbitID.click();
			return false;
		}
	}
	return true;
}
//showGoods




 function regInput(obj, reg, inputStr)
 {
  var docSel = document.selection.createRange()
  if (docSel.parentElement().tagName != "INPUT") return false
  oSel = docSel.duplicate()
  oSel.text = ""
  var srcRange = obj.createTextRange()
  oSel.setEndPoint("StartToStart", srcRange)
  var str = oSel.text + inputStr + srcRange.text.substr(oSel.text.length)
  return reg.test(str)
 }
