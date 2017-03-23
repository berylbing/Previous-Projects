<%@ Page Title="" Language="C#" MasterPageFile="~/Frame/MainLeftStore.master" AutoEventWireup="true"
    CodeFile="StorageChange.aspx.cs" Inherits="StoreMen_StorageChange" %>

<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="ajaxToolkit" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder2" runat="Server">
    <asp:ScriptManager ID="ScriptManager2" runat="server">
    </asp:ScriptManager>
    <div class="right_content" cellpadding="0" cellspacing="0" style="height: 480px;
        width: 815px; background-color: #F0F0F0;">
        <table width="98%" border="0" cellpadding="0" cellspacing="0" class="text008">
            <tr height="35" align="center">
               <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                    <ContentTemplate> 
                <td align="right" style="width: 50px">
                    分类
                </td>
                
                <td align="left" style="width: 129px">
                    <asp:DropDownList ID="ddlProType1" runat="server" AutoPostBack="True" DataSourceID="SqlDataSource1"
                        DataTextField="product_type_1_name" DataValueField="product_type_1_id" OnSelectedIndexChanged="ddlProType1_SelectedIndexChanged"
                        AppendDataBoundItems="True">
                    </asp:DropDownList>
                </td>
                <td height="35" align="right" style="width: 53px">
                    产品名称
                </td>
                        <td align="left">
                            <fieldset>
                                <asp:DropDownList ID="ddlProType2" runat="server" DataSourceID="SqlDataSource2" DataTextField="product_type_2_name"
                                    DataValueField="product_type_2_id" AutoPostBack="True" OnSelectedIndexChanged="ddlProType2_SelectedIndexChanged">
                                </asp:DropDownList>
                            </fieldset>
                        </td>
                        <td height="35" align="right">
                            明细
                        </td>
                        <td align="left">
                            <fieldset>
                                <asp:DropDownList ID="ddlProType3" runat="server" DataSourceID="SqlDataSource3" DataTextField="product_type_3_name"
                                    DataValueField="product_type_3_id" AutoPostBack="True" OnSelectedIndexChanged="ddlProType3_SelectedIndexChanged">
                                </asp:DropDownList>
                            </fieldset>
                        </td>
                            <td height="35" align="right" style="width: 51px">
                                产品规格
                            </td>
                            <td align="left" style="width: 127px">
                                <fieldset>
                                    <asp:DropDownList ID="ddlProduct" runat="server" DataSourceID="SqlDataSource4"
                                        DataTextField="product_standars" DataValueField="product_id">
                                    </asp:DropDownList>
                                </fieldset>
                            </td>
                    </ContentTemplate>
                </asp:UpdatePanel>
                </tr>
                <tr align="center">
                <td height="35" align="right" style="width: 51px">
                    批号
                </td>
                <td align="left" style="width: 127px">
                    <asp:TextBox ID="txtseries" runat="server"></asp:TextBox>
                </td>
                <td height="35" align="right" style="width: 50px">
                    每箱件数</td>
                <td align="left" style="width: 129px">
                    <asp:TextBox ID="txtPerNum" runat="server"></asp:TextBox>
                </td>
                <td height="35" align="right" style="width: 50px">
                    箱数</td>
                <td align="left" style="width: 129px">
                    <asp:TextBox ID="txtPackNum" runat="server"></asp:TextBox>
                </td>
                <td height="35" align="right" style="width: 50px">
                    时间</td>
                <td align="left" style="width: 129px">
                    <asp:TextBox ID="txtTime" runat="server"></asp:TextBox>
                </td>
            </tr>
                <tr>
                    <td height="35" align="right" style="width: 51px">
                        详细信息
                    </td>
                    <td align="left" style="width: 127px">
                        <asp:TextBox ID="txtDetail" runat="server"></asp:TextBox>
                    </td>
                </tr>
        </table>
        <table width="98%">
            <tr>
                <td style="width: 50%;" align="left">
                    <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>"
                        SelectCommand="SELECT [product_type_1_name], [product_type_1_id] FROM [Product_Type_1]">
                    </asp:SqlDataSource>
                    <asp:SqlDataSource ID="SqlDataSource2" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>"
                        SelectCommand="SELECT [product_type_2_name], [product_type_2_id] FROM [Product_Type_2]">
                    </asp:SqlDataSource>
                    <asp:SqlDataSource ID="SqlDataSource3" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>"
                        SelectCommand="SELECT [product_type_3_id], [product_type_3_name] FROM [Product_Type_3]">
                    </asp:SqlDataSource>
                    <asp:SqlDataSource ID="SqlDataSource4" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>"
                        SelectCommand="SELECT [product_id], [product_standars] FROM [Product]">
                    </asp:SqlDataSource>
                </td>
                <td align="right">
                    <asp:Button ID="Button1" Text="确定" runat="server" Width="72px" Height="34px" 
                        onclick="Button1_Click" />
                </td>
                <td style="width: 100px">
                </td>
                <td align="left">
                    <asp:Button ID="Button2" Text="取消" runat="server" Width="72px" Height="34px" />
                </td>
            </tr>
        </table>
    </div>
</asp:Content>
