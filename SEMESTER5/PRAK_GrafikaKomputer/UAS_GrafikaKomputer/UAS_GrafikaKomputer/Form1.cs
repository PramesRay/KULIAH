using System;
using System.Threading;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Net.Mime.MediaTypeNames;

namespace UAS_GrafikaKomputer
{
    
    public partial class Form1 : Form
    {
        public float[,] option = new float[100,3];
        public int Count = -1;
        private float[,] temp = new float[1, 3];
        public Bitmap gambar = null;

        public Form1()
        {
            InitializeComponent();
        }


        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void buttonTranslate_Click_1(object sender, EventArgs e)
        {
            option[Count + 1, 0] = 1;

            float.TryParse(inputXTranslate.Text, out option[Count + 1, 1]);
            float.TryParse(inputYTranslate.Text, out option[Count + 1, 2]);

            Count += 1;
        }

        private void buttonRotate_Click_1(object sender, EventArgs e)
        {
            option[Count + 1, 0] = 2;

            float.TryParse(inputDegRotate.Text, out option[Count + 1, 1]);
            float.TryParse(inputDegRotate.Text, out option[Count + 1, 2]);

            Count += 1;
        }

        private void buttonScale_Click_1(object sender, EventArgs e)
        {
            option[Count + 1, 0] = 3;

            float.TryParse(inputXScale.Text, out option[Count + 1, 1]);
            float.TryParse(inputYScale.Text, out option[Count + 1, 2]);

            Count += 1;
        }

        private void buttonRemoveIdx_Click_1(object sender, EventArgs e)
        {
            int indexDel = Convert.ToInt32(inputIdx.Text);
            
            for (int j = indexDel; j <= Count; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    option[j, k] = option[j + 1, k];
                }
            }

            Count--;
        }

        private void buttonSwap_Click_1(object sender, EventArgs e)
        {
            int a = Convert.ToInt32(inputIdx1.Text);
            int b = Convert.ToInt32(inputIdx2.Text);

            float temp = 0;

            for (int i = 0; i < 3; i++)
            {
                temp = option[a, i];
                option[a, i] = option[b, i];
                option[b, i] = temp;
            }
        }

        private void buttonShowTransform_Click_1(object sender, EventArgs e)
        {
            String hasil = "";
            if (Count < 0)
            {
                hasil = "Belum ada operasi Transformasi !";

            }
            else
            {
                for (int i = 0; i <= Count; i++)
                {
                    hasil = hasil + "[" + i + "]";
                    
                    switch (option[i, 0])
                    {
                        case 1:
                            hasil = hasil + " Translasi \t(" + option[i, 1] + " X ," + option[1, 2] + " Y)";
                            break;
                        case 2:
                            hasil = hasil + " Rotasi \t(" + option[i, 1] + " deg CW )";
                            break;
                        case 3:
                            hasil = hasil + " Skala \t\t(" + option[i, 1] + " x X ," + option[1, 2] + " x Y)";
                            break;
                    }
                    hasil = hasil + "\n";
                }
            }
            MessageBox.Show(hasil, "Daftar Transformasi");
        }

        private void buttonDraw_Click_1(object sender, EventArgs e)
        {
            panel2.Refresh();
            Matrix X = new Matrix();
            
            for (int i = 0; i <= Count; i++)
            {
                if (option[i, 0] == 1)
                {
                    X.Translate(option[i, 1], option[i, 2], MatrixOrder.Append);
                }
                else if (option[i, 0] == 2)
                {
                    X.RotateAt(option[i, 1], new PointF(panel2.Width / 2, panel2.Height / 2), MatrixOrder.Append);
                }
                else if (option[i, 0] == 3)
                {
                    X.Scale(option[i, 1], option[i, 2], MatrixOrder.Append);
                }
            }
            
            Graphics g = panel2.CreateGraphics();
            g.Transform = X;
            g.DrawImage(gambar, new RectangleF(Convert.ToSingle(panel2.Width / 2 - 50), (float)(panel2.Height / 2 - 50), 100, 100));
        }

        private void addFile_Click(object sender, EventArgs e)
        {
            OpenFileDialog opnfd = new OpenFileDialog();
            opnfd.Filter = "Image Files (*.jpg;*.jpeg;.*.gif;)|*.jpg;*.jpeg;.*.gif";
            
            if (opnfd.ShowDialog() == DialogResult.OK)
            {
                gambar = new Bitmap(opnfd.FileName);
                panel1.Invalidate();
            }
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = panel1.CreateGraphics();
            if (gambar != null)
            {
                g.DrawImage(gambar, (float)(panel1.Width / 2 - 50), (float)(panel1.Height / 2 - 50), 100, 100);
            }
        }

        private void buttonReset_Click(object sender, EventArgs e)
        {
            Count = -1;
            panel2.Invalidate();
        }
    }
}