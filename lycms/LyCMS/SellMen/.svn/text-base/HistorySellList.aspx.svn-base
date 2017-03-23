<%@ Page Title="" Language="C#" MasterPageFile="~/Frame/MainLeftSell.master" AutoEventWireup="true" CodeFile="HistorySellList.aspx.cs" Inherits="SellMen_HistorySellList" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder2" Runat="Server">
<script language=javascript type="text/javascript">
    function expandcollapse(obj, row) {
        var div = document.getElementById(obj);
        var img = document.getElementById('img' + obj);

        if (div.style.display == "none") {
            div.style.display = "block";
            if (row == 'alt') {
                img.src = "../Image/Menu/tree_minus.gif";
            }
            else {
                img.src = "../Image/Menu/tree_minus.gif";
            }
            img.alt = "Close to view other Order_Form";
        }
        else {
            div.style.display = "none";
            if (row == 'alt') {
                img.src = "../Image/Menu/tree_plus.gif";
            }
            else {
                img.src = "../Image/Menu/tree_plus.gif";
            }
            img.alt = "Expand to show Product";
        }
    } 
    </script>
    
    
<div style="height:480px; width:815px; background-color:#F0F0F0;">
<table>
<tr>
    <asp:GridView ID="GridView1" runat="server" AllowPaging="True" 
        AllowSorting="True" AutoGenerateColumns="False" DataKeyNames="orderform_id" 
        DataSourceID="SqlDataSource1" BackColor="#F1F1F1"   
        ShowFooter=True Font-Size=Small
        Font-Names="Verdana" GridLines=None  BorderStyle=Outset 
        onrowcommand="GridView1_RowCommand" onrowdatabound="GridView1_RowDataBound" 
        onrowdeleted="GridView1_RowDeleted" onrowdeleting="GridView1_RowDeleting" 
        onrowupdating="GridView1_RowUpdating" style="margin-right: 138px" 
        onselectedindexchanged="GridView1_SelectedIndexChanged1">
        <RowStyle BackColor="Gainsboro" />
        <AlternatingRowStyle BackColor="White" />
        <HeaderStyle BackColor="#0083C1" ForeColor="White"/>
        <FooterStyle BackColor="White" />
        <Columns>
            <asp:TemplateField >
            <ItemTemplate>
                <a href="javascript:expandcollapse('div<%# Eval("orderform_id") %>', 'one');">
                <img id="imgdiv<%# Eval("orderform_id") %>" alt="Click to show/hide Product for Order_Form <%# Eval("orderform_id") %>"   border="0" src= "../Image/Menu/tree_plus.gif"/>
                </a>
            </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField  HeaderText="订单号" SortExpression="orderform_id">
            <ItemStyle Width="200px" />
             <ItemTemplate>
                    <%#Eval("orderform_id") %>
                </ItemTemplate>
                <EditItemTemplate>
                    <asp:TextBox ID="Tborderid"  Text = '' runat="server"></asp:TextBox>
                </EditItemTemplate>
               
            </asp:TemplateField>
            <asp:TemplateField HeaderText="订单日期" SortExpression="order_date">
               <ItemStyle Width="200px" />
               <ItemTemplate>
                    <%#Eval("order_date") %>
                </ItemTemplate>
                <EditItemTemplate>
                    <asp:TextBox ID="Tborderdate"  Text = '' runat="server"></asp:TextBox>
                </EditItemTemplate>
               
            </asp:TemplateField>
            <asp:TemplateField HeaderText="客户名" SortExpression="client_name">
            <ItemStyle Width="200px" />
                <ItemTemplate>
                    <%#Eval("client_name") %>
                </ItemTemplate>
                <EditItemTemplate>
                    <asp:TextBox ID="Tbclientname"  Text = '' runat="server"></asp:TextBox>
                </EditItemTemplate>
               
            </asp:TemplateField>
            <asp:TemplateField HeaderText="订单状态" SortExpression="state_name">
                <ItemStyle Width="200px" />
                <ItemTemplate>
                    <%#Eval("state_name")%>
                </ItemTemplate>
                <EditItemTemplate>
                    <asp:TextBox ID="Tbcurrentstate"  Text = '' runat="server"></asp:TextBox>
                </EditItemTemplate>
               
            </asp:TemplateField>
            
            
            <asp:CommandField HeaderText="Edit" ControlStyle-Width="200px" 
                ShowEditButton="True" />
            <asp:TemplateField HeaderText="Delete">
            <ItemStyle Width="200px" />
                <ItemTemplate>
                    <asp:LinkButton ID="LinkDelete" CommandName = "Delete" runat="server">Delete</asp:LinkButton>
                </ItemTemplate>
              
            </asp:TemplateField>
            
            
            <asp:TemplateField >
                <ItemTemplate>
                    <tr>
                        <td colspan="100%">
                            <div id = "div<%# Eval("orderform_id") %>" style="display:none">
                                <asp:GridView ID="GridView2" runat="server" AllowPaging="True" AllowSorting="True" 
                                AutoGenerateColumns="False" Font-Names="Verdana" BackColor="White" 
                                    Width="100%" Font-Size="X-Small"
                                OnPageIndexChanging="GridView2_PageIndexChanging" OnRowUpdating = "GridView2_RowUpdating"
                                OnRowCommand = "GridView2_RowCommand" OnRowEditing = "GridView2_RowEditing" GridLines=None
                                OnRowUpdated = "GridView2_RowUpdated" 
                                    OnRowCancelingEdit = "GridView2_CancelingEdit" OnRowDataBound = "GridView2_RowDataBound"
                                OnRowDeleting = "GridView2_RowDeleting" OnRowDeleted = "GridView2_RowDeleted" OnSorting = "GridView2_Sorting"
                                BorderStyle=Double BorderColor="#0083C1" >
                                <RowStyle BackColor="Gainsboro" />
                                <AlternatingRowStyle BackColor="White" />
                                <HeaderStyle BackColor="#0083C1" ForeColor="White"/>
                                <FooterStyle BackColor="White" />
                                <Columns>
                                         <asp:TemplateField HeaderText="产品id" SortExpression="product_id">
                                                <ItemStyle Width="100px" />
                                                <ItemTemplate>
                                                    <asp:Label ID="lbProductID" Text='<%# Eval("product_id") %>' runat="server"></asp:Label>
                                                </ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:Label ID="lblProductID" Text='<%# Eval("product_id") %>' runat="server"></asp:Label>
                                                </EditItemTemplate>
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="总分" SortExpression="product_type_1_name">
                                            <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_type_1_name")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txtpt1" Text='<%# Eval("product_type_1_name")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                              
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="细分" SortExpression="product_type_2_name">
                                            <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_type_2_name")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txtpt2" Text='<%# Eval("product_type_2_name")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                               
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="分类" SortExpression="product_type_3_name">
                                            <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_type_3_name")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txtpt3" Text='<%# Eval("product_type_3_name")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                               
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="规格" SortExpression="product_standars">
                                            <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_standars")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txtps" Text='<%# Eval("product_standars")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                              
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="数量" SortExpression="order_num">
                                            <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("order_num")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txton" Text='<%# Eval("order_num")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                             
                                            </asp:TemplateField>
                                             <asp:TemplateField HeaderText="单位" SortExpression="product_unit">
                                             <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_unit")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txtpu" Text='<%# Eval("product_unit")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                              
                                            </asp:TemplateField>
                                            
			                                <asp:CommandField HeaderText="Edit" ShowEditButton="True" />
			                               
			                                <asp:TemplateField HeaderText="Delete">
			                                <ItemStyle Width="100px" />
                                                 <ItemTemplate>
                                                    <asp:LinkButton ID="linkDelete" CommandName="Delete" runat="server">Delete</asp:LinkButton>
                                                 </ItemTemplate>
                                            </asp:TemplateField>
                                </Columns>
                                </asp:GridView>
                            </div>
                        </td>
                    </tr>
                </ItemTemplate>
            </asp:TemplateField>
            
            
        </Columns>
    </asp:GridView>
</tr>
</table>
</div>

<div>
<table>
    <tr>
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" 
        ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>" 
        
         SelectCommand="SELECT Order_Form.priority, Client.client_name, Client.client_tel, Client.client_manager_name, Order_Form.orderform_id, Order_Form.order_date, State.state_name, Staff.staff_name FROM Client INNER JOIN Order_Form ON Client.client_id = Order_Form.client_id INNER JOIN Staff ON Client.staff_id = Staff.staff_id INNER JOIN State ON Order_Form.current_state_id = State.state_id WHERE (State.state_name = @current_state_name)">
                <SelectParameters>
                    <asp:Parameter DefaultValue="已确认" Name="current_state_name" />
                </SelectParameters></asp:SqlDataSource>
    </tr>
 </table>
    <asp:SqlDataSource ID="SqlDataSource2" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>" ></asp:SqlDataSource>
</div>


</asp:Content>

