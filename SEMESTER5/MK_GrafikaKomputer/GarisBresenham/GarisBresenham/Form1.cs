using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GarisBresenham
{
    public partial class Form1 : Form
    {
        Graphics lineBresenham;
        Brush b = Brushes.Cyan;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lineBresenham = panelLBresenham.CreateGraphics();
        }

        private void drawLineBresenham(int x1, int y1, int x2, int y2, Graphics g)
        {
            int dx = Math.Abs(x2 - x1);
            int dy = Math.Abs(y2 - y1);
            int dltA, dltB, p, x, y;

            if (dx >= dy)
            {
                dltA = dx;
                dltB = dy;
            }
            else
            {
                dltA = dy;
                dltB = dx;
            }

            int xInc = x2 > x1 ? 1 : -1;
            int yInc = y2 > y1 ? 1 : -1;

            p = 2 * dltB - dltA;
            x = x1;
            y = y1;

            while (true)
            {
                g.FillRectangle(b, x, y, 3, 3);

                if (x == x2 && y == y2)
                    break;

                if (p >= 0)
                {
                    if (dx >= dy)
                        y += yInc;
                    else
                        x += xInc;
                    p -= 2 * dltA;
                }

                if (dx >= dy)
                    x += xInc;
                else
                    y += yInc;

                p += 2 * dltB;
            }
        }

        private void buttonDraw_Click(object sender, EventArgs e)
        {
            int x1 = Convert.ToInt16(inputX1.Text);
            int y1 = Convert.ToInt16(inputY1.Text);
            int x2 = Convert.ToInt16(inputX2.Text);
            int y2 = Convert.ToInt16(inputY2.Text);

            drawLineBresenham(x1, y1, x2, y2, lineBresenham);
        }
    }
}
