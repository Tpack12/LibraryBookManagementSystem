package edu.mu.book;

public class Book {

	public static void main(String[] args) {
// Private attributes
		private String title;
		private String author;
		private String IBSN;
		private double price;

//Default constructor	
public Book() {
	this.title = "Unknown";
	this.author = "Unkown";
	this.ISBN = "Unknown";
	this.price = 0.0;
}

//Parameterized constructor
public Book(String title, String author, String IBSN, double price) {
	this.title = title;
	this.author = author;
	this.IBSN = IBSN;
	this.price = price;
}

//Copy constructor
public Book(Book other) {
	this.title = other.title;
	this.author = other.author;
	this.ISBN = other.ISBN;
	this.price = other.price;
}

	}

}
