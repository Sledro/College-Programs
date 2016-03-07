/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*		I called this class ElectronicProduct not ElectronicProducts due to the driver name ()
*		I didnt add every getter and setter as they are not used and I didnt have time.
*/		

public class ElectronicProduct extends Product  {

	int eleID;
	String category;
	double vatRate=0.23;
	
	
	//Super Constructor
	public ElectronicProduct(int productID, String productName,String productDescription, float price, float qty, int eleID, String category) {
		super(productID, productName, productDescription, price, qty);
		this.eleID = eleID;
		this.category = category;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ElectronicProduct [eleID=" + eleID + ", category=" + category
				+ ", getProductID()=" + getProductID() + ", getProductName()="
				+ getProductName() + ", getProductDescription()="
				+ getProductDescription() + "]\n\n";
	}


	//My abstract class from the superclass
	@Override
	public void calcExVat(float price) {
		//price * vatRate;
		
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
	

}
