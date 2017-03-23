using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Data;

public partial class Executant_OrderManager : System.Web.UI.Page
{
    #region Variables
    string gvUniqueID = String.Empty;
    int gvNewPageIndex = 0;
    int gvEditIndex = -1;
    string gvSortExpr = String.Empty;
    private string gvSortDir
    {

        get { return ViewState["SortDirection"] as string ?? "ASC"; }

        set { ViewState["SortDirection"] = value; }

    }
    #endregion
    DataClassesDataContext db = new DataClassesDataContext();

    private string GetSortDirection()
    {
        switch (gvSortDir)
        {
            case "ASC":
                gvSortDir = "DESC";
                break;

            case "DESC":
                gvSortDir = "ASC";
                break;
        }
        return gvSortDir;
    }


    protected void Page_Load(object sender, EventArgs e)
    {
        //Staff sf=db.Staff.Single(p=>p.staff_id==Convert.ToInt32(Session["StaffId"]));
        Message me=db.Message.Single(p=>p.staff_id==Convert.ToInt32(Session["StaffId"]));
        Label2.Text = me.mes_wait_num.ToString();
    }
    protected void GridView1_RowCommand(object sender, GridViewCommandEventArgs e)
    {
        //取INdex
        if (e.CommandName.ToString() == "btnSure" || e.CommandName.ToString() == "btnBack")
        {
            int index = Convert.ToInt32(e.CommandArgument);
            DataKey key = GridView1.DataKeys[index];
            string ofid = key.Value.ToString();
            State_Order_Form sof = new State_Order_Form();
            Order_Form of = db.Order_Form.Single(p => p.orderform_id == ofid);
            Client cl = db.Client.Single(p => p.client_id == of.client_id);
            Message me = db.Message.Single(p => p.staff_id == cl.staff_id);
            //判断哪个按钮
            switch (e.CommandName.ToString())
            {
                case "btnSure":
                    of.current_state_id = 3;
                    sof.orderform_id = ofid;
                    sof.state_id = 3;
                    IQueryable<Staff> Stores = db.Staff.Where(p => p.staff_type == "storemen");
                    foreach (Staff m in Stores)
                    {
                        Message sme = db.Message.Single(p => p.staff_id == m.staff_id);
                        sme.mes_sure_num += 1;
                    }
                    me.mes_sure_num += 1;
                    sof.modify_date = DateTime.Now;
                    db.State_Order_Form.InsertOnSubmit(sof);
                    db.SubmitChanges();
                    Response.Redirect("OrderManager.aspx");
                    break;
                case "btnBack":
                    me.mes_back_num += 1;
                    of.current_state_id = 2;
                    sof.orderform_id = ofid;
                    sof.state_id = 2;
                    sof.modify_date = DateTime.Now;
                    db.State_Order_Form.InsertOnSubmit(sof);
                    db.SubmitChanges();
                    Response.Redirect("OrderManager.aspx");
                    break;
            }
        }
        
        
    }
    protected void GridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {

    }
    protected void GridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {



    }
    protected void GridView1_RowDeleted(object sender, GridViewDeletedEventArgs e)
    {

    }

    //private SqlDataSource ChildDataSource(string strProductId, string strSort)
    //{
    //    SqlDataSource sqltemp = new SqlDataSource();
    //    string str = "";
    //    sqltemp.ConnectionString = "LYCMSConnectionString";
    //    sqltemp.SelectCommand = ""
    //}

