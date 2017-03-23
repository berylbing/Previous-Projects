using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class StoreMen_ProductExport : System.Web.UI.Page
{
    DataClassesDataContext db = new DataClassesDataContext();
   

    protected void Page_Load(object sender, EventArgs e)
    {
        Order_Form_Product ofp = db.Order_Form_Product.Single(p => p.orderformproduct_id == Convert.ToInt32(Session["orderformproduct_id"]));
        
        Order_Form of=db.Order_Form.Single(p => p.orderform_id ==ofp.orderform_id);
        Product pro=db.Product.Single(p => p.product_id ==ofp.product_id);
        Product_Type_3 pt3=db.Product_Type_3.Single(p => p.product_type_3_id ==pro.product_type_id);
        Product_Type_2 pt2=db.Product_Type_2.Single(p => p.product_type_2_id ==pt3.product_type_id);
        Product_Type_1 pt1=db.Product_Type_1.Single(p => p.product_type_1_id ==pt2.product_type_id);
        Client clnt = db.Client.Single(p => p.client_id == of.client_id);
        txtProType1.Text = pt1.product_type_1_name;
        txtProType2.Text = pt2.product_type_2_name;
        txtProType3.Text = pt3.product_type_3_name;
        txtSta.Text = pro.product_standars;
        txtClient.Text = clnt.client_name;
        txtOrderFormid.Text = of.orderform_id;

    }
    //protected void ddlProType1_SelectedIndexChanged(object sender, EventArgs e)
    //{
    //    SqlDataSource2.SelectCommand = "SELECT [product_type_2_name], [product_type_2_id] FROM [Product_Type_2] WHERE  [product_type_id]=" + ddlProType1.SelectedValue;
    //    ddlProType2.DataBind();
    //}
    //protected void ddlProType2_SelectedIndexChanged(object sender, EventArgs e)
    //{
    //    SqlDataSource3.SelectCommand = "SELECT [product_type_3_name], [product_type_3_id] FROM [Product_Type_3] WHERE  [product_type_id]=" + ddlProType2.SelectedValue;
    //    ddlProType3.DataBind();
    //}
    //protected void ddlProType3_SelectedIndexChanged(object sender, EventArgs e)
    //{
    //    SqlDataSource4.SelectCommand = "SELECT [product_id], [product_standars] FROM [Product] WHERE  [product_type_id]=" + ddlProType3.SelectedValue;
    //    ddlProduct.DataBind();
    //}
    protected void Button1_Click(object sender, EventArgs e)
    {
        
        Order_Form_Product ofp = db.Order_Form_Product.Single(p => p.orderformproduct_id == Convert.ToInt32(Session["orderformproduct_id"]));
        Order_Form of = db.Order_Form.Single(p => p.orderform_id == ofp.orderform_id);
        if (Convert.ToInt32(txtamount.Text) <= ofp.rest_num)
        {
            Product_Export pe = new Product_Export();
            pe.export_property = DropDownListproperty.SelectedValue;
            pe.export_partnum = txtpartnum.Text;
            pe.export_series = txtseries.Text;
            pe.export_num = Convert.ToInt32(txtamount.Text);
            pe.export_date = Convert.ToDateTime(txtTime.Text);
            pe.export_note = txtnote.Text;
            pe.orderformproduct_id = Convert.ToInt32(Session["orderformproduct_id"]);
            pe.export_level = DropDownListlevel.SelectedValue;
            ofp.rest_num -= pe.export_num;
            db.Product_Export.InsertOnSubmit(pe);
            IQueryable<Order_Form_Product> OFPs = db.Order_Form_Product.Where(p => p.orderform_id == ofp.orderform_id);
            bool flag = true;
            foreach (Order_Form_Product m in OFPs)
            {
                if (m.rest_num != 0)
                    flag = false;
            }
            if (flag)
            {
                of.current_state_id = 7;
                State_Order_Form sof = new State_Order_Form();
                sof.modify_date = DateTime.Now;
                sof.modify_person = Session["UserName"].ToString();
                sof.orderform_id = of.orderform_id;
                sof.state_id = 7;
                db.State_Order_Form.InsertOnSubmit(sof);
                Client cl = db.Client.Single(p => p.client_id == of.client_id);
                Message me = db.Message.Single(p => p.staff_id == cl.staff_id);
                me.mes_export_num+= 1;
            }
            db.SubmitChanges();
        }
        else
            ClientScript.RegisterStartupScript(GetType(), "Message", "<SCRIPT LANGUAGE='javascript'>alert('出错啦~出库过量！');</script>");


        Response.Redirect("ProductStoreList.aspx");
        //pi.import_package_num = Convert.ToInt32(txtPackNum.Text);
        //pi.import_date = Convert.ToDateTime(txtTime.Text);
        //pi.import_note = txtDetail.Text;
        //pi.import_series = txtseries.Text;
        
    }
}
