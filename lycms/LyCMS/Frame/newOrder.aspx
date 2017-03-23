<%@ Page Language="VB" ContentType="text/html" ResponseEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<script runat="server">

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs)

    End Sub

    Protected Sub DropDownList1_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs)

    End Sub
</script>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>新订单录入</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<title>CSS and tables for forms</title>
	<link rel="stylesheet" type="text/css" href="../CSS/l3-body.css" />
	<link rel="stylesheet" type="text/css" href="../CSS/tInput.css" />
    <style type="text/css">
        .style1
        {
            height: 24px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
<div id="container">
		<div id="header">
			<h1>&#26032;&#35746;&#21333;&#24405;&#20837;</h1> 
			<p>&#38144;&#21806;&#20154;&#21592;&#22312;&#27492;&#39029;&#23545;&#26032;&#30340;&#35746;&#21333;&#36827;&#34892;&#35760;&#20837;</p>
		</div>

		<div id="content">
			<h2>NOTICE</h2>
			<p>&#26412;&#39029;&#20013;&#20449;&#24687;&#24182;&#38750;&#26368;&#32456;&#29256;&#26412;&#65292;&#35746;&#21333;&#20449;&#24687;&#23558;&#36827;&#34892;&#36827;&#19968;&#27493;&#26680;&#23454;&#25805;&#20316;</p>

			<table>
				<tr>
					<th>&#35746;&#21333;&#24207;&#21495;:</th>
					<td colspan="3"><input type="text" /></td>
				</tr>
				<tr class="required">
					<th>&#23458;&#25143;&#21333;&#20301;:</th>
					<td colspan="3"class="input-group required" style="height: 24px"> 
                        <asp:DropDownList ID="DropDownList1" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">荣达企业</asp:ListItem>
                            <asp:ListItem>广萨</asp:ListItem>
                            <asp:ListItem>蔡氏企业</asp:ListItem>
                        </asp:DropDownList>  
                     &nbsp;&nbsp;&nbsp;&nbsp;  
                        <asp:Button ID="Button1" runat="server" Text="新客户添加" Width="95px" />
                     </td>
				</tr>
				<tr>
					<th class="style1">订单录入日期:</th>
					<td colspan="3" class="input-group required" style="height: 24px">
						&nbsp;
                        <asp:DropDownList ID="DropDownList2" runat="server">
                            <asp:ListItem Selected="True">2010</asp:ListItem>
                            <asp:ListItem>2011</asp:ListItem>
                            <asp:ListItem>2012</asp:ListItem>
                            <asp:ListItem>2013</asp:ListItem>
                            <asp:ListItem>2014</asp:ListItem>
                            <asp:ListItem>2015</asp:ListItem>
                            <asp:ListItem>2016</asp:ListItem>
                        </asp:DropDownList>
						&nbsp;&nbsp; 年  &nbsp;&nbsp;&nbsp;&nbsp;
						
						<asp:DropDownList ID="DropDownList3" runat="server">
                            <asp:ListItem Selected="True">2010</asp:ListItem>
                            <asp:ListItem>1</asp:ListItem>
                            <asp:ListItem>2</asp:ListItem>
                            <asp:ListItem>3</asp:ListItem>
                            <asp:ListItem>4</asp:ListItem>
                            <asp:ListItem>5</asp:ListItem>
                            <asp:ListItem>6</asp:ListItem>
                            <asp:ListItem>7</asp:ListItem>
                            <asp:ListItem>8</asp:ListItem>
                            <asp:ListItem>9</asp:ListItem>
                            <asp:ListItem>10</asp:ListItem>
                            <asp:ListItem>11</asp:ListItem>
                            <asp:ListItem>12</asp:ListItem>
                        </asp:DropDownList>
						&nbsp;&nbsp; 月&nbsp;&nbsp; &nbsp;&nbsp; 
						
						
						<asp:DropDownList ID="DropDownList4" runat="server">
                            <asp:ListItem Selected="True">2010</asp:ListItem>
                            <asp:ListItem>1</asp:ListItem>
                            <asp:ListItem>2</asp:ListItem>
                            <asp:ListItem>3</asp:ListItem>
                            <asp:ListItem>4</asp:ListItem>
                            <asp:ListItem>5</asp:ListItem>
                            <asp:ListItem>6</asp:ListItem>
                            <asp:ListItem>7</asp:ListItem>
                            <asp:ListItem>8</asp:ListItem>
                            <asp:ListItem>9</asp:ListItem>
                            <asp:ListItem>10</asp:ListItem>
                            <asp:ListItem>11</asp:ListItem>
                            <asp:ListItem>12</asp:ListItem>
                             <asp:ListItem>13</asp:ListItem>
                            <asp:ListItem>14</asp:ListItem>
                            <asp:ListItem>15</asp:ListItem>
                            <asp:ListItem>16</asp:ListItem>
                           
                            <asp:ListItem>17</asp:ListItem>
                            <asp:ListItem>18</asp:ListItem>
                            <asp:ListItem>19</asp:ListItem>
                            <asp:ListItem>20</asp:ListItem>
                            <asp:ListItem>21</asp:ListItem>
                            <asp:ListItem>22</asp:ListItem>
                             <asp:ListItem>23</asp:ListItem>
                            <asp:ListItem>24</asp:ListItem>
                            <asp:ListItem>25</asp:ListItem>
                            <asp:ListItem>26</asp:ListItem>
                            <asp:ListItem>27</asp:ListItem>
                            <asp:ListItem>28</asp:ListItem>
                            <asp:ListItem>29</asp:ListItem>
                            <asp:ListItem>30</asp:ListItem>
                            <asp:ListItem>31</asp:ListItem>
                        </asp:DropDownList>
						&nbsp;&nbsp; 日
						
						</td>
				</tr>
				<tr class="required">
					<th>产品1:</th>
					<td colspan="3"class="input-group required" style="height: 24px"> 
                        <asp:DropDownList ID="DropDownList5" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">汽车漆</asp:ListItem>
                            <asp:ListItem>汽车胶</asp:ListItem>
                            <asp:ListItem>汽车玻璃</asp:ListItem>
                        </asp:DropDownList>  
                     产品1数量：
                        <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
                       
                     </td>
				</tr>
					
					
				<tr class="required">
					<th>产品2:</th>
					<td colspan="3"class="input-group required" style="height: 24px"> 
                        <asp:DropDownList ID="DropDownList6" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">汽车漆</asp:ListItem>
                            <asp:ListItem>汽车胶</asp:ListItem>
                            <asp:ListItem>汽车玻璃</asp:ListItem>
                        </asp:DropDownList>  
                     产品2数量：
                        <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
                     </td>
				</tr>
					
					
					<tr class="required">
					<th>产品3:</th>
					<td colspan="3" class="input-group required" style="height: 24px">
                        <asp:DropDownList ID="DropDownList7" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">汽车漆</asp:ListItem>
                            <asp:ListItem>汽车胶</asp:ListItem>
                            <asp:ListItem>汽车玻璃</asp:ListItem>
                        </asp:DropDownList>  
                     产品3数量：
                        <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox> 
                    </td>
				</tr>
				
				<tr class="required">
					<th>产品4:</th>
					<td colspan="3" class="input-group required" style="height: 24px">
                        <asp:DropDownList ID="DropDownList8" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">汽车漆</asp:ListItem>
                            <asp:ListItem>汽车胶</asp:ListItem>
                            <asp:ListItem>汽车玻璃</asp:ListItem>
                        </asp:DropDownList>  
                     产品4数量：
                        <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox> 
                    </td>
				</tr>
				
				
				<tr>
					<th class="style1">客户要求提货日期:</th>
					<td colspan="3" class="input-group required" style="height: 24px">
						&nbsp;
                        <asp:DropDownList ID="DropDownList9" runat="server">
                            <asp:ListItem Selected="True">2010</asp:ListItem>
                            <asp:ListItem>2011</asp:ListItem>
                            <asp:ListItem>2012</asp:ListItem>
                            <asp:ListItem>2013</asp:ListItem>
                            <asp:ListItem>2014</asp:ListItem>
                            <asp:ListItem>2015</asp:ListItem>
                            <asp:ListItem>2016</asp:ListItem>
                        </asp:DropDownList>
						&nbsp;&nbsp; 年  &nbsp;&nbsp;&nbsp;&nbsp;
						
						<asp:DropDownList ID="DropDownList10" runat="server">
                            <asp:ListItem Selected="True">2010</asp:ListItem>
                            <asp:ListItem>1</asp:ListItem>
                            <asp:ListItem>2</asp:ListItem>
                            <asp:ListItem>3</asp:ListItem>
                            <asp:ListItem>4</asp:ListItem>
                            <asp:ListItem>5</asp:ListItem>
                            <asp:ListItem>6</asp:ListItem>
                            <asp:ListItem>7</asp:ListItem>
                            <asp:ListItem>8</asp:ListItem>
                            <asp:ListItem>9</asp:ListItem>
                            <asp:ListItem>10</asp:ListItem>
                            <asp:ListItem>11</asp:ListItem>
                            <asp:ListItem>12</asp:ListItem>
                        </asp:DropDownList>
						&nbsp;&nbsp; 月&nbsp;&nbsp; &nbsp;&nbsp; 
						
						
						<asp:DropDownList ID="DropDownList11" runat="server">
                            <asp:ListItem Selected="True">2010</asp:ListItem>
                            <asp:ListItem>1</asp:ListItem>
                            <asp:ListItem>2</asp:ListItem>
                            <asp:ListItem>3</asp:ListItem>
                            <asp:ListItem>4</asp:ListItem>
                            <asp:ListItem>5</asp:ListItem>
                            <asp:ListItem>6</asp:ListItem>
                            <asp:ListItem>7</asp:ListItem>
                            <asp:ListItem>8</asp:ListItem>
                            <asp:ListItem>9</asp:ListItem>
                            <asp:ListItem>10</asp:ListItem>
                            <asp:ListItem>11</asp:ListItem>
                            <asp:ListItem>12</asp:ListItem>
                             <asp:ListItem>13</asp:ListItem>
                            <asp:ListItem>14</asp:ListItem>
                            <asp:ListItem>15</asp:ListItem>
                            <asp:ListItem>16</asp:ListItem>
                           
                            <asp:ListItem>17</asp:ListItem>
                            <asp:ListItem>18</asp:ListItem>
                            <asp:ListItem>19</asp:ListItem>
                            <asp:ListItem>20</asp:ListItem>
                            <asp:ListItem>21</asp:ListItem>
                            <asp:ListItem>22</asp:ListItem>
                             <asp:ListItem>23</asp:ListItem>
                            <asp:ListItem>24</asp:ListItem>
                            <asp:ListItem>25</asp:ListItem>
                            <asp:ListItem>26</asp:ListItem>
                            <asp:ListItem>27</asp:ListItem>
                            <asp:ListItem>28</asp:ListItem>
                            <asp:ListItem>29</asp:ListItem>
                            <asp:ListItem>30</asp:ListItem>
                            <asp:ListItem>31</asp:ListItem>
                        </asp:DropDownList>
						&nbsp;&nbsp; 日
						
						</td>
				</tr>
				
				
				
				<tr class="required">
					<th>型号:</th>
					<td colspan="3" class="input-group required" style="height: 24px">
                        <asp:DropDownList ID="DropDownList12" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">FX-28563</asp:ListItem>
                            <asp:ListItem>FX-28636</asp:ListItem>
                            <asp:ListItem>FX-28273</asp:ListItem>
                        </asp:DropDownList>  
                     
                    </td>
				</tr>
					
					<tr class="required">
					<th>规格:</th>
					<td colspan="3" class="input-group required" style="height: 24px">
                        <asp:DropDownList ID="DropDownList13" runat="server" 
                            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Width="120px">
                            <asp:ListItem Selected="True">瓶</asp:ListItem>
                            <asp:ListItem>箱</asp:ListItem>
                            <asp:ListItem>灌</asp:ListItem>
                        </asp:DropDownList>  
                     
                    </td>
				</tr>
					
					
				
				<tr class="required">
					<th>主管:</th>
					<td><input type="text" /></td>
					<th>销售员工号:</th>
					<td><input type="text" /></td>
				</tr>
				
				<tr>
					<th>备注:</th>
					<td colspan="3"><input type="text" /></td>
				</tr>
			</table>

			<p>
				&nbsp;当您再次确定订单信息录入无误，请上交订单&nbsp;  <a href="submit">上交订单</a>.
			</p>
			<p>
				<i>公司机密</i>
			</p>

		</div>
	
	</div>

    </form>

</body>
</html>
