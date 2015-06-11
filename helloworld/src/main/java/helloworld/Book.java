package helloworld;

/**
 * Git-Testing
 * @author Sandra
 *
 */
public class Book {
	private String title;
	private String isbn;
	private float price;
	private String author;
	private int year;
	
	public Book(String theTitle, String theISBN) {
		this.title = theTitle;
		this.isbn = theISBN;
		
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setAuthor() {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	public void setPrice(float thePrice) {
		this.price = thePrice;
	}
 	

}
