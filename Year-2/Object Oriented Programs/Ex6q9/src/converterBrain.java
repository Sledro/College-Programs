/**
 * Title: converterBrain.java

 * Description: Calculator in AWT (Windows Programming).
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 11/12/15
 */

import java.awt.Frame;


public class converterBrain {
	
	double EUR;
	double USD;
	double AUD;
	double BHAT;
	
	public static void main(String[] args){
		//Create new instance of the frame object called f
	    Frame f=new mainFrame();
	    //So we can actually see the frame f
	    f.setVisible(true);
	}

	//Euro to US Euro
	public static double EUR2EUR(double inputCurr){
		double EUR=	1;
		double total = 0;
		
		total = inputCurr * EUR;
		
		return total;
	}
	
	//Euro to US Dollar
	public static double EUR2USD(double inputCurr){
		double USD=	1.09;
		double total = 0;
		
		total = inputCurr * USD;
		
		return total;
	}
	
	//Euro to Australian Dollar
	public static double EUR2AUD(double inputCurr){
		double AUD=	1.55;
		double total = 0;
		
		total = inputCurr * AUD;
		
		return total;
	}
	
	//Euro to Bhat
	public static double EUR2BHAT(double inputCurr){
		double BHAT=39.04;
		double total = 0;
		
		total = inputCurr * BHAT;
		
		return total;
	}

	//US Dollar to US Dollar
	public static double USD2USD(double inputCurr){
		double USD=1;
		double total = 0;
		
		total = inputCurr * USD;
		
		return total;
	}
	
	//US Dollar to Euro
	public static double USD2EUR(double inputCurr){
		double EUR=.92;
		double total = 0;
		
		total = inputCurr * EUR;
		
		return total;
	}
	
	//US Dollar to AUD
	public static double USD2AUD(double inputCurr){
		double AUD=1.42;
		double total = 0;
		
		total = inputCurr * AUD;
		
		return total;
	}
	
	//US Dollar to Bhat
	public static double USD2BHAT(double inputCurr){
		double BHAT=35.75;
		double total = 0;
		
		total = inputCurr * BHAT;
		
		return total;
	}
	
	//Australian Dollar to Australian Dollar
	public static double AUD2AUD(double inputCurr){
		double AUD=1;
		double total = 0;
		
		total = inputCurr * AUD;
		
		return total;
	}
	
	//Australian Dollar to Euro
	public static double AUD2EUR(double inputCurr){
		double EUR=.65;
		double total = 0;
		
		total = inputCurr * EUR;
		
		return total;
	}
	
	//Australian Dollar to US Dollar
	public static double AUD2USD(double inputCurr){
		double USD=.71;
		double total = 0;
		
		total = inputCurr * USD;
		
		return total;
	}
	
	//Australian Dollar to Thai Bhat
	public static double AUD2BHAT(double inputCurr){
		double BHAT=25.22;
		double total = 0;
		
		total = inputCurr * BHAT;
		
		return total;
	}
	
	//Thai Bhat to Thai Bhat
	public static double BHAT2BHAT(double inputCurr){
		double BHAT=1;
		double total = 0;
		
		total = inputCurr * BHAT;
		
		return total;
	}
	
	//Thai Bhat to Thai Bhat
	public static double BHAT2EUR(double inputCurr){
		double EUR=0.026;
		double total = 0;
		
		total = inputCurr * EUR;
		
		return total;
	}
	
	//Thai Bhat to Thai Bhat
	public static double BHAT2USD(double inputCurr){
		double USD=0.028;
		double total = 0;
		
		total = inputCurr * USD;
		
		return total;
	}
	
	//Thai Bhat to Thai Bhat
	public static double BHAT2AUD(double inputCurr){
		double AUD=0.04;
		double total = 0;
		
		total = inputCurr * AUD;
		
		return total;
	}
	
}
