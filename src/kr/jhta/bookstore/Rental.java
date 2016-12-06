package kr.jhta.bookstore;

import java.util.Date;

public class Rental {
	private Customer customer;
	private Book book;
	private Date rnetDate;
	private boolean isBack;
	
	public Rental(Customer customer, Book book, Date rnetDate, boolean isBack) {
		super();
		this.customer = customer;
		this.book = book;
		this.rnetDate = rnetDate;
		this.isBack = isBack;
	}
	
	public Rental() {
		
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Date getRentDate() {
		return rnetDate;
	}
	public void setRentDate(Date rnetDate) {
		this.rnetDate = rnetDate;
	}
	public boolean getIsBack() {
		return isBack;
	}
	public void setIsBack(boolean isBack) {
		this.isBack = isBack;
	}
	
	
}
