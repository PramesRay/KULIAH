namespace Tugas3Base
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
            windowPanel = new Panel();
            viewportPanel = new Panel();
            windowPanelLabel = new Label();
            viewportPanelLabel = new Label();
            label1 = new Label();
            label15 = new Label();
            label14 = new Label();
            label13 = new Label();
            label9 = new Label();
            label10 = new Label();
            label7 = new Label();
            label8 = new Label();
            clearWindow = new Button();
            clearView = new Button();
            clipButton = new Button();
            drawVButton = new Button();
            drawWButton = new Button();
            textY1Obj = new TextBox();
            textX1Obj = new TextBox();
            textYMinV = new TextBox();
            textXMinV = new TextBox();
            textYMaxV = new TextBox();
            textXMaxV = new TextBox();
            textYMinW = new TextBox();
            textXMinW = new TextBox();
            textYMaxW = new TextBox();
            textXMaxW = new TextBox();
            drawLButton = new Button();
            label2 = new Label();
            label5 = new Label();
            label3 = new Label();
            label4 = new Label();
            label6 = new Label();
            label11 = new Label();
            SuspendLayout();
            // 
            // windowPanel
            // 
            windowPanel.BackColor = Color.White;
            windowPanel.Location = new Point(353, 40);
            windowPanel.Name = "windowPanel";
            windowPanel.Size = new Size(384, 384);
            windowPanel.TabIndex = 0;
            // 
            // viewportPanel
            // 
            viewportPanel.BackColor = Color.White;
            viewportPanel.Location = new Point(755, 40);
            viewportPanel.Name = "viewportPanel";
            viewportPanel.Size = new Size(384, 384);
            viewportPanel.TabIndex = 1;
            // 
            // windowPanelLabel
            // 
            windowPanelLabel.AutoSize = true;
            windowPanelLabel.Location = new Point(352, 16);
            windowPanelLabel.Name = "windowPanelLabel";
            windowPanelLabel.Size = new Size(51, 15);
            windowPanelLabel.TabIndex = 2;
            windowPanelLabel.Text = "Window";
            // 
            // viewportPanelLabel
            // 
            viewportPanelLabel.AutoSize = true;
            viewportPanelLabel.Location = new Point(755, 16);
            viewportPanelLabel.Name = "viewportPanelLabel";
            viewportPanelLabel.Size = new Size(54, 15);
            viewportPanelLabel.TabIndex = 3;
            viewportPanelLabel.Text = "Viewport";
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(87, 125);
            label1.Name = "label1";
            label1.Size = new Size(0, 15);
            label1.TabIndex = 5;
            label1.Click += label1_Click;
            // 
            // label15
            // 
            label15.AutoSize = true;
            label15.Font = new Font("Segoe UI", 14.25F, FontStyle.Regular, GraphicsUnit.Point);
            label15.Location = new Point(74, 236);
            label15.Margin = new Padding(2, 0, 2, 0);
            label15.Name = "label15";
            label15.Size = new Size(149, 25);
            label15.TabIndex = 66;
            label15.Text = "Koordinat Objek";
            // 
            // label14
            // 
            label14.AutoSize = true;
            label14.Font = new Font("Segoe UI", 14.25F, FontStyle.Regular, GraphicsUnit.Point);
            label14.Location = new Point(52, 123);
            label14.Margin = new Padding(2, 0, 2, 0);
            label14.Name = "label14";
            label14.Size = new Size(189, 25);
            label14.TabIndex = 65;
            label14.Text = "Koordinat View Point";
            // 
            // label13
            // 
            label13.AutoSize = true;
            label13.Font = new Font("Segoe UI", 14.25F, FontStyle.Regular, GraphicsUnit.Point);
            label13.Location = new Point(62, 9);
            label13.Margin = new Padding(2, 0, 2, 0);
            label13.Name = "label13";
            label13.Size = new Size(170, 25);
            label13.TabIndex = 64;
            label13.Text = "Koordinat Window";
            // 
            // label9
            // 
            label9.AutoSize = true;
            label9.Location = new Point(115, 302);
            label9.Margin = new Padding(2, 0, 2, 0);
            label9.Name = "label9";
            label9.Size = new Size(13, 15);
            label9.TabIndex = 63;
            label9.Text = "y";
            // 
            // label10
            // 
            label10.AutoSize = true;
            label10.Location = new Point(115, 279);
            label10.Margin = new Padding(2, 0, 2, 0);
            label10.Name = "label10";
            label10.Size = new Size(13, 15);
            label10.TabIndex = 62;
            label10.Text = "x";
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(153, 158);
            label7.Margin = new Padding(2, 0, 2, 0);
            label7.Name = "label7";
            label7.Size = new Size(30, 15);
            label7.TabIndex = 61;
            label7.Text = "Max";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(111, 158);
            label8.Margin = new Padding(2, 0, 2, 0);
            label8.Name = "label8";
            label8.Size = new Size(28, 15);
            label8.TabIndex = 60;
            label8.Text = "Min";
            // 
            // clearWindow
            // 
            clearWindow.Location = new Point(208, 375);
            clearWindow.Name = "clearWindow";
            clearWindow.Size = new Size(110, 34);
            clearWindow.TabIndex = 53;
            clearWindow.Text = "Clear Window";
            clearWindow.UseVisualStyleBackColor = true;
            clearWindow.Click += clearWindow_Click;
            // 
            // clearView
            // 
            clearView.Location = new Point(208, 330);
            clearView.Name = "clearView";
            clearView.Size = new Size(110, 34);
            clearView.TabIndex = 52;
            clearView.Text = "Clear Viewport";
            clearView.UseVisualStyleBackColor = true;
            clearView.Click += clearView_Click;
            // 
            // clipButton
            // 
            clipButton.Location = new Point(113, 375);
            clipButton.Name = "clipButton";
            clipButton.Size = new Size(75, 49);
            clipButton.TabIndex = 51;
            clipButton.Text = "Clip";
            clipButton.UseVisualStyleBackColor = true;
            clipButton.Click += clipButton_Click;
            // 
            // drawVButton
            // 
            drawVButton.Location = new Point(113, 330);
            drawVButton.Name = "drawVButton";
            drawVButton.Size = new Size(75, 46);
            drawVButton.TabIndex = 50;
            drawVButton.Text = "Gambar ViewPoint";
            drawVButton.UseVisualStyleBackColor = true;
            drawVButton.Click += drawVButton_Click;
            // 
            // drawWButton
            // 
            drawWButton.Location = new Point(22, 375);
            drawWButton.Name = "drawWButton";
            drawWButton.Size = new Size(75, 49);
            drawWButton.TabIndex = 49;
            drawWButton.Text = "Gambar Window";
            drawWButton.UseVisualStyleBackColor = true;
            drawWButton.Click += drawWButton_Click;
            // 
            // textY1Obj
            // 
            textY1Obj.Location = new Point(132, 299);
            textY1Obj.Margin = new Padding(2);
            textY1Obj.Name = "textY1Obj";
            textY1Obj.Size = new Size(40, 23);
            textY1Obj.TabIndex = 47;
            textY1Obj.TextAlign = HorizontalAlignment.Center;
            // 
            // textX1Obj
            // 
            textX1Obj.Location = new Point(132, 276);
            textX1Obj.Margin = new Padding(2);
            textX1Obj.Name = "textX1Obj";
            textX1Obj.Size = new Size(40, 23);
            textX1Obj.TabIndex = 46;
            textX1Obj.TextAlign = HorizontalAlignment.Center;
            // 
            // textYMinV
            // 
            textYMinV.Location = new Point(104, 198);
            textYMinV.Margin = new Padding(2);
            textYMinV.Name = "textYMinV";
            textYMinV.Size = new Size(40, 23);
            textYMinV.TabIndex = 43;
            textYMinV.TextAlign = HorizontalAlignment.Center;
            // 
            // textXMinV
            // 
            textXMinV.Location = new Point(104, 175);
            textXMinV.Margin = new Padding(2);
            textXMinV.Name = "textXMinV";
            textXMinV.Size = new Size(40, 23);
            textXMinV.TabIndex = 42;
            textXMinV.TextAlign = HorizontalAlignment.Center;
            // 
            // textYMaxV
            // 
            textYMaxV.Location = new Point(148, 198);
            textYMaxV.Margin = new Padding(2);
            textYMaxV.Name = "textYMaxV";
            textYMaxV.Size = new Size(40, 23);
            textYMaxV.TabIndex = 45;
            textYMaxV.TextAlign = HorizontalAlignment.Center;
            // 
            // textXMaxV
            // 
            textXMaxV.Location = new Point(148, 175);
            textXMaxV.Margin = new Padding(2);
            textXMaxV.Name = "textXMaxV";
            textXMaxV.Size = new Size(40, 23);
            textXMaxV.TabIndex = 44;
            textXMaxV.TextAlign = HorizontalAlignment.Center;
            // 
            // textYMinW
            // 
            textYMinW.Location = new Point(104, 80);
            textYMinW.Margin = new Padding(2);
            textYMinW.Name = "textYMinW";
            textYMinW.Size = new Size(40, 23);
            textYMinW.TabIndex = 39;
            textYMinW.TextAlign = HorizontalAlignment.Center;
            // 
            // textXMinW
            // 
            textXMinW.Location = new Point(104, 58);
            textXMinW.Margin = new Padding(2);
            textXMinW.Name = "textXMinW";
            textXMinW.Size = new Size(40, 23);
            textXMinW.TabIndex = 38;
            textXMinW.TextAlign = HorizontalAlignment.Center;
            // 
            // textYMaxW
            // 
            textYMaxW.Location = new Point(148, 80);
            textYMaxW.Margin = new Padding(2);
            textYMaxW.Name = "textYMaxW";
            textYMaxW.Size = new Size(40, 23);
            textYMaxW.TabIndex = 41;
            textYMaxW.TextAlign = HorizontalAlignment.Center;
            // 
            // textXMaxW
            // 
            textXMaxW.Location = new Point(148, 58);
            textXMaxW.Margin = new Padding(2);
            textXMaxW.Name = "textXMaxW";
            textXMaxW.Size = new Size(40, 23);
            textXMaxW.TabIndex = 40;
            textXMaxW.TextAlign = HorizontalAlignment.Center;
            // 
            // drawLButton
            // 
            drawLButton.Location = new Point(22, 330);
            drawLButton.Name = "drawLButton";
            drawLButton.Size = new Size(75, 46);
            drawLButton.TabIndex = 48;
            drawLButton.Text = "Gambar Garis";
            drawLButton.UseVisualStyleBackColor = true;
            drawLButton.Click += drawLButton_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(87, 201);
            label2.Margin = new Padding(2, 0, 2, 0);
            label2.Name = "label2";
            label2.Size = new Size(13, 15);
            label2.TabIndex = 68;
            label2.Text = "y";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(87, 178);
            label5.Margin = new Padding(2, 0, 2, 0);
            label5.Name = "label5";
            label5.Size = new Size(13, 15);
            label5.TabIndex = 67;
            label5.Text = "x";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(87, 84);
            label3.Margin = new Padding(2, 0, 2, 0);
            label3.Name = "label3";
            label3.Size = new Size(13, 15);
            label3.TabIndex = 72;
            label3.Text = "y";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(87, 61);
            label4.Margin = new Padding(2, 0, 2, 0);
            label4.Name = "label4";
            label4.Size = new Size(13, 15);
            label4.TabIndex = 71;
            label4.Text = "x";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(153, 41);
            label6.Margin = new Padding(2, 0, 2, 0);
            label6.Name = "label6";
            label6.Size = new Size(30, 15);
            label6.TabIndex = 70;
            label6.Text = "Max";
            // 
            // label11
            // 
            label11.AutoSize = true;
            label11.Location = new Point(111, 41);
            label11.Margin = new Padding(2, 0, 2, 0);
            label11.Name = "label11";
            label11.Size = new Size(28, 15);
            label11.TabIndex = 69;
            label11.Text = "Min";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1152, 444);
            Controls.Add(label3);
            Controls.Add(label4);
            Controls.Add(label6);
            Controls.Add(label11);
            Controls.Add(label2);
            Controls.Add(label5);
            Controls.Add(label15);
            Controls.Add(label14);
            Controls.Add(label13);
            Controls.Add(label9);
            Controls.Add(label10);
            Controls.Add(label7);
            Controls.Add(label8);
            Controls.Add(clearWindow);
            Controls.Add(clearView);
            Controls.Add(clipButton);
            Controls.Add(drawVButton);
            Controls.Add(drawWButton);
            Controls.Add(textY1Obj);
            Controls.Add(textX1Obj);
            Controls.Add(textYMinV);
            Controls.Add(textXMinV);
            Controls.Add(textYMaxV);
            Controls.Add(textXMaxV);
            Controls.Add(textYMinW);
            Controls.Add(textXMinW);
            Controls.Add(textYMaxW);
            Controls.Add(textXMaxW);
            Controls.Add(drawLButton);
            Controls.Add(label1);
            Controls.Add(viewportPanelLabel);
            Controls.Add(windowPanelLabel);
            Controls.Add(viewportPanel);
            Controls.Add(windowPanel);
            Name = "Form1";
            Text = "Tugas 3 Prames Ray Lapian - 140810210059";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Panel windowPanel;
        private Panel viewportPanel;
        private Label windowPanelLabel;
        private Label viewportPanelLabel;
        private Label label1;
        private Label label15;
        private Label label14;
        private Label label13;
        private Label label9;
        private Label label10;
        private Label label7;
        private Label label8;
        private Button clearWindow;
        private Button clearView;
        private Button clipButton;
        private Button drawVButton;
        private Button drawWButton;
        private TextBox textY1Obj;
        private TextBox textX1Obj;
        private TextBox textYMinV;
        private TextBox textXMinV;
        private TextBox textYMaxV;
        private TextBox textXMaxV;
        private TextBox textYMinW;
        private TextBox textXMinW;
        private TextBox textYMaxW;
        private TextBox textXMaxW;
        private Button drawLButton;
        private Label label2;
        private Label label5;
        private Label label3;
        private Label label4;
        private Label label6;
        private Label label11;
    }
}