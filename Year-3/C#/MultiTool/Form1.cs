/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace L1Q3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        //Convert Pound to Euro
        public static double poundToEuro(double inputCurr)
        {
            double EURO = 0.79;
            double total = 0;

            total = inputCurr * EURO;

            return total;
        }

        //Convert Inches to Feet
        public static double inchesToFeet(double inputInches)
        {
            double FEET = 12;
            double total = 0;

            total = inputInches / FEET;

            return total;
        }

        public static double ConvertCelsiusToFahrenheit(double c)
        {
            return ((9.0 / 5.0) * c) + 32;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text != "")
            {
                double inputInches = Convert.ToDouble(textBox1.Text);
                textBox2.Text = Convert.ToString(inchesToFeet(inputInches));
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (textBox3.Text != "")
            {
                double inputPound = Convert.ToDouble(textBox3.Text);
                textBox4.Text = Convert.ToString(poundToEuro(inputPound));
            }
        }

        private void tabControl1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox5.Text != "")
            {
                double c = Convert.ToDouble(textBox5.Text);
                textBox6.Text = Convert.ToString(ConvertCelsiusToFahrenheit(c));
            }
        }

        private void menuToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void inchesToFeetToolStripMenuItem_Click(object sender, EventArgs e)
        {
            tabControl1.SelectTab(0);
        }

        private void poundToEuroToolStripMenuItem_Click(object sender, EventArgs e)
        {
            tabControl1.SelectTab(1);
        }

        private void celciusToFarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            tabControl1.SelectTab(2);
        }
    }
}
