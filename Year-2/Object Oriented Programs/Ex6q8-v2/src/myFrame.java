import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
 
/* MenuLookDemo.java requires images/middle.gif. */
 
/*
 * This class exists solely to show you what menus look like.
 * It has no menu-related event handling.
 */
public class myFrame extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea output;
    JScrollPane scrollPane;
 
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
	

	
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;
 
        //Create the menu bar.
        menuBar = new JMenuBar();
 
        //Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);
 
        //a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item",
                                 KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

 
        //a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
 
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);
 
        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);
 
        //a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);
 
        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);
 
        //a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);
 
        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);
 
        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);
 
        //Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);
        setComponentZOrder(menuBar,2);
        return menuBar;
    }
 
    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);
 
        
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

 
        //Add the text area to the content pane.
        contentPane.add(pnl1,"North");
        contentPane.add(pnl2,"Center");
        setComponentZOrder(contentPane,2);
        return contentPane;
    }
 

 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("MenuLookDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        myFrame demo = new myFrame();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
        //Display the window.
        frame.setSize(400, 400);
        frame.setVisible(true);
        

    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:

    	createAndShowGUI();       
           
       
    }
    
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

}