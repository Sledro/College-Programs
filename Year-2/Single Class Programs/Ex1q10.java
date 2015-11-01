/*
** Author: DH	Date: September 2015
** Purpose: Write a Java application to input any number of non-zero integer values (use 0 as a sentinel value). 
**	Count the number of integers entered and find the largest and the smallest number entered. How does your 
**	program behave if the first value entered is the sentinel value ?
*/

public class Ex1q10
{
	
	public static void main(String args[])
	{
		int input=0;
		int counter=0;
		int largest=0;
		int smallest=4;
		boolean exit=false;

		while(!exit){ /// exit = true

			System.out.println("Please enter a number: ");
			input = EasyIn.getInt();
			
			if(input==0){
				exit = true;
			}
			
			if(counter==1){
				smallest = input;
			}
			
			if(input>largest){
				largest = input;
			}			
			
			if(input<smallest && input != 0){
				smallest = input;
			}
			
			counter++;
		}

		System.out.println("Count: " + counter);
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		
	}
}
