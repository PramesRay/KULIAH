namespace PRAKTIKUM2
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
            this.components = new System.ComponentModel.Container();
            this.x1Input = new System.Windows.Forms.TextBox();
            this.y1Input = new System.Windows.Forms.TextBox();
            this.canvas = new System.Windows.Forms.Panel();
            this.xInput_Label = new System.Windows.Forms.Label();
            this.yInput_Label = new System.Windows.Forms.Label();
            this.drawDots = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.y2Input = new System.Windows.Forms.TextBox();
            this.x2Input = new System.Windows.Forms.TextBox();
            this.drawLine = new System.Windows.Forms.Button();
            this.generateButton = new System.Windows.Forms.Button();
            this.refresh = new System.Windows.Forms.Button();
            this.contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.panel1 = new System.Windows.Forms.Panel();
            this.SuspendLayout();
            // 
            // x1Input
            // 
            this.x1Input.Location = new System.Drawing.Point(12, 94);
            this.x1Input.Name = "x1Input";
            this.x1Input.Size = new System.Drawing.Size(100, 20);
            this.x1Input.TabIndex = 0;
            // 
            // y1Input
            // 
            this.y1Input.Location = new System.Drawing.Point(140, 94);
            this.y1Input.Name = "y1Input";
            this.y1Input.Size = new System.Drawing.Size(100, 20);
            this.y1Input.TabIndex = 1;
            // 
            // canvas
            // 
            this.canvas.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.canvas.Location = new System.Drawing.Point(302, 79);
            this.canvas.Name = "canvas";
            this.canvas.Size = new System.Drawing.Size(270, 270);
            this.canvas.TabIndex = 2;
            // 
            // xInput_Label
            // 
            this.xInput_Label.AutoSize = true;
            this.xInput_Label.Location = new System.Drawing.Point(13, 75);
            this.xInput_Label.Name = "xInput_Label";
            this.xInput_Label.Size = new System.Drawing.Size(17, 13);
            this.xInput_Label.TabIndex = 3;
            this.xInput_Label.Text = "X:";
            this.xInput_Label.Click += new System.EventHandler(this.label2_Click);
            // 
            // yInput_Label
            // 
            this.yInput_Label.AutoSize = true;
            this.yInput_Label.Location = new System.Drawing.Point(137, 75);
            this.yInput_Label.Name = "yInput_Label";
            this.yInput_Label.Size = new System.Drawing.Size(17, 13);
            this.yInput_Label.TabIndex = 4;
            this.yInput_Label.Text = "Y:";
            // 
            // drawDots
            // 
            this.drawDots.Location = new System.Drawing.Point(16, 229);
            this.drawDots.Name = "drawDots";
            this.drawDots.Size = new System.Drawing.Size(75, 23);
            this.drawDots.TabIndex = 5;
            this.drawDots.Text = "Draw Dots";
            this.drawDots.UseVisualStyleBackColor = true;
            this.drawDots.Click += new System.EventHandler(this.DrawDots_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(137, 136);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(17, 13);
            this.label1.TabIndex = 9;
            this.label1.Text = "Y:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(13, 136);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(17, 13);
            this.label2.TabIndex = 8;
            this.label2.Text = "X:";
            // 
            // y2Input
            // 
            this.y2Input.Location = new System.Drawing.Point(140, 155);
            this.y2Input.Name = "y2Input";
            this.y2Input.Size = new System.Drawing.Size(100, 20);
            this.y2Input.TabIndex = 7;
            // 
            // x2Input
            // 
            this.x2Input.Location = new System.Drawing.Point(12, 155);
            this.x2Input.Name = "x2Input";
            this.x2Input.Size = new System.Drawing.Size(100, 20);
            this.x2Input.TabIndex = 6;
            // 
            // drawLine
            // 
            this.drawLine.Location = new System.Drawing.Point(16, 258);
            this.drawLine.Name = "drawLine";
            this.drawLine.Size = new System.Drawing.Size(75, 23);
            this.drawLine.TabIndex = 10;
            this.drawLine.Text = "Draw Line";
            this.drawLine.UseVisualStyleBackColor = true;
            this.drawLine.Click += new System.EventHandler(this.DrawLine_Click);
            // 
            // generateButton
            // 
            this.generateButton.Location = new System.Drawing.Point(302, 50);
            this.generateButton.Name = "generateButton";
            this.generateButton.Size = new System.Drawing.Size(75, 23);
            this.generateButton.TabIndex = 11;
            this.generateButton.Text = "Generate";
            this.generateButton.UseVisualStyleBackColor = true;
            this.generateButton.Click += new System.EventHandler(this.generateButton_Click);
            // 
            // refresh
            // 
            this.refresh.Location = new System.Drawing.Point(16, 287);
            this.refresh.Name = "refresh";
            this.refresh.Size = new System.Drawing.Size(75, 23);
            this.refresh.TabIndex = 12;
            this.refresh.Text = "Refresh";
            this.refresh.UseVisualStyleBackColor = true;
            this.refresh.Click += new System.EventHandler(this.Refresh_Click_1);
            // 
            // contextMenuStrip1
            // 
            this.contextMenuStrip1.Name = "contextMenuStrip1";
            this.contextMenuStrip1.Size = new System.Drawing.Size(61, 4);
            // 
            // panel1
            // 
            this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel1.Location = new System.Drawing.Point(107, 198);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(178, 151);
            this.panel1.TabIndex = 3;
            this.panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.panel1_Paint);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(584, 361);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.refresh);
            this.Controls.Add(this.generateButton);
            this.Controls.Add(this.drawLine);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.y2Input);
            this.Controls.Add(this.x2Input);
            this.Controls.Add(this.drawDots);
            this.Controls.Add(this.yInput_Label);
            this.Controls.Add(this.xInput_Label);
            this.Controls.Add(this.canvas);
            this.Controls.Add(this.y1Input);
            this.Controls.Add(this.x1Input);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox x1Input;
        private System.Windows.Forms.TextBox y1Input;
        private System.Windows.Forms.Panel canvas;
        private System.Windows.Forms.Label xInput_Label;
        private System.Windows.Forms.Label yInput_Label;
        private System.Windows.Forms.Button drawDots;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox y2Input;
        private System.Windows.Forms.TextBox x2Input;
        private System.Windows.Forms.Button drawLine;
        private System.Windows.Forms.Button generateButton;
        private System.Windows.Forms.Button refresh;
        private System.Windows.Forms.ContextMenuStrip contextMenuStrip1;
        private System.Windows.Forms.Panel panel1;
    }
}

