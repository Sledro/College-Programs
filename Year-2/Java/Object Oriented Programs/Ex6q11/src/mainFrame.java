/**
 * Title: mainFrame.java

 * Description: Calculator in AWT (Windows Programming).
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 11/12/15
 */

//Import .awt so we can use Frame.java 
import java.awt.*;
//Import .event so we can use the event handling, listener method @line 91
import java.awt.event.*;

/**
 * This is the frame of the calculator and the event action listener.
 * 
 */

@SuppressWarnings("serial")
public class mainFrame extends Frame implements ActionListener{
	
	///CONVETER VARIABLES START BELOW HERE
	Label myLabel1;
	Label myLabel2;
	Label myLabel3;
	Label myLabel4;
	Label test;
	static TextField inputCurr;
	static TextField outputCurr;
	Button b11;
	Button b22;
	Choice inputCurrChoice = new Choice();
	Choice outputCurrChoice = new Choice();
		
	
	///CALCULATOR VARIBLES START BELOW HERE
	Label myLabel;
	Label totalLabel;
	Label lastLabel;//Label for last button clicked
	Label memLabel;//Label for last button clicked in "memory" varible 
	static TextField textbox1;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b0;
	Button equals;
	Button bDot;
	Button divide;
	Button multiply;
	Button minus;
	Button plus;
	Button clear;
	static String lastOperator;
	static String lastOperatorMem;

    public Insets getInsets()
    {
    	return new Insets(40,20,20,20);//Padding on border 
    }
    
	/**
	 * @return the lastOperator
	 */
	public static String getLastOperator() {
		return lastOperator;
	}


	/**
	 * @param lastOperator the lastOperator to set
	 */
	public static void setLastOperator(String lastOperator) {
		mainFrame.lastOperator = lastOperator;
	}
	public static void main(String[] args){
		//Create new instance of the frame object called f
	    Frame f=new mainFrame();
	    //So we can actually see the frame f
	    f.setVisible(true);
	}

