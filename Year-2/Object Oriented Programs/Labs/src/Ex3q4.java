/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Method farToCel c=5/9*(f-32)
*/

public class Ex3q4
{
	public static void intro(){
		System.out.println("*****************************");
		System.out.println("Introduction to Java Methods!");
		System.out.println("*****************************");
	}
	
	public static void farToCel(){
		
		int input;
		double cel;
		
		System.out.println("Enter a tempature in Farenheight:");
		input = EasyIn.getInt();
		
		cel= ((input-32)*5.0)/9.0;
		
		System.out.println( input + " Converted to Celcius is: " + cel);
	}
	
	public static void main(String args[])
	{
		intro();	
		farToCel();
	}
}
