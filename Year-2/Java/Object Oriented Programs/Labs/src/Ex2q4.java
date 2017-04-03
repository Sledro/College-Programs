/*
** Author: DH	Date: October 2015
** Purpose: Write a Java application to input a number between 1 and 19 and then print the
**			factorial of that number e.g 5! = 5.4.3.2.1.
*/

public class Ex2q4
{
	public static void main(String args[])
	{
		int input=0;
		int ans=1;
		
		System.out.println("Please enter a number between 1 and 19: ");
		input = EasyIn.getInt();
			
	       for (int i = 1; i <= input; i++) {
	           ans = ans * i;
	       }
	       
	       System.out.println("!" + input + " : " + ans);
	}
}
