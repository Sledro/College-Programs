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
		mainFrame.textbox1.setText("");
		total=0;
	}
	
	//Method for when the add button is clicked
	public static void addClick(){	
		double valueInTextbox = Double.parseDouble(mainFrame.textbox1.getText());//store current valueInTextbox
		total = total + valueInTextbox; //add it to the total
		mainFrame.textbox1.setText(""+ total +""); //display the total
	}

	//Method for when the multiply button is clicked
	public static void multiplyClick(){	
		if(total==0){
			double valueInTextbox = Double.parseDouble(mainFrame.textbox1.getText());//store current valueInTextbox
			total = valueInTextbox; //add it to the total
		}
		mainFrame.textbox1.setText(""); //Empty textbox to allow user input
	}
	
	//Method for when the multiply button is clicked
	public static void multiplyCalculate(){	
		double valueInTextbox = Double.parseDouble(mainFrame.textbox1.getText());//store current valueInTextbox
		total = total * valueInTextbox; //add it to the total
		mainFrame.textbox1.setText(""+ total +""); //display the total
	}
	
	//Method for when the divide button is clicked
	public static void divideClick(){	
		if(total==0){
			double valueInTextbox = Double.parseDouble(mainFrame.textbox1.getText());//store current valueInTextbox
			total = valueInTextbox; //add it to the total
		}
		mainFrame.textbox1.setText(""); //Empty textbox to allow user input
	}
	
	//Method for when the divide button is clicked
	public static void divideCalculate(){	
		double valueInTextbox = Double.parseDouble(mainFrame.textbox1.getText());//store current valueInTextbox
		total = total / valueInTextbox; //add it to the total
		mainFrame.textbox1.setText(""+ total +""); //display the total
	}

	//Method for when the minus button is clicked
	public static void minusClick(){	
		mainFrame.textbox1.setText(""); //Empty textbox to allow user input
	}
	
	//Method for when the minus button is clicked
	public static void minusCalculate(){	
		double valueInTextbox = Double.parseDouble(mainFrame.textbox1.getText());//store current valueInTextbox
		total = total - valueInTextbox; //add it to the total
		mainFrame.textbox1.setText(""+ total +""); //display the total
	}
	
	//Method for when the equals button is clicked
	public static void proccessOperand(){
		if(mainFrame.lastOperator=="plus"){
			addClick();	
		}else if(mainFrame.lastOperator=="minus"){
			minusCalculate();	
		}else if(mainFrame.lastOperator=="multiply"){
			multiplyCalculate();	
		}else if(mainFrame.lastOperator=="divide"){
			divideCalculate();	
		}else{
			mainFrame.textbox1.setText(mainFrame.lastOperator);
		}
	}
	
}