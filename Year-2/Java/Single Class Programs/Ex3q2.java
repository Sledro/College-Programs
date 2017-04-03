/*
** Author: DH	Date: October 2015
** Purpose: A method powersOfTwo that print the first 10 powers of 2 including 2
*/

public class Ex3q2
{
	public static void powersOfTwo(){
		int x=0;
		int y=0;
		
		for(y=2; y<=10; y++){
		System.out.println("Math.pow(" + x + "," + y + ")=" + Math.pow(x, y));
		}
	}
	
	public static void main(String args[])
	{
		powersOfTwo();			
	}
}
