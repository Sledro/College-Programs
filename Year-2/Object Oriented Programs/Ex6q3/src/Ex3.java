
import javax.swing.*;
public class Ex3 
{

	public static void main(String[] args) 
	{
		String name;
		String name2;
		String greeting;
		
        name=JOptionPane.showInputDialog(
			"Enter Your First name");
            
         name2=JOptionPane.showInputDialog(
     			"Enter Your Surname");
         greeting="Hello " + name +" " +name2;

		JOptionPane.showMessageDialog
		(null,greeting,"My Message Box",1);
		System.exit(0);

	}

}
