using System.Windows.Forms;

namespace Tugas7
{
    public partial class Form1 : Form
    {
        private Bitmap image;
        private PictureBox pictureBox;
        private Point lastTranslate = Point.Empty;
        private float scaleFactor = 1.0f;
        public Form1()
        {
            InitializeComponent();
            rotateScrollBar.Minimum = -180;
            rotateScrollBar.Maximum = 180;

            pictureBox = new PictureBox();
            pictureBox.SizeMode = PictureBoxSizeMode.AutoSize;

            xScrollBar.Scroll += xScroll_Scroll;
            yScrollBar.Scroll += yScroll_Scroll;
            rotateScrollBar.Scroll += rotateScroll_Scroll;

            xScrollBar.Value = (xScrollBar.Maximum - xScrollBar.Minimum) / 2;
            yScrollBar.Value = (yScrollBar.Maximum - yScrollBar.Minimum) / 2;
        }

        private void openToolStripMenuItem_Click(object sender, EventArgs e)
        {
            using (OpenFileDialog openFileDialog = new OpenFileDialog())
            {
                openFileDialog.Filter = "Image Files|*.jpg;*.jpeg;*.png;*.gif;*.bmp";

                if (openFileDialog.ShowDialog() == DialogResult.OK)
                {
                    image = new Bitmap(openFileDialog.FileName);
                    DisplayImage(image); // Display the image in the resultPanel
                }
            }
        }

        private void rotateScroll_Scroll(object sender, ScrollEventArgs e)
        {
            float rotationAngle = rotateScrollBar.Value;
            if (image != null)
            {
                RotateImage(rotationAngle);
            }
        }

        private void yScroll_Scroll(object sender, ScrollEventArgs e)
        {
            if (image != null)
            {
                int xTranslate = xScrollBar.Value;
                int yTranslate = yScrollBar.Value;
                Point centerPoint = new Point(pictureBox.Width / 2 + lastTranslate.X, pictureBox.Height / 2 + lastTranslate.Y);
                TranslateImage(xTranslate, yTranslate);
            }
        }

        private void xScroll_Scroll(object sender, ScrollEventArgs e)
        {
            if (image != null)
            {
                int xTranslate = xScrollBar.Value;
                int yTranslate = yScrollBar.Value;
                Point centerPoint = new Point(pictureBox.Width / 2 + lastTranslate.X, pictureBox.Height / 2 + lastTranslate.Y);
                TranslateImage(xTranslate, yTranslate);
            }
        }

        private void MainForm_Load(object sender, EventArgs e)
        {
            TranslateImage(xScrollBar.Value, yScrollBar.Value);
        }

        private void DisplayImage(Bitmap image)
        {
            pictureBox.Image = image;
            pictureBox.SizeMode = PictureBoxSizeMode.Zoom;

            // Set the PictureBox size to match the panel size
            pictureBox.Size = panel1.ClientSize;

            panel1.Controls.Clear();
            panel1.Controls.Add(pictureBox);

            centerImage();
        }

        private void TranslateImage(int x, int y)
        {
            pictureBox.Location = new Point(x, y);
            lastTranslate = new Point(x, y);
        }

        private void RotateImage(float angle)
        {
            if (pictureBox.Image != null)
            {
                Bitmap rotatedImage = RotateImage(image, angle);
                pictureBox.Image = rotatedImage;
                Point centerPoint = new Point(pictureBox.Width / 2 + lastTranslate.X, pictureBox.Height / 2 + lastTranslate.Y);
                TranslateImage(centerPoint.X - pictureBox.Width / 2, centerPoint.Y - pictureBox.Height / 2);
            }
        }

        private void centerImage()
        {
            int x = (panel1.ClientSize.Width - (int)(pictureBox.Width * scaleFactor)) / 2;
            int y = (panel1.ClientSize.Height - (int)(pictureBox.Height * scaleFactor)) / 2;
            TranslateImage(x, y);
        }

        private Bitmap RotateImage(Bitmap image, float angle)
        {
            Bitmap rotatedImage = new Bitmap(image.Width, image.Height);
            rotatedImage.SetResolution(image.HorizontalResolution, image.VerticalResolution);

            using (Graphics g = Graphics.FromImage(rotatedImage))
            {
                g.TranslateTransform(image.Width / 2, image.Height / 2);
                g.RotateTransform(angle);
                g.ScaleTransform(scaleFactor, scaleFactor); // Apply the scale
                g.TranslateTransform(-image.Width / 2, -image.Height / 2);
                g.DrawImage(image, new Point(0, 0));
            }

            return rotatedImage;
        }
    }
}