	//A constructor to run the frame f when the program is launched
	public mainFrame(){
		
		//Frame Properties imported from Frame.java (Extends)
		setSize(400,550);
		setTitle("Dans's Calculator");
		setBackground(Color.lightGray);

		myLabel1=new Label("Convert Amount:");	
		myLabel2 = new Label("Convert From:");
		myLabel3 = new Label("Convert To:");
		myLabel4 = new Label("Converts To:");
		//Create Textfiels
	    inputCurr=new TextField(20);				
	    outputCurr=new TextField(20);
	    //Create & Fill Dropdowns
	    
	    inputCurrChoice.add("Euro");
	    inputCurrChoice.add("US Dollar");
	    inputCurrChoice.add("AUS Dollar");
	    inputCurrChoice.add("Bhat");
	    
	    outputCurrChoice.add("Euro");
	    outputCurrChoice.add("US Dollar");
	    outputCurrChoice.add("AUS Dollar");
	    outputCurrChoice.add("Bhat");
	    //Create Button & add listener
		b11=new Button("Convert Now");
		b11.addActionListener(this);
		b22=new Button("Convert Result");
		b22.addActionListener(this);
		
		
		
		/////////////////////////////CALCULATOR BELOW
		//Create Label
		myLabel=new Label("Enter Value:");	
	    totalLabel = new Label("Running Total:0");
	    lastLabel = new Label("Running Total:0");
	    memLabel = new Label("Running Total:0");
		//Create a label to
	    textbox1=new TextField(60);				//Create a textbox for input
	    b1=new Button("1");						//Create a button
		b1.addActionListener(this);				//Add a listener to this button for any click events
	    b2=new Button("2");
	    b2.addActionListener(this);
		b3=new Button("3");
		b3.addActionListener(this);
		b4=new Button("4");
		b4.addActionListener(this);
		b5=new Button("5");
		b5.addActionListener(this);
		b6=new Button("6");
		b6.addActionListener(this);
		b7=new Button("7");
		b7.addActionListener(this);
		b8=new Button("8");
		b8.addActionListener(this);
		b9=new Button("9");	
		b9.addActionListener(this);
		equals=new Button("=");
		equals.addActionListener(this);
		b0=new Button("0");
		b0.addActionListener(this);
		clear=new Button("CE");
		clear.addActionListener(this);
		divide=new Button("/");
		divide.addActionListener(this);
		multiply=new Button("X");
		multiply.addActionListener(this);
		minus=new Button("-");
		minus.addActionListener(this);
		plus=new Button("+");
		plus.addActionListener(this);

		////CALCULATOR PANELS START BELOW
		//Panel 1 (North)
		//Contains label and textbox
		Panel pnl1=new Panel();
		pnl1.setLayout(new GridLayout (5,1));
		pnl1.add(myLabel);
		pnl1.add(textbox1);
		pnl1.add(totalLabel);
		pnl1.add(lastLabel);
		pnl1.add(memLabel);
		
		
		//Panel 2 (Center)
		//Contains buttons
		Panel pnl2=new Panel();
		pnl2.setLayout(new GridLayout (5,5,5,5));
	
		//Row1
		pnl2.add(b7);
		pnl2.add(b8);
		pnl2.add(b9);
		pnl2.add(divide);
		//Row2
		pnl2.add(b4);
		pnl2.add(b5);
		pnl2.add(b6);
		pnl2.add(multiply);
		//Row3
		pnl2.add(b1);
		pnl2.add(b2);
		pnl2.add(b3);
		pnl2.add(minus);
		//Row4
		pnl2.add(clear);
		pnl2.add(b0);
		pnl2.add(plus);
		pnl2.add(equals);

		
		//////////////CONVERTER PANELS START BELOW
		//Panel 1 (North)
		//Contains label and textbox
		Panel pnl3=new Panel();
		pnl3.setLayout(new GridLayout (2,2,2,2));
		pnl3.add(myLabel1);
		pnl3.add(inputCurr);

		//Panel 2 (Center)
		//Contains buttons
		Panel pnl4=new Panel();
		pnl4.setLayout(new GridLayout (2,2,15,0));
		pnl4.add(myLabel2);
		pnl4.add(inputCurrChoice);
		pnl4.add(myLabel3);
		pnl4.add(outputCurrChoice);
		//Panel 3 (South)
		//Contains buttons
		Panel pnl5=new Panel();
		pnl5.setLayout(new GridLayout (3,1,15,15));
		pnl5.add(myLabel4);
		pnl5.add(outputCurr);
		pnl5.add(b11);
		pnl5.add(b22);
		
		///Create Calc Container Panel
		Panel pnl10=new Panel();
		pnl10.setLayout(new BorderLayout (3,3));

		///Create Convert Container Panel
		Panel pnl11=new Panel();
		pnl11.setLayout(new BorderLayout (3,3));
		pnl11.setBackground(Color.GRAY);
		
		//Add CALCULATOR panels to the frame
		//Frame Properties (add) imported from Frame.java (Extends)
		pnl10.add(pnl1,"North");
		pnl10.add(pnl2,"Center");
		
		//Add CONVERTER panels to the frame
		//Frame Properties (add) imported from Frame.java (Extends)
		pnl11.add(pnl3,"North");
		pnl11.add(pnl4,"Center");
		pnl11.add(pnl5,"South");
		
		add(pnl10,"North");
		add(pnl11,"Center");
		
		//Add a windows listener to close the frame f when (x) is clicked
		//Frame Properties imported from Frame.java (Extends)
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent f){
				System.exit(0);}});
	}//Close Frame f constructor


	//Default method (from interface) always this structure
	//Pass the event to param e
	@Override
	public void actionPerformed(ActionEvent e) {
	
		//If the event in param e is from button0 
		if(e.getSource()==b0){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "0");//Add 0 to current string if an operator 
			else{
			textbox1.setText("0");
			lastOperator="";
			}
		}
		if(e.getSource()==b1){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "1");//Add 1 to current string if an operator 
			else
			textbox1.setText("1");
			lastOperator="";
		}
		if(e.getSource()==b2){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "2");
			else
			textbox1.setText("2");
			lastOperator="";
		}
		if(e.getSource()==b3){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "3");
			else
			textbox1.setText("3");
			lastOperator="";
		}
		if(e.getSource()==b4){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "4");
			else
			textbox1.setText("4");
			lastOperator="";
		}
		if(e.getSource()==b5){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "5");
			else
			textbox1.setText("5");
			lastOperator="";
		}
		if(e.getSource()==b6){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "6");
			else
			textbox1.setText("6");
			lastOperator="";
		}
		if(e.getSource()==b7){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "7");
			else
			textbox1.setText("7");	
		}
		if(e.getSource()==b8){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "8");
			else
			textbox1.setText("8");	
			lastOperator="";
		}
		if(e.getSource()==b9){ 
			if(lastOperator=="")
			textbox1.setText(textbox1.getText() + "9");
			else
			textbox1.setText("9");
			lastOperator="";
		}
		if(e.getSource()==equals){ 
			mainFrame.setLastOperator(mainFrame.lastOperatorMem);//Set last operator to the one last used that we sotred as entering new input reset it
			calculatorBrain.proccessOperand();
			totalLabel.setText(String.valueOf(calculatorBrain.getTotal()));
			lastLabel.setText(String.valueOf(lastOperator));
			memLabel.setText(String.valueOf(lastOperatorMem));
		}
		if(e.getSource()==divide){ 
			lastOperator="divide";
			lastOperatorMem="divide";
			calculatorBrain.divideClick();	
			totalLabel.setText(String.valueOf(calculatorBrain.getTotal()));
			lastLabel.setText(String.valueOf(lastOperator));
			memLabel.setText(String.valueOf(lastOperatorMem));
		}
		if(e.getSource()==multiply){ 
			lastOperator="multiply";
			lastOperatorMem="multiply";
			calculatorBrain.multiplyClick();	
			totalLabel.setText(String.valueOf(calculatorBrain.getTotal()));
			lastLabel.setText(String.valueOf(lastOperator));
			memLabel.setText(String.valueOf(lastOperatorMem));
		}
		if(e.getSource()==minus){ 
			lastOperator="minus";
			lastOperatorMem="minus";
			calculatorBrain.minusClick();	
			lastLabel.setText(String.valueOf(lastOperator));
			memLabel.setText(String.valueOf(lastOperatorMem));
		}
		if(e.getSource()==plus){ 
			lastOperator="plus";
			lastOperatorMem="plus";
			lastLabel.setText(String.valueOf(lastOperator));
			memLabel.setText(String.valueOf(lastOperatorMem));
			if(lastOperator!="plus" && lastOperator!="multiply"){
			calculatorBrain.addClick();
			totalLabel.setText(String.valueOf(calculatorBrain.getTotal()));
			}
		}
		if(e.getSource()==clear){ 
			lastOperator="";
			lastOperatorMem="";
			calculatorBrain.clearClick();
			lastLabel.setText(String.valueOf(lastOperator));
			memLabel.setText(String.valueOf(lastOperatorMem));
		}
		


    	//Pass choice box values to variables
        String selectedFromCurr = inputCurrChoice.getItem(inputCurrChoice.getSelectedIndex());
        String selectedToCurr = outputCurrChoice.getItem(outputCurrChoice.getSelectedIndex());
        
    	String input = null;
    	
    	if(outputCurr.getText().equals("")){
    		input = inputCurr.getText();
    	}else{
    		input = outputCurr.getText();
    	}
       
        //Euro to Euro
        if(selectedFromCurr=="Euro" && selectedToCurr=="Euro"){
        	//Pass inputted amount into the correct converterBrain.method to be calculated and return the result. 
        	String total = Double.toString(converterBrain.EUR2EUR(Double.parseDouble(input)));
        	outputCurr.setText(total);
        } 
        
        //Euro to US Dollar
        if(selectedFromCurr=="Euro" && selectedToCurr=="US Dollar"){
        	String total = Double.toString(converterBrain.EUR2USD(Double.parseDouble(input)));
        	 outputCurr.setText(total);
        }
        
        //Euro to Australian Dollar
        if(selectedFromCurr=="Euro" && selectedToCurr=="AUS Dollar"){
        	String total = Double.toString(converterBrain.EUR2AUD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }  
        
        //Euro to Thai Bhat
        if(selectedFromCurr=="Euro" && selectedToCurr=="Bhat"){
        	String total = Double.toString(converterBrain.EUR2BHAT(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }  
 
        //US Dollar to US Dollar
        if(selectedFromCurr=="US Dollar" && selectedToCurr=="US Dollar"){
        	String total = Double.toString(converterBrain.USD2USD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //US Dollar to Euro
        if(selectedFromCurr=="US Dollar" && selectedToCurr=="Euro"){
        	String total = Double.toString(converterBrain.USD2EUR(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //US Dollar to Australian Dollar
        if(selectedFromCurr=="US Dollar" && selectedToCurr=="AUS Dollar"){
        	String total = Double.toString(converterBrain.USD2AUD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
 
        //US Dollar to Thai Bhat
        if(selectedFromCurr=="US Dollar" && selectedToCurr=="Bhat"){
        	String total = Double.toString(converterBrain.USD2BHAT(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //AUD Dollar to AUD Dollar
        if(selectedFromCurr=="AUS Dollar" && selectedToCurr=="AUS Dollar"){
        	String total = Double.toString(converterBrain.AUD2USD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }

        //AUD Dollar to Euro
        if(selectedFromCurr=="AUS Dollar" && selectedToCurr=="Euro"){
        	String total = Double.toString(converterBrain.AUD2EUR(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //AUD Dollar to US Dollar
        if(selectedFromCurr=="AUS Dollar" && selectedToCurr=="US Dollar"){
        	String total = Double.toString(converterBrain.AUD2USD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //AUD Dollar to Thai Bhat
        if(selectedFromCurr=="AUS Dollar" && selectedToCurr=="Bhat"){
        	String total = Double.toString(converterBrain.AUD2BHAT(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //Thai Bhat to Thai Bhat
        if(selectedFromCurr=="Bhat" && selectedToCurr=="Bhat"){
        	String total = Double.toString(converterBrain.BHAT2BHAT(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }

        //Thai Bhat to Euro
        if(selectedFromCurr=="Bhat" && selectedToCurr=="Euro"){
        	String total = Double.toString(converterBrain.BHAT2EUR(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //Thai Bhat to US Dollar
        if(selectedFromCurr=="Bhat" && selectedToCurr=="US Dollar"){
        	String total = Double.toString(converterBrain.BHAT2USD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
        
        //Thai Bhat to AUD
        if(selectedFromCurr=="Bhat" && selectedToCurr=="AUS Dollar"){
        	String total = Double.toString(converterBrain.BHAT2AUD(Double.parseDouble(input)));
        	outputCurr.setText(total);
        }
	}//End event e actions
}//End class mainFrame