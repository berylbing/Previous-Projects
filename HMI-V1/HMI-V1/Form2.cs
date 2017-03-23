using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;
using System.Net.Sockets;
using System.Net;
using System.Threading;

namespace HMI_V1
{
    public partial class Form2 : Form//主界面
    {
        private Form1 my_Form;

        private TcpClient socket, client;
        public string[] dataSeries1;
        private byte[] socketData,clientData;
        public string socketCmd = "";
        public int opt;
        public int K1 = 001, K2 = 001, K3 = 001;

        public Form2(Form1 myForm)
        {
            InitializeComponent();
            this.my_Form = myForm;
        }

        public void sendCmd(string msg)
        {
            System.Byte[] message = System.Text.Encoding.Default.GetBytes(msg.ToCharArray());
            socket.GetStream().Write(message, 0, message.Length);
        }

        public string receive()
        {
            string clientCommand = "";
            if (socket.Connected)
            {
                byte[] buff = new byte[1024];
                socket.GetStream().Read(buff, 0, buff.Length);
                clientCommand = System.Text.Encoding.Default.GetString(buff); 
            }
            else
            {
                socket.Close();
            }
            return clientCommand;
        }

        public void receiveCmd(IAsyncResult ar)
        {
            try
            {
                int bytesRead = socket.GetStream().EndRead(ar);
                if (bytesRead < 1)
                {
                    return;
                }
                else
                {
                    socketCmd = System.Text.Encoding.Default.GetString(socketData, 0, bytesRead);
                    socketCmd = socketCmd.Trim("\0".ToCharArray());
                    int index = socketCmd.IndexOf("\r\n");
                    if (index > -1)
                    {
                        socketCmd = socketCmd.Substring(0, index);
                        toolStripStatusLabel1.Text = socketCmd;
                    }
                }
                socket.GetStream().BeginRead(socketData, 0, System.Convert.ToInt32(socket.ReceiveBufferSize), receiveCmd, null);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        public delegate void delUpdateHistory(string str);
        private void CreateMyListView(string data)
        {
            switch (opt)
            {
                case 1:
                    {
                        dataSeries1 = data.Split(' ', ',');
                        ListViewItem item1 = new ListViewItem(K1.ToString(), 0);
                        dataSeries1[1] = dataSeries1[1].Remove(17);
                        long tempT1 = long.Parse(dataSeries1[1]) + 116444736000000000;
                        dataSeries1[1] = tempT1.ToString();
                        DateTime dt = DateTime.FromFileTime(long.Parse(dataSeries1[1])); 
                        dataSeries1[1] = dt.ToString("yyyy-MM-dd HH:mm:ss.ffff");
                        dataSeries1[2] = dataSeries1[2].Remove(17);
                        long tempT2 = long.Parse(dataSeries1[2]) + 116444736000000000;
                        dataSeries1[2] = tempT2.ToString();
                        dt = DateTime.FromFileTime(long.Parse(dataSeries1[2]));
                        dataSeries1[2] = dt.ToString("yyyy-MM-dd HH:mm:ss.ffff");
                        if (dataSeries1[5] == "2")
                        {
                            dataSeries1[5] = "2.5G POS";
                        }
                        for (int i = 0; i < dataSeries1.Length; i++)
                        {
                            item1.SubItems.Add(dataSeries1[i]);
                        }
                        checkBoxComboBox2.Items.Add(dataSeries1[0]);
                        toolStripComboBox2.Items.Add(dataSeries1[0]);
                        listView1.Items.Insert(0, item1);
                        ImageList imageListLarge = new ImageList();
                        ImageList imageListSmall = new ImageList();
                        listView1.LargeImageList = imageListLarge;
                        listView1.SmallImageList = imageListSmall;
                        K1 = K1 + 1;
                        break;
                    }
                case 2:
                    {
                        dataSeries1 = data.Split(' ', ',');
                        ListViewItem item1 = new ListViewItem(K2.ToString(), 0);
                        for (int i = 0; i < dataSeries1.Length; i++)
                        {
                            item1.SubItems.Add(dataSeries1[i]);
                        }
                        checkBoxComboBox1.Items.Add(dataSeries1[0]);
                        toolStripComboBox1.Items.Add(dataSeries1[0]);
                        listView2.Items.Insert(0, item1);
                        ImageList imageListLarge = new ImageList();
                        ImageList imageListSmall = new ImageList();
                        listView2.LargeImageList = imageListLarge;
                        listView2.SmallImageList = imageListSmall;
                        K2 = K2 + 1;
                        break;
                    }
                case 3:
                    {
                        dataSeries1 = data.Split(' ', ',');
                        ListViewItem item1 = new ListViewItem(K3.ToString(), 0);
                        for (int i = 0; i < dataSeries1.Length; i++)
                        {
                            item1.SubItems.Add(dataSeries1[i]);
                        }
                        listView3.Items.Insert(0, item1);
                        ImageList imageListLarge = new ImageList();
                        ImageList imageListSmall = new ImageList();
                        listView3.LargeImageList = imageListLarge;
                        listView3.SmallImageList = imageListSmall;
                        K3 = K3 + 1;
                        break;
                    }
                case 4:
                    {
                        listView1.Visible = false;
                        listView2.Visible = false;
                        listView3.Visible = false;
                        listView4.Visible = true;
                        dataSeries1 = data.Split(' ', ',');
                        ListViewItem item1 = new ListViewItem(dataSeries1[0], 0);
                        for (int i = 1; i < dataSeries1.Length; i++)
                        {
                            item1.SubItems.Add(dataSeries1[i]);
                        }
                        listView4.Items.Insert(0, item1);
                        ImageList imageListLarge = new ImageList();
                        ImageList imageListSmall = new ImageList();
                        listView4.LargeImageList = imageListLarge;
                        listView4.SmallImageList = imageListSmall;
                        break;
                    }
                case 5:
                    {
                        listView1.Visible = false;
                        listView2.Visible = false;
                        listView3.Visible = false;
                        listView4.Visible = false;
                        listView5.Visible = true;
                        dataSeries1 = data.Split(' ', ',');
                        ListViewItem item1 = new ListViewItem(dataSeries1[0], 0);
                        for (int i = 1; i < dataSeries1.Length; i++)
                        {
                            item1.SubItems.Add(dataSeries1[i]);
                        }
                        listView5.Items.Insert(0, item1);
                        ImageList imageListLarge = new ImageList();
                        ImageList imageListSmall = new ImageList();
                        listView5.LargeImageList = imageListLarge;
                        listView5.SmallImageList = imageListSmall;
                        
                        //richtextBox1.AppendText(data);
                        break;
                    }
            }
        }

        public void receiveData(IAsyncResult ar)
        {
            string data1 = "";
            try
            {
                int bytesRead = client.GetStream().EndRead(ar);
                if (bytesRead < 1)
                {
                    return;
                }
                else
                {
                    data1 += System.Text.Encoding.Default.GetString(clientData, 0, bytesRead);
                    //data1 += System.Text.Encoding.GetEncoding("gb2312").GetString(clientData, 0, bytesRead);
                    bool flag = true;
                    while(flag)
                    {
                        int index = data1.IndexOf("\r\n");
                        if (index > -1)
                        {
                            if (index + 2 == data1.Length) flag = false; 
                            string data2 = data1.Substring(0, index);
                            data1 = data1.Substring(index + 2, data1.Length - index - 2);
                            if (data2 != String.Empty)
                            {
                                object[] para = { data2 };
                                this.Invoke(new delUpdateHistory(CreateMyListView), para);
                            }
                        }
                    }
                }
                client.GetStream().BeginRead(clientData, 0, System.Convert.ToInt32(client.ReceiveBufferSize), receiveData, null);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
            }
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            try
            {
                socket = new TcpClient(app.ip, Int32.Parse(app.port));
                string cmd = "DATA_CONNECTION\r\n";
                sendCmd(cmd);
                string str = receive();
                string[] tiqu = str.Split(':', ')');

                socketData = new byte[socket.ReceiveBufferSize];
                socket.GetStream().BeginRead(socketData, 0, System.Convert.ToInt32(socket.ReceiveBufferSize), receiveCmd, null);
                client = new TcpClient(app.ip, Int32.Parse(tiqu[1]));
                clientData = new byte[client.ReceiveBufferSize];
                client.GetStream().BeginRead(clientData, 0, System.Convert.ToInt32(client.ReceiveBufferSize), receiveData, null);
                查看流量文件ToolStripMenuItem_Click(sender, e);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.ToString());
                this.Close();
            }
        }

        private void Form2_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            toolStripButton1.Enabled = false;
        }

