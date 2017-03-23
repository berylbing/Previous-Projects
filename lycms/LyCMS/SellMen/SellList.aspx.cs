using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Data;

public partial class SellMen_SellList : System.Web.UI.Page
{
    #region Variables
    DataClassesDataContext db = new DataClassesDataContext();
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

    #region GridView1
    protected void Page_Load(object sender, EventArgs e)
    {
        Message me = db.Message.Single(p => p.staff_id == Convert.ToInt32(Session["StaffId"]));
        Label2.Text = me.mes_back_num.ToString();
        Label4.Text = me.mes_export_num.ToString();
        Label7.Text = me.mes_sure_num.ToString();
    }

    protected void GridView1_RowCommand(object sender, GridViewCommandEventArgs e)
    {

    }
    protected void GridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {

    }
    protected void GridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {
        string orderdate = ((TextBox)GridView1.Rows[e.RowIndex].FindControl("Tborderdate")).Text;
        string clientname = ((DropDownList)GridView1.Rows[e.RowIndex].FindControl("Tbclientname")).Text;
        string orderid = ((Label)GridView1.Rows[e.RowIndex].FindControl("Label1")).Text;
        Order_Form OF = db.Order_Form.First(p => p.orderform_id.ToString() == orderid);
        OF.order_date = Convert.ToDateTime(orderdate);
        OF.client_id = db.Client.First(p => p.client_name == clientname).client_id;
        db.SubmitChanges();
        SqlDataSource1.UpdateCommand = " ";
        SqlDataSource1.Update();
        ClientScript.RegisterStartupScript(GetType(), "Message", "<SCRIPT LANGUAGE='javascript'>alert('订单修改成功！');</script>");

    }
    protected void GridView1_RowDeleted(object sender, GridViewDeletedEventArgs e)
    {

    }

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

