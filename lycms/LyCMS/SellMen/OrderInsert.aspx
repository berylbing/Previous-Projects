<%@ Page Title="" Language="C#" MasterPageFile="~/Frame/MainLeftSell.master" AutoEventWireup="true" CodeFile="OrderInsert.aspx.cs" Inherits="SellMen_OrderInsert" %>

<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="ajaxToolkit" %>




<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder2" Runat="Server">
    
  
    <div id="container">
		
	
    <ajaxToolkit:ToolkitScriptManager runat="Server" EnableScriptGlobalization="true"
        EnableScriptLocalization="true" ID="ScriptManager1" />
     <div class="right_content" cellpadding="0" cellspacing="0" style="height: 480px;
        width: 815px; background-color: #F0F0F0;">
        
        <table width="98%" border="0" cellpadding="0" cellspacing="0" class="text008">
       
        <tr>
         <td>
           <table width="98%">
           <tr>
           <td align="center" height="35">
           
               增加新订单
           </td>
           </tr>
           </table>
           </td>
           </tr>
           
             <tr>
              <td>
                <table>   
               
                 <tr>
				   	<td height="35px" align="right" style="width:50px">订单号:</td>
					<td align="left" style="width: 130px">
					   <asp:TextBox ID="OrderNum" runat="server"></asp:TextBox>
					</td>
				   <td height="35px" align="right" style="width:50px">客户单位</td>
				   <td align="left"  style="width: 130px" >
					<asp:DropDownList ID="ClientName" runat="server" Width="130px" datasourceid="SqlDataSource5" 
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
                   </td>
          
                    <td height="35px" align="right" style="width:100px">订单录入日期:</td>
					<td align="left" style="width: 130px">
                      <asp:TextBox ID="OrderDate" runat="server"> </asp:TextBox>
                      <ajaxToolkit:CalendarExtender Enabled="True" TargetControlID="OrderDate" Animated="False" 
                        Format="yyyy-MM-dd" ID="CalendarExtender1" runat="server"></ajaxToolkit:CalendarExtender>
                    </td>
                    </tr>
                     </table>
                  </td>
                  </tr>
                  
                  <tr>
                  <td>
                  <table>
                    <tr>           
                    <td align="center" style="width: 130px">
                     <asp:Button ID="saveorder" runat="server" Text="保存" onclick="saveorder_Click" />
                    <td style="width: 84px">
                    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                    <ContentTemplate> 
                    </td>
                    
                  
                    </tr>
                  </table>
                  </td>
                  </tr>
                 
				<tr>
				<td>
				<table width="98%" style="margin-top:30px">
                
                <tr>  
                <td height="35px" align="right" style="width:50px">
                    分类
                </td>
                
               <td align="left" style="width: 130px">
                    <asp:DropDownList ID="ddlProType1" runat="server" AutoPostBack="True" DataSourceID="SqlDataSource1"
                        DataTextField="product_type_1_name" DataValueField="product_type_1_id" OnSelectedIndexChanged="ddlProType1_SelectedIndexChanged"
                        AppendDataBoundItems="True">
                    </asp:DropDownList>
                </td>
                <td height="35px" align="right" style="width:50px">
                    产品名称
                </td>
                      <td align="left" style="width: 130px">
                            <fieldset>
                                <asp:DropDownList ID="ddlProType2" runat="server" DataSourceID="SqlDataSource2" DataTextField="product_type_2_name"
                                    DataValueField="product_type_2_id" AutoPostBack="True" OnSelectedIndexChanged="ddlProType2_SelectedIndexChanged">
                                </asp:DropDownList>
                            </fieldset>
                        </td>
                        <td height="35px" align="right" style="width:50px">
                            明细
                        </td>
                       <td align="left" style="width: 130px">
                            <fieldset>
                                <asp:DropDownList ID="ddlProType3" runat="server" DataSourceID="SqlDataSource3" DataTextField="product_type_3_name"
                                    DataValueField="product_type_3_id" AutoPostBack="True" OnSelectedIndexChanged="ddlProType3_SelectedIndexChanged">
                                </asp:DropDownList>
                            </fieldset>
                        </td>
                        </tr>
                        <tr>
                             <td height="35px" align="right" style="width:50px">
                                产品规格
                            </td>
                           <td align="left" style="width: 130px">
                                <fieldset>
                                    <asp:DropDownList ID="ddlProduct" runat="server" DataSourceID="SqlDataSource4"
                                        DataTextField="product_standars" DataValueField="product_id">
                                    </asp:DropDownList>
                                </fieldset>
                            </td>
                            <td height="35px" align="right" style="width:50px">
                                        产品数量
                              </td>
                           <td align="left" style="width: 130px">
                                <asp:TextBox ID="product_num" runat="server"></asp:TextBox></td>
                            <td>
                                <asp:TextBox ID="Product_unit" runat="server" Text="" DataSourceID="SqlDataSource6"
                                        DataTextField="product_unit" DataValueField="product_id"></asp:TextBox>
                            </td>
                            </tr>
                            </table>
                            </td>
                            </tr>
                            
                            <tr>
                            <td>
                            <table width="98%">
                            <tr>
                            <td align="center">
                            
                                  <asp:Button ID="addProduct" runat="server" Text="增加产品" 
                     onclick="addProduct_Click" />  
                            
                            </td>
                           </tr>
                           </table>
                           </td>
                           </tr>
                           
                    </ContentTemplate>
                </asp:UpdatePanel>
               
            
              </table>
			<div>
            
                <asp:GridView ID="GridView1" runat="server" DataSourceID="product" 
                    AutoGenerateColumns="False" AllowPaging="True" AllowSorting="True" 
                    onrowdeleting="GridView1_RowDeleting" DataKeyNames="orderformproduct_id">
                    <Columns>
                        <asp:BoundField DataField="orderform_id" HeaderText="订单号" 
                            SortExpression="orderform_id" />
                        <asp:BoundField DataField="order_num" HeaderText="数量" 
                            SortExpression="order_num" />
                        <asp:BoundField DataField="product_standars" HeaderText="产品规格" 
                            SortExpression="product_type_1_name" />
                        <asp:BoundField DataField="product_name" HeaderText="产品名称" 
                            SortExpression="product_name" />
                        <asp:BoundField DataField="product_unit" HeaderText="单位" 
                            SortExpression="product_unit" />
                        <asp:BoundField DataField="product_type_1_name" HeaderText="产品总分" 
                            SortExpression="product_type_1_name" />
                        <asp:BoundField DataField="product_type_2_name" HeaderText="产品分类" 
                            SortExpression="product_type_2_name" />
                        <asp:BoundField DataField="product_type_3_name" HeaderText="明细" 
                            SortExpression="product_type_3_name" />
                        <asp:CommandField ShowDeleteButton="True" ShowCancelButton="False" />
                    </Columns>
                   
                </asp:GridView>
                <asp:Button ID="saveorder2" runat="server" Text="确认订单" 
                    onclick="saveorder2_Click" />
                <asp:Button ID="deletedoder" runat="server" Text="取消订单" 
                    onclick="deletedoder_Click" />
                <asp:SqlDataSource ID="product" runat="server" 
                    ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>"   
                    
                    SelectCommand="SELECT Order_Form_Product.order_num, Product.product_standars, Product.product_name, Product.product_unit, Product_Type_1.product_type_1_name, Product_Type_2.product_type_2_name, Product_Type_3.product_type_3_name, Order_Form_Product.orderform_id, Order_Form_Product.orderformproduct_id FROM Product_Type_2 INNER JOIN Product_Type_1 ON Product_Type_2.product_type_id = Product_Type_1.product_type_1_id INNER JOIN Product_Type_3 ON Product_Type_2.product_type_2_id = Product_Type_3.product_type_id INNER JOIN Order_Form_Product INNER JOIN Product ON Order_Form_Product.product_id = Product.product_id ON Product_Type_3.product_type_3_id = Product.product_type_id WHERE (Order_Form_Product.orderform_id = @orderform_id)" 
                    ondeleting="product_Deleting">
                    <SelectParameters>
                        <asp:SessionParameter DefaultValue="null" Name="orderform_id" 
                            SessionField="orderid" />
                    </SelectParameters>
                </asp:SqlDataSource>
            </div>
       
            
            
 

		</div>
	
	</div>
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
                
            </tr>
        </table>

</asp:Content>

