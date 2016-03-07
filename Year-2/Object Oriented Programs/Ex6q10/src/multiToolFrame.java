/**
 * Title: MultiToolFrame.java

 * Description: Multi Conversion Tool.
 * Copyright: Copyright (c) 2015
 * Student No: C00137009
 * @author Daniel Hayden
 * @version 1.0
 * @date 10/02/16
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class multiToolFrame extends JFrame implements ActionListener
{
	JPanel headerPanel;
	JPanel bodyPanel;
	JPanel panel1,panel2;
	JButton button1,button2,currConvertBtn,sizeConvertBtn;
	CardLayout clayout;
	JTextField poundInputTextfield=new JTextField(10);
	JTextField euroOutputTextfield=new JTextField(10);
	JTextField inchesInputTextfield=new JTextField(10);
	JTextField feetOutputTextfield=new JTextField(10);
	JLabel inchesToFeetLabel,euroToPoundLabel;
	
	public multiToolFrame(){
	    
	    clayout=new CardLayout();
	    //Holds the buttons
	    headerPanel=new JPanel();
	    //holds the body panels
	    bodyPanel=new JPanel(clayout);
	    
		inchesToFeetLabel = new JLabel("Convert Inches -> Feet : ", JLabel.CENTER);
		euroToPoundLabel = new JLabel("Convert Euro -> Pound : ", JLabel.CENTER);
		
	    button1=new JButton("Inches to Feet");
	    button2=new JButton("Pound Sterling to Euro");
	    currConvertBtn=new JButton("Convert");
	    sizeConvertBtn=new JButton("Convert");
	    //add two buttons to headerPanel
	    headerPanel.add(button1);
	    headerPanel.add(button2);	    
	
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    currConvertBtn.addActionListener(this);
	    sizeConvertBtn.addActionListener(this);
	    
	    panel1=new JPanel();
	    panel1.setBackground(Color.lightGray);
	    panel1.add(inchesToFeetLabel);
	    panel1.add(inchesInputTextfield);
	    panel1.add(feetOutputTextfield);
	    panel1.add(sizeConvertBtn);
	        
	    panel2=new JPanel();
	    panel2.setBackground(Color.gray);	
	    panel2.add(euroToPoundLabel);
	    panel2.add(poundInputTextfield);
	    panel2.add(euroOutputTextfield);
	    panel2.add(currConvertBtn);
	    	    
	    //add above three panels to bodyPanel for Cardlayout
	    bodyPanel.add(panel1,"one");
	    bodyPanel.add(panel2,"two");    
	
	    setTitle("Dans's Multi Conversion Tool");
	    setLayout(new BorderLayout());
	    setSize(500,150);
	    add(headerPanel,BorderLayout.NORTH);
	    add(bodyPanel,BorderLayout.CENTER);
	    bodyPanel.setBounds(0,100, 600, 500);
	    setVisible(true);
	
	}

	public static void main(String args[]){
	    new multiToolFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	    if(e.getSource()==button1){
	        clayout.show(bodyPanel, "one");
	    }
	    else if(e.getSource()==button2){
	        clayout.show(bodyPanel, "two");
	    }
	    else if(e.getSource()==currConvertBtn){
	     	String total = Double.toString(multiToolBrain.poundToEuro(Double.parseDouble(poundInputTextfield.getText())));
	     	euroOutputTextfield.setText(total);
	    }
	    else if(e.getSource()==sizeConvertBtn){
	     	String total = Double.toString(multiToolBrain.inchesToFeet(Double.parseDouble(inchesInputTextfield.getText())));
	     	feetOutputTextfield.setText(total);
	    }	
	}
}