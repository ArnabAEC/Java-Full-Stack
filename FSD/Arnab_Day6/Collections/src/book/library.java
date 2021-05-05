package book;

import java.util.HashSet;

public class library {
	public static void main(String [] args) {
		bookList books = new bookList(new HashSet<book>());
		
		books.add(new book("Immortals of Meluha","Amish Tripathi",137));
		books.add(new book("Java in 21 days","Mark Carl",999));
		books.add(new book("Java in 21 days","Mark Carl",999));
		
		books.duplicate();
		books.show();

		
	}
	

}
