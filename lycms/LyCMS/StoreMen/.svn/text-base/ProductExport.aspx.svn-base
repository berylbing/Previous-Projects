<%@ Page Title="" Language="C#" MasterPageFile="~/Frame/MainLeftStore.master" AutoEventWireup="true" CodeFile="ProductExport.aspx.cs" Inherits="StoreMen_ProductExport" %>
<%@ Register Assembly="AjaxControlToolkit" Namespace="AjaxControlToolkit" TagPrefix="ajaxToolkit" %>
<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder2" Runat="Server">
    <asp:ScriptManager ID="ScriptManager2" runat="server">
    </asp:ScriptManager>
    
    <style type="text/css">
      .textbox   
      {   
           background-color:   #f0f0f0;   
           border-color: #7197F0  #7197F0  #7197F0  #7197F0;
           border: 1px   solid  #7197F0;   
      }   

    </style>
    <div class="right_content" cellpadding="0" cellspacing="0" style="height: 480px;
        width: 815px; background-color: #F0F0F0;">
        <table width="98%" border="0" cellpadding="0" cellspacing="0" class="text008">
         <tr>
        <td>
        <table width="98%">
         <tr>
           <td height="35" align="center" style="font-size:20px;" >
                   出库管理
            </td>  
         </tr>
        </table>
        </td>
        </tr>
       
       
        <tr>
          <td>
            <table width="98%">
            <tr style="height:30px">
            
                <td align="right" style="width: 79px; font-size:15px;">
                    分类
                </td>
                
                <td align="left" style="width:80px">
                     <asp:TextBox ID="txtProType1" runat="server" BorderColor="#7197F0" Font-Size="15px" Enabled="false" ></asp:TextBox>
                </td>
                
                <td align="right" style="width: 79px; font-size:15px;">
                    产品名称
                </td>
                  <td align="left" style="width:80px">
                     <asp:TextBox ID="txtProType2" runat="server" BorderColor="#7197F0" Font-Size="15px"  Enabled="false" ></asp:TextBox>
                  </td>
                         <td align="right" style="width: 79px; font-size:15px;">
                            产品型号
                        </td>
                         <td align="left" style="width:80px">
                            <asp:TextBox ID="txtProType3" runat="server" BorderColor="#7197F0" Font-Size="15px" Enabled="false" ></asp:TextBox>
                         </td>
                          <td align="right" style="width: 79px; font-size:15px;">
                                产品规格
                            </td>
                         <td align="left" style="width:80px">
                            <asp:TextBox ID="txtSta" runat="server" BorderColor="#7197F0" Font-Size="15px" Enabled="false" ></asp:TextBox>
                         </td>  
                  
                </tr>
                </table>
                </td>
                </tr>  
               
                <tr>
                 <td>
                   <table width="98%">  
                   
                    <tr style="height:50px">
                       <td align="right" style="width: 79px; font-size:15px;">
                            客户
                       </td>
                       <td align="left" style="width:80px">
                          <asp:TextBox ID="txtClient" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px"  Enabled="false"></asp:TextBox>
                       </td>
                     <td align="right" style="width: 99px; font-size:15px;">
                    订单号</td>
                    <td align="left" style="width:80px">
                          <asp:TextBox ID="txtOrderFormid" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" Enabled="false" ></asp:TextBox>
                       </td>
                     <td align="right" style="width: 79px; font-size:15px;">
                        性质
                    </td>
                    <td align="left" style="width:80px">
                       <span style=" width:152px; height:20px;" class="textbox">
                         <span style="width:152px; margin:-1px;">
                         <asp:DropDownList ID="DropDownListproperty" runat="server" BorderColor="#7197F0" Width="120px" Font-Size="15px" Height="25px" >
                             <asp:ListItem Value="zhishu">直属</asp:ListItem>
                             <asp:ListItem Value="jingxiaoshang">经销商</asp:ListItem>
                         </asp:DropDownList>
                        </span>
                       </span>
                    </td>
                    
                    </td>
                    
                      <td align="right" style="width: 79px; font-size:15px;">
                        级别
                    </td>
                    
                     <td align="left" style="width:80px">
                        <span style=" width:152px; height:20px;" class="textbox">
                         <span style="width:152px; margin:-1px;">
                          <asp:DropDownList ID="DropDownListlevel" runat="server" BorderColor="#7197F0" Width="120px"  Font-Size="15px" Height="25px" >
                             <asp:ListItem Value="bumen">部门</asp:ListItem>
                             <asp:ListItem Value="gongsi">公司</asp:ListItem>
                          </asp:DropDownList>
                         </span>
                        </span>
                    </td>
                  </tr>
                  </table>
                 
                       <table width="98%">     
                     <tr style="height:50px">
                    
                 <td align="right" style="width: 79px; font-size:15px;">
                    数量</td>
                <td align="left" style="width:80px">
                    <asp:TextBox ID="txtamount" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" ></asp:TextBox>
                </td>
                
                <td align="right" style="width: 79px; font-size:15px;">
                    时间</td>
                <td align="left" style="width:80px">
                    <asp:TextBox ID="txtTime" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" ></asp:TextBox>
                </td>
                
                 <td align="right" style="width: 79px; font-size:15px;">
                            序号
                </td>
                <td align="left" style="width:80px">
                    <asp:TextBox ID="txtseries" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" ></asp:TextBox>
                </td>
               
            </tr>
                <tr style="height:50px">
                   <td align="right" style="width: 99px; font-size:15px;">
                        零部件号
                    </td>
                    <td align="left" style="width:80px">
                        <asp:TextBox ID="txtpartnum" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" ></asp:TextBox>
                    </td>
                    <td align="right" style="width: 79px; font-size:15px;">
                      区域  
                    </td>
                    <td align="left" style="width:80px">
                        <asp:TextBox ID="TextBox2" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" ></asp:TextBox>
                    </td>
                    
                     <td align="right" style="width: 79px; font-size:15px;">
                      备注  
                    </td>
                     <td align="left" style="width:80px">
                        <asp:TextBox ID="txtnote" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" ></asp:TextBox>
                    </td>
                    </tr>
                   
                    </table>
                    </td>
                    </tr>
                   
          
                    
                    <tr>
                    <td>
                    <table width="98%" style=" margin-top:30px;">
                    <tr>
                    
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
                     <asp:SqlDataSource ID="SqlDataSource5" runat="server" ConnectionString="<%$ ConnectionStrings:LYCMSConnectionString %>"
                        SelectCommand="SELECT [client_id], [client_name] FROM [Client]">
                    </asp:SqlDataSource>
                   
                </td>
               
            </tr>
        </table>
    </div>
</asp:Content>
