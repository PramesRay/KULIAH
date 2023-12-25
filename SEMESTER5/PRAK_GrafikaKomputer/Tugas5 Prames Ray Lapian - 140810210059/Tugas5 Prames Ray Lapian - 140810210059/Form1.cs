using System.Drawing.Drawing2D;

namespace Tugas5James
{
    public partial class Form1 : Form
    {
        int midX, midY;
        Graphics drawpanel;
        PointF point;
        public Form1()
        {
            InitializeComponent();
            drawpanel = panel1.CreateGraphics();
            midX = panel1.Width / 2;
            midY = panel1.Height / 2;
            drawpanel.TranslateTransform(midX, midY);
        }

        private void drawButton_Click(object sender, EventArgs e)
        {
            float x = float.Parse(inputX.Text);
            float y = float.Parse(inputY.Text);
            float m = float.Parse(inputM.Text);
            float c = float.Parse(inputC.Text);

            drawPoint(x, y);
            drawLine(y, m, c);
            drawReflection(m, c);
        }

        private void drawReflection(float m, float c)
        {
            Matrix Reflect = new Matrix(
                (float)(1 - Math.Pow(m, 2)) / (float)(Math.Pow(m, 2) + 1),
                (float)(2 * m) / (float)(Math.Pow(m, 2) + 1),
                (float)(2 * m) / (float)(Math.Pow(m, 2) + 1),
                (float)(Math.Pow(m, 2) - 1) / (float)(Math.Pow(m, 2) + 1),
                (float)(-2 * c * m) / (float)(Math.Pow(m, 2) + 1),
                (float)(2 * c) / (float)(Math.Pow(m, 2) + 1)
                );

            PointF[] points = { point };

            Reflect.TransformPoints(points);

            point = points[0];
            drawpanel.FillRectangle(new SolidBrush(Color.Gray), point.X, point.Y, 4, 4);
        }
        private void drawPoint(float x, float y)
        {
            point = new PointF(x, -y);
            drawpanel.FillRectangle(new SolidBrush(Color.Black), point.X, point.Y, 4, 4);
        }

        private void drawLine(float y, float m, float c)
        {
            int max = midX;
            int min = -midX;
            float tempY = y;
            for (int i = min; i < max; i++)
            {
                tempY = (m * i) + c;
                drawpanel.FillRectangle(new SolidBrush(Color.Yellow), i, tempY, 4, 4);
            }
        }
        private void resetButton_Click(object sender, EventArgs e)
        {
            panel1.Refresh();
        }
    }
}