    protected void GridView1_RowDataBound(object sender, GridViewRowEventArgs e)
    {
        GridViewRow row = e.Row;
        string strSort = string.Empty;

        //// Make sure we aren't in header/footer rows
        if (row.DataItem == null)
        {
            return;
        }

        ////Find Child GridView control
        GridView gv = new GridView();
        gv = (GridView)row.FindControl("GridView2");

        //////Check if any additional conditions (Paging, Sorting, Editing, etc) to be applied on child GridView
        if (gv.UniqueID == gvUniqueID)
        {
            gv.PageIndex = gvNewPageIndex;
            gv.EditIndex = gvEditIndex;
            //Check if Sorting used
            if (gvSortExpr != string.Empty)
            {
                GetSortDirection();
                strSort = " ORDER BY " + string.Format("{0} {1}", gvSortExpr, gvSortDir);
            }
            //Expand the Child grid
            ClientScript.RegisterStartupScript(GetType(), "Expand", "<SCRIPT LANGUAGE='javascript'>expandcollapse('div" + ((DataRowView)e.Row.DataItem)["orderform_id"].ToString() + "','one');</script>");
        }

        SqlDataSource2.SelectCommand = "SELECT [Order_Form_Product].[order_num],[Product].[product_id], [Product].[product_standars], [Product].[product_name], [Product].[product_unit], [Product_Type_1].[product_type_1_name], [Product_Type_2].[product_type_2_name], [Product_Type_3].[product_type_3_name], [Order_Form_Product].[orderform_id] FROM [Product_Type_2] INNER JOIN [Product_Type_1] ON [Product_Type_2].[product_type_id] = [Product_Type_1].[product_type_1_id] INNER JOIN [Product_Type_3] ON [Product_Type_2].[product_type_2_id] = [Product_Type_3].[product_type_id] INNER JOIN [Order_Form_Product] INNER JOIN [Product] ON [Order_Form_Product].[product_id] = [Product].[product_id] ON [Product_Type_3].[product_type_3_id] = [Product].[product_type_id] WHERE [Order_Form_Product].[orderform_id]='" + ((DataRowView)e.Row.DataItem)["orderform_id"] + "'";

        //////Prepare the query for Child GridView by passing the Customer ID of the parent row
        //Session["orderid"] = ((DataRowView)e.Row.DataItem)["orderform_id"].ToString();
        gv.DataSource = SqlDataSource2;
        gv.DataBind();

        //////Add delete confirmation message for Customer
        LinkButton l = (LinkButton)e.Row.FindControl("linkDelete");
        l.Attributes.Add("onclick", "javascript:return " +
        "confirm('Are you sure you want to delete this orderform " +
        DataBinder.Eval(e.Row.DataItem, "orderform_id") + "')");


    }
    protected void GridView2_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {

    }
    protected void GridView2_CancelingEdit(object sender, GridViewCancelEditEventArgs e)
    {

    }
    protected void GridView2_RowCommand(object sender, GridViewCommandEventArgs e)
    {

    }
    protected void GridView2_RowDataBound(object sender, GridViewRowEventArgs e)
    {

    }
    protected void GridView2_RowDeleted(object sender, GridViewDeletedEventArgs e)
    {

    }
    protected void GridView2_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {

    }
    protected void GridView2_RowEditing(object sender, GridViewEditEventArgs e)
    {

    }
    protected void GridView2_RowUpdated(object sender, GridViewUpdatedEventArgs e)
    {

    }
    protected void GridView2_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {

    }
    protected void GridView2_Sorting(object sender, GridViewSortEventArgs e)
    {

    }
    protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
    {
        //    ImageButton imb = (ImageButton)sender;
        //    imb.ImageUrl = "~/SellMen/minus.gif";
        //    GridView gv = new GridView();
        //    GridViewRow row = (GridViewRow)imb.NamingContainer;
        //    int rowIndex = row.RowIndex;
        //    gv = (GridView)row.FindControl("GridView2");
        //    //SqlDataSource sqd = new SqlDataSource();
        //    //sqd.SelectCommand = 
        //    SqlDataSource2.SelectCommand = "SELECT [Order_Form_Product].[order_num],[Product].[product_id], [Product].[product_standars], [Product].[product_name], [Product].[product_unit], [Product_Type_1].[product_type_1_name], [Product_Type_2].[product_type_2_name], [Product_Type_3].[product_type_3_name], [Order_Form_Product].[orderform_id] FROM [Product_Type_2] INNER JOIN [Product_Type_1] ON [Product_Type_2].[product_type_id] = [Product_Type_1].[product_type_1_id] INNER JOIN [Product_Type_3] ON [Product_Type_2].[product_type_2_id] = [Product_Type_3].[product_type_id] INNER JOIN [Order_Form_Product] INNER JOIN [Product] ON [Order_Form_Product].[product_id] = [Product].[product_id] ON [Product_Type_3].[product_type_3_id] = [Product].[product_type_id] WHERE [Order_Form_Product].[orderform_id]=" + GridView1.Rows[rowIndex].Cells[2].Text;
        //    gv.DataBind();
        //    Response.Redirect("testgridview.aspx");
        //SqlDataSource gv = new GridView();
        //GridViewRow row = (GridViewRow)imb.NamingContainer;
        //gv = (GridView)row.FindControl("GridView2");
        //ImageButton ib = new ImageButton();
        //ib.FindControl(
    }
    protected void btnsure_Click(object sender, EventArgs e)
    {
        Button btn = (Button)sender;
        GridViewRow drv = (GridViewRow)btn.NamingContainer;
        int rowIndex = drv.RowIndex;
        DataClassesDataContext db = new DataClassesDataContext();
        State_Order_Form sof = new State_Order_Form();
        Order_Form of = db.Order_Form.Single(p => p.orderform_id == GridView1.Rows[rowIndex].Cells[1].Text);
        of.current_state_id = 3;
        sof.orderform_id = GridView1.Rows[rowIndex].Cells[0].Text;
        sof.state_id = 3;
        sof.modify_date = DateTime.Now;
        db.State_Order_Form.InsertOnSubmit(sof);
        db.SubmitChanges();
        Response.Redirect("OrderManager.aspx");
    }
    protected void btnback_Click(object sender, EventArgs e)
    {
        Button btn = (Button)sender;
        GridViewRow drv = (GridViewRow)btn.NamingContainer;
        int rowIndex = drv.RowIndex;
        DataClassesDataContext db = new DataClassesDataContext();
        State_Order_Form sof = new State_Order_Form();
        Order_Form of = db.Order_Form.Single(p => p.orderform_id == GridView1.Rows[rowIndex].Cells[1].Text);
        of.current_state_id = 2;
        sof.orderform_id = GridView1.Rows[rowIndex].Cells[0].Text;
        sof.state_id = 2;
        sof.modify_date = DateTime.Now;
        db.State_Order_Form.InsertOnSubmit(sof);
        db.SubmitChanges();
        Response.Redirect("OrderManager.aspx");
    }
    protected void GridView3_RowCommand(object sender, GridViewCommandEventArgs e)
    {
        //取INdex
        int index = Convert.ToInt32(e.CommandArgument);
        DataKey key = GridView1.DataKeys[index];
        string ofid = key.Value.ToString();
        State_Order_Form sof = new State_Order_Form();
        Order_Form of = db.Order_Form.Single(p => p.orderform_id == ofid);
        DropDownList ddlPriority =(DropDownList)GridView1.Rows[index].Cells[7].FindControl("ddlPriority");
        //判断哪个按钮
        switch (e.CommandName.ToString())
        {
            
            case "ddlPriority":
                of.priority = Convert.ToInt32(ddlPriority.SelectedValue);
                db.SubmitChanges();
                Response.Redirect("OrderManager.aspx");
                break;
            
        }




    }
    protected void ddlPriority_SelectedIndexChanged1(object sender, EventArgs e)
    {
        DropDownList ddl = (DropDownList)sender;
        GridViewRow drv = (GridViewRow)ddl.NamingContainer;
        int rowIndex = drv.RowIndex;
        Order_Form of = db.Order_Form.Single(p => p.orderform_id == GridView3.DataKeys[rowIndex].Values[0]);
        of.priority = Convert.ToInt32(ddl.SelectedValue);
        db.SubmitChanges();
        Response.Redirect("OrderManager.aspx");
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        Message me=db.Message.Single(p=>p.staff_id==Convert.ToInt32(Session["StaffId"]));
        me.mes_wait_num=0;
        db.SubmitChanges();
        Response.Redirect("OrderManager.aspx");
    }
}
