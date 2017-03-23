<%@ Page Language="C#" MasterPageFile="~/Frame/MainLeftExecutant.master" AutoEventWireup="true" CodeFile="InsertStaff.aspx.cs" Inherits="Executant_InsertStaff" Title="新增人员" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder2" Runat="Server">

    <div class="bg_color" style="height:500px;width:815px;">
       <table>
          <tr align="center" style=" height:50px">
           <td>
           </td>
           <td align="center" style=" font-size:20px">
             添加员工页面
           </td>
         </tr>
        </table>
        
        <table width="98%"  border="0" cellpadding="0" cellspacing="0" class="text008" >
        
         <tr align="center" >
          <td height="50" align="right" style="font-size:15px; width: 130px;">添加真实姓名</td>
          
          <td align="left">
              <asp:TextBox ID="TextRealName" runat="server" CssClass="inp001" BorderColor="#7197F0" Font-Size="15px" Height="20px" Width="150px"></asp:TextBox>
                                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" 
                  runat="server" ControlToValidate="TextRealName" ErrorMessage="输入真实的姓名"></asp:RequiredFieldValidator>
           </td>
        </tr>
        
        
        <tr align="center">
          <td height="50" align="right" style="font-size:15px; width: 130px;">添加用户名</td>

          <td align="left">
              <asp:TextBox ID="TextUserName" runat="server" CssClass="inp001" BorderColor="#7197F0" Font-Size="15px" Height="20px" Width="150px" ></asp:TextBox>
                                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" 
                  runat="server" ControlToValidate="TextUserName" ErrorMessage="请输入用户名"></asp:RequiredFieldValidator>
                                </td>
        </tr>
        
        
        <tr align="center" >
          <td height="50" align="right" style="font-size:15px; width: 130px;">输入密码</td>
          <td align="left">
              <asp:TextBox ID="TextPassWord" runat="server" CssClass="inp001" 
                  TextMode="Password" BorderColor="#7197F0" Font-Size="15px" Height="20px" Width="150px" ></asp:TextBox>
                                <asp:Label ID="Label2" runat="server" 
                  Text="（大于6小于20个字符，必须包含一个特殊字符和至少一个数字）" Font-Size="12px"></asp:Label>
              <asp:RegularExpressionValidator ID="RegularExpressionValidator2" runat="server" 
                  ControlToValidate="TextPassWord" ErrorMessage="密码格式错误" 
                  ValidationExpression="(?=^.{6,20}$)(?=(.*\d){1,})(?=(.*\W){1,}).*"></asp:RegularExpressionValidator>
                                </td>
        </tr>
        
        
          <tr align="center">
              <td height="50" align="right" style="font-size:15px; width: 130px;">
                  确认密码
              </td>
              <td align="left">
                  <asp:TextBox ID="TextConfirm" runat="server" CssClass="inp001" TextMode="Password" BorderColor="#7197F0" Font-Size="15px" Height="20px" Width="150px" ></asp:TextBox>
                  <asp:CompareValidator ID="CompareValidator1" runat="server" ControlToCompare="TextPassWord"
                      ControlToValidate="TextConfirm" ErrorMessage="密码错误！"></asp:CompareValidator>
              </td>

          </tr>
          
          
          
         <tr align="center">
              <td height="50" align="right" style="font-size:15px; width: 130px;">
                  进公司日期
              </td>
              <td align="left">
                  <asp:TextBox ID="TextDateIn" runat="server" BorderColor="#7197F0" Font-Size="15px" Height="20px" Width="150px" ></asp:TextBox>
                  
                  
          </tr>
          
          
        <tr align="center">
              <td height="50" align="right" style="font-size:17px; width: 130px;"> 
                  人员职位类型
              </td>
              <td align="left">
                  <asp:DropDownList ID="DropDownList1" runat="server" BorderColor="#7197F0" Height="25px" Font-Size="17px" Width="155px" >
                      <asp:ListItem>销售人员</asp:ListItem>
                      <asp:ListItem>仓库管理人员</asp:ListItem>
                      <asp:ListItem>订单执行人员</asp:ListItem>
                      <asp:ListItem>部门经理</asp:ListItem>
                  </asp:DropDownList>
              </td>

          </tr>
          
          
          </table>
    
    
    <table style="margin-top:50px; margin-right="100px;" >
         <asp:Image  ID="Image1" runat="server" ImageUrl="~/Image/Button/yes1.jpg"  OnClick="Button1_Click"/>
    
    </table>
    </div>

</asp:Content>

