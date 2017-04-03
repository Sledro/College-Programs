/*
** Author: DH	Date: October 2015
** Purpose: A method introduction
** Added: Modify Q6 to show charter position
*/

public class Ex3q7
{
	public static void search(){
		
		
		String string;
		char searchChar;
		int counter=0;
		int nextIndex = 0;
		int charPosArr[];
		charPosArr = new int[10];
		
		System.out.println("Enter a string:");
		string = EasyIn.getString();
		
		System.out.println("Enter a search charater:");
		searchChar = EasyIn.getChar();
		
		for(int i=0;i<string.length();i++){
			
			if(string.charAt(i) == searchChar){
			counter++;	
			
			charPosArr[nextIndex++] = i;

			}
		}
		
		System.out.println("Charater '" + searchChar+ "' appeared  " + counter + " times in the string."  );
		
		for(int x=0;x<counter;x++){
			System.out.println(searchChar + " was found at location:" + charPosArr[x]);
		}
	}
	
	public static void main(String args[])
	{
		search();	
	}
}
