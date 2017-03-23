using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class StoreMen_ProductImport : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {      
                 
    }
    protected void ddlProType1_SelectedIndexChanged(object sender, EventArgs e)
    {
        SqlDataSource2.SelectCommand = "SELECT [product_type_2_name], [product_type_2_id] FROM [Product_Type_2] WHERE  [product_type_id]=" + ddlProType1.SelectedValue;
        ddlProType2.DataBind();
    }
    protected void ddlProType2_SelectedIndexChanged(object sender, EventArgs e)
    {
        SqlDataSource3.SelectCommand = "SELECT [product_type_3_name], [product_type_3_id] FROM [Product_Type_3] WHERE  [product_type_id]=" + ddlProType2.SelectedValue;
        ddlProType3.DataBind();
    }
    protected void ddlProType3_SelectedIndexChanged(object sender, EventArgs e)
    {
        SqlDataSource4.SelectCommand = "SELECT [product_id], [product_standars] FROM [Product] WHERE  [product_type_id]=" + ddlProType3.SelectedValue;
        ddlProduct.DataBind();
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        DataClassesDataContext db = new DataClassesDataContext();
        Product_Import pi = new Product_Import();
        pi.product_id = Convert.ToInt32(ddlProduct.SelectedValue);
        pi.package_per_num = Convert.ToInt32(txtPerNum.Text);
        pi.import_package_num = Convert.ToInt32(txtPackNum.Text);
        pi.import_date = Convert.ToDateTime(txtTime.Text);
        pi.import_note = txtDetail.Text;
        pi.import_series = txtseries.Text;
        db.Product_Import.InsertOnSubmit(pi);
        db.SubmitChanges();
    }
}
