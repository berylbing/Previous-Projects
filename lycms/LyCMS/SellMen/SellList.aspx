<%@ Page Title="" Language="C#" MasterPageFile="~/Frame/MainLeftSell.master" AutoEventWireup="true" CodeFile="SellList.aspx.cs" Inherits="SellMen_SellList" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="ajaxToolkit" %>
  
   
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
  <table width=98%>
  <tr>
    <td align="left">
    <table>
   <tr>
   <td>
       <asp:Label ID="Label1" runat="server" Text="您有"></asp:Label>
       <asp:Label ID="Label2" runat="server" Text="0"></asp:Label>
       <asp:Label ID="Label3" runat="server" Text="个退回订单；"></asp:Label>
       <asp:Label ID="Label4" runat="server" Text="0"></asp:Label>
       <asp:Label ID="Label5" runat="server" Text="个出库订单等待处理；"></asp:Label>
       <asp:Label ID="Label6" runat="server" Text="还有"></asp:Label>
       <asp:Label ID="Label7" runat="server" Text="0"></asp:Label>
       <asp:Label ID="Label8" runat="server" Text="个已确认订单"></asp:Label>
       <asp:Button ID="Button1" runat="server" Text="知道了" onclick="Button1_Click" />
       &nbsp;</td>   
   </tr>
    
    </table>
    
    </td>
    </tr>
    <tr>
    <td>
    <asp:Label ID="Lbforderid" runat="server" Text="订单号："></asp:Label>
    <asp:TextBox ID="Tbforderid" runat="server"></asp:TextBox>
    <asp:Button ID="ButtonFind" runat="server" Text="查找" 
        onclick="ButtonFind_Click" />
        <asp:Button ID="newButton" runat="server" Text="新增订单" 
            onclick="newButton_Click" />
        </td>
    </tr>
   
