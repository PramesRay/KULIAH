namespace Tugas5James
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
            buttonDraw = new Button();
            buttonReset = new Button();
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            label4 = new Label();
            panel1 = new Panel();
            inputX = new TextBox();
            inputY = new TextBox();
            inputM = new TextBox();
            inputC = new TextBox();
            SuspendLayout();
            // 
            // buttonDraw
            // 
            buttonDraw.Location = new Point(19, 148);
            buttonDraw.Margin = new Padding(2);
            buttonDraw.Name = "buttonDraw";
            buttonDraw.Size = new Size(78, 30);
            buttonDraw.TabIndex = 0;
            buttonDraw.Text = "Draw";
            buttonDraw.UseVisualStyleBackColor = true;
            buttonDraw.Click += drawButton_Click;
            // 
            // buttonReset
            // 
            buttonReset.Location = new Point(19, 195);
            buttonReset.Margin = new Padding(2);
            buttonReset.Name = "buttonReset";
            buttonReset.Size = new Size(78, 30);
            buttonReset.TabIndex = 1;
            buttonReset.Text = "Reset";
            buttonReset.UseVisualStyleBackColor = true;
            buttonReset.Click += resetButton_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(28, 30);
            label1.Margin = new Padding(2, 0, 2, 0);
            label1.Name = "label1";
            label1.Size = new Size(14, 15);
            label1.TabIndex = 2;
            label1.Text = "X";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(68, 30);
            label2.Margin = new Padding(2, 0, 2, 0);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 3;
            label2.Text = "Y";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(28, 80);
            label3.Margin = new Padding(2, 0, 2, 0);
            label3.Name = "label3";
            label3.Size = new Size(18, 15);
            label3.TabIndex = 4;
            label3.Text = "M";
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(68, 80);
            label4.Margin = new Padding(2, 0, 2, 0);
            label4.Name = "label4";
            label4.Size = new Size(15, 15);
            label4.TabIndex = 5;
            label4.Text = "C";
            // 
            // panel1
            // 
            panel1.BorderStyle = BorderStyle.FixedSingle;
            panel1.Location = new Point(141, 21);
            panel1.Margin = new Padding(2);
            panel1.Name = "panel1";
            panel1.Size = new Size(256, 256);
            panel1.TabIndex = 6;
            // 
            // inputX
            // 
            inputX.Location = new Point(19, 47);
            inputX.Margin = new Padding(2);
            inputX.Name = "inputX";
            inputX.Size = new Size(36, 23);
            inputX.TabIndex = 7;
            // 
            // inputY
            // 
            inputY.Location = new Point(59, 47);
            inputY.Margin = new Padding(2);
            inputY.Name = "inputY";
            inputY.Size = new Size(36, 23);
            inputY.TabIndex = 8;
            // 
            // inputM
            // 
            inputM.Location = new Point(19, 97);
            inputM.Margin = new Padding(2);
            inputM.Name = "inputM";
            inputM.Size = new Size(36, 23);
            inputM.TabIndex = 9;
            // 
            // inputC
            // 
            inputC.Location = new Point(59, 97);
            inputC.Margin = new Padding(2);
            inputC.Name = "inputC";
            inputC.Size = new Size(36, 23);
            inputC.TabIndex = 10;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(419, 297);
            Controls.Add(inputC);
            Controls.Add(inputM);
            Controls.Add(inputY);
            Controls.Add(inputX);
            Controls.Add(panel1);
            Controls.Add(label4);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(buttonReset);
            Controls.Add(buttonDraw);
            Margin = new Padding(2);
            Name = "Form1";
            Text = "Tugas 5 Prames Ray Lapian - 140810210059";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button buttonDraw;
        private Button buttonReset;
        private Label label1;
        private Label label2;
        private Label label3;
        private Label label4;
        private Panel panel1;
        private TextBox inputX;
        private TextBox inputY;
        private TextBox inputM;
        private TextBox inputC;
    }
}