namespace Tugas8
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
            panel1 = new Panel();
            panel2 = new Panel();
            inputTranR = new TextBox();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            inputTranG = new TextBox();
            label4 = new Label();
            inputTranB = new TextBox();
            label5 = new Label();
            inputTranA = new TextBox();
            buttonTranslate = new Button();
            label6 = new Label();
            label7 = new Label();
            label8 = new Label();
            inputRotate = new TextBox();
            menuStrip1 = new MenuStrip();
            openToolStripMenuItem = new ToolStripMenuItem();
            rToolStripMenuItem = new ToolStripMenuItem();
            rCenterRotate = new ToolStripTextBox();
            gToolStripMenuItem = new ToolStripMenuItem();
            gCenterRotate = new ToolStripTextBox();
            bToolStripMenuItem = new ToolStripMenuItem();
            bCenterRotate = new ToolStripTextBox();
            buttonFile = new Button();
            buttonRotate = new Button();
            inputA00 = new TextBox();
            inputA10 = new TextBox();
            inputA20 = new TextBox();
            buttonSheer = new Button();
            inputA21 = new TextBox();
            inputA11 = new TextBox();
            inputA01 = new TextBox();
            inputA22 = new TextBox();
            inputA12 = new TextBox();
            inputA02 = new TextBox();
            inputA23 = new TextBox();
            inputA13 = new TextBox();
            inputA03 = new TextBox();
            panel0 = new Panel();
            menuStrip1.SuspendLayout();
            panel0.SuspendLayout();
            SuspendLayout();
            // 
            // panel1
            // 
            panel1.BorderStyle = BorderStyle.FixedSingle;
            panel1.Location = new Point(22, 227);
            panel1.Margin = new Padding(2);
            panel1.Name = "panel1";
            panel1.Size = new Size(256, 256);
            panel1.TabIndex = 0;
            // 
            // panel2
            // 
            panel2.BorderStyle = BorderStyle.FixedSingle;
            panel2.Location = new Point(364, 227);
            panel2.Margin = new Padding(2);
            panel2.Name = "panel2";
            panel2.Size = new Size(256, 256);
            panel2.TabIndex = 1;
            // 
            // inputTranR
            // 
            inputTranR.Location = new Point(32, 60);
            inputTranR.Margin = new Padding(2);
            inputTranR.Name = "inputTranR";
            inputTranR.Size = new Size(32, 23);
            inputTranR.TabIndex = 2;
            inputTranR.TextAlign = HorizontalAlignment.Center;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(22, 18);
            label1.Margin = new Padding(2, 0, 2, 0);
            label1.Name = "label1";
            label1.Size = new Size(51, 15);
            label1.TabIndex = 3;
            label1.Text = "Translasi";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(41, 43);
            label2.Margin = new Padding(2, 0, 2, 0);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 4;
            label2.Text = "R";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(92, 43);
            label3.Margin = new Padding(2, 0, 2, 0);
            label3.Name = "label3";
            label3.Size = new Size(15, 15);
            label3.TabIndex = 6;
            label3.Text = "G";
            // 
            // inputTranG
            // 
            inputTranG.Location = new Point(84, 60);
            inputTranG.Margin = new Padding(2);
            inputTranG.Name = "inputTranG";
            inputTranG.Size = new Size(32, 23);
            inputTranG.TabIndex = 5;
            inputTranG.TextAlign = HorizontalAlignment.Center;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(148, 43);
            label4.Margin = new Padding(2, 0, 2, 0);
            label4.Name = "label4";
            label4.Size = new Size(14, 15);
            label4.TabIndex = 8;
            label4.Text = "B";
            // 
            // inputTranB
            // 
            inputTranB.Location = new Point(139, 60);
            inputTranB.Margin = new Padding(2);
            inputTranB.Name = "inputTranB";
            inputTranB.Size = new Size(32, 23);
            inputTranB.TabIndex = 7;
            inputTranB.TextAlign = HorizontalAlignment.Center;
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(208, 43);
            label5.Margin = new Padding(2, 0, 2, 0);
            label5.Name = "label5";
            label5.Size = new Size(15, 15);
            label5.TabIndex = 10;
            label5.Text = "A";
            // 
            // inputTranA
            // 
            inputTranA.Location = new Point(200, 60);
            inputTranA.Margin = new Padding(2);
            inputTranA.Name = "inputTranA";
            inputTranA.Size = new Size(32, 23);
            inputTranA.TabIndex = 9;
            inputTranA.TextAlign = HorizontalAlignment.Center;
            // 
            // buttonTranslate
            // 
            buttonTranslate.Location = new Point(282, 55);
            buttonTranslate.Margin = new Padding(2);
            buttonTranslate.Name = "buttonTranslate";
            buttonTranslate.Size = new Size(78, 30);
            buttonTranslate.TabIndex = 11;
            buttonTranslate.Text = "Translate";
            buttonTranslate.UseVisualStyleBackColor = true;
            buttonTranslate.Click += btTranslate_Click;
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(22, 107);
            label6.Margin = new Padding(2, 0, 2, 0);
            label6.Name = "label6";
            label6.Size = new Size(41, 15);
            label6.TabIndex = 12;
            label6.Text = "Rotate";
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(32, 134);
            label7.Margin = new Padding(2, 0, 2, 0);
            label7.Name = "label7";
            label7.Size = new Size(44, 15);
            label7.TabIndex = 13;
            label7.Text = "Derajat";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(32, 167);
            label8.Margin = new Padding(2, 0, 2, 0);
            label8.Name = "label8";
            label8.Size = new Size(36, 15);
            label8.TabIndex = 14;
            label8.Text = "Pusat";
            // 
            // inputRotate
            // 
            inputRotate.Location = new Point(92, 134);
            inputRotate.Margin = new Padding(2);
            inputRotate.Name = "inputRotate";
            inputRotate.Size = new Size(34, 23);
            inputRotate.TabIndex = 15;
            inputRotate.TextAlign = HorizontalAlignment.Center;
            // 
            // menuStrip1
            // 
            menuStrip1.Dock = DockStyle.None;
            menuStrip1.ImageScalingSize = new Size(24, 24);
            menuStrip1.Items.AddRange(new ToolStripItem[] { openToolStripMenuItem });
            menuStrip1.Location = new Point(38, 182);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Padding = new Padding(4, 1, 0, 1);
            menuStrip1.Size = new Size(54, 24);
            menuStrip1.TabIndex = 16;
            menuStrip1.Text = "menuStrip1";
            // 
            // openToolStripMenuItem
            // 
            openToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { rToolStripMenuItem, gToolStripMenuItem, bToolStripMenuItem });
            openToolStripMenuItem.Name = "openToolStripMenuItem";
            openToolStripMenuItem.Size = new Size(48, 22);
            openToolStripMenuItem.Text = "Open";
            // 
            // rToolStripMenuItem
            // 
            rToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { rCenterRotate });
            rToolStripMenuItem.Name = "rToolStripMenuItem";
            rToolStripMenuItem.Size = new Size(180, 22);
            rToolStripMenuItem.Text = "R";
            // 
            // rCenterRotate
            // 
            rCenterRotate.Name = "rCenterRotate";
            rCenterRotate.Size = new Size(100, 23);
            // 
            // gToolStripMenuItem
            // 
            gToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { gCenterRotate });
            gToolStripMenuItem.Name = "gToolStripMenuItem";
            gToolStripMenuItem.Size = new Size(180, 22);
            gToolStripMenuItem.Text = "G";
            // 
            // gCenterRotate
            // 
            gCenterRotate.Name = "gCenterRotate";
            gCenterRotate.Size = new Size(100, 23);
            // 
            // bToolStripMenuItem
            // 
            bToolStripMenuItem.DropDownItems.AddRange(new ToolStripItem[] { bCenterRotate });
            bToolStripMenuItem.Name = "bToolStripMenuItem";
            bToolStripMenuItem.Size = new Size(180, 22);
            bToolStripMenuItem.Text = "B";
            // 
            // bCenterRotate
            // 
            bCenterRotate.Name = "bCenterRotate";
            bCenterRotate.Size = new Size(100, 23);
            // 
            // buttonFile
            // 
            buttonFile.Location = new Point(282, 343);
            buttonFile.Margin = new Padding(2);
            buttonFile.Name = "buttonFile";
            buttonFile.Size = new Size(78, 30);
            buttonFile.TabIndex = 17;
            buttonFile.Text = "Open File";
            buttonFile.UseVisualStyleBackColor = true;
            buttonFile.Click += openFilebtn_Click;
            // 
            // buttonRotate
            // 
            buttonRotate.Location = new Point(282, 126);
            buttonRotate.Margin = new Padding(2);
            buttonRotate.Name = "buttonRotate";
            buttonRotate.Size = new Size(78, 30);
            buttonRotate.TabIndex = 18;
            buttonRotate.Text = "Rotate";
            buttonRotate.UseVisualStyleBackColor = true;
            buttonRotate.Click += rotateBtn_Click;
            // 
            // inputA00
            // 
            inputA00.Location = new Point(19, 11);
            inputA00.Margin = new Padding(2);
            inputA00.Name = "inputA00";
            inputA00.Size = new Size(32, 23);
            inputA00.TabIndex = 19;
            inputA00.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA10
            // 
            inputA10.Location = new Point(19, 46);
            inputA10.Margin = new Padding(2);
            inputA10.Name = "inputA10";
            inputA10.Size = new Size(32, 23);
            inputA10.TabIndex = 20;
            inputA10.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA20
            // 
            inputA20.Location = new Point(19, 85);
            inputA20.Margin = new Padding(2);
            inputA20.Name = "inputA20";
            inputA20.Size = new Size(32, 23);
            inputA20.TabIndex = 21;
            inputA20.TextAlign = HorizontalAlignment.Center;
            // 
            // buttonSheer
            // 
            buttonSheer.Location = new Point(463, 169);
            buttonSheer.Margin = new Padding(2);
            buttonSheer.Name = "buttonSheer";
            buttonSheer.Size = new Size(78, 30);
            buttonSheer.TabIndex = 25;
            buttonSheer.Text = "Shear";
            buttonSheer.UseVisualStyleBackColor = true;
            buttonSheer.Click += sheerBtn_Click;
            // 
            // inputA21
            // 
            inputA21.Location = new Point(66, 85);
            inputA21.Margin = new Padding(2);
            inputA21.Name = "inputA21";
            inputA21.Size = new Size(32, 23);
            inputA21.TabIndex = 28;
            inputA21.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA11
            // 
            inputA11.Location = new Point(66, 46);
            inputA11.Margin = new Padding(2);
            inputA11.Name = "inputA11";
            inputA11.Size = new Size(32, 23);
            inputA11.TabIndex = 27;
            inputA11.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA01
            // 
            inputA01.Location = new Point(66, 11);
            inputA01.Margin = new Padding(2);
            inputA01.Name = "inputA01";
            inputA01.Size = new Size(32, 23);
            inputA01.TabIndex = 26;
            inputA01.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA22
            // 
            inputA22.Location = new Point(113, 85);
            inputA22.Margin = new Padding(2);
            inputA22.Name = "inputA22";
            inputA22.Size = new Size(32, 23);
            inputA22.TabIndex = 31;
            inputA22.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA12
            // 
            inputA12.Location = new Point(113, 46);
            inputA12.Margin = new Padding(2);
            inputA12.Name = "inputA12";
            inputA12.Size = new Size(32, 23);
            inputA12.TabIndex = 30;
            inputA12.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA02
            // 
            inputA02.Location = new Point(113, 11);
            inputA02.Margin = new Padding(2);
            inputA02.Name = "inputA02";
            inputA02.Size = new Size(32, 23);
            inputA02.TabIndex = 29;
            inputA02.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA23
            // 
            inputA23.Location = new Point(160, 85);
            inputA23.Margin = new Padding(2);
            inputA23.Name = "inputA23";
            inputA23.Size = new Size(32, 23);
            inputA23.TabIndex = 34;
            inputA23.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA13
            // 
            inputA13.Location = new Point(160, 46);
            inputA13.Margin = new Padding(2);
            inputA13.Name = "inputA13";
            inputA13.Size = new Size(32, 23);
            inputA13.TabIndex = 33;
            inputA13.TextAlign = HorizontalAlignment.Center;
            // 
            // inputA03
            // 
            inputA03.Location = new Point(160, 11);
            inputA03.Margin = new Padding(2);
            inputA03.Name = "inputA03";
            inputA03.Size = new Size(32, 23);
            inputA03.TabIndex = 32;
            inputA03.TextAlign = HorizontalAlignment.Center;
            // 
            // panel0
            // 
            panel0.BorderStyle = BorderStyle.FixedSingle;
            panel0.Controls.Add(inputA23);
            panel0.Controls.Add(inputA13);
            panel0.Controls.Add(inputA03);
            panel0.Controls.Add(inputA22);
            panel0.Controls.Add(inputA12);
            panel0.Controls.Add(inputA02);
            panel0.Controls.Add(inputA21);
            panel0.Controls.Add(inputA11);
            panel0.Controls.Add(inputA01);
            panel0.Controls.Add(inputA20);
            panel0.Controls.Add(inputA10);
            panel0.Controls.Add(inputA00);
            panel0.Location = new Point(396, 34);
            panel0.Margin = new Padding(2);
            panel0.Name = "panel0";
            panel0.Size = new Size(211, 121);
            panel0.TabIndex = 35;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(638, 494);
            Controls.Add(panel0);
            Controls.Add(buttonSheer);
            Controls.Add(buttonRotate);
            Controls.Add(buttonFile);
            Controls.Add(inputRotate);
            Controls.Add(label8);
            Controls.Add(label7);
            Controls.Add(label6);
            Controls.Add(buttonTranslate);
            Controls.Add(label5);
            Controls.Add(inputTranA);
            Controls.Add(label4);
            Controls.Add(inputTranB);
            Controls.Add(label3);
            Controls.Add(inputTranG);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(inputTranR);
            Controls.Add(panel2);
            Controls.Add(panel1);
            Controls.Add(menuStrip1);
            Margin = new Padding(2);
            Name = "Form1";
            Text = "Prmaes Ray Lapian - 140810210059";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            panel0.ResumeLayout(false);
            panel0.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Panel panel1;
        private Panel panel2;
        private TextBox inputTranR;
        private Label label1;
        private Label label2;
        private Label label3;
        private TextBox inputTranG;
        private Label label4;
        private TextBox inputTranB;
        private Label label5;
        private TextBox inputTranA;
        private Button buttonTranslate;
        private Label label6;
        private Label label7;
        private Label label8;
        private TextBox inputRotate;
        private MenuStrip menuStrip1;
        private ToolStripMenuItem openToolStripMenuItem;
        private ToolStripMenuItem rToolStripMenuItem;
        private ToolStripTextBox rCenterRotate;
        private ToolStripMenuItem gToolStripMenuItem;
        private ToolStripTextBox gCenterRotate;
        private ToolStripMenuItem bToolStripMenuItem;
        private ToolStripTextBox bCenterRotate;
        private Button buttonFile;
        private Button buttonRotate;
        private TextBox inputA00;
        private TextBox inputA10;
        private TextBox inputA20;
        private Button buttonSheer;
        private TextBox inputA21;
        private TextBox inputA11;
        private TextBox inputA01;
        private TextBox inputA22;
        private TextBox inputA12;
        private TextBox inputA02;
        private TextBox inputA23;
        private TextBox inputA13;
        private TextBox inputA03;
        private Panel panel0;
    }
}
