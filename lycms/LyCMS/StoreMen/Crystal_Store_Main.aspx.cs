using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class StoreMen_Crystal_Store_Main : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void StoreButton1_Click(object sender, EventArgs e)
    {
        Response.Redirect("CrystalReport_Store_1.aspx");
    }

    protected void StoreButton2_Click(object sender, EventArgs e)
    {
        Response.Redirect("CrystalReport_Store_2.aspx");
    }
    protected void StoreButton3_Click(object sender, EventArgs e)
    {
        Response.Redirect("CrystalReport_Store_3.aspx");
    }
    protected void StoreButton4_Click(object sender, EventArgs e)
    {
        Response.Redirect("CrystalReport_Store_4.aspx");
    }
}
