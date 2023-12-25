using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Windows.Forms;

namespace PRAKTIKUM1
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

            //Inisiasi Pen dan Assign nilainya untuk menjadi outline dari tiap bentuk
            Pen skyPen          = new Pen(Color.FromArgb(200, Color.Orange));
            Pen mountainPen     = new Pen(Color.DarkSlateGray, 20);
            Pen innerSunPen     = new Pen(Color.LightGoldenrodYellow, 10);
            Pen secOutterSunPen = new Pen(Color.FromArgb(100, Color.Yellow));
            Pen outterSunPen    = new Pen(Color.FromArgb(100, Color.Orange));

            //Inisiasi Brush dan Assign nilainya untuk mengisi warna tiap bentuk
            Brush skyBrush          = new SolidBrush(Color.FromArgb(200, Color.Orange));
            Brush mountainBrush     = new SolidBrush(Color.Gray);
            Brush innerSunBrush     = new SolidBrush(Color.LightGoldenrodYellow);
            Brush secOutterSunBrush = new SolidBrush(Color.FromArgb(100, Color.Yellow));
            Brush outterSunBrush    = new SolidBrush(Color.FromArgb(100, Color.Orange));

            //Membuat Background menjadi berwarna langit senja
            graphics.DrawRectangle(skyPen, 0, 0, 600, 400);
            graphics.FillRectangle(skyBrush, 0, 0, 600, 400);

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
            graphics.DrawClosedCurve(mountainPen, leftMountain);
            graphics.FillClosedCurve(mountainBrush, leftMountain);

            graphics.DrawClosedCurve(mountainPen, rightMountain);
            graphics.FillClosedCurve(mountainBrush, rightMountain);

            //Inisiasi dan Assign titik koordinat untuk matahari
            Rectangle innerSunSize = new Rectangle(270, 40, 30, 30);
            Rectangle secOutterSunSize = new Rectangle(250, 20, 70, 70);
            Rectangle OutterSunSize = new Rectangle(235, 5, 100, 100);

            //Membuat Matahari yang terdiri dari 3 lingkaran berbeda dengan tujuan untuk membuat efek gradasi
            graphics.DrawEllipse(outterSunPen, OutterSunSize);
            graphics.FillEllipse(outterSunBrush, OutterSunSize);
            graphics.DrawEllipse(secOutterSunPen, secOutterSunSize);
            graphics.FillEllipse(secOutterSunBrush, secOutterSunSize);
            graphics.DrawEllipse(innerSunPen, innerSunSize);
            graphics.FillEllipse(innerSunBrush, innerSunSize);
        }
    }
}