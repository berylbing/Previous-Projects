using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace HMI_V1
{
    public partial class Form3 : Form//回放参数界面
    {
        private Form2 my_Form;
        private long Xburst;
        private long Xtime;
        

        public Form3(Form2 myForm)
        {
            InitializeComponent();
            this.my_Form = myForm ;
           
            for (int i = 0; i < my_Form.K1 - 1; i++)
            {
                if (my_Form.listView1.Items[i].SubItems[1].Text != "")
                {
                    comboBox1.Items.Add(my_Form.listView1.Items[i].SubItems[1].Text);
                }
            }

            if (my_Form.listView1.SelectedIndices.Count > 0)
            {
                
                comboBox1.Text = my_Form.listView1.SelectedItems[0].SubItems[1].Text;
                Xburst = long.Parse(my_Form.listView1.SelectedItems[0].SubItems[5].Text);
                DateTime endTime = DateTime.Parse(my_Form.listView1.SelectedItems[0].SubItems[3].Text.Remove(19));
                DateTime startTime = DateTime.Parse(my_Form.listView1.SelectedItems[0].SubItems[2].Text.Remove(19));
                TimeSpan midTime = endTime - startTime;
                Xtime = long.Parse(midTime.TotalSeconds.ToString());
            }
            
            textBox11.Text = "系统提示：   " + "该流量文件共有" + Xburst.ToString() + "个数据包; " + "回放总时长为" +Xtime.ToString() + "s；";

        }

        public string text
        {
            get { return this.textBox1.Text; }
            set { this.textBox1.Text = value; }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            my_Form.listView5.Visible = true;
            
            my_Form.listView5.Items.Clear();
            int procotol_type = 0;
            int burst = -1;
            int duration_time = -1;
            int mac_set_flag = -1;
            string src_mac = "";
            string dest_mac = "";
            bool tflag = true;
            if (comboBox1.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请选择回放文件", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (radioButton1.Checked && textBox1.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请设置数据包序号", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (textBox2.Text == String.Empty && radioButton2.Checked)
            {
                tflag = false;
                MessageBox.Show("请设置起始时间", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (radioButton3.Checked && textBox3.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请设置回放数据包数", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (radioButton4.Checked && textBox4.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请设置回放结束数据包序号", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (radioButton5.Checked && textBox5.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请设置回放结束时间", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (radioButton6.Checked && textBox6.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请设置回放持续时间", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }

            if (tflag)
            {
            //数据包数
            if (radioButton3.Checked)
            {
                burst = System.Convert.ToInt32(textBox3.Text);
            }
            //数据包序列号
            if (radioButton4.Checked)
            {
                burst = System.Convert.ToInt32(textBox4.Text) - System.Convert.ToInt32(textBox1.Text);
            }
            //结束时间
            if (radioButton5.Checked)
            {
                duration_time = System.Convert.ToInt32(textBox5.Text) - System.Convert.ToInt32(textBox2.Text);
            }
            //持续时间
            if (radioButton6.Checked)
            {
                duration_time = System.Convert.ToInt32(textBox6.Text);
            }

            if (checkBox6.Checked)
            {
                //目的MAC地址
                if (checkBox7.Checked)
                {
                    mac_set_flag = 3;
                    src_mac = textBox7.Text;
                    dest_mac = textBox8.Text;
                }
                else
                {
                    mac_set_flag = 1;
                    src_mac = textBox7.Text;
                }
            }
            else
            {
                if (checkBox7.Checked)
                {
                    mac_set_flag = 2;
                    dest_mac = textBox8.Text;
                }
                else
                {
                    mac_set_flag = 0;
                }
            }

            if (checkBox1.Checked)
            {
                procotol_type = procotol_type + 1;
            }
            if (checkBox2.Checked)
            {
                procotol_type = procotol_type + 2;
                
            }
            if (checkBox3.Checked)
            {
                procotol_type = procotol_type + 4;
            }
            if (checkBox4.Checked)
            {
                procotol_type = procotol_type + 8;
            }
            if (checkBox5.Checked || procotol_type > 7 || procotol_type == 0)
            {
                procotol_type = 255;
            }
            
            my_Form.opt = 5;

           

           

                string cmd = "REPLAY_START PROTOCOL_TYPE: 1, START_PACKET: -1, START_TIME: 1, END_TIME: 7, BURST: -1, DURATION_TIME: 6, REPLAY_SPEED_1: 0.7, REPLAY_SPEED_2: -1, REPLAY_TRAFFIC_NAME: rrppdd, MAC_SET_FLAG: 0, SRC_MAC: -1, DEST_MAC: -1\r\n";
                cmd = "REPLAY_START PROTOCOL_TYPE: " + procotol_type
                    + ", START_PACKET: " + textBox1.Text
                    + ", END_PACKET: " + textBox4.Text
                    + ", START_TIME: " + textBox2.Text
                    + ", END_TIME: " + textBox5.Text +
                    ", BURST: " + burst
                    + ", DURATION_TIME: " + duration_time
                    + ", REPLAY_SPEED_1: " + textBox9.Text
                    + ", REPLAY_SPEED_2: " + textBox10.Text
                    + ", MAC_SET_FLAG: " + mac_set_flag
                    + " SRC_MAC: " + src_mac
                    + ", DEST_MAC: " + dest_mac
                    + ", REPLAY_TRAFFIC_NAME: " + comboBox1.Text + "\r\n";
                my_Form.sendCmd(cmd);
                my_Form.mapmap();
            }
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            textBox1.Enabled = radioButton1.Checked;
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox2.Enabled = radioButton2.Checked;
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            textBox3.Enabled = radioButton3.Checked;
        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {
            textBox4.Enabled = radioButton4.Checked;
        }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {
            textBox5.Enabled = radioButton5.Checked;
        }

        private void radioButton6_CheckedChanged(object sender, EventArgs e)
        {
            textBox6.Enabled = radioButton6.Checked;
        }

        private void checkBox1_Click(object sender, EventArgs e)
        {
            checkBox5.Checked = checkBox1.Checked && checkBox2.Checked && checkBox3.Checked && checkBox4.Checked;
        }

        private void checkBox2_Click(object sender, EventArgs e)
        {
            checkBox5.Checked = checkBox1.Checked && checkBox2.Checked && checkBox3.Checked && checkBox4.Checked;
        }

        private void checkBox3_Click(object sender, EventArgs e)
        {
            checkBox5.Checked = checkBox1.Checked && checkBox2.Checked && checkBox3.Checked && checkBox4.Checked;
        }

        private void checkBox4_Click(object sender, EventArgs e)
        {
            checkBox5.Checked = checkBox1.Checked && checkBox2.Checked && checkBox3.Checked && checkBox4.Checked;
        }

        private void checkBox5_Click(object sender, EventArgs e)
        {
            checkBox1.Checked = checkBox5.Checked;
            checkBox2.Checked = checkBox5.Checked;
            checkBox3.Checked = checkBox5.Checked;
            checkBox4.Checked = checkBox5.Checked;
        }

        private void checkBox6_CheckedChanged(object sender, EventArgs e)
        {
            textBox7.Enabled = checkBox6.Checked;
        }

        private void checkBox7_CheckedChanged(object sender, EventArgs e)
        {
            textBox8.Enabled = checkBox7.Checked;
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if (txt.Text != "" && long.Parse(txt.Text) > Xburst)
                {
                    e.Handled = true;
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("大于现有数据包数" + Xburst.ToString(), textBox1, 0, -55, 2000);
                }
                else
                    e.Handled = false;
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }

            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", textBox1, 0, -55, 2000);
            }
            
        }

        private void textBox1_Click(object sender, EventArgs e)
        {
            textBox1.Text = "0";
            textBox2.Text = "-1";
        }
       

        private void textBox2_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if (txt.Text != "" && long.Parse(txt.Text) > Xtime)
                {
                    e.Handled = true;
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("大于捕获时长" + Xtime.ToString(), textBox2, 0, -55, 2000);
                }
                else
                    e.Handled = false;
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }

            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", textBox2, 0, -55, 2000);
            }
        }

        private void textBox2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "-1";
            textBox2.Clear();
        }

        private void textBox3_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if (txt.Text != "" && long.Parse(txt.Text) > Xburst)
                {
                    e.Handled = true;
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("大于现有数据包数" + Xburst.ToString(), textBox3, 0, -55, 2000);
                }
                else
                    e.Handled = false;
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", textBox3, 0, -55, 2000);
            }
        }

        private void textBox3_Click(object sender, EventArgs e)
        {
            textBox3.Clear();
            textBox4.Text = "-1";
            textBox5.Text = "-1";
            textBox6.Text = "-1";
        }

        private void textBox4_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if (txt.Text != "" && long.Parse(txt.Text) > Xburst)
                {
                    e.Handled = true;
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("大于现有数据包数" + Xburst.ToString(), textBox4, 0, -55, 2000);
                }
                else
                    e.Handled = false;
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", textBox4, 0, -55, 2000);
            }
        }

        private void textBox4_Click(object sender, EventArgs e)
        {
            textBox3.Text = "-1";
            textBox4.Clear();
            textBox5.Text = "-1";
            textBox6.Text = "-1";
        }

        private void textBox5_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if (txt.Text != "" && long.Parse(txt.Text) > Xtime)
                {
                    e.Handled = true;
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("大于捕获时长" + Xtime.ToString(), textBox5, 0, -55, 2000);
                }
                else
                    e.Handled = false;
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", textBox5, 0, -55, 2000);
            }
        }

        private void textBox5_Click(object sender, EventArgs e)
        {
            textBox3.Text = "-1";
            textBox4.Text = "-1";
            textBox5.Clear();
            textBox6.Text = "-1";
        }

        private void textBox6_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if (txt.Text != "" && long.Parse(txt.Text) > Xtime)
                {
                    e.Handled = true;
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("大于捕获时长" + Xtime.ToString(), textBox6, 0, -55, 2000);
                }
                else
                    e.Handled = false;
            }
            catch (Exception ee)
            {
                MessageBox.Show(ee.Message);
            }
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", textBox6, 0, -55, 2000);
            }
        }

        private void textBox6_Click(object sender, EventArgs e)
        {
            textBox3.Text = "-1";
            textBox4.Text = "-1";
            textBox5.Text = "-1";
            textBox6.Clear();
        }

        private void checkBox8_CheckedChanged(object sender, EventArgs e)
        {
            textBox9.Enabled = checkBox8.Checked;
        }

        private void checkBox9_CheckedChanged(object sender, EventArgs e)
        {
            textBox10.Enabled = checkBox9.Checked;
        }

        private void textBox9_KeyPress(object sender, KeyPressEventArgs e)
        {

        }

        private void textBox9_Click(object sender, EventArgs e)
        {
            textBox9.Clear();
            if (!textBox10.Enabled)
            {
                textBox10.Text = "-1";
            }
        }

        private void textBox10_KeyPress(object sender, KeyPressEventArgs e)
        {

        }

        private void textBox10_Click(object sender, EventArgs e)
        {
            textBox10.Clear();
            if (!textBox9.Enabled)
            {
                textBox9.Text = "-1";
            }
        }
        //这里需要添加对象改变后的操作（各个的范围变化）
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int temp;
            temp = comboBox1.SelectedIndex;
            Xburst = long.Parse(my_Form.listView1.Items[temp].SubItems[5].Text);
            DateTime endTime = DateTime.Parse(my_Form.listView1.Items[temp].SubItems[3].Text.Remove(19));
            DateTime startTime = DateTime.Parse(my_Form.listView1.Items[temp].SubItems[2].Text.Remove(19));
            TimeSpan midTime = endTime - startTime;
            Xtime = long.Parse(midTime.TotalSeconds.ToString());
            textBox11.Text = "系统提示：   " + "该流量文件共有" + Xburst.ToString() + "个数据包; " + "回放总时长为" + Xtime.ToString() + "s；";
        }

        private void textBox1_MouseHover(object sender, EventArgs e)
        {
            //toolTip1.ToolTipIcon = ToolTipIcon.Info;
            //toolTip1.ToolTipTitle = "系统提示";
            //toolTip1.Show("现有数据包数:" + Xburst.ToString(), textBox1, 0, -55, 2000);
        }

        private void textBox2_MouseHover(object sender, EventArgs e)
        {
            //toolTip1.ToolTipIcon = ToolTipIcon.Info;
            //toolTip1.ToolTipTitle = "系统提示";
            //toolTip1.Show("捕获持续时间:" + Xtime.ToString(), textBox2, 0, -55, 2000);
        }

        private void textBox3_MouseHover(object sender, EventArgs e)
        {
            //toolTip1.ToolTipIcon = ToolTipIcon.Info;
            //toolTip1.ToolTipTitle = "系统提示";
            //toolTip1.Show("现有数据包数:" + Xburst.ToString(), textBox3, 0, -55, 2000);
        }

        private void textBox4_MouseHover(object sender, EventArgs e)
        {
            //toolTip1.ToolTipIcon = ToolTipIcon.Info;
            //toolTip1.ToolTipTitle = "系统提示";
            //toolTip1.Show("现有数据包数:" + Xburst.ToString(), textBox4, 0, -55, 2000);
       
        }

        private void textBox5_MouseHover(object sender, EventArgs e)
        {
            //toolTip1.ToolTipIcon = ToolTipIcon.Info;
            //toolTip1.ToolTipTitle = "系统提示";
            //toolTip1.Show("捕获持续时间:" + Xtime.ToString(), textBox5, 0, -55, 2000);
        }

        private void textBox6_MouseHover(object sender, EventArgs e)
        {
            //toolTip1.ToolTipIcon = ToolTipIcon.Info;
            //toolTip1.ToolTipTitle = "系统提示";
            //toolTip1.Show("捕获持续时间:" + Xtime.ToString(), textBox6, 0, -55, 2000);
        }

        private void textBox9_Leave(object sender, EventArgs e)
        {
            TextBox txt = sender as TextBox;
            try
            {
                if(double.Parse(txt.Text.ToString()) > 1)
                {
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("请输入小于1的小数", textBox9, 0, -55, 2000);
                }
            }
            catch(Exception ee)
            {
                MessageBox.Show((ee.Message));
                
             }
        }

        private void textBox10_Leave(object sender, EventArgs e)
        {

            TextBox txt = sender as TextBox;
            try
            {
                if (double.Parse(txt.Text.ToString()) > 1)
                {
                    toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                    toolTip1.ToolTipTitle = "系统提示";
                    toolTip1.Show("请输入小于1的小数", textBox10, 0, -55, 2000);
                }
            }
            catch (Exception ee)
            {
                MessageBox.Show((ee.Message));

            }
        }

        private void textBox7_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            if (txt.Text.Length == 12)
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入12位字符", textBox7, 0, -55, 2000);
            }
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8) || (e.KeyChar >= 'A' && e.KeyChar <= 'F') || (e.KeyChar >= 'a' && e.KeyChar <= 'f'))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入0~9或A~F的字符，不能包含其他字符", textBox7, 0, -55, 2000);
            }

        }

        private void textBox8_KeyPress(object sender, KeyPressEventArgs e)
        {
            TextBox txt = sender as TextBox;
            if (txt.Text.Length == 12)
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入12位字符", textBox8, 0, -55, 2000);
            }
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8) || (e.KeyChar >= 'A' && e.KeyChar <= 'F') || (e.KeyChar >= 'a' && e.KeyChar <= 'f'))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入0~9或A~F的字符，不能包含其他字符", textBox8, 0, -55, 2000);
            }

        }

        private void textBox7_Leave(object sender, EventArgs e)
        {
            TextBox txt = sender as TextBox;
            if (txt.Text.Length < 12)
            {
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入12位字符", textBox7, 0, -55, 2000);
            }
        }

        private void textBox8_Leave(object sender, EventArgs e)
        {
            TextBox txt = sender as TextBox;
            if (txt.Text.Length < 12)
            {
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入12位字符", textBox8, 0, -55, 2000);
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string cmd = "REPLAY_CANCLE_OK\r\n";
            my_Form.sendCmd(cmd);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string cmd = "REPLAY_STOP_OK\r\n";
            my_Form.sendCmd(cmd);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string cmd = "REPLAY_CONTINUE_OK\r\n";
            my_Form.sendCmd(cmd);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
           

            
        }

        

       
    }
}
