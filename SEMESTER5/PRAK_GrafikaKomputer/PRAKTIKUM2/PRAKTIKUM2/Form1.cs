using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Printing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement.Rebar;

namespace PRAKTIKUM2
{
    public partial class Form1 : Form
    {
        Graphics g;
        Brush pixel = new SolidBrush(Color.Black);
        Random rand = new Random();

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            g = canvas.CreateGraphics();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void generateButton_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < 270; i++)
            {
                for (int j = 0; j < 270; j++)
                {
                    double res = rand.NextDouble();
                    if (res < 0.5)
                    {
                        g.FillRectangle(pixel, i, j, 1, 1);
                    }
                }
            }
        }
        private void DrawDots_Click(object sender, EventArgs e)
        {
            int x1 = Convert.ToInt16(x1Input.Text);
            int y1 = Convert.ToInt16(y1Input.Text);

            int x2 = Convert.ToInt16(x2Input.Text);
            int y2 = Convert.ToInt16(y2Input.Text);

            g.FillRectangle(pixel, x1, y1, 2, 2);
            g.FillRectangle(pixel, x2, y2, 2, 2);
        }

        private void DrawLine_Click(object sender, EventArgs e)
        {
            int x1 = Convert.ToInt16(x1Input.Text);
            int y1 = Convert.ToInt16(y1Input.Text);

            int x2 = Convert.ToInt16(x2Input.Text);
            int y2 = Convert.ToInt16(y2Input.Text);

            int dx = (x2 - x1);
            int dy = (y2 - y1);

            int s = Math.Max(dy, dx);

            float deltaX = (float)dx / s;
            float deltaY = (float)dy / s;

            float tempX = x1;
            float tempY = y1;

            for (int i = 0; i < s; i++)
            {
                g.FillRectangle(pixel,
                    Convert.ToInt16(tempX),
                    Convert.ToInt16(tempY),
                    2,
                    2);

                tempX += deltaX;
                tempY += deltaY;       
            }
        }

        private void Refresh_Click_1(object sender, EventArgs e)
        {
            canvas.Refresh();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            panel1.PrintAction();
        }
    }
}