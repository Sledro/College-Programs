

import javax.swing.*;

public class Ex4 {

	public static void main(String[] args) 
	{
		String num =" ";
		int num1;
		
        num=JOptionPane.showInputDialog
        ("Please enter a number");
        num1=Integer.parseInt(num);
        
       if (num1%2 == 0 )
       {
    	  num ="The number"+" "+num +" "+"is even";
       }
       else
       {
    	   num ="The number"+" "+num +" "+"is odd";
       }
        
		JOptionPane.showMessageDialog
		(null,num,"My Message Box",1);
		System.exit(0);
	}

}
