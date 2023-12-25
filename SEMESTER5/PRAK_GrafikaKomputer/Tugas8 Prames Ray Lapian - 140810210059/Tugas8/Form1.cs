using System.Collections;
using System.Drawing.Imaging;

namespace Tugas8
{
    public partial class Form1 : Form
    {
        Bitmap image;
        Graphics p1, p2;
        float transR, transG, transB, transA;
        float drjtRot, rcenRot, gcenRot, bcenRot;
        float a00,a01,a02,a03,a10,a11,a12,a13,a20,a21,a22,a23;
        public Form1()
        {
            InitializeComponent();
            p1 = panel1.CreateGraphics();
            p2 = panel2.CreateGraphics();
        }

        private void openFilebtn_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Filter = "Image Files|*.jpg;*.jpeg;*.png;*.gif;*.bmp";

            if (openFileDialog.ShowDialog() == DialogResult.OK)
            {
                image = new Bitmap(openFileDialog.FileName);

                p1.DrawImage(
                    image,
                    0,
                    0,
                    (int)(panel1.Width),
                    (int)(panel1.Height)
                    );
            }
        }

        private void btTranslate_Click(object sender, EventArgs e)
        {
            transR = float.Parse(inputTranR.Text);
            transG = float.Parse(inputTranG.Text);
            transB = float.Parse(inputTranB.Text);
            transA = float.Parse(inputTranA.Text);
            float[][] transArr =
            {
                new float[] {1,0,0,0,0},
                new float[] {0,1,0,0,0},
                new float[] {0,0,1,0,0},
                new float[] {0,0,0,1,0},
                new float[] {transR,transG,transB,transA,1},
            };
            ColorMatrix transMtx = new ColorMatrix(transArr);
            ImageAttributes imgAtrbt = new ImageAttributes();
            imgAtrbt.SetColorMatrix(transMtx, ColorMatrixFlag.Default, ColorAdjustType.Default);
            p2.DrawImage(
               image,
               new Rectangle(0, 0, panel2.Width, panel2.Height),
               0, 0,
               image.Width, image.Height,
               GraphicsUnit.Pixel,
               imgAtrbt
                );
        }

        private void rotateBtn_Click(object sender, EventArgs e)
        {
            drjtRot = float.Parse(inputRotate.Text);
            rcenRot = float.Parse(rCenterRotate.Text);
            gcenRot = float.Parse(gCenterRotate.Text);
            bcenRot = float.Parse(bCenterRotate.Text);

            double r = drjtRot * Math.PI / 180;

            if (rcenRot == 1 && gcenRot == 0 && bcenRot == 0)
            {
                float[][] rotArr =
                {
                    new float[] {(float)Math.Cos(r), (float)Math.Sin(r), 0,0,0},
                    new float[] {-(float)Math.Sin(r), (float)Math.Cos(r), 0,0,0},
                    new float[] {0,0,1,0,0},
                    new float[] {0,0,0,1,0},
                    new float[] {0,0,0,0,1},
                };
                ColorMatrix rotMtx = new ColorMatrix(rotArr);
                ImageAttributes imgAtrbt = new ImageAttributes();
                imgAtrbt.SetColorMatrix(rotMtx, ColorMatrixFlag.Default, ColorAdjustType.Default);
                p2.DrawImage(
                   image,
                   new Rectangle(0, 0, panel2.Width, panel2.Height),
                   0, 0,
                   image.Width, image.Height,
                   GraphicsUnit.Pixel,
                   imgAtrbt
                    );
            }
            if (rcenRot == 0 && gcenRot == 1 && bcenRot == 0)
            {
                float[][] rotArr =
                {
                    new float[] {1,0,0,0,0},
                    new float[] {0, (float)Math.Cos(r), (float)Math.Sin(r), 0,0},
                    new float[] {0, -(float)Math.Sin(r), (float)Math.Cos(r), 0,0},
                    new float[] {0,0,0,1,0},
                    new float[] {0,0,0,0,1},
                };
                ColorMatrix rotMtx = new ColorMatrix(rotArr);
                ImageAttributes imgAtrbt = new ImageAttributes();
                imgAtrbt.SetColorMatrix(rotMtx, ColorMatrixFlag.Default, ColorAdjustType.Default);
                p2.DrawImage(
                   image,
                   new Rectangle(0, 0, panel2.Width, panel2.Height),
                   0, 0,
                   image.Width, image.Height,
                   GraphicsUnit.Pixel,
                   imgAtrbt
                    );
            }
            if (rcenRot == 0 && gcenRot == 0 && bcenRot == 1)
            {
                float[][] rotArr =
                {
                    new float[] { (float)Math.Cos(r), 0, -(float)Math.Sin(r), 0,0},
                    new float[] {0,1,0,0,0},
                    new float[] { (float)Math.Sin(r), 0, (float)Math.Cos(r), 0,0},
                    new float[] {0,0,0,1,0},
                    new float[] {0,0,0,0,1},
                };
                ColorMatrix rotMtx = new ColorMatrix(rotArr);
                ImageAttributes imgAtrbt = new ImageAttributes();
                imgAtrbt.SetColorMatrix(rotMtx, ColorMatrixFlag.Default, ColorAdjustType.Default);
                p2.DrawImage(
                   image,
                   new Rectangle(0, 0, panel2.Width, panel2.Height),
                   0, 0,
                   image.Width, image.Height,
                   GraphicsUnit.Pixel,
                   imgAtrbt
                    );
            }
        }

        private void sheerBtn_Click(object sender, EventArgs e)
        {
            a00 = float.Parse(inputA00.Text);
            a01 = float.Parse(inputA01.Text);
            a02 = float.Parse(inputA02.Text);
            a03 = float.Parse(inputA03.Text);
            a10 = float.Parse(inputA10.Text);
            a11 = float.Parse(inputA11.Text);
            a12 = float.Parse(inputA12.Text);
            a13 = float.Parse(inputA13.Text);
            a20 = float.Parse(inputA20.Text);
            a21 = float.Parse(inputA21.Text);
            a22 = float.Parse(inputA22.Text);
            a23 = float.Parse(inputA23.Text);

            float[][] shearArray =
                {
                    new float[] {a00, a01, a02, a03, 0},
                    new float[] {a10, a11, a12, a13, 0},
                    new float[] {a20, a21, a22, a23, 0},
                    new float[] {0, 0, 0, 1, 0},
                    new float[] {0, 0, 0, 0, 1},
            };

            ColorMatrix shearMatrix = new ColorMatrix(shearArray);
            ImageAttributes imgAtrbt = new ImageAttributes();
            imgAtrbt.SetColorMatrix(shearMatrix, ColorMatrixFlag.Default, ColorAdjustType.Default);
            p2.DrawImage(
               image,
               new Rectangle(0, 0, panel2.Width, panel2.Height),
               0, 0,
               image.Width, image.Height,
               GraphicsUnit.Pixel,
               imgAtrbt
                );

        }
    }
}
