/**
 * Title: calculatorBrain.java

 * Description: Calculator in AWT (Windows Programming).
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 11/12/15
 */

//Import .awt so we can use Frame.java 
import java.awt.*;

/**
 * This is the brain of the calculator that contains all the methods 
 * 
 */

public class calculatorBrain{

	static double total=0;

	//Method to get the running total
	public static double getTotal(){	
		return total;
	}
	
	//Method for when the clear button is clicked
	public static void clearClick(){	
		myFrame.textbox1.setText("");
		total=0;
	}
	
	//Method for when the add button is clicked
	public static void addClick(){	
		double valueInTextbox = Double.parseDouble(myFrame.textbox1.getText());//store current valueInTextbox
		total = total + valueInTextbox; //add it to the total
		myFrame.textbox1.setText(""+ total +""); //display the total
	}

	//Method for when the multiply button is clicked
	public static void multiplyClick(){	
		if(total==0){
			double valueInTextbox = Double.parseDouble(myFrame.textbox1.getText());//store current valueInTextbox
			total = valueInTextbox; //add it to the total
		}
		myFrame.textbox1.setText(""); //Empty textbox to allow user input
	}
	
	//Method for when the multiply button is clicked
	public static void multiplyCalculate(){	
		double valueInTextbox = Double.parseDouble(myFrame.textbox1.getText());//store current valueInTextbox
		total = total * valueInTextbox; //add it to the total
		myFrame.textbox1.setText(""+ total +""); //display the total
	}
	
	//Method for when the divide button is clicked
	public static void divideClick(){	
		if(total==0){
			double valueInTextbox = Double.parseDouble(myFrame.textbox1.getText());//store current valueInTextbox
			total = valueInTextbox; //add it to the total
		}
		myFrame.textbox1.setText(""); //Empty textbox to allow user input
	}
	
	//Method for when the divide button is clicked
	public static void divideCalculate(){	
		double valueInTextbox = Double.parseDouble(myFrame.textbox1.getText());//store current valueInTextbox
		total = total / valueInTextbox; //add it to the total
		myFrame.textbox1.setText(""+ total +""); //display the total
	}

	//Method for when the minus button is clicked
	public static void minusClick(){	
		myFrame.textbox1.setText(""); //Empty textbox to allow user input
	}
	
	//Method for when the minus button is clicked
	public static void minusCalculate(){	
		double valueInTextbox = Double.parseDouble(myFrame.textbox1.getText());//store current valueInTextbox
		total = total - valueInTextbox; //add it to the total
		myFrame.textbox1.setText(""+ total +""); //display the total
	}
	
	//Method for when the equals button is clicked
	public static void proccessOperand(){
		if(myFrame.lastOperator=="plus"){
			addClick();	
		}else if(myFrame.lastOperator=="minus"){
			minusCalculate();	
		}else if(myFrame.lastOperator=="multiply"){
			multiplyCalculate();	
		}else if(myFrame.lastOperator=="divide"){
			divideCalculate();	
		}else{
			myFrame.textbox1.setText(myFrame.lastOperator);
		}
	}
	
	public static void main(String[] args){
		//Create new instance of the frame object called f
	    Frame f=new myFrame();
	    //So we can actually see the frame f
	    f.setVisible(true);
	}
}