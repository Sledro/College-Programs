/*
** Author: DH	Date: October 2015
** Purpose: Write a app that produces a multiplication table showing the results of multiplying the integers 1 to
*	12 by themselves. 
*/

public class Ex2q6
{
	public static void main(String args[])
	{
		for(int i=0; i<=12; i++){	
			
			System.out.print(i+": ");
			
			for(int x=0; x<=12; x++){	
				System.out.print( i*x + " " );
			}
			System.out.println();	
		}
	}		

}
