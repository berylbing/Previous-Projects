using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Dundas.Charting.WinControl;

namespace HMI_V1
{
    public partial class Form5 : Form
    {
        private Form2 my_form;

        int pointIndex = 0;
        int numberOfPointsInChart = 20;
        int numberOfPointsAfterRemoval = 19;

        public Form5(Form2 myform)
        {
            InitializeComponent();
            this.my_form = myform;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            chart1.Series[0].Type = SeriesChartType.Line;
            chart1.Series[0].Points.AddXY(pointIndex, my_form.dataSeries1[3]);
            if (chart1.Series[0].Points.Count >= numberOfPointsInChart)
            {
                while (chart1.Series[0].Points.Count > numberOfPointsAfterRemoval)
                {
                    chart1.Series[0].Points.RemoveAt(0);
                }
                chart1.ChartAreas["Default"].AxisX.Minimum = pointIndex - numberOfPointsInChart;
                chart1.ChartAreas["Default"].AxisX.Maximum = pointIndex;
            }
            pointIndex++;
            chart1.Invalidate();
        }

        private void timer2_Tick(object sender, EventArgs e)
        {
            //chart2.Series[0].ShowLabelAsValue = true; 
            //double[] yValues = { Int32.Parse(my_form.dataSeries1[2]), Int32.Parse(my_form.dataSeries1[3]), Int32.Parse(my_form.dataSeries1[4]), Int32.Parse(my_form.dataSeries1[5]) };
            //string[] xValues = { "Http", "Ftp", "Smtp", "Pop" };
            //chart2.Series[0].Points.DataBindXY(xValues, yValues);
            //chart2.ResetAutoValues(); 
            chart2.Series[0].Type = SeriesChartType.Line;
            chart2.Series[0].Points.AddXY(pointIndex, my_form.dataSeries1[4]);
            chart2.ResetAutoValues();

            if (chart2.Series[0].Points.Count >= numberOfPointsInChart)
            {
                while (chart2.Series[0].Points.Count > numberOfPointsAfterRemoval)
                {
                    chart2.Series[0].Points.RemoveAt(0);
                }
                chart2.ChartAreas["Default"].AxisX.Minimum = pointIndex - numberOfPointsInChart;
                chart2.ChartAreas["Default"].AxisX.Maximum = pointIndex;
            }
            pointIndex++;
            chart2.Invalidate();
        }
    }
}
