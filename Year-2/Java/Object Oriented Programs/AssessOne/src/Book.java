/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*/

public class Book extends Publications {
	
	String ISBN;
	
	public Book(int productID, String productName,String productDescription, float price, float qty, String title, String genre,String ISBN) {
		super(productID, productName, productDescription, price, qty, title, genre);
		this.ISBN = ISBN;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", getTitle()=" + getTitle()
				+ ", getGenre()=" + getGenre() + ", getProductID()="
				+ getProductID() + ", getProductName()=" + getProductName()
				+ ", getProductDescription()=" + getProductDescription()
				+ "]\n\n";
	}
	
	

}
