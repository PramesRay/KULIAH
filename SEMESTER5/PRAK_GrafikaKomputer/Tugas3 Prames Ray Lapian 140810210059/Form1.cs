namespace Tugas3Base
{
    public partial class Form1 : Form
    {
        Graphics windowPanelGraphics;
        Graphics viewportPanelGraphics;

        public Form1()
        {
            InitializeComponent();
            windowPanelGraphics = windowPanel.CreateGraphics();
            viewportPanelGraphics = viewportPanel.CreateGraphics();
        }

        private static void DrawPointWithCoords(Graphics g, Point point)
        {
            int thickness = 2;
            g.FillRectangle(new SolidBrush(Color.Black), point.X, point.Y, thickness, thickness);
            g.DrawString("(" + point.X + ", " + point.Y + ")", new Font("Times New Roman", 8), new SolidBrush(Color.Red), new Rectangle(point.X, point.Y, 50, 15));
        }

        private void clearWindow_Click(object sender, EventArgs e)
        {
            windowPanel.Refresh();
        }

        private void clearView_Click(object sender, EventArgs e)
        {
            viewportPanel.Refresh();
        }

        private void clipButton_Click(object sender, EventArgs e)
        {
            int XObj = Convert.ToInt16(textX1Obj.Text);
            int YObj = Convert.ToInt16(textY1Obj.Text);

            int xMaxW = Convert.ToInt16(textXMaxW.Text);
            int yMaxW = Convert.ToInt16(textYMaxW.Text);
            int xMinW = Convert.ToInt16(textXMinW.Text);
            int yMinW = Convert.ToInt16(textYMinW.Text);

            int xMaxV = Convert.ToInt16(textXMaxV.Text);
            int yMaxV = Convert.ToInt16(textYMaxV.Text);
            int xMinV = Convert.ToInt16(textXMinV.Text);
            int yMinV = Convert.ToInt16(textYMinV.Text);

            int clipX = xMinV + (XObj - xMinW) * (xMaxV - xMinV) / (xMaxW - xMinW);
            int clipY = yMinV + (YObj - yMinW) * (yMaxV - yMinV) / (yMaxW - yMinW);

            DrawPointWithCoords(viewportPanelGraphics, new Point(clipX, clipY));
        }

        private void drawVButton_Click(object sender, EventArgs e)
        {
            int xMaxV = Convert.ToInt16(textXMaxV.Text);
            int yMaxV = Convert.ToInt16(textYMaxV.Text);
            int xMinV = Convert.ToInt16(textXMinV.Text);
            int yMinV = Convert.ToInt16(textYMinV.Text);

            int dltXV = xMaxV - xMinV;
            int dltYV = yMaxV - yMinV;

            viewportPanelGraphics.DrawRectangle(new Pen(Color.Black), xMinV, yMinV, dltXV, dltYV);
        }

        private void drawWButton_Click(object sender, EventArgs e)
        {
            int xMaxW = Convert.ToInt16(textXMaxW.Text);
            int yMaxW = Convert.ToInt16(textYMaxW.Text);
            int xMinW = Convert.ToInt16(textXMinW.Text);
            int yMinW = Convert.ToInt16(textYMinW.Text);

            int dltXW = xMaxW - xMinW;
            int dltYW = yMaxW - yMinW;

            windowPanelGraphics.DrawRectangle(new Pen(Color.Black), xMinW, yMinW, dltXW, dltYW);
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void drawLButton_Click(object sender, EventArgs e)
        {
            int x = Convert.ToInt16(textX1Obj.Text);
            int y = Convert.ToInt16(textY1Obj.Text);


            DrawPointWithCoords(windowPanelGraphics, new Point(x, y));
        }
    }
}