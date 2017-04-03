/*
** Author: DH	Date: September 2015
** Purpose: Write a Java application that inputs a series of 10 integers, and determines and prints 
** 			the largest of the numbers. 
*/

public class Ex1q9
{
	
	public static void main(String args[])
	{
		int input=0;
		int first=0;
		
		for(int i=0; i<10; i++){
			System.out.println("Please enter a number: ");
			input = EasyIn.getInt();

			if(input>first){
				first = input;
				
			}
			
		}
		

		
		System.out.println("Here: " + first);
		
	}
}
