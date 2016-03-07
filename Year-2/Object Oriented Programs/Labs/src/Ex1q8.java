/*
** Author: DH	Date: September 2015
** Purpose: Show the temp in cel and far.
*/

public class Ex1q8
{
	
	public static void main(String args[])
	{
		int temp=0;
		String comment="";
		int index = 32;
		
		System.out.println("Fahrenheit	Celsius  Comment");
		
		while(index <= 212)
			{
				temp = (int)Math.round(5.0/9.0*(index-32));
				
				if(temp <= 20){
					comment = "Cold";
				}
				else if(temp >= 20 && temp <= 50){
					comment = "Warm";
				}
				else if(temp >= 50){
					comment = "Hot";
				}
				index+=12;
				
				System.out.println(" " + index + " \t\t "+ temp + "\t\t " + comment);
				
				
			}
		
		
		
	}
}
