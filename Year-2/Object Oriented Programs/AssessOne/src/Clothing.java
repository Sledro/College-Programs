/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*/
public class Clothing extends Product {
	
	String section;
	String designer;
	
	public Clothing(int productID, String productName,String productDescription, float price, float qty, String section,String designer) {
		super(productID, productName, productDescription, price, qty);
		this.section = section;
		this.designer = designer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Clothing [section=" + section + ", designer=" + designer
				+ ", getProductID()=" + getProductID() + ", getProductName()="
				+ getProductName() + ", getProductDescription()="
				+ getProductDescription() + "]\n\n";
	}

	//My abstract class from the superclass
	@Override
	public void calcExVat(float price) {
		
		
	}


}