        SqlDataSource2.SelectCommand = "SELECT [Order_Form_Product].[order_num],[Product].[product_id], [Product].[product_standars], [Product].[product_name], [Product].[product_unit], [Product_Type_1].[product_type_1_name], [Product_Type_2].[product_type_2_name], [Product_Type_3].[product_type_3_name], [Order_Form_Product].[orderform_id], [Order_Form_Product].[orderformproduct_id] FROM [Product_Type_2] INNER JOIN [Product_Type_1] ON [Product_Type_2].[product_type_id] = [Product_Type_1].[product_type_1_id] INNER JOIN [Product_Type_3] ON [Product_Type_2].[product_type_2_id] = [Product_Type_3].[product_type_id] INNER JOIN [Order_Form_Product] INNER JOIN [Product] ON [Order_Form_Product].[product_id] = [Product].[product_id] ON [Product_Type_3].[product_type_3_id] = [Product].[product_type_id] WHERE [Order_Form_Product].[orderform_id]='" + ((DataRowView)e.Row.DataItem)["orderform_id"] + "'";
        gv.DataSource = SqlDataSource2;
        gv.DataBind();

    }
    protected void GridView1_RowEditing(object sender, GridViewEditEventArgs e)
    {

    }
    #endregion
    #region GridView2
    protected void GridView2_PageIndexChanging(object sender, GridViewPageEventArgs e)
    {
        GridView gvTemp = (GridView)sender;
        gvUniqueID = gvTemp.UniqueID;
        gvNewPageIndex = e.NewPageIndex;
        GridView1.DataBind();
    }
    protected void GridView2_CancelingEdit(object sender, GridViewCancelEditEventArgs e)
    {
        GridView gvTemp = (GridView)sender;
        gvUniqueID = gvTemp.UniqueID;
        gvEditIndex = -1;
        GridView1.DataBind();
    }
    protected void GridView2_RowCommand(object sender, GridViewCommandEventArgs e)
    {

    }
    protected void GridView2_RowDataBound(object sender, GridViewRowEventArgs e)
    {
        //if (e.Row.RowType == DataControlRowType.DataRow)
        //{
        //    if (((DataRowView)e.Row.DataItem)["lbProductID"].ToString() == String.Empty) e.Row.Visible = false;
        //}
    }
    protected void GridView2_RowDeleted(object sender, GridViewDeletedEventArgs e)
    {
        if (e.Exception != null)
        {
            ClientScript.RegisterStartupScript(GetType(), "Message", "<SCRIPT LANGUAGE='javascript'>alert('" + e.Exception.Message.ToString().Replace("'", "") + "');</script>");
            e.ExceptionHandled = true;
        }
    }
    protected void GridView2_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {
        //string strOrderID = ((Label)gvTemp.Rows[e.RowIndex].FindControl("lblOrderID")).Text;
        try
        {
            GridView gvTemp = (GridView)sender;
            gvUniqueID = gvTemp.UniqueID;
            string ofpid = ((Label)gvTemp.Rows[e.RowIndex].FindControl("lborderProductID")).Text;
            Order_Form_Product OFP = db.Order_Form_Product.First(p => p.orderformproduct_id.ToString() == ofpid);
            db.Order_Form_Product.DeleteOnSubmit(OFP);
            db.SubmitChanges();
            SqlDataSource1.DeleteCommand = " ";
            SqlDataSource1.Delete();
            GridView1.DataBind();
        }
        catch { }
        
    }
    protected void GridView2_RowEditing(object sender, GridViewEditEventArgs e)
    {
        GridView gvTemp = (GridView)sender;
        gvUniqueID = gvTemp.UniqueID;
        gvEditIndex = e.NewEditIndex;
        GridView1.DataBind();
    }
    protected void GridView2_RowUpdated(object sender, GridViewUpdatedEventArgs e)
    {
        if (e.Exception != null)
        {
            ClientScript.RegisterStartupScript(GetType(), "Message", "<SCRIPT LANGUAGE='javascript'>alert('" + e.Exception.Message.ToString().Replace("'", "") + "');</script>");
            e.ExceptionHandled = true;
        }
    }
    protected void GridView2_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {
        try
        {
            GridView gvTemp = (GridView)sender;
            gvUniqueID = gvTemp.UniqueID;
            string ofpid = ((Label)gvTemp.Rows[e.RowIndex].FindControl("lborderProductID")).Text;
            Order_Form_Product OFP = db.Order_Form_Product.First(p => p.orderformproduct_id.ToString() == ofpid);
            OFP.order_num = Convert.ToInt32(((TextBox)gvTemp.Rows[e.RowIndex].FindControl("txton")).Text);
            db.SubmitChanges();
            SqlDataSource1.UpdateCommand = " ";
            SqlDataSource1.Update();
            ClientScript.RegisterStartupScript(GetType(), "Message", "<SCRIPT LANGUAGE='javascript'>alert('产品数量更新成功！');</script>");
            gvEditIndex = -1;

            GridView1.DataBind();
        }
        catch { }
        
    }
    protected void GridView2_Sorting(object sender, GridViewSortEventArgs e)
    {
        GridView gvTemp = (GridView)sender;
        gvUniqueID = gvTemp.UniqueID;
        gvSortExpr = e.SortExpression;
        GridView1.DataBind();
    }
    #endregion
    #region GridView3
   

    protected void GridView3_RowCommand(object sender, GridViewCommandEventArgs e)
    {
        if (e.CommandName.ToString() == "btnover")
        {
            int index = Convert.ToInt32(e.CommandArgument);
            DataKey key = GridView3.DataKeys[index];
            string ofid = key.Value.ToString();
            State_Order_Form sof = new State_Order_Form();
            Order_Form of = db.Order_Form.Single(p => p.orderform_id == ofid);
           
           
            //判断哪个按钮
            switch (e.CommandName.ToString())
            {
                case "btnover":
                    of.current_state_id = 0;
                    sof.orderform_id = ofid;
                    sof.state_id = 0;   
                    sof.modify_date = DateTime.Now;
                    db.State_Order_Form.InsertOnSubmit(sof);
                    db.SubmitChanges();
                    Response.Redirect("SellList.aspx");
                    break;
            }
        }

    }
    protected void GridView3_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {

    }
    protected void GridView3_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {
        string orderdate = ((TextBox)GridView3.Rows[e.RowIndex].FindControl("Tborderdate")).Text;
        string clientname = ((DropDownList)GridView3.Rows[e.RowIndex].FindControl("Tbclientname")).Text;
        string orderid = ((Label)GridView3.Rows[e.RowIndex].FindControl("Label1")).Text;
        Order_Form OF = db.Order_Form.First(p => p.orderform_id.ToString() == orderid);
        OF.order_date = Convert.ToDateTime(orderdate);
        OF.client_id = db.Client.First(p => p.client_name == clientname).client_id;
        db.SubmitChanges();
        SqlDataSource1.UpdateCommand = " ";
        SqlDataSource1.Update();
        ClientScript.RegisterStartupScript(GetType(), "Message", "<SCRIPT LANGUAGE='javascript'>alert('订单修改成功！');</script>");

    }
    protected void GridView3_RowDeleted(object sender, GridViewDeletedEventArgs e)
    {

    }

    protected void GridView3_RowDataBound(object sender, GridViewRowEventArgs e)
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

        SqlDataSource2.SelectCommand = "SELECT [Order_Form_Product].[order_num],[Product].[product_id], [Product].[product_standars], [Product].[product_name], [Product].[product_unit], [Product_Type_1].[product_type_1_name], [Product_Type_2].[product_type_2_name], [Product_Type_3].[product_type_3_name], [Order_Form_Product].[orderform_id], [Order_Form_Product].[orderformproduct_id] FROM [Product_Type_2] INNER JOIN [Product_Type_1] ON [Product_Type_2].[product_type_id] = [Product_Type_1].[product_type_1_id] INNER JOIN [Product_Type_3] ON [Product_Type_2].[product_type_2_id] = [Product_Type_3].[product_type_id] INNER JOIN [Order_Form_Product] INNER JOIN [Product] ON [Order_Form_Product].[product_id] = [Product].[product_id] ON [Product_Type_3].[product_type_3_id] = [Product].[product_type_id] WHERE [Order_Form_Product].[orderform_id]='" + ((DataRowView)e.Row.DataItem)["orderform_id"] + "'";
        gv.DataSource = SqlDataSource2;
        gv.DataBind();

    }
    protected void GridView3_RowEditing(object sender, GridViewEditEventArgs e)
    {

    }
    #endregion
    protected void ButtonFind_Click(object sender, EventArgs e)
    {
        SqlDataSource1.SelectCommand = "SELECT [Order_Form].[priority], [Client].[client_name], [Client].[client_tel], [Client].[client_manager_name], [Order_Form].[orderform_id], [Order_Form].[order_date], [State].[state_name], [Staff].[staff_name], [Staff].[staff_id], [State].[state_id]FROM [Client] INNER JOIN [Order_Form] ON [Client].[client_id] = [Order_Form].[client_id] INNER JOIN [Staff] ON [Client].[staff_id] = [Staff].[staff_id] INNER JOIN [State] ON [Order_Form].[current_state_id] = [State].[state_id] WHERE [Staff].[staff_id] = '" + Convert.ToInt32(Session["StaffId"].ToString()) + "' AND [State].[state_id] = 1 AND [Order_Form].[orderform_id] = '" + Tbforderid.Text +"'";
        GridView3.DataBind();

    }
    protected void newButton_Click(object sender, EventArgs e)
    {
        Response.Redirect("OrderInsert.aspx");
    }


    protected void Button1_Click(object sender, EventArgs e)
    {
        Message me = db.Message.Single(p => p.staff_id == Convert.ToInt32(Session["StaffId"]));
        me.mes_export_num = 0;
        me.mes_sure_num = 0;
        me.mes_back_num = 0;
        db.SubmitChanges();
        Response.Redirect("SellList.aspx");
    }
    protected void btnover_Click(object sender, EventArgs e)
    {
        Button btn = (Button)sender;
        GridViewRow drv = (GridViewRow)btn.NamingContainer;
        int rowIndex = drv.RowIndex;
        DataClassesDataContext db = new DataClassesDataContext();
        State_Order_Form sof = new State_Order_Form();
        Order_Form of = db.Order_Form.Single(p => p.orderform_id == GridView3.Rows[rowIndex].Cells[1].Text);
        of.current_state_id = 0;
        sof.orderform_id = GridView3.Rows[rowIndex].Cells[0].Text;
        sof.state_id = 0;
        sof.modify_date = DateTime.Now;
        db.State_Order_Form.InsertOnSubmit(sof);
        db.SubmitChanges();
        Response.Redirect("SellList.aspx");
    }
}
