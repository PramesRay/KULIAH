using System.Drawing;

namespace Tugas2
{
    public partial class Form1 : Form
    {
        Graphics lineDasar, lineDDA, lineBresenham;
        Graphics circleDasar, circleBresenham;
        Brush b = Brushes.Cyan;
        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void panelDasar_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lineDDA = panelLDDA.CreateGraphics();
            lineDasar = panelLDasar.CreateGraphics();
            lineBresenham = panelLBresenham.CreateGraphics();
            circleDasar = panelCDasar.CreateGraphics();
            circleBresenham = panelCBresenham.CreateGraphics();
        }

        private void btn_Garis_Click(object sender, EventArgs e)
        {
            int x1 = Convert.ToInt16(inputLX1.Text);
            int y1 = Convert.ToInt16(inputLY1.Text);
            int x2 = Convert.ToInt16(inputLX2.Text);
            int y2 = Convert.ToInt16(inputLY2.Text);

            drawLineDasar(x1, y1, x2, y2, lineDasar);
            drawLineDDA(x1, y1, x2, y2, lineDDA);
            drawLineBresenham(x1, y1, x2, y2, lineBresenham);
        }

        private void drawLineDasar(int x1, int y1, int x2, int y2, Graphics g)
        {
            int dx = Math.Abs(x2 - x1);
            int dy = Math.Abs(y2 - y1);

            int steps = Math.Max(dy, dx);

            float dltX = (float)dx / steps;
            float dltY = (float)dy / steps;

            float tempX = x1;
            float tempY = y1;

            for (int i = 0; i < steps; i++)
            {
                g.FillRectangle(b,
                    (int)Math.Round(tempX),
                    (int)Math.Round(tempY),
                    3,
                    3);
                tempX += dltX;
                tempY += dltY;
            }
        }

        private void drawLineDDA(int x1, int y1, int x2, int y2, Graphics g)
        {
            float dx = x2 - x1;
            float dy = y2 - y1;

            int steps = Math.Max(Math.Abs((int)dx), Math.Abs((int)dy));

            float xInc = dx / steps;
            float yInc = dy / steps;

            float x = x1;
            float y = y1;

            for (int i = 0; i <= steps; i++)
            {
                g.FillRectangle(b, (int)Math.Round(x), (int)Math.Round(y), 3, 3);
                x += xInc;
                y += yInc;
            }
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

        private void btn_Lngkrn_Click(object sender, EventArgs e)
        {
            int x = Convert.ToInt16(inputCX.Text);
            int y = Convert.ToInt16(inputCY.Text);
            int rad = Convert.ToInt16(inputRad.Text);

            DrawLngkDasar(x, y, rad, circleDasar);
            DrawLngkBresenham(x, y, rad, circleBresenham);
        }

        private void DrawLngkDasar(int x, int y, int rad, Graphics g)
        {
            for (int x1 = -rad; x1 <= rad; x1++)
            {
                int y1 = y + (int)Math.Round(Math.Sqrt(rad * rad - x1 * x1));
                int y2 = y - (int)Math.Round(Math.Sqrt(rad * rad - x1 * x1));

                g.FillRectangle(b, x + x1, y1, 3, 3);
                g.FillRectangle(b, x + x1, y2, 3, 3);
            }

            for (int y1 = -rad; y1 <= rad; y1++)
            {
                int x1 = x + (int)Math.Round(Math.Sqrt(rad * rad - y1 * y1));
                int x2 = x - (int)Math.Round(Math.Sqrt(rad * rad - y1 * y1));

                g.FillRectangle(b, x1, y + y1, 3, 3);
                g.FillRectangle(b, x2, y + y1, 3, 3);
            }
        }

        private void DrawLngkBresenham(int x, int y, int rad, Graphics g)
        {
            int x1 = 0;
            int y1 = rad;
            int d = 3 - 2 * rad;

            while (x1 <= y1)
            {
                g.FillRectangle(b, x + x1, y + y1, 3, 3);
                g.FillRectangle(b, x - x1, y - y1, 3, 3);
                g.FillRectangle(b, x + x1, y - y1, 3, 3);
                g.FillRectangle(b, x - x1, y + y1, 3, 3);
                g.FillRectangle(b, x + y1, y + x1, 3, 3);
                g.FillRectangle(b, x - y1, y - x1, 3, 3);
                g.FillRectangle(b, x + y1, y - x1, 3, 3);
                g.FillRectangle(b, x - y1, y + x1, 3, 3);

                if (d < 0)
                {
                    d += 4 * x1 + 6;
                }
                else
                {
                    d += 4 * (x1 - y1) + 10;
                    y1--;
                }
                x1++;
            }
        }
    }
}