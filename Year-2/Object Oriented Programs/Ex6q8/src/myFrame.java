/**
 * Title: myFrame.java

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
public class myFrame extends Frame implements ActionListener{

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
		myFrame.lastOperator = lastOperator;
	}


	//A constructor to run the frame f when the program is launched
	public myFrame(){
		
		//Frame Properties imported from Frame.java (Extends)
		setSize(300,350);
		setTitle("Dans's Calculator");
		setBackground(Color.lightGray);
		
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

		//Panel 1 (North)
		//Contains label and textbox
		Panel pnl1=new Panel();
		pnl1.setLayout(new GridLayout (5,4));
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

		
		//Add panels to the frame
		//Frame Properties (add) imported from Frame.java (Extends)
		add(pnl1,"North");
		add(pnl2,"Center");
		
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
			myFrame.setLastOperator(myFrame.lastOperatorMem);//Set last operator to the one last used that we sotred as entering new input reset it
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
	}//End event e actions
}//End class myFrame