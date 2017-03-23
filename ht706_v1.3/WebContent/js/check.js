function checkBoxAll(str) {
	var a = document.getElementsByName(str);
	var n = a.length;
	for (var i=0; i<n; i++)
		a[i].checked = window.event.srcElement.checked;
}

function checkItem(str) {
	var e = window.event.srcElement;
	var all = eval("document.all." + str);
	if (e.checked) {
		var a = document.getElementsByName(e.name);
		all.checked = true;
		for (var i=0; i<a.length; i++) {
			if (!a[i].checked) { 
				all.checked = false; 
				break;
			}
		}
	} else 
		all.checked = false;
}

function open_window(url,iw,ih) { 
	var iWidth = iw;
	var iHeight = ih;
	var iTop = (window.screen.height-iHeight)/2;
	var iLeft = (window.screen.width-iWidth)/2;
	window.open(url,"Detail","Scrollbars=yes,Toolbar=no,Location=no,Direction=no,Resizable=no,Width="+iWidth+",Height="+iHeight+",top="+iTop+",left="+iLeft) 
}

function open_window_n(url,iw,ih) { 
	var iWidth = iw;
	var iHeight = ih;
	var iTop = (window.screen.height-iHeight)/2;
	var iLeft = (window.screen.width-iWidth)/2;
	window.open(url,"Detail","Scrollbars=no,Toolbar=no,Location=no,Direction=no,Resizable=no,Width="+iWidth+",Height="+iHeight+",top="+iTop+",left="+iLeft) 
}
function isIdCardNo(num) {
	num = num.toUpperCase();
	//���֤����Ϊ15λ����18λ��15λʱȫΪ���֣�18λǰ17λΪ���֣����һλ��У��λ������Ϊ���ֻ��ַ�X��   
	if (!(/(^\d{15}$)|(^\d{17}([0-9]|X)$)/.test(num))) {
		alert('��������֤�ų��Ȳ��ԣ����ߺ��벻���Ϲ涨��\n15λ����ӦȫΪ���֣�18λ����ĩλ����Ϊ���ֻ�X��');
		return false;
	}
	//У��λ����ISO 7064:1983.MOD 11-2�Ĺ涨���ɣ�X������Ϊ������10�� 
	//����ֱ�����������ں�У��λ 
	var len, re;
	len = num.length;
	if (len == 15) {
		re = new RegExp(/^(\d{6})(\d{2})(\d{2})(\d{2})(\d{3})$/);
		var arrSplit = num.match(re);

		//������������Ƿ���ȷ 
		var dtmBirth = new Date('19' + arrSplit[2] + '/' + arrSplit[3] + '/'
				+ arrSplit[4]);
		var bGoodDay;
		bGoodDay = (dtmBirth.getYear() == Number(arrSplit[2]))
				&& ((dtmBirth.getMonth() + 1) == Number(arrSplit[3]))
				&& (dtmBirth.getDate() == Number(arrSplit[4]));
		if (!bGoodDay) {
			alert('��������֤����������ڲ��ԣ�');
			return false;
		} else {
			//��15λ���֤ת��18λ 
			//У��λ����ISO 7064:1983.MOD 11-2�Ĺ涨���ɣ�X������Ϊ������10�� 
			var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5,
					8, 4, 2);
			var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4',
					'3', '2');
			var nTemp = 0, i;
			num = num.substr(0, 6) + '19' + num.substr(6, num.length - 6);
			for (i = 0; i < 17; i++) {
				nTemp += num.substr(i, 1) * arrInt[i];
			}
			num += arrCh[nTemp % 11];
			return num;
		}
	}
	if (len == 18) {
		re = new RegExp(/^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$/);
		var arrSplit = num.match(re);

		//������������Ƿ���ȷ 
		var dtmBirth = new Date(arrSplit[2] + "/" + arrSplit[3] + "/"
				+ arrSplit[4]);
		var bGoodDay;
		bGoodDay = (dtmBirth.getFullYear() == Number(arrSplit[2]))
				&& ((dtmBirth.getMonth() + 1) == Number(arrSplit[3]))
				&& (dtmBirth.getDate() == Number(arrSplit[4]));
		if (!bGoodDay) {
			alert(dtmBirth.getYear());
			alert(arrSplit[2]);
			alert('��������֤����������ڲ��ԣ�');
			return false;
		} else {
			//����18λ���֤��У�����Ƿ���ȷ�� 
			//У��λ����ISO 7064:1983.MOD 11-2�Ĺ涨���ɣ�X������Ϊ������10�� 
			var valnum;
			var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5,
					8, 4, 2);
			var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4',
					'3', '2');
			var nTemp = 0, i;
			for (i = 0; i < 17; i++) {
				nTemp += num.substr(i, 1) * arrInt[i];
			}
			valnum = arrCh[nTemp % 11];
			if (valnum != num.substr(17, 1)) {
				alert('18λ���֤��У���벻��ȷ��Ӧ��Ϊ��' + valnum);
				return false;
			}
			return num;
		}
	}
	return false;
}   

function open_ModelWindow(url,iw,ih,param) { 
	var iWidth = iw;
	var iHeight = ih;
	var iTop = (window.screen.height-iHeight)/2;
	var iLeft = (window.screen.width-iWidth)/2;
	var returnVal = window.showModalDialog(url,param,"help:no;scroll:no;resizable:no;status:0;dialogWidth:"+iWidth+"px;dialogHeight:"+iHeight+"px;center:yes"); 

	if (returnVal == "true")   
	{   
		window.location.href = window.location.href;   
		window.location.reload;   
	}   
}
