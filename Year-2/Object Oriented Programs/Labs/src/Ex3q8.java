/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Write a method called evenlyDivisible that accepts two integer value parameters and returns true 
*		  if the first parameter is evenly divisible by the second, or vice versa, and false otherwise. 
*		  Return false if either parameter is zero.
*/

public class Ex3q8
{
	public static String evenlyDivisible(int num1, int num2){
		
		String answer;
		
		if(num1 % num2 == 0 ){
			answer = "True";
		}else{
			answer = "False";
		}
		
		return answer;
	}
	
	public static void main(String args[])
	{
		int num1;
		int num2;
		
		System.out.println("Please enter the first number:");
		num1 = EasyIn.getInt();
		
		System.out.println("Please enter the second number:");
		num2 = EasyIn.getInt();
		
		System.out.println(evenlyDivisible(num1,num2));	
	}
}
