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
	
	//Method to remove a book from the library
	public boolean removeBook(Book book) {
        for (int i = 0; i < count; i++) {
            if (books[i].equals(book)) {
                //Shift books to the left
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null; //Clear last spot
                count--;
                return true;
            }
        }
        return false; //Book not found
    }
	
	//Method to search for a book by ISBN
	public Book searchByISBN(String ISBN) {
		for (int i = 0; i < count; i++) {
			if (book[i].getISBN().equals(ISBN)) {
				return books[i];
			}
		}
		return null; //Book not found
	}
	
	//Method to display books
	public void displayBooks() {
		for (int i = 0; i < count; i++) {
			System.out.println(books[i]); //Uses Book class toString()
		}
	}
}