        public void toolStripButton2_Click(object sender, EventArgs e)
        {
            开始捕获ToolStripMenuItem_Click(sender, e);
        }

        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            string cmd = "CAPTURE_CANCLE\r\n";
            sendCmd(cmd);
        }

        public void toolStripButton4_Click(object sender, EventArgs e)
        {
            回放参数ToolStripMenuItem_Click(sender, e);
        }

        private void toolStripButton5_Click(object sender, EventArgs e)
        {

        }

        private void toolStripButton7_Click(object sender, EventArgs e)
        {
            
        }

        private void toolStripButton8_Click(object sender, EventArgs e)
        {
            
        }

        private void toolStripButton9_Click(object sender, EventArgs e)
        {
            string cmd = "QUIT\r\n";
            sendCmd(cmd);
        }


        private void toolStripButton10_Click(object sender, EventArgs e)
        {
            opt = 2;
            K2 = 001;
            listView2.Items.Clear();
            checkBoxComboBox1.Items.Clear();
            toolStripComboBox1.Items.Clear();
            toolStripComboBox1.Items.Add("全部");
            string cmd;
            if (toolStriptextBox1.Text == "")
            {
                cmd = "KEYWORD_INFO_ALL\r\n";
            }
            else
            {
                cmd = "KEYWORD_INFO: " + toolStriptextBox1.Text + "\r\n";
                toolStriptextBox1.Clear();
            }
            sendCmd(cmd);
        }

