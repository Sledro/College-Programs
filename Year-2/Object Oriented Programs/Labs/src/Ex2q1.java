/*
** Author: DH	Date: October 2015
** Purpose: Write a Java application to input a single integer value and output the
**			 corresponding number of *'s
*/

public class Ex2q1
{
	
	public static void main(String args[])
	{
		int input=0;
		
		System.out.println("Please enter a number: ");
		input = EasyIn.getInt();
		
		for(int i=0; i<input; i++){
			System.out.print("*");
		}
	}
}
