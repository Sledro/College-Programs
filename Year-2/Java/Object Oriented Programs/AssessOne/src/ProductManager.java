import java.util.Arrays;

/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*/

public class ProductManager {
	
	//Start Variables 
	String  companyName;
	String address;
	Product[] range = new Product[5];
	
	public ProductManager(String companyName, String address, Product[] range) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.range = range;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductManager [companyName=" + companyName + ", address="
				+ address + ", range=" + Arrays.toString(range) + "]\n\n";
	}
	
	

}
