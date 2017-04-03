
import javax.swing.*;
public class Ex2 
{
	
	public static void main(String[] args)

	{
		String message = "num square cube\n";		
		for(int num =0;num<=10;num++)
		{
			message=message +num+"         " +num*num+"            "+num*num*num+"\n";
		}
		
		JOptionPane.showMessageDialog
		(null,message,"My Message Box",1);
	}

}
