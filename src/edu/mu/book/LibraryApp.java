package edu.mu.book;

public class LibraryApp {

	public static void main(String[] args) {
		Library library = new Library();
		
		//Adding books to the library
		Book book1 = new Book("9780547928227", "Hobbit", "J.R.R. Tolkien");
		Book book2 = new Book("9781338865394", "Captain Underpants", "Dav Pilkey");
		Book book3 = new Book("9780452262935", "1984", "George Orwell");
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
	}

}
