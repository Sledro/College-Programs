/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Write a method called multiConcat that takes a String and an integer as parameters. Return a string 
*		  that consists of the string parameter concatenated with itself count times, where count is the integer 
*		  parameter. For example, if the parameter values are “hi” and 4, the return value is “hihihihi”. Return 
*		  the original string if the integer parameter is less than 2.Q6. 
*/

public class Ex3q9
{
	public static String multiConcat(String sentence, int count){
		
		String answer="";
		
		for(int x = 0; x < count; x++ ){
			answer += sentence;
		}
		
		return answer;
	}
	
	public static void main(String args[])
	{
		String sentence;
		int count;
		
		System.out.println("Please enter a sentance:");
		sentence = EasyIn.getString();
		
		System.out.println("Please enter a number:");
		count = EasyIn.getInt();
		
		System.out.println(multiConcat(sentence,count));	
	}
}
