
    function GetArea()
    {
        var s = xxl.bardt().value; 
        var bstr="";    
        var obj = document.getElementById('sAreastr');
        var popobj=document.getElementById("sArea");
        
        bstr += "总记录数" + s.Rows.length+"<br>";
        if (s != null && typeof(s) == "object")
        {
            for (var i=0;i< s.Rows.length;i++)
            {
                bstr+= s.Rows[i].dqbs+"&nbsp;&nbsp;&nbsp;"+s.Rows[i].dqmc+"<input type='checkbox' id='chkArea' name='chkArea' value='"+s.Rows[i].dqbs+"<]"+s.Rows[i].dqmc+"'><br>";
            }
        }
        alert(bstr);
        obj.innerHTML =bstr;
    }