        private void toolStripButton11_Click(object sender, EventArgs e)
        {
            string cmd = "ADD_KEYWORD: " + toolStriptextBox1.Text + "\r\n";
            sendCmd(cmd);
            toolStriptextBox1.Clear();
        }

        private void toolStripButton12_Click(object sender, EventArgs e)
        {
            string cmd = "DELETE_KEYWORD: " + toolStriptextBox1.Text + "\r\n";
            sendCmd(cmd);
            toolStriptextBox1.Clear();
        }

        private void 显示关键字库信息ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.Visible = false;
            listView2.Visible = true;
            listView3.Visible = false;
            listView4.Visible = false;

            toolStrip3.Visible = true;
            toolStrip2.Visible = false;
            panel1.Visible = false;
        }

        private void 查询流量中的关键字ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.Visible = false;
            listView2.Visible = false;
            listView4.Visible = false;
            listView3.Visible = true;

            toolStrip3.Visible = false;
            toolStrip2.Visible = false;
            panel1.Visible = true;
        }

        private void 添加关键字至关键字库ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 删除关键字库中信息ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 查看流量文件ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            listView1.Visible = true;
            listView2.Visible = false;
            listView3.Visible = false;
            listView4.Visible = false;
            listView5.Visible = false;

            opt = 1;
            K1 = 001;
            listView1.Items.Clear();
            checkBoxComboBox2.Items.Clear();
            toolStripComboBox2.Items.Clear();
            string cmd = "TRAFFIC_INFO\r\n";
            sendCmd(cmd);
        }

        private void 开始捕获ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form4 form4 = new Form4(this);
            form4.ShowDialog();
        }

        private void 停止捕获ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 回放参数ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form3 form3 = new Form3(this);
            form3.ShowDialog();
            //if (listView1.SelectedIndices.Count > 0)
            //{
            //    listView1_DoubleClick(sender, e);
            //}
            //else
            //{
            //    MessageBox.Show("请选择回放流量");
            //}
        }

        private void listView1_MouseClick(object sender, MouseEventArgs e)
        {
            if (listView1.SelectedItems != null && e.Button == MouseButtons.Right)
            {
                this.contextMenuStrip1.Show(Cursor.Position.X + 10, Cursor.Position.Y + 10);
            }
        }

        private void listView1_DoubleClick(object sender, EventArgs e)
        {
            
        }

        private void listView2_MouseClick(object sender, MouseEventArgs e)
        {
            if (listView2.SelectedItems != null && e.Button == MouseButtons.Right)
            {
                this.contextMenuStrip2.Show(Cursor.Position.X + 10, Cursor.Position.Y + 10);
            }
        }

        private void listView2_Click(object sender, EventArgs e)
        {
            toolStriptextBox1.Text = listView2.SelectedItems[0].SubItems[1].Text;
        }

        private void listView2_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            //Form3 form3 = new Form3(this);
            //form3.text = this.listView2.SelectedItems[0].SubItems[1].Text;
            //form3.Show();
        }

        private void 删除流量ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string cmd = "DELETE_TRAFFIC: " + listView1.SelectedItems[0].SubItems[1].Text + "\r\n";
            sendCmd(cmd);
        }

        private void 回放ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            回放参数ToolStripMenuItem_Click(sender,e);
        }

        private void 查询标注信息ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
        }

        private void 删除该关键字ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            string cmd = "DELETE_KEYWORD: " + listView2.SelectedItems[0].SubItems[1].Text + "\r\n";
            sendCmd(cmd);
            toolStriptextBox1.Clear();
        }

        private void 返回上一级ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
        }

        Form6 form6 = new Form6();

        private void toolStripStatusLabel1_TextChanged(object sender, EventArgs e)
        {
            if (toolStripStatusLabel1.Text == "TRAFFIC_DELETE_END")
            {
                查看流量文件ToolStripMenuItem_Click(sender, e);
            }
            if (toolStripStatusLabel1.Text == "insert/update   Success")
            {
                toolStripButton10_Click(sender, e);
            }
            if (toolStripStatusLabel1.Text == "delete   Success")
            {
                toolStripButton10_Click(sender, e);
            }
            if (toolStripStatusLabel1.Text == "TRAFFIC_CAPTURE_BEGIN")
            {
                
            }
            if (toolStripStatusLabel1.Text == "TRAFFIC_CAPTURE_END")
            {
                
            }
            if (toolStripStatusLabel1.Text == "CAPTURE_INDEX_UPDATE_BEGIN")
            {
                form6.ShowDialog();
            }
            if (toolStripStatusLabel1.Text == "CAPTURE_INDEX_UPDATE_END")
            {
                form6.Dispose();
                DialogResult MsgBoxResult;//设置对话框的返回值

                MsgBoxResult = MessageBox.Show("建立索引完毕",//对话框的显示内容 

                "提示",//对话框的标题 

                MessageBoxButtons.OK,//定义对话框的按钮，这里定义了YES和NO两个按钮 

                MessageBoxIcon.Exclamation,//定义对话框内的图表式样，这里是一个黄色三角型内加一个感叹号 

                MessageBoxDefaultButton.Button2);//定义对话框的按钮式样
                if (MsgBoxResult == DialogResult.OK)
                {
                    查看流量文件ToolStripMenuItem_Click(sender, e);
                }
            }
        }

        private void toolStripButton6_Click(object sender, EventArgs e)
        {
            if (toolStripComboBox1.Text == String.Empty || toolStripComboBox2.Text == String.Empty)
            {
                MessageBox.Show("请选择关键字或流量", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                string cmd = "KEYWORD_LIST_BEGIN\r\n";
                sendCmd(cmd);
                if (toolStripComboBox1.Text == "全部")
                {
                    cmd = "KEYWORD_ALL\r\n";
                }
                else
                {
                    cmd = "KEYWORD: " + toolStripComboBox1.Text + "\r\n";
                }
                sendCmd(cmd);
                cmd = "KEYWORD_LIST_END\r\n";
                sendCmd(cmd);

                cmd = "TRAFFIC_LIST_BEGIN\r\n";
                sendCmd(cmd);

                if (toolStripComboBox2.Text == "全部")
                {
                    cmd = "TRAFFIC_ALL\r\n";
                }
                else
                {
                    cmd = "TRAFFIC_NAME: " + toolStripComboBox2.Text + "\r\n";
                }
                sendCmd(cmd);
                cmd = "TRAFFIC_LIST_END\r\n";
                sendCmd(cmd);

                int protocol = 255;
                opt = 3;
                K3 = 001;
                listView3.Clear();
                //if (toolStripComboBox3.Text == "全部")
                //{
                //    protocol = 255;
                //}
                //if (toolStripComboBox3.Text == "Http")
                //{
                //    protocol = 1;
                //}
                //if (toolStripComboBox3.Text == "Smtp")
                //{
                //    protocol = 2;
                //}
                //if (toolStripComboBox3.Text == "Pop3")
                //{
                //    protocol = 3;
                //}
                //if (toolStripComboBox3.Text == "Ftp")
                //{
                //    protocol = 4;
                //}
                cmd = "TRAFFIC_KEYWORD_QUERY PROTOCOL: " + protocol + "\r\n";
                sendCmd(cmd);
            }
        }

        private void toolStripButton7_Click_1(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (checkBoxComboBox1.Text == String.Empty || checkBoxComboBox2.Text == String.Empty)
            {
                MessageBox.Show("请选择关键字或流量", "提示", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                string cmd = "KEYWORD_LIST_BEGIN\r\n";
                sendCmd(cmd);

                string[] data1 = checkBoxComboBox1.Text.Split(',', ' ');
                for (int i = 0; i < data1.Length; i++)
                {
                    if (data1[i] != "")
                    {
                        cmd = "KEYWORD: " + data1[0] + "\r\n";
                        sendCmd(cmd);
                    }
                }

                cmd = "KEYWORD_LIST_END\r\n";
                sendCmd(cmd);

                cmd = "TRAFFIC_LIST_BEGIN\r\n";
                sendCmd(cmd);

                cmd = "TRAFFIC_NAME: " + checkBoxComboBox2.Text + "\r\n";
                sendCmd(cmd);
                cmd = "TRAFFIC_LIST_END\r\n";
                sendCmd(cmd);

                int protocol = 255;
                opt = 3;
                K3 = 001;
                listView3.Clear();
                cmd = "TRAFFIC_KEYWORD_QUERY PROTOCOL: " + protocol + "\r\n";
                sendCmd(cmd);
            }
        }

        public void mapmap()
        {
            Form5 form5 = new Form5(this);
            form5.Show();
        }
    }
}
