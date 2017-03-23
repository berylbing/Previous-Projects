<%@ Page Language="C#" MasterPageFile="~/Frame/MainLeftSell.master" AutoEventWireup="true" CodeFile="ClientInsert.aspx.cs" Inherits="SellMen_ClientInsert" Title="无标题页" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder2" Runat="Server">

    <div class="bg_color">
          <table width="98%"  border="0" cellpadding="0" cellspacing="0" class="text008">
          
          
        <tr align="center" >
          <td height="35" align="right">添加名称</td>
          <td align="left">
              <asp:TextBox ID="TextAddName" runat="server" CssClass="inp001"></asp:TextBox>
                                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" 
                  runat="server" ControlToValidate="TextAddName" ErrorMessage="请添加名称"></asp:RequiredFieldValidator>
                                </td>
        </tr>
        
        
        <tr align="center">
          <td height="35" align="right">所需产品</td>
          <td align="left">
              <asp:TextBox ID="TextProductName" runat="server" CssClass="inp001"></asp:TextBox>
                                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" 
                  runat="server" ControlToValidate="TextProductName" ErrorMessage="请添加产品"></asp:RequiredFieldValidator>
                                </td>
        </tr>
        
        
        <tr align="center" >
          <td height="35" align="right">联系方式</td>
          <td align="left">
              <asp:TextBox ID="phonenumber" runat="server" CssClass="inp001"></asp:TextBox>
                                
                                </td>
        </tr>
        
        
          <tr align="center">
              <td height="35" align="right">
                  联系人
              </td>
              <td align="left">
                  <asp:TextBox ID="contact" runat="server" CssClass="inp001"></asp:TextBox>
              </td>

          </tr>
          
          
          
         <tr align="center">
              <td height="35" align="right">
                  地址
              </td>
              <td align="left">
                  <asp:TextBox ID="address" runat="server"></asp:TextBox>
                  
                  
          </tr>
          
          
        <tr align="center">
              <td height="35" align="right">
                  管辖区域
              </td>
              <td align="left">
                  <asp:TextBox ID="TextRegion" runat="server" 
                      ontextchanged="TextBox2_TextChanged"></asp:TextBox>
                                                </td>

          </tr>
          
                   <tr align="center">
              <td height="35" align="right">
                  备注
              </td>
              <td align="left">
                  <asp:TextBox ID="TextExtra" runat="server" Height="69px" Width="129px"></asp:TextBox>
                  
                  
          </tr>
          
          
          </table>
    
    
    
    <asp:Button ID="Button1" runat="server" Text="确定" onclick="Button1_Click" />
    
    </div>

</asp:Content>

