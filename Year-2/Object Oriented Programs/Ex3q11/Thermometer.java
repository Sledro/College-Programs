/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: A thermometer classS
*/

public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
	private double fahrenheit;	
	// celsius is accessible to all methods in this class
	
	public Thermometer()		// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		this.celsius = cel;		
	}

	public double getCelsius()
	{
		return celsius;
	}

	public double getFahrenheit()
	{
		fahrenheit= ((celsius-32)*5.0)/9.0;
		
		return fahrenheit;
	}

	public void setFahrenheit(double far)
	{
		this.fahrenheit = far;		
	}
	

} // end class Thermometer
