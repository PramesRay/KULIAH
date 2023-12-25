namespace Bresenham
{
    partial class Form1
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
            this.x1Line_Input = new System.Windows.Forms.TextBox();
            this.x = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.y1Line_Input = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.y2Line_Input = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.x2Line_Input = new System.Windows.Forms.TextBox();
            this.DrawLine_Button = new System.Windows.Forms.Button();
            this.DrawCircle_Button = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.Radius_Input = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.yCircle_Input = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.xCircle_Input = new System.Windows.Forms.TextBox();
            this.Title1 = new System.Windows.Forms.Label();
            this.title2 = new System.Windows.Forms.Label();
            this.LineDasar_Panel = new System.Windows.Forms.Panel();
            this.LineDDA_Panel = new System.Windows.Forms.Panel();
            this.LineBresenham_Panel = new System.Windows.Forms.Panel();
            this.label5 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.label11 = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.CircleBresenham_Panel = new System.Windows.Forms.Panel();
            this.CirclePolar_Panel = new System.Windows.Forms.Panel();
            this.CircleDasar_Panel = new System.Windows.Forms.Panel();
            this.SuspendLayout();
            // 
            // x1Line_Input
            // 
            this.x1Line_Input.Location = new System.Drawing.Point(51, 160);
            this.x1Line_Input.Name = "x1Line_Input";
            this.x1Line_Input.Size = new System.Drawing.Size(49, 20);
            this.x1Line_Input.TabIndex = 0;
            // 
            // x
            // 
            this.x.AutoSize = true;
            this.x.Location = new System.Drawing.Point(65, 144);
            this.x.Name = "x";
            this.x.Size = new System.Drawing.Size(14, 13);
            this.x.TabIndex = 1;
            this.x.Text = "X";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(120, 144);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(14, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Y";
            // 
            // y1Line_Input
            // 
            this.y1Line_Input.Location = new System.Drawing.Point(106, 160);
            this.y1Line_Input.Name = "y1Line_Input";
            this.y1Line_Input.Size = new System.Drawing.Size(49, 20);
            this.y1Line_Input.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(24, 189);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(13, 13);
            this.label3.TabIndex = 7;
            this.label3.Text = "2";
            // 
            // y2Line_Input
            // 
            this.y2Line_Input.Location = new System.Drawing.Point(106, 186);
            this.y2Line_Input.Name = "y2Line_Input";
            this.y2Line_Input.Size = new System.Drawing.Size(49, 20);
            this.y2Line_Input.TabIndex = 6;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(24, 163);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(13, 13);
            this.label4.TabIndex = 5;
            this.label4.Text = "1";
            // 
            // x2Line_Input
            // 
            this.x2Line_Input.Location = new System.Drawing.Point(51, 186);
            this.x2Line_Input.Name = "x2Line_Input";
            this.x2Line_Input.Size = new System.Drawing.Size(49, 20);
            this.x2Line_Input.TabIndex = 4;
            // 
            // DrawLine_Button
            // 
            this.DrawLine_Button.Location = new System.Drawing.Point(51, 212);
            this.DrawLine_Button.Name = "DrawLine_Button";
            this.DrawLine_Button.Size = new System.Drawing.Size(104, 23);
            this.DrawLine_Button.TabIndex = 11;
            this.DrawLine_Button.Text = "Draw Line";
            this.DrawLine_Button.UseVisualStyleBackColor = true;
            this.DrawLine_Button.Click += new System.EventHandler(this.DrawLine_Button_Click);
            // 
            // DrawCircle_Button
            // 
            this.DrawCircle_Button.Location = new System.Drawing.Point(51, 441);
            this.DrawCircle_Button.Name = "DrawCircle_Button";
            this.DrawCircle_Button.Size = new System.Drawing.Size(104, 23);
            this.DrawCircle_Button.TabIndex = 20;
            this.DrawCircle_Button.Text = "Draw Circle";
            this.DrawCircle_Button.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(60, 418);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(40, 13);
            this.label1.TabIndex = 19;
            this.label1.Text = "Radius";
            // 
            // Radius_Input
            // 
            this.Radius_Input.Location = new System.Drawing.Point(106, 415);
            this.Radius_Input.Name = "Radius_Input";
            this.Radius_Input.Size = new System.Drawing.Size(49, 20);
            this.Radius_Input.TabIndex = 18;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(120, 373);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(14, 13);
            this.label6.TabIndex = 15;
            this.label6.Text = "Y";
            // 
            // yCircle_Input
            // 
            this.yCircle_Input.Location = new System.Drawing.Point(106, 389);
            this.yCircle_Input.Name = "yCircle_Input";
            this.yCircle_Input.Size = new System.Drawing.Size(49, 20);
            this.yCircle_Input.TabIndex = 14;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(65, 373);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(14, 13);
            this.label7.TabIndex = 13;
            this.label7.Text = "X";
            // 
            // xCircle_Input
            // 
            this.xCircle_Input.Location = new System.Drawing.Point(51, 389);
            this.xCircle_Input.Name = "xCircle_Input";
            this.xCircle_Input.Size = new System.Drawing.Size(49, 20);
            this.xCircle_Input.TabIndex = 12;
            // 
            // Title1
            // 
            this.Title1.AutoSize = true;
            this.Title1.Location = new System.Drawing.Point(12, 81);
            this.Title1.Name = "Title1";
            this.Title1.Size = new System.Drawing.Size(134, 13);
            this.Title1.TabIndex = 21;
            this.Title1.Text = "PENGGAMBARAN GARIS";
            // 
            // title2
            // 
            this.title2.AutoSize = true;
            this.title2.Location = new System.Drawing.Point(12, 351);
            this.title2.Name = "title2";
            this.title2.Size = new System.Drawing.Size(163, 13);
            this.title2.TabIndex = 22;
            this.title2.Text = "PENGGAMBARAN LINGKARAN";
            // 
            // LineDasar_Panel
            // 
            this.LineDasar_Panel.Location = new System.Drawing.Point(223, 81);
            this.LineDasar_Panel.Name = "LineDasar_Panel";
            this.LineDasar_Panel.Size = new System.Drawing.Size(200, 200);
            this.LineDasar_Panel.TabIndex = 23;
            // 
            // LineDDA_Panel
            // 
            this.LineDDA_Panel.Location = new System.Drawing.Point(540, 81);
            this.LineDDA_Panel.Name = "LineDDA_Panel";
            this.LineDDA_Panel.Size = new System.Drawing.Size(200, 200);
            this.LineDDA_Panel.TabIndex = 24;
            // 
            // LineBresenham_Panel
            // 
            this.LineBresenham_Panel.Location = new System.Drawing.Point(845, 81);
            this.LineBresenham_Panel.Name = "LineBresenham_Panel";
            this.LineBresenham_Panel.Size = new System.Drawing.Size(200, 200);
            this.LineBresenham_Panel.TabIndex = 24;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(298, 297);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(44, 13);
            this.label5.TabIndex = 25;
            this.label5.Text = "DASAR";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(623, 297);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(30, 13);
            this.label8.TabIndex = 26;
            this.label8.Text = "DDA";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(912, 297);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(75, 13);
            this.label9.TabIndex = 27;
            this.label9.Text = "BRESENHAM";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(912, 567);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(75, 13);
            this.label10.TabIndex = 33;
            this.label10.Text = "BRESENHAM";
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(617, 567);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(43, 13);
            this.label11.TabIndex = 32;
            this.label11.Text = "POLAR";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(298, 567);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(44, 13);
            this.label12.TabIndex = 31;
            this.label12.Text = "DASAR";
            // 
            // CircleBresenham_Panel
            // 
            this.CircleBresenham_Panel.Location = new System.Drawing.Point(845, 351);
            this.CircleBresenham_Panel.Name = "CircleBresenham_Panel";
            this.CircleBresenham_Panel.Size = new System.Drawing.Size(200, 200);
            this.CircleBresenham_Panel.TabIndex = 29;
            // 
            // CirclePolar_Panel
            // 
            this.CirclePolar_Panel.Location = new System.Drawing.Point(540, 351);
            this.CirclePolar_Panel.Name = "CirclePolar_Panel";
            this.CirclePolar_Panel.Size = new System.Drawing.Size(200, 200);
            this.CirclePolar_Panel.TabIndex = 30;
            // 
            // CircleDasar_Panel
            // 
            this.CircleDasar_Panel.Location = new System.Drawing.Point(223, 351);
            this.CircleDasar_Panel.Name = "CircleDasar_Panel";
            this.CircleDasar_Panel.Size = new System.Drawing.Size(200, 200);
            this.CircleDasar_Panel.TabIndex = 28;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1064, 681);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.CircleBresenham_Panel);
            this.Controls.Add(this.CirclePolar_Panel);
            this.Controls.Add(this.CircleDasar_Panel);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.LineBresenham_Panel);
            this.Controls.Add(this.LineDDA_Panel);
            this.Controls.Add(this.LineDasar_Panel);
            this.Controls.Add(this.title2);
            this.Controls.Add(this.Title1);
            this.Controls.Add(this.DrawCircle_Button);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Radius_Input);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.yCircle_Input);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.xCircle_Input);
            this.Controls.Add(this.DrawLine_Button);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.y2Line_Input);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.x2Line_Input);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.y1Line_Input);
            this.Controls.Add(this.x);
            this.Controls.Add(this.x1Line_Input);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox x1Line_Input;
        private System.Windows.Forms.Label x;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox y1Line_Input;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox y2Line_Input;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox x2Line_Input;
        private System.Windows.Forms.Button DrawLine_Button;
        private System.Windows.Forms.Button DrawCircle_Button;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox Radius_Input;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox yCircle_Input;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox xCircle_Input;
        private System.Windows.Forms.Label Title1;
        private System.Windows.Forms.Label title2;
        private System.Windows.Forms.Panel LineDasar_Panel;
        private System.Windows.Forms.Panel LineDDA_Panel;
        private System.Windows.Forms.Panel LineBresenham_Panel;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Panel CircleBresenham_Panel;
        private System.Windows.Forms.Panel CirclePolar_Panel;
        private System.Windows.Forms.Panel CircleDasar_Panel;
    }
}

