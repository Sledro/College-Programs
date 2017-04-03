/**
 * Title: Ex6q8.java

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
 * Create a class called Ex6q8 which includes "Frame.java" from java.awt. 
 * To allow a Frame class respond to Button events, we must make the frame 
 * implement the ActionListener Interface, once we implement we MUST include all
 * the ActionListener Interface methods.
 */

@SuppressWarnings("serial")
public class Ex6q8 extends Frame implements ActionListener{

	Label myLabel;
	TextField textbox1;
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
	double total = 0;
	
	//A constructor to run the frame f when the program is launched
	public Ex6q8(){
		
		//Frame Properties imported from Frame.java (Extends)
		setSize(300,350);
		setTitle("Dans's Calculator");
		setBackground(Color.lightGray);
		
		//Create Label
		myLabel=new Label("Enter Value:");
	    textbox1=new TextField(60);
	    b1=new Button("1");
		b1.addActionListener(this);
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
		bDot=new Button(".");
		bDot.addActionListener(this);
		divide=new Button("divide");
		divide.addActionListener(this);
		multiply=new Button("multiply");
		multiply.addActionListener(this);
		minus=new Button("minus");
		minus.addActionListener(this);
		plus=new Button("+");
		plus.addActionListener(this);
		
		//Panel 1 (North)
		Panel pnl1=new Panel();
		pnl1.setLayout(new GridLayout (5,4));
		pnl1.add(myLabel);
		pnl1.add(textbox1);
		
		//Panel 2 (Center)
		Panel pnl2=new Panel();
		pnl2.setLayout(new GridLayout (4,5,5,5));

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
		pnl2.add(bDot);
		pnl2.add(b0);
		pnl2.add(plus);
		pnl2.add(equals);
		
		//Add panels to the frame
		//Frame Properties imported from Frame.java (Extends)
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

		//If the event in param e is from button1 
		if(e.getSource()==b1){ 
			textbox1.setText("1");
		}
		if(e.getSource()==b2){ 
			textbox1.setText("2");
		}
		if(e.getSource()==b3){ 
			textbox1.setText("3");
		}
		if(e.getSource()==b4){ 
			textbox1.setText("4");
		}
		if(e.getSource()==b5){ 
			textbox1.setText("5");
		}
		if(e.getSource()==b6){ 
			textbox1.setText("6");
		}
		if(e.getSource()==b7){ 
			textbox1.setText("7");
		}
		if(e.getSource()==b8){ 
			textbox1.setText("8");
		}
		if(e.getSource()==b9){ 
			textbox1.setText("9");
		}
		if(e.getSource()==equals){ 
			equalsClick();
		}
		if(e.getSource()==bDot){ 
			textbox1.setText(".");
		}
		if(e.getSource()==divide){ 
			textbox1.setText("2");
		}
		if(e.getSource()==multiply){ 
			textbox1.setText("1");
		}
		if(e.getSource()==minus){ 
			textbox1.setText("2");
		}
		if(e.getSource()==plus){ 
			addClick();
		}
	}
	
	//Method for when the add button is clicked
	public void addClick(){
		
		double value1 = Double.parseDouble(textbox1.getText());

		total = total + value1;
	}
	
	//Method for when the equals button is clicked
	public void equalsClick(){
		textbox1.setText(""+ total +"");
	}
	
	
	public static void main(String[] args){
		//Create new instance of the frame object called f
	    Frame f=new Ex6q8();
	    //So we can actually see the frame f
	    f.setVisible(true);
	}
}