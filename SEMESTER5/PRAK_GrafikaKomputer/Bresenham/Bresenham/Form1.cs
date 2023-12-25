using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Bresenham
{
    public partial class Form1 : Form
    {
        Graphics lineDasar, lineDDA, lineBresenham, circleDasar, circlePolar, circleBresenham;
        Brush pixel = new SolidBrush(Color.Black);

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lineDasar       = LineDasar_Panel.CreateGraphics();
            lineDDA         = LineDDA_Panel.CreateGraphics();
            lineBresenham   = LineBresenham_Panel.CreateGraphics();

            circleDasar     = CircleDasar_Panel.CreateGraphics();
            circlePolar     = CirclePolar_Panel.CreateGraphics();
            circleBresenham = CircleBresenham_Panel.CreateGraphics();
        }

        private void DrawLine_Button_Click(object sender, EventArgs e)
        {
            int x1 = Convert.ToInt16(x1Line_Input.Text);
            int y1 = Convert.ToInt16(y1Line_Input.Text);

            int x2 = Convert.ToInt16(x2Line_Input.Text);
            int y2 = Convert.ToInt16(y2Line_Input.Text);
        }
    }
}
