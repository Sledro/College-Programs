/*
@author Daniel Hayden
Student Number: C00137009        
Date: November '15
Purpose: Assessemnt One
*/

public abstract class Product {
	
	//Start variables
	private int productID;
	private String productName;
	private String productDescription;
	@SuppressWarnings("unused")
	private float price;
	@SuppressWarnings("unused")
	private float qty;
	
	//Constructor
	public Product(int productID, String productName,String productDescription, float price, float qty) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.qty = qty;
	}
	
	//Set abstract method
	public abstract void calcExVat(float price);

	//Start setters and getters even though they are not used yet.
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */


}
