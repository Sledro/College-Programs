/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Write a method called factorial that takes in a single int value and retuns its factorial 
*/

public class Ex3q10
{
	public static int factorial(int input){
		
	   int answer=1;
		
       for (int i = 1; i <= input; i++) {
    	   answer = answer * i;
       }
		
		return answer;
	}
	
	public static void main(String args[])
	{
		
		int input;
		
		System.out.println("Please enter a number:");
		input = EasyIn.getInt();
		
		System.out.println(factorial(input));	
	}
}
