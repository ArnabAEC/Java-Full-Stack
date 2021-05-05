package book;

public class book {
	private String title;
	private String author;
	private int price;
	public book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "book: title=" + title + ", author=" + author + ", price=" + price;
	}
	public boolean equals(book book) {
		// TODO Auto-generated method stub
		if(
				this.getTitle().equalsIgnoreCase(book.title)&&
				this.getAuthor().equalsIgnoreCase(book.author)&&
				this.price==book.price
		)
			return true;
		else
			return false;
	}
}
