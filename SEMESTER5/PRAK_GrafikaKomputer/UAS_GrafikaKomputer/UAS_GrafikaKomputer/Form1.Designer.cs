using System;

namespace UAS_GrafikaKomputer
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.groupBox5 = new System.Windows.Forms.GroupBox();
            this.groupBox6 = new System.Windows.Forms.GroupBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.inputYTranslate = new System.Windows.Forms.TextBox();
            this.inputXTranslate = new System.Windows.Forms.TextBox();
            this.buttonTranslate = new System.Windows.Forms.Button();
            this.inputDegRotate = new System.Windows.Forms.TextBox();
            this.buttonRotate = new System.Windows.Forms.Button();
            this.inputXScale = new System.Windows.Forms.TextBox();
            this.inputYScale = new System.Windows.Forms.TextBox();
            this.buttonScale = new System.Windows.Forms.Button();
            this.inputIdx = new System.Windows.Forms.TextBox();
            this.buttonRemoveIdx = new System.Windows.Forms.Button();
            this.inputIdx1 = new System.Windows.Forms.TextBox();
            this.inputIdx2 = new System.Windows.Forms.TextBox();
            this.buttonSwap = new System.Windows.Forms.Button();
            this.buttonShowTransform = new System.Windows.Forms.Button();
            this.buttonDraw = new System.Windows.Forms.Button();
            this.buttonReset = new System.Windows.Forms.Button();
            this.addFile = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox3.SuspendLayout();
            this.groupBox4.SuspendLayout();
            this.groupBox5.SuspendLayout();
            this.groupBox6.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel1.Location = new System.Drawing.Point(238, 213);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(256, 256);
            this.panel1.TabIndex = 0;
            this.panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.panel1_Paint);
            // 
            // panel2
            // 
            this.panel2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel2.Location = new System.Drawing.Point(528, 213);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(256, 256);
            this.panel2.TabIndex = 1;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.buttonReset);
            this.groupBox1.Controls.Add(this.addFile);
            this.groupBox1.Controls.Add(this.buttonDraw);
            this.groupBox1.Controls.Add(this.buttonShowTransform);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.groupBox6);
            this.groupBox1.Controls.Add(this.groupBox5);
            this.groupBox1.Controls.Add(this.groupBox4);
            this.groupBox1.Controls.Add(this.groupBox3);
            this.groupBox1.Controls.Add(this.groupBox2);
            this.groupBox1.Controls.Add(this.panel1);
            this.groupBox1.Controls.Add(this.panel2);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(824, 524);
            this.groupBox1.TabIndex = 2;
            this.groupBox1.TabStop = false;
            // 
            // addFile
            // 
            this.addFile.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.addFile.Location = new System.Drawing.Point(687, 475);
            this.addFile.Name = "addFile";
            this.addFile.Size = new System.Drawing.Size(97, 32);
            this.addFile.TabIndex = 16;
            this.addFile.Text = "Add Image";
            this.addFile.UseVisualStyleBackColor = true;
            this.addFile.Click += new System.EventHandler(this.addFile_Click);
            // 
            // buttonDraw
            // 
            this.buttonDraw.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonDraw.Location = new System.Drawing.Point(22, 475);
            this.buttonDraw.Name = "buttonDraw";
            this.buttonDraw.Size = new System.Drawing.Size(187, 32);
            this.buttonDraw.TabIndex = 17;
            this.buttonDraw.Text = "Draw !";
            this.buttonDraw.UseVisualStyleBackColor = true;
            this.buttonDraw.Click += new System.EventHandler(this.buttonDraw_Click_1);
            // 
            // buttonShowTransform
            // 
            this.buttonShowTransform.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonShowTransform.Location = new System.Drawing.Point(22, 437);
            this.buttonShowTransform.Name = "buttonShowTransform";
            this.buttonShowTransform.Size = new System.Drawing.Size(187, 32);
            this.buttonShowTransform.TabIndex = 16;
            this.buttonShowTransform.Text = "Show Transformation";
            this.buttonShowTransform.UseVisualStyleBackColor = true;
            this.buttonShowTransform.Click += new System.EventHandler(this.buttonShowTransform_Click_1);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(525, 194);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(34, 16);
            this.label2.TabIndex = 6;
            this.label2.Text = "After";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(235, 194);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(47, 16);
            this.label1.TabIndex = 5;
            this.label1.Text = "Before";
            // 
            // groupBox6
            // 
            this.groupBox6.Controls.Add(this.label10);
            this.groupBox6.Controls.Add(this.label9);
            this.groupBox6.Controls.Add(this.inputIdx2);
            this.groupBox6.Controls.Add(this.inputIdx1);
            this.groupBox6.Controls.Add(this.buttonSwap);
            this.groupBox6.Location = new System.Drawing.Point(22, 305);
            this.groupBox6.Name = "groupBox6";
            this.groupBox6.Size = new System.Drawing.Size(187, 117);
            this.groupBox6.TabIndex = 4;
            this.groupBox6.TabStop = false;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.Location = new System.Drawing.Point(83, 21);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(24, 16);
            this.label10.TabIndex = 14;
            this.label10.Text = "idx";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label9.Location = new System.Drawing.Point(85, 48);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(24, 24);
            this.label9.TabIndex = 14;
            this.label9.Text = "⇆";
            // 
            // inputIdx2
            // 
            this.inputIdx2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputIdx2.Location = new System.Drawing.Point(117, 51);
            this.inputIdx2.Name = "inputIdx2";
            this.inputIdx2.Size = new System.Drawing.Size(40, 22);
            this.inputIdx2.TabIndex = 15;
            this.inputIdx2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // inputIdx1
            // 
            this.inputIdx1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputIdx1.Location = new System.Drawing.Point(37, 51);
            this.inputIdx1.Name = "inputIdx1";
            this.inputIdx1.Size = new System.Drawing.Size(40, 22);
            this.inputIdx1.TabIndex = 14;
            this.inputIdx1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // buttonSwap
            // 
            this.buttonSwap.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonSwap.Location = new System.Drawing.Point(47, 79);
            this.buttonSwap.Name = "buttonSwap";
            this.buttonSwap.Size = new System.Drawing.Size(97, 32);
            this.buttonSwap.TabIndex = 14;
            this.buttonSwap.Text = "Swap";
            this.buttonSwap.UseVisualStyleBackColor = true;
            this.buttonSwap.Click += new System.EventHandler(this.buttonSwap_Click_1);
            // 
            // groupBox5
            // 
            this.groupBox5.Controls.Add(this.buttonRemoveIdx);
            this.groupBox5.Controls.Add(this.label8);
            this.groupBox5.Controls.Add(this.inputIdx);
            this.groupBox5.Location = new System.Drawing.Point(22, 159);
            this.groupBox5.Name = "groupBox5";
            this.groupBox5.Size = new System.Drawing.Size(187, 117);
            this.groupBox5.TabIndex = 3;
            this.groupBox5.TabStop = false;
            // 
            // buttonRemoveIdx
            // 
            this.buttonRemoveIdx.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonRemoveIdx.Location = new System.Drawing.Point(73, 45);
            this.buttonRemoveIdx.Name = "buttonRemoveIdx";
            this.buttonRemoveIdx.Size = new System.Drawing.Size(97, 32);
            this.buttonRemoveIdx.TabIndex = 13;
            this.buttonRemoveIdx.Text = "Remove";
            this.buttonRemoveIdx.UseVisualStyleBackColor = true;
            this.buttonRemoveIdx.Click += new System.EventHandler(this.buttonRemoveIdx_Click_1);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(32, 45);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(24, 16);
            this.label8.TabIndex = 12;
            this.label8.Text = "idx";
            // 
            // inputIdx
            // 
            this.inputIdx.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputIdx.Location = new System.Drawing.Point(24, 64);
            this.inputIdx.Name = "inputIdx";
            this.inputIdx.Size = new System.Drawing.Size(40, 22);
            this.inputIdx.TabIndex = 11;
            this.inputIdx.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.buttonScale);
            this.groupBox4.Controls.Add(this.label6);
            this.groupBox4.Controls.Add(this.inputXScale);
            this.groupBox4.Controls.Add(this.inputYScale);
            this.groupBox4.Controls.Add(this.label7);
            this.groupBox4.Location = new System.Drawing.Point(562, 28);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(240, 101);
            this.groupBox4.TabIndex = 3;
            this.groupBox4.TabStop = false;
            // 
            // buttonScale
            // 
            this.buttonScale.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonScale.Location = new System.Drawing.Point(125, 36);
            this.buttonScale.Name = "buttonScale";
            this.buttonScale.Size = new System.Drawing.Size(97, 32);
            this.buttonScale.TabIndex = 15;
            this.buttonScale.Text = "+ Scale";
            this.buttonScale.UseVisualStyleBackColor = true;
            this.buttonScale.Click += new System.EventHandler(this.buttonScale_Click_1);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(89, 36);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(16, 16);
            this.label6.TabIndex = 14;
            this.label6.Text = "Y";
            // 
            // inputXScale
            // 
            this.inputXScale.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputXScale.Location = new System.Drawing.Point(19, 55);
            this.inputXScale.Name = "inputXScale";
            this.inputXScale.Size = new System.Drawing.Size(40, 22);
            this.inputXScale.TabIndex = 11;
            this.inputXScale.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // inputYScale
            // 
            this.inputYScale.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputYScale.Location = new System.Drawing.Point(76, 55);
            this.inputYScale.Name = "inputYScale";
            this.inputYScale.Size = new System.Drawing.Size(40, 22);
            this.inputYScale.TabIndex = 13;
            this.inputYScale.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(32, 36);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(15, 16);
            this.label7.TabIndex = 12;
            this.label7.Text = "X";
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.buttonRotate);
            this.groupBox3.Controls.Add(this.label5);
            this.groupBox3.Controls.Add(this.inputDegRotate);
            this.groupBox3.Location = new System.Drawing.Point(292, 28);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(240, 101);
            this.groupBox3.TabIndex = 3;
            this.groupBox3.TabStop = false;
            // 
            // buttonRotate
            // 
            this.buttonRotate.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonRotate.Location = new System.Drawing.Point(118, 36);
            this.buttonRotate.Name = "buttonRotate";
            this.buttonRotate.Size = new System.Drawing.Size(97, 32);
            this.buttonRotate.TabIndex = 13;
            this.buttonRotate.Text = "+ Rotation";
            this.buttonRotate.UseVisualStyleBackColor = true;
            this.buttonRotate.Click += new System.EventHandler(this.buttonRotate_Click_1);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(16, 36);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(56, 16);
            this.label5.TabIndex = 12;
            this.label5.Text = "deg CW";
            // 
            // inputDegRotate
            // 
            this.inputDegRotate.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputDegRotate.Location = new System.Drawing.Point(23, 55);
            this.inputDegRotate.Name = "inputDegRotate";
            this.inputDegRotate.Size = new System.Drawing.Size(40, 22);
            this.inputDegRotate.TabIndex = 11;
            this.inputDegRotate.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.buttonTranslate);
            this.groupBox2.Controls.Add(this.label4);
            this.groupBox2.Controls.Add(this.inputYTranslate);
            this.groupBox2.Controls.Add(this.label3);
            this.groupBox2.Controls.Add(this.inputXTranslate);
            this.groupBox2.Location = new System.Drawing.Point(22, 28);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(240, 101);
            this.groupBox2.TabIndex = 2;
            this.groupBox2.TabStop = false;
            // 
            // buttonTranslate
            // 
            this.buttonTranslate.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonTranslate.Location = new System.Drawing.Point(122, 36);
            this.buttonTranslate.Name = "buttonTranslate";
            this.buttonTranslate.Size = new System.Drawing.Size(97, 32);
            this.buttonTranslate.TabIndex = 10;
            this.buttonTranslate.Text = "+ Translation";
            this.buttonTranslate.UseVisualStyleBackColor = true;
            this.buttonTranslate.Click += new System.EventHandler(this.buttonTranslate_Click_1);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(86, 36);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(16, 16);
            this.label4.TabIndex = 9;
            this.label4.Text = "Y";
            // 
            // inputYTranslate
            // 
            this.inputYTranslate.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputYTranslate.Location = new System.Drawing.Point(73, 55);
            this.inputYTranslate.Name = "inputYTranslate";
            this.inputYTranslate.Size = new System.Drawing.Size(40, 22);
            this.inputYTranslate.TabIndex = 8;
            this.inputYTranslate.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(29, 36);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(15, 16);
            this.label3.TabIndex = 7;
            this.label3.Text = "X";
            // 
            // inputXTranslate
            // 
            this.inputXTranslate.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.inputXTranslate.Location = new System.Drawing.Point(16, 55);
            this.inputXTranslate.Name = "inputXTranslate";
            this.inputXTranslate.Size = new System.Drawing.Size(40, 22);
            this.inputXTranslate.TabIndex = 0;
            this.inputXTranslate.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // buttonReset
            // 
            this.buttonReset.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.buttonReset.Location = new System.Drawing.Point(238, 475);
            this.buttonReset.Name = "buttonReset";
            this.buttonReset.Size = new System.Drawing.Size(97, 32);
            this.buttonReset.TabIndex = 18;
            this.buttonReset.Text = "Reset Log";
            this.buttonReset.UseVisualStyleBackColor = true;
            this.buttonReset.Click += new System.EventHandler(this.buttonReset_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(842, 548);
            this.Controls.Add(this.groupBox1);
            this.Name = "Form1";
            this.Text = "UAS_140810210059_140810210088";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox6.ResumeLayout(false);
            this.groupBox6.PerformLayout();
            this.groupBox5.ResumeLayout(false);
            this.groupBox5.PerformLayout();
            this.groupBox4.ResumeLayout(false);
            this.groupBox4.PerformLayout();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }



        private void buttonRotate_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        private void buttonScale_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        private void buttonRemoveIdx_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        private void buttonSwap_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        private void buttonShowTransform_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        private void buttonDraw_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.GroupBox groupBox6;
        private System.Windows.Forms.GroupBox groupBox5;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.TextBox inputXTranslate;
        private System.Windows.Forms.TextBox inputYTranslate;
        private System.Windows.Forms.Button buttonTranslate;
        private System.Windows.Forms.TextBox inputDegRotate;
        private System.Windows.Forms.Button buttonRotate;
        private System.Windows.Forms.TextBox inputXScale;
        private System.Windows.Forms.TextBox inputYScale;
        private System.Windows.Forms.Button buttonScale;
        private System.Windows.Forms.TextBox inputIdx;
        private System.Windows.Forms.Button buttonRemoveIdx;
        private System.Windows.Forms.Button buttonDraw;
        private System.Windows.Forms.TextBox inputIdx1;
        private System.Windows.Forms.TextBox inputIdx2;
        private System.Windows.Forms.Button buttonSwap;
        private System.Windows.Forms.Button buttonShowTransform;
        private System.Windows.Forms.Button buttonReset;
        private System.Windows.Forms.Button addFile;
    }
}

