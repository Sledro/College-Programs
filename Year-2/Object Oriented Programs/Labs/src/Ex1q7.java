/*
** Author: DH	Date: September 2015
** Purpose: Program to input a temp in cel and print an approaite message.
*/

public class Ex1q7 {

	public static void main(String[] args) {
		
		int input=0;
		
		System.out.println("Please enter the tempature in Celsius: ");
		input = EasyIn.getInt();
		
		System.out.println("Temperature Range \t Message");
		
		if(input >= -10 && input <= 5){
			System.out.println("-10 to +(5) \t\t Cold");
		}
		else if(input >= 6 && input <= 15){
			System.out.println("6 to 15 \t\t Warm");
		}
		else if(input >= 16 && input <=22){
			System.out.println("16 to 22 \t\t Hot");
		}
		else if(input >= 22 && input <= 30){
			System.out.println("22 to 30 \t\t Hot");
		}	
		else{
			System.out.println("Error, temperature out of range");
		}

	}

}
