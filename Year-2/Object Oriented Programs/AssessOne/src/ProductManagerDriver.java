/*
** Author:      Greg Doyle
** Modified by:	Daniel Hayden
** Login ID:	C00137009
** Date:		27th November 2015
**
*/

public class ProductManagerDriver {

	public static void main(String[] args) {
		ElectronicProduct smartTV = new ElectronicProduct(1234, "Sony Smart TV 789","Our Latest Smart TV",1499.0f, 23.0f, 789, "Smart TV" ); 
	
		ElectronicProduct smartTVOne = new ElectronicProduct(2345, "Samsung Smart TV 777","New Samsung Smart TV", 999.0f, 23.0f, 777, "Smart TV");
	
		Magazine incMagazine = new Magazine(67895, "Sport Weekly", "Premier Irish Sports Magazine", 3.99f, 15.0f, "Irish Sports Journal", "sports and leisure", "555 555 555 555");
		Book eBook = new Book(67895, "Computer Books", "Books for Computing Professionals", 25.99f, 10.0f, "Java Programming for Dummies", "Computer Science", "3333 3333 33333");

		Clothing sportsClothes = new Clothing(54321, "Sports Gear", "Football Gear", 79.99f, 18.0f, "2015-2016 Season", "Nike");
		

		Product[] productLine = new Product[] {smartTV, smartTVOne, incMagazine, eBook, sportsClothes};
		ProductManager amazonManager = new  ProductManager("Amazon", "1 Amazon Way", productLine);
				
		System.out.println(amazonManager.toString());
	}
}
