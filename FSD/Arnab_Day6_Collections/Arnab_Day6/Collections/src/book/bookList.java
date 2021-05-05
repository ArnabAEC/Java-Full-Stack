package book;

import java.util.HashSet;

import music.mp3;

public class bookList {
	HashSet<book> books;

	public HashSet<book> getBooks() {
		return books;
	}

	public void setBooks(HashSet<book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "bookList [books=" + books + "]";
	}

	public bookList(HashSet<book> books) {
		super();
		this.books = books;
	}
	
	
	boolean search(book book) {
		for( book book1: books) {
			if(book1.equals(book)) {	
				return true;
			}
				
		}
		return false;
	}
	
	boolean duplicate() {
		for( book book1: books) {
			for(book book2: books)
				if(book1.equals(book2)) {	
				books.remove(book2);	
				return true;
			}
				
		}
		return false;
	}

	public void add(book book) {
		// TODO Auto-generated method stub
		this.books.add(book);
	}
	
	void show() {
		for( book book: books) {
			System.out.println("Song: "+book.toString());
		}
		
	}
}
