package file.demo;

public class Book {
	private String bookName;
	private String author;
	private String publisher;
	private int price;
	
	public Book () {}

	public Book(String bookName, String author, String publisher, int price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
