/*
** Author: DH	Date: September 2015
** Purpose: Show the temp in cel and far.
*/

public class Ex1q5
{
	
	public static void main(String args[])
	{
		int temp;
		int index = 32;
		
		System.out.println("Fahrenheit	Celsius");
		
		while(index <= 212)
			{
				temp = (int)Math.round(5.0/9.0*(index-32));
				System.out.println(" " + index + " \t\t "+ temp);
				index+=12;
			}
	}
}
