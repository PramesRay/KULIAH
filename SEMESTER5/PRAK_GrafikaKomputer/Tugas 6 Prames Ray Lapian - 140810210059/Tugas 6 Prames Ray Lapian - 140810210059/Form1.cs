using System.Drawing.Drawing2D;

namespace Tugas6
{
    public partial class Form1 : Form
    {
        Graphics before, after;
        Pen black;
        SolidBrush cyan;
        int midX, midY;
        Point Points;
        float gRotate, lRotate, gXTranslate, gYTranslate, lXTranslate, lYTranslate, gXScale, gYScale, lXScale, lYScale = 0;

        public Form1()
        {
            InitializeComponent();
            before = panel1.CreateGraphics();
            after = panel2.CreateGraphics();
            midX = panel1.Width / 2;
            midY = panel1.Height / 2;
            before.TranslateTransform(midX, midY);
            after.TranslateTransform(midX, midY);
            black = new Pen(Color.Black);
            cyan = new SolidBrush(Color.Cyan);
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void buttonGRotate_Click(object sender, EventArgs e)
        {
            gRotate = float.Parse(inputGRotate.Text);
            Rectangle pathRect = new Rectangle(-50, 55, 10, 20);
            before.DrawRectangle(black, pathRect);
            after.RotateTransform(gRotate, MatrixOrder.Append);
            after.DrawRectangle(black, pathRect);
            before.Dispose();
            after.Dispose();
        }

        private void buttonGTranslate_Click(object sender, EventArgs e)
        {
            gXTranslate = float.Parse(inputGXTranslate.Text);
            gYTranslate = float.Parse(inputGYTranslate.Text);
            Rectangle pathRect = new Rectangle(-50, 55, 10, 20);
            before.DrawRectangle(black, pathRect);
            after.TranslateTransform(gXTranslate, gYTranslate, MatrixOrder.Append);
            after.DrawRectangle(black, pathRect);
            before.Dispose();
            after.Dispose();
        }

        private void buttonGScale_Click(object sender, EventArgs e)
        {
            gXScale = float.Parse(inputGXScale.Text);
            gYScale = float.Parse(inputGYScale.Text);
            Rectangle pathRect = new Rectangle(-50, 55, 10, 20);
            before.DrawRectangle(black, pathRect);
            after.ScaleTransform(gXScale, gYScale, MatrixOrder.Append);
            after.DrawRectangle(black, pathRect);
            before.Dispose();
            after.Dispose();
        }

        private void buttonReset_Click(object sender, EventArgs e)
        {
            panel1.Refresh();
            panel2.Refresh();
        }

        private void buttonlRotateate_Click(object sender, EventArgs e)
        {
            before.FillRectangle(cyan, -10, 15, 10, 20);
            GraphicsPath path = new GraphicsPath();
            Rectangle pathRect = new Rectangle(-10, 15, 10, 20);
            path.AddRectangle(pathRect);
            lRotate = float.Parse(inputLRotate.Text);
            Matrix X = new Matrix();
            X.Rotate(lRotate);
            path.Transform(X);
            after.FillPath(cyan, path);
            cyan.Dispose();
            path.Dispose();
            before.Dispose();
            after.Dispose();
        }

        private void buttonLTranslate_Click(object sender, EventArgs e)
        {
            before.FillRectangle(cyan, -10, 15, 10, 20);
            GraphicsPath path = new GraphicsPath();
            Rectangle pathRect = new Rectangle(-10, 15, 10, 20);
            path.AddRectangle(pathRect);
            lXTranslate = float.Parse(inputLXTranslate.Text);
            lYTranslate = float.Parse(inputLYTranslate.Text);
            Matrix X = new Matrix();
            X.Translate(lXTranslate, lYTranslate);
            path.Transform(X);
            after.FillPath(cyan, path);
            cyan.Dispose();
            path.Dispose();
            before.Dispose();
            after.Dispose();
        }

        private void buttonLScale_Click(object sender, EventArgs e)
        {
            before.FillRectangle(cyan, -10, 15, 10, 20);
            GraphicsPath path = new GraphicsPath();
            Rectangle pathRect = new Rectangle(-10, 15, 10, 20);
            path.AddRectangle(pathRect);
            lXScale = float.Parse(inputLXScale.Text);
            lYScale = float.Parse(inputLYScale.Text);
            Matrix X = new Matrix();
            X.Scale(lXScale, lYScale);
            path.Transform(X);
            after.FillPath(cyan, path);
            cyan.Dispose();
            path.Dispose();
            before.Dispose();
            after.Dispose();
        }

        private void buttonLRotate_Click(object sender, EventArgs e)
        {
            gRotate = float.Parse(inputGRotate.Text);
            Rectangle pathRect = new Rectangle(-50, 55, 10, 20);
            before.DrawRectangle(black, pathRect);
            after.RotateTransform(gRotate, MatrixOrder.Append);
            after.DrawRectangle(black, pathRect);
            before.Dispose();
            after.Dispose();
        }
    }
}