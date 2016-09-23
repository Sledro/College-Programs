using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace L1Q1
{
    public partial class Form1 : Form
    {
        string function = "";
        double val1;
        double val2;

        public Form1()
        {
            InitializeComponent();
        }

        private void button10_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "0";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "1"; 
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "2";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "3";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "4";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "5";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "6";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "7";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "8";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text + "9";
        }

        private void button17_Click(object sender, EventArgs e)
        {
            //Make sure there is text in the textbox before trying to run method (Prevent error)
            if (textBox1.Text != "")
                compute(function, val1);

        }

        private void button16_Click(object sender, EventArgs e)
        {
            function = "divide";
            //Make sure there is text in the textbox before trying to convert (Prevent error)
            if (textBox1.Text != "")
                val1 = Convert.ToDouble(textBox1.Text);
            textBox1.Clear();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            function = "multiply";
            //Make sure there is text in the textbox before trying to convert (Prevent error)
            if (textBox1.Text != "")
                val1 = Convert.ToDouble(textBox1.Text);
            textBox1.Clear();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            function = "subtract";
            //Make sure there is text in the textbox before trying to convert (Prevent error)
            if (textBox1.Text != "")
                val1 = Convert.ToDouble(textBox1.Text);
            textBox1.Clear();
        }

        private void button13_Click(object sender, EventArgs e)
        {
            function = "add";
            //Make sure there is text in the textbox before trying to convert (Prevent error)
            if (textBox1.Text!="")
                val1 = Convert.ToDouble(textBox1.Text);
            textBox1.Clear();

        }

        private void button11_Click(object sender, EventArgs e)
        {
            int ok=0;
    
            for (int i=0; i<textBox1.TextLength; i++)
            {
                //Convert from char toString
                if(textBox1.Text[i].ToString()==".")
                {
                    ok = 0; break; // . was found end loop
                }
                else
                {
                    ok = 1;
                }
            }

            if(ok==1)
                textBox1.Text = textBox1.Text + ".";
            else
            { }
                //Do Nothing
        }


        private void button12_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
        }

        public void compute(string function, double val1)
        {
            if(function=="add")
            {
                double answer = val1 + Convert.ToDouble(textBox1.Text);
                textBox1.Text = Convert.ToString(answer);
            }

            else if (function == "subtract")
            {
                double answer = val1 - Convert.ToDouble(textBox1.Text);
                textBox1.Text = Convert.ToString(answer);
            }

            else if (function == "multiply")
            {
                double answer = val1 * Convert.ToDouble(textBox1.Text);
                textBox1.Text = Convert.ToString(answer);
            }

            else if (function == "divide")
            {
                double answer = val1 / Convert.ToDouble(textBox1.Text);
                textBox1.Text = Convert.ToString(answer);
            }
        }
    }
}
