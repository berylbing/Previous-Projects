using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;

public partial class Executant_InsertStaff : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        DataClassesDataContext db = new DataClassesDataContext();
        Staff fm = new Staff();
        fm.staff_name = TextRealName.Text;
        fm.login_account = TextUserName.Text;
        fm.password = TextPassWord.Text;
        if (DropDownList1.Text == "销售人员")
            fm.staff_type = "sellmen";
        else if (DropDownList1.Text == "订单执行人员")
            fm.staff_type = "executant";
        else if (DropDownList1.Text == "部门经理")
            fm.staff_type = "manager";
        else if (DropDownList1.Text == "仓库管理人员")
            fm.staff_type = "storemen";
        fm.arrive_date  = Convert.ToDateTime(TextDateIn.Text);   
        db.Staff.InsertOnSubmit(fm);
        Message me = new Message();             //初始化消息表
        me.staff_id = fm.staff_id;
        if (fm.staff_type == "sellmen")
        {
            me.mes_back_num = 0;
            me.mes_sure_num = 0;
            me.mes_export_num = 0;
        }
        else if (fm.staff_type == "executant")
            me.mes_wait_num=0;
        else if (fm.staff_type == "storemen")
            me.mes_sure_num=0;
        db.Message.InsertOnSubmit(me);
        db.SubmitChanges();
        //Response.Redirect("FamilyManage.aspx");
    }
}
