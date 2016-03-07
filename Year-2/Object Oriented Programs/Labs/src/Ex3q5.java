/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Write a method called power while takes in two ins and 
**		  will raise int x to the power of int n
*/

public class Ex3q5
{
	public static void power(){
		
		int x=0;
		int y=0;
		
		System.out.println("Enter the first value:");
		x = EasyIn.getInt();
		
		System.out.println("Enter the second value:");
		y = EasyIn.getInt();
		
		System.out.println("Math.pow(" + x + "," + y + ")=" + Math.pow(x, y));
	}
	
	public static void main(String args[])
	{
		power();	
	}
}
