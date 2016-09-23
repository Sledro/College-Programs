using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace L1Q2
{
    public partial class Form1 : Form
    {

        double EUR;
        double USD;
        double AUD;
        double BHAT;
        double inputCurr;

        public Form1()
        {
            InitializeComponent();
        }

        //Euro to US Euro
        public static double EUR2EUR(double inputCurr)
        {
            double EUR = 1;
            double total = 0;

            total = inputCurr * EUR;

            return total;
        }

        //Euro to US Dollar
        public static double EUR2USD(double inputCurr)
        {
            double USD = 1.09;
            double total = 0;

            total = inputCurr * USD;

            return total;
        }

        //Euro to Australian Dollar
        public static double EUR2AUD(double inputCurr)
        {
            double AUD = 1.55;
            double total = 0;

            total = inputCurr * AUD;

            return total;
        }

        //Euro to Bhat
        public static double EUR2BHAT(double inputCurr)
        {
            double BHAT = 39.04;
            double total = 0;

            total = inputCurr * BHAT;

            return total;
        }

        //US Dollar to US Dollar
        public static double USD2USD(double inputCurr)
        {
            double USD = 1;
            double total = 0;

            total = inputCurr * USD;

            return total;
        }

        //US Dollar to Euro
        public static double USD2EUR(double inputCurr)
        {
            double EUR = .92;
            double total = 0;

            total = inputCurr * EUR;

            return total;
        }

        //US Dollar to AUD
        public static double USD2AUD(double inputCurr)
        {
            double AUD = 1.42;
            double total = 0;

            total = inputCurr * AUD;

            return total;
        }

        //US Dollar to Bhat
        public static double USD2BHAT(double inputCurr)
        {
            double BHAT = 35.75;
            double total = 0;

            total = inputCurr * BHAT;

            return total;
        }

        //Australian Dollar to Australian Dollar
        public static double AUD2AUD(double inputCurr)
        {
            double AUD = 1;
            double total = 0;

            total = inputCurr * AUD;

            return total;
        }

        //Australian Dollar to Euro
        public static double AUD2EUR(double inputCurr)
        {
            double EUR = .65;
            double total = 0;

            total = inputCurr * EUR;

            return total;
        }

        //Australian Dollar to US Dollar
        public static double AUD2USD(double inputCurr)
        {
            double USD = .71;
            double total = 0;

            total = inputCurr * USD;

            return total;
        }

        //Australian Dollar to Thai Bhat
        public static double AUD2BHAT(double inputCurr)
        {
            double BHAT = 25.22;
            double total = 0;

            total = inputCurr * BHAT;

            return total;
        }

        //Thai Bhat to Thai Bhat
        public static double BHAT2BHAT(double inputCurr)
        {
            double BHAT = 1;
            double total = 0;

            total = inputCurr * BHAT;

            return total;
        }

        //Thai Bhat to Thai Bhat
        public static double BHAT2EUR(double inputCurr)
        {
            double EUR = 0.026;
            double total = 0;

            total = inputCurr * EUR;

            return total;
        }

        //Thai Bhat to Thai Bhat
        public static double BHAT2USD(double inputCurr)
        {
            double USD = 0.028;
            double total = 0;

            total = inputCurr * USD;

            return total;
        }

        //Thai Bhat to Thai Bhat
        public static double BHAT2AUD(double inputCurr)
        {
            double AUD = 0.04;
            double total = 0;

            total = inputCurr * AUD;

            return total;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (comboBox1.Text =="EUR")
            {
                if (comboBox2.Text == "EUR")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(EUR2EUR(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "USD")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(EUR2USD(inputCurr));
                    textBox1.Text = answer;
                }
                else if(comboBox2.Text == "AUD")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(EUR2AUD(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "BHAT")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(EUR2BHAT(inputCurr));
                    textBox1.Text = answer;
                }
            }

            else if (comboBox1.Text == "USD")
            {
                if (comboBox2.Text == "USD")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(USD2USD(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "EUR")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(USD2EUR(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "AUD")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(USD2EUR(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "BHAT")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(USD2BHAT(inputCurr));
                    textBox1.Text = answer;
                }
            }

            else if (comboBox1.Text == "AUD")
            {
                if (comboBox2.Text == "AUD")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(AUD2AUD(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "EUR")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(AUD2EUR(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "USD")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(AUD2USD(inputCurr));
                    textBox1.Text = answer;
                }
                else if (comboBox2.Text == "BHAT")
                {
                    double inputCurr = Convert.ToDouble(textBox1.Text);
                    string answer = Convert.ToString(AUD2BHAT(inputCurr));
                    textBox1.Text = answer;
                }

                else if (comboBox1.Text == "BHAT")
                {
                    if (comboBox2.Text == "BHAT")
                    {
                        double inputCurr = Convert.ToDouble(textBox1.Text);
                        string answer = Convert.ToString(BHAT2BHAT(inputCurr));
                        textBox1.Text = answer;
                    }
                    else if (comboBox2.Text == "EUR")
                    {
                        double inputCurr = Convert.ToDouble(textBox1.Text);
                        string answer = Convert.ToString(BHAT2EUR(inputCurr));
                        textBox1.Text = answer;
                    }
                    else if (comboBox2.Text == "AUD")
                    {
                        double inputCurr = Convert.ToDouble(textBox1.Text);
                        string answer = Convert.ToString(BHAT2AUD(inputCurr));
                        textBox1.Text = answer;
                    }
                    else if (comboBox2.Text == "USD")
                    {
                        double inputCurr = Convert.ToDouble(textBox1.Text);
                        string answer = Convert.ToString(BHAT2USD(inputCurr));
                        textBox1.Text = answer;
                    }
                }
            }
        }
    }
}
