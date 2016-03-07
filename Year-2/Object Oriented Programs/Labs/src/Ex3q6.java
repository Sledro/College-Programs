/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Write a method called search that will search a String Object for 
**			Occurrences of a specified charter
*/

public class Ex3q6
{
	public static void search(){
		
		String string;
		char searchChar=' ';
		int counter=0;
		
		System.out.println("Enter a string:");
		string = EasyIn.getString();
		
		System.out.println("Enter a search charater:");
		searchChar = EasyIn.getChar();
		
		for(int i=0; i<string.length(); i++){
			
			if(string.charAt(i) == searchChar){
			counter++;	
			}		
		}

		if(counter==0){
			System.out.println("Charater '" + searchChar + "' was not found.");
		}else if(counter>0){
			System.out.println("Charater '" + searchChar + "' appeared  " + counter + " times in the string.");
		}
	}
	
	public static void main(String args[])
	{
		search();	
	}
}
