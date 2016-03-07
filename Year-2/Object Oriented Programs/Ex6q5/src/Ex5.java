
import javax.swing.*;
public class Ex5
{
	
	public static void main(String[] args) 
	{
		String num ;
		int num1;
		String message ;
		
		 num=JOptionPane.showInputDialog
			        ("Please enter a number");
		 num1=Integer.parseInt(num);       
		
        message=JOptionPane.showInputDialog
     	("Please enter sqr. for squared\nor cube. for cubed");
        
        if (message.equals("sqr"))
        {
     	   num="the number squared is "+num1*num1; 	  
        }
        
        else 
        {
     	  num=  " the number cubed is "+num1*num1*num1; 
        } 
          
 		JOptionPane.showMessageDialog
 		(null,num,"My Message Box",1);
 		System.exit(0);        
	}
	

}
