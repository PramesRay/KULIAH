using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Text;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UTS
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Form1_Paint(object sender, PaintEventArgs e)
        {
            //Inisiasi Graphics
            Graphics graphics = e.Graphics;

            DrawSky(graphics);
            DrawMountain(graphics);
            DrawSun(graphics);
            DrawLand(graphics, 0, 180);

            DrawGrass(graphics);
            DrawHouse(graphics);
            DrawRoad(graphics);
            DrawTree(graphics, 290, 300, 1);
            DrawTree(graphics, 430, 240, 2);
            DrawTree(graphics, 540, 200, 3);
        }
        private void DrawTree(Graphics g, int x, int y, int distance)
        {
            Pen trunkPen = new Pen(Color.SaddleBrown, 40/distance);
            g.DrawLine(trunkPen, x, y, x, y + 150/distance);

            // Gambar daun pohon
            SolidBrush leavesBrush = new SolidBrush(Color.Green);
            int leavesSize = 100/distance;
            int leavesX = x - leavesSize / 2;
            int leavesY = y - leavesSize; // Sesuaikan tinggi daun
            g.FillEllipse(leavesBrush, leavesX, leavesY, leavesSize, leavesSize);

            // Gambar lebih banyak detail di daun
            SolidBrush darkLeavesBrush = new SolidBrush(Color.DarkGreen);
            g.FillEllipse(darkLeavesBrush, leavesX - 20/distance, leavesY + 10/distance, leavesSize, leavesSize);
            g.FillEllipse(darkLeavesBrush, leavesX + 20/distance, leavesY + 10/distance, leavesSize, leavesSize);
            g.FillEllipse(darkLeavesBrush, leavesX, leavesY - 20/distance, leavesSize, leavesSize);
        }

        private void DrawLand(Graphics g, int x, int y)
        {
            g.FillRectangle(Brushes.Green, x, y, 600, 300);
        }

        private void DrawGrass(Graphics g)
        {
            Pen pen = new Pen(Color.Green, 2); // Gunakan warna hitam dan ketebalan garis yang sesuai
            Random random = new Random();

            int numBlades = 300; // Jumlah rumput
            int minHeight = 10;
            int maxHeight = 30;

            for (int i = -10; i < numBlades; i++)
            {
                int x = i * (this.Width / numBlades); // Spasi horizontal
                int grassHeight = random.Next(minHeight, maxHeight); // Tinggi yang bervariasi
                int y = 190 - grassHeight;

                // Menggambar rumput dalam bentuk segitiga
                g.DrawLine(pen, x, y, x + 5, y + grassHeight); // Garis segitiga bagian kiri
                g.DrawLine(pen, x + 5, y + grassHeight, x + 10, y); // Garis segitiga bagian kanan
            }

        }
        private void DrawHouse(Graphics g)
        {
            // Gambar dinding rumah
            SolidBrush wallBrush = new SolidBrush(Color.Black);
            g.FillRectangle(wallBrush, 0, 200, 300, 200);

            // Gambar atap rumah
            Point[] roofPoints = { 
                new Point(0, 200), 
                new Point(300, 200), 
                new Point(145, 100) 
            };
            SolidBrush roofBrush = new SolidBrush(Color.Black);
            g.FillPolygon(roofBrush, roofPoints);

            // Gambar pintu
            SolidBrush doorBrush = new SolidBrush(Color.Black);
            g.FillRectangle(doorBrush, 140, 350, 80, 100);

            // Gambar jendela
            SolidBrush windowPen = new SolidBrush(Color.LightGray);
            g.FillRectangle(windowPen, 40, 250, 80, 80);
            g.FillRectangle(windowPen, 180, 250, 80, 80);
        }

        private void DrawRoad(Graphics g) 
        {
            Brush roadBrush = new SolidBrush(Color.Gray);

            //Inisiasi dan Assign titik koordinat untuk membuat jalanan
            PointF[] road =
            {
                new PointF(630.00F, 200.00F),
                new PointF(630.00F, 400.00F),
                new PointF(320.00F, 400.00F),
            };

            //Membuat Jalanan menggunakan Polygon karena membutuhkan 4 sudut yang memiliki titik koordinat yang berbeda - beda

            g.FillPolygon(roadBrush, road);
        }
        private void DrawSky(Graphics g)
        {
            Pen skyPen = new Pen(Color.FromArgb(200, Color.Orange));
            Brush skyBrush = new SolidBrush(Color.FromArgb(200, Color.Orange));
            
            //Membuat Background menjadi berwarna langit senja
            g.DrawRectangle(skyPen, 0, 0, 600, 400);
            g.FillRectangle(skyBrush, 0, 0, 600, 400);
        }

        private void DrawMountain(Graphics g)
        {
            Pen mountainPen = new Pen(Color.DarkSlateGray, 20);
            Brush mountainBrush = new SolidBrush(Color.Gray);

            //Inisiasi dan Assign titik koordinat untuk tiap-tiap gunung
            PointF[] leftMountain =
            {
                new PointF(10.00F, 200.00F),
                new PointF(100.00F, 100.00F),
                new PointF(200.00F, 100.00F),
                new PointF(300.00F, 200.00F),
            };

            PointF[] rightMountain =
            {
                new PointF(300.00F, 200.00F),
                new PointF(400.00F, 50.00F),
                new PointF(500.00F, 100.00F),
                new PointF(590.00F, 200.00F),
            };

            //Membuat Gunung kiri dan kanan dengan menggunakan ClosedCruve agar bentuk dalamnya bisa diisi dengan Fill
            g.DrawClosedCurve(mountainPen, leftMountain);
            g.FillClosedCurve(mountainBrush, leftMountain);
            
            g.DrawClosedCurve(mountainPen, rightMountain);
            g.FillClosedCurve(mountainBrush, rightMountain);
        }

        private void DrawSun(Graphics g)
        {
            Pen innerSunPen = new Pen(Color.LightGoldenrodYellow, 10);
            Pen secOutterSunPen = new Pen(Color.FromArgb(100, Color.Yellow));
            Pen outterSunPen = new Pen(Color.FromArgb(100, Color.Orange));

            Brush innerSunBrush = new SolidBrush(Color.LightGoldenrodYellow);
            Brush secOutterSunBrush = new SolidBrush(Color.FromArgb(100, Color.Yellow));
            Brush outterSunBrush = new SolidBrush(Color.FromArgb(100, Color.Orange));

            //Inisiasi dan Assign titik koordinat untuk matahari
            Rectangle innerSunSize = new Rectangle(270, 40, 30, 30);
            Rectangle secOutterSunSize = new Rectangle(250, 20, 70, 70);
            Rectangle OutterSunSize = new Rectangle(235, 5, 100, 100);

            //Membuat Matahari yang terdiri dari 3 lingkaran berbeda dengan tujuan untuk membuat efek gradasi
            g.DrawEllipse(outterSunPen, OutterSunSize);
            g.FillEllipse(outterSunBrush, OutterSunSize);
            g.DrawEllipse(secOutterSunPen, secOutterSunSize);
            g.FillEllipse(secOutterSunBrush, secOutterSunSize);
            g.DrawEllipse(innerSunPen, innerSunSize);
            g.FillEllipse(innerSunBrush, innerSunSize);
        }
    }
}
