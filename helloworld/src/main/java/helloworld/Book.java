package helloworld;

public class Book {
	private String title;
	private String isbn;
	
	public Book(String theTitle, String theISBN) {
		this.title = theTitle;
		this.isbn = theISBN;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	

}
