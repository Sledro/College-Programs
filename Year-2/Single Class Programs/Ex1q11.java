/*
** Author: FR	Date: 10/15
** java program enter Ascii value and print character
*/
public class Ex1q11
{
	
	public static void main(String args[])
	{
		
		int index = 32;
		char letter = ' ';
		
		System.out.println(" Unicode Value       Character ");
				
		for(index =32;index<=126;index++)
		{
			System.out.println(index+ "                     " +letter);	
			letter++;
			
		
		}
	}
}
