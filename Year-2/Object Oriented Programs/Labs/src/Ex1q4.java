/**
** Author: DH           Date: 25 September '15
**
** Description: Write a Java application calculates the squares and cubes of the numbers 
**				from 1 to 5 and  prints the following table of values:
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


public class Ex1q4
{
   public static void main(String args[])
   {
      int power = 1, cubed, square=1;
      final int MAX = 5;
      
      System.out.println("Number  Squared Cubed");
      while ( power <= MAX )
      {
    	 square = (int) Math.pow(power,2);
         cubed = (int) Math.pow(power,3);
         
         System.out.println(power  + "\t " + square + "\t " + cubed);
         power++;
        
      }
      
   }
}
