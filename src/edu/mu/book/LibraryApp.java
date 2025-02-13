package edu.mu.book;

public class LibraryApp {

	public static void main(String[] args) {
		Library library = new Library();
		
		//Adding books to the library
		Book book1 = new Book("Hobbit", "J.R.R. Tolkien", "9780547928227", 29.99)); //Reworked order and added book prices
		Book book2 = new Book("Captain Underpants", "Dav Pilkey", "9781338865394", 19.99);
		Book book3 = new Book("1984", "George Orwell", "9780452262935", 24.99);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		//Search for a book by ISBN
		String searchISBN = "9780547928227";
		Book foundBook = library.searchByISBN(searchISBN);
		if (foundBook != null) {
			System.out.println("Book found: " + foundBook);
		} else {
			System.out.println("Book with ISBN " + searchISBN + " not found.");
		}
		
		//Removes an existing book
		boolean removedBook = library.removeBook(book2);
		System.out.println("Book removed: " + removedBook);
		
		//Try to remove a book that doesn't exist
		Book nonExistingBook = new Book("Nonexisting Book", "Unknown Author", "999999999999", 00.00);
		boolean removedNonExisting = library.removeBook(nonExistingBook);
		System.out.println("Attempt to remove nonexsiting book: " + removeNonExisting);
		
		//Display all books in the library
		System.out.println("Books currently in the library: ");
		library.displayBooks();
	}
	

}
