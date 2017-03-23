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
using System.Data.SqlClient;
using CrystalDecisions.CrystalReports.Engine;

public partial class StoreMen_CrystalReport_Store_2 : System.Web.UI.Page
{
    public string d = "1";
    ReportDocument ReportDoc;
    //数据库连接字符串
    string strProvider = "Server=192.168.0.236\\sqlExpress;DataBase=LYCMS;UID=sa;PWD=lycms";
    //创建数据库连接对象
    SqlConnection MyConn;
    DataSet1 ds;
    protected void Page_Load(object sender, EventArgs e)
    {
        MyConn = new SqlConnection(strProvider);
        ds = new DataSet1();
        ds.Clear();

        ReportDoc = new ReportDocument();
        MyConn.Open();
        string strSql = "select  * from View_4";
        SqlDataAdapter daView_1 = new SqlDataAdapter(strSql, MyConn);

        //将适配器里面的信息填充到对应的Dataset里面的Table
        daView_1.Fill(ds, "View_4");
        ReportDoc.Load(Server.MapPath("CrystalReport_Store_2.rpt"));
        ReportDoc.SetDatabaseLogon("sa", "lycms", @"192.168.0.236\\sqlExpress", "LYCMS");
        ReportDoc.SetDataSource(ds.Tables["View_4"]);
        MyConn.Close();
        CrystalReportViewer1.ReportSource = ReportDoc;
        CrystalReportViewer1.DataBind();
    }
}

