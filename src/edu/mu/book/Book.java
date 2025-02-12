package edu.mu.book;

public class Book {

// Private attributes
		private String title;
		private String author;
		private String ISBN;
		private double price;

//Default constructor	
public Book() {
	this.title = "Unknown";
	this.author = "Unknown";
	this.ISBN = "Unknown";
	this.price = 0.0;
}

//Parameterized constructor
public Book(String title, String author, String ISBN, double price) {
	this.title = title;
	this.author = author;
	this.ISBN = ISBN;
	this.price = price;
}

//Copy constructor
public Book(Book other) {
	this.title = other.title;
	this.author = other.author;
	this.ISBN = other.ISBN;
	this.price = other.price;
}

//Setter methods
public void setTitle(String title) {
	this.title = title;
}

public void setAuthor(String author) {
	this.author = author;
}

public void setISBN(String ISBN) {
	this.ISBN = ISBN;
}

public void setPrice(double price) {
	this.price = price;
}

//Getter methods
public String getTitle() {
	return title;
}

public String getAuthor() {
	return author;
}

public String getISBN() {
	return ISBN;
}

public double getPrice() {
	return price;
}

@Override
public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", ISBN='" + ISBN + '\'' +
            ", price=" + price +
            '}'; 
}

//Overriding equals method to compare books based on ISBN
@Override
public boolean equals(Object other) {
	if (this == other) return true; //Check if same object
	if (other == null || getClass() != other.getClass()) return false; //Check type
	
	Book book = (Book) other; //Cast to Book
	return ISBN.equals(book.ISBN); //Compare ISBNs
	}
}

