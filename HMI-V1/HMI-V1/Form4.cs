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
    public partial class Form4 : Form//捕获参数界面
    {
        private Form2 my_form;

        public Form4(Form2 myform)
        {
            InitializeComponent();
            this.my_form = myform;
            
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            my_form.listView4.Visible = true;
            my_form.listView5.Visible = false;

            bool tflag = true;
            if (textBox5.Text == String.Empty)
            {
                tflag = false;
                MessageBox.Show("请设置捕获文件名", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (DateTime.Compare(dateTimePicker1.Value, dateTimePicker2.Value) == 0 && radioButton1.Checked)
            {
                tflag = false;
                MessageBox.Show("请设置捕获结束时间", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (textBox3.Text == String.Empty && radioButton2.Checked)
            {
                tflag = false;
                MessageBox.Show("请设置捕获持续时间", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            if (textBox4.Text == String.Empty && radioButton3.Checked)
            {
                tflag = false;
                MessageBox.Show("请设置捕获包数", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }

            if(tflag)
            {
                int duration_time = -1;
                int pkt_num = -1;
                int mode = 0;
                DateTime startTime = DateTime.Parse(dateTimePicker1.Text);
                DateTime endTime = DateTime.Parse(dateTimePicker2.Text);


                if (radioButton1.Checked)
                {

                    TimeSpan midTime = endTime - startTime;
                    duration_time = System.Convert.ToInt32(midTime.TotalSeconds);
                    //duration_time = System.Convert.ToInt32(dateTimePicker2.Text) - System.Convert.ToInt32(dateTimePicker1.Text);
                    mode = 0;
                }
                if (radioButton2.Checked)
                {
                    duration_time = System.Convert.ToInt32(textBox3.Text);
                    mode = 0;
                }
                if (radioButton3.Checked)
                {
                    pkt_num = System.Convert.ToInt32(textBox4.Text);
                    mode = 1;
                }
                my_form.opt = 4;
                my_form.listView4.Items.Clear();
                TimeSpan sTime = startTime - DateTime.Now;
               // MessageBox.Show(sTime.TotalSeconds.ToString());
                string cmd = "CAPTURE_START START_TIME: " + System.Convert.ToInt32(sTime.TotalSeconds) + ", DURATION_TIME: " + duration_time + ", PKT_NUM: " + pkt_num + ", MODE: " + mode + ", MATRIX_FILE_NAME: " + textBox5.Text + "\r\n";
                my_form.sendCmd(cmd);
                this.Close();
            }
        }

        private void 取消_Click(object sender, EventArgs e)
        {
            //textBox1.Clear();
            dateTimePicker1.Refresh();
            //textBox2.Clear();
            dateTimePicker2.Refresh();
            textBox3.Clear();
            textBox4.Clear();
            textBox5.Clear();
        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {
            //textBox2.Enabled = radioButton1.Checked;
            dateTimePicker2.Enabled = radioButton1.Checked;
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            textBox3.Enabled = radioButton2.Checked;
        }

        private void radioButton3_CheckedChanged(object sender, EventArgs e)
        {
            textBox4.Enabled = radioButton3.Checked;
        }

        private void dateTimePicker1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字，不能包含其他字符", dateTimePicker1, 0, -55, 2000);
            }
        }

        private void textBox2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                //toolTip1.Show("请输入数字，不能包含其他字符", textBox2, 0, -55, 2000);
            }
        }

        private void textBox3_KeyPress(object sender, KeyPressEventArgs e)
        {
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

        private void textBox4_KeyPress(object sender, KeyPressEventArgs e)
        {
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

        private void textBox5_KeyPress(object sender, KeyPressEventArgs e)
        {
            if ((e.KeyChar >= '0' && e.KeyChar <= '9') || (e.KeyChar >= 'A' && e.KeyChar <= 'Z') || (e.KeyChar >= 'a' && e.KeyChar <= 'z') || (e.KeyChar == 8))
            {
                e.Handled = false;
            }
            else
            {
                e.Handled = true;
                toolTip1.ToolTipIcon = ToolTipIcon.Warning;
                toolTip1.ToolTipTitle = "系统提示";
                toolTip1.Show("请输入数字或字母，不能包含特殊字符", textBox5, 0, -55, 2000);
            }
        }

        private void textBox2_Click(object sender, EventArgs e)
        {
            //textBox2.Clear();
            textBox3.Text = "-1";
            textBox4.Text = "-1";
        }

        private void textBox3_Click(object sender, EventArgs e)
        {
            //textBox2.Text = "-1";
            textBox3.Clear();
            textBox4.Text = "-1";
        }

        private void textBox4_Click(object sender, EventArgs e)
        {
            //textBox2.Text = "-1";
            textBox3.Text = "-1";
            textBox4.Clear();
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            dateTimePicker1.MinDate = DateTime.Now;
            if (DateTime.Compare(dateTimePicker1.Value, dateTimePicker2.Value) >= 0)
            {
                dateTimePicker2.Value = dateTimePicker1.Value;
            }
        }

        private void dateTimePicker2_ValueChanged(object sender, EventArgs e)
        {
            dateTimePicker2.MinDate = dateTimePicker1.Value;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (DateTime.Compare(dateTimePicker1.Value, DateTime.Now) < 0)
            {
                dateTimePicker1.Value = DateTime.Now;
            }
        }

       
    }
}
