/*
** Author: DH	Date: October 2015
** Purpose: A method sum100 that returns the sum of the integers from 1 to 100 inclusive
*/

public class Ex3q3
{
	public static void sum100(){
		int y;
		int ans=0;
		
		for(y=1; y<=100; y++){
			ans+=y;
		}
		
		System.out.print(ans);
	}
	
	public static void main(String args[])
	{
		sum100();			
	}
}
