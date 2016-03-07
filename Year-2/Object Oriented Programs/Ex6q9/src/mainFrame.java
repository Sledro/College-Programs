/**
 * Title: mainFrame.java

 * Description: Currency Converter in AWT.
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 15/01/2016
 */

//Import .awt so we can use Frame.java 
import java.awt.*;
//Import .event so we can use the event handling, listener method @line 91
import java.awt.event.*;

/**
 * Title: mainFrame.java

 * Description: See Below.
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 11/12/15
 */
/**
 * Create a class called Ex6q8 which includes "Frame.java" from java.awt. 
 * To allow a Frame class respond to Button events, we must make the frame 
 * implement the ActionListener Interface, once we implement we MUST include all
 * the ActionListener Interface methods.
 * 
 */

@SuppressWarnings("serial")
public class mainFrame extends Frame implements ActionListener{

	Label myLabel;
	Label myLabel2;
	Label myLabel3;
	Label myLabel4;
	Label test;
	static TextField inputCurr;
	static TextField outputCurr;
	Button b1;
	Button b2;
	static String lastOperator;
	static String lastOperatorMem;
	Choice inputCurrChoice = new Choice();
	Choice outputCurrChoice = new Choice();
	
    public Insets getInsets()
    {
    	return new Insets(0,10,10,10);//Padding on border 
    }
  
	//A constructor to run the frame f when the program is launched
	public mainFrame(){
		
		//Frame Properties imported from Frame.java (Extends)
		setSize(350,300);
		setTitle("Dans's Currency Converter");
		setBackground(Color.lightGray);
		
		//Create Labels
		myLabel=new Label("Convert Amount:");	
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
		b1=new Button("Convert Now");
		b1.addActionListener(this);
		b2=new Button("Convert Result");
		b2.addActionListener(this);
		//Panel 1 (North)
		//Contains label and textbox
		Panel pnl1=new Panel();
		pnl1.setLayout(new GridLayout (2,1,15,0));
		pnl1.add(myLabel);
		pnl1.add(inputCurr);

		//Panel 2 (Center)
		//Contains buttons
		Panel pnl2=new Panel();
		pnl2.setLayout(new GridLayout (2,2,15,0));
		pnl2.add(myLabel2);
		pnl2.add(inputCurrChoice);
		pnl2.add(myLabel3);
		pnl2.add(outputCurrChoice);
		//Panel 3 (South)
		//Contains buttons
		Panel pnl3=new Panel();
		pnl3.setLayout(new GridLayout (3,1,15,15));
		pnl3.add(myLabel4);
		pnl3.add(outputCurr);
		pnl3.add(b1);
		pnl3.add(b2);
		
		//Add panels to the frame
		//Frame Properties (add) imported from Frame.java (Extends)
		add(pnl1,"North");
		add(pnl2,"Center");
		add(pnl3,"South");
		
		//Add a windows listener to close the frame f when (x) is clicked
		//Frame Properties imported from Frame.java (Extends)
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent f){
				System.exit(0);}});

	}//Close Frame f constructor


    public void actionPerformed(ActionEvent e) {
    	
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
    
    
}//End class myFrame