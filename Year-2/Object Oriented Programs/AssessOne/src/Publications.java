/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*/

public class Publications extends Product {
	
	String title;
	String genre;
	
	public Publications(int productID, String productName,String productDescription, float price, float qty) {
		super(productID, productName, productDescription, price, qty);
	}

	public Publications(int productID, String productName,String productDescription, float price, float qty, String title,String genre) {
		super(productID, productName, productDescription, price, qty);
		this.title = title;
		this.genre = genre;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void calcExVat(float price) {
		// TODO Auto-generated method stub
		
	}
	
}
