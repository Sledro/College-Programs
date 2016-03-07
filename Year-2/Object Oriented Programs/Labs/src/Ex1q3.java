/**
** Author: DH           Date: 25 September '15
**
** Description:Write an application that reads an integer value and prints the sum of all even integers
** between 2 and the input value, inclusive. Print an error message if the input value is less than 2. Prompt accordingly.
**
** Pseudocode:
**
** Prompt to read in integer
** if entered integer is less then 2
**    print error message
** else
**	  while input is bigger then 0 (i)
**    add one to i
**    if i divided by 2 = 0 
**    	add
**	Print total
** 
**
*/

public class Ex1q3
{
	
   public static void main(String args[])
   {
	   int input, i=0, total=0;

      System.out.println("Please enter a number: ");
      input = EasyIn.getInt();
      
      if(input < 2){
    	  System.out.println("You must enter a number above 1.");
      }
      else{
    	  while(i<input){
    		  i++;
    		 
    		  if(i%2==0){
    			  total = total + i;
    		  }
    	  }
      }
      System.out.println(total);
   }
}
