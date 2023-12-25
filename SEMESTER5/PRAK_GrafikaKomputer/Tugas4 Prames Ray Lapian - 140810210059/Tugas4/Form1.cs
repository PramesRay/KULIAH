using System.Drawing;
using System.Drawing.Drawing2D;
using System.Drawing.Text;
using System.Numerics;
using System.Reflection.Metadata.Ecma335;
using System.Security.Cryptography;
using System.Security.Cryptography.X509Certificates;

namespace Tugas4
{
    public partial class Form1 : Form
    {
        Graphics drawPanelGraphics;
        Graphics MTUPanelGraphics;
        int X1, X2, X3;
        int Y1, Y2, Y3;
        int M1, M2, M3, M4, M5, M6, M7, M8, M9;
        private int[,] drawMatrix;
        private int[,] MTUMatrix;

        public Form1()
        {
            InitializeComponent();
            drawPanelGraphics = drawPanel.CreateGraphics();
            MTUPanelGraphics = MTUPanel.CreateGraphics();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            drawPanel.Refresh();
            MTUPanel.Refresh();
        }

        private void drawButton_Click(object sender, EventArgs e)
        {
            X1 = Convert.ToInt32(inputX1.Text);
            X2 = Convert.ToInt32(inputX2.Text);
            X3 = Convert.ToInt32(inputX3.Text);
            Y1 = Convert.ToInt32(inputY1.Text);
            Y2 = Convert.ToInt32(inputY2.Text);
            Y3 = Convert.ToInt32(inputY3.Text);
            M1 = Convert.ToInt32(float.Parse(inputM1.Text));
            M2 = Convert.ToInt32(float.Parse(inputM2.Text));
            M3 = Convert.ToInt32(float.Parse(inputM3.Text));
            M4 = Convert.ToInt32(float.Parse(inputM4.Text));
            M5 = Convert.ToInt32(float.Parse(inputM5.Text));
            M6 = Convert.ToInt32(float.Parse(inputM6.Text));
            M7 = Convert.ToInt32(float.Parse(inputM7.Text));
            M8 = Convert.ToInt32(float.Parse(inputM8.Text));
            M9 = Convert.ToInt32(float.Parse(inputM9.Text));

            drawTriangle(drawPanelGraphics, X1, X2, X3, Y1, Y2, Y3);

            int[,] draw =
            {
                {X1, Y1, 1},
                {X2, Y2, 1},
                {X3, Y3, 1}
            };

            drawMatrix = draw;

            int[,] MTU =
            {
                {M1, M2, M3},
                {M4, M5, M6},
                {M7, M8, M9}
            };

            MTUMatrix = MTU;

            int[,] resMatrix = mulMatrix(drawMatrix, MTUMatrix);
            drawFinal(MTUPanelGraphics, resMatrix);
        }

        private void drawTriangle(Graphics g, int X1, int X2, int X3, int Y1, int Y2, int Y3)
        {
            int x = drawPanel.Width / 2;
            int y = drawPanel.Height / 2;
            drawPanel.CreateGraphics().TranslateTransform(-x, -y);

            Point[] drawTriangle = new Point[3];
            drawTriangle[0] = new Point(X1, Y1);
            drawTriangle[1] = new Point(X2, Y2);
            drawTriangle[2] = new Point(X3, Y3);

            g.DrawPolygon(new Pen(Color.Black), drawTriangle);
        }

        private void drawFinal(Graphics g, int[,] matrix)
        {
            int x = MTUPanel.Width / 2;
            int y = MTUPanel.Height / 2;
            MTUPanel.CreateGraphics().TranslateTransform(-x, -y);

            Point[] triangle = new Point[3];
            for (int i = 0; i < 3; i++)
            {
                triangle[i] = new Point(matrix[i, 0], matrix[i, 1]);
                g.DrawString("(" + matrix[i, 0] + ", " + matrix[i, 1] + ")", new Font("Times New Roman", 8), new SolidBrush(Color.Red), new Rectangle(matrix[i, 0], matrix[i, 1], 100, 30));
            }
            g.DrawPolygon(new Pen(Color.Black), triangle);
        }
        public static int[,] mulMatrix(int[,] matrix, int[,] matrix2)
        {
            int[,] firstResult = new int[3, 3];
            int[,] secondResult = new int[3, 3];
            int[,] thirdResult = new int[3, 3];
            int[,] finalResult = new int[3, 2];
            int[,] M =
            {
                {1, 0, 0},
                {0, 1, 0},
                {-1, -1, 1},
            };

            int[,] Ms =
            {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1},
            };

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    for (int k = 0; k < 3; k++)
                    {
                        firstResult[i, j] += M[i, k] * matrix2[k, j];
                    }
                }
            }

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    for (int k = 0; k < 3; k++)
                    {
                        secondResult[i, j] += firstResult[i, k] * Ms[k, j];
                    }
                }
            }

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    for (int k = 0; k < 3; k++)
                    {
                        thirdResult[i, j] += matrix[k, j] * secondResult[i, k];
                    }
                }
            }

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    {
                        finalResult[i, j] = thirdResult[i, j];
                    }
                }
            }

            return finalResult;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}