namespace Tugas2
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            inputLX1 = new TextBox();
            inputLY1 = new TextBox();
            label4 = new Label();
            label5 = new Label();
            inputLX2 = new TextBox();
            inputLY2 = new TextBox();
            panelLDasar = new Panel();
            label6 = new Label();
            panelLDDA = new Panel();
            panelLBresenham = new Panel();
            label7 = new Label();
            label8 = new Label();
            label9 = new Label();
            inputCY = new TextBox();
            inputCX = new TextBox();
            label10 = new Label();
            label11 = new Label();
            inputRad = new TextBox();
            label12 = new Label();
            buttonLine = new Button();
            buttonCircle = new Button();
            label13 = new Label();
            panelCBresenham = new Panel();
            label15 = new Label();
            panelCDasar = new Panel();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label1.Location = new Point(8, 5);
            label1.Margin = new Padding(2, 0, 2, 0);
            label1.Name = "label1";
            label1.Size = new Size(250, 21);
            label1.TabIndex = 0;
            label1.Text = "Algoritma Penggambaran Garis";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label2.Location = new Point(62, 34);
            label2.Margin = new Padding(2, 0, 2, 0);
            label2.Name = "label2";
            label2.Size = new Size(19, 21);
            label2.TabIndex = 1;
            label2.Text = "X";
            label2.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label3.Location = new Point(104, 34);
            label3.Margin = new Padding(2, 0, 2, 0);
            label3.Name = "label3";
            label3.Size = new Size(19, 21);
            label3.TabIndex = 2;
            label3.Text = "Y";
            label3.TextAlign = ContentAlignment.MiddleCenter;
            label3.Click += label3_Click;
            // 
            // inputLX1
            // 
            inputLX1.Location = new Point(53, 55);
            inputLX1.Margin = new Padding(2);
            inputLX1.Name = "inputLX1";
            inputLX1.Size = new Size(38, 23);
            inputLX1.TabIndex = 3;
            inputLX1.TextAlign = HorizontalAlignment.Right;
            // 
            // inputLY1
            // 
            inputLY1.Location = new Point(95, 55);
            inputLY1.Margin = new Padding(2);
            inputLY1.Name = "inputLY1";
            inputLY1.Size = new Size(36, 23);
            inputLY1.TabIndex = 4;
            inputLY1.TextAlign = HorizontalAlignment.Right;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label4.Location = new Point(30, 55);
            label4.Margin = new Padding(2, 0, 2, 0);
            label4.Name = "label4";
            label4.Size = new Size(19, 21);
            label4.TabIndex = 5;
            label4.Text = "1";
            label4.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label5.Location = new Point(30, 86);
            label5.Margin = new Padding(2, 0, 2, 0);
            label5.Name = "label5";
            label5.Size = new Size(19, 21);
            label5.TabIndex = 6;
            label5.Text = "2";
            label5.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // inputLX2
            // 
            inputLX2.Location = new Point(53, 88);
            inputLX2.Margin = new Padding(2);
            inputLX2.Name = "inputLX2";
            inputLX2.Size = new Size(38, 23);
            inputLX2.TabIndex = 7;
            inputLX2.TextAlign = HorizontalAlignment.Right;
            // 
            // inputLY2
            // 
            inputLY2.Location = new Point(95, 88);
            inputLY2.Margin = new Padding(2);
            inputLY2.Name = "inputLY2";
            inputLY2.Size = new Size(36, 23);
            inputLY2.TabIndex = 8;
            inputLY2.TextAlign = HorizontalAlignment.Right;
            // 
            // panelLDasar
            // 
            panelLDasar.BorderStyle = BorderStyle.FixedSingle;
            panelLDasar.Location = new Point(188, 55);
            panelLDasar.Margin = new Padding(2);
            panelLDasar.Name = "panelLDasar";
            panelLDasar.Size = new Size(255, 213);
            panelLDasar.TabIndex = 9;
            panelLDasar.Paint += panelDasar_Paint;
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label6.Location = new Point(280, 34);
            label6.Margin = new Padding(2, 0, 2, 0);
            label6.Name = "label6";
            label6.Size = new Size(53, 21);
            label6.TabIndex = 10;
            label6.Text = "Dasar";
            // 
            // panelLDDA
            // 
            panelLDDA.BorderStyle = BorderStyle.FixedSingle;
            panelLDDA.Location = new Point(498, 55);
            panelLDDA.Margin = new Padding(2);
            panelLDDA.Name = "panelLDDA";
            panelLDDA.Size = new Size(255, 213);
            panelLDDA.TabIndex = 10;
            // 
            // panelLBresenham
            // 
            panelLBresenham.BorderStyle = BorderStyle.FixedSingle;
            panelLBresenham.Location = new Point(796, 55);
            panelLBresenham.Margin = new Padding(2);
            panelLBresenham.Name = "panelLBresenham";
            panelLBresenham.Size = new Size(255, 213);
            panelLBresenham.TabIndex = 10;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label7.Location = new Point(598, 34);
            label7.Margin = new Padding(2, 0, 2, 0);
            label7.Name = "label7";
            label7.Size = new Size(45, 21);
            label7.TabIndex = 11;
            label7.Text = "DDA";
            label7.Click += label7_Click;
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label8.Location = new Point(881, 34);
            label8.Margin = new Padding(2, 0, 2, 0);
            label8.Name = "label8";
            label8.Size = new Size(95, 21);
            label8.TabIndex = 12;
            label8.Text = "Bresenham";
            // 
            // label9
            // 
            label9.AutoSize = true;
            label9.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label9.Location = new Point(8, 299);
            label9.Margin = new Padding(2, 0, 2, 0);
            label9.Name = "label9";
            label9.Size = new Size(288, 21);
            label9.TabIndex = 13;
            label9.Text = "Algoritma Penggambaran Lingkaran";
            // 
            // inputCY
            // 
            inputCY.Location = new Point(95, 355);
            inputCY.Margin = new Padding(2);
            inputCY.Name = "inputCY";
            inputCY.Size = new Size(37, 23);
            inputCY.TabIndex = 17;
            inputCY.TextAlign = HorizontalAlignment.Right;
            // 
            // inputCX
            // 
            inputCX.Location = new Point(53, 355);
            inputCX.Margin = new Padding(2);
            inputCX.Name = "inputCX";
            inputCX.Size = new Size(38, 23);
            inputCX.TabIndex = 16;
            inputCX.TextAlign = HorizontalAlignment.Right;
            // 
            // label10
            // 
            label10.AutoSize = true;
            label10.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label10.Location = new Point(103, 334);
            label10.Margin = new Padding(2, 0, 2, 0);
            label10.Name = "label10";
            label10.Size = new Size(19, 21);
            label10.TabIndex = 15;
            label10.Text = "Y";
            label10.TextAlign = ContentAlignment.MiddleCenter;
            label10.Click += label10_Click;
            // 
            // label11
            // 
            label11.AutoSize = true;
            label11.Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point);
            label11.Location = new Point(61, 334);
            label11.Margin = new Padding(2, 0, 2, 0);
            label11.Name = "label11";
            label11.Size = new Size(19, 21);
            label11.TabIndex = 14;
            label11.Text = "X";
            label11.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // inputRad
            // 
            inputRad.Location = new Point(74, 404);
            inputRad.Margin = new Padding(2);
            inputRad.Name = "inputRad";
            inputRad.Size = new Size(37, 23);
            inputRad.TabIndex = 21;
            inputRad.TextAlign = HorizontalAlignment.Right;
            // 
            // label12
            // 
            label12.AutoSize = true;
            label12.Font = new Font("Segoe UI", 9.75F, FontStyle.Regular, GraphicsUnit.Point);
            label12.Location = new Point(70, 385);
            label12.Margin = new Padding(2, 0, 2, 0);
            label12.Name = "label12";
            label12.Size = new Size(47, 17);
            label12.TabIndex = 19;
            label12.Text = "Radius";
            label12.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // buttonLine
            // 
            buttonLine.Location = new Point(53, 115);
            buttonLine.Margin = new Padding(2);
            buttonLine.Name = "buttonLine";
            buttonLine.Size = new Size(80, 30);
            buttonLine.TabIndex = 22;
            buttonLine.Text = "Gambar";
            buttonLine.UseVisualStyleBackColor = true;
            buttonLine.Click += btn_Garis_Click;
            // 
            // buttonCircle
            // 
            buttonCircle.Location = new Point(53, 431);
            buttonCircle.Margin = new Padding(2);
            buttonCircle.Name = "buttonCircle";
            buttonCircle.Size = new Size(80, 30);
            buttonCircle.TabIndex = 23;
            buttonCircle.Text = "Gambar";
            buttonCircle.UseVisualStyleBackColor = true;
            buttonCircle.Click += btn_Lngkrn_Click;
            // 
            // label13
            // 
            label13.AutoSize = true;
            label13.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label13.Location = new Point(881, 334);
            label13.Margin = new Padding(2, 0, 2, 0);
            label13.Name = "label13";
            label13.Size = new Size(95, 21);
            label13.TabIndex = 29;
            label13.Text = "Bresenham";
            // 
            // panelCBresenham
            // 
            panelCBresenham.BorderStyle = BorderStyle.FixedSingle;
            panelCBresenham.Location = new Point(796, 355);
            panelCBresenham.Margin = new Padding(2);
            panelCBresenham.Name = "panelCBresenham";
            panelCBresenham.Size = new Size(255, 213);
            panelCBresenham.TabIndex = 25;
            // 
            // label15
            // 
            label15.AutoSize = true;
            label15.Font = new Font("Segoe UI", 12F, FontStyle.Bold, GraphicsUnit.Point);
            label15.Location = new Point(280, 334);
            label15.Margin = new Padding(2, 0, 2, 0);
            label15.Name = "label15";
            label15.Size = new Size(53, 21);
            label15.TabIndex = 27;
            label15.Text = "Dasar";
            // 
            // panelCDasar
            // 
            panelCDasar.BorderStyle = BorderStyle.FixedSingle;
            panelCDasar.Location = new Point(188, 355);
            panelCDasar.Margin = new Padding(2);
            panelCDasar.Name = "panelCDasar";
            panelCDasar.Size = new Size(255, 213);
            panelCDasar.TabIndex = 24;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1062, 581);
            Controls.Add(label13);
            Controls.Add(panelCBresenham);
            Controls.Add(label15);
            Controls.Add(panelCDasar);
            Controls.Add(buttonCircle);
            Controls.Add(buttonLine);
            Controls.Add(inputRad);
            Controls.Add(label12);
            Controls.Add(inputCY);
            Controls.Add(inputCX);
            Controls.Add(label10);
            Controls.Add(label11);
            Controls.Add(label9);
            Controls.Add(label8);
            Controls.Add(label7);
            Controls.Add(panelLBresenham);
            Controls.Add(panelLDDA);
            Controls.Add(label6);
            Controls.Add(panelLDasar);
            Controls.Add(inputLY2);
            Controls.Add(inputLX2);
            Controls.Add(label5);
            Controls.Add(label4);
            Controls.Add(inputLY1);
            Controls.Add(inputLX1);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Margin = new Padding(2);
            Name = "Form1";
            Text = "Prames Ray Lapian - 140810210059";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
        private TextBox inputLX1;
        private TextBox inputLY1;
        private Label label4;
        private Label label5;
        private TextBox inputLX2;
        private TextBox inputLY2;
        private Panel panelLDasar;
        private Label label6;
        private Panel panelLDDA;
        private Panel panelLBresenham;
        private Label label7;
        private Label label8;
        private Label label9;
        private TextBox inputCY;
        private TextBox inputCX;
        private Label label10;
        private Label label11;
        private TextBox inputRad;
        private Label label12;
        private Button buttonLine;
        private Button buttonCircle;
        private Label label13;
        private Panel panelCBresenham;
        private Label label15;
        private Panel panelCDasar;
    }
}