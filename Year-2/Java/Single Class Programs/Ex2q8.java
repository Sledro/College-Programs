/*
** Author: DH	Date: October 2015
** Purpose: A program that ask for an input and print all the prime numbers up as far as
*			that number.
*/

public class Ex2q8
{
	public static void main(String args[])
	{
		 System.out.println("Enter a posative integer: ");
		 int input = EasyIn.getInt();
	      
		 System.out.println("------------------------------------");
		 System.out.println(" The Prime numbers from 1 to " + input + " are ");
		 System.out.println("------------------------------------");
		 
	     for (int i = 1; i <= input; i++){
	    	  
	    	 int counter=0; 
	    	  
	         for(int num =i; num>=1; num--){
			    if(i%num==0){
			    	counter = counter + 1;
			    }
	         }
			 if (counter==2){
			    System.out.print(i + ", ");
			 }	
	     }	
	 }
}
