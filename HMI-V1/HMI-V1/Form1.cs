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
    public partial class Form1 : Form//登陆界面
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "192.168.4.242" && textBox2.Text == "2121")
            {
                Form2 form2 = new Form2(this);
                app.ip = this.textBox1.Text;
                app.port = this.textBox2.Text;
                form2.ShowDialog();
            }
            else
            {
                MessageBox.Show("ip或端口错误");
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
