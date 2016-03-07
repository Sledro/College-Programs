/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*/

public class Magazine extends Publications {

	String ISSN;




	public Magazine(int productID, String productName,String productDescription, float price, float qty, String title, String genre,String ISSN) {
		super(productID, productName, productDescription, price, qty, title, genre);
		this.ISSN = ISSN;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Magazine [ISSN=" + ISSN + ", getTitle()=" + getTitle()
				+ ", getGenre()=" + getGenre() + ", getProductID()="
				+ getProductID() + ", getProductName()=" + getProductName()
				+ ", getProductDescription()=" + getProductDescription()
				+ "]\n\n";
	}








}


