/**
 * Title: MultiToolFrame.java

 * Description: Multi Conversion Tool.
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 10/02/16
 */

public class multiToolBrain {
	
	//Constructor
	public multiToolBrain(){
		
	}
	
	//Convert Pound to Euro
	public static double poundToEuro(double inputCurr){
		double EURO=0.79;
		double total = 0;
		
		total = inputCurr * EURO;
		
		return total;
	}
	
	//Convert Inches to Feet
	public static double inchesToFeet(double inputInches){
		double FEET=12;
		double total = 0;
		
		total = inputInches / FEET;
		
		return total;
	}
}
