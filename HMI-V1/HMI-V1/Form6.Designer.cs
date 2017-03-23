namespace HMI_V1
{
    partial class Form6
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.loadingCircle1 = new MRG.Controls.UI.LoadingCircle();
            this.SuspendLayout();
            // 
            // loadingCircle1
            // 
            this.loadingCircle1.Active = true;
            this.loadingCircle1.Color = System.Drawing.Color.Lime;
            this.loadingCircle1.InnerCircleRadius = 6;
            this.loadingCircle1.Location = new System.Drawing.Point(85, 8);
            this.loadingCircle1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.loadingCircle1.Name = "loadingCircle1";
            this.loadingCircle1.NumberSpoke = 9;
            this.loadingCircle1.OuterCircleRadius = 7;
            this.loadingCircle1.RotationSpeed = 100;
            this.loadingCircle1.Size = new System.Drawing.Size(75, 51);
            this.loadingCircle1.SpokeThickness = 4;
            this.loadingCircle1.StylePreset = MRG.Controls.UI.LoadingCircle.StylePresets.Firefox;
            this.loadingCircle1.TabIndex = 0;
            this.loadingCircle1.Text = "loadingCircle1";
            // 
            // Form6
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(243, 68);
            this.Controls.Add(this.loadingCircle1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "Form6";
            this.Text = "正在建立索引，请稍后...";
            this.ResumeLayout(false);

        }

        #endregion

        private MRG.Controls.UI.LoadingCircle loadingCircle1;
    }
}