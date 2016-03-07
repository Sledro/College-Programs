/*
** Author: DH	Date: October 2015
** Purpose: A program that will teach up to 12 times table using Math.random() to ask 
*	questions 
*/

public class Ex2q7
{
	public static void main(String args[])
	{
		int answer;
		int input=0;
		boolean exit = false;
		
		while(!exit){
			//Generate two random integers between 0->12
			int r1 = (int) (Math.random()*12);
			int r2 = (int) (Math.random()*12);
			
			answer = r1*r2;
			
			//Keep repeating the question is incorrect
			while(input!=answer){
				System.out.println("\n How much is " + r1 + " times " + r2 + " ? (-1 to quit): ");
				input = EasyIn.getInt();
				
				if(input==answer){
					System.out.println("Very Good!");
				}
				else{
					System.out.println("Try Again..");
				}
				
				//If -1 is entered exit loop and end program
				if(input==-1){
					exit=true;
					input=answer;
					System.out.println("Goodbye!");
				}
			}
		}	
	}		
}
