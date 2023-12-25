namespace Tugas7
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
            menuStrip1 = new MenuStrip();
            toolStripMenuItem1 = new ToolStripMenuItem();
            openToolStripMenuItem = new ToolStripMenuItem();
            panel1 = new Panel();
            rotateScrollBar = new HScrollBar();
            yScrollBar = new VScrollBar();
            xScrollBar = new HScrollBar();
            menuStrip1.SuspendLayout();
            SuspendLayout();
            // 
            // menuStrip1
            // 
            menuStrip1.ImageScalingSize = new Size(24, 24);
            menuStrip1.Items.AddRange(new ToolStripItem[] { toolStripMenuItem1 });
            menuStrip1.Location = new Point(0, 0);
            menuStrip1.Name = "menuStrip1";
            menuStrip1.Padding = new Padding(4, 1, 0, 1);
            menuStrip1.Size = new Size(682, 24);
            menuStrip1.TabIndex = 0;
            menuStrip1.Text = "menuStrip1";
            // 
            // toolStripMenuItem1
            // 
            toolStripMenuItem1.DropDownItems.AddRange(new ToolStripItem[] { openToolStripMenuItem });
            toolStripMenuItem1.Font = new Font("Segoe UI", 9.75F, FontStyle.Regular, GraphicsUnit.Point);
            toolStripMenuItem1.Name = "toolStripMenuItem1";
            toolStripMenuItem1.Size = new Size(39, 22);
            toolStripMenuItem1.Text = "File";
            // 
            // openToolStripMenuItem
            // 
            openToolStripMenuItem.Name = "openToolStripMenuItem";
            openToolStripMenuItem.Size = new Size(180, 22);
            openToolStripMenuItem.Text = "Open";
            openToolStripMenuItem.Click += openToolStripMenuItem_Click;
            // 
            // panel1
            // 
            panel1.Location = new Point(288, 41);
            panel1.Margin = new Padding(2);
            panel1.Name = "panel1";
            panel1.Size = new Size(384, 384);
            panel1.TabIndex = 1;
            // 
            // rotateScrollBar
            // 
            rotateScrollBar.Location = new Point(23, 35);
            rotateScrollBar.Name = "rotateScrollBar";
            rotateScrollBar.Size = new Size(203, 28);
            rotateScrollBar.TabIndex = 2;
            rotateScrollBar.Scroll += rotateScroll_Scroll;
            // 
            // yScrollBar
            // 
            yScrollBar.Location = new Point(249, 61);
            yScrollBar.Name = "yScrollBar";
            yScrollBar.Size = new Size(28, 352);
            yScrollBar.TabIndex = 3;
            yScrollBar.Scroll += yScroll_Scroll;
            // 
            // xScrollBar
            // 
            xScrollBar.Location = new Point(288, 437);
            xScrollBar.Name = "xScrollBar";
            xScrollBar.Size = new Size(385, 28);
            xScrollBar.TabIndex = 4;
            xScrollBar.Scroll += xScroll_Scroll;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(682, 481);
            Controls.Add(xScrollBar);
            Controls.Add(yScrollBar);
            Controls.Add(rotateScrollBar);
            Controls.Add(panel1);
            Controls.Add(menuStrip1);
            MainMenuStrip = menuStrip1;
            Margin = new Padding(2);
            Name = "Form1";
            Text = "Prames Ray Lapian - 140810210059";
            menuStrip1.ResumeLayout(false);
            menuStrip1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private MenuStrip menuStrip1;
        private ToolStripMenuItem toolStripMenuItem1;
        private ToolStripMenuItem openToolStripMenuItem;
        private Panel panel1;
        private HScrollBar rotateScrollBar;
        private VScrollBar yScrollBar;
        private HScrollBar xScrollBar;
    }
}