<tr>
<td>
    <asp:GridView ID="GridView1" runat="server" AllowPaging="True" 
        AllowSorting="True" AutoGenerateColumns="False" DataKeyNames="orderform_id" 
        DataSourceID="SqlDataSource1" BackColor="White"   
        ShowFooter=True Font-Size=Small
        Font-Names="Verdana" GridLines=Horizontal  BorderStyle=None 
        onrowcommand="GridView1_RowCommand" onrowdatabound="GridView1_RowDataBound" 
        onrowdeleted="GridView1_RowDeleted" onrowdeleting="GridView1_RowDeleting" 
        onrowupdating="GridView1_RowUpdating" style="width:100%"
        onrowediting="GridView1_RowEditing" BorderColor="#E7E7FF" 
        BorderWidth="1px" CellPadding="3" PageSize="8" 
       >
        <RowStyle BackColor="#E7E7FF" ForeColor="#4A3C8C" />
        <AlternatingRowStyle BackColor="#F7F7F7" />
        <PagerStyle BackColor="#E7E7FF" ForeColor="#4A3C8C" HorizontalAlign="Right" />
        <SelectedRowStyle BackColor="#738A9C" Font-Bold="True" ForeColor="#F7F7F7" />
        <HeaderStyle BackColor="#4A3C8C" ForeColor="#F7F7F7" Font-Bold="True"/>
        <FooterStyle BackColor="#B5C7DE" ForeColor="#4A3C8C" />
        <Columns>
            <asp:TemplateField >
            <ItemTemplate>
                <a href="javascript:expandcollapse('div<%# Eval("orderform_id") %>', 'one');">
                <img id="imgdiv<%# Eval("orderform_id") %>" alt="Click to show/hide Product for Order_Form <%# Eval("orderform_id") %>"   border="0" src= "../Image/Menu/tree_plus.gif"/>
                </a>
            </ItemTemplate>
            </asp:TemplateField>
            <asp:TemplateField  HeaderText="订单号" SortExpression="orderform_id">
                <ItemTemplate>
                    <asp:Label ID="Label1" runat="server" Text='<%#Eval("orderform_id") %>'></asp:Label>
                    
                </ItemTemplate>
                <%--<EditItemTemplate>
                    <asp:TextBox ID="Tborderid"  Text = '<%#Eval("orderform_id") %>' runat="server"></asp:TextBox>
                </EditItemTemplate>--%>
                
            </asp:TemplateField>
            <asp:TemplateField HeaderText="订单日期" SortExpression="order_date">
               <ItemTemplate>
                    <%#Eval("order_date") %>
                </ItemTemplate>
                <EditItemTemplate>
                   
                     <asp:TextBox ID="Tborderdate" Text = '<%#Eval("order_date") %>' runat="server"> </asp:TextBox>
                     
                </EditItemTemplate>
                
            </asp:TemplateField>
            <asp:TemplateField HeaderText="客户名" SortExpression="client_name">
                <ItemTemplate>
                    <%#Eval("client_name") %>
                </ItemTemplate>
                <EditItemTemplate>
                    <asp:DropDownList ID="Tbclientname" runat="server" datasourceid="SqlDataSource5" 
                      DataTextField="client_name" DataValueField="client_id">
                      </asp:DropDownList>
                      <asp:SqlDataSource ID="SqlDataSource5" runat="server" 
                      ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>" 
                      
                           SelectCommand="SELECT client_id, client_name, staff_id FROM Client WHERE (staff_id = @staff_id)">
                          <SelectParameters>
                              <asp:SessionParameter DefaultValue="null" Name="staff_id" 
                                  SessionField="StaffId" />
                          </SelectParameters>
                      </asp:SqlDataSource>
                </EditItemTemplate>
                
            </asp:TemplateField>
            <asp:TemplateField HeaderText="订单状态" SortExpression="state_name">
                <ItemTemplate>
                    <%#Eval("state_name")%>
                </ItemTemplate>
               <%-- <EditItemTemplate>
                    <asp:TextBox ID="Tbcurrentstate"  Text = '<%#Eval("state_name")%>' runat="server"></asp:TextBox>
                </EditItemTemplate>--%>
               
            </asp:TemplateField>

            <asp:CommandField HeaderText="Edit" 
                ShowEditButton="True" />
            
            
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
                                BorderStyle=Double BorderColor="#0083C1" ShowFooter="True" >
                                <RowStyle BackColor="Gainsboro" />
                                <AlternatingRowStyle BackColor="White" />
                                <HeaderStyle BackColor="#0083C1" ForeColor="White"/>
                                <FooterStyle BackColor="White" />
                                <Columns>
                                            <asp:TemplateField HeaderText="产品订单id"  SortExpression="orderformproduct_id" Visible="False">
                                          <ItemStyle Width="100px" />
                                                <ItemTemplate>
                                                    <asp:Label ID="lborderProductID" Text='<%# Eval("orderformproduct_id") %>' runat="server"></asp:Label>
                                                </ItemTemplate>
                                                
                                            </asp:TemplateField>
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
                                               
                                               
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="细分" SortExpression="product_type_2_name">
                                             <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_type_2_name")%></ItemTemplate>
                                                
                                               
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="分类" SortExpression="product_type_3_name">
                                             <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_type_3_name")%></ItemTemplate>
                                                
                                                
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="规格" SortExpression="product_standars">
                                             <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("product_standars")%></ItemTemplate>
                                               
                                                
                                            </asp:TemplateField>
                                            <asp:TemplateField HeaderText="数量" SortExpression="order_num">
                                             <ItemStyle Width="100px" />
                                                <ItemTemplate><%# Eval("order_num")%></ItemTemplate>
                                                <EditItemTemplate>
                                                    <asp:TextBox ID="txton" Text='<%# Eval("order_num")%>' runat="server"></asp:TextBox>
                                                </EditItemTemplate>
                                                
                                            </asp:TemplateField>
                                             <asp:TemplateField HeaderText="单位" SortExpression="product_unit">
                                                <ItemTemplate><%# Eval("product_unit")%></ItemTemplate>
                                               
                                                
                                            </asp:TemplateField>
                                            
			                                <asp:CommandField HeaderText="Edit" ShowEditButton="True" />
			                                <asp:TemplateField HeaderText="Delete">
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
    </td>
    </tr>
    <tr>
    <td>
    <asp:GridView ID="GridView3" runat="server" AllowPaging="True" AllowSorting="True"
                AutoGenerateColumns="False" DataKeyNames="orderform_id" DataSourceID="SqlDataSource3"
                BackColor="White" ShowFooter="True" Font-Size="Small" Font-Names="Verdana"
                GridLines="Horizontal" BorderStyle="None" 
                OnRowCommand="GridView3_RowCommand"  OnRowDataBound="GridView3_RowDataBound"
                OnRowDeleted="GridView3_RowDeleted" OnRowDeleting="GridView3_RowDeleting" OnRowUpdating="GridView3_RowUpdating"
                Height="150px" PageSize="5" Width="90%" 
                BorderColor="#E7E7FF" BorderWidth="1px" CellPadding="3" 
               >
                <PagerStyle BackColor="#E7E7FF" ForeColor="#4A3C8C" HorizontalAlign="Right" />
                <SelectedRowStyle BackColor="#738A9C" Font-Bold="True" ForeColor="#F7F7F7" />
                <HeaderStyle BackColor="#4A3C8C" ForeColor="#F7F7F7" Font-Bold="True" />
                <FooterStyle BackColor="#B5C7DE" ForeColor="#4A3C8C" />
                <RowStyle BackColor="#E7E7FF" ForeColor="#4A3C8C" />
                <Columns>
                    <asp:TemplateField>
                        <ItemTemplate>
                            <a href="javascript:expandcollapse('div<%# Eval("orderform_id") %>', 'one');">
                                <img id="imgdiv<%# Eval("orderform_id") %>" alt="Click to show/hide Product for Order_Form <%# Eval("orderform_id") %>"
                                    border="0" src="../Image/Menu/tree_plus.gif" />
                            </a>
                        </ItemTemplate>
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="订单号" SortExpression="orderform_id">
                        <ItemTemplate>
                            <%#Eval("orderform_id") %>
                        </ItemTemplate>
                        <EditItemTemplate>
                            <asp:TextBox ID="Tborderid" Text='' runat="server"></asp:TextBox>
                        </EditItemTemplate>
                        
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="订单日期" SortExpression="order_date">
                        <ItemTemplate>
                            <%#Eval("order_date") %>
                        </ItemTemplate>
                        <EditItemTemplate>
                            <asp:TextBox ID="Tborderdate" Text='' runat="server"></asp:TextBox>
                        </EditItemTemplate>
                      
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="客户名" SortExpression="client_name">
                        <ItemTemplate>
                            <%#Eval("client_name") %>
                        </ItemTemplate>
                        <EditItemTemplate>
                            <asp:TextBox ID="Tbclientname" Text='' runat="server"></asp:TextBox>
                        </EditItemTemplate>
                      
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="订单状态" SortExpression="state_name">
                        <ItemTemplate>
                            <%#Eval("state_name")%>
                        </ItemTemplate>
                        <EditItemTemplate>
                            <asp:TextBox ID="Tbcurrentstate" Text='' runat="server"></asp:TextBox>
                        </EditItemTemplate>
                     
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="操作">
                        <ItemTemplate>
                            <asp:Button ID="btnover" runat="server" Text="发货" 
                                CommandArgument='<%# DataBinder.Eval(Container,"RowIndex") %>' 
                                CommandName="btnover" />
                        </ItemTemplate>
                        <HeaderStyle Width="15%" />
                    </asp:TemplateField>
                    <asp:TemplateField>
                        <ItemTemplate>
                            <tr>
                                <td colspan="100%">
                                    <div id="div<%# Eval("orderform_id") %>" style="display: none">
                                        <asp:GridView ID="GridView2" runat="server" AllowPaging="True" AllowSorting="True"
                                            AutoGenerateColumns="False" Font-Names="Verdana" BackColor="White" Width="100%"
                                            Font-Size="X-Small" OnPageIndexChanging="GridView2_PageIndexChanging" OnRowUpdating="GridView2_RowUpdating"
                                            OnRowCommand="GridView2_RowCommand" OnRowEditing="GridView2_RowEditing" GridLines="None"
                                            OnRowUpdated="GridView2_RowUpdated" OnRowCancelingEdit="GridView2_CancelingEdit"
                                            OnRowDataBound="GridView2_RowDataBound" OnRowDeleting="GridView2_RowDeleting"
                                            OnRowDeleted="GridView2_RowDeleted" OnSorting="GridView2_Sorting" BorderStyle="Double"
                                            BorderColor="#0083C1">
                                            <RowStyle BackColor="Gainsboro" />
                                            <AlternatingRowStyle BackColor="White" />
                                            <HeaderStyle BackColor="#0083C1" ForeColor="White" />
                                            <FooterStyle BackColor="White" />
                                            <Columns>
                                                <asp:TemplateField HeaderText="产品id" SortExpression="product_id">
                                                    <ItemTemplate>
                                                        <asp:Label ID="lbProductID" Text='<%# Eval("product_id") %>' runat="server"></asp:Label>
                                                    </ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:Label ID="lblProductID" Text='<%# Eval("product_id") %>' runat="server"></asp:Label>
                                                    </EditItemTemplate>
                                                </asp:TemplateField>
                                                <asp:TemplateField HeaderText="总分" SortExpression="product_type_1_name">
                                                    <ItemTemplate>
                                                        <%# Eval("product_type_1_name")%></ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:TextBox ID="txtpt1" Text='<%# Eval("product_type_1_name")%>' runat="server"></asp:TextBox>
                                                    </EditItemTemplate>
                                                    
                                                </asp:TemplateField>
                                                <asp:TemplateField HeaderText="细分" SortExpression="product_type_2_name">
                                                    <ItemTemplate>
                                                        <%# Eval("product_type_2_name")%></ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:TextBox ID="txtpt2" Text='<%# Eval("product_type_2_name")%>' runat="server"></asp:TextBox>
                                                    </EditItemTemplate>
                                                
                                                </asp:TemplateField>
                                                <asp:TemplateField HeaderText="分类" SortExpression="product_type_3_name">
                                                    <ItemTemplate>
                                                        <%# Eval("product_type_3_name")%></ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:TextBox ID="txtpt3" Text='<%# Eval("product_type_3_name")%>' runat="server"></asp:TextBox>
                                                    </EditItemTemplate>
                                                    
                                                </asp:TemplateField>
                                                <asp:TemplateField HeaderText="规格" SortExpression="product_standars">
                                                    <ItemTemplate>
                                                        <%# Eval("product_standars")%></ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:TextBox ID="txtps" Text='<%# Eval("product_standars")%>' runat="server"></asp:TextBox>
                                                    </EditItemTemplate>
                                                    
                                                </asp:TemplateField>
                                                <asp:TemplateField HeaderText="数量" SortExpression="order_num">
                                                    <ItemTemplate>
                                                        <%# Eval("order_num")%></ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:TextBox ID="txton" Text='<%# Eval("order_num")%>' runat="server"></asp:TextBox>
                                                    </EditItemTemplate>
                                                   
                                                </asp:TemplateField>
                                                <asp:TemplateField HeaderText="单位" SortExpression="product_unit">
                                                    <ItemTemplate>
                                                        <%# Eval("product_unit")%></ItemTemplate>
                                                    <EditItemTemplate>
                                                        <asp:TextBox ID="txtpu" Text='<%# Eval("product_unit")%>' runat="server"></asp:TextBox>
                                                    </EditItemTemplate>
                                                    
                                                </asp:TemplateField>
                                                <asp:CommandField HeaderText="Edit" ShowEditButton="True" />
                                                <asp:TemplateField HeaderText="Delete">
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
                <AlternatingRowStyle BackColor="#F7F7F7" />
            </asp:GridView>
    </td>
    </tr>
