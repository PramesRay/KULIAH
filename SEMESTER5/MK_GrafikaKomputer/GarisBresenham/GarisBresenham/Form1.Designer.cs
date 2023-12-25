namespace GarisBresenham
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
            this.panelLBresenham = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.inputX1 = new System.Windows.Forms.TextBox();
            this.inputY1 = new System.Windows.Forms.TextBox();
            this.inputX2 = new System.Windows.Forms.TextBox();
            this.inputY2 = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.buttonDraw = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // panelLBresenham
            // 
            this.panelLBresenham.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panelLBresenham.Location = new System.Drawing.Point(47, 148);
            this.panelLBresenham.Name = "panelLBresenham";
            this.panelLBresenham.Size = new System.Drawing.Size(256, 256);
            this.panelLBresenham.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(17, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(318, 24);
            this.label1.TabIndex = 1;
            this.label1.Text = "Penggambaran Garis Bresenham";
            // 
            // inputX1
            // 
            this.inputX1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputX1.Location = new System.Drawing.Point(145, 61);
            this.inputX1.Name = "inputX1";
            this.inputX1.Size = new System.Drawing.Size(30, 22);
            this.inputX1.TabIndex = 2;
            this.inputX1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // inputY1
            // 
            this.inputY1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputY1.Location = new System.Drawing.Point(181, 61);
            this.inputY1.Name = "inputY1";
            this.inputY1.Size = new System.Drawing.Size(30, 22);
            this.inputY1.TabIndex = 3;
            this.inputY1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // inputX2
            // 
            this.inputX2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputX2.Location = new System.Drawing.Point(145, 87);
            this.inputX2.Name = "inputX2";
            this.inputX2.Size = new System.Drawing.Size(30, 22);
            this.inputX2.TabIndex = 4;
            this.inputX2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // inputY2
            // 
            this.inputY2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputY2.Location = new System.Drawing.Point(181, 87);
            this.inputY2.Name = "inputY2";
            this.inputY2.Size = new System.Drawing.Size(30, 22);
            this.inputY2.TabIndex = 5;
            this.inputY2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(151, 42);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(15, 16);
            this.label2.TabIndex = 6;
            this.label2.Text = "X";
            this.label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(188, 42);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(16, 16);
            this.label3.TabIndex = 7;
            this.label3.Text = "Y";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(124, 64);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(14, 16);
            this.label4.TabIndex = 8;
            this.label4.Text = "1";
            this.label4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(124, 90);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(14, 16);
            this.label5.TabIndex = 9;
            this.label5.Text = "2";
            this.label5.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // buttonDraw
            // 
            this.buttonDraw.Location = new System.Drawing.Point(146, 115);
            this.buttonDraw.Name = "buttonDraw";
            this.buttonDraw.Size = new System.Drawing.Size(58, 27);
            this.buttonDraw.TabIndex = 10;
            this.buttonDraw.Text = "DRAW !";
            this.buttonDraw.UseVisualStyleBackColor = true;
            this.buttonDraw.Click += new System.EventHandler(this.buttonDraw_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(355, 429);
            this.Controls.Add(this.buttonDraw);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.inputY2);
            this.Controls.Add(this.inputX2);
            this.Controls.Add(this.inputY1);
            this.Controls.Add(this.inputX1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.panelLBresenham);
            this.Name = "Form1";
            this.Text = "Prames Ray Lapian - 140810210059";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel panelLBresenham;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox inputX1;
        private System.Windows.Forms.TextBox inputY1;
        private System.Windows.Forms.TextBox inputX2;
        private System.Windows.Forms.TextBox inputY2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button buttonDraw;
    }
}

