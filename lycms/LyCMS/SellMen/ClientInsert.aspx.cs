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

public partial class SellMen_ClientInsert : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        DataClassesDataContext db = new DataClassesDataContext();
        Client fm = new Client();
        
        fm .client_name = TextAddName.Text;
        fm .client_products = TextProductName.Text;
        fm.client_tel = phonenumber.Text;
        fm.client_manager_name = contact.Text;
        fm .client_address = address.Text;
        fm.client_note = TextExtra.Text;


        db.Client.InsertOnSubmit(fm);
        db.SubmitChanges();
        //Response.Redirect("FamilyManage.aspx");
         
    }
    protected void TextBox2_TextChanged(object sender, EventArgs e)
    {

    }
}