</table>
<table>
    <tr>
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" 
        ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>" 
        
      
            
            SelectCommand="SELECT Order_Form.priority, Client.client_name, Client.client_tel, Client.client_manager_name, Order_Form.orderform_id, Order_Form.order_date, State.state_name, Staff.staff_name, Staff.staff_id, State.state_id FROM Client INNER JOIN Order_Form ON Client.client_id = Order_Form.client_id INNER JOIN Staff ON Client.staff_id = Staff.staff_id INNER JOIN State ON Order_Form.current_state_id = State.state_id WHERE (Staff.staff_id = @staff_id) AND (State.state_id = @state_id)">
                <SelectParameters>
                    <asp:SessionParameter DefaultValue="null" Name="staff_id" 
                        SessionField="StaffId" />
                    <asp:Parameter DefaultValue="1" Name="state_id" />
                </SelectParameters></asp:SqlDataSource>
                <asp:SqlDataSource ID="SqlDataSource3" runat="server" 
        ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>" 
        
      
            
            SelectCommand="SELECT Order_Form.priority, Client.client_name, Client.client_tel, Client.client_manager_name, Order_Form.orderform_id, Order_Form.order_date, State.state_name, Staff.staff_name, Staff.staff_id, State.state_id FROM Client INNER JOIN Order_Form ON Client.client_id = Order_Form.client_id INNER JOIN Staff ON Client.staff_id = Staff.staff_id INNER JOIN State ON Order_Form.current_state_id = State.state_id WHERE (Staff.staff_id = @staff_id) AND (State.state_id = @state_id)">
                <SelectParameters>
                    <asp:SessionParameter DefaultValue="null" Name="staff_id" 
                        SessionField="StaffId" />
                    <asp:Parameter DefaultValue="7" Name="state_id" />
                </SelectParameters></asp:SqlDataSource>
                <asp:SqlDataSource ID="SqlDataSource2" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>" ></asp:SqlDataSource>
    </tr>
 </table>
    </div>
   
   

            </asp:Content>

