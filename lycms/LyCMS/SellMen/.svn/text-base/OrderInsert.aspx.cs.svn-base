using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class SellMen_OrderInsert : System.Web.UI.Page
{
    DataClassesDataContext db = new DataClassesDataContext();
    
   
    protected void Page_Load(object sender, EventArgs e)
    {
       // Session["orderid"] = "";
        string  str = DateTime.Today.ToString();
        OrderDate.Text = str;

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

   

    protected void Label1_DataBinding(object sender, EventArgs e)
    {
        

    }
   
    protected void saveorder_Click(object sender, EventArgs e)
    {
        Session["orderid"] = OrderNum.Text;
        Order_Form of = new Order_Form();
        of.client_id = Convert.ToInt32(ClientName.SelectedValue);
        of.order_date = Convert.ToDateTime(OrderDate.Text);
        of.orderform_id = OrderNum.Text;
        of.current_state_id = 1;
        db.Order_Form.InsertOnSubmit(of);
        db.SubmitChanges();
        State_Order_Form sof = new State_Order_Form();
        sof.state_id = 1;
        sof.modify_date = DateTime.Now;
        sof.modify_person = Session["UserName"].ToString();
        sof.orderform_id = OrderNum.Text;
        db.State_Order_Form.InsertOnSubmit(sof);
        db.SubmitChanges();
        saveorder.Visible = false;


    }
    protected void addProduct_Click(object sender, EventArgs e)
    {
        Order_Form_Product ofp = new Order_Form_Product();
        ofp.orderform_id = OrderNum.Text;
        ofp.product_id = Convert.ToInt32(ddlProduct.SelectedValue);     
        ofp.order_num = Convert.ToInt32(product_num.Text);
        ofp.rest_num = Convert.ToInt32(product_num.Text);
        ofp.finish_rate = 0;
        db.Order_Form_Product.InsertOnSubmit(ofp);
        db.SubmitChanges();
        //product.SelectCommand = "SELECT [product_id], [product_standars] FROM [Product] WHERE  [product_type_id]=" + ddlProType3.SelectedValue;
        GridView1.DataBind();
    }
    protected void saveorder2_Click(object sender, EventArgs e)
    {
        IQueryable<Staff> Executants = db.Staff.Where(p => p.staff_type == "executant");
        foreach (Staff m in Executants)
        {
            Message sme = db.Message.Single(p => p.staff_id == m.staff_id);
            sme.mes_wait_num += 1;
        }
        db.SubmitChanges();
        Response.Redirect("SellList.aspx");
        Session["orderid"] = "";
    }
    protected void deletedoder_Click(object sender, EventArgs e)
    {
        IQueryable<State_Order_Form> SOF = db.State_Order_Form.Where(p => p.orderform_id.ToString() == Session["orderid"].ToString());
        if (Session["orderid"].ToString() != " " && SOF.Count() > 0)
        {
            //IQueryable<State_Order_Form> SOF = db.State_Order_Form.Where(p => p.orderform_id.ToString() == Session["orderid"].ToString());
            db.State_Order_Form.DeleteAllOnSubmit(SOF);
            IQueryable<Order_Form_Product> OFPs = db.Order_Form_Product.Where(p => p.orderform_id.ToString() == Session["orderid"].ToString());
            if (OFPs.Count() > 0)
                db.Order_Form_Product.DeleteAllOnSubmit(OFPs);
            Order_Form OF = db.Order_Form.First(p => p.orderform_id.ToString() == Session["orderid"].ToString());
            db.Order_Form.DeleteOnSubmit(OF);
            db.SubmitChanges();
        }
        Response.Redirect("SellList.aspx");
        Session["orderid"] = " ";
    }
    protected void GridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {

        ////Get the value        
        string ofpid = GridView1.DataKeys[e.RowIndex].Value.ToString();
        Order_Form_Product OFP = db.Order_Form_Product.First(p => p.orderformproduct_id.ToString() ==ofpid);
        db.Order_Form_Product.DeleteOnSubmit(OFP);
        db.SubmitChanges();
        product.DeleteCommand = " ";
        product.Delete();
        GridView1.DataBind();

       // Response.Redirect("OrderInsert.aspx");
    }
    protected void product_Deleting(object sender, SqlDataSourceCommandEventArgs e)
    {

    }
}



