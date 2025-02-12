package edu.mu.book;

public class Library {

	private Book[] books; //Fixed-size array
	private int count; // Number of books currently in the library
	
	//Default constructor
	public Library() {
		this.books = new Book[5]; //Array of fixed size 5
		this.count = 0; //There are currently no books
	}
	
	//Method to add a book to the library
	public void addBook(Book book) {
		if (count < books.length) {
			books[count] = book; //Add book to array
			count++; // Increase book count
			System.out.println("Book added: " + book.getTitle());
		} else {
			System.out.println("Library is full! Cannot add more books.");
		}
	}
	
	//Method to search for a book by ISBN

}
