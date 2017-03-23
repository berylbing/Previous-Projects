using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.Linq;
public partial class Login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btnLogin_Click(object sender, EventArgs e)
    {
        DataClassesDataContext db = new DataClassesDataContext();
        try
        {

            Staff st = db.Staff.Single(p => p.login_account == txtName.Text);

            if (st.password == txtPassword.Text)
            {

                string up, un;
                int uid;
                up = st.staff_type.ToString();
                un = st.staff_name;
                uid = st.staff_id;
                Session["UserPower"] = up;
                Session["StaffId"] = uid;
                Session["UserName"] = un;
                switch (st.staff_type)
                {
                    case "sellmen":
                        Response.Redirect("SellMen/SellList.aspx");
                        break;
                    case "storemen":
                        Response.Redirect("StoreMen/ProductStoreList.aspx");
                        break;
                    case "manager":
                        Response.Redirect("Manager/OrderDetail.aspx");
                        break;
                    case "executant":
                        Response.Redirect("Executant/OrderManager.aspx");
                        break;
                }

            }
            else
            {
                txtName.Text = "";
                txtPassword.Text = "";

                lblIdentifyWarning.Text = "密码错误！ 重新输入";

            }
        }

        catch
        {

            if (txtName.Text == "")
                lblIdentifyWarning.Text = "用户名不能为空！";
            else
            {
                lblIdentifyWarning.Text = "没有该用户！";
                txtName.Text = "";
            }
        }
    }
}